# ObjectEzsigntemplateannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateannotationCreateObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationCreateObjectV1) | **POST** /1/object/ezsigntemplateannotation | Create a new Ezsigntemplateannotation
[**ezsigntemplateannotationDeleteObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Delete an existing Ezsigntemplateannotation
[**ezsigntemplateannotationEditObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationEditObjectV1) | **PUT** /1/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Edit an existing Ezsigntemplateannotation
[**ezsigntemplateannotationGetObjectV2**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationGetObjectV2) | **GET** /2/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Retrieve an existing Ezsigntemplateannotation



## ezsigntemplateannotationCreateObjectV1

> EzsigntemplateannotationCreateObjectV1Response ezsigntemplateannotationCreateObjectV1(ezsigntemplateannotationCreateObjectV1Request)

Create a new Ezsigntemplateannotation

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateannotationApi;

ObjectEzsigntemplateannotationApi apiInstance = new ObjectEzsigntemplateannotationApi();
EzsigntemplateannotationCreateObjectV1Request ezsigntemplateannotationCreateObjectV1Request = new EzsigntemplateannotationCreateObjectV1Request(); // EzsigntemplateannotationCreateObjectV1Request | 
try {
    EzsigntemplateannotationCreateObjectV1Response result = apiInstance.ezsigntemplateannotationCreateObjectV1(ezsigntemplateannotationCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateannotationCreateObjectV1Request** | [**EzsigntemplateannotationCreateObjectV1Request**](EzsigntemplateannotationCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplateannotationCreateObjectV1Response**](EzsigntemplateannotationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateannotationDeleteObjectV1

> EzsigntemplateannotationDeleteObjectV1Response ezsigntemplateannotationDeleteObjectV1(pkiEzsigntemplateannotationID)

Delete an existing Ezsigntemplateannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateannotationApi;

ObjectEzsigntemplateannotationApi apiInstance = new ObjectEzsigntemplateannotationApi();
Integer pkiEzsigntemplateannotationID = null; // Integer | The unique ID of the Ezsigntemplateannotation
try {
    EzsigntemplateannotationDeleteObjectV1Response result = apiInstance.ezsigntemplateannotationDeleteObjectV1(pkiEzsigntemplateannotationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateannotationID** | **Integer**| The unique ID of the Ezsigntemplateannotation | [default to null]

### Return type

[**EzsigntemplateannotationDeleteObjectV1Response**](EzsigntemplateannotationDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateannotationEditObjectV1

> EzsigntemplateannotationEditObjectV1Response ezsigntemplateannotationEditObjectV1(pkiEzsigntemplateannotationID, ezsigntemplateannotationEditObjectV1Request)

Edit an existing Ezsigntemplateannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateannotationApi;

ObjectEzsigntemplateannotationApi apiInstance = new ObjectEzsigntemplateannotationApi();
Integer pkiEzsigntemplateannotationID = null; // Integer | The unique ID of the Ezsigntemplateannotation
EzsigntemplateannotationEditObjectV1Request ezsigntemplateannotationEditObjectV1Request = new EzsigntemplateannotationEditObjectV1Request(); // EzsigntemplateannotationEditObjectV1Request | 
try {
    EzsigntemplateannotationEditObjectV1Response result = apiInstance.ezsigntemplateannotationEditObjectV1(pkiEzsigntemplateannotationID, ezsigntemplateannotationEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateannotationID** | **Integer**| The unique ID of the Ezsigntemplateannotation | [default to null]
 **ezsigntemplateannotationEditObjectV1Request** | [**EzsigntemplateannotationEditObjectV1Request**](EzsigntemplateannotationEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplateannotationEditObjectV1Response**](EzsigntemplateannotationEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateannotationGetObjectV2

> EzsigntemplateannotationGetObjectV2Response ezsigntemplateannotationGetObjectV2(pkiEzsigntemplateannotationID)

Retrieve an existing Ezsigntemplateannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateannotationApi;

ObjectEzsigntemplateannotationApi apiInstance = new ObjectEzsigntemplateannotationApi();
Integer pkiEzsigntemplateannotationID = null; // Integer | The unique ID of the Ezsigntemplateannotation
try {
    EzsigntemplateannotationGetObjectV2Response result = apiInstance.ezsigntemplateannotationGetObjectV2(pkiEzsigntemplateannotationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateannotationID** | **Integer**| The unique ID of the Ezsigntemplateannotation | [default to null]

### Return type

[**EzsigntemplateannotationGetObjectV2Response**](EzsigntemplateannotationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

