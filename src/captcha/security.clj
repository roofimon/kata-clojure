(ns captcha.security)

(def m ["one" "two" "three" "four" "five" "six" "seven" "eight" "nine"])

(defn second?
  [pattern]
  (= pattern 2))

(defn assign-left-operand
  [pattern left]
  (if (second? pattern)
    (get m (- left 1))
    (str left) ))

(defn assign-right-operand
  [pattern right]
  (if (second? pattern)
    (str right) )
    (get m (- right 1)))

(defn assign-operator
  [operator]
  (get {:1 "+" :2 "*" :3 "-"} (- operator 1)))

(def captcha
    (fn [pattern left operator right]
      {:left (assign-left-operand pattern left)
        :operator (assign-operator operator)
        :right (assign-left-operand pattern right)}))
