# ObjectInscriptionnotauthenticatedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1) | **POST** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/fillInscriptionnotauthenticatedcondition | Fills the Inscriptionnotauthenticatedcondition in the Inscriptionnotauthenticated
[**inscriptionnotauthenticatedGetCommunicationCountV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationCountV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationCount | Retrieve Communication count
[**inscriptionnotauthenticatedGetCommunicationListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list
[**inscriptionnotauthenticatedGetCommunicationrecipientsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationrecipientsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationrecipients | Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient
[**inscriptionnotauthenticatedGetCommunicationsendersV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationsendersV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders | Retrieve Inscriptionnotauthenticated&#39;s Communicationsender
[**inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getInscriptionnotauthenticatedconditions | Retrieve Inscriptionnotauthenticated conditions
[**inscriptionnotauthenticatedGetListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetListV1) | **GET** /1/object/inscriptionnotauthenticated/getList | Retrieve Inscriptionnotauthenticated list
[**inscriptionnotauthenticatedGetObjectV2**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetObjectV2) | **GET** /2/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID} | Retrieve an existing Inscriptionnotauthenticated
[**inscriptionnotauthenticatedImportIntoEDMV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedImportIntoEDMV1) | **POST** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/importIntoEDM | Import attachments into the Inscriptionnotauthenticated



## inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1

> InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request)

Fills the Inscriptionnotauthenticatedcondition in the Inscriptionnotauthenticated



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request = new InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request(); // InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request | 
try {
    InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response result = apiInstance.inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]
 **inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request** | [**InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request**](InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request.md)|  |

### Return type

[**InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response**](InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## inscriptionnotauthenticatedGetCommunicationCountV1

> InscriptionnotauthenticatedGetCommunicationCountV1Response inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetCommunicationCountV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetCommunicationCountV1Response**](InscriptionnotauthenticatedGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedGetCommunicationListV1

> InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetCommunicationListV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetCommunicationListV1Response**](InscriptionnotauthenticatedGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedGetCommunicationrecipientsV1

> InscriptionnotauthenticatedGetCommunicationrecipientsV1Response inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetCommunicationrecipientsV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetCommunicationrecipientsV1Response**](InscriptionnotauthenticatedGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedGetCommunicationsendersV1

> InscriptionnotauthenticatedGetCommunicationsendersV1Response inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetCommunicationsendersV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetCommunicationsendersV1Response**](InscriptionnotauthenticatedGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1

> InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated conditions



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response result = apiInstance.inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response**](InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedGetListV1

> InscriptionnotauthenticatedGetListV1Response inscriptionnotauthenticatedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscriptionnotauthenticated list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptionStep | TemporaryNotAuthenticated&lt;br&gt;ImportedInscription&lt;br&gt;Inscription&lt;br&gt;ModifiedInscription&lt;br&gt;ContractEnded&lt;br&gt;ExpiredInscription&lt;br&gt;Out-market&lt;br&gt;ImportedNotauthenticated&lt;br&gt;NotAuthenticated&lt;br&gt;ModifiedNotauthenticated&lt;br&gt;Authenticated |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    InscriptionnotauthenticatedGetListV1Response result = apiInstance.inscriptionnotauthenticatedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiInscriptionID_ASC, pkiInscriptionID_DESC, pkiInscriptionnotauthenticatedID_ASC, pkiInscriptionnotauthenticatedID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eInscriptionStep_ASC, eInscriptionStep_DESC, sInscriptionCivicend_ASC, sInscriptionCivicend_DESC, sInscriptionMLS_ASC, sInscriptionMLS_DESC, dInscriptionSaleprice_ASC, dInscriptionSaleprice_DESC, dInscriptionRentprice_ASC, dInscriptionRentprice_DESC, dtInscriptionDate_ASC, dtInscriptionDate_DESC, dtInscriptionExpirationdate_ASC, dtInscriptionExpirationdate_DESC, dtInscriptionNotarydate_ASC, dtInscriptionNotarydate_DESC, bInscriptionInspection_ASC, bInscriptionInspection_DESC, bInscriptionIsactive_ASC, bInscriptionIsactive_DESC, dtInscriptionnotauthenticatedNotaryscheduledate_ASC, dtInscriptionnotauthenticatedNotaryscheduledate_DESC, dtInscriptionnotauthenticatedTransactiondate_ASC, dtInscriptionnotauthenticatedTransactiondate_DESC, dtInscriptionnotauthenticatedTransactiondateReal_ASC, dtInscriptionnotauthenticatedTransactiondateReal_DESC, bInscriptionnotauthenticatedConditional_ASC, bInscriptionnotauthenticatedConditional_DESC, bInscriptionnotauthenticatedIsactive_ASC, bInscriptionnotauthenticatedIsactive_DESC, bInscriptionnotauthenticatedDraft_ASC, bInscriptionnotauthenticatedDraft_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, iInscriptionnotauthenticatedCanceled_ASC, iInscriptionnotauthenticatedCanceled_DESC, sInscriptionnotauthenticatedOffertopurchasenumber_ASC, sInscriptionnotauthenticatedOffertopurchasenumber_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**InscriptionnotauthenticatedGetListV1Response**](InscriptionnotauthenticatedGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## inscriptionnotauthenticatedGetObjectV2

> InscriptionnotauthenticatedGetObjectV2Response inscriptionnotauthenticatedGetObjectV2(pkiInscriptionnotauthenticatedID)

Retrieve an existing Inscriptionnotauthenticated



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | The unique ID of the Inscriptionnotauthenticated
try {
    InscriptionnotauthenticatedGetObjectV2Response result = apiInstance.inscriptionnotauthenticatedGetObjectV2(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**| The unique ID of the Inscriptionnotauthenticated | [default to null]

### Return type

[**InscriptionnotauthenticatedGetObjectV2Response**](InscriptionnotauthenticatedGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionnotauthenticatedImportIntoEDMV1

> InscriptionnotauthenticatedImportIntoEDMV1Response inscriptionnotauthenticatedImportIntoEDMV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedImportIntoEDMV1Request)

Import attachments into the Inscriptionnotauthenticated



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
InscriptionnotauthenticatedImportIntoEDMV1Request inscriptionnotauthenticatedImportIntoEDMV1Request = new InscriptionnotauthenticatedImportIntoEDMV1Request(); // InscriptionnotauthenticatedImportIntoEDMV1Request | 
try {
    InscriptionnotauthenticatedImportIntoEDMV1Response result = apiInstance.inscriptionnotauthenticatedImportIntoEDMV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]
 **inscriptionnotauthenticatedImportIntoEDMV1Request** | [**InscriptionnotauthenticatedImportIntoEDMV1Request**](InscriptionnotauthenticatedImportIntoEDMV1Request.md)|  |

### Return type

[**InscriptionnotauthenticatedImportIntoEDMV1Response**](InscriptionnotauthenticatedImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

