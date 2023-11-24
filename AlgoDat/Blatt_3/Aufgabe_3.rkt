#lang racket
(define (isbn-test isbn)
  (if (= (remainder (isbn-nummer isbn 9) 11) 10)
      "X"
      (remainder (isbn-nummer isbn 9) 11))
  )

(define (isbn-nummer isbn i)
  (if (= i 0)
      0
      (+ (* (remainder isbn 10) i) (isbn-nummer (quotient isbn 10) (- i 1))))
  )