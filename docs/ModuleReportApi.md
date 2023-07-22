# ModuleReportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportGetReportFromCacheV1**](ModuleReportApi.md#reportGetReportFromCacheV1) | **GET** /1/module/report/getReportFromCache/{sReportgroupCacheID} | Retrieve report from cache



## reportGetReportFromCacheV1

> CommonGetReportV1Response reportGetReportFromCacheV1(sReportgroupCacheID)

Retrieve report from cache

Retrieve a report that was previously generated and cached

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleReportApi;

ModuleReportApi apiInstance = new ModuleReportApi();
String sReportgroupCacheID = null; // String | 
try {
    CommonGetReportV1Response result = apiInstance.reportGetReportFromCacheV1(sReportgroupCacheID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleReportApi#reportGetReportFromCacheV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sReportgroupCacheID** | **String**|  | [default to null]

### Return type

[**CommonGetReportV1Response**](CommonGetReportV1Response.md)

### Authorization

[Authorization](../README.md#Authorization), [Presigned](../README.md#Presigned)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/zip, text/html

