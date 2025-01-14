# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rejectedoffertopurchaseGetCommunicationCountV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationCountV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount | Retrieve Communication count
[**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list
[**rejectedoffertopurchaseGetCommunicationrecipientsV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationrecipientsV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients | Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient
[**rejectedoffertopurchaseGetCommunicationsendersV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationsendersV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders | Retrieve Rejectedoffertopurchase&#39;s Communicationsender



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

