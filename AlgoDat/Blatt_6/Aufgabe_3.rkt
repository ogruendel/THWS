#lang racket
(define (konst-addierer n)
  (lambda (x) (+ x n))
  )

(define plus1 (konst-addierer 1))
(define plus10 (konst-addierer 10))