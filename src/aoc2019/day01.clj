(ns aoc2019.day01
  "day 1 problems"
  (:require [clojure.string]
            [clojure.math.numeric-tower :as math]
            [aoc2019.helpers :as helpers]))

(defn calculateModuleFuel
  [module]
  (- (math/floor (/ module 3)) 2))

(defn doit
  []
  (reduce
   (fn [c, m] (+ c (calculateModuleFuel m)))
   0 (helpers/getArrayOfIntegersFromFile "data/day01.txt")))
