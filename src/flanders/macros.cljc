(ns flanders.macros
  (:require [flanders.protocols
             :refer [branch? node-children make-node TreeNode]]
            [schema.core :as s]))

(defmacro defleaf [name argsv & sexprs]
  `(s/defrecord ~name ~argsv
     TreeNode
     (branch? [_#] false)
     (node-children [_#] nil)
     (make-node [this# _#] this#)
     ~@sexprs))
