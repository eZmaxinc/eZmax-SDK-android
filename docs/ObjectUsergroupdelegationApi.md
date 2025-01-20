# ObjectUsergroupdelegationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupdelegationCreateObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationCreateObjectV1) | **POST** /1/object/usergroupdelegation | Create a new Usergroupdelegation
[**usergroupdelegationDeleteObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationDeleteObjectV1) | **DELETE** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Delete an existing Usergroupdelegation
[**usergroupdelegationEditObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationEditObjectV1) | **PUT** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Edit an existing Usergroupdelegation
[**usergroupdelegationGetObjectV2**](ObjectUsergroupdelegationApi.md#usergroupdelegationGetObjectV2) | **GET** /2/object/usergroupdelegation/{pkiUsergroupdelegationID} | Retrieve an existing Usergroupdelegation



## usergroupdelegationCreateObjectV1

> UsergroupdelegationCreateObjectV1Response usergroupdelegationCreateObjectV1(usergroupdelegationCreateObjectV1Request)

Create a new Usergroupdelegation

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupdelegationApi;

ObjectUsergroupdelegationApi apiInstance = new ObjectUsergroupdelegationApi();
UsergroupdelegationCreateObjectV1Request usergroupdelegationCreateObjectV1Request = new UsergroupdelegationCreateObjectV1Request(); // UsergroupdelegationCreateObjectV1Request | 
try {
    UsergroupdelegationCreateObjectV1Response result = apiInstance.usergroupdelegationCreateObjectV1(usergroupdelegationCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupdelegationApi#usergroupdelegationCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupdelegationCreateObjectV1Request** | [**UsergroupdelegationCreateObjectV1Request**](UsergroupdelegationCreateObjectV1Request.md)|  |

### Return type

[**UsergroupdelegationCreateObjectV1Response**](UsergroupdelegationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupdelegationDeleteObjectV1

> CommonResponse usergroupdelegationDeleteObjectV1(pkiUsergroupdelegationID)

Delete an existing Usergroupdelegation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupdelegationApi;

ObjectUsergroupdelegationApi apiInstance = new ObjectUsergroupdelegationApi();
Integer pkiUsergroupdelegationID = null; // Integer | The unique ID of the Usergroupdelegation
try {
    CommonResponse result = apiInstance.usergroupdelegationDeleteObjectV1(pkiUsergroupdelegationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupdelegationApi#usergroupdelegationDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupdelegationID** | **Integer**| The unique ID of the Usergroupdelegation | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupdelegationEditObjectV1

> CommonResponse usergroupdelegationEditObjectV1(pkiUsergroupdelegationID, usergroupdelegationEditObjectV1Request)

Edit an existing Usergroupdelegation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupdelegationApi;

ObjectUsergroupdelegationApi apiInstance = new ObjectUsergroupdelegationApi();
Integer pkiUsergroupdelegationID = null; // Integer | The unique ID of the Usergroupdelegation
UsergroupdelegationEditObjectV1Request usergroupdelegationEditObjectV1Request = new UsergroupdelegationEditObjectV1Request(); // UsergroupdelegationEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.usergroupdelegationEditObjectV1(pkiUsergroupdelegationID, usergroupdelegationEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupdelegationApi#usergroupdelegationEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupdelegationID** | **Integer**| The unique ID of the Usergroupdelegation | [default to null]
 **usergroupdelegationEditObjectV1Request** | [**UsergroupdelegationEditObjectV1Request**](UsergroupdelegationEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupdelegationGetObjectV2

> UsergroupdelegationGetObjectV2Response usergroupdelegationGetObjectV2(pkiUsergroupdelegationID)

Retrieve an existing Usergroupdelegation



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupdelegationApi;

ObjectUsergroupdelegationApi apiInstance = new ObjectUsergroupdelegationApi();
Integer pkiUsergroupdelegationID = null; // Integer | The unique ID of the Usergroupdelegation
try {
    UsergroupdelegationGetObjectV2Response result = apiInstance.usergroupdelegationGetObjectV2(pkiUsergroupdelegationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupdelegationApi#usergroupdelegationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupdelegationID** | **Integer**| The unique ID of the Usergroupdelegation | [default to null]

### Return type

[**UsergroupdelegationGetObjectV2Response**](UsergroupdelegationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

