(defn smallest-factor [n]
 (second
  (filter #(zero? (mod n %))
   (range 1 n))))

(defn factorize [l]
 (let [n (first l)]
  (if-let [s (smallest-factor n)]
   (factorize (cons (/ n s) (cons s (next l))))
   l)))

(factorize '(600851475143))
(reduce * (factorize '(600851475143)))