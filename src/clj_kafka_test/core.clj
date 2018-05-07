(ns clj-kafka-test.core
  (:gen-class)
  (:require [clojure.core.async :refer [go <! >! chan]]
            [kinsky.client :as kc]
            [kinsky.async :as ka]))


(defn -main
  [& args]
  (println "Hello, World!"))
