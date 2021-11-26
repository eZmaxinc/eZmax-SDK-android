# ObjectEzsigntemplatepackageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackageGetListV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list



## ezsigntemplatepackageGetListV1

> EzsigntemplatepackageGetListV1Response ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepackage list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Department&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepackageApi;

ObjectEzsigntemplatepackageApi apiInstance = new ObjectEzsigntemplatepackageApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = null; // Integer | 
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
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsigntemplatepackageID_ASC, pkiEzsigntemplatepackageID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplatepackageType_ASC, eEzsigntemplatepackageType_DESC, sEzsigntemplatepackageDescription_ASC, sEzsigntemplatepackageDescription_DESC, bEzsigntemplatepackageIsactive_ASC, bEzsigntemplatepackageIsactive_DESC, iEzsigntemplatepackagemembership_ASC, iEzsigntemplatepackagemembership_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsigntemplatepackageGetListV1Response**](EzsigntemplatepackageGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

