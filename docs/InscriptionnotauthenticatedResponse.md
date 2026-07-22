

# InscriptionnotauthenticatedResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiInscriptionnotauthenticatedID** | **Integer** | The unique ID of the Inscriptionnotauthenticated. | 
**fkiInscriptionID** | **Integer** | The unique ID of the Inscription. | 
**fkiDepartmentID** | **Integer** | The unique ID of the Department |  [optional]
**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester |  [optional]
**fkiFinancialinstitutionID** | **Integer** | The unique ID of the Financialinstitution |  [optional]
**sFinancialinstitutionNameX** | **String** | The name of the Financialinstitution in the language of the requester |  [optional]
**fkiBuyercontractID** | **Integer** | The unique ID of the Buyercontract |  [optional]
**sBuyercontractContract** | **String** | The number of the Buyercontract |  [optional]
**fkiMortgagesupplierID** | **Integer** | The unique ID of the Mortgagesupplier |  [optional]
**sMortgagesupplierNameX** | **String** | The name of the Mortagesupplier in the language of the requester |  [optional]
**fkiTaxassignmentID** | **Integer** | The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| | 
**sTaxassignmentDescriptionX** | **String** | The description of the Taxassignment  in the language of the requester |  [optional]
**dtInscriptionnotauthenticatedTransactiondate** | **String** | The transaction date of the Inscriptionnotauthenticated |  [optional]
**dtInscriptionnotauthenticatedTransactiondateReal** | **String** | The real transactiondate of the Inscriptionnotauthenticated |  [optional]
**dtInscriptionnotauthenticatedDepositdate** | **String** | The deposit date of the Inscriptionnotauthenticated |  [optional]
**eInscriptionnotauthenticatedType** | [**FieldEInscriptionnotauthenticatedType**](FieldEInscriptionnotauthenticatedType.md) |  | 
**dInscriptionnotauthenticatedMortgageloan** | **String** | The amount of the mortgage loan of the Inscriptionnotauthenticated | 
**etInscriptionnotauthenticatedMortgagetype** | [**FieldEtInscriptionnotauthenticatedMortgagetype**](FieldEtInscriptionnotauthenticatedMortgagetype.md) |  | 
**dInscriptionnotauthenticatedTransactionprice** | **String** | The transaction price of the Inscriptionnotauthenticated | 
**eInscriptionnotauthenticatedRemunerationtype** | [**FieldEInscriptionnotauthenticatedRemunerationtype**](FieldEInscriptionnotauthenticatedRemunerationtype.md) |  | 
**dInscriptionnotauthenticatedRemuneration** | **String** | The amount for the remuneration of the Inscriptionnotauthenticated | 
**dInscriptionnotauthenticatedRemunerationsubtotal** | **String** | The subtotal for the remuneration of the Inscriptionnotauthenticated | 
**dInscriptionnotauthenticatedRemunerationtotal** | **String** | The total for the remuneration of the Inscriptionnotauthenticated | 
**dtInscriptionnotauthenticatedCancellationdate** | **String** | The cancellation date of the Inscriptionnotauthenticated |  [optional]
**dtInscriptionnotauthenticatedPossessiondate** | **String** | The possession date of the Inscriptionnotauthenticated |  [optional]
**sInscriptionnotauthenticatedOffertopurchasenumber** | **String** | The offer to purchase number of the Inscriptionnotauthenticated | 
**dtInscriptionnotauthenticatedNotaryscheduledate** | **String** | The notary schedule date of the Inscriptionnotauthenticated |  [optional]
**dtInscriptionnotauthenticatedFinancingscheduledate** | **String** | The financing schedule date of the Inscriptionnotauthenticated |  [optional]
**bInscriptionnotauthenticatedConditional** | **Boolean** | Whether the inscriptionnotauthenticated is conditional | 
**bInscriptionnotauthenticatedMortgageisreferenced** | **Boolean** | Whether if the mortgage is referenced | 
**bInscriptionnotauthenticatedHomeowner** | **Boolean** | Whether if it&#39;s an home owner | 
**tInscriptionnotauthenticatedConditions** | **String** | The conditions of the Inscriptionnotauthenticated | 
**dtInscriptionnotauthenticatedConditiondeadlinedate** | **String** | The condition deadline date of the Inscriptionnotauthenticated |  [optional]
**iInscriptionnotauthenticatedOrder** | **Integer** | The order of the Inscriptionnotauthenticated | 
**bInscriptionnotauthenticatedIsactive** | **Boolean** | Whether the inscriptionnotauthenticated is active or not | 
**eInscriptionnotauthenticatedResidenceType** | [**FieldEInscriptionnotauthenticatedResidenceType**](FieldEInscriptionnotauthenticatedResidenceType.md) |  | 
**tInscriptionnotauthenticatedChecklistnote** | **String** | The checklist note of the Inscriptionnotauthenticated | 
**dInscriptionnotauthenticatedSelleronlyretribution** | **String** | The amount retribution for the seller only of the Inscriptionnotauthenticated | 
**bInscriptionnotauthenticatedDraft** | **Boolean** | Whether the Inscriptionnotauthenticated is a draft or not | 




