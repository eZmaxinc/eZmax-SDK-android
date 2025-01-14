# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activesessionGenerateFederationTokenV1**](ObjectActivesessionApi.md#activesessionGenerateFederationTokenV1) | **POST** /1/object/activesession/generateFederationToken | Generate a federation token
[**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
[**activesessionGetListV1**](ObjectActivesessionApi.md#activesessionGetListV1) | **GET** /1/object/activesession/getList | Retrieve Activesession list



## activesessionGenerateFederationTokenV1

> ActivesessionGenerateFederationTokenV1Response activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request)

Generate a federation token



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectActivesessionApi;

ObjectActivesessionApi apiInstance = new ObjectActivesessionApi();
ActivesessionGenerateFederationTokenV1Request activesessionGenerateFederationTokenV1Request = new ActivesessionGenerateFederationTokenV1Request(); // ActivesessionGenerateFederationTokenV1Request | 
try {
    ActivesessionGenerateFederationTokenV1Response result = apiInstance.activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectActivesessionApi#activesessionGenerateFederationTokenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activesessionGenerateFederationTokenV1Request** | [**ActivesessionGenerateFederationTokenV1Request**](ActivesessionGenerateFederationTokenV1Request.md)|  |

### Return type

[**ActivesessionGenerateFederationTokenV1Response**](ActivesessionGenerateFederationTokenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## activesessionGetCurrentV1

> ActivesessionGetCurrentV1Response activesessionGetCurrentV1()

Get Current Activesession

Retrieve the details about the current activesession

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectActivesessionApi;

ObjectActivesessionApi apiInstance = new ObjectActivesessionApi();
try {
    ActivesessionGetCurrentV1Response result = apiInstance.activesessionGetCurrentV1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectActivesessionApi#activesessionGetCurrentV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ActivesessionGetCurrentV1Response**](ActivesessionGetCurrentV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## activesessionGetListV1

> ActivesessionGetListV1Response activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Activesession list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectActivesessionApi;

ObjectActivesessionApi apiInstance = new ObjectActivesessionApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    ActivesessionGetListV1Response result = apiInstance.activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectActivesessionApi#activesessionGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiActivesessionID_ASC, pkiActivesessionID_DESC, fkiUserID_ASC, fkiUserID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiCompanyID_ASC, fkiCompanyID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sCompanyNameX_ASC, sCompanyNameX_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sActivesessionLoginname_ASC, sActivesessionLoginname_DESC, sComputerDescription_ASC, sComputerDescription_DESC, dtActivesessionFirsthit_ASC, dtActivesessionFirsthit_DESC, dtActivesessionLasthit_ASC, dtActivesessionLasthit_DESC, sActivesessionIP_ASC, sActivesessionIP_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**ActivesessionGetListV1Response**](ActivesessionGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

