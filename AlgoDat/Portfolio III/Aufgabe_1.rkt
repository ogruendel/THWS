#lang racket
(define (anpassen liste)
  (define (anpassen-iter liste out)
    (if (empty? liste)
      out
      (if (even? (car liste))
        (if (= (remainder (car liste) 10) 0)
          (anpassen-iter (cdr liste) (append out (cons (expt (car liste) 2) '())))
          (anpassen-iter (cdr liste) (append out (cons (car liste) '()))))
        (anpassen-iter (cdr liste) out))
      )
    )
  (anpassen-iter liste '())
  )
