

# EzmaxinvoicingGetObjectV1ResponseMPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzmaxinvoicingID** | **Integer** | The unique ID of the Ezmaxinvoicing |  [optional]
**fkiEzmaxinvoicingcontractID** | **Integer** | The unique ID of the Ezmaxinvoicingcontract | 
**fkiEzmaxpricingID** | **Integer** | The unique ID of the Ezmaxpricing | 
**fkiSystemconfigurationtypeID** | **Integer** | The unique ID of the Systemconfigurationtype | 
**sSystemconfigurationtypeDescriptionX** | **String** | The description of the Systemconfigurationtype in the language of the requester | 
**yyyymmEzmaxinvoicing** | **String** | The YYYYMM period of the Ezmaxinvoicing | 
**iEzmaxinvoicingDays** | **Integer** | The number of days invoiced | 
**eEzmaxinvoicingPaymenttype** | [**FieldEEzmaxinvoicingPaymenttype**](FieldEEzmaxinvoicingPaymenttype.md) |  | 
**dEzmaxinvoicingRebatepaymenttype** | **String** | The percentage of rebate depending of the payment type | 
**iEzmaxinvoicingContractlength** | **Integer** | The length of the contract in years | 
**dEzmaxinvoicingRebatecontractlength** | **String** | The percentage of rebate depending of the contract length | 
**bEzmaxinvoicingRebateEzsignallagents** | **Boolean** | Whether the rebate for eZsign is for all agents | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]
**objEzmaxinvoicingcontract** | [**EzmaxinvoicingcontractResponseCompound**](EzmaxinvoicingcontractResponseCompound.md) |  | 
**objEzmaxpricing** | [**CustomEzmaxpricingResponse**](CustomEzmaxpricingResponse.md) |  | 
**aObjEzmaxinvoicingsummaryglobal** | [**List&lt;EzmaxinvoicingsummaryglobalResponseCompound&gt;**](EzmaxinvoicingsummaryglobalResponseCompound.md) |  | 
**aObjEzmaxinvoicingsummaryexternal** | [**List&lt;EzmaxinvoicingsummaryexternalResponseCompound&gt;**](EzmaxinvoicingsummaryexternalResponseCompound.md) |  | 
**aObjEzmaxinvoicingsummaryinternal** | [**List&lt;EzmaxinvoicingsummaryinternalResponseCompound&gt;**](EzmaxinvoicingsummaryinternalResponseCompound.md) |  | 
**aObjEzmaxinvoicingagent** | [**List&lt;EzmaxinvoicingagentResponseCompound&gt;**](EzmaxinvoicingagentResponseCompound.md) |  | 
**aObjEzmaxinvoicinguser** | [**List&lt;EzmaxinvoicinguserResponseCompound&gt;**](EzmaxinvoicinguserResponseCompound.md) |  | 
**aObjEzmaxinvoicingezsignfolder** | [**List&lt;CustomEzmaxinvoicingEzsignfolderResponse&gt;**](CustomEzmaxinvoicingEzsignfolderResponse.md) |  | 
**aObjEzmaxinvoicingezsigndocument** | [**List&lt;CustomEzmaxinvoicingEzsigndocumentResponse&gt;**](CustomEzmaxinvoicingEzsigndocumentResponse.md) |  | 




