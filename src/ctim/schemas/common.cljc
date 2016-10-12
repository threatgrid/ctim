(ns ctim.schemas.common
  (:require [ctim.schemas.vocabularies :as v]
            #?(:clj  [flanders.core :as f :refer [def-map-type]]
               :cljs [flanders.core :as f :refer-macros [def-map-type]])
            [clojure.set :refer [map-invert]]
            [schema.core :as s]))

(def ctim-schema-version "0.1.10")

(def Reference
  (f/str :description "A URI leading to an entity"))

(def ID
  (f/str :description
         (str "IDs are strings of the form: type-<128bitUUID>, for example "
              "`judgment-de305d54-75b4-431b-adb2-eb6b9e546014` for a [Judgement]"
              "(judgement.md). This _ID_ type compares to the STIX _id_ field. "
              " The optional STIX _idref_ field is not used.")))

(def URI
  (f/str :description "A URI"))

(def Time
  (f/inst :description (str "Schema definition for all date or timestamp values.  "
                            "Time is stored internally as a java.util.Date object, "
                            "serialized as a string the field should follow the "
                            "rules of the ISO8601 standard.")))

(def Markdown
  (f/str :description "Markdown text"))

(def TLP
  (f/enum #{"red" "amber" "green" "white"}
          :default "green"
          :description (str "TLP Stand for [Traffic Light Protocol]"
                            "(https://www.us-cert.gov/tlp). It indicates precisely "
                            "how this resource is intended to be shared, replicated, "
                            "copied...")))

(def default-tlp
  (:default TLP))

(def base-entity-entries
  (concat
   (f/required-entries
    (f/entry :id ID)
    (f/entry :type f/any-str)
    (f/entry :schema_version (f/eq ctim-schema-version)
             :description "CTIM schema version for this entity"))
   (f/optional-entries
    (f/entry :uri URI)
    (f/entry :revision f/any-int)
    (f/entry :external_ids f/any-string-seq)
    (f/entry :timestamp Time)
    (f/entry :language f/any-str)
    (f/entry :tlp TLP))))


(def base-new-entity-entries
  "Base for New Entities, optionalizes ID and type and schema_version"
  (concat
   base-entity-entries
   (f/optional-entries
    (f/entry :id ID)
    (f/entry :type f/any-str
             :description "A valid entity type identifer")
    (f/entry :schema_version (f/eq ctim-schema-version)
             :description "CTIM schema version for this entity"))))

(def describable-entity-entries
  "These fields for describable entities"
  (f/optional-entries
   (f/entry :title f/any-str)
   (f/entry :description Markdown)
   (f/entry :short_description f/any-str)))

(def sourced-object-entries
  "An object that must have a source"
  [(f/entry :source f/any-str
            :required? true)
   (f/entry :source_uri URI
            :required? false)])

(def sourcable-object-entries
  "An object that MAY have a source"
  (apply f/optional-entries
         sourced-object-entries))

(def specification-types
  #{"Judgement"
    "ThreatBrain"
    "SIOC"
    "Snort"
    "OpenIOC"})

(def SpecificationType
  (f/enum specification-types
          :description (str "Types of Indicator we support Currently only Judgement "
                            "indicators,which contain a list of Judgements "
                            "associated with this indicator.")))

(def-map-type Tool
  (concat
   (f/required-entries
    (f/entry :description f/any-str))
   (f/optional-entries
    (f/entry :type [v/AttackToolType]
             :description "type of the tool leveraged")
    (f/entry :references f/any-str-seq
             :description "references to instances or additional information for this tool")
    (f/entry :vendor f/any-str
             :description "information identifying the vendor organization for this tool")
    (f/entry :service_pack f/any-str
             :description "service pack descriptor for this tool"))
   ;; Not provided: tool_specific_data
   ;; Not provided: tool_hashes
   ;; Not provided: tool_configuration
   ;; Not provided: execution_environment
   ;; Not provided: errors
   ;; Not provided: metadata
   ;; Not provided: compensation_model
   )
  :description "Describes a hardware or software tool used"
  :reference "[ToolInformationType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ToolInformationType/)")

(def scope-wrapper-entries
  (f/optional-entries
   (f/entry :scope v/Scope)))

(def-map-type Contributor
  (f/optional-entries
   (f/entry :role f/any-str
            :description "role played by this contributor")
   (f/entry :name f/any-str
            :description "name of this contributor")
   (f/entry :email f/any-str
            :description "email of this contributor")
   (f/entry :phone f/any-str
            :description "telephone number of this contributor")
   (f/entry :organization f/any-str
            :description "organization name of this contributor")
   (f/entry :date Time
            :description (str "description (bounding) of the timing of this "
                              "contributor's involvement"))
   (f/entry :contribution_location f/any-str
            :description (str "information describing the location at which the "
                              "contributory activity occured")))
  :description "Person who contributed cyber observation data"
  :reference "[ContributorType](http://stixproject.github.io/data-model/1.2/cyboxCommon/ContributorType/)")

