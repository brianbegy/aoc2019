(ns aoc2019.helpers
  "basic utils"
  (:require [clojure.string]))

(defn getArrayOfIntegersFromFile
  [path]
  (map #(Integer/parseInt %)
       (clojure.string/split-lines
        (slurp path))))
