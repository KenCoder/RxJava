(ns rx.lang.clojure.observable-tests
  (import rx.Observable))

;; still need to get this wired up in build.gradle to run as tests
; (-> (rx.Observable/toObservable [\"one\" \"two\" \"three\"]) (.take 2) (.subscribe (fn [arg] (println arg))))