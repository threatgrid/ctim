<a id="map7"></a>
# *ObservedRelation*

*ObservedRelation* A relation inside a Sighting.

| Property | Type | Description | Required? |
| -------- | ---- | ----------- | --------- |
|[origin](#origin-string)|String| |**Required**|
|[related](#related-observableobservablemdmap14)|[*Observable*](./Observable.md#map14)| |**Required**|
|[relation](#relation-observablerelationtypestring)|ObservableRelationTypeString| |**Required**|
|[source](#source-observableobservablemdmap13)|[*Observable*](./Observable.md#map13)| |**Required**|
|[origin_uri](#origin_uri-string)|String| |_Optional_|
|[relation_info](#relation_info-objectobjectmdmap12)|[Object](./Object.md#map12)| |_Optional_|


<a id="origin-string"></a>
### `origin` ∷ String

* This entry is **required**



<a id="origin_uri-string"></a>
### `origin_uri` ∷ String

* This entry is _optional_


  * A URI

<a id="related-observableobservablemdmap14"></a>
### `related` ∷ [*Observable*](./Observable.md#map14)

* This entry is **required**


<a id="relation-observablerelationtypestring"></a>
### `relation` ∷ ObservableRelationTypeString

* This entry is **required**


  * Allowed values:
    * `"Allocated"`
    * `"Allocated_By"`
    * `"Attached_To"`
    * `"Bound"`
    * `"Bound_By"`
    * `"Characterized_By"`
    * `"Characterizes"`
    * `"Child_Of"`
    * `"Closed"`
    * `"Closed_By"`
    * `"Compressed"`
    * `"Compressed_By"`
    * `"Compressed_From"`
    * `"Compressed_Into"`
    * `"Connected_From"`
    * `"Connected_To"`
    * `"Contained_Within"`
    * `"Contains"`
    * `"Copied"`
    * `"Copied_By"`
    * `"Copied_From"`
    * `"Copied_To"`
    * `"Created"`
    * `"Created_By"`
    * `"Decoded"`
    * `"Decoded_By"`
    * `"Decompressed"`
    * `"Decompressed_By"`
    * `"Decrypted"`
    * `"Decrypted_By"`
    * `"Deleted"`
    * `"Deleted_By"`
    * `"Deleted_From"`
    * `"Downloaded"`
    * `"Downloaded_By"`
    * `"Downloaded_From"`
    * `"Downloaded_To"`
    * `"Dropped"`
    * `"Dropped_By"`
    * `"Encoded"`
    * `"Encoded_By"`
    * `"Encrypted"`
    * `"Encrypted_By"`
    * `"Encrypted_From"`
    * `"Encrypted_To"`
    * `"Extracted_From"`
    * `"FQDN_Of"`
    * `"Freed"`
    * `"Freed_By"`
    * `"Hooked"`
    * `"Hooked_By"`
    * `"Initialized_By"`
    * `"Initialized_To"`
    * `"Injected"`
    * `"Injected_As"`
    * `"Injected_By"`
    * `"Injected_Into"`
    * `"Installed"`
    * `"Installed_By"`
    * `"Joined"`
    * `"Joined_By"`
    * `"Killed"`
    * `"Killed_By"`
    * `"Listened_On"`
    * `"Listened_On_By"`
    * `"Loaded_From"`
    * `"Loaded_Into"`
    * `"Locked"`
    * `"Locked_By"`
    * `"Mapped_By"`
    * `"Mapped_Into"`
    * `"Merged"`
    * `"Merged_By"`
    * `"Modified_Properties_Of"`
    * `"Monitored"`
    * `"Monitored_By"`
    * `"Moved"`
    * `"Moved_By"`
    * `"Moved_From"`
    * `"Moved_To"`
    * `"Opened"`
    * `"Opened_By"`
    * `"Packed"`
    * `"Packed_By"`
    * `"Packed_From"`
    * `"Packed_Into"`
    * `"Parent_Of"`
    * `"Paused"`
    * `"Paused_By"`
    * `"Previously_Contained"`
    * `"Properties_Modified_By"`
    * `"Properties_Queried"`
    * `"Properties_Queried_By"`
    * `"Read_From"`
    * `"Read_From_By"`
    * `"Received"`
    * `"Received_By"`
    * `"Received_From"`
    * `"Received_Via_Upload"`
    * `"Redirects_To"`
    * `"Refers_To"`
    * `"Related_To"`
    * `"Renamed"`
    * `"Renamed_By"`
    * `"Renamed_From"`
    * `"Renamed_To"`
    * `"Resolved_To"`
    * `"Resumed"`
    * `"Resumed_By"`
    * `"Root_Domain_Of"`
    * `"Searched_For"`
    * `"Searched_For_By"`
    * `"Sent"`
    * `"Sent_By"`
    * `"Sent_To"`
    * `"Sent_Via_Upload"`
    * `"Set_From"`
    * `"Set_To"`
    * `"Sub-domain_Of"`
    * `"Supra-domain_Of"`
    * `"Suspended"`
    * `"Suspended_By"`
    * `"Unhooked"`
    * `"Unhooked_By"`
    * `"Unlocked"`
    * `"Unlocked_By"`
    * `"Unpacked"`
    * `"Unpacked_By"`
    * `"Uploaded"`
    * `"Uploaded_By"`
    * `"Uploaded_From"`
    * `"Uploaded_To"`
    * `"Used"`
    * `"Used_By"`
    * `"Values_Enumerated"`
    * `"Values_Enumerated_By"`
    * `"Written_To_By"`
    * `"Wrote_To"`

<a id="relation_info-objectobjectmdmap12"></a>
### `relation_info` ∷ [Object](./Object.md#map12)

* This entry is _optional_


<a id="source-observableobservablemdmap13"></a>
### `source` ∷ [*Observable*](./Observable.md#map13)

* This entry is **required**

