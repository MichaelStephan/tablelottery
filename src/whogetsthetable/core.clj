(ns whogetsthetable.core
  (:gen-class))

; room layout + tables
;|--------------|
;     T4 -  T1  |
;     T5 T3 T2  |
;|              |
;|--------------|

(def tables #{:t1-at-window :t2-at-window :t3-in-the-middle :t4-in-the-front :t5-in-the-front})
(def locals #{:HB :IG :AT :RH})
(def externals #{:MS :GH})

(defn -main []
  (let [locals-cnt (count locals)
        tables-for-locals (take locals-cnt tables)]
        (map vector
         (shuffle locals)
         (shuffle tables-for-locals))))
