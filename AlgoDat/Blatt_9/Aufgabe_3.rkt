#lang racket
(define (listen-verschmelzen eingabe)
  (define (listen-verschmelzen-iter links rechts)
    (if (empty? rechts)
        (if (empty? links)
            '()
            (list (car links)))
        (cons (car links) (cons (car rechts) (listen-verschmelzen-iter (cdr links) (cdr rechts))))
        )
    )
  
  (listen-verschmelzen-iter (car eingabe) (cadr eingabe))
  )
