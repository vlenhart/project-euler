(defn divisor? [m n]
 (not (zero? (mod m n))))

(defn sieve [n]
 (loop [in (range 2 n) out nil]
  (let [p (first in)]
   (if (> (* p p) n)
    (concat (reverse out) in)
    (recur
     (filter #(divisor? % p) (next in))
;     (filter #(divisor? % (first in)) (next in)) ; heap overflow
     (cons p out))))))

(time (reduce + (sieve 2000000)))
