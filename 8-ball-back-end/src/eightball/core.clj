(ns eightball.core
  (:gen-class))

(defn serve
  "serves to the provided port and host"
  [host port]
  host)

(defn -main
  "finds meaning of query"
  [& args]
  (cond
    (= (count args) 1)
    (do
      (println (first args)))
    (and (= (count args) 3)
         (= (first args) "--serve"))
    (do
      (println "serving on" (second args) ":" (nth args 2)))); indexing from 0 :)
  (println "Hello, World!"))
