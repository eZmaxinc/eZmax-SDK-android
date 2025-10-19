# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rejectedoffertopurchaseGetCommunicationCountV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationCountV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount | Retrieve Communication count
[**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list
[**rejectedoffertopurchaseGetCommunicationrecipientsV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationrecipientsV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients | Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient
[**rejectedoffertopurchaseGetCommunicationsendersV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationsendersV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders | Retrieve Rejectedoffertopurchase&#39;s Communicationsender
[**rejectedoffertopurchaseGetListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetListV1) | **GET** /1/object/rejectedoffertopurchase/getList | Retrieve Rejectedoffertopurchase list
[**rejectedoffertopurchaseImportIntoEDMV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseImportIntoEDMV1) | **POST** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/importIntoEDM | Import attachments into the Rejectedoffertopurchase



## rejectedoffertopurchaseGetCommunicationCountV1

> RejectedoffertopurchaseGetCommunicationCountV1Response rejectedoffertopurchaseGetCommunicationCountV1(pkiRejectedoffertopurchaseID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
Integer pkiRejectedoffertopurchaseID = null; // Integer | 
try {
    RejectedoffertopurchaseGetCommunicationCountV1Response result = apiInstance.rejectedoffertopurchaseGetCommunicationCountV1(pkiRejectedoffertopurchaseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **Integer**|  | [default to null]

### Return type

[**RejectedoffertopurchaseGetCommunicationCountV1Response**](RejectedoffertopurchaseGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rejectedoffertopurchaseGetCommunicationListV1

> RejectedoffertopurchaseGetCommunicationListV1Response rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
Integer pkiRejectedoffertopurchaseID = null; // Integer | 
try {
    RejectedoffertopurchaseGetCommunicationListV1Response result = apiInstance.rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **Integer**|  | [default to null]

### Return type

[**RejectedoffertopurchaseGetCommunicationListV1Response**](RejectedoffertopurchaseGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rejectedoffertopurchaseGetCommunicationrecipientsV1

> RejectedoffertopurchaseGetCommunicationrecipientsV1Response rejectedoffertopurchaseGetCommunicationrecipientsV1(pkiRejectedoffertopurchaseID)

Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
Integer pkiRejectedoffertopurchaseID = null; // Integer | 
try {
    RejectedoffertopurchaseGetCommunicationrecipientsV1Response result = apiInstance.rejectedoffertopurchaseGetCommunicationrecipientsV1(pkiRejectedoffertopurchaseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **Integer**|  | [default to null]

### Return type

[**RejectedoffertopurchaseGetCommunicationrecipientsV1Response**](RejectedoffertopurchaseGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rejectedoffertopurchaseGetCommunicationsendersV1

> RejectedoffertopurchaseGetCommunicationsendersV1Response rejectedoffertopurchaseGetCommunicationsendersV1(pkiRejectedoffertopurchaseID)

Retrieve Rejectedoffertopurchase&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
Integer pkiRejectedoffertopurchaseID = null; // Integer | 
try {
    RejectedoffertopurchaseGetCommunicationsendersV1Response result = apiInstance.rejectedoffertopurchaseGetCommunicationsendersV1(pkiRejectedoffertopurchaseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **Integer**|  | [default to null]

### Return type

[**RejectedoffertopurchaseGetCommunicationsendersV1Response**](RejectedoffertopurchaseGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rejectedoffertopurchaseGetListV1

> RejectedoffertopurchaseGetListV1Response rejectedoffertopurchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Rejectedoffertopurchase list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    RejectedoffertopurchaseGetListV1Response result = apiInstance.rejectedoffertopurchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiRejectedoffertopurchaseID_ASC, pkiRejectedoffertopurchaseID_DESC, sRejectedoffertopurchaseNumber_ASC, sRejectedoffertopurchaseNumber_DESC, dtRejectedoffertopurchaseDate_ASC, dtRejectedoffertopurchaseDate_DESC, bRejectedoffertopurchaseIsactive_ASC, bRejectedoffertopurchaseIsactive_DESC, bRejectedoffertopurchaseLinkedtoinscription_ASC, bRejectedoffertopurchaseLinkedtoinscription_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**RejectedoffertopurchaseGetListV1Response**](RejectedoffertopurchaseGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## rejectedoffertopurchaseImportIntoEDMV1

> RejectedoffertopurchaseImportIntoEDMV1Response rejectedoffertopurchaseImportIntoEDMV1(pkiRejectedoffertopurchaseID, rejectedoffertopurchaseImportIntoEDMV1Request)

Import attachments into the Rejectedoffertopurchase



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectRejectedoffertopurchaseApi;

ObjectRejectedoffertopurchaseApi apiInstance = new ObjectRejectedoffertopurchaseApi();
Integer pkiRejectedoffertopurchaseID = null; // Integer | 
RejectedoffertopurchaseImportIntoEDMV1Request rejectedoffertopurchaseImportIntoEDMV1Request = new RejectedoffertopurchaseImportIntoEDMV1Request(); // RejectedoffertopurchaseImportIntoEDMV1Request | 
try {
    RejectedoffertopurchaseImportIntoEDMV1Response result = apiInstance.rejectedoffertopurchaseImportIntoEDMV1(pkiRejectedoffertopurchaseID, rejectedoffertopurchaseImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **Integer**|  | [default to null]
 **rejectedoffertopurchaseImportIntoEDMV1Request** | [**RejectedoffertopurchaseImportIntoEDMV1Request**](RejectedoffertopurchaseImportIntoEDMV1Request.md)|  |

### Return type

[**RejectedoffertopurchaseImportIntoEDMV1Response**](RejectedoffertopurchaseImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

