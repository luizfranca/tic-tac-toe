(ns tic-tac-toe-clojure.check-victory)

(defn check-horizontally
  [board]
  (loop [i 0]
    (let [[p0 p1 p2] (subvec board (* i 3) (+ (* i 3) 3))]
      (if (= p0 p1 p2)
        true
        (if (= (inc i) 3)
          false
          (recur (inc i)))))))

(defn check-vertically
  [[p0 p1 p2 p3 p4 p5 p6 p7 p8]]
  (or (= p0 p3 p6)
      (= p1 p4 p7)
      (= p2 p5 p8)))

(defn check-diagonally
  [[p0 _ p2 _ p4 _ p6 _ p8]]
  (or (= p0 p4 p8)
      (= p2 p4 p6)))

(defn check
  [board]
  (or (check-horizontally board)
      (check-vertically board)
      (check-diagonally board)))
