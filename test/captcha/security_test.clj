(ns captcha.security-test
  (:require [clojure.test :refer :all]
            [captcha.security :refer :all]))

(deftest with-first-pattern-captcha-should-be-1-plus-one
  (is (= "1 + one" (string (captcha 1 1 1 1)))))

(deftest with-second-pattern-captcha-should-be-one-plus-1
  (is (= "one + 1" (string (captcha 2 1 1 1)))))

(deftest first-pattern-left-should-be-1
  (is (= "1" (get (captcha 1 1 1 1) :left) )))

(deftest first-pattern-left-should-be-9
  (is (= "9" (get (captcha 1 9 1 1) :left) )))

(deftest second-pattern-left-should-be-one
  (is (= "one" (get (captcha 2 1 1 1) :left) )))

(deftest second-pattern-left-should-be-nine
  (is (= "nine" (get (captcha 2 9 1 1) :left) )))

(deftest first-pattern-right-should-be-one
  (is (= "one" (get (captcha 1 1 1 1) :right))))

(deftest first-pattern-right-should-be-nine
  (is (= "nine" (get (captcha 1 1 1 9) :right))))

(deftest second-pattern-right-should-be-1
  (is (= "1" (get (captcha 2 1 1 1) :right))))

(deftest second-pattern-right-should-be-9
  (is (= "9" (get (captcha 2 1 1 9) :right))))
