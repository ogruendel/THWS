#lang racket
(define (werte-aus term zuweisung)
  (define (prozedur term)
    (cond ((equal? (car term) '+) +)
          ((equal? (car term) '-) -)
          ((equal? (car term) '*) *)
          ((equal? (car term) '/) /)
          )
    )

  (define (getValue var zuweisung)
    (if (number? var)
      var
      (if (equal? var (car (car zuweisung)))
        (cadr (car zuweisung))
        (getValue var (cdr zuweisung))
        )
      )
    )

  (define (werte-aus-iter operator term zuweisung result)
    (if (empty? term)
      result
      (if (null? result)
        (werte-aus-iter operator (cdr term) zuweisung (getValue (car term) zuweisung))
        (werte-aus-iter operator (cdr term) zuweisung (operator result (getValue (car term) zuweisung)))
        )
      )
    )

  (werte-aus-iter (prozedur term) (cdr term) zuweisung '())
  )
