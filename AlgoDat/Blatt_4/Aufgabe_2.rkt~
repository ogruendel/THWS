#lang racket
(define (fakt n)
  (if (even? n)
      2
      (let* ((a (ceiling (sqrt n))))
        (fakt-iter a n)))
  )

(define (fakt-iter a n)
    (let ((b (sqrt (- (* a a) n))))
      (if (integer? (sqrt (* b b)))
        (- a (sqrt (* b b)))
        (fakt-iter (+ a 1) n)))
  )