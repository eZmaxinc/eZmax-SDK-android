# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignatureCreateObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
[**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureEditObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV2) | **PUT** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureGetObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV3) | **GET** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature



## ezsigntemplatesignatureCreateObjectV2

> EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

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


## ezsigntemplatesignatureDeleteObjectV1

> CommonResponse ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    CommonResponse result = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID);
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

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatesignatureEditObjectV2

> CommonResponse ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request)

Edit an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
EzsigntemplatesignatureEditObjectV2Request ezsigntemplatesignatureEditObjectV2Request = new EzsigntemplatesignatureEditObjectV2Request(); // EzsigntemplatesignatureEditObjectV2Request | 
try {
    CommonResponse result = apiInstance.ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]
 **ezsigntemplatesignatureEditObjectV2Request** | [**EzsigntemplatesignatureEditObjectV2Request**](EzsigntemplatesignatureEditObjectV2Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignatureGetObjectV3

> EzsigntemplatesignatureGetObjectV3Response ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignatureApi;

ObjectEzsigntemplatesignatureApi apiInstance = new ObjectEzsigntemplatesignatureApi();
Integer pkiEzsigntemplatesignatureID = null; // Integer | 
try {
    EzsigntemplatesignatureGetObjectV3Response result = apiInstance.ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignatureGetObjectV3Response**](EzsigntemplatesignatureGetObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

