(defn get-a-and-b-with-sum-and-c [sum c]
 (let [max-b (- sum c)]
  (map #(list %1 %2)
   (reverse (range 1 max-b))
   (range 1 (/ max-b 2)))))

(defn get-triplet-candidates-with-sum-and-c [sum c]
 (map #(cons c %) (get-a-and-b-with-sum-and-c sum c)))

; ((c b a) (c b a) ... (c b a))
(defn get-triplet-candidates-with-sum [sum]
 (mapcat #(get-triplet-candidates-with-sum-and-c sum %) (range 1 (- sum 2))))

(defn pythagorean-triplet? [a b c]
  (== (* c c) (+ (* a a) (* b b))))

(defn get-triplet-with-sum [sum]
 (filter
  #(apply pythagorean-triplet? (reverse %))
  (get-triplet-candidates-with-sum sum)))

(reduce * (flatten (get-triplet-with-sum 1000)))
