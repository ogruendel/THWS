#lang racket

(define (zaehleSchwarz code guess)
  (if (empty? code)
    0
    (if (= (car code) (car guess))
      (+ 1 (zaehleSchwarz (cdr code) (cdr guess)))
      (zaehleSchwarz (cdr code) (cdr guess)))
    )
  )

(define (zaehleFarbe code farbe)
  (if (empty? code)
    0
    (if (= (car code) farbe)
      (+ 1 (zaehleFarbe (cdr code) farbe))
      (zaehleFarbe (cdr code) farbe))
    )
  )

(define (minFarbe code guess farbe)
    (min (zaehleFarbe code farbe) (zaehleFarbe guess farbe))
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

(define (bewerte code guess)
    (cons (- (minSumme code guess) (zaehleSchwarz code guess)) (zaehleSchwarz code guess))
  )
