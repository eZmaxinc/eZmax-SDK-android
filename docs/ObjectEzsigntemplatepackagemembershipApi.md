# ObjectEzsigntemplatepackagemembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagemembershipCreateObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipDeleteObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipGetObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipGetObjectV2**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV2) | **GET** /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership



## ezsigntemplatepackagemembershipCreateObjectV1

> EzsigntemplatepackagemembershipCreateObjectV1Response ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipCreateObjectV1Request)

Create a new Ezsigntemplatepackagemembership

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagemembershipApi;

ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi();
EzsigntemplatepackagemembershipCreateObjectV1Request ezsigntemplatepackagemembershipCreateObjectV1Request = new EzsigntemplatepackagemembershipCreateObjectV1Request(); // EzsigntemplatepackagemembershipCreateObjectV1Request | 
try {
    EzsigntemplatepackagemembershipCreateObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagemembershipCreateObjectV1Request** | [**EzsigntemplatepackagemembershipCreateObjectV1Request**](EzsigntemplatepackagemembershipCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepackagemembershipCreateObjectV1Response**](EzsigntemplatepackagemembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackagemembershipDeleteObjectV1

> EzsigntemplatepackagemembershipDeleteObjectV1Response ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID)

Delete an existing Ezsigntemplatepackagemembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagemembershipApi;

ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi();
Integer pkiEzsigntemplatepackagemembershipID = null; // Integer | 
try {
    EzsigntemplatepackagemembershipDeleteObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagemembershipDeleteObjectV1Response**](EzsigntemplatepackagemembershipDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagemembershipGetObjectV1

> EzsigntemplatepackagemembershipGetObjectV1Response ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID)

Retrieve an existing Ezsigntemplatepackagemembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagemembershipApi;

ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi();
Integer pkiEzsigntemplatepackagemembershipID = null; // Integer | 
try {
    EzsigntemplatepackagemembershipGetObjectV1Response result = apiInstance.ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagemembershipGetObjectV1Response**](EzsigntemplatepackagemembershipGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagemembershipGetObjectV2

> EzsigntemplatepackagemembershipGetObjectV2Response ezsigntemplatepackagemembershipGetObjectV2(pkiEzsigntemplatepackagemembershipID)

Retrieve an existing Ezsigntemplatepackagemembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagemembershipApi;

ObjectEzsigntemplatepackagemembershipApi apiInstance = new ObjectEzsigntemplatepackagemembershipApi();
Integer pkiEzsigntemplatepackagemembershipID = null; // Integer | 
try {
    EzsigntemplatepackagemembershipGetObjectV2Response result = apiInstance.ezsigntemplatepackagemembershipGetObjectV2(pkiEzsigntemplatepackagemembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagemembershipGetObjectV2Response**](EzsigntemplatepackagemembershipGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

