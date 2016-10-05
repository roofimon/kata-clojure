(ns captcha.security)

(def m ["one" "two" "three" "four" "five" "six" "seven" "eight" "nine"])

(defn string [captcha]
  (str (get captcha :left) " " (get captcha :operator) " " (get captcha :right)))

(defn second? [pattern] (= pattern 2))

(defn string-operand [index] (get m (- index 1)) )

(def integer-operand (fn [index] (str index)))

(defn assign-left-operand
  [pattern left]
  (if (second? pattern)
    (string-operand left)
    (integer-operand left) ))

(defn assign-right-operand
  [pattern right]
  (if (second? pattern)
    (integer-operand right)
    (string-operand right) ))

(defn assign-operator
  [operator]
  (get ["+" "*" "-"] (- operator 1)))

(def captcha
    (fn [pattern left operator right]
      {:left (assign-left-operand pattern left)
        :operator (assign-operator operator)
        :right (assign-right-operand pattern right)}))
