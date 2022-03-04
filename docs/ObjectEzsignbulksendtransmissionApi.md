# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendtransmissionGetObjectV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission



## ezsignbulksendtransmissionGetObjectV1

> EzsignbulksendtransmissionGetObjectV1Response ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendtransmissionApi;

ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi();
Integer pkiEzsignbulksendtransmissionID = null; // Integer | 
try {
    EzsignbulksendtransmissionGetObjectV1Response result = apiInstance.ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendtransmissionGetObjectV1Response**](EzsignbulksendtransmissionGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

