#lang racket
(define (operation operatoren n)
  (define (finde-operation operatoren n)
    (if (= n 1)
        (car operatoren)
        (finde-operation (cdr operatoren) (- n 1)))
    )
  (lambda (x) ((finde-operation operatoren n) (car x) (cadr x)))
  )

(define plus (operation (list + - * /) 1))
(define minus (operation (list + - * /) 2))