# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list



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

