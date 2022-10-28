# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignatureCreateObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV1) | **POST** /1/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
[**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureEditObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV1) | **PUT** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureGetObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV1) | **GET** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureGetObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV2) | **GET** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature



## ezsigntemplatesignatureCreateObjectV1

> EzsigntemplatesignatureCreateObjectV1Response ezsigntemplatesignatureCreateObjectV1(ezsigntemplatesignatureCreateObjectV1Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
EzsigntemplatesignatureCreateObjectV1Request ezsigntemplatesignatureCreateObjectV1Request = new EzsigntemplatesignatureCreateObjectV1Request(); // EzsigntemplatesignatureCreateObjectV1Request | 
try {
    EzsigntemplatesignatureCreateObjectV1Response result = apiInstance.ezsigntemplatesignatureCreateObjectV1(ezsigntemplatesignatureCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignatureCreateObjectV1Request** | [**EzsigntemplatesignatureCreateObjectV1Request**](EzsigntemplatesignatureCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatesignatureCreateObjectV1Response**](EzsigntemplatesignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignatureDeleteObjectV1

> EzsigntemplatesignatureDeleteObjectV1Response ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    EzsigntemplatesignatureDeleteObjectV1Response result = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignatureDeleteObjectV1Response**](EzsigntemplatesignatureDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatesignatureEditObjectV1

> EzsigntemplatesignatureEditObjectV1Response ezsigntemplatesignatureEditObjectV1(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV1Request)

Edit an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
EzsigntemplatesignatureEditObjectV1Request ezsigntemplatesignatureEditObjectV1Request = new EzsigntemplatesignatureEditObjectV1Request(); // EzsigntemplatesignatureEditObjectV1Request | 
try {
    EzsigntemplatesignatureEditObjectV1Response result = apiInstance.ezsigntemplatesignatureEditObjectV1(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]
 **ezsigntemplatesignatureEditObjectV1Request** | [**EzsigntemplatesignatureEditObjectV1Request**](EzsigntemplatesignatureEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatesignatureEditObjectV1Response**](EzsigntemplatesignatureEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignatureGetObjectV1

> EzsigntemplatesignatureGetObjectV1Response ezsigntemplatesignatureGetObjectV1(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    EzsigntemplatesignatureGetObjectV1Response result = apiInstance.ezsigntemplatesignatureGetObjectV1(pkiEzsigntemplatesignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignatureGetObjectV1Response**](EzsigntemplatesignatureGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatesignatureGetObjectV2

> EzsigntemplatesignatureGetObjectV2Response ezsigntemplatesignatureGetObjectV2(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    EzsigntemplatesignatureGetObjectV2Response result = apiInstance.ezsigntemplatesignatureGetObjectV2(pkiEzsigntemplatesignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignatureGetObjectV2Response**](EzsigntemplatesignatureGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

