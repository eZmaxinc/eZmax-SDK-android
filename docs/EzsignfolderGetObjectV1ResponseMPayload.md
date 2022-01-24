

# EzsignfolderGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignfolderID** | **Integer** | The unique ID of the Ezsignfolder | 
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester | 
**fkiBillingentityinternalID** | **Integer** | The unique ID of the Billingentityinternal. | 
**sBillingentityinternalDescriptionX** | **String** | The description of the Billingentityinternal in the language of the requester | 
**fkiEzsigntsarequirementID** | **Integer** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| | 
**sEzsigntsarequirementDescriptionX** | **String** | The description of the Ezsigntsarequirement in the language of the requester | 
**sEzsignfolderDescription** | **String** | The description of the Ezsignfolder | 
**tEzsignfolderNote** | **String** | Somes extra notes about the eZsign Folder | 
**eEzsignfolderSendreminderfrequency** | [**FieldEEzsignfolderSendreminderfrequency**](FieldEEzsignfolderSendreminderfrequency.md) |  | 
**dtEzsignfolderDuedate** | **String** | The maximum date and time at which the Ezsignfolder can be signed. | 
**dtEzsignfolderSentdate** | **String** | The date and time at which the Ezsign folder was sent the last time. | 
**dtEzsignfolderScheduledarchive** | **String** | The scheduled date and time at which the Ezsignfolder should be archived. | 
**dtEzsignfolderScheduleddestruction** | **String** | The scheduled date and time at which the Ezsignfolder should be Destroyed. | 
**eEzsignfolderStep** | [**FieldEEzsignfolderStep**](FieldEEzsignfolderStep.md) |  | 
**dtEzsignfolderClose** | **String** | The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely. | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 




