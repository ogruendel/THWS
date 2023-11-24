#lang racket
(define (f1 a b)
  (and (not (or a b)) (or a b) a (not b))
  )

(define (f2 a b c)
  (or a (and a b (not c)) (and (not a) c) (and (not (and a b)) c))
  )

(define (f3 a b c d)
  (and (xor (not a ) b) (not (or a (not b) c)) (or (not d) (not c) (not b) (not a)))
  )