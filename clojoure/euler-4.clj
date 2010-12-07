(defn palin? [n]
 (= (reverse (str n)) (seq (str n)))
)

(defn find-palins
 ([n]
  (filter palin?
   (map #(* %1 %2)
    (flatten (repeat n (range n)))
    (flatten (map #(repeat n %) (range n)))
   )
  )
 )
)

(last (sort (find-palin 999)))
