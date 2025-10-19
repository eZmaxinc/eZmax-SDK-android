# ObjectEmployeeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeeGetListV1**](ObjectEmployeeApi.md#employeeGetListV1) | **GET** /1/object/employee/getList | Retrieve Employee list
[**employeeImportIntoEDMV1**](ObjectEmployeeApi.md#employeeImportIntoEDMV1) | **POST** /1/object/employee/{pkiEmployeeID}/importIntoEDM | Import attachments into the Employee



## employeeGetListV1

> EmployeeGetListV1Response employeeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Employee list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEmployeeApi;

ObjectEmployeeApi apiInstance = new ObjectEmployeeApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EmployeeGetListV1Response result = apiInstance.employeeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEmployeeApi#employeeGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEmployeeID_ASC, pkiEmployeeID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sEmployeeCode_ASC, sEmployeeCode_DESC, sEmployeeInternalcode_ASC, sEmployeeInternalcode_DESC, bEmployeeIsactive_ASC, bEmployeeIsactive_DESC, dtEmployeeHiredate_ASC, dtEmployeeHiredate_DESC, dtEmployeeLeavedate_ASC, dtEmployeeLeavedate_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EmployeeGetListV1Response**](EmployeeGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## employeeImportIntoEDMV1

> EmployeeImportIntoEDMV1Response employeeImportIntoEDMV1(pkiEmployeeID, employeeImportIntoEDMV1Request)

Import attachments into the Employee



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEmployeeApi;

ObjectEmployeeApi apiInstance = new ObjectEmployeeApi();
Integer pkiEmployeeID = null; // Integer | 
EmployeeImportIntoEDMV1Request employeeImportIntoEDMV1Request = new EmployeeImportIntoEDMV1Request(); // EmployeeImportIntoEDMV1Request | 
try {
    EmployeeImportIntoEDMV1Response result = apiInstance.employeeImportIntoEDMV1(pkiEmployeeID, employeeImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEmployeeApi#employeeImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEmployeeID** | **Integer**|  | [default to null]
 **employeeImportIntoEDMV1Request** | [**EmployeeImportIntoEDMV1Request**](EmployeeImportIntoEDMV1Request.md)|  |

### Return type

[**EmployeeImportIntoEDMV1Response**](EmployeeImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

