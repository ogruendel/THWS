#lang racket
(define (vektor-add . vektoren)
  (define (vektor-add-iter summe vektoren)
    (if (empty? vektoren)
      summe
      (if (empty? summe)
        (vektor-add-iter (car vektoren) (cdr vektoren))
        (vektor-add-iter (map (lambda (summen-vektor vektor) (+ summen-vektor vektor)) summe (car vektoren)) (cdr vektoren))
        )
      )
    )
  (vektor-add-iter '() vektoren)
  )
