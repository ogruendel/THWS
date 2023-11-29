#lang racket
(define (linker-index ziffer zahl)
  (define (linker-index-iter ziffer zahl laenge r)
    (if (= 0 zahl)
        #f
        (if (= ziffer (quotient zahl (expt 10 (- laenge 1))))
            r
            (linker-index-iter ziffer (remainder zahl (expt 10 (- laenge 1))) (- laenge 1) (+ r 1))))
    )

  (linker-index-iter ziffer (abs zahl) (laenge zahl 0) 1)
  )

(define (laenge zahl l)
  (if (= zahl 0)
      l
      (laenge (quotient zahl 10) (+ l 1)))
  )