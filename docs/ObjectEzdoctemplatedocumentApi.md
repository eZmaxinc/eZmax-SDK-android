# ObjectEzdoctemplatedocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezdoctemplatedocumentCreateObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentCreateObjectV1) | **POST** /1/object/ezdoctemplatedocument | Create a new Ezdoctemplatedocument
[**ezdoctemplatedocumentDownloadV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentDownloadV1) | **GET** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}/download | Retrieve the content
[**ezdoctemplatedocumentEditObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentEditObjectV1) | **PUT** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Edit an existing Ezdoctemplatedocument
[**ezdoctemplatedocumentGetAutocompleteV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetAutocompleteV2) | **GET** /2/object/ezdoctemplatedocument/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatedocuments and IDs
[**ezdoctemplatedocumentGetListV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetListV1) | **GET** /1/object/ezdoctemplatedocument/getList | Retrieve Ezdoctemplatedocument list
[**ezdoctemplatedocumentGetObjectV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetObjectV2) | **GET** /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Retrieve an existing Ezdoctemplatedocument
[**ezdoctemplatedocumentPatchObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Patch an existing Ezdoctemplatedocument



## ezdoctemplatedocumentCreateObjectV1

> EzdoctemplatedocumentCreateObjectV1Response ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request)

Create a new Ezdoctemplatedocument

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
EzdoctemplatedocumentCreateObjectV1Request ezdoctemplatedocumentCreateObjectV1Request = new EzdoctemplatedocumentCreateObjectV1Request(); // EzdoctemplatedocumentCreateObjectV1Request | 
try {
    EzdoctemplatedocumentCreateObjectV1Response result = apiInstance.ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezdoctemplatedocumentCreateObjectV1Request** | [**EzdoctemplatedocumentCreateObjectV1Request**](EzdoctemplatedocumentCreateObjectV1Request.md)|  |

### Return type

[**EzdoctemplatedocumentCreateObjectV1Response**](EzdoctemplatedocumentCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezdoctemplatedocumentDownloadV1

> ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an ezdoctemplatedocument.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
Integer pkiEzdoctemplatedocumentID = null; // Integer | 
try {
    apiInstance.ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzdoctemplatedocumentID** | **Integer**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezdoctemplatedocumentEditObjectV1

> CommonResponse ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request)

Edit an existing Ezdoctemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
Integer pkiEzdoctemplatedocumentID = null; // Integer | The unique ID of the Ezdoctemplatedocument
EzdoctemplatedocumentEditObjectV1Request ezdoctemplatedocumentEditObjectV1Request = new EzdoctemplatedocumentEditObjectV1Request(); // EzdoctemplatedocumentEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | [default to null]
 **ezdoctemplatedocumentEditObjectV1Request** | [**EzdoctemplatedocumentEditObjectV1Request**](EzdoctemplatedocumentEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezdoctemplatedocumentGetAutocompleteV2

> EzdoctemplatedocumentGetAutocompleteV2Response ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezdoctemplatedocuments and IDs

Get the list of Ezdoctemplatedocument to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
String sSelector = null; // String | The type of Ezdoctemplatedocuments to return
String eType = CompanyEzsignfoldertype; // String | The type of Ezdoctemplatedocument
String fkiEzsignfoldertypeID = null; // String | Specify which fkiEzsignfoldertypeID we want to display. only used when eType = Ezsignfoldertype
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    EzdoctemplatedocumentGetAutocompleteV2Response result = apiInstance.ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezdoctemplatedocuments to return | [default to null] [enum: All, Ezsignfolder, Ezsignfoldersignerassociations]
 **eType** | **String**| The type of Ezdoctemplatedocument | [default to CompanyEzsignfoldertype] [enum: User, Company, Ezsignfoldertype, CompanyUser, CompanyEzsignfoldertype]
 **fkiEzsignfoldertypeID** | **String**| Specify which fkiEzsignfoldertypeID we want to display. only used when eType &#x3D; Ezsignfoldertype | [optional] [default to null]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**EzdoctemplatedocumentGetAutocompleteV2Response**](EzdoctemplatedocumentGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezdoctemplatedocumentGetListV1

> EzdoctemplatedocumentGetListV1Response ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezdoctemplatedocument list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzdoctemplatedocumentGetListV1Response result = apiInstance.ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzdoctemplatedocumentID_ASC, pkiEzdoctemplatedocumentID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, fkiEzdoctemplatetypeID_ASC, fkiEzdoctemplatetypeID_DESC, fkiEzdoctemplatefieldtypecategoryID_ASC, fkiEzdoctemplatefieldtypecategoryID_DESC, bEzdoctemplatedocumentIsactive_ASC, bEzdoctemplatedocumentIsactive_DESC, sEzdoctemplatedocumentNameX_ASC, sEzdoctemplatedocumentNameX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzdoctemplatedocumentGetListV1Response**](EzdoctemplatedocumentGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezdoctemplatedocumentGetObjectV2

> EzdoctemplatedocumentGetObjectV2Response ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID)

Retrieve an existing Ezdoctemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
Integer pkiEzdoctemplatedocumentID = null; // Integer | The unique ID of the Ezdoctemplatedocument
try {
    EzdoctemplatedocumentGetObjectV2Response result = apiInstance.ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | [default to null]

### Return type

[**EzdoctemplatedocumentGetObjectV2Response**](EzdoctemplatedocumentGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezdoctemplatedocumentPatchObjectV1

> CommonResponse ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request)

Patch an existing Ezdoctemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzdoctemplatedocumentApi;

ObjectEzdoctemplatedocumentApi apiInstance = new ObjectEzdoctemplatedocumentApi();
Integer pkiEzdoctemplatedocumentID = null; // Integer | The unique ID of the Ezdoctemplatedocument
EzdoctemplatedocumentPatchObjectV1Request ezdoctemplatedocumentPatchObjectV1Request = new EzdoctemplatedocumentPatchObjectV1Request(); // EzdoctemplatedocumentPatchObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzdoctemplatedocumentID** | **Integer**| The unique ID of the Ezdoctemplatedocument | [default to null]
 **ezdoctemplatedocumentPatchObjectV1Request** | [**EzdoctemplatedocumentPatchObjectV1Request**](EzdoctemplatedocumentPatchObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

