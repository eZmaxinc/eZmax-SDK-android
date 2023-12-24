# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionGetAttachmentsV1**](ObjectInscriptionApi.md#inscriptionGetAttachmentsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getAttachments | Retrieve Inscription&#39;s Attachments
[**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list
[**inscriptionGetCommunicationsendersV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationsendersV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders | Retrieve Inscription&#39;s Communicationsender



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

