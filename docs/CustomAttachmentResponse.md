

# CustomAttachmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiAttachmentID** | **Integer** | The unique ID of the Attachment. | 
**fkiComputerID** | **Integer** | The unique ID of the Computer |  [optional]
**fkiAdjustmentID** | **Integer** | The unique ID of the Adjustment |  [optional]
**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional]
**fkiBankaccountID** | **Integer** | The unique ID of the Bankaccount |  [optional]
**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional]
**fkiCommissionadvanceID** | **Integer** | The unique ID of the Commissionadvance |  [optional]
**fkiCommunicationID** | **Integer** | The unique ID of the Communication. |  [optional]
**fkiCustomerID** | **Integer** | The unique ID of the Customer. |  [optional]
**fkiCustomertemplateID** | **Integer** | The unique ID of the Customertemplate |  [optional]
**fkiDepositID** | **Integer** | The unique ID of the Deposit |  [optional]
**fkiDeposittransitchequeID** | **Integer** | The unique ID of the Deposittransitcheque |  [optional]
**fkiElectronicfundstransferID** | **Integer** | The unique ID of the Electronicfundstransfer |  [optional]
**fkiEmployeeID** | **Integer** | The unique ID of the Employee. |  [optional]
**fkiExternalbrokerID** | **Integer** | The unique ID of the Externalbroker. |  [optional]
**fkiEzcomadvanceserverID** | **Integer** | The unique ID of the Ezcomadvanceserver |  [optional]
**fkiEzcomcompanyID** | **Integer** | The unique ID of the Ezcomcompany |  [optional]
**fkiEzsigndocumentID** | **Integer** | The unique ID of the Ezsigndocument |  [optional]
**fkiGhacqcontractID** | **Integer** | The unique ID of the Ghacqcontract |  [optional]
**fkiInscriptionID** | **Integer** | The unique ID of the Inscription. |  [optional]
**fkiInscriptiontempID** | **Integer** | The unique ID of the Inscriptiontemp |  [optional]
**fkiInscriptionnotauthenticatedID** | **Integer** | The unique ID of the Inscriptionnotauthenticated. |  [optional]
**fkiInvoiceID** | **Integer** | The unique ID of the Invoice. |  [optional]
**fkiBuyercontractID** | **Integer** | The unique ID of the Buyercontract |  [optional]
**fkiFranchisebrokerID** | **Integer** | The unique ID of the Franchisebroker |  [optional]
**fkiFranchiseagenceID** | **Integer** | The unique ID of the Franchiseagence |  [optional]
**fkiFranchiseofficeID** | **Integer** | The unique ID of the Franchisereoffice |  [optional]
**fkiFranchisefranchiseID** | **Integer** | The unique ID of the Franchisefranchise |  [optional]
**fkiFranchisecomplaintID** | **Integer** | The unique ID of the Franchisecomplaint |  [optional]
**fkiLeadID** | **Integer** | The unique ID of the Lead |  [optional]
**fkiMarketingprogramID** | **Integer** | The unique ID of the Marketingprogram |  [optional]
**fkiMarketingfollowID** | **Integer** | The unique ID of the Marketingfollow |  [optional]
**fkiNotaryID** | **Integer** | The unique ID of the Notary. |  [optional]
**fkiOfficetaxreportID** | **Integer** | The unique ID of the Officetaxreport |  [optional]
**fkiOtherincomeID** | **Integer** | The unique ID of the Otherincome |  [optional]
**fkiPaymentpreparationID** | **Integer** | The unique ID of the Paymentpreparation |  [optional]
**fkiPurchaseID** | **Integer** | The unique ID of the Purchase |  [optional]
**fkiSalaryID** | **Integer** | The unique ID of the Salary |  [optional]
**fkiSupplierID** | **Integer** | The unique ID of the Supplier. |  [optional]
**fkiTranqcontractID** | **Integer** | The unique ID of the Tranqcontract |  [optional]
**fkiTemplateID** | **Integer** | The unique ID of the Template |  [optional]
**fkiInscriptionchecklistID** | **Integer** | The unique ID of the Inscriptionchecklist |  [optional]
**fkiFolderID** | **Integer** | The unique ID of the Folder |  [optional]
**fkiRejectedoffertopurchaseID** | **Integer** | The unique ID of the Rejectedoffertopurchase |  [optional]
**fkiDisclosureID** | **Integer** | The unique ID of the Disclosure |  [optional]
**fkiReconciliationID** | **Integer** | The unique ID of the Reconciliation |  [optional]
**fkiEzsigndocumentIDReference** | **Integer** | The unique ID of the Ezsigndocument |  [optional]
**eAttachmentDocumenttype** | [**FieldEAttachmentDocumenttype**](FieldEAttachmentDocumenttype.md) |  | 
**sAttachmentName** | **String** | The name of the Attachment | 
**eAttachmentPrivacy** | [**FieldEAttachmentPrivacy**](FieldEAttachmentPrivacy.md) |  | 
**fkiUserIDSpecific** | **Integer** | The unique ID of the User |  [optional]
**eAttachmentType** | [**FieldEAttachmentType**](FieldEAttachmentType.md) |  | 
**iAttachmentSize** | **Integer** | The size of the Attachment | 
**iAttachmentEDMmoduleflag** | **Integer** | The edmmoduleflag of the Attachment |  [optional]
**sAttachmentMD5** | **String** | The md5 of the Attachment | 
**bAttachmentDeleted** | **Boolean** | Whether if it&#39;s deleted | 
**bAttachmentValid** | **Boolean** | Whether if it&#39;s valid | 
**eAttachmentVerified** | [**FieldEAttachmentVerified**](FieldEAttachmentVerified.md) |  | 
**tAttachmentRejectioncomment** | **String** | The rejectioncomment of the Attachment |  [optional]
**fkiUserIDOwner** | **Integer** | The unique ID of the User |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]
**objAttachmentProof** | [**AttachmentResponseCompound**](AttachmentResponseCompound.md) |  |  [optional]
**objAttachmentProofdocument** | [**AttachmentResponseCompound**](AttachmentResponseCompound.md) |  |  [optional]
**aObjAttachmentAttachment** | [**List&lt;AttachmentResponseCompound&gt;**](AttachmentResponseCompound.md) |  |  [optional]
**aObjAttachmentVersion** | [**List&lt;AttachmentResponseCompound&gt;**](AttachmentResponseCompound.md) |  |  [optional]




