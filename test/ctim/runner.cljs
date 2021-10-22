(ns ctim.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [clojure.test.check.generators]
            [ctim.domain.disposition-test]
            [ctim.domain.id-test]
            [ctim.domain.sorting-test]
            [ctim.generators.id-test]
            [ctim.schemas.data-table-test]
            [ctim.schemas.entities-test]
            [ctim.schemas.schema-version-test]))

(doo-tests 'ctim.domain.disposition-test
           'ctim.domain.id-test
           'ctim.domain.sorting-test
           'ctim.generators.id-test
           'ctim.schemas.data-table-test
           'ctim.schemas.entities-test
           'ctim.schemas.schema-version-test)