(def-map-type RelatedIdentity
  (concat
   (f/required-entries
    (f/entry :identity Reference
             :description (str "specifies the level of confidence in the "
                               "assertion of the relationship between the two "
                               "components")))
   (f/optional-entries
    (f/entry :confidence v/HighMedLow
             :description (str "specifies the level of confidence in the assertion "
                               "of the relationship between the two components"))
    (f/entry :information_source f/any-str
             :description (str "specifies the source of the information about "
                               "the relationship between the two components"))
    (f/entry :relationship f/any-str)))
  :description "Describes a related identity"
  :reference "[RelatedIdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/RelatedIdentityType/)")

(def-map-type Identity
  (f/required-entries
   (f/entry :description f/any-str)
   (f/entry :related_identities [RelatedIdentity]
            :description (str "identifies other entity Identities related to "
                              "this entity Identity")))
  :description "Describes a person or an organization"
  :reference "[IdentityType](http://stixproject.github.io/data-model/1.2/stixCommon/IdentityType/)")

(def-map-type Activity
  (f/required-entries
   (f/entry :date_time Time
            :description "specifies the date and time at which the activity occured")
   (f/entry :description f/any-str
            :description "a description of the activity"))
  :description "What happend, when?"
  :reference "[ActivityType](http://stixproject.github.io/data-model/1.2/stixCommon/ActivityType/)")

(def-map-type Observable
  (f/required-entries
   (f/entry :value f/any-str)
   (f/entry :type v/ObservableTypeIdentifier))
  :description (str "A simple, atomic value which has a consistent identity, "
                    "and is stable enough to be attributed an intent or nature.  "
                    "This is the classic 'indicator' which might appear in a "
                    "data feed of bad IPs, or bad Domains.  These do not exist "
                    "as objects within the CTIA storage model, so you never "
                    "create an observable."))

(def-map-type ValidTime
  (f/optional-entries
   (f/entry :start_time Time
            :description (str "If not present, the valid time position of the "
                              "indicator does not have an upper bound"))
   (f/entry :end_time Time
            :description (str "If not present, the valid time position of the "
                              "indicator does not have an upper bound")))
  :description "Period of time when a cyber observation is valid."
  :reference "[ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)")

(def-map-type ObservedTime
  [(f/entry :start_time Time
            :description (str "Time of the observation.  If the observation was "
                              "made over a period of time, than this ield "
                              "indicated the start of that period"))
   (f/entry :end_time Time
            :required? false
            :description (str "If the observation was made over a period of "
                              "time, than this field indicates the end of that "
                              "period"))]
  :description "Period of time when a cyber observation is valid."
  :reference "[ValidTimeType](http://stixproject.github.io/data-model/1.2/indicator/ValidTimeType/)")

;;Allowed disposition values are:
(def disposition-map
  "Map of disposition numeric values to disposition names, as humans might use them."
  {1 "Clean"
   2 "Malicious"
   3 "Suspicious"
   4 "Common"
   5 "Unknown"})

(def disposition-map-inverted
  (map-invert disposition-map))

(def DispositionNumber
  (f/enum (keys disposition-map)
          :description "Numeric verdict identifiers"))

(def DispositionName
  (f/enum (vals disposition-map)
          :description "String verdict identifiers"))

;; ## Relations

