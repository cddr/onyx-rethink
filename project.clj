(defproject onyx-rethink "0.7.0-SNAPSHOT"
  :description "Onyx plugin for RethinkDB"
  :url "https://github.com/cddr/onyx-rethinkdb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.onyxplatform/onyx "0.7.4-SNAPSHOT"]
                 [rethinkdb "0.10.1"]]
  :profiles {:dev {:dependencies []
                   :plugins []}})
