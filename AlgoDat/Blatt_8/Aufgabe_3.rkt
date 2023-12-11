#lang racket
(define (loeschen liste n)
  (if (or (= 0 n) (empty? liste))
      liste
      (loeschen (cdr liste) (- n 1))
      )
  )