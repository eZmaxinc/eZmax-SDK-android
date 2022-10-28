# ObjectVersionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionhistoryGetObjectV2**](ObjectVersionhistoryApi.md#versionhistoryGetObjectV2) | **GET** /2/object/versionhistory/{pkiVersionhistoryID} | Retrieve an existing Versionhistory



## versionhistoryGetObjectV2

> VersionhistoryGetObjectV2Response versionhistoryGetObjectV2(pkiVersionhistoryID)

Retrieve an existing Versionhistory



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVersionhistoryApi;

ObjectVersionhistoryApi apiInstance = new ObjectVersionhistoryApi();
Integer pkiVersionhistoryID = null; // Integer | 
try {
    VersionhistoryGetObjectV2Response result = apiInstance.versionhistoryGetObjectV2(pkiVersionhistoryID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVersionhistoryApi#versionhistoryGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiVersionhistoryID** | **Integer**|  | [default to null]

### Return type

[**VersionhistoryGetObjectV2Response**](VersionhistoryGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

