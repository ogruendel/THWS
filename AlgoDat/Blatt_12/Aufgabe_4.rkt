#lang racket
(define (vector-add vec1 vec2)
  (define (normalize-vector vec l)
    (vector-append vec (make-vector (- l (vector-length vec)) 0))
    )

  (if (= (vector-length vec1) (vector-length vec2))
    (vector-map + vec1 vec2)
    (if (< (vector-length vec1) (vector-length vec2))
      (vector-add (normalize-vector vec1 (vector-length vec2)) vec2)
      (vector-add vec1 (normalize-vector vec2 (vector-length vec1)))
      )
    )
  )
