# ObjectUserstagedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userstagedDeleteObjectV1**](ObjectUserstagedApi.md#userstagedDeleteObjectV1) | **DELETE** /1/object/userstaged/{pkiUserstagedID} | Delete an existing Userstaged
[**userstagedGetListV1**](ObjectUserstagedApi.md#userstagedGetListV1) | **GET** /1/object/userstaged/getList | Retrieve Userstaged list
[**userstagedGetObjectV2**](ObjectUserstagedApi.md#userstagedGetObjectV2) | **GET** /2/object/userstaged/{pkiUserstagedID} | Retrieve an existing Userstaged
[**userstagedMapV1**](ObjectUserstagedApi.md#userstagedMapV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/map | Map the Userstaged to an existing user



## userstagedDeleteObjectV1

> UserstagedDeleteObjectV1Response userstagedDeleteObjectV1(pkiUserstagedID)

Delete an existing Userstaged



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | The unique ID of the Userstaged
try {
    UserstagedDeleteObjectV1Response result = apiInstance.userstagedDeleteObjectV1(pkiUserstagedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**| The unique ID of the Userstaged | [default to null]

### Return type

[**UserstagedDeleteObjectV1Response**](UserstagedDeleteObjectV1Response.md)

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
Integer iRowMax = 10000; // Integer | 
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
 **iRowMax** | **Integer**|  | [optional] [default to 10000]
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
Integer pkiUserstagedID = null; // Integer | The unique ID of the Userstaged
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
 **pkiUserstagedID** | **Integer**| The unique ID of the Userstaged | [default to null]

### Return type

[**UserstagedGetObjectV2Response**](UserstagedGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userstagedMapV1

> UserstagedMapV1Response userstagedMapV1(pkiUserstagedID, userstagedMapV1Request)

Map the Userstaged to an existing user



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserstagedApi;

ObjectUserstagedApi apiInstance = new ObjectUserstagedApi();
Integer pkiUserstagedID = null; // Integer | The unique ID of the Userstaged
UserstagedMapV1Request userstagedMapV1Request = new UserstagedMapV1Request(); // UserstagedMapV1Request | 
try {
    UserstagedMapV1Response result = apiInstance.userstagedMapV1(pkiUserstagedID, userstagedMapV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserstagedApi#userstagedMapV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **Integer**| The unique ID of the Userstaged | [default to null]
 **userstagedMapV1Request** | [**UserstagedMapV1Request**](UserstagedMapV1Request.md)|  |

### Return type

[**UserstagedMapV1Response**](UserstagedMapV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

