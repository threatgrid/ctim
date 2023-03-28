(ns ctim.examples.sightings
  (:require [ctim.schemas.common :as c]))

(def sighting-maximal
  {:id "http://ex.tld/ctia/sighting/sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :external_ids ["http://ex.tld/ctia/sighting/sighting-123"
                  "http://ex.tld/ctia/sighting/sighting-456"]
   :external_references
   [{:source_name "source"
     :external_id "T1067"
     :url "https://ex.tld/wiki/T1067"
     :hashes ["#section1"]
     :description "Description text"}]
   :timestamp #inst "2016-02-11T00:40:48.212-00:00"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :description "a sighting"
   :short_description "short desc"
   :tlp "amber"
   :source "source"
   :source_uri "http://example.com"
   :sensor "endpoint.sensor"
   :sensor_coordinates {:type "network.firewall"
                        :observables [{:type "ip" :value "192.168.20.1"}
                                      {:type "ngfw_id" :value "21bb0010-4a42-430a-a5dd-27876041f41f"}
                                      {:type "ngfw_name" :value "cssp-stage-61"}
                                      {:type "mac_address" :value "85:28:cb:6a:21:41"}]
                        :os "Cisco Firepower Management Center for VMWare"}
   :targets [{:type "endpoint"
              :os "Windows 95"
              :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                              :end_time #inst "2016-02-11T00:40:48.212-00:00"}
              :observables [{:type "hostname" :value "Demo_Cta"}
                            {:type "amp_computer_guid" :value "68e94bf7-e239-4821-90d6-b7eaa0233443"}
                            {:type "ms_machine_id" :value "19de2b42b3ab0df8c15d117b7760ffa40da59d31"}
                            {:type "trend_micro_id" :value "54309955-1468-4dc8-b1bb-ddb79e1ca2a6"}
                            {:type "s1_agent_id" :value "897194377714833828"}
                            {:type "ip" :value "100.213.110.122"}
                            {:type "ip" :value "136.184.130.98"}
                            {:type "mac_address" :value "85:28:cb:6a:21:41"}]}]
   :data {:columns [{:name "Col1"
                     :type "string"
                     :description "description"
                     :short_description "short_desc"
                     :required true}]
          :rows [["foo"]]
          :row_count 1}
   :confidence "High"
   :type "sighting"
   :schema_version c/ctim-schema-version
   :count 1
   :revision 1
   :internal true
   :severity "Info"
   :resolution "detected"
   :language "language"
   :title "title"
   :context {:process_create_events
             [{:type "ProcessCreateEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 10724
               :process_guid 132465072105597400
               :process_args "-c"
               :process_name "powershell.exe"
               :process_username "SYSTEM"
               :process_hash "006cef6ef6488721895d93e4cef7fa0709c2692d74bde1e22e2a8719b2a86218"
               :process_size 443392
               :process_disposition "clean"
               :parent_creation_time #inst "2022-01-24T18:52:11.000Z"
               :parent_process_id 2236
               :parent_process_guid 132461352663910600
               :parent_process_name "WmiPrvSE.exe"
               :parent_process_args "-c"
               :parent_process_username "SYSTEM"
               :parent_process_hash "385892542cc5a996488262b193061feac4615d66657157c3d4a76251911da334"
               :parent_process_size 425984
               :parent_process_disposition "clean"}]
             :library_load_events
             [{:type "LibraryLoadEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 3152
               :process_name "qa_process_dll_load_action_term.exe"
               :dll_library_name "kernel32.dll"
               :dll_library_path "C:\\Windows\\SysWOW64"
               :process_guid 132465072105597400
               :process_username "qauser"}]
             :file_create_events
             [{:type "FileCreateEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "SYSTEM"
               :file_name "somefile.bat"
               :file_path "C:\\Windows\\System32\\xyz"
               :failed false}]
             :file_delete_events
             [{:type "FileDeleteEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "SYSTEM"
               :file_name "somefile.bat"
               :file_path "C:\\Windows\\System32\\xyz"
               :failed false}]
             :file_modify_events
             [{:type "FileModifyEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "SYSTEM"
               :file_name "somefile.bat"
               :file_path "C:\\Windows\\System32\\xyz"
               :failed false}]
             :file_move_events
             [{:type "FileMoveEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "mv"
               :process_username "user"
               :file_name "bp_file_move_no_action_2"
               :file_path "/tmp/testing/bp_file_testing"
               :old_name "old_testfile_2"
               :new_name "bp_file_move_no_action_2"}]
             :netflow_events
             [{:type "NetflowEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :process_path "/"
               :process_args "-c"
               :process_hash ""
               :process_account_type ""
               :process_account ""
               :parent_process_id 1
               :parent_process_name ""
               :parent_process_path ""
               :parent_process_args ""
               :parent_process_hash ""
               :parent_process_account ""
               :parent_process_account_type ""
               :flow_time #inst "2022-01-24T18:52:11.000Z"
               :byte_count_out 0
               :byte_count_in 0
               :traffic {:protocol 6
                         :source_ip "192.168.1.1"
                         :destination_ip "20.189.173.11"
                         :source_port 56407
                         :destination_port 389
                         :direction "outgoing"
                         :destination_host_name ""
                         :source_subnet ""
                         :destination_subnet ""}}]
             :http_events
             [{:type "HTTPEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :host ""
               :url_port 1
               :method "GET"
               :traffic {:protocol 6
                         :source_ip "192.168.1.1"
                         :destination_ip "20.189.173.11"
                         :source_port 56407
                         :destination_port 389
                         :direction "outgoing"
                         :destination_host_name ""
                         :source_subnet ""
                         :destination_subnet ""}
               :query ""
               :encrypted true}]
             :registry_create_events
             [{:type "RegistryCreateEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :registry_key ""}]
             :registry_set_events
             [{:type "RegistrySetEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :registry_key ""
               :registry_value ""
               :registry_data ""
               :registry_data_length 0}]
             :registry_delete_events
             [{:type "RegistryDeleteEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :registry_key ""
               :registry_value ""}]
             :registry_rename_events
             [{:type "RegistryRenameEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :process_username "user"
               :registry_key ""
               :registry_old_key ""}]}
   :observables [{:type "ipv6" :value "blah"}]
   :relations [{:origin "origin"
                :origin_uri "http://example.com"
                :relation "Used_By"
                :relation_info {:foo "bar"}
                :source {:type "ipv6" :value "foo"}
                :related {:type "ipv6" :value "bar"}}]})

(def sighting-process-create-event
  {:observables [{:value "powershell.exe" :type "process_name"}
                 {:value "WmiPrvSE.exe" :type "process_name"}
                 {:value "006cef6ef6488721895d93e4cef7fa0709c2692d74bde1e22e2a8719b2a86218" :type "sha256"}]
   :relations [{:relation "Parent_of"
                :source {:type "process_name" :value "WmiPrvSE.exe"}
                :related {:type "process_name" :value "powershell.exe"}}
               {:relation "Launched_By"
                :source {:type "sha256" :value "006cef6ef6488721895d93e4cef7fa0709c2692d74bde1e22e2a8719b2a86218"}
                :related {:type "process_name" :value "powershell.exe"}}]
   :type "sighting"
   :source "Secure Endpoint"
   :title "Process Created Event"
   :context {:process_create_events
             [{:type "ProcessCreateEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 10724
               :process_name "powershell.exe"
               :process_guid 132465072105597400
               :process_username "SYSTEM"
               :process_hash "006cef6ef6488721895d93e4cef7fa0709c2692d74bde1e22e2a8719b2a86218"
               :process_size 443392
               :parent_process_id 2236
               :parent_process_guid 132461352663910600
               :parent_process_name "WmiPrvSE.exe"
               :parent_process_username "SYSTEM"
               :parent_process_hash "385892542cc5a996488262b193061feac4615d66657157c3d4a76251911da334"
               :parent_process_size 425984}]}
   :external_ids ["secure-endpoint-sighting-b1233f9fc66cb8b27971ffb76d838d5c3d05cbf20b215f9d5dbbd05c4944954b"]
   :targets [{:type "endpoint"
              :observables [{:value "Demo_Dridex" :type "hostname"}]
              :observed_time {:start_time "2022-01-24T17:00:00.000Z"}}]
   :internal true
   :source_uri "https://console.amp.cisco.com/computers/59c5539d-3278-46c9-b5bb-e3e4e0301ae3/trajectory2?_ts=1643044069265&id=6156209764771561503"
   :id "https://private.intel.amp.cisco.com:443/ctia/sighting/sighting-18c7c759-3de5-4579-8427-101ae074d846"
   :schema_version c/ctim-schema-version
   :count 1
   :severity "Medium"
   :tlp "amber"
   :timestamp "2022-01-24T20:07:12.569Z"
   :confidence "High"
   :observed_time {:start_time "2022-01-24T18:52:11.000Z"}
   :sensor "endpoint"})

(def sighting-file-create-event
  {:schema_version c/ctim-schema-version
   :observables [{:value "powershell.exe" :type "process_name"}
                 {:value "somefile.bat" :type "file_name"}
                 {:value "C:\\Windows\\System32\\xyz" :type "file_path"}]
   :relations [{:relation "Path_of"
                :source {:type "file_path" :value "C:\\Windows\\System32\\xyz"}
                :related {:type "file_name" :value "somefile.bat"}}
               {:relation "Created_By"
                :source {:type "file_name" :value "somefile.bat"}
                :related {:type "process_name" :value "powershell.exe"}}]
   :type "sighting"
   :source "Secure Endpoint"
   :title "File Created Event"
   :context {:file_create_events
             [{:type "FileCreateEvent"
               :time {:start_time #inst "2022-01-24T18:52:11.000Z"
                      :end_time #inst "2022-01-24T18:52:11.000Z"}
               :process_id 5948
               :process_guid 37372
               :process_name "powershell.exe"
               :file_name "somefile.bat"
               :file_path "C:\\Windows\\System32\\xyz"
               :failed false}]}
   :external_ids ["secure-endpoint-sighting-b1233f9fc66cb8b27971ffb76d838d5c3d05cbf20b215f9d5dbbd05c4944954b"]
   :targets [{:type "endpoint"
              :observables [{:value "Demo_Dridex" :type "hostname"}]
              :observed_time {:start_time "2022-01-24T17:00:00.000Z"}}]
   :internal true
   :source_uri "https://console.amp.cisco.com/computers/59c5539d-3278-46c9-b5bb-e3e4e0301ae3/trajectory2?_ts=1643044069265&id=6156209764771561503"
   :id "https://private.intel.amp.cisco.com:443/ctia/sighting/sighting-18c7c759-3de5-4579-8427-101ae074d846"
   :count 1
   :severity "Medium"
   :tlp "amber"
   :timestamp "2022-01-24T20:07:12.569Z"
   :confidence "High"
   :observed_time {:start_time "2022-01-24T18:52:11.000Z"}
   :sensor "endpoint"})

(def sighting-minimal
  {:id "http://ex.tld/ctia/sighting/sighting-eb965192-9f85-4bc8-baa2-0766f9f63db3"
   :observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}
   :confidence "High"
   :type "sighting"
   :schema_version c/ctim-schema-version
   :count 1})

(def new-sighting-maximal
  sighting-maximal)

(def new-sighting-minimal
  {:observed_time {:start_time #inst "2016-02-11T00:40:48.212-00:00"
                   :end_time #inst "2016-02-11T00:40:48.212-00:00"}})
