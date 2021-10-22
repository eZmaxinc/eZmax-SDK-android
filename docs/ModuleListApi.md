# ModuleListApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listListpresentationV1**](ModuleListApi.md#listListpresentationV1) | **POST** /1/module/list/listpresentation/{sListName} | Save all Listpresentation for a specific list



## listListpresentationV1

> ListSaveListpresentationV1Response listListpresentationV1(sListName, listSaveListpresentationV1Request)

Save all Listpresentation for a specific list

Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleListApi;

ModuleListApi apiInstance = new ModuleListApi();
String sListName = null; // String | The list Name
ListSaveListpresentationV1Request listSaveListpresentationV1Request = new ListSaveListpresentationV1Request(); // ListSaveListpresentationV1Request | 
try {
    ListSaveListpresentationV1Response result = apiInstance.listListpresentationV1(sListName, listSaveListpresentationV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleListApi#listListpresentationV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sListName** | **String**| The list Name | [default to null]
 **listSaveListpresentationV1Request** | [**ListSaveListpresentationV1Request**](ListSaveListpresentationV1Request.md)|  |

### Return type

[**ListSaveListpresentationV1Response**](ListSaveListpresentationV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

