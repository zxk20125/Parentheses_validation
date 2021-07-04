(ns parentheses-validation.core
(:gen-class))
(defn process
  [x]
	(def r(re-matches #"\(.*\)|\{.*\}|\[.*\]" x))
	(if (not(nil? r))
	(do(def res(subs r 1 (-(count r) 1)))(if (= res "")(def ret true)(process res)))
	(def ret false)))
	
	
(defn pre_process[x]
	(def re(clojure.string/replace x #"\(\)|\{\}|\[\]"  ""))
	(if(not(= re "")) (process re)(def ret true)))
  

(defn -main
  [x]
  (pre_process x)
  (println "input:"x "output:"ret))