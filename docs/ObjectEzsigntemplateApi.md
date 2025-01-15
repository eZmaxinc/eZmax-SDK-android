# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateCopyV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCopyV1) | **POST** /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy | Copy the Ezsigntemplate
[**ezsigntemplateCreateObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV3) | **POST** /3/object/ezsigntemplate | Create a new Ezsigntemplate
[**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
[**ezsigntemplateEditObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV3) | **PUT** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
[**ezsigntemplateGetAutocompleteV2**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs
[**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
[**ezsigntemplateGetObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV3) | **GET** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate



## ezsigntemplateCopyV1

> EzsigntemplateCopyV1Response ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request)

Copy the Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
EzsigntemplateCopyV1Request ezsigntemplateCopyV1Request = new EzsigntemplateCopyV1Request(); // EzsigntemplateCopyV1Request | 
try {
    EzsigntemplateCopyV1Response result = apiInstance.ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateCopyV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]
 **ezsigntemplateCopyV1Request** | [**EzsigntemplateCopyV1Request**](EzsigntemplateCopyV1Request.md)|  |

### Return type

[**EzsigntemplateCopyV1Response**](EzsigntemplateCopyV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateCreateObjectV3

> EzsigntemplateCreateObjectV3Response ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request)

Create a new Ezsigntemplate

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
EzsigntemplateCreateObjectV3Request ezsigntemplateCreateObjectV3Request = new EzsigntemplateCreateObjectV3Request(); // EzsigntemplateCreateObjectV3Request | 
try {
    EzsigntemplateCreateObjectV3Response result = apiInstance.ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateCreateObjectV3Request** | [**EzsigntemplateCreateObjectV3Request**](EzsigntemplateCreateObjectV3Request.md)|  |

### Return type

[**EzsigntemplateCreateObjectV3Response**](EzsigntemplateCreateObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateDeleteObjectV1

> CommonResponse ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)

Delete an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
try {
    CommonResponse result = apiInstance.ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateEditObjectV3

> CommonResponse ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request)

Edit an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
EzsigntemplateEditObjectV3Request ezsigntemplateEditObjectV3Request = new EzsigntemplateEditObjectV3Request(); // EzsigntemplateEditObjectV3Request | 
try {
    CommonResponse result = apiInstance.ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]
 **ezsigntemplateEditObjectV3Request** | [**EzsigntemplateEditObjectV3Request**](EzsigntemplateEditObjectV3Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateGetAutocompleteV2

> EzsigntemplateGetAutocompleteV2Response ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)

Retrieve Ezsigntemplates and IDs

Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
String sSelector = null; // String | The type of Ezsigntemplates to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
Integer fkiEzsignfoldertypeID = null; // Integer | The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic
try {
    EzsigntemplateGetAutocompleteV2Response result = apiInstance.ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsigntemplates to return | [default to null] [enum: All, Ezsigntemplatepublic]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **fkiEzsignfoldertypeID** | **Integer**| The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic | [optional] [default to null]

### Return type

[**EzsigntemplateGetAutocompleteV2Response**](EzsigntemplateGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateGetListV1

> EzsigntemplateGetListV1Response ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplate list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplateType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup | 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsigntemplateGetListV1Response result = apiInstance.ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsigntemplateID_ASC, pkiEzsigntemplateID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiUserIDOwner_ASC, fkiUserIDOwner_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC, sEzsigntemplateDescription_ASC, sEzsigntemplateDescription_DESC, sEzsigntemplatedocumentDescription_ASC, sEzsigntemplatedocumentDescription_DESC, iEzsigntemplatedocumentPagetotal_ASC, iEzsigntemplatedocumentPagetotal_DESC, iEzsigntemplateSignaturetotal_ASC, iEzsigntemplateSignaturetotal_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsigntemplateGetListV1Response**](EzsigntemplateGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsigntemplateGetObjectV3

> EzsigntemplateGetObjectV3Response ezsigntemplateGetObjectV3(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
try {
    EzsigntemplateGetObjectV3Response result = apiInstance.ezsigntemplateGetObjectV3(pkiEzsigntemplateID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplateGetObjectV3Response**](EzsigntemplateGetObjectV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

