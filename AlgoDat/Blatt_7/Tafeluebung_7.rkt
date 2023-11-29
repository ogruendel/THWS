#lang racket
(list (cons 1 2) (list 3 4))
(list 1 2 (cons 3 4) 5 (list 6))
(list (list cons 1 2) (list cons 3 4) 5) ;Nicht zu 100% sicher ob das gemeint ist
(list + 2 3 (list sin 90)) ;Ebenfalls nicht zu 100% sicher ...