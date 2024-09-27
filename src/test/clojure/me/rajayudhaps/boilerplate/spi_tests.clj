(ns me.rajayudhaps.boilerplate.spi-tests
  (:require [clojure.test :as t]
            [me.rajayudhaps.boilerplate.spi :as spi]))

(t/deftest add-test
  (t/testing "add works as expected"
    (t/is (= 6 (spi/-add nil 2 4)))))