# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignatureCreateObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
[**ezsigntemplatesignatureCreateObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV3) | **POST** /3/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
[**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureEditObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV3) | **PUT** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureGetObjectV4**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV4) | **GET** /4/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature



## ezsigntemplatesignatureCreateObjectV2

> EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.  Major step overhaul.  Endpoints that existed before version 1.3 do not allow you to combine forms and signatures in the same step. The step numbers are different from those indicated by endpoints added since version 1.3. This endpoint is compatible with endpoints that existed before 1.3 but are not compatible with those added since 1.3.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
EzsigntemplatesignatureCreateObjectV2Request ezsigntemplatesignatureCreateObjectV2Request = new EzsigntemplatesignatureCreateObjectV2Request(); // EzsigntemplatesignatureCreateObjectV2Request | 
try {
    EzsigntemplatesignatureCreateObjectV2Response result = apiInstance.ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignatureCreateObjectV2Request** | [**EzsigntemplatesignatureCreateObjectV2Request**](EzsigntemplatesignatureCreateObjectV2Request.md)|  |

### Return type

[**EzsigntemplatesignatureCreateObjectV2Response**](EzsigntemplatesignatureCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignatureCreateObjectV3

> EzsigntemplatesignatureCreateObjectV3Response ezsigntemplatesignatureCreateObjectV3(ezsigntemplatesignatureCreateObjectV3Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
EzsigntemplatesignatureCreateObjectV3Request ezsigntemplatesignatureCreateObjectV3Request = new EzsigntemplatesignatureCreateObjectV3Request(); // EzsigntemplatesignatureCreateObjectV3Request | 
try {
    EzsigntemplatesignatureCreateObjectV3Response result = apiInstance.ezsigntemplatesignatureCreateObjectV3(ezsigntemplatesignatureCreateObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignatureCreateObjectV3Request** | [**EzsigntemplatesignatureCreateObjectV3Request**](EzsigntemplatesignatureCreateObjectV3Request.md)|  |

### Return type

[**EzsigntemplatesignatureCreateObjectV3Response**](EzsigntemplatesignatureCreateObjectV3Response.md)

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


## ezsigntemplatesignatureEditObjectV3

> EzsigntemplatesignatureEditObjectV3Response ezsigntemplatesignatureEditObjectV3(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV3Request)

Edit an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
EzsigntemplatesignatureEditObjectV3Request ezsigntemplatesignatureEditObjectV3Request = new EzsigntemplatesignatureEditObjectV3Request(); // EzsigntemplatesignatureEditObjectV3Request | 
try {
    EzsigntemplatesignatureEditObjectV3Response result = apiInstance.ezsigntemplatesignatureEditObjectV3(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]
 **ezsigntemplatesignatureEditObjectV3Request** | [**EzsigntemplatesignatureEditObjectV3Request**](EzsigntemplatesignatureEditObjectV3Request.md)|  |

### Return type

[**EzsigntemplatesignatureEditObjectV3Response**](EzsigntemplatesignatureEditObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignatureGetObjectV4

> EzsigntemplatesignatureGetObjectV4Response ezsigntemplatesignatureGetObjectV4(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    EzsigntemplatesignatureGetObjectV4Response result = apiInstance.ezsigntemplatesignatureGetObjectV4(pkiEzsigntemplatesignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV4");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignatureGetObjectV4Response**](EzsigntemplatesignatureGetObjectV4Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

