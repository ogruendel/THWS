#lang racket
(define (count-perm x)
  (fac-iter x 1 1)
  )

(define (fac-iter x i fac)
  (if (> i x)
      fac
      (fac-iter x (+ i 1) (* fac i)))
  )