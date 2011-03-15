(ns euler.level1.problem002)
 
(defn fib-seq [] 
  (map first
       (iterate (fn [[x y]] [y (+ x y)] ) [0 1])))

(defn euler-2 []
  (loop [acc 0
         fibs (fib-seq)]
    (let [fib (first fibs)]
      (println fib)
      (if (< 4000000 fib)
        acc
        (recur (if (even? fib) (+ fib acc) acc)(rest fibs))))))
 
  
