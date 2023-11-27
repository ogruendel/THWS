#lang racket
(define (paar-operation op)
  (lambda (x) (op (car x) (cdr x)))
  )

(define paar=? (paar-operation =))

(define paar<? (paar-operation <))

(define paar+ (paar-operation +))