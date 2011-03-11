(ns euler.level1.problem001-spec
  (:use
   [speclj.core]
   [euler.level1.problem001]))

                                        ; http://projecteuler.net/index.php?section=problems&id=1


(describe "multiple-of?"
          (it "should return true if divisor is a multiple of n"
              (should (multiple-of? 10 5)))
          (it "should return false if divisior is not a multiple of n"
              (should-not (multiple-of? 10 3))))

(describe "sum"
          (it "should sum numbers"
              (should= 6 (sum '(1 2 3)))))

(describe "Euler Problem #1"

          (it "Solves #1"
              (should= 23 (euler-1 10)))
          )


(run-specs)
