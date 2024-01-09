#lang racket
(define (wort-sortieren wort)
  (define (wort-sortieren-iter wort liste)
    (if (empty? wort)
      liste
      (wort-sortieren-iter (cdr wort) (addChar (car wort) liste))
      )
    )

(define (addChar c liste)
  (if (empty? liste)
    (list c)
    (if (char>? (char-downcase (car liste)) (char-downcase c))
      (append (list c) liste)
      (append (list (car liste)) (addChar c (cdr liste)))
      )
    )
  )

  (list->string (wort-sortieren-iter (string->list wort) '()))
  )
