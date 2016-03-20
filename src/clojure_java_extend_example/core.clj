(ns clojure-java-extend-example.core
  (:gen-class
    :name streamy.core.Main
    :main true)
  (:import (streamy.io LineHandlerOutputStream)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (.write (LineHandlerOutputStream.) 5))
