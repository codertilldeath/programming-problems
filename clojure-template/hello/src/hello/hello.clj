(ns hello.hello
  (:require [math :as m]
            [hello.math2 :as m2]))

(defn -main []
  (println "Hello world" (m/random) (m2/random2)))
