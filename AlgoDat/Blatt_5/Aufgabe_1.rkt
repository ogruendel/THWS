#lang racket
(define (euler-n n)
  (euler-n-iter n 0 0)
  )


(define (euler-n-iter n i euler)
  (if (> i n)
      euler
      (+ euler (/ 1 (fac i)) (euler-n-iter n (+ i 1) euler)))
  )

(define (fac n)
  (define (fac-iter n fac i)
    (if (> i n)
        fac
        (* fac i (fac-iter n fac (+ i 1))))
    )
  (fac-iter n 1 1)
  )