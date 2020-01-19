(ns aoc2019.helpers
  "basic utils"
  (:require [clojure.string]))

(defn splitIt
  [input]

  (clojure.string/split
   input #"\s|\n|,"))

(defn trimIt
  [input]
  (remove clojure.string/blank? input))

(defn parseIt
  [input]
  (map #(Integer/parseInt %)  input))


(defn getArrayOfIntegersFromFile
  [path]
  (parseIt
   (trimIt
    (splitIt
     (slurp path)))))

