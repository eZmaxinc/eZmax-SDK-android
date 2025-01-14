# ObjectAuthenticationexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationexternalCreateObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalCreateObjectV1) | **POST** /1/object/authenticationexternal | Create a new Authenticationexternal
[**authenticationexternalDeleteObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalDeleteObjectV1) | **DELETE** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Delete an existing Authenticationexternal
[**authenticationexternalEditObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalEditObjectV1) | **PUT** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Edit an existing Authenticationexternal
[**authenticationexternalGetAutocompleteV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetAutocompleteV2) | **GET** /2/object/authenticationexternal/getAutocomplete/{sSelector} | Retrieve Authenticationexternals and IDs
[**authenticationexternalGetListV1**](ObjectAuthenticationexternalApi.md#authenticationexternalGetListV1) | **GET** /1/object/authenticationexternal/getList | Retrieve Authenticationexternal list
[**authenticationexternalGetObjectV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetObjectV2) | **GET** /2/object/authenticationexternal/{pkiAuthenticationexternalID} | Retrieve an existing Authenticationexternal
[**authenticationexternalResetAuthorizationV1**](ObjectAuthenticationexternalApi.md#authenticationexternalResetAuthorizationV1) | **POST** /1/object/authenticationexternal/{pkiAuthenticationexternalID}/resetAuthorization | Reset the Authenticationexternal authorization



## authenticationexternalCreateObjectV1

> AuthenticationexternalCreateObjectV1Response authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request)

Create a new Authenticationexternal

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
AuthenticationexternalCreateObjectV1Request authenticationexternalCreateObjectV1Request = new AuthenticationexternalCreateObjectV1Request(); // AuthenticationexternalCreateObjectV1Request | 
try {
    AuthenticationexternalCreateObjectV1Response result = apiInstance.authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationexternalCreateObjectV1Request** | [**AuthenticationexternalCreateObjectV1Request**](AuthenticationexternalCreateObjectV1Request.md)|  |

### Return type

[**AuthenticationexternalCreateObjectV1Response**](AuthenticationexternalCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## authenticationexternalDeleteObjectV1

> AuthenticationexternalDeleteObjectV1Response authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID)

Delete an existing Authenticationexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
Integer pkiAuthenticationexternalID = null; // Integer | The unique ID of the Authenticationexternal
try {
    AuthenticationexternalDeleteObjectV1Response result = apiInstance.authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | [default to null]

### Return type

[**AuthenticationexternalDeleteObjectV1Response**](AuthenticationexternalDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## authenticationexternalEditObjectV1

> AuthenticationexternalEditObjectV1Response authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request)

Edit an existing Authenticationexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
Integer pkiAuthenticationexternalID = null; // Integer | The unique ID of the Authenticationexternal
AuthenticationexternalEditObjectV1Request authenticationexternalEditObjectV1Request = new AuthenticationexternalEditObjectV1Request(); // AuthenticationexternalEditObjectV1Request | 
try {
    AuthenticationexternalEditObjectV1Response result = apiInstance.authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | [default to null]
 **authenticationexternalEditObjectV1Request** | [**AuthenticationexternalEditObjectV1Request**](AuthenticationexternalEditObjectV1Request.md)|  |

### Return type

[**AuthenticationexternalEditObjectV1Response**](AuthenticationexternalEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## authenticationexternalGetAutocompleteV2

> AuthenticationexternalGetAutocompleteV2Response authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Authenticationexternals and IDs

Get the list of Authenticationexternal to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
String sSelector = null; // String | The type of Authenticationexternals to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    AuthenticationexternalGetAutocompleteV2Response result = apiInstance.authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Authenticationexternals to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**AuthenticationexternalGetAutocompleteV2Response**](AuthenticationexternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## authenticationexternalGetListV1

> AuthenticationexternalGetListV1Response authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Authenticationexternal list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eAuthenticationexternalType | Salesforce&lt;br&gt;SalesforceSandbox |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    AuthenticationexternalGetListV1Response result = apiInstance.authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiAuthenticationexternalID_ASC, pkiAuthenticationexternalID_DESC, sAuthenticationexternalDescription_ASC, sAuthenticationexternalDescription_DESC, eAuthenticationexternalType_ASC, eAuthenticationexternalType_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**AuthenticationexternalGetListV1Response**](AuthenticationexternalGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## authenticationexternalGetObjectV2

> AuthenticationexternalGetObjectV2Response authenticationexternalGetObjectV2(pkiAuthenticationexternalID)

Retrieve an existing Authenticationexternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
Integer pkiAuthenticationexternalID = null; // Integer | The unique ID of the Authenticationexternal
try {
    AuthenticationexternalGetObjectV2Response result = apiInstance.authenticationexternalGetObjectV2(pkiAuthenticationexternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAuthenticationexternalID** | **Integer**| The unique ID of the Authenticationexternal | [default to null]

### Return type

[**AuthenticationexternalGetObjectV2Response**](AuthenticationexternalGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## authenticationexternalResetAuthorizationV1

> AuthenticationexternalResetAuthorizationV1Response authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body)

Reset the Authenticationexternal authorization



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAuthenticationexternalApi;

ObjectAuthenticationexternalApi apiInstance = new ObjectAuthenticationexternalApi();
Integer pkiAuthenticationexternalID = null; // Integer | 
Object body = null; // Object | 
try {
    AuthenticationexternalResetAuthorizationV1Response result = apiInstance.authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAuthenticationexternalApi#authenticationexternalResetAuthorizationV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAuthenticationexternalID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**AuthenticationexternalResetAuthorizationV1Response**](AuthenticationexternalResetAuthorizationV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

