# ModuleCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetCommunicationCountV1**](ModuleCommunicationApi.md#communicationGetCommunicationCountV1) | **GET** /1/module/communication/getCommunicationCount | Get the number of communication
[**communicationGetCommunicationListV1**](ModuleCommunicationApi.md#communicationGetCommunicationListV1) | **GET** /1/module/communication/getCommunicationList | Retrieve communication list



## communicationGetCommunicationCountV1

> CommunicationGetCountV1Response communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID)

Get the number of communication

Get the number of communication in specified module

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleCommunicationApi;

ModuleCommunicationApi apiInstance = new ModuleCommunicationApi();
String eCommunicationModule = null; // String | Specify the requested module
Integer pkiEzsignfolderID = null; // Integer | The unique ID of the Ezsignfolder
try {
    CommunicationGetCountV1Response result = apiInstance.communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleCommunicationApi#communicationGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eCommunicationModule** | **String**| Specify the requested module | [default to null] [enum: Ezsignfolder]
 **pkiEzsignfolderID** | **Integer**| The unique ID of the Ezsignfolder | [optional] [default to null]

### Return type

[**CommunicationGetCountV1Response**](CommunicationGetCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## communicationGetCommunicationListV1

> CommunicationGetListV1Response communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID)

Retrieve communication list

Retrieve communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleCommunicationApi;

ModuleCommunicationApi apiInstance = new ModuleCommunicationApi();
String eCommunicationModule = null; // String | Specify the requested module
Integer pkiEzsignfolderID = null; // Integer | The unique ID of the Ezsignfolder
try {
    CommunicationGetListV1Response result = apiInstance.communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleCommunicationApi#communicationGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eCommunicationModule** | **String**| Specify the requested module | [default to null] [enum: Ezsignfolder]
 **pkiEzsignfolderID** | **Integer**| The unique ID of the Ezsignfolder | [optional] [default to null]

### Return type

[**CommunicationGetListV1Response**](CommunicationGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

