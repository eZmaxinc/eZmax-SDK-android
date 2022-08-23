# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldertypeCreateObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV1) | **POST** /1/object/ezsignfoldertype | Create a new Ezsignfoldertype
[**ezsignfoldertypeEditObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV1) | **PUT** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype
[**ezsignfoldertypeGetAutocompleteV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
[**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
[**ezsignfoldertypeGetObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV1) | **GET** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype



## ezsignfoldertypeCreateObjectV1

> EzsignfoldertypeCreateObjectV1Response ezsignfoldertypeCreateObjectV1(ezsignfoldertypeCreateObjectV1Request)

Create a new Ezsignfoldertype

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
EzsignfoldertypeCreateObjectV1Request ezsignfoldertypeCreateObjectV1Request = new EzsignfoldertypeCreateObjectV1Request(); // EzsignfoldertypeCreateObjectV1Request | 
try {
    EzsignfoldertypeCreateObjectV1Response result = apiInstance.ezsignfoldertypeCreateObjectV1(ezsignfoldertypeCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldertypeCreateObjectV1Request** | [**EzsignfoldertypeCreateObjectV1Request**](EzsignfoldertypeCreateObjectV1Request.md)|  |

### Return type

[**EzsignfoldertypeCreateObjectV1Response**](EzsignfoldertypeCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldertypeEditObjectV1

> EzsignfoldertypeEditObjectV1Response ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV1Request)

Edit an existing Ezsignfoldertype



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
Integer pkiEzsignfoldertypeID = null; // Integer | 
EzsignfoldertypeEditObjectV1Request ezsignfoldertypeEditObjectV1Request = new EzsignfoldertypeEditObjectV1Request(); // EzsignfoldertypeEditObjectV1Request | 
try {
    EzsignfoldertypeEditObjectV1Response result = apiInstance.ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **Integer**|  | [default to null]
 **ezsignfoldertypeEditObjectV1Request** | [**EzsignfoldertypeEditObjectV1Request**](EzsignfoldertypeEditObjectV1Request.md)|  |

### Return type

[**EzsignfoldertypeEditObjectV1Response**](EzsignfoldertypeEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldertypeGetAutocompleteV1

> CommonGetAutocompleteV1Response ezsignfoldertypeGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
String sSelector = null; // String | The type of Ezsignfoldertypes to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteV1Response result = apiInstance.ezsignfoldertypeGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsignfoldertypes to return | [default to null] [enum: Active, All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldertypeGetListV1

> EzsignfoldertypeGetListV1Response ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfoldertype list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = null; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsignfoldertypeGetListV1Response result = apiInstance.ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsignfoldertypeID_ASC, pkiEzsignfoldertypeID_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, bEzsignfoldertypeIsactive_ASC, bEzsignfoldertypeIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsignfoldertypeGetListV1Response**](EzsignfoldertypeGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsignfoldertypeGetObjectV1

> EzsignfoldertypeGetObjectV1Response ezsignfoldertypeGetObjectV1(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
Integer pkiEzsignfoldertypeID = null; // Integer | 
try {
    EzsignfoldertypeGetObjectV1Response result = apiInstance.ezsignfoldertypeGetObjectV1(pkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldertypeGetObjectV1Response**](EzsignfoldertypeGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

