(ns flanders.protocols)

(defprotocol TreeNode
  (branch? [node] "Can the node have children?")
  (node-children [node] "Get the children of this node")
  (make-node [node children] "Make a new node with updated children"))
