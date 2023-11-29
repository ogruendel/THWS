#lang racket
(define (caesar_encrypt_list data key)
  (define (caesar_encrypt_list_iter data key key_backup)
    (if (null? data)
        (list)
        (if (null? (cdr key))
            (cons (remainder (+ (car data) (car key)) 10) (caesar_encrypt_list_iter (cdr data) key_backup key_backup))
            (cons (remainder (+ (car data) (car key)) 10) (caesar_encrypt_list_iter (cdr data) (cdr key) key_backup))))
    )

  (caesar_encrypt_list_iter data key key)
  )