#lang racket
(define (f a b c d e)
  (or
   (and a b d e)
   (not(or
        (and a c d)
        (not(and a c)))))
  )