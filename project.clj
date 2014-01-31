(defproject metosin/ring.swagger-ui "2.0.4"
  :description "Swagger-UI for Ring apps"
  :url "https://github.com/metosin/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.3.1"]
                 [compojure "1.1.6"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler compojure.api.example.handler/app}
  :resource {:resource-paths ["ext/swagger-ui/dist"]
             :target-path "resources/swagger-ui"
             :excludes [#"ext/swagger-ui/dist/index\.html"]}
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-clojars "0.9.1"]
                             [lein-midje "3.1.1"]
                             [lein-resource "0.3.3"]]
                   :dependencies [[ring-mock "0.1.5"]
                                  [javax.servlet/servlet-api "2.5"]
                                  [midje "1.6.0"]
                                  [clj-http "0.7.8" :exclusions [commons-codec]]]}})
