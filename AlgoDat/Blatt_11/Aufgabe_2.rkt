#lang racket
(define (deep-memq element liste)
  (if (empty? liste)
    false
    (if (list? liste)
      (or (deep-memq element (car liste)) (deep-memq element (cdr liste)))
      (if (eq? element liste)
        true
        false
        )
      )
    )
  )
