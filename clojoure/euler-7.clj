(defn prime? [n]
 (if (== n 1)
  false
  (every? false?
   (map #(zero? (mod n %)) (range 2 (inc (int (Math/sqrt n)))))
  )
 )
)

(nth (filter prime? (range)) 10001)

