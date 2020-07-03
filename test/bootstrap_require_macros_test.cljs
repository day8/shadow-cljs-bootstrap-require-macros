(ns bootstrap-require-macros-test
  (:require
    [cljs.test :refer-macros [is deftest async use-fixtures]]
    [cljs.analyzer :as analyzer]
    [cljs.js :as cljs]
    [cljs.env :as env]
    [cljs.source-map :as source-map]
    [cljs.tagged-literals :as tagged-literals]
    [cljs.tools.reader :as reader]
    [cljs.tools.reader.reader-types :as reader-types]
    [shadow.cljs.bootstrap.browser :as bootstrap]))

(deftest bootstrap-require-macros
    (async done
      (let [compiler-state-atom (cljs/empty-state)]
        (bootstrap/init compiler-state-atom
                        {:path "/bootstrap"
                         :load-on-init #{'require-macros.entry}}
                        (fn []
                          (cljs/eval-str compiler-state-atom
                               "(require-macros '[boostrap-require-macros.macros-in-clojure :refer [macro-dependency-dialect]])
                                (macro-dependency-dialect)"
                               {:eval cljs/js-eval}
                               (fn [_ {:keys [value]}]
                                   (is (= "Clojure" value))
                                   (done))))))))