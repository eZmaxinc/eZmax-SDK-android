# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**electronicfundstransferGetCommunicationCountV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationCountV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationCount | Retrieve Communication count
[**electronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list
[**electronicfundstransferGetCommunicationrecipientsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationrecipientsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationrecipients | Retrieve Electronicfundstransfer&#39;s Communicationrecipient
[**electronicfundstransferGetCommunicationsendersV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationsendersV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationsenders | Retrieve Electronicfundstransfer&#39;s Communicationsender
[**electronicfundstransferImportIntoEDMV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferImportIntoEDMV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/importIntoEDM | Import attachments into the Electronicfundstransfer



## electronicfundstransferGetCommunicationCountV1

> ElectronicfundstransferGetCommunicationCountV1Response electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
try {
    ElectronicfundstransferGetCommunicationCountV1Response result = apiInstance.electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]

### Return type

[**ElectronicfundstransferGetCommunicationCountV1Response**](ElectronicfundstransferGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## electronicfundstransferGetCommunicationListV1

> ElectronicfundstransferGetCommunicationListV1Response electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
try {
    ElectronicfundstransferGetCommunicationListV1Response result = apiInstance.electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## electronicfundstransferGetCommunicationrecipientsV1

> ElectronicfundstransferGetCommunicationrecipientsV1Response electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
try {
    ElectronicfundstransferGetCommunicationrecipientsV1Response result = apiInstance.electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]

### Return type

[**ElectronicfundstransferGetCommunicationrecipientsV1Response**](ElectronicfundstransferGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## electronicfundstransferGetCommunicationsendersV1

> ElectronicfundstransferGetCommunicationsendersV1Response electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
try {
    ElectronicfundstransferGetCommunicationsendersV1Response result = apiInstance.electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]

### Return type

[**ElectronicfundstransferGetCommunicationsendersV1Response**](ElectronicfundstransferGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## electronicfundstransferImportIntoEDMV1

> ElectronicfundstransferImportIntoEDMV1Response electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request)

Import attachments into the Electronicfundstransfer



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectElectronicfundstransferApi;

ObjectElectronicfundstransferApi apiInstance = new ObjectElectronicfundstransferApi();
Integer pkiElectronicfundstransferID = null; // Integer | 
ElectronicfundstransferImportIntoEDMV1Request electronicfundstransferImportIntoEDMV1Request = new ElectronicfundstransferImportIntoEDMV1Request(); // ElectronicfundstransferImportIntoEDMV1Request | 
try {
    ElectronicfundstransferImportIntoEDMV1Response result = apiInstance.electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectElectronicfundstransferApi#electronicfundstransferImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **Integer**|  | [default to null]
 **electronicfundstransferImportIntoEDMV1Request** | [**ElectronicfundstransferImportIntoEDMV1Request**](ElectronicfundstransferImportIntoEDMV1Request.md)|  |

### Return type

[**ElectronicfundstransferImportIntoEDMV1Response**](ElectronicfundstransferImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

