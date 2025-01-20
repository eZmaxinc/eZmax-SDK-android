# ObjectUsergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupmembershipCreateObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipCreateObjectV1) | **POST** /1/object/usergroupmembership | Create a new Usergroupmembership
[**usergroupmembershipDeleteObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipDeleteObjectV1) | **DELETE** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Delete an existing Usergroupmembership
[**usergroupmembershipEditObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipEditObjectV1) | **PUT** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Edit an existing Usergroupmembership
[**usergroupmembershipGetObjectV2**](ObjectUsergroupmembershipApi.md#usergroupmembershipGetObjectV2) | **GET** /2/object/usergroupmembership/{pkiUsergroupmembershipID} | Retrieve an existing Usergroupmembership



## usergroupmembershipCreateObjectV1

> UsergroupmembershipCreateObjectV1Response usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request)

Create a new Usergroupmembership

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupmembershipApi;

ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi();
UsergroupmembershipCreateObjectV1Request usergroupmembershipCreateObjectV1Request = new UsergroupmembershipCreateObjectV1Request(); // UsergroupmembershipCreateObjectV1Request | 
try {
    UsergroupmembershipCreateObjectV1Response result = apiInstance.usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupmembershipCreateObjectV1Request** | [**UsergroupmembershipCreateObjectV1Request**](UsergroupmembershipCreateObjectV1Request.md)|  |

### Return type

[**UsergroupmembershipCreateObjectV1Response**](UsergroupmembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupmembershipDeleteObjectV1

> CommonResponse usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)

Delete an existing Usergroupmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupmembershipApi;

ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi();
Integer pkiUsergroupmembershipID = null; // Integer | 
try {
    CommonResponse result = apiInstance.usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **Integer**|  | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupmembershipEditObjectV1

> CommonResponse usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request)

Edit an existing Usergroupmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupmembershipApi;

ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi();
Integer pkiUsergroupmembershipID = null; // Integer | 
UsergroupmembershipEditObjectV1Request usergroupmembershipEditObjectV1Request = new UsergroupmembershipEditObjectV1Request(); // UsergroupmembershipEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **Integer**|  | [default to null]
 **usergroupmembershipEditObjectV1Request** | [**UsergroupmembershipEditObjectV1Request**](UsergroupmembershipEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupmembershipGetObjectV2

> UsergroupmembershipGetObjectV2Response usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)

Retrieve an existing Usergroupmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupmembershipApi;

ObjectUsergroupmembershipApi apiInstance = new ObjectUsergroupmembershipApi();
Integer pkiUsergroupmembershipID = null; // Integer | 
try {
    UsergroupmembershipGetObjectV2Response result = apiInstance.usergroupmembershipGetObjectV2(pkiUsergroupmembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **Integer**|  | [default to null]

### Return type

[**UsergroupmembershipGetObjectV2Response**](UsergroupmembershipGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

