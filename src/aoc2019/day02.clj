(ns aoc2019.day02
  "day 2 problems"
  (:require [clojure.string]
            [clojure.math.numeric-tower :as math]
            [aoc2019.helpers :as helpers]))


(defn addAndReturn
  [v i]
  (let [a (get v (get v (+ i 1)))
        b (get v (get v (+ i 2)))
        c (+ a b)
        newpos (get v (+ i 3))]
    (println (format "i: %s a: %s b: %s c: %s newpos: %s" i a b c newpos))
    (assoc v newpos c)))

(defn multiplyAndReturn
  [v i]
  (let [a (get v (get v (+ i 1)))
        b (get v (get v (+ i 2)))
        c (* a b)
        newpos (get v (+ i 3))]

    (println (format "i: %s a: %s b: %s c: %s newpos: %s" i a b c newpos))
    (assoc v newpos c)))

(defn process
  ([v] (process v 0))
  ([v i]
   (println (format "processing:  i: %s" i))
   (println v)
   (case (get v i)
     99 v
     1  (process (addAndReturn v i) (+ 4 i))
     2  (process (multiplyAndReturn v i) (+ 4 i)))))


(defn fixProgram
  []
  (let [original  (helpers/getArrayOfIntegersFromFile "data/day02.txt")
        one (doall (assoc original 1 12))
        two (doall (assoc one 2 2 ))]
    (last (process two))))