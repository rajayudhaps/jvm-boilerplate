(ns me.rajayudhaps.boilerplate.spi)

(gen-class
 :name me.rajayudhaps.boilerplate.spi.impl.CalculatorImpl
 :implements [me.rajayudhaps.boilerplate.spi.Calculator]
 :main false)

(defn -add [this a b]
  (+ a b))