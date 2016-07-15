(ns ctim.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [ctim.domain.id-test]
            [ctim.events.obj-to-event-test]))

(doo-tests 'ctim.domain.id-test
           'ctim.events.obj-to-event-test)

