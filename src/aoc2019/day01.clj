(ns aoc2019.day01
  "day 1 problems"
  (:require [clojure.string]
            [clojure.math.numeric-tower :as math]
            [aoc2019.helpers :as helpers]))

(defn calculateModuleFuelSimple
  [module]
  (- (math/floor (/ module 3)) 2))


(defn calculateModuleFuelWithFuelCost
  [module]
  (let [f (calculateModuleFuelSimple module)]
    (if (> f 0)
      (if (>= f 3)
        (+ f (calculateModuleFuelWithFuelCost f))
        f)
      0)))

(defn doSimpleChallenge
  []
  (reduce
   (fn [c, m] (+ c (calculateModuleFuelSimple m)))
   0 (helpers/getArrayOfIntegersFromFile "data/day01.txt")))


(defn doComplexChallenge
  []
  (reduce
   (fn [c, m] (+ c (calculateModuleFuelWithFuelCost m)))
   0 (helpers/getArrayOfIntegersFromFile "data/day01.txt")))
