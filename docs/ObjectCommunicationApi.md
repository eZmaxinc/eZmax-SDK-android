# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationSendV1**](ObjectCommunicationApi.md#communicationSendV1) | **POST** /1/object/communication/send | Send a new Communication



## communicationSendV1

> CommunicationSendV1Response communicationSendV1(communicationSendV1Request)

Send a new Communication

The endpoint allows to send one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommunicationApi;

ObjectCommunicationApi apiInstance = new ObjectCommunicationApi();
CommunicationSendV1Request communicationSendV1Request = new CommunicationSendV1Request(); // CommunicationSendV1Request | 
try {
    CommunicationSendV1Response result = apiInstance.communicationSendV1(communicationSendV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommunicationApi#communicationSendV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **communicationSendV1Request** | [**CommunicationSendV1Request**](CommunicationSendV1Request.md)|  |

### Return type

[**CommunicationSendV1Response**](CommunicationSendV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

