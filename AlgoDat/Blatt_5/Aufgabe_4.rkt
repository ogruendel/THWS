#lang racket
(define (maxziffer n)
  (maxziffer-iter n 0)
  )

(define (maxziffer-iter n max)
  (if (< n 9)
      max
      (if (> (remainder n 10) max)
          (maxziffer-iter (quotient n 10) (remainder n 10))
          (maxziffer-iter (quotient n 10) max)))
  )