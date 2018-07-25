(ns tic-tac-toe-clojure.print-board
  (:require [clojure.string :refer [join]]))

(def padding "---------")

(defn print-board
  [board]
  (print (str (char 27) "[2J"))
  (println (join " | " (subvec board 0 3)))
  (println padding)
  (println (join " | " (subvec board 3 6)))
  (println padding)
  (println (join " | " (subvec board 6))))
