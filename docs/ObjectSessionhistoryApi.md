# ObjectSessionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sessionhistoryGetListV1**](ObjectSessionhistoryApi.md#sessionhistoryGetListV1) | **GET** /1/object/sessionhistory/getList | Retrieve Sessionhistory list



## sessionhistoryGetListV1

> SessionhistoryGetListV1Response sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Sessionhistory list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSessionhistoryApi;

ObjectSessionhistoryApi apiInstance = new ObjectSessionhistoryApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = 10000; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    SessionhistoryGetListV1Response result = apiInstance.sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSessionhistoryApi#sessionhistoryGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiSessionhistoryID_ASC, pkiSessionhistoryID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiUserID_ASC, fkiUserID_DESC, dtSessionhistoryFirsthit_ASC, dtSessionhistoryFirsthit_DESC, dtSessionhistoryLasthit_ASC, dtSessionhistoryLasthit_DESC, eSessionhistoryEndby_ASC, eSessionhistoryEndby_DESC, sComputerDescription_ASC, sComputerDescription_DESC, sSessionhistoryDuration_ASC, sSessionhistoryDuration_DESC, sSessionhistoryIP_ASC, sSessionhistoryIP_DESC, sUserLoginname_ASC, sUserLoginname_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to 10000]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**SessionhistoryGetListV1Response**](SessionhistoryGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

