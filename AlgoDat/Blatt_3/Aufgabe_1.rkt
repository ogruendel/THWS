#lang racket
(define (sinus-approx x)
  (if (<= x 0.1)
      x
      (- (* 3 (sinus-approx (/ x 3))) (* 4 (expt (sinus-approx (/ x 3)) 3))))
  )