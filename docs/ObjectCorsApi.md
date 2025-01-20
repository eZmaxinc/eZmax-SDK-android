# ObjectCorsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corsCreateObjectV1**](ObjectCorsApi.md#corsCreateObjectV1) | **POST** /1/object/cors | Create a new Cors
[**corsDeleteObjectV1**](ObjectCorsApi.md#corsDeleteObjectV1) | **DELETE** /1/object/cors/{pkiCorsID} | Delete an existing Cors
[**corsEditObjectV1**](ObjectCorsApi.md#corsEditObjectV1) | **PUT** /1/object/cors/{pkiCorsID} | Edit an existing Cors
[**corsGetObjectV2**](ObjectCorsApi.md#corsGetObjectV2) | **GET** /2/object/cors/{pkiCorsID} | Retrieve an existing Cors



## corsCreateObjectV1

> CorsCreateObjectV1Response corsCreateObjectV1(corsCreateObjectV1Request)

Create a new Cors

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCorsApi;

ObjectCorsApi apiInstance = new ObjectCorsApi();
CorsCreateObjectV1Request corsCreateObjectV1Request = new CorsCreateObjectV1Request(); // CorsCreateObjectV1Request | 
try {
    CorsCreateObjectV1Response result = apiInstance.corsCreateObjectV1(corsCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCorsApi#corsCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corsCreateObjectV1Request** | [**CorsCreateObjectV1Request**](CorsCreateObjectV1Request.md)|  |

### Return type

[**CorsCreateObjectV1Response**](CorsCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## corsDeleteObjectV1

> CorsDeleteObjectV1Response corsDeleteObjectV1(pkiCorsID)

Delete an existing Cors



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCorsApi;

ObjectCorsApi apiInstance = new ObjectCorsApi();
Integer pkiCorsID = null; // Integer | The unique ID of the Cors
try {
    CorsDeleteObjectV1Response result = apiInstance.corsDeleteObjectV1(pkiCorsID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCorsApi#corsDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **Integer**| The unique ID of the Cors | [default to null]

### Return type

[**CorsDeleteObjectV1Response**](CorsDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## corsEditObjectV1

> CorsEditObjectV1Response corsEditObjectV1(pkiCorsID, corsEditObjectV1Request)

Edit an existing Cors



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCorsApi;

ObjectCorsApi apiInstance = new ObjectCorsApi();
Integer pkiCorsID = null; // Integer | The unique ID of the Cors
CorsEditObjectV1Request corsEditObjectV1Request = new CorsEditObjectV1Request(); // CorsEditObjectV1Request | 
try {
    CorsEditObjectV1Response result = apiInstance.corsEditObjectV1(pkiCorsID, corsEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCorsApi#corsEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **Integer**| The unique ID of the Cors | [default to null]
 **corsEditObjectV1Request** | [**CorsEditObjectV1Request**](CorsEditObjectV1Request.md)|  |

### Return type

[**CorsEditObjectV1Response**](CorsEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## corsGetObjectV2

> CorsGetObjectV2Response corsGetObjectV2(pkiCorsID)

Retrieve an existing Cors



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCorsApi;

ObjectCorsApi apiInstance = new ObjectCorsApi();
Integer pkiCorsID = null; // Integer | The unique ID of the Cors
try {
    CorsGetObjectV2Response result = apiInstance.corsGetObjectV2(pkiCorsID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCorsApi#corsGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **Integer**| The unique ID of the Cors | [default to null]

### Return type

[**CorsGetObjectV2Response**](CorsGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

