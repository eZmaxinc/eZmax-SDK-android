# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldertypeCreateObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV3) | **POST** /3/object/ezsignfoldertype | Create a new Ezsignfoldertype
[**ezsignfoldertypeEditObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV3) | **PUT** /3/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype
[**ezsignfoldertypeGetAutocompleteV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV2) | **GET** /2/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
[**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
[**ezsignfoldertypeGetObjectV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV2) | **GET** /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype
[**ezsignfoldertypeGetObjectV4**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV4) | **GET** /4/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype



## ezsignfoldertypeCreateObjectV3

> EzsignfoldertypeCreateObjectV3Response ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request)

Create a new Ezsignfoldertype

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
EzsignfoldertypeCreateObjectV3Request ezsignfoldertypeCreateObjectV3Request = new EzsignfoldertypeCreateObjectV3Request(); // EzsignfoldertypeCreateObjectV3Request | 
try {
    EzsignfoldertypeCreateObjectV3Response result = apiInstance.ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldertypeCreateObjectV3Request** | [**EzsignfoldertypeCreateObjectV3Request**](EzsignfoldertypeCreateObjectV3Request.md)|  |

### Return type

[**EzsignfoldertypeCreateObjectV3Response**](EzsignfoldertypeCreateObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldertypeEditObjectV3

> EzsignfoldertypeEditObjectV3Response ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request)

Edit an existing Ezsignfoldertype



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
Integer pkiEzsignfoldertypeID = null; // Integer | 
EzsignfoldertypeEditObjectV3Request ezsignfoldertypeEditObjectV3Request = new EzsignfoldertypeEditObjectV3Request(); // EzsignfoldertypeEditObjectV3Request | 
try {
    EzsignfoldertypeEditObjectV3Response result = apiInstance.ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **Integer**|  | [default to null]
 **ezsignfoldertypeEditObjectV3Request** | [**EzsignfoldertypeEditObjectV3Request**](EzsignfoldertypeEditObjectV3Request.md)|  |

### Return type

[**EzsignfoldertypeEditObjectV3Response**](EzsignfoldertypeEditObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfoldertypeGetAutocompleteV2

> EzsignfoldertypeGetAutocompleteV2Response ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.

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
    EzsignfoldertypeGetAutocompleteV2Response result = apiInstance.ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsignfoldertypes to return | [default to null] [enum: Active, All, EzsigntemplateEdit, EzsigntemplateUsergroup]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**EzsignfoldertypeGetAutocompleteV2Response**](EzsignfoldertypeGetAutocompleteV2Response.md)

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
Integer iRowOffset = 0; // Integer | 
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
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsignfoldertypeGetListV1Response**](EzsignfoldertypeGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsignfoldertypeGetObjectV2

> EzsignfoldertypeGetObjectV2Response ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
Integer pkiEzsignfoldertypeID = null; // Integer | 
try {
    EzsignfoldertypeGetObjectV2Response result = apiInstance.ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldertypeGetObjectV2Response**](EzsignfoldertypeGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfoldertypeGetObjectV4

> EzsignfoldertypeGetObjectV4Response ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfoldertypeApi;

ObjectEzsignfoldertypeApi apiInstance = new ObjectEzsignfoldertypeApi();
Integer pkiEzsignfoldertypeID = null; // Integer | 
try {
    EzsignfoldertypeGetObjectV4Response result = apiInstance.ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV4");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **Integer**|  | [default to null]

### Return type

[**EzsignfoldertypeGetObjectV4Response**](EzsignfoldertypeGetObjectV4Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

