# ObjectEzsigntemplatepackagesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagesignerCreateObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerDeleteObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerEditObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerGetObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerGetObjectV2**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV2) | **GET** /2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner



## ezsigntemplatepackagesignerCreateObjectV1

> EzsigntemplatepackagesignerCreateObjectV1Response ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerCreateObjectV1Request)

Create a new Ezsigntemplatepackagesigner

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignerApi;

ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi();
EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request = new EzsigntemplatepackagesignerCreateObjectV1Request(); // EzsigntemplatepackagesignerCreateObjectV1Request | 
try {
    EzsigntemplatepackagesignerCreateObjectV1Response result = apiInstance.ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagesignerCreateObjectV1Request** | [**EzsigntemplatepackagesignerCreateObjectV1Request**](EzsigntemplatepackagesignerCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepackagesignerCreateObjectV1Response**](EzsigntemplatepackagesignerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackagesignerDeleteObjectV1

> EzsigntemplatepackagesignerDeleteObjectV1Response ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID)

Delete an existing Ezsigntemplatepackagesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignerApi;

ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi();
Integer pkiEzsigntemplatepackagesignerID = null; // Integer | 
try {
    EzsigntemplatepackagesignerDeleteObjectV1Response result = apiInstance.ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignerDeleteObjectV1Response**](EzsigntemplatepackagesignerDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagesignerEditObjectV1

> EzsigntemplatepackagesignerEditObjectV1Response ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request)

Edit an existing Ezsigntemplatepackagesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignerApi;

ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi();
Integer pkiEzsigntemplatepackagesignerID = null; // Integer | 
EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request = new EzsigntemplatepackagesignerEditObjectV1Request(); // EzsigntemplatepackagesignerEditObjectV1Request | 
try {
    EzsigntemplatepackagesignerEditObjectV1Response result = apiInstance.ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **Integer**|  | [default to null]
 **ezsigntemplatepackagesignerEditObjectV1Request** | [**EzsigntemplatepackagesignerEditObjectV1Request**](EzsigntemplatepackagesignerEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepackagesignerEditObjectV1Response**](EzsigntemplatepackagesignerEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackagesignerGetObjectV1

> EzsigntemplatepackagesignerGetObjectV1Response ezsigntemplatepackagesignerGetObjectV1(pkiEzsigntemplatepackagesignerID)

Retrieve an existing Ezsigntemplatepackagesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignerApi;

ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi();
Integer pkiEzsigntemplatepackagesignerID = null; // Integer | 
try {
    EzsigntemplatepackagesignerGetObjectV1Response result = apiInstance.ezsigntemplatepackagesignerGetObjectV1(pkiEzsigntemplatepackagesignerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignerGetObjectV1Response**](EzsigntemplatepackagesignerGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagesignerGetObjectV2

> EzsigntemplatepackagesignerGetObjectV2Response ezsigntemplatepackagesignerGetObjectV2(pkiEzsigntemplatepackagesignerID)

Retrieve an existing Ezsigntemplatepackagesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignerApi;

ObjectEzsigntemplatepackagesignerApi apiInstance = new ObjectEzsigntemplatepackagesignerApi();
Integer pkiEzsigntemplatepackagesignerID = null; // Integer | 
try {
    EzsigntemplatepackagesignerGetObjectV2Response result = apiInstance.ezsigntemplatepackagesignerGetObjectV2(pkiEzsigntemplatepackagesignerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignerGetObjectV2Response**](EzsigntemplatepackagesignerGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

