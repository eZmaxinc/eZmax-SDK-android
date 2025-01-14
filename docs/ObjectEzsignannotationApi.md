# ObjectEzsignannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignannotationCreateObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationCreateObjectV1) | **POST** /1/object/ezsignannotation | Create a new Ezsignannotation
[**ezsignannotationDeleteObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationDeleteObjectV1) | **DELETE** /1/object/ezsignannotation/{pkiEzsignannotationID} | Delete an existing Ezsignannotation
[**ezsignannotationEditObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationEditObjectV1) | **PUT** /1/object/ezsignannotation/{pkiEzsignannotationID} | Edit an existing Ezsignannotation
[**ezsignannotationGetObjectV2**](ObjectEzsignannotationApi.md#ezsignannotationGetObjectV2) | **GET** /2/object/ezsignannotation/{pkiEzsignannotationID} | Retrieve an existing Ezsignannotation



## ezsignannotationCreateObjectV1

> EzsignannotationCreateObjectV1Response ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request)

Create a new Ezsignannotation

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignannotationApi;

ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi();
EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request = new EzsignannotationCreateObjectV1Request(); // EzsignannotationCreateObjectV1Request | 
try {
    EzsignannotationCreateObjectV1Response result = apiInstance.ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignannotationCreateObjectV1Request** | [**EzsignannotationCreateObjectV1Request**](EzsignannotationCreateObjectV1Request.md)|  |

### Return type

[**EzsignannotationCreateObjectV1Response**](EzsignannotationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignannotationDeleteObjectV1

> EzsignannotationDeleteObjectV1Response ezsignannotationDeleteObjectV1(pkiEzsignannotationID)

Delete an existing Ezsignannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignannotationApi;

ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi();
Integer pkiEzsignannotationID = null; // Integer | 
try {
    EzsignannotationDeleteObjectV1Response result = apiInstance.ezsignannotationDeleteObjectV1(pkiEzsignannotationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignannotationID** | **Integer**|  | [default to null]

### Return type

[**EzsignannotationDeleteObjectV1Response**](EzsignannotationDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignannotationEditObjectV1

> EzsignannotationEditObjectV1Response ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request)

Edit an existing Ezsignannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignannotationApi;

ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi();
Integer pkiEzsignannotationID = null; // Integer | 
EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request = new EzsignannotationEditObjectV1Request(); // EzsignannotationEditObjectV1Request | 
try {
    EzsignannotationEditObjectV1Response result = apiInstance.ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignannotationID** | **Integer**|  | [default to null]
 **ezsignannotationEditObjectV1Request** | [**EzsignannotationEditObjectV1Request**](EzsignannotationEditObjectV1Request.md)|  |

### Return type

[**EzsignannotationEditObjectV1Response**](EzsignannotationEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignannotationGetObjectV2

> EzsignannotationGetObjectV2Response ezsignannotationGetObjectV2(pkiEzsignannotationID)

Retrieve an existing Ezsignannotation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignannotationApi;

ObjectEzsignannotationApi apiInstance = new ObjectEzsignannotationApi();
Integer pkiEzsignannotationID = null; // Integer | 
try {
    EzsignannotationGetObjectV2Response result = apiInstance.ezsignannotationGetObjectV2(pkiEzsignannotationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignannotationApi#ezsignannotationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignannotationID** | **Integer**|  | [default to null]

### Return type

[**EzsignannotationGetObjectV2Response**](EzsignannotationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

