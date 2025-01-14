# ObjectSignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signatureCreateObjectV1**](ObjectSignatureApi.md#signatureCreateObjectV1) | **POST** /1/object/signature | Create a new Signature
[**signatureDeleteObjectV1**](ObjectSignatureApi.md#signatureDeleteObjectV1) | **DELETE** /1/object/signature/{pkiSignatureID} | Delete an existing Signature
[**signatureEditObjectV1**](ObjectSignatureApi.md#signatureEditObjectV1) | **PUT** /1/object/signature/{pkiSignatureID} | Edit an existing Signature
[**signatureGetObjectV2**](ObjectSignatureApi.md#signatureGetObjectV2) | **GET** /2/object/signature/{pkiSignatureID} | Retrieve an existing Signature
[**signatureGetObjectV3**](ObjectSignatureApi.md#signatureGetObjectV3) | **GET** /3/object/signature/{pkiSignatureID} | Retrieve an existing Signature
[**signatureGetSVGInitialsV1**](ObjectSignatureApi.md#signatureGetSVGInitialsV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGInitials | Retrieve an existing Signature initial SVG
[**signatureGetSVGSignatureV1**](ObjectSignatureApi.md#signatureGetSVGSignatureV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGSignature | Retrieve an existing Signature SVG



## signatureCreateObjectV1

> SignatureCreateObjectV1Response signatureCreateObjectV1(signatureCreateObjectV1Request)

Create a new Signature

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
SignatureCreateObjectV1Request signatureCreateObjectV1Request = new SignatureCreateObjectV1Request(); // SignatureCreateObjectV1Request | 
try {
    SignatureCreateObjectV1Response result = apiInstance.signatureCreateObjectV1(signatureCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signatureCreateObjectV1Request** | [**SignatureCreateObjectV1Request**](SignatureCreateObjectV1Request.md)|  |

### Return type

[**SignatureCreateObjectV1Response**](SignatureCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## signatureDeleteObjectV1

> SignatureDeleteObjectV1Response signatureDeleteObjectV1(pkiSignatureID)

Delete an existing Signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
try {
    SignatureDeleteObjectV1Response result = apiInstance.signatureDeleteObjectV1(pkiSignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]

### Return type

[**SignatureDeleteObjectV1Response**](SignatureDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## signatureEditObjectV1

> SignatureEditObjectV1Response signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request)

Edit an existing Signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
SignatureEditObjectV1Request signatureEditObjectV1Request = new SignatureEditObjectV1Request(); // SignatureEditObjectV1Request | 
try {
    SignatureEditObjectV1Response result = apiInstance.signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]
 **signatureEditObjectV1Request** | [**SignatureEditObjectV1Request**](SignatureEditObjectV1Request.md)|  |

### Return type

[**SignatureEditObjectV1Response**](SignatureEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## signatureGetObjectV2

> SignatureGetObjectV2Response signatureGetObjectV2(pkiSignatureID)

Retrieve an existing Signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
try {
    SignatureGetObjectV2Response result = apiInstance.signatureGetObjectV2(pkiSignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]

### Return type

[**SignatureGetObjectV2Response**](SignatureGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## signatureGetObjectV3

> SignatureGetObjectV3Response signatureGetObjectV3(pkiSignatureID)

Retrieve an existing Signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
try {
    SignatureGetObjectV3Response result = apiInstance.signatureGetObjectV3(pkiSignatureID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureGetObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]

### Return type

[**SignatureGetObjectV3Response**](SignatureGetObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## signatureGetSVGInitialsV1

> signatureGetSVGInitialsV1(pkiSignatureID)

Retrieve an existing Signature initial SVG



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
try {
    apiInstance.signatureGetSVGInitialsV1(pkiSignatureID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureGetSVGInitialsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## signatureGetSVGSignatureV1

> signatureGetSVGSignatureV1(pkiSignatureID)

Retrieve an existing Signature SVG



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSignatureApi;

ObjectSignatureApi apiInstance = new ObjectSignatureApi();
Integer pkiSignatureID = null; // Integer | The unique ID of the Signature
try {
    apiInstance.signatureGetSVGSignatureV1(pkiSignatureID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSignatureApi#signatureGetSVGSignatureV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **Integer**| The unique ID of the Signature | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

