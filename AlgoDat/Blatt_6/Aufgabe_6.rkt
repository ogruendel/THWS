#lang racket
(define struktur1 (cons (cons 24 (cons 1 2)) (cons 20 (cons 1 1))))

(define struktur2 (cons (cons 7 (cons 2 (cons 3 (cons 1 (list))))) (list)))

(define struktur3 (cons (cons 3 (cons 3 (list))) (cons 3 (cons 3 (cons 3 3)))))

(define struktur4 (cons (cons (cons (list) (cons 6 (cons 1 (cons 0 (cons 2 4))))) (cons 3 3)) (cons 10 (cons 7 (cons 8 (cons 9 (cons 3 (list))))))))