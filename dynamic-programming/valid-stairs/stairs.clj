(ns stairs
  (:gen-class))

(defn stairs-bot [n]
  (let [arr (make-array Long/TYPE (inc n) (inc n))]
    (dotimes [bricks-left (inc n)]
      (dotimes [current-stair n]
        (let [current-stair (inc current-stair)
              rem (- bricks-left current-stair)
              rem-subdiv (try (aget arr rem (dec current-stair))
                              (catch Exception e 0))
              prev (try (aget arr bricks-left (dec current-stair))
                        (catch Exception e 0))
              current (if (and (pos? rem)
                               (< rem current-stair))
                        1
                        0)]
          (aset arr bricks-left current-stair (+ rem-subdiv prev current)))))
    (aget arr n n )))

(defn stairs-rec [n choice]
  (if (or (<= n 2) (= choice 0))
    0
    (let [remain (- n choice)
          current (if (and (pos? remain)
                           (< remain choice))
                    1
                    0)]
      (+ current
         (stairs-rec n (dec choice))
         (stairs-rec (- n choice) (dec choice))))))

(defn -main
  [nstr rec]
  (let [n (Integer/parseInt nstr)]
    (if (Boolean/parseBoolean rec)
      (do
        (println "Running stairs recursive function")
        (println (stairs-rec n (dec n))))
      (do
        (println "Running stairs bottom up implementation")
        (println (stairs-bot n))))))
