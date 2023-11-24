#lang racket
(define (ganzzahlige-wurzel? n)
  (integer? (sqrt n))
  )