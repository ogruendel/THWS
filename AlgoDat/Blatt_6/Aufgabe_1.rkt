#lang racket
(define (zaehlen start ende n)
  (if (> start ende)
      0
      (if (= n 0)
          (- start 1)
          (if (and (= (remainder start 3) 0) (= (remainder start 7) 0))
              (zaehlen (+ start 1) ende (- n 1))
              (zaehlen (+ start 1) ende n))))
  )