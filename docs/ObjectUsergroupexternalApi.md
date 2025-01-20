# ObjectUsergroupexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupexternalCreateObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalCreateObjectV1) | **POST** /1/object/usergroupexternal | Create a new Usergroupexternal
[**usergroupexternalDeleteObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalDeleteObjectV1) | **DELETE** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Delete an existing Usergroupexternal
[**usergroupexternalEditObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalEditObjectV1) | **PUT** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Edit an existing Usergroupexternal
[**usergroupexternalGetAutocompleteV2**](ObjectUsergroupexternalApi.md#usergroupexternalGetAutocompleteV2) | **GET** /2/object/usergroupexternal/getAutocomplete/{sSelector} | Retrieve Usergroupexternals and IDs
[**usergroupexternalGetListV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetListV1) | **GET** /1/object/usergroupexternal/getList | Retrieve Usergroupexternal list
[**usergroupexternalGetObjectV2**](ObjectUsergroupexternalApi.md#usergroupexternalGetObjectV2) | **GET** /2/object/usergroupexternal/{pkiUsergroupexternalID} | Retrieve an existing Usergroupexternal
[**usergroupexternalGetUsergroupexternalmembershipsV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupexternalmembershipsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships | Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships
[**usergroupexternalGetUsergroupsV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroups | Get Usergroupexternal&#39;s Usergroups



## usergroupexternalCreateObjectV1

> UsergroupexternalCreateObjectV1Response usergroupexternalCreateObjectV1(usergroupexternalCreateObjectV1Request)

Create a new Usergroupexternal

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
UsergroupexternalCreateObjectV1Request usergroupexternalCreateObjectV1Request = new UsergroupexternalCreateObjectV1Request(); // UsergroupexternalCreateObjectV1Request | 
try {
    UsergroupexternalCreateObjectV1Response result = apiInstance.usergroupexternalCreateObjectV1(usergroupexternalCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupexternalCreateObjectV1Request** | [**UsergroupexternalCreateObjectV1Request**](UsergroupexternalCreateObjectV1Request.md)|  |

### Return type

[**UsergroupexternalCreateObjectV1Response**](UsergroupexternalCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupexternalDeleteObjectV1

> CommonResponse usergroupexternalDeleteObjectV1(pkiUsergroupexternalID)

Delete an existing Usergroupexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
Integer pkiUsergroupexternalID = null; // Integer | The unique ID of the Usergroupexternal
try {
    CommonResponse result = apiInstance.usergroupexternalDeleteObjectV1(pkiUsergroupexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupexternalID** | **Integer**| The unique ID of the Usergroupexternal | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupexternalEditObjectV1

> CommonResponse usergroupexternalEditObjectV1(pkiUsergroupexternalID, usergroupexternalEditObjectV1Request)

Edit an existing Usergroupexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
Integer pkiUsergroupexternalID = null; // Integer | The unique ID of the Usergroupexternal
UsergroupexternalEditObjectV1Request usergroupexternalEditObjectV1Request = new UsergroupexternalEditObjectV1Request(); // UsergroupexternalEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.usergroupexternalEditObjectV1(pkiUsergroupexternalID, usergroupexternalEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupexternalID** | **Integer**| The unique ID of the Usergroupexternal | [default to null]
 **usergroupexternalEditObjectV1Request** | [**UsergroupexternalEditObjectV1Request**](UsergroupexternalEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupexternalGetAutocompleteV2

> UsergroupexternalGetAutocompleteV2Response usergroupexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Usergroupexternals and IDs

Get the list of Usergroupexternal to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
String sSelector = null; // String | The type of Usergroupexternals to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    UsergroupexternalGetAutocompleteV2Response result = apiInstance.usergroupexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Usergroupexternals to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**UsergroupexternalGetAutocompleteV2Response**](UsergroupexternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupexternalGetListV1

> UsergroupexternalGetListV1Response usergroupexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Usergroupexternal list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    UsergroupexternalGetListV1Response result = apiInstance.usergroupexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiUsergroupexternalID_ASC, pkiUsergroupexternalID_DESC, sUsergroupexternalName_ASC, sUsergroupexternalName_DESC, sUsergroupexternalID_ASC, sUsergroupexternalID_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**UsergroupexternalGetListV1Response**](UsergroupexternalGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## usergroupexternalGetObjectV2

> UsergroupexternalGetObjectV2Response usergroupexternalGetObjectV2(pkiUsergroupexternalID)

Retrieve an existing Usergroupexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
Integer pkiUsergroupexternalID = null; // Integer | The unique ID of the Usergroupexternal
try {
    UsergroupexternalGetObjectV2Response result = apiInstance.usergroupexternalGetObjectV2(pkiUsergroupexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupexternalID** | **Integer**| The unique ID of the Usergroupexternal | [default to null]

### Return type

[**UsergroupexternalGetObjectV2Response**](UsergroupexternalGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupexternalGetUsergroupexternalmembershipsV1

> UsergroupexternalGetUsergroupexternalmembershipsV1Response usergroupexternalGetUsergroupexternalmembershipsV1(pkiUsergroupexternalID)

Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
Integer pkiUsergroupexternalID = null; // Integer | 
try {
    UsergroupexternalGetUsergroupexternalmembershipsV1Response result = apiInstance.usergroupexternalGetUsergroupexternalmembershipsV1(pkiUsergroupexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupexternalmembershipsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupexternalID** | **Integer**|  | [default to null]

### Return type

[**UsergroupexternalGetUsergroupexternalmembershipsV1Response**](UsergroupexternalGetUsergroupexternalmembershipsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupexternalGetUsergroupsV1

> UsergroupexternalGetUsergroupsV1Response usergroupexternalGetUsergroupsV1(pkiUsergroupexternalID)

Get Usergroupexternal&#39;s Usergroups

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupexternalApi;

ObjectUsergroupexternalApi apiInstance = new ObjectUsergroupexternalApi();
Integer pkiUsergroupexternalID = null; // Integer | 
try {
    UsergroupexternalGetUsergroupsV1Response result = apiInstance.usergroupexternalGetUsergroupsV1(pkiUsergroupexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupexternalID** | **Integer**|  | [default to null]

### Return type

[**UsergroupexternalGetUsergroupsV1Response**](UsergroupexternalGetUsergroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

