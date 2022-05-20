# ObjectEzsignbulksendsignermappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendsignermappingCreateObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingDeleteObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingGetObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV1) | **GET** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping



## ezsignbulksendsignermappingCreateObjectV1

> EzsignbulksendsignermappingCreateObjectV1Response ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request)

Create a new Ezsignbulksendsignermapping

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
EzsignbulksendsignermappingCreateObjectV1Request ezsignbulksendsignermappingCreateObjectV1Request = new EzsignbulksendsignermappingCreateObjectV1Request(); // EzsignbulksendsignermappingCreateObjectV1Request | 
try {
    EzsignbulksendsignermappingCreateObjectV1Response result = apiInstance.ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksendsignermappingCreateObjectV1Request** | [**EzsignbulksendsignermappingCreateObjectV1Request**](EzsignbulksendsignermappingCreateObjectV1Request.md)|  |

### Return type

[**EzsignbulksendsignermappingCreateObjectV1Response**](EzsignbulksendsignermappingCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignbulksendsignermappingDeleteObjectV1

> EzsignbulksendsignermappingDeleteObjectV1Response ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)

Delete an existing Ezsignbulksendsignermapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
Integer pkiEzsignbulksendsignermappingID = null; // Integer | 
try {
    EzsignbulksendsignermappingDeleteObjectV1Response result = apiInstance.ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendsignermappingDeleteObjectV1Response**](EzsignbulksendsignermappingDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignbulksendsignermappingGetObjectV1

> EzsignbulksendsignermappingGetObjectV1Response ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
Integer pkiEzsignbulksendsignermappingID = null; // Integer | 
try {
    EzsignbulksendsignermappingGetObjectV1Response result = apiInstance.ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendsignermappingGetObjectV1Response**](EzsignbulksendsignermappingGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
