# ObjectUserstagedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userstagedCreateUserV1**](ObjectUserstagedApi.md#userstagedCreateUserV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/createUser | Create a User from a Userstaged and then map it
[**userstagedDeleteObjectV1**](ObjectUserstagedApi.md#userstagedDeleteObjectV1) | **DELETE** /1/object/userstaged/{pkiUserstagedID} | Delete an existing Userstaged
[**userstagedGetListV1**](ObjectUserstagedApi.md#userstagedGetListV1) | **GET** /1/object/userstaged/getList | Retrieve Userstaged list
[**userstagedGetObjectV2**](ObjectUserstagedApi.md#userstagedGetObjectV2) | **GET** /2/object/userstaged/{pkiUserstagedID} | Retrieve an existing Userstaged
[**userstagedMapV1**](ObjectUserstagedApi.md#userstagedMapV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/map | Map the Userstaged to an existing user



## userstagedCreateUserV1

> UserstagedCreateUserV1Response userstagedCreateUserV1(pkiUserstagedID, body)

Create a User from a Userstaged and then map it

Default values will be used while creating the User. If you need to change those values, you should use the route to edit a User.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | 
Object body = null; // Object | 
try {
    UserstagedCreateUserV1Response result = apiInstance.userstagedCreateUserV1(pkiUserstagedID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedCreateUserV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**UserstagedCreateUserV1Response**](UserstagedCreateUserV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userstagedDeleteObjectV1

> CommonResponse userstagedDeleteObjectV1(pkiUserstagedID)

Delete an existing Userstaged



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | 
try {
    CommonResponse result = apiInstance.userstagedDeleteObjectV1(pkiUserstagedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**|  | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userstagedGetListV1

> UserstagedGetListV1Response userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Userstaged list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    UserstagedGetListV1Response result = apiInstance.userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiUserstagedID_ASC, pkiUserstagedID_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sUserstagedFirstname_ASC, sUserstagedFirstname_DESC, sUserstagedLastname_ASC, sUserstagedLastname_DESC, sUserstagedExternalid_ASC, sUserstagedExternalid_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**UserstagedGetListV1Response**](UserstagedGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## userstagedGetObjectV2

> UserstagedGetObjectV2Response userstagedGetObjectV2(pkiUserstagedID)

Retrieve an existing Userstaged



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | 
try {
    UserstagedGetObjectV2Response result = apiInstance.userstagedGetObjectV2(pkiUserstagedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**|  | [default to null]

### Return type

[**UserstagedGetObjectV2Response**](UserstagedGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userstagedMapV1

> CommonResponse userstagedMapV1(pkiUserstagedID, userstagedMapV1Request)

Map the Userstaged to an existing user



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | 
UserstagedMapV1Request userstagedMapV1Request = new UserstagedMapV1Request(); // UserstagedMapV1Request | 
try {
    CommonResponse result = apiInstance.userstagedMapV1(pkiUserstagedID, userstagedMapV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedMapV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**|  | [default to null]
 **userstagedMapV1Request** | [**UserstagedMapV1Request**](UserstagedMapV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

