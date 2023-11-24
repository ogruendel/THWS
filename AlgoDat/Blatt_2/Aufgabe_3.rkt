#lang racket
(define (aufsteigendes-produkt? a b c d)
  (and (<= a b c d) (= (* a b c) d))
  )