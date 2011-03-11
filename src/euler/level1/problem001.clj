(ns euler.level1.problem001)

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple-of? [n divisor]
  (= (rem n divisor)0))

(defn sum [s] (apply + s))

(defn euler-1 [n]
 (sum (filter #(or
            (multiple-of? % 3)
            (multiple-of? % 5)) (range 1 n))))

