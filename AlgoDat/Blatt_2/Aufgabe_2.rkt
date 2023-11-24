#lang racket
(define (zahl-umdrehen x)
  (umdrehen x 0)
  )

(define (umdrehen x new)
  (if (= (quotient x 10) 0)
      (+ (* new 10) (remainder x 10))
      (umdrehen (quotient x 10) (+ (* new 10) (remainder x 10))))
  )