# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateCreateObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV1) | **POST** /1/object/ezsigntemplate | Create a new Ezsigntemplate
[**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
[**ezsigntemplateEditObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV1) | **PUT** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
[**ezsigntemplateGetAutocompleteV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV1) | **GET** /1/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplate and IDs
[**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
[**ezsigntemplateGetObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV1) | **GET** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate



## ezsigntemplateCreateObjectV1

> EzsigntemplateCreateObjectV1Response ezsigntemplateCreateObjectV1(ezsigntemplateCreateObjectV1Request)

Create a new Ezsigntemplate

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
EzsigntemplateCreateObjectV1Request ezsigntemplateCreateObjectV1Request = new EzsigntemplateCreateObjectV1Request(); // EzsigntemplateCreateObjectV1Request | 
try {
    EzsigntemplateCreateObjectV1Response result = apiInstance.ezsigntemplateCreateObjectV1(ezsigntemplateCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateCreateObjectV1Request** | [**EzsigntemplateCreateObjectV1Request**](EzsigntemplateCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplateCreateObjectV1Response**](EzsigntemplateCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateDeleteObjectV1

> EzsigntemplateDeleteObjectV1Response ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)

Delete an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
try {
    EzsigntemplateDeleteObjectV1Response result = apiInstance.ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID);
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

[**EzsigntemplateDeleteObjectV1Response**](EzsigntemplateDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplateEditObjectV1

> EzsigntemplateEditObjectV1Response ezsigntemplateEditObjectV1(pkiEzsigntemplateID, ezsigntemplateEditObjectV1Request)

Edit an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
EzsigntemplateEditObjectV1Request ezsigntemplateEditObjectV1Request = new EzsigntemplateEditObjectV1Request(); // EzsigntemplateEditObjectV1Request | 
try {
    EzsigntemplateEditObjectV1Response result = apiInstance.ezsigntemplateEditObjectV1(pkiEzsigntemplateID, ezsigntemplateEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]
 **ezsigntemplateEditObjectV1Request** | [**EzsigntemplateEditObjectV1Request**](EzsigntemplateEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplateEditObjectV1Response**](EzsigntemplateEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplateGetAutocompleteV1

> CommonGetAutocompleteV1Response ezsigntemplateGetAutocompleteV1(sSelector, sQuery, acceptLanguage)

Retrieve Ezsigntemplate and IDs

Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
String sSelector = null; // String | The type of Ezsigntemplate to return
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteV1Response result = apiInstance.ezsigntemplateGetAutocompleteV1(sSelector, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsigntemplate to return | [default to null] [enum: All]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

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
Integer iRowOffset = null; // Integer | 
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
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsigntemplateID_ASC, pkiEzsigntemplateID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiUserIDOwner_ASC, fkiUserIDOwner_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC, sEzsigntemplateTypedescriptionX_ASC, sEzsigntemplateTypedescriptionX_DESC, sEzsigntemplatedocumentDescription_ASC, sEzsigntemplatedocumentDescription_DESC, iEzsigntemplatedocumentPagetotal_ASC, iEzsigntemplatedocumentPagetotal_DESC, iEzsigntemplateSignaturetotal_ASC, iEzsigntemplateSignaturetotal_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsigntemplateGetListV1Response**](EzsigntemplateGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsigntemplateGetObjectV1

> EzsigntemplateGetObjectV1Response ezsigntemplateGetObjectV1(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplateApi;

ObjectEzsigntemplateApi apiInstance = new ObjectEzsigntemplateApi();
Integer pkiEzsigntemplateID = null; // Integer | 
try {
    EzsigntemplateGetObjectV1Response result = apiInstance.ezsigntemplateGetObjectV1(pkiEzsigntemplateID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplateGetObjectV1Response**](EzsigntemplateGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

