(ns aoc2019.day02.tests
  (:require [clojure.test :refer :all]
            [aoc2019.day02 :as sut]))

(deftest code-99-exits
  (is
   (= [99, 0, 1, 2, 3] (sut/process [99, 0, 1, 2, 3] 0))))

(deftest addAndReturn
  (are [input position expectation] (= expectation (sut/addAndReturn input 0))
    [1 2 3 4 6] 0 [1 2 3 4 7]))

(deftest multiplyAndReturn
  (are [input expectation] (= expectation (sut/multiplyAndReturn input 0))
    [2 2 3 4 6] [2 2 3 4 12]))

(deftest process
  (are [input output] (= output (sut/process input))
    [2 2 3 3 99] [2 2 3 9 99]
    [1,0,0,0,99] [2,0,0,0,99]
    [2,3,0,3,99] [2,3,0,6,99]
    [2,4,4,5,99,0] [2,4,4,5,99,9801]
    [1,1,1,4,99,5,6,0,99] [30,1,1,4,2,5,6,0,99]))

(deftest fixProgram

  (is (= 2 (sut/fixProgram))))