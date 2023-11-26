#lang racket
(define (konst-ggt b)
  (define (ggt a b)
  (if (= b 0)
      a
      (ggt b (remainder a b)))
  )
  
  (lambda (a) (ggt a b))
  )


(define ggt10 (konst-ggt 10))
(define ggt987 (konst-ggt 987))

(ggt10 25)
(ggt10 27)

(ggt987 762351)
(ggt987 98123746)