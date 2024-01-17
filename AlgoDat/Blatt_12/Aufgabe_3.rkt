#lang racket
(define (tokenizer satz token)
  (define (tokenizer-iter satz token temp liste)
    (if (empty? satz)
      (if (empty? temp)
        liste
        (append liste (list (list->string temp)))
        )
      (if (char=? (car satz) (car token))
        (tokenizer-iter (cdr satz) token '() (append liste (list (list->string temp))))
        (tokenizer-iter (cdr satz) token (append temp (list (car satz))) liste)
        )
      )
    )
  (tokenizer-iter (string->list satz) (string->list token) '() '())
  )