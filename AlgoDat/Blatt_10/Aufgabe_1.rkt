#lang racket
(define (removeFirstLast string)
  (define (removeFirstLastIter string i)
    (if (= (length string) 1)
      '()
      (if (= i 0)
        (removeFirstLastIter (cdr string) (+ i 1))
        (cons (car string) (removeFirstLastIter (cdr string) (+ i 1)))
        )
      )
    )
  (list->string (removeFirstLastIter (string->list string) 0))
  )