# ObjectEzsigntemplateglobalannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateglobalannotationGetObjectV2**](ObjectEzsigntemplateglobalannotationApi.md#ezsigntemplateglobalannotationGetObjectV2) | **GET** /2/object/ezsigntemplateglobalannotation/{pkiEzsigntemplateglobalannotationID} | Retrieve an existing Ezsigntemplateglobalannotation



## ezsigntemplateglobalannotationGetObjectV2

> EzsigntemplateglobalannotationGetObjectV2Response ezsigntemplateglobalannotationGetObjectV2(pkiEzsigntemplateglobalannotationID)

Retrieve an existing Ezsigntemplateglobalannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateglobalannotationApi;

ObjectEzsigntemplateglobalannotationApi apiInstance = new ObjectEzsigntemplateglobalannotationApi();
Integer pkiEzsigntemplateglobalannotationID = null; // Integer | The unique ID of the Ezsigntemplateglobalannotation
try {
    EzsigntemplateglobalannotationGetObjectV2Response result = apiInstance.ezsigntemplateglobalannotationGetObjectV2(pkiEzsigntemplateglobalannotationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateglobalannotationApi#ezsigntemplateglobalannotationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateglobalannotationID** | **Integer**| The unique ID of the Ezsigntemplateglobalannotation | [default to null]

### Return type

[**EzsigntemplateglobalannotationGetObjectV2Response**](EzsigntemplateglobalannotationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

