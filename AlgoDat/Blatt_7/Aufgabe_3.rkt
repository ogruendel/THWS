#lang racket
(define (typ-or typ1 typ2)
  (lambda (x) (or (typ1 x) (typ2 x)))
  )

(define paar-oder-liste? (typ-or pair? list?))
(define integer-oder-boolean? (typ-or integer? boolean?))