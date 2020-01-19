(ns aoc2019.day01
  "day 1 problems"
  (:require [clojure.string] [clojure.math.numeric-tower :as math]))

(defn getInput
  []
  (map #(Integer/parseInt %)
       (clojure.string/split-lines
        (slurp "data/day01.txt"))))

(defn calculateModuleFuel
  [module]
  (- (math/floor (/ module 3)) 2))

(defn doit
  []
  (reduce
   (fn [c, m] (+ c (calculateModuleFuel m)))
   0 (getInput)))
