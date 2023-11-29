#lang racket
(define (drehe liste)
  (define (drehe-iter liste new)
    (if (null? liste)
        new
        (drehe-iter (cdr liste) (cons (car liste) new)))
    )

  (drehe-iter liste (list))
  )