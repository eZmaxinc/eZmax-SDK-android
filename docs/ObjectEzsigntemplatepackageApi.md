# ObjectEzsigntemplatepackageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackageCreateObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage
[**ezsigntemplatepackageDeleteObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage
[**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners
[**ezsigntemplatepackageEditObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage
[**ezsigntemplatepackageGetAutocompleteV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV2) | **GET** /2/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
[**ezsigntemplatepackageGetListV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
[**ezsigntemplatepackageGetObjectV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV2) | **GET** /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage



## ezsigntemplatepackageCreateObjectV1

> EzsigntemplatepackageCreateObjectV1Response ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request)

Create a new Ezsigntemplatepackage

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
EzsigntemplatepackageCreateObjectV1Request ezsigntemplatepackageCreateObjectV1Request = new EzsigntemplatepackageCreateObjectV1Request(); // EzsigntemplatepackageCreateObjectV1Request | 
try {
    EzsigntemplatepackageCreateObjectV1Response result = apiInstance.ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackageCreateObjectV1Request** | [**EzsigntemplatepackageCreateObjectV1Request**](EzsigntemplatepackageCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepackageCreateObjectV1Response**](EzsigntemplatepackageCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackageDeleteObjectV1

> CommonResponse ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)

Delete an existing Ezsigntemplatepackage



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
Integer pkiEzsigntemplatepackageID = null; // Integer | 
try {
    CommonResponse result = apiInstance.ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **Integer**|  | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackageEditEzsigntemplatepackagesignersV1

> EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request)

Edit multiple Ezsigntemplatepackagesigners

Using this endpoint, you can edit multiple Ezsigntemplatepackagesigners at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
Integer pkiEzsigntemplatepackageID = null; // Integer | 
EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request = new EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request(); // EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request | 
try {
    EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response result = apiInstance.ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **Integer**|  | [default to null]
 **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request** | [**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request.md)|  |

### Return type

[**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackageEditObjectV1

> CommonResponse ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request)

Edit an existing Ezsigntemplatepackage



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
Integer pkiEzsigntemplatepackageID = null; // Integer | 
EzsigntemplatepackageEditObjectV1Request ezsigntemplatepackageEditObjectV1Request = new EzsigntemplatepackageEditObjectV1Request(); // EzsigntemplatepackageEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **Integer**|  | [default to null]
 **ezsigntemplatepackageEditObjectV1Request** | [**EzsigntemplatepackageEditObjectV1Request**](EzsigntemplatepackageEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepackageGetAutocompleteV2

> EzsigntemplatepackageGetAutocompleteV2Response ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)

Retrieve Ezsigntemplatepackages and IDs

Get the list of Ezsigntemplatepackage to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
String sSelector = null; // String | The type of Ezsigntemplatepackages to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
Integer fkiEzsignfoldertypeID = null; // Integer | The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic
try {
    EzsigntemplatepackageGetAutocompleteV2Response result = apiInstance.ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsigntemplatepackages to return | [default to null] [enum: All, AllMultipleCopiesDisabled, Ezsigntemplatepublic]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **fkiEzsignfoldertypeID** | **Integer**| The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic | [optional] [default to null]

### Return type

[**EzsigntemplatepackageGetAutocompleteV2Response**](EzsigntemplatepackageGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepackageGetListV1

> EzsigntemplatepackageGetListV1Response ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepackage list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsigntemplatepackageGetListV1Response result = apiInstance.ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsigntemplatepackageID_ASC, pkiEzsigntemplatepackageID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplatepackageType_ASC, eEzsigntemplatepackageType_DESC, sEzsigntemplatepackageTypedescriptionX_ASC, sEzsigntemplatepackageTypedescriptionX_DESC, sEzsigntemplatepackageDescription_ASC, sEzsigntemplatepackageDescription_DESC, bEzsigntemplatepackageNeedvalidation_ASC, bEzsigntemplatepackageNeedvalidation_DESC, iEzsigntemplatepackagemembership_ASC, iEzsigntemplatepackagemembership_DESC, bEzsigntemplatepackageIsactive_ASC, bEzsigntemplatepackageIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsigntemplatepackageGetListV1Response**](EzsigntemplatepackageGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsigntemplatepackageGetObjectV2

> EzsigntemplatepackageGetObjectV2Response ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID)

Retrieve an existing Ezsigntemplatepackage



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
Integer pkiEzsigntemplatepackageID = null; // Integer | 
try {
    EzsigntemplatepackageGetObjectV2Response result = apiInstance.ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepackageGetObjectV2Response**](EzsigntemplatepackageGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

