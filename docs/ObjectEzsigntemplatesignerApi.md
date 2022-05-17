# ObjectEzsigntemplatesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignerCreateObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner
[**ezsigntemplatesignerDeleteObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner
[**ezsigntemplatesignerEditObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner
[**ezsigntemplatesignerGetObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV1) | **GET** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner



## ezsigntemplatesignerCreateObjectV1

> EzsigntemplatesignerCreateObjectV1Response ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request)

Create a new Ezsigntemplatesigner

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignerApi;

ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi();
EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request = new EzsigntemplatesignerCreateObjectV1Request(); // EzsigntemplatesignerCreateObjectV1Request | 
try {
    EzsigntemplatesignerCreateObjectV1Response result = apiInstance.ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignerCreateObjectV1Request** | [**EzsigntemplatesignerCreateObjectV1Request**](EzsigntemplatesignerCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatesignerCreateObjectV1Response**](EzsigntemplatesignerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignerDeleteObjectV1

> EzsigntemplatesignerDeleteObjectV1Response ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)

Delete an existing Ezsigntemplatesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignerApi;

ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi();
Integer pkiEzsigntemplatesignerID = null; // Integer | 
try {
    EzsigntemplatesignerDeleteObjectV1Response result = apiInstance.ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignerDeleteObjectV1Response**](EzsigntemplatesignerDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatesignerEditObjectV1

> EzsigntemplatesignerEditObjectV1Response ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request)

Edit an existing Ezsigntemplatesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignerApi;

ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi();
Integer pkiEzsigntemplatesignerID = null; // Integer | 
EzsigntemplatesignerEditObjectV1Request ezsigntemplatesignerEditObjectV1Request = new EzsigntemplatesignerEditObjectV1Request(); // EzsigntemplatesignerEditObjectV1Request | 
try {
    EzsigntemplatesignerEditObjectV1Response result = apiInstance.ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **Integer**|  | [default to null]
 **ezsigntemplatesignerEditObjectV1Request** | [**EzsigntemplatesignerEditObjectV1Request**](EzsigntemplatesignerEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatesignerEditObjectV1Response**](EzsigntemplatesignerEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatesignerGetObjectV1

> EzsigntemplatesignerGetObjectV1Response ezsigntemplatesignerGetObjectV1(pkiEzsigntemplatesignerID)

Retrieve an existing Ezsigntemplatesigner



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatesignerApi;

ObjectEzsigntemplatesignerApi apiInstance = new ObjectEzsigntemplatesignerApi();
Integer pkiEzsigntemplatesignerID = null; // Integer | 
try {
    EzsigntemplatesignerGetObjectV1Response result = apiInstance.ezsigntemplatesignerGetObjectV1(pkiEzsigntemplatesignerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatesignerGetObjectV1Response**](EzsigntemplatesignerGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

