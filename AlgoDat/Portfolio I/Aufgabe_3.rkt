#lang racket
(define (preis kwh)
  (cond
    ((< kwh 2000) (* 0.2 kwh 1.1))
    ((>= kwh 3500) (* 0.2 kwh 0.95))
    (else (* 0.2 kwh)))
  )