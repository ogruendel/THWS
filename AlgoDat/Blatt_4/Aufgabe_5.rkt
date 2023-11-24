#lang racket
(define (caesar_encrypt n k)
  (caesar-summe n k 0)
  )

(define (caesar-summe n k i)
  (if (< n 10)
      (* (remainder (+ n k) 10) (expt 10 i))
      (+ (* (remainder (+ n k) 10) (expt 10 i)) (caesar-summe (quotient n 10) k (+ i 1))))
  )