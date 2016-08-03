(ns clojure-noob.core-test
  (:require [clojure.test :refer :all] [clojure-noob.core :refer :all]))

(deftest cuount-normal-when-number-not-modulus-with-3-and-5
  (is (= "1" (fizzbuzz 1)))
  (is (= "2" (fizzbuzz 2))))

(deftest count-fizz-when-number-is-modulus-3
  (is (= "fizz" (fizzbuzz 3)))
  (is (= "fizz" (fizzbuzz 6))))

(deftest count-buzz-when-number-is-modulus-5
  (is (= "buzz" (fizzbuzz 5)))
  (is (= "buzz" (fizzbuzz 10))))

(deftest count-fizzbuzz-when-number-is-modulus-3-and-5
  (is (= "fizzbuzz" (fizzbuzz 15))))
