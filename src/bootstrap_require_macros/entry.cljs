(ns bootstrap-require-macros.entry
  (:require-macros
    [bootstrap-require-macros.macros-in-clojure :refer [macro-dependency-dialect]]))

(def result (macro-dependency-dialect))