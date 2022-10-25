# ObjectDepartmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**departmentGetAutocompleteV1**](ObjectDepartmentApi.md#departmentGetAutocompleteV1) | **GET** /1/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
[**departmentGetAutocompleteV2**](ObjectDepartmentApi.md#departmentGetAutocompleteV2) | **GET** /2/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
[**departmentGetMembersV1**](ObjectDepartmentApi.md#departmentGetMembersV1) | **GET** /1/object/department/{pkiDepartmentID}/getMembers | Retrieve an existing Department&#39;s members



## departmentGetAutocompleteV1

> CommonGetAutocompleteV1Response departmentGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Departments and IDs

Get the list of Department to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepartmentApi;

ObjectDepartmentApi apiInstance = new ObjectDepartmentApi();
String sSelector = null; // String | The type of Departments to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CommonGetAutocompleteV1Response result = apiInstance.departmentGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepartmentApi#departmentGetAutocompleteV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Departments to return | [default to null] [enum: All, AllButDepartmentZero, Company, CompanyButDepartmentZero]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CommonGetAutocompleteV1Response**](CommonGetAutocompleteV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## departmentGetAutocompleteV2

> DepartmentGetAutocompleteV2Response departmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Departments and IDs

Get the list of Department to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepartmentApi;

ObjectDepartmentApi apiInstance = new ObjectDepartmentApi();
String sSelector = null; // String | The type of Departments to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    DepartmentGetAutocompleteV2Response result = apiInstance.departmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepartmentApi#departmentGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Departments to return | [default to null] [enum: All, AllButDepartmentZero, Company, CompanyButDepartmentZero]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**DepartmentGetAutocompleteV2Response**](DepartmentGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## departmentGetMembersV1

> DepartmentGetMembersV1Response departmentGetMembersV1(pkiDepartmentID)

Retrieve an existing Department&#39;s members



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDepartmentApi;

ObjectDepartmentApi apiInstance = new ObjectDepartmentApi();
Integer pkiDepartmentID = null; // Integer | 
try {
    DepartmentGetMembersV1Response result = apiInstance.departmentGetMembersV1(pkiDepartmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDepartmentApi#departmentGetMembersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepartmentID** | **Integer**|  | [default to null]

### Return type

[**DepartmentGetMembersV1Response**](DepartmentGetMembersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

