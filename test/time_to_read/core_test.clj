(ns time-to-read.core-test
  (:use clojure.test
        time-to-read.core))

(deftest word-count-test
  (testing "word count should work for text"
    (is (= (word-count "Anton programms in Clojure") 4))))


(deftest estimate-test
  (testing "estimate should use 200 as wpm by default"
    (is (= (estimate 1000) 5)))
  (testing "estimate should work without rounding with normal case"
    (is (= (estimate 1000 200) 5)))
  (testing "estimate should work with ceiling with normal case"
    (is (= (estimate 900 200) 5))))
