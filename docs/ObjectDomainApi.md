# ObjectDomainApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainCreateObjectV1**](ObjectDomainApi.md#domainCreateObjectV1) | **POST** /1/object/domain | Create a new Domain
[**domainDeleteObjectV1**](ObjectDomainApi.md#domainDeleteObjectV1) | **DELETE** /1/object/domain/{pkiDomainID} | Delete an existing Domain
[**domainGetListV1**](ObjectDomainApi.md#domainGetListV1) | **GET** /1/object/domain/getList | Retrieve Domain list
[**domainGetObjectV2**](ObjectDomainApi.md#domainGetObjectV2) | **GET** /2/object/domain/{pkiDomainID} | Retrieve an existing Domain



## domainCreateObjectV1

> DomainCreateObjectV1Response domainCreateObjectV1(domainCreateObjectV1Request)

Create a new Domain

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDomainApi;

ObjectDomainApi apiInstance = new ObjectDomainApi();
DomainCreateObjectV1Request domainCreateObjectV1Request = new DomainCreateObjectV1Request(); // DomainCreateObjectV1Request | 
try {
    DomainCreateObjectV1Response result = apiInstance.domainCreateObjectV1(domainCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDomainApi#domainCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainCreateObjectV1Request** | [**DomainCreateObjectV1Request**](DomainCreateObjectV1Request.md)|  |

### Return type

[**DomainCreateObjectV1Response**](DomainCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## domainDeleteObjectV1

> DomainDeleteObjectV1Response domainDeleteObjectV1(pkiDomainID)

Delete an existing Domain



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDomainApi;

ObjectDomainApi apiInstance = new ObjectDomainApi();
Integer pkiDomainID = null; // Integer | The unique ID of the Domain
try {
    DomainDeleteObjectV1Response result = apiInstance.domainDeleteObjectV1(pkiDomainID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDomainApi#domainDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDomainID** | **Integer**| The unique ID of the Domain | [default to null]

### Return type

[**DomainDeleteObjectV1Response**](DomainDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## domainGetListV1

> DomainGetListV1Response domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Domain list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDomainApi;

ObjectDomainApi apiInstance = new ObjectDomainApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    DomainGetListV1Response result = apiInstance.domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDomainApi#domainGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiDomainID_ASC, pkiDomainID_DESC, sDomainName_ASC, sDomainName_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**DomainGetListV1Response**](DomainGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## domainGetObjectV2

> DomainGetObjectV2Response domainGetObjectV2(pkiDomainID)

Retrieve an existing Domain



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDomainApi;

ObjectDomainApi apiInstance = new ObjectDomainApi();
Integer pkiDomainID = null; // Integer | The unique ID of the Domain
try {
    DomainGetObjectV2Response result = apiInstance.domainGetObjectV2(pkiDomainID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDomainApi#domainGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDomainID** | **Integer**| The unique ID of the Domain | [default to null]

### Return type

[**DomainGetObjectV2Response**](DomainGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

