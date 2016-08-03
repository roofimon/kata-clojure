(ns clojure-noob.core
  (:gen-class))

(defn modulus3? [number] (zero? (mod number 3)))

(defn modulus5? [number] (zero? (mod number 5)))

(defn fizzbuzz
  [number]
    (cond
      (and (modulus3? number) (modulus5? number) ) "fizzbuzz"
      (modulus3? number) "fizz"
      (modulus5? number) "buzz"
      :else (str number)))
