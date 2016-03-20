(ns clojure-java-extend-example.io
  (:gen-class
   :name streamy.io.LineHandlerOutputStream
   :extends java.io.OutputStream
   :main false
   :constructors {[] []}))

(defn -write-int
  ""
  [this b]
  (println b))
