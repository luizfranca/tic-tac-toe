(ns tic-tac-toe-clojure.core
  (:gen-class)
  (:require [tic-tac-toe-clojure.print-board :as print-board]
            [tic-tac-toe-clojure.check-victory :as check-victory]))

(def board
  (vec (range 9)))

(defn player
  [p]
  (if p
    "X"
    "O"))

(defn input-play
  [board input p]
  (vec (concat (subvec board 0 input) (player p) (subvec board (inc input)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (loop [p true
         board board]
    (print-board/print-board board)
    (let [play (read-string (read-line))
          board (input-play board play p)]
      (if (check-victory/check board)
        (do (print-board/print-board board)
            (println (str "The winner is: " (player p))))
        (recur (not p) board)))))

