(defn divisible? [n l]
 (every? true? (map #(zero? (mod n %)) l))
)

; first item is zero
(second (filter #(divisible? % (range 1 21)) (range)))
