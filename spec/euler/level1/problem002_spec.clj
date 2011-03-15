(ns euler.level1.problem002-spec
  (:use
    [speclj.core]
    [euler.level1.problem002]))

; http://projecteuler.net/index.php?section=problems&id=2

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= -1 (euler-2 -1)))
  )

(run-specs)
