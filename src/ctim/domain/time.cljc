(ns ctim.domain.time
  (:require [clj-momo.lib.clj-time.core :as time]))

(def default-expire-date (time/internal-date 2525 1 1))
