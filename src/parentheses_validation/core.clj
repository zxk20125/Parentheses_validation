(ns parentheses-validation.core
(:gen-class))

(defn process [x]
	(def r(re-matches #"\(.*\)|\{.*\}|\[.*\]" x))
	(if (not(nil? r)) (do 
	(def res(subs r 1 (-(count r) 1)))
	(process res)))
	(if(= res "")(def ret true)
	(def ret false)))
	
(defn pre_process[x]
  (def str(clojure.string/replace x #"\(\)|\{\}|\[\]"  ""))
  (println str)
  (if(not(= str "")) (process str)))
  

(defn -main
  [x]
  (def str x)
  (def ret true)
  (pre_process str)
  (println "input:"x "output:"ret))