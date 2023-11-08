# ObjectClonehistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clonehistoryGetListV1**](ObjectClonehistoryApi.md#clonehistoryGetListV1) | **GET** /1/object/clonehistory/getList | Retrieve Clonehistory list



## clonehistoryGetListV1

> ClonehistoryGetListV1Response clonehistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Clonehistory list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectClonehistoryApi;

ObjectClonehistoryApi apiInstance = new ObjectClonehistoryApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    ClonehistoryGetListV1Response result = apiInstance.clonehistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectClonehistoryApi#clonehistoryGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiClonehistoryID_ASC, pkiClonehistoryID_DESC, fkiUserIDCloning_ASC, fkiUserIDCloning_DESC, fkiUserIDCloned_ASC, fkiUserIDCloned_DESC, dtClonehistoryFirsthit_ASC, dtClonehistoryFirsthit_DESC, dtClonehistoryLasthit_ASC, dtClonehistoryLasthit_DESC, sUserLoginnameCloning_ASC, sUserLoginnameCloning_DESC, sUserFirstnameCloning_ASC, sUserFirstnameCloning_DESC, sUserLastnameCloning_ASC, sUserLastnameCloning_DESC, sUserLoginnameCloned_ASC, sUserLoginnameCloned_DESC, sUserFirstnameCloned_ASC, sUserFirstnameCloned_DESC, sUserLastnameCloned_ASC, sUserLastnameCloned_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**ClonehistoryGetListV1Response**](ClonehistoryGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

