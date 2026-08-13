# ObjectEzsignbulksendsignermappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendsignermappingCreateObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingCreateObjectV2**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV2) | **POST** /2/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingDeleteObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingGetObjectV2**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV2) | **GET** /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingGetObjectV3**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV3) | **GET** /3/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping



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


## ezsignbulksendsignermappingCreateObjectV2

> EzsignbulksendsignermappingCreateObjectV2Response ezsignbulksendsignermappingCreateObjectV2(ezsignbulksendsignermappingCreateObjectV2Request)

Create a new Ezsignbulksendsignermapping

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
EzsignbulksendsignermappingCreateObjectV2Request ezsignbulksendsignermappingCreateObjectV2Request = new EzsignbulksendsignermappingCreateObjectV2Request(); // EzsignbulksendsignermappingCreateObjectV2Request | 
try {
    EzsignbulksendsignermappingCreateObjectV2Response result = apiInstance.ezsignbulksendsignermappingCreateObjectV2(ezsignbulksendsignermappingCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksendsignermappingCreateObjectV2Request** | [**EzsignbulksendsignermappingCreateObjectV2Request**](EzsignbulksendsignermappingCreateObjectV2Request.md)|  |

### Return type

[**EzsignbulksendsignermappingCreateObjectV2Response**](EzsignbulksendsignermappingCreateObjectV2Response.md)

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


## ezsignbulksendsignermappingGetObjectV2

> EzsignbulksendsignermappingGetObjectV2Response ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
Integer pkiEzsignbulksendsignermappingID = null; // Integer | 
try {
    EzsignbulksendsignermappingGetObjectV2Response result = apiInstance.ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendsignermappingGetObjectV2Response**](EzsignbulksendsignermappingGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignbulksendsignermappingGetObjectV3

> EzsignbulksendsignermappingGetObjectV3Response ezsignbulksendsignermappingGetObjectV3(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendsignermappingApi;

ObjectEzsignbulksendsignermappingApi apiInstance = new ObjectEzsignbulksendsignermappingApi();
Integer pkiEzsignbulksendsignermappingID = null; // Integer | 
try {
    EzsignbulksendsignermappingGetObjectV3Response result = apiInstance.ezsignbulksendsignermappingGetObjectV3(pkiEzsignbulksendsignermappingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendsignermappingGetObjectV3Response**](EzsignbulksendsignermappingGetObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

