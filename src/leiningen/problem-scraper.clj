(ns leiningen.euler
  (:use [clojure.contrib.duck-streams :only [reader]]
        [net.cgrand.enlive-html :only [html-resource select text]]))


(defn problem-url
  [problem-number]
  (format "http://projecteuler.net/index.php?section=problems&id=%s" problem-number))

(defn html-nodes
  "Scrapes projecteuler.net for the problem content node"
  [problem-number]
  (let [html (-> (problem-url problem-number) reader html-resource)]
    (select html [:div.problem_content])))

(def element {:tag :div,  :content '("2" "3" {:tag :p, :content ("4")})})

(def sup-tag  {:tag :sup, :content '("2")})

(def p-content '({:tag :p, :content '("hi")}))

(def decorators {:p     #(cons "\n" %1)
                 :sup   #(cons "^" %1)})
(defn decorate [content tag]
  (let [ decorator (tag decorators)]
    (if (nil? decorator)
      content
      (decorator content))))

(defn render-element [element]
  (apply str
         (flatten (for [content (:content element)]
    (if (map? content)
      (decorate (render-element content) (:tag content))
      content)))))


