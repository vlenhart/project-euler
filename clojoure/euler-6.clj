(defn sum-of-squares [n]
 (reduce + (map #(* % %) (range 1 (inc n))))
)

(defn square-of-sums [n]
 (let [sum (reduce + (range 1 (inc n)))]
  (* sum sum)
 )
)

(- (square-of-sums 100) (sum-of-squares 100))
