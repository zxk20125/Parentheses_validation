(defproject parentheses_validation "1.0.0-SNAPSHOT"
  :description "Parentheses validation"
  :url "https://github.com/zxk20125/Parentheses_validation"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repl-options {:init-ns parentheses-validation.core}
  :main parentheses-validation.core
  :aot [parentheses-validation.core])
