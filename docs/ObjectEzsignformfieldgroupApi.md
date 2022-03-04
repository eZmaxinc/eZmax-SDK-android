# ObjectEzsignformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignformfieldgroupCreateObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupCreateObjectV1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
[**ezsignformfieldgroupDeleteObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
[**ezsignformfieldgroupEditObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupEditObjectV1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
[**ezsignformfieldgroupGetObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupGetObjectV1) | **GET** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup



## ezsignformfieldgroupCreateObjectV1

> EzsignformfieldgroupCreateObjectV1Response ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request)

Create a new Ezsignformfieldgroup

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignformfieldgroupApi;

ObjectEzsignformfieldgroupApi apiInstance = new ObjectEzsignformfieldgroupApi();
EzsignformfieldgroupCreateObjectV1Request ezsignformfieldgroupCreateObjectV1Request = new EzsignformfieldgroupCreateObjectV1Request(); // EzsignformfieldgroupCreateObjectV1Request | 
try {
    EzsignformfieldgroupCreateObjectV1Response result = apiInstance.ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignformfieldgroupCreateObjectV1Request** | [**EzsignformfieldgroupCreateObjectV1Request**](EzsignformfieldgroupCreateObjectV1Request.md)|  |

### Return type

[**EzsignformfieldgroupCreateObjectV1Response**](EzsignformfieldgroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignformfieldgroupDeleteObjectV1

> EzsignformfieldgroupDeleteObjectV1Response ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)

Delete an existing Ezsignformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignformfieldgroupApi;

ObjectEzsignformfieldgroupApi apiInstance = new ObjectEzsignformfieldgroupApi();
Integer pkiEzsignformfieldgroupID = null; // Integer | 
try {
    EzsignformfieldgroupDeleteObjectV1Response result = apiInstance.ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **Integer**|  | [default to null]

### Return type

[**EzsignformfieldgroupDeleteObjectV1Response**](EzsignformfieldgroupDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignformfieldgroupEditObjectV1

> EzsignformfieldgroupEditObjectV1Response ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request)

Edit an existing Ezsignformfieldgroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignformfieldgroupApi;

ObjectEzsignformfieldgroupApi apiInstance = new ObjectEzsignformfieldgroupApi();
Integer pkiEzsignformfieldgroupID = null; // Integer | 
EzsignformfieldgroupEditObjectV1Request ezsignformfieldgroupEditObjectV1Request = new EzsignformfieldgroupEditObjectV1Request(); // EzsignformfieldgroupEditObjectV1Request | 
try {
    EzsignformfieldgroupEditObjectV1Response result = apiInstance.ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **Integer**|  | [default to null]
 **ezsignformfieldgroupEditObjectV1Request** | [**EzsignformfieldgroupEditObjectV1Request**](EzsignformfieldgroupEditObjectV1Request.md)|  |

### Return type

[**EzsignformfieldgroupEditObjectV1Response**](EzsignformfieldgroupEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignformfieldgroupGetObjectV1

> EzsignformfieldgroupGetObjectV1Response ezsignformfieldgroupGetObjectV1(pkiEzsignformfieldgroupID)

Retrieve an existing Ezsignformfieldgroup

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignformfieldgroupApi;

ObjectEzsignformfieldgroupApi apiInstance = new ObjectEzsignformfieldgroupApi();
Integer pkiEzsignformfieldgroupID = null; // Integer | 
try {
    EzsignformfieldgroupGetObjectV1Response result = apiInstance.ezsignformfieldgroupGetObjectV1(pkiEzsignformfieldgroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **Integer**|  | [default to null]

### Return type

[**EzsignformfieldgroupGetObjectV1Response**](EzsignformfieldgroupGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

