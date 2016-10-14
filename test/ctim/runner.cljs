(ns ctim.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [ctim.domain.id-test]
            [ctim.events.obj-to-event-test]
            [ctim.schemas.actor-test]
            [ctim.schemas.campaign-test]
            [ctim.schemas.coa-test]
            [ctim.schemas.data-table-test]
            [ctim.schemas.exploit-target-test]
            [ctim.schemas.feedback-test]
            [ctim.schemas.incident-test]
            [ctim.schemas.indicator-test]
            [ctim.schemas.judgement-test]
            [ctim.schemas.relationship]
            [ctim.schemas.sighting-test]
            [ctim.schemas.ttp-test]
            [ctim.schemas.verdict-test]))

(doo-tests 'ctim.domain.id-test
           'ctim.events.obj-to-event-test
           'ctim.schemas.actor-test
           'ctim.schemas.campaign-test
           'ctim.schemas.coa-test
           'ctim.schemas.data-table-test
           'ctim.schemas.feedback-test
           'ctim.schemas.exploit-target-test
           'ctim.schemas.incident-test
           'ctim.schemas.indicator-test
           'ctim.schemas.judgement-test
           'ctim.schemas.relationship
           'ctim.schemas.sighting-test
           'ctim.schemas.ttp-test
           'ctim.schemas.verdict-test)

