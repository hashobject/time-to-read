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


(def test-text "Intro

I'm a big fan of the Finnish education system. I like to read about it and discuss it with people passionate about education.
I just spent 12 incredible weeks as a student in the fall batch of Hacker School. Hacker School is a unique place, I'm excited about it now even more than before applying. It was that good.
Now let's try to find some similarities between education in Finland and Hacker School.
Minimal structure

They have very minimal structure of education both in Finland (the national curriculum is only broad guidelines) and in Hacker School. It helps students focus on things they want to study themselves, things they are passionate about Motivated students are the biggest achievement of any educational system.
No grades

During the first years of school in Finland, grading may be limited to verbal assessments rather than formal grades. Why do we need grades? It's refreshing, when you can spend time learning what you like, instead of thinking about how to get the highest grade.
No fees

There are no tuition fees in both Finland and Hacker School.
No competition

Finland's experience shows that it is possible to achieve excellence by focusing not on competition, but on cooperation [1].
The same principle work in Hacker School. Students constantly try to help each other.")

(deftest estimate-for-text-test
  (testing "estimate should use 200 as wpm by default"
    (is (= (estimate-for-text test-text) 2)))
  (testing "estimate should work without rounding with normal case"
    (is (= (estimate-for-text test-text 100) 3)))
  (testing "estimate should work with ceiling with normal case"
    (is (= (estimate-for-text test-text 100) 3))))
