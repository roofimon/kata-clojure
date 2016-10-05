(ns captcha.security-test
  (:require [clojure.test :refer :all]
            [captcha.security :refer :all]))

(deftest first-pattern-left-should-be-1
  (def result (captcha 1 1 1 1))
  (is (= "1" (get result :left))))

(deftest first-pattern-left-should-be-9
  (def result (captcha 1 9 1 1))
  (is (= "9" (get result :left))))

(deftest first-pattern-left-should-be-one
  (def result (captcha 2 1 1 1))
  (is (= "one" (get result :left))))

(deftest first-pattern-left-should-be-nine
  (def result (captcha 2 9 1 1))
  (is (= "nine" (get result :left))))

(deftest first-pattern-right-should-be-1
  (def result (captcha 1 1 1 1))
  (is (= "1" (get result :right))))

(deftest first-pattern-right-should-be-9
  (def result (captcha 1 1 1 9))
  (is (= "9" (get result :right))))

(deftest first-pattern-right-should-be-one
  (def result (captcha 2 1 1 1))
  (is (= "one" (get result :right))))

(deftest first-pattern-right-should-be-nine
  (def result (captcha 2 1 1 9))
  (is (= "nine" (get result :right))))
