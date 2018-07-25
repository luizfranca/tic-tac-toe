(ns tic-tac-toe-clojure.print-board
  (:require [clojure.string :refer [join]]))

(def padding "---------")

(defn print-board
  [board]
  (println (join " | " (subvec board 0 3)))
  (println padding)
  (println (join " | " (subvec board 3 6)))
  (println padding)
  (println (join " | " (subvec board 6))))
