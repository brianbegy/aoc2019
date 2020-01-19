(ns aoc2019.day01.tests
  (:require [clojure.test :refer :all]
            [aoc2019.helpers :as sut]))

(deftest splitsProperly
  (are [input output]  (= output sut/splitIt (input))
    ["a b c d"], ["a", "b", "c" "d"]
    ["a b c\nd"], ["a", "b", "c" "d"]))

(deftest eliminatesEmpties
  (are [input output]  (= output sut/trimIt (input))
    ["a", "b", "c" "d" "  "], ["a", "b", "c" "d"]))

(deftest returnsArray
  (are [input output] (=  output (sut/splitsIt input))
    "30 1 1 4 2 5 6 0 99" [30 1 1 4 2 5 6 0 99]))
