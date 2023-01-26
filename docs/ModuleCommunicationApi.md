# ModuleCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetCommunicationCountV1**](ModuleCommunicationApi.md#communicationGetCommunicationCountV1) | **GET** /1/module/communication/getCount | Retrieve Communication count



## communicationGetCommunicationCountV1

> CommunicationGetCountV1Response communicationGetCommunicationCountV1(eCommunicationObjecttype, pkiEzsignfolderID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleCommunicationApi;

ModuleCommunicationApi apiInstance = new ModuleCommunicationApi();
String eCommunicationObjecttype = null; // String | The object type for the Communication
Integer pkiEzsignfolderID = null; // Integer | The unique ID of the Ezsignfolder
try {
    CommunicationGetCountV1Response result = apiInstance.communicationGetCommunicationCountV1(eCommunicationObjecttype, pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleCommunicationApi#communicationGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eCommunicationObjecttype** | **String**| The object type for the Communication | [default to null] [enum: Ezsignfolder]
 **pkiEzsignfolderID** | **Integer**| The unique ID of the Ezsignfolder | [optional] [default to null]

### Return type

[**CommunicationGetCountV1Response**](CommunicationGetCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

