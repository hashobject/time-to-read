(ns time-to-read.core)

(defn word-count
  "Calculate number of words in the text"
  [text]
  (count (clojure.string/split text #"\s")))

(defn estimate
  "Estimate time to read for given words count"
  ([wc]
    (estimate wc 200))
  ([wc wpm]
    (int (Math/ceil (/ wc wpm)))))


(defn estimate-for-text
  "Estimate time to read for text"
  ([text]
   (estimate (word-count text)))
  ([text wpm]
    (estimate (word-count text) wpm)))
