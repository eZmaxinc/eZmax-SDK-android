# ObjectInscriptiontempApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptiontempGetCommunicationCountV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationCountV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationCount | Retrieve Communication count
[**inscriptiontempGetCommunicationListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationListV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList | Retrieve Communication list
[**inscriptiontempGetCommunicationrecipientsV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationrecipientsV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationrecipients | Retrieve Inscriptiontemp&#39;s Communicationrecipient
[**inscriptiontempGetCommunicationsendersV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationsendersV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationsenders | Retrieve Inscriptiontemp&#39;s Communicationsender
[**inscriptiontempGetListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetListV1) | **GET** /1/object/inscriptiontemp/getList | Retrieve Inscriptiontemp list
[**inscriptiontempImportIntoEDMV1**](ObjectInscriptiontempApi.md#inscriptiontempImportIntoEDMV1) | **POST** /1/object/inscriptiontemp/{pkiInscriptiontempID}/importIntoEDM | Import attachments into the Inscriptiontemp



## inscriptiontempGetCommunicationCountV1

> InscriptiontempGetCommunicationCountV1Response inscriptiontempGetCommunicationCountV1(pkiInscriptiontempID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
try {
    InscriptiontempGetCommunicationCountV1Response result = apiInstance.inscriptiontempGetCommunicationCountV1(pkiInscriptiontempID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]

### Return type

[**InscriptiontempGetCommunicationCountV1Response**](InscriptiontempGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptiontempGetCommunicationListV1

> InscriptiontempGetCommunicationListV1Response inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
try {
    InscriptiontempGetCommunicationListV1Response result = apiInstance.inscriptiontempGetCommunicationListV1(pkiInscriptiontempID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]

### Return type

[**InscriptiontempGetCommunicationListV1Response**](InscriptiontempGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptiontempGetCommunicationrecipientsV1

> InscriptiontempGetCommunicationrecipientsV1Response inscriptiontempGetCommunicationrecipientsV1(pkiInscriptiontempID)

Retrieve Inscriptiontemp&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
try {
    InscriptiontempGetCommunicationrecipientsV1Response result = apiInstance.inscriptiontempGetCommunicationrecipientsV1(pkiInscriptiontempID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]

### Return type

[**InscriptiontempGetCommunicationrecipientsV1Response**](InscriptiontempGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptiontempGetCommunicationsendersV1

> InscriptiontempGetCommunicationsendersV1Response inscriptiontempGetCommunicationsendersV1(pkiInscriptiontempID)

Retrieve Inscriptiontemp&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
try {
    InscriptiontempGetCommunicationsendersV1Response result = apiInstance.inscriptiontempGetCommunicationsendersV1(pkiInscriptiontempID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]

### Return type

[**InscriptiontempGetCommunicationsendersV1Response**](InscriptiontempGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptiontempGetListV1

> InscriptiontempGetListV1Response inscriptiontempGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscriptiontemp list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptiontempStatus | Imported&lt;br&gt;Processed&lt;br&gt;Modified |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    InscriptiontempGetListV1Response result = apiInstance.inscriptiontempGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiInscriptiontempID_ASC, pkiInscriptiontempID_DESC, eInscriptiontempStatus_ASC, eInscriptiontempStatus_DESC, sInscriptiontempMLS_ASC, sInscriptiontempMLS_DESC, sInscriptiontempDescription_ASC, sInscriptiontempDescription_DESC, bInscriptiontempIsactive_ASC, bInscriptiontempIsactive_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, dtModifiedDate_ASC, dtModifiedDate_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**InscriptiontempGetListV1Response**](InscriptiontempGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## inscriptiontempImportIntoEDMV1

> InscriptiontempImportIntoEDMV1Response inscriptiontempImportIntoEDMV1(pkiInscriptiontempID, inscriptiontempImportIntoEDMV1Request)

Import attachments into the Inscriptiontemp



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
InscriptiontempImportIntoEDMV1Request inscriptiontempImportIntoEDMV1Request = new InscriptiontempImportIntoEDMV1Request(); // InscriptiontempImportIntoEDMV1Request | 
try {
    InscriptiontempImportIntoEDMV1Response result = apiInstance.inscriptiontempImportIntoEDMV1(pkiInscriptiontempID, inscriptiontempImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]
 **inscriptiontempImportIntoEDMV1Request** | [**InscriptiontempImportIntoEDMV1Request**](InscriptiontempImportIntoEDMV1Request.md)|  |

### Return type

[**InscriptiontempImportIntoEDMV1Response**](InscriptiontempImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

