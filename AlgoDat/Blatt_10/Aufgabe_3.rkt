#lang racket
(define (isAnagramm anagramm string2)
  (define (isAnagrammIter anagramm string2)
    (equal?
      (cleanList (sort (map (lambda (x) (char-downcase x)) anagramm) char<?))
      (cleanList (sort (map (lambda (x) (char-downcase x)) string2) char<?))
      )
    )

    (define (cleanList list)
        (if (empty? list)
          '()
          (if (char=? (car list) #\space)
            (cleanList (cdr list))
            (cons (car list) (cleanList (cdr list)))
            )
          )
      )
    (isAnagrammIter (string->list anagramm) (string->list string2))
  )

(isAnagramm "Desperation" "A rope ends it")
(isAnagramm "Eleven plus two" "Twelve plus one")
