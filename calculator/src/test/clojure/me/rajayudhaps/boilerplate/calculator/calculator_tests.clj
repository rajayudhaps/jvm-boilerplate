(ns me.rajayudhaps.boilerplate.calculator.calculator-tests 
  (:require [clojure.test :as t]
            [me.rajayudhaps.boilerplate.calculator.calculator-impl :as spi]))

(t/deftest add-test
  (t/testing "add works as expected"
    (t/is (= 6 (spi/-add nil 2 4)))))