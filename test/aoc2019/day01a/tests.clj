(ns aoc2019.day01a.tests
  (:require [clojure.test :refer :all]
            [aoc2019.day01a]))

(deftest singleModule
  (are [input result] (= result (aoc2019.day01a/calculateModuleFuel input))
    14 2
    1969 966
    100756 50346))


(deftest completeChallenge
 (are [result] (= result (aoc2019.day01a/doit))
  5049684
 ))