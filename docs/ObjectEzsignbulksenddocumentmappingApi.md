# ObjectEzsignbulksenddocumentmappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksenddocumentmappingCreateObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping
[**ezsignbulksenddocumentmappingDeleteObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping
[**ezsignbulksenddocumentmappingGetObjectV2**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV2) | **GET** /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping



## ezsignbulksenddocumentmappingCreateObjectV1

> EzsignbulksenddocumentmappingCreateObjectV1Response ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request)

Create a new Ezsignbulksenddocumentmapping

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksenddocumentmappingApi;

ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi();
EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request = new EzsignbulksenddocumentmappingCreateObjectV1Request(); // EzsignbulksenddocumentmappingCreateObjectV1Request | 
try {
    EzsignbulksenddocumentmappingCreateObjectV1Response result = apiInstance.ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksenddocumentmappingCreateObjectV1Request** | [**EzsignbulksenddocumentmappingCreateObjectV1Request**](EzsignbulksenddocumentmappingCreateObjectV1Request.md)|  |

### Return type

[**EzsignbulksenddocumentmappingCreateObjectV1Response**](EzsignbulksenddocumentmappingCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignbulksenddocumentmappingDeleteObjectV1

> EzsignbulksenddocumentmappingDeleteObjectV1Response ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)

Delete an existing Ezsignbulksenddocumentmapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksenddocumentmappingApi;

ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi();
Integer pkiEzsignbulksenddocumentmappingID = null; // Integer | 
try {
    EzsignbulksenddocumentmappingDeleteObjectV1Response result = apiInstance.ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksenddocumentmappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksenddocumentmappingDeleteObjectV1Response**](EzsignbulksenddocumentmappingDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignbulksenddocumentmappingGetObjectV2

> EzsignbulksenddocumentmappingGetObjectV2Response ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID)

Retrieve an existing Ezsignbulksenddocumentmapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksenddocumentmappingApi;

ObjectEzsignbulksenddocumentmappingApi apiInstance = new ObjectEzsignbulksenddocumentmappingApi();
Integer pkiEzsignbulksenddocumentmappingID = null; // Integer | 
try {
    EzsignbulksenddocumentmappingGetObjectV2Response result = apiInstance.ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksenddocumentmappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksenddocumentmappingGetObjectV2Response**](EzsignbulksenddocumentmappingGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

