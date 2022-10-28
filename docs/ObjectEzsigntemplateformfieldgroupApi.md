# ObjectEzsigntemplateformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateformfieldgroupCreateObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupDeleteObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupEditObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupGetObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV1) | **GET** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupGetObjectV2**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV2) | **GET** /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup



## ezsigntemplateformfieldgroupCreateObjectV1

> EzsigntemplateformfieldgroupCreateObjectV1Response ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request)

Create a new Ezsigntemplateformfieldgroup

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateformfieldgroupApi;

ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi();
EzsigntemplateformfieldgroupCreateObjectV1Request ezsigntemplateformfieldgroupCreateObjectV1Request = new EzsigntemplateformfieldgroupCreateObjectV1Request(); // EzsigntemplateformfieldgroupCreateObjectV1Request | 
try {
    EzsigntemplateformfieldgroupCreateObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateformfieldgroupCreateObjectV1Request** | [**EzsigntemplateformfieldgroupCreateObjectV1Request**](EzsigntemplateformfieldgroupCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplateformfieldgroupCreateObjectV1Response**](EzsigntemplateformfieldgroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateformfieldgroupDeleteObjectV1

> EzsigntemplateformfieldgroupDeleteObjectV1Response ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)

Delete an existing Ezsigntemplateformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateformfieldgroupApi;

ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi();
Integer pkiEzsigntemplateformfieldgroupID = null; // Integer | 
try {
    EzsigntemplateformfieldgroupDeleteObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplateformfieldgroupDeleteObjectV1Response**](EzsigntemplateformfieldgroupDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateformfieldgroupEditObjectV1

> EzsigntemplateformfieldgroupEditObjectV1Response ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request)

Edit an existing Ezsigntemplateformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateformfieldgroupApi;

ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi();
Integer pkiEzsigntemplateformfieldgroupID = null; // Integer | 
EzsigntemplateformfieldgroupEditObjectV1Request ezsigntemplateformfieldgroupEditObjectV1Request = new EzsigntemplateformfieldgroupEditObjectV1Request(); // EzsigntemplateformfieldgroupEditObjectV1Request | 
try {
    EzsigntemplateformfieldgroupEditObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | [default to null]
 **ezsigntemplateformfieldgroupEditObjectV1Request** | [**EzsigntemplateformfieldgroupEditObjectV1Request**](EzsigntemplateformfieldgroupEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplateformfieldgroupEditObjectV1Response**](EzsigntemplateformfieldgroupEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateformfieldgroupGetObjectV1

> EzsigntemplateformfieldgroupGetObjectV1Response ezsigntemplateformfieldgroupGetObjectV1(pkiEzsigntemplateformfieldgroupID)

Retrieve an existing Ezsigntemplateformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateformfieldgroupApi;

ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi();
Integer pkiEzsigntemplateformfieldgroupID = null; // Integer | 
try {
    EzsigntemplateformfieldgroupGetObjectV1Response result = apiInstance.ezsigntemplateformfieldgroupGetObjectV1(pkiEzsigntemplateformfieldgroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplateformfieldgroupGetObjectV1Response**](EzsigntemplateformfieldgroupGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateformfieldgroupGetObjectV2

> EzsigntemplateformfieldgroupGetObjectV2Response ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)

Retrieve an existing Ezsigntemplateformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateformfieldgroupApi;

ObjectEzsigntemplateformfieldgroupApi apiInstance = new ObjectEzsigntemplateformfieldgroupApi();
Integer pkiEzsigntemplateformfieldgroupID = null; // Integer | 
try {
    EzsigntemplateformfieldgroupGetObjectV2Response result = apiInstance.ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplateformfieldgroupGetObjectV2Response**](EzsigntemplateformfieldgroupGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

