#lang racket

(define (vector-apply start operator vecVal vecIndices)
  (if (vector-empty? vecIndices)
    start
    (vector-apply (operator start (vector-ref vecVal (vector-ref vecIndices 0))) operator vecVal (vector-drop vecIndices 1))
    )
  )

(vector-apply 0 + #(1 2 3 4) #(0 1))
(vector-apply 1 * #(3 1 2 9) #(2 1 0))
