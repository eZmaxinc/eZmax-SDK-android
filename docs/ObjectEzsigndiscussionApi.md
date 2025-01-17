# ObjectEzsigndiscussionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndiscussionCreateObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionCreateObjectV1) | **POST** /1/object/ezsigndiscussion | Create a new Ezsigndiscussion
[**ezsigndiscussionDeleteObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionDeleteObjectV1) | **DELETE** /1/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Delete an existing Ezsigndiscussion
[**ezsigndiscussionGetObjectV2**](ObjectEzsigndiscussionApi.md#ezsigndiscussionGetObjectV2) | **GET** /2/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Retrieve an existing Ezsigndiscussion



## ezsigndiscussionCreateObjectV1

> EzsigndiscussionCreateObjectV1Response ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request)

Create a new Ezsigndiscussion

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndiscussionApi;

ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi();
EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request = new EzsigndiscussionCreateObjectV1Request(); // EzsigndiscussionCreateObjectV1Request | 
try {
    EzsigndiscussionCreateObjectV1Response result = apiInstance.ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndiscussionCreateObjectV1Request** | [**EzsigndiscussionCreateObjectV1Request**](EzsigndiscussionCreateObjectV1Request.md)|  |

### Return type

[**EzsigndiscussionCreateObjectV1Response**](EzsigndiscussionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndiscussionDeleteObjectV1

> EzsigndiscussionDeleteObjectV1Response ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID)

Delete an existing Ezsigndiscussion



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndiscussionApi;

ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi();
Integer pkiEzsigndiscussionID = null; // Integer | The unique ID of the Ezsigndiscussion
try {
    EzsigndiscussionDeleteObjectV1Response result = apiInstance.ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndiscussionID** | **Integer**| The unique ID of the Ezsigndiscussion | [default to null]

### Return type

[**EzsigndiscussionDeleteObjectV1Response**](EzsigndiscussionDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndiscussionGetObjectV2

> EzsigndiscussionGetObjectV2Response ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID)

Retrieve an existing Ezsigndiscussion



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndiscussionApi;

ObjectEzsigndiscussionApi apiInstance = new ObjectEzsigndiscussionApi();
Integer pkiEzsigndiscussionID = null; // Integer | The unique ID of the Ezsigndiscussion
try {
    EzsigndiscussionGetObjectV2Response result = apiInstance.ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndiscussionApi#ezsigndiscussionGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndiscussionID** | **Integer**| The unique ID of the Ezsigndiscussion | [default to null]

### Return type

[**EzsigndiscussionGetObjectV2Response**](EzsigndiscussionGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