(def observable-relations-map
  {"Allocated" "Specifies that this object allocated the related object."
   "Allocated_By" "Specifies that this object was allocated by the related object."
   "Bound" "Specifies that this object bound the related object."
   "Bound_By" "Specifies that this object was bound by the related object."
   "Characterized_By" "Specifies that the related object describes the properties of this object. This is most applicable in cases where the related object is a non-Artifact Object and this object is an Artifact Object."
   "Characterizes" "Specifies that this object describes the properties of the related object. This is most applicable in cases where the related object is an Artifact Object and this object is a non-Artifact Object."
   "Child_Of" "Specifies that this object is a child of the related object."
   "Closed" "Specifies that this object closed the related object."
   "Closed_By" "Specifies that this object was closed by the related object."
   "Compressed" "Specifies that this object compressed the related object."
   "Compressed_By" "Specifies that this object was compressed by the related object."
   "Compressed_From" "Specifies that this object was compressed from the related object."
   "Compressed_Into" "Specifies that this object was compressed into the related object."
   "Connected_From" "Specifies that this object was connected to from the related object."
   "Connected_To" "Specifies that this object connected to the related object."
   "Contained_Within" "Specifies that this object is contained within the related object."
   "Contains" "Specifies that this object contains the related object."
   "Copied" "Specifies that this object copied the related object."
   "Copied_By" "Specifies that this object was copied by the related object."
   "Copied_From" "Specifies that this object was copied from the related object."
   "Copied_To" "Specifies that this object was copied to the related object."
   "Created_By" "Specifies that this object was created by the related object."
   "Decoded" "Specifies that this object decoded the related object."
   "Decoded_By" "Specifies that this object was decoded by the related object."
   "Decompressed" "Specifies that this object decompressed the related object."
   "Decompressed_By" "Specifies that this object was decompressed by the related object."
   "Decrypted" "Specifies that this object decrypted the related object."
   "Decrypted_By" "Specifies that this object was decrypted by the related object."
   "Deleted" "Specifies that this object deleted the related object."
   "Deleted_By" "Specifies that this object was deleted by the related object."
   "Deleted_From" "Specifies that this object was deleted from the related object."
   "Downloaded" "Specifies that this object downloaded the related object."
   "Downloaded_By" "Specifies that this object was downloaded by the related object."
   "Downloaded_From" "Specifies that this object was downloaded from the related object."
   "Downloaded_To" "Specifies that this object downloaded the related object."
   "Dropped" "Specifies that this object dropped the related object."
   "Dropped_By" "Specifies that this object was dropped by the related object."
   "Encoded" "Specifies that this object encoded the related object."
   "Encoded_By" "Specifies that this object was encoded by the related object."
   "Encrypted" "Specifies that this object encrypted the related object."
   "Encrypted_By" "Specifies that this object was encrypted by the related object."
   "Encrypted_From" "Specifies that this object was encrypted from the related object."
   "Encrypted_To" "Specifies that this object was encrypted to the related object."
   "Extracted_From" "Specifies that this object was extracted from the related object."
   "FQDN_Of" "Specifies that this object is an FQDN of the related object."
   "Freed" "Specifies that this object freed the related object."
   "Freed_By" "Specifies that this object was freed by the related object."
   "Hooked" "Specifies that this object hooked the related object."
   "Hooked_By" "Specifies that this object was hooked by the related object."
   "Initialized_By" "Specifies that this object was initialized by the related object."
   "Initialized_To" "Specifies that this object was initialized to the related object."
   "Injected" "Specifies that this object injected the related object."
   "Injected_As" "Specifies that this object injected as the related object."
   "Injected_By" "Specifies that this object was injected by the related object."
   "Injected_Into" "Specifies that this object injected into the related object."
   "Installed" "Specifies that this object installed the related object."
   "Installed_By" "Specifies that this object was installed by the related object."
   "Joined" "Specifies that this object joined the related object."
   "Joined_By" "Specifies that this object was joined by the related object."
   "Killed" "Specifies that this object killed the related object."
   "Killed_By" "Specifies that this object was killed by the related object."
   "Listened_On" "Specifies that this object listened on the related object."
   "Listened_On_By" "Specifies that this object was listened on by the related object."
   "Loaded_From" "Specifies that this object was loaded from the related object."
   "Loaded_Into" "Specifies that this object loaded into the related object."
   "Locked" "Specifies that this object locked the related object."
   "Locked_By" "Specifies that this object was locked by the related object."
   "Mapped_By" "Specifies that this object was mapped by the related object."
   "Mapped_Into" "Specifies that this object was mapped into the related object."
   "Merged" "Specifies that this object merged the related object."
   "Merged_By" "Specifies that this object was merged by the related object."
   "Modified_Properties_Of" "Specifies that this object modified the properties of the related object."
   "Monitored" "Specifies that this object monitored the related object."
   "Monitored_By" "Specifies that this object was monitored by the related object."
   "Moved" "Specifies that this object moved the related object."
   "Moved_By" "Specifies that this object was moved by the related object."
   "Moved_From" "Specifies that this object was moved from the related object."
   "Moved_To" "Specifies that this object was moved to the related object."
   "Opened" "Specifies that this object opened the related object."
   "Opened_By" "Specifies that this object was opened by the related object."
   "Packed" "Specifies that this object packed the related object."
   "Packed_By" "Specifies that this object was packed by the related object."
   "Packed_From" "Specifies that this object was packed from the related object."
   "Packed_Into" "Specifies that this object was packed into the related object."
   "Parent_Of" "Specifies that this object is a parent of the related object."
   "Paused" "Specifies that this object paused the related object."
   "Paused_By" "Specifies that this object was paused by the related object."
   "Previously_Contained" "Specifies that this object previously contained the related object."
   "Properties_Modified_By" "Specifies that the properties of this object were modified by the related object."
   "Properties_Queried" "Specifies that the object queried properties of the related object."
   "Properties_Queried_By" "Specifies that the properties of this object were queried by the related object."
   "Read_From" "Specifies that this object was read from the related object."
   "Read_From_By" "Specifies that this object was read from by the related object."
   "Received" "Specifies that this object received the related object."
   "Received_By" "Specifies that this object was received by the related object."
   "Received_From" "Specifies that this object was received from the related object."
   "Received_Via_Upload" "Specifies that this object received the related object via upload."
   "Redirects_To" "Specifies that this object redirects to the related object."
   "Related_To" "Specifies that this object is related to the related object."
   "Renamed" "Specifies that this object renamed the related object."
   "Renamed_By" "Specifies that this object was renamed by the related object."
   "Renamed_From" "Specifies that this object was renamed from the related object."
   "Renamed_To" "Specifies that this object was renamed to the related object."
   "Resolved_To" "Specifies that this object was resolved to the related object."
   "Resumed" "Specifies that this object resumed the related object."
   "Resumed_By" "Specifies that this object was resumed by the related object."
   "Root_Domain_Of" "Specifies that this object is the root domain of the related object."
   "Searched_For" "Specifies that this object searched for the related object."
   "Searched_For_By" "Specifies that this object was searched for by the related object."
   "Sent" "Specifies that this object sent the related object."
   "Sent_By" "Specifies that this object was sent by the related object."
   "Sent_To" "Specifies that this object was sent to the related object."
   "Sent_Via_Upload" "Specifies that this object sent the related object via upload."
   "Set_From" "Specifies that this object was set from the related object."
   "Set_To" "Specifies that this object was set to the related object."
   "Sub-domain_Of" "Specifies that this object is a sub-domain of the related object."
   "Supra-domain_Of" "Specifies that this object is a supra-domain of the related object."
   "Suspended" "Specifies that this object suspended the related object."
   "Suspended_By" "Specifies that this object was suspended by the related object."
   "Unhooked" "Specifies that this object unhooked the related object."
   "Unhooked_By" "Specifies that this object was unhooked by the related object."
   "Unlocked" "Specifies that this object unlocked the related object."
   "Unlocked_By" "Specifies that this object was unlocked by the related object."
   "Unpacked" "Specifies that this object unpacked the related object."
   "Unpacked_By" "Specifies that this object was unpacked by the related object."
   "Uploaded" "Specifies that this object uploaded the related object."
   "Uploaded_By" "Specifies that this object was uploaded by the related object."
   "Uploaded_From" "Specifies that this object was uploaded from the related object."
   "Uploaded_To" "Specifies that this object was uploaded to the related object."
   "Used" "Specifies that this object used the related object."
   "Used_By" "Specifies that this object was used by the related object."
   "Values_Enumerated" "Specifies that the object enumerated values of the related object."
   "Values_Enumerated_By" "Specifies that the values of the object were enumerated by the related object."
   "Written_To_By" "Specifies that this object was written to by the related object."
   "Wrote_To" "Specifies that this object wrote to the related object."
   "Created" "Specifies that this object created the related object."})

