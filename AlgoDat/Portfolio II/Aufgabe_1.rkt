#lang racket
(define (zaehleteiler n)
  (define (zaehleteiler-iter n i summe)
    (if (>= i n)
        summe
        (if (= (remainder n i) 0)
            (zaehleteiler-iter n (+ i 1) (+ summe 1))
            (zaehleteiler-iter n (+ i 1) summe)
            )
        )
    )
  (zaehleteiler-iter n 2 0)
  )