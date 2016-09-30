(ns ctim.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [ctim.domain.id-test]
            [ctim.events.obj-to-event-test]
            [ctim.schemas.coa-test]
            [ctim.schemas.judgement-test]))

(doo-tests 'ctim.domain.id-test
           'ctim.events.obj-to-event-test
           'ctim.schemas.coa-test
           'ctim.schemas.judgement-test)