(def ObservableRelationType
  (f/enum (keys observable-relations-map)))

(def-map-type ObservedRelation
  [(f/entry :origin f/any-str)
   (f/entry :origin_uri URI
            :required? false)
   (f/entry :relation ObservableRelationType)
   (f/entry :relation_info (f/map
                            [(f/entry f/any-keyword f/any)])
            :required? false)
   (f/entry :source Observable)
   (f/entry :related Observable)]
  :description "A relation inside a Sighting.")

(def-map-type ObservableRelation
  (concat
   [(f/entry :id f/any-num)
    (f/entry :timestamp Time)]
   (:entries ObservedRelation)))

(def base-stored-entity-entries
  [(f/entry :owner f/any-str)
   (f/entry :created Time)
   (f/entry :modified Time
            :required? false)])


;; ---- helper fns used by schemas ----

(defn determine-disposition-id
  "Takes a judgement and determines the disposition.
   Defaults to 'Unknown' disposition (in case none is provided).
   Throws an bad-request! if the provided disposition and
   disposition_name do not match."
  [{:keys [disposition disposition_name] :as judgement}]
  (cond
    (every? nil? [disposition disposition_name]) (get disposition-map-inverted "Unknown")
    (nil? disposition) (get disposition-map-inverted disposition_name)
    (nil? disposition_name) disposition
    (= disposition (get disposition-map-inverted disposition_name)) disposition
    :else (throw
           (ex-info "Mismatching :dispostion and dispositon_name for judgement"
                    {:type ::disposition-missing
                     :judgement judgement}))))
