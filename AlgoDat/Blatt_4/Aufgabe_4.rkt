#lang racket
(define (kubiksumme n)
  (expt (quersumme n) 3)
  )

(define (quersumme n)
  (if (< n 10)
      n
      (+ (remainder n 10) (quersumme (quotient n 10))))
  )