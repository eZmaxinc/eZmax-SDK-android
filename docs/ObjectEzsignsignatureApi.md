# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureCreateObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
[**ezsignsignatureEditObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
[**ezsignsignatureGetEzsignsignaturesAutomaticV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignsignature/getEzsignsignaturesAutomatic | Retrieve all automatic Ezsignsignatures
[**ezsignsignatureGetObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV2) | **GET** /2/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
[**ezsignsignatureSignV1**](ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature



## ezsignsignatureCreateObjectV1

> EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request = Arrays.asList(new EzsignsignatureCreateObjectV1Request()); // List<EzsignsignatureCreateObjectV1Request> | 
try {
    EzsignsignatureCreateObjectV1Response result = apiInstance.ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureCreateObjectV1Request** | [**List&lt;EzsignsignatureCreateObjectV1Request&gt;**](EzsignsignatureCreateObjectV1Request.md)|  |

### Return type

[**EzsignsignatureCreateObjectV1Response**](EzsignsignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignatureCreateObjectV2

> EzsignsignatureCreateObjectV2Response ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
EzsignsignatureCreateObjectV2Request ezsignsignatureCreateObjectV2Request = new EzsignsignatureCreateObjectV2Request(); // EzsignsignatureCreateObjectV2Request | 
try {
    EzsignsignatureCreateObjectV2Response result = apiInstance.ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureCreateObjectV2Request** | [**EzsignsignatureCreateObjectV2Request**](EzsignsignatureCreateObjectV2Request.md)|  |

### Return type

[**EzsignsignatureCreateObjectV2Response**](EzsignsignatureCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignatureDeleteObjectV1

> EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | 
try {
    EzsignsignatureDeleteObjectV1Response result = apiInstance.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsignsignatureDeleteObjectV1Response**](EzsignsignatureDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignatureEditObjectV1

> EzsignsignatureEditObjectV1Response ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request)

Edit an existing Ezsignsignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | 
EzsignsignatureEditObjectV1Request ezsignsignatureEditObjectV1Request = new EzsignsignatureEditObjectV1Request(); // EzsignsignatureEditObjectV1Request | 
try {
    EzsignsignatureEditObjectV1Response result = apiInstance.ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**|  | [default to null]
 **ezsignsignatureEditObjectV1Request** | [**EzsignsignatureEditObjectV1Request**](EzsignsignatureEditObjectV1Request.md)|  |

### Return type

[**EzsignsignatureEditObjectV1Response**](EzsignsignatureEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignatureGetEzsignsignaturesAutomaticV1

> EzsignsignatureGetEzsignsignaturesAutomaticV1Response ezsignsignatureGetEzsignsignaturesAutomaticV1()

Retrieve all automatic Ezsignsignatures

Return all the Ezsignsignatures that can be signed by the current user

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
try {
    EzsignsignatureGetEzsignsignaturesAutomaticV1Response result = apiInstance.ezsignsignatureGetEzsignsignaturesAutomaticV1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EzsignsignatureGetEzsignsignaturesAutomaticV1Response**](EzsignsignatureGetEzsignsignaturesAutomaticV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignatureGetObjectV2

> EzsignsignatureGetObjectV2Response ezsignsignatureGetObjectV2(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | 
try {
    EzsignsignatureGetObjectV2Response result = apiInstance.ezsignsignatureGetObjectV2(pkiEzsignsignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**|  | [default to null]

### Return type

[**EzsignsignatureGetObjectV2Response**](EzsignsignatureGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignatureSignV1

> EzsignsignatureSignV1Response ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request)

Sign the Ezsignsignature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignatureApi;

ObjectEzsignsignatureApi apiInstance = new ObjectEzsignsignatureApi();
Integer pkiEzsignsignatureID = null; // Integer | 
EzsignsignatureSignV1Request ezsignsignatureSignV1Request = new EzsignsignatureSignV1Request(); // EzsignsignatureSignV1Request | 
try {
    EzsignsignatureSignV1Response result = apiInstance.ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignatureApi#ezsignsignatureSignV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **Integer**|  | [default to null]
 **ezsignsignatureSignV1Request** | [**EzsignsignatureSignV1Request**](EzsignsignatureSignV1Request.md)|  |

### Return type

[**EzsignsignatureSignV1Response**](EzsignsignatureSignV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

