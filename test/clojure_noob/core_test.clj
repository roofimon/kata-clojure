(ns clojure-noob.core-test
  (:require [clojure.test :refer :all] [clojure-noob.core :refer :all]))

(defn isModulus3
  [number]
    (mod number 3))

(defn isModulus5
  [number]
    (mod number 5))

(defn fizzbuzz
  [number]
    (cond
      (and (zero? (isModulus3 number)) (zero? (isModulus5 number))) "fizzbuzz"
      (zero? (isModulus3 number)) "fizz"
      (zero? (isModulus5 number)) "buzz"
      :else (str number)))

(deftest cuount-1-should-be-1
  (is (= "1" (fizzbuzz 1))))

(deftest count-2-is-should-be-2
  (is (= "2" (fizzbuzz 2))))

(deftest count-3-should-be-fizz
  (is (= "fizz" (fizzbuzz 3))))

(deftest count-5-should-be-buzz
  (is (= "buzz" (fizzbuzz 5))))

(deftest count-6-should-be-fizz
  (is (= "fizz" (fizzbuzz 6))))

(deftest count-15-should-be-fizzbuzz
  (is (= "fizzbuzz" (fizzbuzz 15))))
