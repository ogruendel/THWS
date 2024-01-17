#lang racket

(define (zaehleSchwarz code guess)
  (if (empty? code)
    0
    (if (= (car code) (car guess))
      (+ 1 (zaehleSchwarz (cdr code) (cdr guess)))
      (zaehleSchwarz (cdr code) (cdr guess)))
    )
  )

(define (zaheleFarbe code farbe)
  (if (empty? code)
    0
    (if (= (car code) farbe)
      (+ 1 (zaheleFarbe (cdr code) farbe))
      (zaheleFarbe (cdr code) farbe))
    )
  )

(zaheleFarbe '(1 2 3 4) 1)
(zaheleFarbe '(1 1 2 2) 1)
(zaheleFarbe '(1 2 3 4) 5)
(zaheleFarbe '(5 2 3 5) 5)
