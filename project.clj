(defproject clojure-java-extend-example "0.1.0-SNAPSHOT"
  :description "An example clojure project where a java-class will extended."
  :url "http://example.com/FIXME"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main streamy.core.Main
  :aot [clojure-java-extend-example.io clojure-java-extend-example.core]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
