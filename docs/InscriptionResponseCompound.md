

# InscriptionResponseCompound

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiInscriptionID** | **Integer** | The unique ID of the Inscription. | 
**fkiDepartmentID** | **Integer** | The unique ID of the Department |  [optional]
**sDepartmentNameX** | **String** | The Name of the Department in the language of the requester |  [optional]
**fkiRealestateboardID** | **Integer** | The unique ID of the Realestateboard | 
**sRealestateboardNameX** | **String** | The name of the Realestateboard |  [optional]
**fkiAddressID** | **Integer** | The unique ID of the Address | 
**objAddress** | [**AddressResponseCompound**](AddressResponseCompound.md) |  |  [optional]
**fkiInscriptionbuildingtypeID** | **Integer** | The unique ID of the Inscriptionbuildingtype | 
**sInscriptionbuildingtypeNameX** | **String** | The name of the Inscriptionbuildingtype in the language of the requester |  [optional]
**fkiInscriptiontypeID** | **Integer** | The unique ID of the Inscriptiontype | 
**sInscriptiontypeNameX** | **String** | The name of the Inscriptiontype in the language of the requester |  [optional]
**fkiInscriptioncategoryID** | **Integer** | The unique ID of the Inscriptioncategory | 
**sInscriptioncategoryNameX** | **String** | The name of the Inscriptioncategory in the language of the requester |  [optional]
**eInscriptionStep** | [**FieldEInscriptionStep**](FieldEInscriptionStep.md) |  | 
**eInscriptionResidenceType** | [**FieldEInscriptionResidenceType**](FieldEInscriptionResidenceType.md) |  | 
**sInscriptionCivicend** | **String** | The address civic end of the Inscription | 
**sInscriptionMLS** | **String** | The mls of the Inscription |  [optional]
**sInscriptionContract** | **String** | The sale contract number | 
**iInscriptionSellerdeclaration** | **Integer** | The seller declaration number of the Inscription | 
**eInscriptionType** | [**FieldEInscriptionType**](FieldEInscriptionType.md) |  | 
**dInscriptionInitialsaleprice** | **String** | The initial sale price of the Inscription | 
**dInscriptionSaleprice** | **String** | The saleprice of the Inscription | 
**dInscriptionRentprice** | **String** | The rent price of the Inscription | 
**eInscriptionRemunerationtype** | [**FieldEInscriptionRemunerationtype**](FieldEInscriptionRemunerationtype.md) |  | 
**eInscriptionRemunerationinscriptorsellertype** | [**FieldEInscriptionRemunerationinscriptorsellertype**](FieldEInscriptionRemunerationinscriptorsellertype.md) |  | 
**eInscriptionRemunerationreferencetype** | [**FieldEInscriptionRemunerationreferencetype**](FieldEInscriptionRemunerationreferencetype.md) |  | 
**eInscriptionRemunerationtotaltype** | [**FieldEInscriptionRemunerationtotaltype**](FieldEInscriptionRemunerationtotaltype.md) |  | 
**dInscriptionRemuneration** | **String** | The remuneration amount of the Inscription | 
**dInscriptionRemunerationinscriptorseller** | **String** | The remuneration amount for the inscriptor or seller of the Inscription | 
**dInscriptionRemunerationreference** | **String** | The remuneration amount for the reference of the Inscription | 
**dInscriptionRemunerationtotal** | **String** | The remuneration amount total of the Inscription | 
**dInscriptionMortgagesold** | **String** | The balande for the mortgage of the Inscription | 
**dtInscriptionDate** | **String** | The date of the Inscription |  [optional]
**dtInscriptionCancellationdate** | **String** | The cancellation date of the Inscription |  [optional]
**dtInscriptionInitialexpirationdate** | **String** | The initial expiration date of the Inscription |  [optional]
**dtInscriptionExpirationdate** | **String** | The expiration date of the Inscription |  [optional]
**dtInscriptionNotarydate** | **String** | The notary date of the Inscription |  [optional]
**dtInscriptionNotaryentereddate** | **String** | The notary entered date of the Inscription |  [optional]
**tInscriptionCadastre** | **String** | The cadastre of the Inscription | 
**bInscriptionReference** | **Boolean** | Whether if it&#39;s an reference | 
**bInscriptionInspection** | **Boolean** | Whether the inscription can be acces by an inspector | 
**bInscriptionIsactive** | **Boolean** | Whether the inscription is active or not | 
**tInscriptionChecklistnote** | **String** | The checklist note of the Inscription | 
**bInscriptionNew** | **Boolean** | Whether if it&#39;s an new | 
**bInscriptionHomeowner** | **Boolean** | Whether if it&#39;s an homeowner | 
**bInscriptionArchived** | **Boolean** | Whether the inscription is archived or not | 
**bInscriptionLitigation** | **Boolean** | Whether if it&#39;s an litigation | 
**bInscriptionRepossession** | **Boolean** | Whether if it&#39;s an repossession | 
**bInscriptionIssolicitation** | **Boolean** | Whether if it&#39;s a solicitation | 
**bInscriptionSalebyowner** | **Boolean** | Whether if it&#39;s a sale by the owner | 
**bInscriptionSoldwithoutlegalwarranty** | **Boolean** | Whether if it&#39;s sold without the legal warranty | 
**iInscriptionConstructionyear** | **Integer** | The construction year of the Inscription | 
**iInscriptionUnit** | **Integer** | The number of unit for the Inscription | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]




