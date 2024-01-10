#lang racket
(define (string-enthalten satz wort)
  (define (string-enthalten-iter satz wort länge-satz länge-wort)
    (if (< länge-satz länge-wort)
      false
      (if (equal? wort (substring satz 0 länge-wort))
        true
        (string-enthalten-iter (substring satz 1) wort (- länge-satz 1) länge-wort)
        )
      )
    )
    (string-enthalten-iter satz wort (length (string->list satz)) (length (string->list wort)))
  )
