# ObjectSupplierApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supplierGetListV1**](ObjectSupplierApi.md#supplierGetListV1) | **GET** /1/object/supplier/getList | Retrieve Supplier list
[**supplierImportIntoEDMV1**](ObjectSupplierApi.md#supplierImportIntoEDMV1) | **POST** /1/object/supplier/{pkiSupplierID}/importIntoEDM | Import attachments into the Supplier



## supplierGetListV1

> SupplierGetListV1Response supplierGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Supplier list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplierApi;

ObjectSupplierApi apiInstance = new ObjectSupplierApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    SupplierGetListV1Response result = apiInstance.supplierGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplierApi#supplierGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiSupplierID_ASC, pkiSupplierID_DESC, fkiPaymentmethodID_ASC, fkiPaymentmethodID_DESC, sSupplierName_ASC, sSupplierName_DESC, sSupplierCode_ASC, sSupplierCode_DESC, sSupplierAccount_ASC, sSupplierAccount_DESC, bSupplierIsactive_ASC, bSupplierIsactive_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, sPaymentmethodDescriptionX_ASC, sPaymentmethodDescriptionX_DESC, sElectronicfundstransferbankaccountTransit_ASC, sElectronicfundstransferbankaccountTransit_DESC, sElectronicfundstransferbankaccountInstitution_ASC, sElectronicfundstransferbankaccountInstitution_DESC, sElectronicfundstransferbankaccountAccount_ASC, sElectronicfundstransferbankaccountAccount_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**SupplierGetListV1Response**](SupplierGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## supplierImportIntoEDMV1

> SupplierImportIntoEDMV1Response supplierImportIntoEDMV1(pkiSupplierID, supplierImportIntoEDMV1Request)

Import attachments into the Supplier



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplierApi;

ObjectSupplierApi apiInstance = new ObjectSupplierApi();
Integer pkiSupplierID = null; // Integer | 
SupplierImportIntoEDMV1Request supplierImportIntoEDMV1Request = new SupplierImportIntoEDMV1Request(); // SupplierImportIntoEDMV1Request | 
try {
    SupplierImportIntoEDMV1Response result = apiInstance.supplierImportIntoEDMV1(pkiSupplierID, supplierImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplierApi#supplierImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSupplierID** | **Integer**|  | [default to null]
 **supplierImportIntoEDMV1Request** | [**SupplierImportIntoEDMV1Request**](SupplierImportIntoEDMV1Request.md)|  |

### Return type

[**SupplierImportIntoEDMV1Response**](SupplierImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

