#lang racket
(define (loesche liste praedikat)
  (if (praedikat (car liste))
      (loesche (cdr liste) praedikat)
      liste)
  )