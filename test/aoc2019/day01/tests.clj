(ns aoc2019.day01.tests
  (:require [clojure.test :refer :all]
            [aoc2019.day01]))

(deftest test-calculateModuleFuelSimple
  (are [input result] (= result (aoc2019.day01/calculateModuleFuelSimple input))
    12 2
    14 2
    1969 654
    100756 33583))

(deftest test-doSimpleChallenge
  (is
   (=
    (aoc2019.day01/doSimpleChallenge)
    3368364N)))


(deftest test-calculateModuleFuelWithFuelCost
  (are [input result] (= result (aoc2019.day01/calculateModuleFuelWithFuelCost input))
    14 2
    1969 966
    100756 50346))


(deftest completeChallenge
  (are [result] (= result (aoc2019.day01/doComplexChallenge))
    5049684))