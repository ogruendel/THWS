#lang racket
(define (hamming ziffer1 ziffer2)
  (define (hamming-iter ziffer1 ziffer2 dist)
    (if (empty? ziffer1)
        dist
        (if (equal? (car ziffer1) (car ziffer2))
            (hamming-iter (cdr ziffer1) (cdr ziffer2) dist)
            (hamming-iter (cdr ziffer1) (cdr ziffer2) (+ dist 1))
            )
        )
    )   
  (hamming-iter ziffer1 ziffer2 0)
  )
