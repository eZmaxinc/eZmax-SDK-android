# ObjectEzsigntemplatedocumentpagerecognitionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatedocumentpagerecognitionCreateObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionCreateObjectV1) | **POST** /1/object/ezsigntemplatedocumentpagerecognition | Create a new Ezsigntemplatedocumentpagerecognition
[**ezsigntemplatedocumentpagerecognitionDeleteObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Delete an existing Ezsigntemplatedocumentpagerecognition
[**ezsigntemplatedocumentpagerecognitionEditObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionEditObjectV1) | **PUT** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Edit an existing Ezsigntemplatedocumentpagerecognition
[**ezsigntemplatedocumentpagerecognitionGetObjectV2**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionGetObjectV2) | **GET** /2/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Retrieve an existing Ezsigntemplatedocumentpagerecognition



## ezsigntemplatedocumentpagerecognitionCreateObjectV1

> EzsigntemplatedocumentpagerecognitionCreateObjectV1Response ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request)

Create a new Ezsigntemplatedocumentpagerecognition

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi();
EzsigntemplatedocumentpagerecognitionCreateObjectV1Request ezsigntemplatedocumentpagerecognitionCreateObjectV1Request = new EzsigntemplatedocumentpagerecognitionCreateObjectV1Request(); // EzsigntemplatedocumentpagerecognitionCreateObjectV1Request | 
try {
    EzsigntemplatedocumentpagerecognitionCreateObjectV1Response result = apiInstance.ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatedocumentpagerecognitionCreateObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionCreateObjectV1Request**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentpagerecognitionCreateObjectV1Response**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentpagerecognitionDeleteObjectV1

> EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID)

Delete an existing Ezsigntemplatedocumentpagerecognition



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi();
Integer pkiEzsigntemplatedocumentpagerecognitionID = null; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
try {
    EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response result = apiInstance.ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | [default to null]

### Return type

[**EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response**](EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentpagerecognitionEditObjectV1

> EzsigntemplatedocumentpagerecognitionEditObjectV1Response ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request)

Edit an existing Ezsigntemplatedocumentpagerecognition



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi();
Integer pkiEzsigntemplatedocumentpagerecognitionID = null; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
EzsigntemplatedocumentpagerecognitionEditObjectV1Request ezsigntemplatedocumentpagerecognitionEditObjectV1Request = new EzsigntemplatedocumentpagerecognitionEditObjectV1Request(); // EzsigntemplatedocumentpagerecognitionEditObjectV1Request | 
try {
    EzsigntemplatedocumentpagerecognitionEditObjectV1Response result = apiInstance.ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | [default to null]
 **ezsigntemplatedocumentpagerecognitionEditObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionEditObjectV1Request**](EzsigntemplatedocumentpagerecognitionEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentpagerecognitionEditObjectV1Response**](EzsigntemplatedocumentpagerecognitionEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentpagerecognitionGetObjectV2

> EzsigntemplatedocumentpagerecognitionGetObjectV2Response ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID)

Retrieve an existing Ezsigntemplatedocumentpagerecognition



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentpagerecognitionApi;

ObjectEzsigntemplatedocumentpagerecognitionApi apiInstance = new ObjectEzsigntemplatedocumentpagerecognitionApi();
Integer pkiEzsigntemplatedocumentpagerecognitionID = null; // Integer | The unique ID of the Ezsigntemplatedocumentpagerecognition
try {
    EzsigntemplatedocumentpagerecognitionGetObjectV2Response result = apiInstance.ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentpagerecognitionID** | **Integer**| The unique ID of the Ezsigntemplatedocumentpagerecognition | [default to null]

### Return type

[**EzsigntemplatedocumentpagerecognitionGetObjectV2Response**](EzsigntemplatedocumentpagerecognitionGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

