(ns parentheses-validation.core-test
  (:require [clojure.test :refer :all]
            [parentheses-validation.core :refer :all]))

(deftest fun-test
	(testing "testing: ()"
	(parentheses-validation.core/pre_process "()")
	(is(= true parentheses-validation.core/ret)));
	(testing "testing: ()[]{}"
	(parentheses-validation.core/pre_process "()[]{}")
	(is(= true parentheses-validation.core/ret)));
	(testing "testing: ([)]"
	(parentheses-validation.core/pre_process "([)]")
	(is(= false parentheses-validation.core/ret)));
	(testing "testing: {[]}"
	(parentheses-validation.core/pre_process "{[]}")
	(is(= true parentheses-validation.core/ret)));
	(testing "testing: (]"
	(parentheses-validation.core/pre_process "(]")
	(is(= false parentheses-validation.core/ret)))
	(testing "testing: {[}]()"
	(parentheses-validation.core/pre_process "{[}]()")
	(is(= false parentheses-validation.core/ret))))
