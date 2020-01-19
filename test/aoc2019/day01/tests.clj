(ns aoc2019.day01.tests
  (:require [clojure.test :refer :all]
            [aoc2019.day01]))

(deftest day1 test
  (is
   (=
    (aoc2019.day01/doit)
    3368364N)))
