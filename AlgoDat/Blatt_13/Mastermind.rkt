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

(define (minFarbe code guess farbe)
    (min (zaheleFarbe code farbe) (zaheleFarbe guess farbe))
  )

(minFarbe '(1 2 3 4) '(4 3 3 2) 3)
(minFarbe '(1 1 2 2) '(1 1 1 1) 1)
