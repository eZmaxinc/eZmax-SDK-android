# ObjectEzsignfoldersignerassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldersignerassociationCreateEmbeddedUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateEmbeddedUrlV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/createEmbeddedUrl | Creates an Url to allow embedded signing
[**ezsignfoldersignerassociationCreateObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationCreateObjectV2**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationDeleteObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationEditObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationForceDisconnectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationForceDisconnectV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/forceDisconnect | Disconnects the Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
[**ezsignfoldersignerassociationGetObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetObjectV2**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV2) | **GET** /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationPatchObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationPatchObjectV1) | **PATCH** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Patch an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationReassignV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationReassignV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/reassign | Reassign remaining unsigned signatures and forms



## ezsignfoldersignerassociationCreateEmbeddedUrlV1

> EzsignfoldersignerassociationCreateEmbeddedUrlV1Response ezsignfoldersignerassociationCreateEmbeddedUrlV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationCreateEmbeddedUrlV1Request)

Creates an Url to allow embedded signing

This endpoint creates an Url that can be used in a browser or embedded in an I-Frame to allow signing.  The signer Login type must be configured as Embedded.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
EzsignfoldersignerassociationCreateEmbeddedUrlV1Request ezsignfoldersignerassociationCreateEmbeddedUrlV1Request = new EzsignfoldersignerassociationCreateEmbeddedUrlV1Request(); // EzsignfoldersignerassociationCreateEmbeddedUrlV1Request | 
try {
    EzsignfoldersignerassociationCreateEmbeddedUrlV1Response result = apiInstance.ezsignfoldersignerassociationCreateEmbeddedUrlV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationCreateEmbeddedUrlV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateEmbeddedUrlV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]
 **ezsignfoldersignerassociationCreateEmbeddedUrlV1Request** | [**EzsignfoldersignerassociationCreateEmbeddedUrlV1Request**](EzsignfoldersignerassociationCreateEmbeddedUrlV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateEmbeddedUrlV1Response**](EzsignfoldersignerassociationCreateEmbeddedUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationCreateObjectV1

> EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request = Arrays.asList(new EzsignfoldersignerassociationCreateObjectV1Request()); // List<EzsignfoldersignerassociationCreateObjectV1Request> | 
try {
    EzsignfoldersignerassociationCreateObjectV1Response result = apiInstance.ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV1Request** | [**List&lt;EzsignfoldersignerassociationCreateObjectV1Request&gt;**](EzsignfoldersignerassociationCreateObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV1Response**](EzsignfoldersignerassociationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationCreateObjectV2

> EzsignfoldersignerassociationCreateObjectV2Response ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationCreateObjectV2Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
EzsignfoldersignerassociationCreateObjectV2Request ezsignfoldersignerassociationCreateObjectV2Request = new EzsignfoldersignerassociationCreateObjectV2Request(); // EzsignfoldersignerassociationCreateObjectV2Request | 
try {
    EzsignfoldersignerassociationCreateObjectV2Response result = apiInstance.ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV2Request** | [**EzsignfoldersignerassociationCreateObjectV2Request**](EzsignfoldersignerassociationCreateObjectV2Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV2Response**](EzsignfoldersignerassociationCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationDeleteObjectV1

> EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)

Delete an existing Ezsignfoldersignerassociation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
try {
    EzsignfoldersignerassociationDeleteObjectV1Response result = apiInstance.ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldersignerassociationDeleteObjectV1Response**](EzsignfoldersignerassociationDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationEditObjectV1

> EzsignfoldersignerassociationEditObjectV1Response ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationEditObjectV1Request)

Edit an existing Ezsignfoldersignerassociation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
EzsignfoldersignerassociationEditObjectV1Request ezsignfoldersignerassociationEditObjectV1Request = new EzsignfoldersignerassociationEditObjectV1Request(); // EzsignfoldersignerassociationEditObjectV1Request | 
try {
    EzsignfoldersignerassociationEditObjectV1Response result = apiInstance.ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]
 **ezsignfoldersignerassociationEditObjectV1Request** | [**EzsignfoldersignerassociationEditObjectV1Request**](EzsignfoldersignerassociationEditObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationEditObjectV1Response**](EzsignfoldersignerassociationEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationForceDisconnectV1

> EzsignfoldersignerassociationForceDisconnectV1Response ezsignfoldersignerassociationForceDisconnectV1(pkiEzsignfoldersignerassociationID, body)

Disconnects the Ezsignfoldersignerassociation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsignfoldersignerassociationForceDisconnectV1Response result = apiInstance.ezsignfoldersignerassociationForceDisconnectV1(pkiEzsignfoldersignerassociationID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationForceDisconnectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsignfoldersignerassociationForceDisconnectV1Response**](EzsignfoldersignerassociationForceDisconnectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationGetInPersonLoginUrlV1

> EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)

Retrieve a Login Url to allow In-Person signing

This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
try {
    EzsignfoldersignerassociationGetInPersonLoginUrlV1Response result = apiInstance.ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetInPersonLoginUrlV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldersignerassociationGetInPersonLoginUrlV1Response**](EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationGetObjectV1

> EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
try {
    EzsignfoldersignerassociationGetObjectV1Response result = apiInstance.ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldersignerassociationGetObjectV1Response**](EzsignfoldersignerassociationGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationGetObjectV2

> EzsignfoldersignerassociationGetObjectV2Response ezsignfoldersignerassociationGetObjectV2(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
try {
    EzsignfoldersignerassociationGetObjectV2Response result = apiInstance.ezsignfoldersignerassociationGetObjectV2(pkiEzsignfoldersignerassociationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldersignerassociationGetObjectV2Response**](EzsignfoldersignerassociationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldersignerassociationPatchObjectV1

> EzsignfoldersignerassociationPatchObjectV1Response ezsignfoldersignerassociationPatchObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationPatchObjectV1Request)

Patch an existing Ezsignfoldersignerassociation

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
EzsignfoldersignerassociationPatchObjectV1Request ezsignfoldersignerassociationPatchObjectV1Request = new EzsignfoldersignerassociationPatchObjectV1Request(); // EzsignfoldersignerassociationPatchObjectV1Request | 
try {
    EzsignfoldersignerassociationPatchObjectV1Response result = apiInstance.ezsignfoldersignerassociationPatchObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]
 **ezsignfoldersignerassociationPatchObjectV1Request** | [**EzsignfoldersignerassociationPatchObjectV1Request**](EzsignfoldersignerassociationPatchObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationPatchObjectV1Response**](EzsignfoldersignerassociationPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldersignerassociationReassignV1

> EzsignfoldersignerassociationReassignV1Response ezsignfoldersignerassociationReassignV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationReassignV1Request)

Reassign remaining unsigned signatures and forms

Reassign remaining unsigned signatures and forms

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldersignerassociationApi;

ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi();
Integer pkiEzsignfoldersignerassociationID = null; // Integer | 
EzsignfoldersignerassociationReassignV1Request ezsignfoldersignerassociationReassignV1Request = new EzsignfoldersignerassociationReassignV1Request(); // EzsignfoldersignerassociationReassignV1Request | 
try {
    EzsignfoldersignerassociationReassignV1Response result = apiInstance.ezsignfoldersignerassociationReassignV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationReassignV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationReassignV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**|  | [default to null]
 **ezsignfoldersignerassociationReassignV1Request** | [**EzsignfoldersignerassociationReassignV1Request**](EzsignfoldersignerassociationReassignV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationReassignV1Response**](EzsignfoldersignerassociationReassignV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

