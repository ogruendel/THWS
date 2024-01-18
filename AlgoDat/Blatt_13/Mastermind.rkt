#lang racket

(define (mastermind code)
  ; returns a list of all possible combinations of 4 colors
  (define (alleKombinationen)
    (define (alleKombinationenRec i j k l maximum)
      (if (> i maximum)
        '()
        (if (> j maximum)
          (alleKombinationenRec (+ i 1) 0 k l maximum)
          (if (> k maximum)
            (alleKombinationenRec i (+ j 1) 0 l maximum)
            (if (> l maximum)
              (alleKombinationenRec i j (+ k 1) 0 maximum)
              (cons (list i j k l) (alleKombinationenRec i j k (+ l 1) maximum))
              )
            )
          )
        )
      )
    (alleKombinationenRec 0 0 0 0 5)
    )

  (define (mastermind-rec code guess verbleibende)
    ; returns a pair of the number of correctly guessed colors and the number of correctly placed colors (white . black)
    (define (bewerte code guess)
      ; returns the number of correctly placed colors in a code
      (define (zaehleSchwarz code guess)
        (if (empty? code)
          0
          (if (equal? (car code) (car guess))
            (+ 1 (zaehleSchwarz (cdr code) (cdr guess)))
            (zaehleSchwarz (cdr code) (cdr guess)))
          )
        )
      ; returns the sum of the smallest number of all colors present between two codes
      (define (minSumme code guess)
        (define (minSummeRec code guess farbe)
          ; returns the smallest number of a color present between two codes
          (define (minFarbe code guess farbe)
            ; returns how often a color is present in the code
            (define (zaehleFarbe code farbe)
              (if (empty? code)
                0
                (if (equal? (car code) farbe)
                  (+ 1 (zaehleFarbe (cdr code) farbe))
                  (zaehleFarbe (cdr code) farbe))
                )
              )

        (min (zaehleFarbe code farbe) (zaehleFarbe guess farbe))
        )

      (if (> farbe 5)
        0
        (+ (minFarbe code guess farbe) (minSummeRec code guess (+ farbe 1)))
        )
      )

    (minSummeRec code guess 0)
    )

  (cons (- (minSumme code guess) (zaehleSchwarz code guess)) (zaehleSchwarz code guess))
  )
    ; returns the next best guess that should be made
    (define (nextGuess moeglichkeiten verbleibende bestGuess bestScoreWert)
      ; returns the lowest amount of incorrect guesses that a given guess can result in for each possible score?
      (define (minScore moeglichkeiten guess scores)
        (define (minScoreRec moeglichkeiten guess scores minimum)
          ; returns the amount of guesses that don't result in a given score
          (define (zaehleWegfallende moeglichkeiten guess score)
            (if (empty? moeglichkeiten)
              0
              (if (equal? (bewerte (car moeglichkeiten) guess) score)
                (zaehleWegfallende (cdr moeglichkeiten) guess score)
                (+ 1 (zaehleWegfallende (cdr moeglichkeiten) guess score))
                )
              )
            )

    (if (empty? scores)
      minimum
      (if (or (= -1 minimum) (< (zaehleWegfallende moeglichkeiten guess (car scores)) minimum))
        (minScoreRec moeglichkeiten guess (cdr scores) (zaehleWegfallende moeglichkeiten guess (car scores)))
        (minScoreRec moeglichkeiten guess (cdr scores) minimum)
        )
      )
    )
  (minScoreRec moeglichkeiten guess scores -1)
  )
      ; a list of all possible scores
      (define alleScores '((0 . 4) (0 . 3) (2 . 2) (1 . 2) (0 . 2) (3 . 1) (2 . 1) (1 . 1) (0 . 1) (4 . 0) (3 . 0) (2 . 0) (1 . 0) (0 . 0)))

      (if (empty? verbleibende)
        bestGuess
        (if (= bestScoreWert -1)
          (nextGuess moeglichkeiten (cdr verbleibende) (car verbleibende) (minScore moeglichkeiten (car verbleibende) alleScores))
          (if (> (minScore moeglichkeiten (car verbleibende) alleScores) bestScoreWert)
            (nextGuess moeglichkeiten (cdr verbleibende) (car verbleibende) (minScore moeglichkeiten (car verbleibende) alleScores))
            (nextGuess moeglichkeiten (cdr verbleibende) bestGuess bestScoreWert)
            )
          )
        )
      )
    ; returns a list of all possible guesses that result in the same given score
    (define (filterListe moeglichkeiten guess score)
      (if (empty? moeglichkeiten)
        '()
        (if (equal? (bewerte (car moeglichkeiten) guess) score)
          (cons (car moeglichkeiten) (filterListe (cdr moeglichkeiten) guess score))
          (filterListe (cdr moeglichkeiten) guess score)
          )
        )
      )

    (if (equal? code guess)
      (cons guess '())
      (cons guess (mastermind-rec code (nextGuess (alleKombinationen) (filterListe verbleibende guess (bewerte guess code)) guess -1) (filterListe verbleibende guess (bewerte guess code))))
      )
    )
  (mastermind-rec code '(0 0 1 1) (alleKombinationen))
  )

(mastermind '(0 2 1 3))
