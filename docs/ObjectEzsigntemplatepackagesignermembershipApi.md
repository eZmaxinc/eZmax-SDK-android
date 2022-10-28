# ObjectEzsigntemplatepackagesignermembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagesignermembershipCreateObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesignermembership | Create a new Ezsigntemplatepackagesignermembership
[**ezsigntemplatepackagesignermembershipDeleteObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Delete an existing Ezsigntemplatepackagesignermembership
[**ezsigntemplatepackagesignermembershipGetObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership
[**ezsigntemplatepackagesignermembershipGetObjectV2**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipGetObjectV2) | **GET** /2/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership



## ezsigntemplatepackagesignermembershipCreateObjectV1

> EzsigntemplatepackagesignermembershipCreateObjectV1Response ezsigntemplatepackagesignermembershipCreateObjectV1(ezsigntemplatepackagesignermembershipCreateObjectV1Request)

Create a new Ezsigntemplatepackagesignermembership

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignermembershipApi;

ObjectEzsigntemplatepackagesignermembershipApi apiInstance = new ObjectEzsigntemplatepackagesignermembershipApi();
EzsigntemplatepackagesignermembershipCreateObjectV1Request ezsigntemplatepackagesignermembershipCreateObjectV1Request = new EzsigntemplatepackagesignermembershipCreateObjectV1Request(); // EzsigntemplatepackagesignermembershipCreateObjectV1Request | 
try {
    EzsigntemplatepackagesignermembershipCreateObjectV1Response result = apiInstance.ezsigntemplatepackagesignermembershipCreateObjectV1(ezsigntemplatepackagesignermembershipCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagesignermembershipCreateObjectV1Request** | [**EzsigntemplatepackagesignermembershipCreateObjectV1Request**](EzsigntemplatepackagesignermembershipCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepackagesignermembershipCreateObjectV1Response**](EzsigntemplatepackagesignermembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackagesignermembershipDeleteObjectV1

> EzsigntemplatepackagesignermembershipDeleteObjectV1Response ezsigntemplatepackagesignermembershipDeleteObjectV1(pkiEzsigntemplatepackagesignermembershipID)

Delete an existing Ezsigntemplatepackagesignermembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignermembershipApi;

ObjectEzsigntemplatepackagesignermembershipApi apiInstance = new ObjectEzsigntemplatepackagesignermembershipApi();
Integer pkiEzsigntemplatepackagesignermembershipID = null; // Integer | 
try {
    EzsigntemplatepackagesignermembershipDeleteObjectV1Response result = apiInstance.ezsigntemplatepackagesignermembershipDeleteObjectV1(pkiEzsigntemplatepackagesignermembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignermembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignermembershipDeleteObjectV1Response**](EzsigntemplatepackagesignermembershipDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagesignermembershipGetObjectV1

> EzsigntemplatepackagesignermembershipGetObjectV1Response ezsigntemplatepackagesignermembershipGetObjectV1(pkiEzsigntemplatepackagesignermembershipID)

Retrieve an existing Ezsigntemplatepackagesignermembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignermembershipApi;

ObjectEzsigntemplatepackagesignermembershipApi apiInstance = new ObjectEzsigntemplatepackagesignermembershipApi();
Integer pkiEzsigntemplatepackagesignermembershipID = null; // Integer | 
try {
    EzsigntemplatepackagesignermembershipGetObjectV1Response result = apiInstance.ezsigntemplatepackagesignermembershipGetObjectV1(pkiEzsigntemplatepackagesignermembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignermembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignermembershipGetObjectV1Response**](EzsigntemplatepackagesignermembershipGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackagesignermembershipGetObjectV2

> EzsigntemplatepackagesignermembershipGetObjectV2Response ezsigntemplatepackagesignermembershipGetObjectV2(pkiEzsigntemplatepackagesignermembershipID)

Retrieve an existing Ezsigntemplatepackagesignermembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackagesignermembershipApi;

ObjectEzsigntemplatepackagesignermembershipApi apiInstance = new ObjectEzsigntemplatepackagesignermembershipApi();
Integer pkiEzsigntemplatepackagesignermembershipID = null; // Integer | 
try {
    EzsigntemplatepackagesignermembershipGetObjectV2Response result = apiInstance.ezsigntemplatepackagesignermembershipGetObjectV2(pkiEzsigntemplatepackagesignermembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignermembershipID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackagesignermembershipGetObjectV2Response**](EzsigntemplatepackagesignermembershipGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

