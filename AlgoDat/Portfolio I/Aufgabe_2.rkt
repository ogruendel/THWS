#lang racket
(define (tetraederzahl n)
  (/ (* n (+ n 1) (+ n 2)) 6))