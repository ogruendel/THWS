#lang racket
(define (gleiche-ziffern zahl)
  (define (erste-ziffer zahl)
  (if (< zahl 10)
      zahl
      (erste-ziffer (quotient zahl 10)))
  )

  (if (= (remainder zahl 10) (erste-ziffer zahl))
      zahl
      (gleiche-ziffern (+ zahl 1)))
  )

