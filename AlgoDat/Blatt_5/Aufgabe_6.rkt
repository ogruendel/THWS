#lang racket
(define (mul x y)
  (define (sum x y)
  (define (n x)
  (+ x 1)
  )
  
  (if (= y 0)
      x
      (n (sum x (- y 1))))
  )
  
  (if (= y 0)
      0
      (sum x (mul x (- y 1))))
  )