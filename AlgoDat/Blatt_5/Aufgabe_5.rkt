#lang racket
(define (sum x y)
  (define (n x)
  (+ x 1)
  )
  
  (if (= y 0)
      x
      (n (sum x (- y 1))))
  )