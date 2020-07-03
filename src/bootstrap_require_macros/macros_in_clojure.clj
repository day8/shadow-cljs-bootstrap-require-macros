(ns bootstrap-require-macros.macros-in-clojure
    (:require
      [bootstrap-require-macros.dep-of-macros :as macro-dependency]))

(defmacro macro-dependency-dialect
          []
          macro-dependency/dialect)
