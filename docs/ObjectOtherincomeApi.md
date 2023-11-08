# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list



## otherincomeGetCommunicationListV1

> OtherincomeGetCommunicationListV1Response otherincomeGetCommunicationListV1(pkiOtherincomeID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetCommunicationListV1Response result = apiInstance.otherincomeGetCommunicationListV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetCommunicationListV1Response**](OtherincomeGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

