#lang racket

(define (zaehleSchwarz code guess)
  (if (empty? code)
    0
    (if (= (car code) (car guess))
      (+ 1 (zaehleSchwarz (cdr code) (cdr guess)))
      (zaehleSchwarz (cdr code) (cdr guess)))
    )
  )
