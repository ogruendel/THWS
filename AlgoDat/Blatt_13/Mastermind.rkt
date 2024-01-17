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

(define (minSumme code guess)
  (define (minSumme-rec code guess i)
    (if (= 6 i)
      0
      (+ (minFarbe code guess i) (minSumme-rec code guess (+ i 1)))
      )
    )
  (minSumme-rec code guess 0)
  )

(minSumme '(1 2 3 4) '(4 3 3 2))
(minSumme '(1 1 2 2) '(1 1 1 2))
