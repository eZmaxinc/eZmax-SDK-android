

# EzsignfoldertypeResponseV4

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. | 
**objEzsignfoldertypeName** | [**MultilingualEzsignfoldertypeName**](MultilingualEzsignfoldertypeName.md) |  | 
**fkiBrandingID** | **Integer** | The unique ID of the Branding | 
**fkiBillingentityinternalID** | **Integer** | The unique ID of the Billingentityinternal. |  [optional]
**fkiEzsigntsarequirementID** | **Integer** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional]
**fkiFontIDAnnotation** | **Integer** | The unique ID of the Font |  [optional]
**fkiFontIDFormfield** | **Integer** | The unique ID of the Font |  [optional]
**fkiFontIDSignature** | **Integer** | The unique ID of the Font |  [optional]
**fkiPdfalevelIDConvert** | **Integer** | The unique ID of the Pdfalevel |  [optional]
**eEzsignfoldertypeDocumentdependency** | [**FieldEEzsignfoldertypeDocumentdependency**](FieldEEzsignfoldertypeDocumentdependency.md) |  |  [optional]
**sBrandingDescriptionX** | **String** | The Description of the Branding in the language of the requester | 
**sBillingentityinternalDescriptionX** | **String** | The description of the Billingentityinternal in the language of the requester |  [optional]
**sEzsigntsarequirementDescriptionX** | **String** | The description of the Ezsigntsarequirement in the language of the requester |  [optional]
**sEmailAddressSigned** | **String** | The email address. |  [optional]
**sEmailAddressSummary** | **String** | The email address. |  [optional]
**eEzsignfoldertypePdfarequirement** | [**FieldEEzsignfoldertypePdfarequirement**](FieldEEzsignfoldertypePdfarequirement.md) |  |  [optional]
**eEzsignfoldertypePdfanoncompliantaction** | [**FieldEEzsignfoldertypePdfanoncompliantaction**](FieldEEzsignfoldertypePdfanoncompliantaction.md) |  |  [optional]
**eEzsignfoldertypePrivacylevel** | [**FieldEEzsignfoldertypePrivacylevel**](FieldEEzsignfoldertypePrivacylevel.md) |  | 
**iEzsignfoldertypeFontsizeannotation** | **Integer** | Font size for annotations |  [optional]
**iEzsignfoldertypeFontsizeformfield** | **Integer** | Font size for form fields |  [optional]
**iEzsignfoldertypeSendreminderfirstdays** | **Integer** | The number of days before the the first reminder sending |  [optional]
**iEzsignfoldertypeSendreminderotherdays** | **Integer** | The number of days after the first reminder sending |  [optional]
**iEzsignfoldertypeArchivaldays** | **Integer** | The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype | 
**eEzsignfoldertypeDisposal** | [**FieldEEzsignfoldertypeDisposal**](FieldEEzsignfoldertypeDisposal.md) |  | 
**eEzsignfoldertypeCompletion** | [**FieldEEzsignfoldertypeCompletion**](FieldEEzsignfoldertypeCompletion.md) |  | 
**iEzsignfoldertypeDisposaldays** | **Integer** | The number of days after the archival before the disposal of the Ezsignfolder |  [optional]
**iEzsignfoldertypeDeadlinedays** | **Integer** | The number of days to get all Ezsignsignatures | 
**bEzsignfoldertypePrematurelyendautomatically** | **Boolean** | Wheter if document will be ended prematurely after Ezsignfolder expires. |  [optional]
**iEzsignfoldertypePrematurelyendautomaticallydays** | **Integer** | Number of days between Ezsignfolder expiration and automatic prematurely end of Ezsigndocuments. |  [optional]
**bEzsignfoldertypeAutomaticsignature** | **Boolean** | Whether we allow the automatic signature by an User |  [optional]
**bEzsignfoldertypeDelegate** | **Boolean** | Wheter if delegation of signature is allowed to another user or not |  [optional]
**bEzsignfoldertypeDiscussion** | **Boolean** | Wheter if creating a new Discussion is allowed or not |  [optional]
**bEzsignfoldertypeLogrecipientinproof** | **Boolean** | Whether we log recipient of signed document in proof |  [optional]
**bEzsignfoldertypeReassignezsignsigner** | **Boolean** | Wheter if Reassignment of signature is allowed by a signatory to another signatory or not |  [optional]
**bEzsignfoldertypeReassignuser** | **Boolean** | Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not |  [optional]
**bEzsignfoldertypeReassigngroup** | **Boolean** | Wheter if Reassignment of signatures of the groups to which the user belongs is authorized by a user to himself |  [optional]
**bEzsignfoldertypeSendsignedtoezsignsigner** | **Boolean** | Whether we send an email to Ezsignsigner  when document is completed |  [optional]
**bEzsignfoldertypeSendsignedtouser** | **Boolean** | Whether we send an email to User who signed when document is completed |  [optional]
**bEzsignfoldertypeSendattachmentezsignsigner** | **Boolean** | Whether we send the Ezsigndocument in the email to Ezsignsigner |  [optional]
**bEzsignfoldertypeSendproofezsignsigner** | **Boolean** | Whether we send the proof in the email to Ezsignsigner |  [optional]
**bEzsignfoldertypeSendattachmentuser** | **Boolean** | Whether we send the Ezsigndocument in the email to User |  [optional]
**bEzsignfoldertypeSendproofuser** | **Boolean** | Whether we send the proof in the email to User |  [optional]
**bEzsignfoldertypeSendproofemail** | **Boolean** | Whether we send the proof in the email to external recipient |  [optional]
**bEzsignfoldertypeAllowdownloadattachmentezsignsigner** | **Boolean** | Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner |  [optional]
**bEzsignfoldertypeAllowdownloadproofezsignsigner** | **Boolean** | Whether we allow the proof to be downloaded by an Ezsignsigner |  [optional]
**bEzsignfoldertypeSendproofreceivealldocument** | **Boolean** | Whether we send the proof to user and Ezsignsigner who receive all documents. |  [optional]
**bEzsignfoldertypeSendsignedtodocumentowner** | **Boolean** | Whether we send the signed Ezsigndocument to the Ezsigndocument&#39;s owner | 
**bEzsignfoldertypeSendsignedtofolderowner** | **Boolean** | Whether we send the signed Ezsigndocument to the Ezsignfolder&#39;s owner | 
**bEzsignfoldertypeSendsignedtofullgroup** | **Boolean** | Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsignedtolimitedgroup** | **Boolean** | THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsignedtocolleague** | **Boolean** | Whether we send the signed Ezsigndocument to the colleagues | 
**bEzsignfoldertypeSendsummarytodocumentowner** | **Boolean** | Whether we send the summary to the Ezsigndocument&#39;s owner | 
**bEzsignfoldertypeSendsummarytofolderowner** | **Boolean** | Whether we send the summary to the Ezsignfolder&#39;s owner | 
**bEzsignfoldertypeSendsummarytofullgroup** | **Boolean** | Whether we send the summary to the Usergroup that has acces to all Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsummarytolimitedgroup** | **Boolean** | Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsummarytocolleague** | **Boolean** | Whether we send the summary to the colleagues | 
**eEzsignfoldertypeSigneraccess** | [**FieldEEzsignfoldertypeSigneraccess**](FieldEEzsignfoldertypeSigneraccess.md) |  |  [optional]
**bEzsignfoldertypeIsactive** | **Boolean** | Whether the Ezsignfoldertype is active or not | 
**aFkiPdfalevelID** | **List&lt;Integer&gt;** |  |  [optional]
**aObjUserlogintype** | [**List&lt;UserlogintypeResponse&gt;**](UserlogintypeResponse.md) |  | 
**aObjUsergroupAll** | [**List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional]
**aObjUsergroupRestricted** | [**List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional]
**aObjUsergroupTemplate** | [**List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 




