(ns me.rajayudhaps.boilerplate.spi)

(gen-class
 :name me.rajayudhaps.boilerplate.spi.impl.CalculatorImpl
 :implements [me.rajayudhaps.boilerplate.spi.Calculator]
 :main false)

#_{:clj-kondo/ignore [:unused-binding]}
(defn -add [this a b]
  (+ a b))