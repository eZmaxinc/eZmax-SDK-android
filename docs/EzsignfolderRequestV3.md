

# EzsignfolderRequestV3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder |  [optional]
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**fkiTimezoneID** | **Integer** | The unique ID of the Timezone |  [optional]
**fkiEzsigntsarequirementID** | **Integer** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional]
**eEzsignfolderDocumentdependency** | [**FieldEEzsignfolderDocumentdependency**](FieldEEzsignfolderDocumentdependency.md) |  |  [optional]
**sEzsignfolderDescription** | **String** | The description of the Ezsignfolder | 
**tEzsignfolderNote** | **String** | Note about the Ezsignfolder |  [optional]
**tEzsignfolderMessage** | **String** | A custom text message that will be added to the email sent. |  [optional]
**iEzsignfolderSendreminderfirstdays** | **Integer** | The number of days before the the first reminder sending | 
**iEzsignfolderSendreminderotherdays** | **Integer** | The number of days after the first reminder sending | 
**sEzsignfolderExternalid** | **String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional]




