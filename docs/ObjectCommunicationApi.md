# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetObjectV2**](ObjectCommunicationApi.md#communicationGetObjectV2) | **GET** /2/object/communication/{pkiCommunicationID} | Retrieve an existing Communication



## communicationGetObjectV2

> CommunicationGetObjectV2Response communicationGetObjectV2(pkiCommunicationID)

Retrieve an existing Communication



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommunicationApi;

ObjectCommunicationApi apiInstance = new ObjectCommunicationApi();
Integer pkiCommunicationID = null; // Integer | 
try {
    CommunicationGetObjectV2Response result = apiInstance.communicationGetObjectV2(pkiCommunicationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommunicationApi#communicationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommunicationID** | **Integer**|  | [default to null]

### Return type

[**CommunicationGetObjectV2Response**](CommunicationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

