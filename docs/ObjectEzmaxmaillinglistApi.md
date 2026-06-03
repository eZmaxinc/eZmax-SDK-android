# ObjectEzmaxmaillinglistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxmaillinglistGetListV1**](ObjectEzmaxmaillinglistApi.md#ezmaxmaillinglistGetListV1) | **GET** /1/object/ezmaxmaillinglist/getList | Retrieve Ezmaxmaillinglist list



## ezmaxmaillinglistGetListV1

> EzmaxmaillinglistGetListV1Response ezmaxmaillinglistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezmaxmaillinglist list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxmaillinglistApi;

ObjectEzmaxmaillinglistApi apiInstance = new ObjectEzmaxmaillinglistApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzmaxmaillinglistGetListV1Response result = apiInstance.ezmaxmaillinglistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxmaillinglistApi#ezmaxmaillinglistGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzmaxmaillinglistID_ASC, pkiEzmaxmaillinglistID_DESC, sEzmaxmaillinglistNameX_ASC, sEzmaxmaillinglistNameX_DESC, sEzmaxmaillinglistDescriptionX_ASC, sEzmaxmaillinglistDescriptionX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzmaxmaillinglistGetListV1Response**](EzmaxmaillinglistGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

