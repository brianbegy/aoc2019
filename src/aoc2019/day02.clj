(ns aoc2019.day01a
  "day 1 problems"
  (:require [clojure.string]
            [clojure.math.numeric-tower :as math]
            [aoc2019.helpers :as helpers]))

(defn calculateModuleFuel
  [module]
  (let [f (- (math/floor (/ module 3)) 2)]
    (if (> f 0)
      (if (>= f 3)
        (+ f (calculateModuleFuel f))
        f)
      0)))

(defn doit
  []
  (reduce
   (fn [c, m] (+ c (calculateModuleFuel m)))
   0 (helpers/getArrayOfIntegersFromFile "data/day01.txt")))
