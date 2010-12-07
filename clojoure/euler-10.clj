(defn prime? [n]
 (if (== n 1)
  false
  (every? false?
   (map #(zero? (mod n %))
    (range 2 (inc (int (Math/sqrt n)))))
  )
 )
)

(reduce + 
 (take-while #(< % 2000000)
  (filter prime? (range))))
