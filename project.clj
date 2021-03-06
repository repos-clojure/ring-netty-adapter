(defproject ring-netty-adapter "0.0.3"
  :repositories [["JBoss" "http://repository.jboss.org/nexus/content/groups/public/"]]
  :description "Ring Netty adapter"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [org.jboss.netty/netty       "3.2.1.Final"]
                 [ring "0.2.5"]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :namespaces [ring.adapter.netty ring.adapter.plumbing])
