# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionGetAttachmentsV1**](ObjectInscriptionApi.md#inscriptionGetAttachmentsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getAttachments | Retrieve Inscription&#39;s Attachments
[**inscriptionGetCommunicationCountV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationCountV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationCount | Retrieve Communication count
[**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list
[**inscriptionGetCommunicationrecipientsV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationrecipientsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients | Retrieve Inscription&#39;s Communicationrecipient
[**inscriptionGetCommunicationsendersV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationsendersV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders | Retrieve Inscription&#39;s Communicationsender
[**inscriptionGetListV1**](ObjectInscriptionApi.md#inscriptionGetListV1) | **GET** /1/object/inscription/getList | Retrieve Inscription list
[**inscriptionImportIntoEDMV1**](ObjectInscriptionApi.md#inscriptionImportIntoEDMV1) | **POST** /1/object/inscription/{pkiInscriptionID}/importIntoEDM | Import attachments into the Inscription
[**inscriptionPrepareFilesTransferV1**](ObjectInscriptionApi.md#inscriptionPrepareFilesTransferV1) | **POST** /1/object/inscription/{pkiInscriptionID}/prepareFilesTransfer | Prepares file transfer into EDM



## inscriptionGetAttachmentsV1

> InscriptionGetAttachmentsV1Response inscriptionGetAttachmentsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Attachments



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetAttachmentsV1Response result = apiInstance.inscriptionGetAttachmentsV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetAttachmentsV1Response**](InscriptionGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionGetCommunicationCountV1

> InscriptionGetCommunicationCountV1Response inscriptionGetCommunicationCountV1(pkiInscriptionID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetCommunicationCountV1Response result = apiInstance.inscriptionGetCommunicationCountV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetCommunicationCountV1Response**](InscriptionGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionGetCommunicationListV1

> InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1(pkiInscriptionID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetCommunicationListV1Response result = apiInstance.inscriptionGetCommunicationListV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetCommunicationListV1Response**](InscriptionGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionGetCommunicationrecipientsV1

> InscriptionGetCommunicationrecipientsV1Response inscriptionGetCommunicationrecipientsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetCommunicationrecipientsV1Response result = apiInstance.inscriptionGetCommunicationrecipientsV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetCommunicationrecipientsV1Response**](InscriptionGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionGetCommunicationsendersV1

> InscriptionGetCommunicationsendersV1Response inscriptionGetCommunicationsendersV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetCommunicationsendersV1Response result = apiInstance.inscriptionGetCommunicationsendersV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetCommunicationsendersV1Response**](InscriptionGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionGetListV1

> InscriptionGetListV1Response inscriptionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscription list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptionStep | TemporaryNotAuthenticated&lt;br&gt;ImportedInscription&lt;br&gt;Inscription&lt;br&gt;ModifiedInscription&lt;br&gt;ContractEnded&lt;br&gt;ExpiredInscription&lt;br&gt;Out-market&lt;br&gt;ImportedNotauthenticated&lt;br&gt;NotAuthenticated&lt;br&gt;ModifiedNotauthenticated&lt;br&gt;Authenticated |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    InscriptionGetListV1Response result = apiInstance.inscriptionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiInscriptionID_ASC, pkiInscriptionID_DESC, pkiInscriptionnotauthenticatedID_ASC, pkiInscriptionnotauthenticatedID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eInscriptionStep_ASC, eInscriptionStep_DESC, sInscriptionCivicend_ASC, sInscriptionCivicend_DESC, sInscriptionMLS_ASC, sInscriptionMLS_DESC, dInscriptionSaleprice_ASC, dInscriptionSaleprice_DESC, dInscriptionRentprice_ASC, dInscriptionRentprice_DESC, dtInscriptionDate_ASC, dtInscriptionDate_DESC, dtInscriptionExpirationdate_ASC, dtInscriptionExpirationdate_DESC, dtInscriptionNotarydate_ASC, dtInscriptionNotarydate_DESC, bInscriptionInspection_ASC, bInscriptionInspection_DESC, bInscriptionIsactive_ASC, bInscriptionIsactive_DESC, dtInscriptionnotauthenticatedNotaryscheduledate_ASC, dtInscriptionnotauthenticatedNotaryscheduledate_DESC, dtInscriptionnotauthenticatedTransactiondate_ASC, dtInscriptionnotauthenticatedTransactiondate_DESC, dtInscriptionnotauthenticatedTransactiondateReal_ASC, dtInscriptionnotauthenticatedTransactiondateReal_DESC, bInscriptionnotauthenticatedConditional_ASC, bInscriptionnotauthenticatedConditional_DESC, bInscriptionnotauthenticatedIsactive_ASC, bInscriptionnotauthenticatedIsactive_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, iInscriptionnotauthenticatedCanceled_ASC, iInscriptionnotauthenticatedCanceled_DESC, bAllowedCopyintoinscriptionedm_ASC, bAllowedCopyintoinscriptionedm_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**InscriptionGetListV1Response**](InscriptionGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## inscriptionImportIntoEDMV1

> InscriptionImportIntoEDMV1Response inscriptionImportIntoEDMV1(pkiInscriptionID, inscriptionImportIntoEDMV1Request)

Import attachments into the Inscription



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
InscriptionImportIntoEDMV1Request inscriptionImportIntoEDMV1Request = new InscriptionImportIntoEDMV1Request(); // InscriptionImportIntoEDMV1Request | 
try {
    InscriptionImportIntoEDMV1Response result = apiInstance.inscriptionImportIntoEDMV1(pkiInscriptionID, inscriptionImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]
 **inscriptionImportIntoEDMV1Request** | [**InscriptionImportIntoEDMV1Request**](InscriptionImportIntoEDMV1Request.md)|  |

### Return type

[**InscriptionImportIntoEDMV1Response**](InscriptionImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## inscriptionPrepareFilesTransferV1

> InscriptionPrepareFilesTransferV1Response inscriptionPrepareFilesTransferV1(pkiInscriptionID, inscriptionPrepareFilesTransferV1Request)

Prepares file transfer into EDM



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
InscriptionPrepareFilesTransferV1Request inscriptionPrepareFilesTransferV1Request = new InscriptionPrepareFilesTransferV1Request(); // InscriptionPrepareFilesTransferV1Request | 
try {
    InscriptionPrepareFilesTransferV1Response result = apiInstance.inscriptionPrepareFilesTransferV1(pkiInscriptionID, inscriptionPrepareFilesTransferV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionPrepareFilesTransferV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]
 **inscriptionPrepareFilesTransferV1Request** | [**InscriptionPrepareFilesTransferV1Request**](InscriptionPrepareFilesTransferV1Request.md)|  |

### Return type

[**InscriptionPrepareFilesTransferV1Response**](InscriptionPrepareFilesTransferV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

