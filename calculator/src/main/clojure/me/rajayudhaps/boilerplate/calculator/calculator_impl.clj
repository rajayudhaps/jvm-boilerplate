(ns me.rajayudhaps.boilerplate.calculator.calculator-impl)

(gen-class
 :name me.rajayudhaps.boilerplate.calculator.CalculatorImpl
 :implements [me.rajayudhaps.boilerplate.calculator.Calculator]
 :main false)

#_{:clj-kondo/ignore [:unused-binding]}
(defn -add [this a b]
  (+ a b))

