# ObjectEzsignimportfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignimportfolderDeleteObjectV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderDeleteObjectV1) | **DELETE** /1/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Delete an existing Ezsignimportfolder
[**ezsignimportfolderGetListV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetListV1) | **GET** /1/object/ezsignimportfolder/getList | Retrieve Ezsignimportfolder list
[**ezsignimportfolderGetObjectV2**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetObjectV2) | **GET** /2/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Retrieve an existing Ezsignimportfolder



## ezsignimportfolderDeleteObjectV1

> EzsignimportfolderDeleteObjectV1Response ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID)

Delete an existing Ezsignimportfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignimportfolderApi;

ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi();
Integer pkiEzsignimportfolderID = null; // Integer | The unique ID of the Ezsignimportfolder
try {
    EzsignimportfolderDeleteObjectV1Response result = apiInstance.ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignimportfolderID** | **Integer**| The unique ID of the Ezsignimportfolder | [default to null]

### Return type

[**EzsignimportfolderDeleteObjectV1Response**](EzsignimportfolderDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignimportfolderGetListV1

> EzsignimportfolderGetListV1Response ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignimportfolder list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignimportfolderApi;

ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsignimportfolderGetListV1Response result = apiInstance.ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsignimportfolderID_ASC, pkiEzsignimportfolderID_DESC, sEzsignimportfolderName_ASC, sEzsignimportfolderName_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsignimportfolderGetListV1Response**](EzsignimportfolderGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsignimportfolderGetObjectV2

> EzsignimportfolderGetObjectV2Response ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID)

Retrieve an existing Ezsignimportfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignimportfolderApi;

ObjectEzsignimportfolderApi apiInstance = new ObjectEzsignimportfolderApi();
Integer pkiEzsignimportfolderID = null; // Integer | The unique ID of the Ezsignimportfolder
try {
    EzsignimportfolderGetObjectV2Response result = apiInstance.ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignimportfolderApi#ezsignimportfolderGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignimportfolderID** | **Integer**| The unique ID of the Ezsignimportfolder | [default to null]

### Return type

[**EzsignimportfolderGetObjectV2Response**](EzsignimportfolderGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

