#lang racket

(define (vector-apply start operator vecVal vecIndices)
  (if (vector-empty? vecIndices)
    start
    (vector-apply (operator start (vector-ref vecVal (vector-ref vecIndices 0))) operator vecVal (vector-drop vecIndices 1))
    )
  )
