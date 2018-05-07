(defproject clj-kafka-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [spootnik/kinsky "0.1.22"]]

  :main ^:skip-aot clj-kafka-test.core

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
