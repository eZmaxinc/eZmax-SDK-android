# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCreateObjectV1**](ObjectCustomerApi.md#customerCreateObjectV1) | **POST** /1/object/customer | Create a new Customer
[**customerGetAutocompleteV2**](ObjectCustomerApi.md#customerGetAutocompleteV2) | **GET** /2/object/customer/getAutocomplete/{sSelector} | Retrieve Customers and IDs
[**customerGetListV1**](ObjectCustomerApi.md#customerGetListV1) | **GET** /1/object/customer/getList | Retrieve Customer list
[**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer
[**customerImportIntoEDMV1**](ObjectCustomerApi.md#customerImportIntoEDMV1) | **POST** /1/object/customer/{pkiCustomerID}/importIntoEDM | Import attachments into the Buyercontract



## customerCreateObjectV1

> CustomerCreateObjectV1Response customerCreateObjectV1(customerCreateObjectV1Request)

Create a new Customer

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
CustomerCreateObjectV1Request customerCreateObjectV1Request = new CustomerCreateObjectV1Request(); // CustomerCreateObjectV1Request | 
try {
    CustomerCreateObjectV1Response result = apiInstance.customerCreateObjectV1(customerCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCreateObjectV1Request** | [**CustomerCreateObjectV1Request**](CustomerCreateObjectV1Request.md)|  |

### Return type

[**CustomerCreateObjectV1Response**](CustomerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerGetAutocompleteV2

> CustomerGetAutocompleteV2Response customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Customers and IDs

Get the list of Customer to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
String sSelector = null; // String | The type of Customers to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CustomerGetAutocompleteV2Response result = apiInstance.customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Customers to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CustomerGetAutocompleteV2Response**](CustomerGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerGetListV1

> CustomerGetListV1Response customerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Customer list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    CustomerGetListV1Response result = apiInstance.customerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiCustomerID_ASC, pkiCustomerID_DESC, sCustomerName_ASC, sCustomerName_DESC, sCustomerNote_ASC, sCustomerNote_DESC, sCustomerCode_ASC, sCustomerCode_DESC, bCustomerIsactive_ASC, bCustomerIsactive_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**CustomerGetListV1Response**](CustomerGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## customerGetObjectV2

> CustomerGetObjectV2Response customerGetObjectV2(pkiCustomerID)

Retrieve an existing Customer



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
Integer pkiCustomerID = null; // Integer | The unique ID of the Customer
try {
    CustomerGetObjectV2Response result = apiInstance.customerGetObjectV2(pkiCustomerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCustomerID** | **Integer**| The unique ID of the Customer | [default to null]

### Return type

[**CustomerGetObjectV2Response**](CustomerGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerImportIntoEDMV1

> CustomerImportIntoEDMV1Response customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request)

Import attachments into the Buyercontract



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
Integer pkiCustomerID = null; // Integer | 
CustomerImportIntoEDMV1Request customerImportIntoEDMV1Request = new CustomerImportIntoEDMV1Request(); // CustomerImportIntoEDMV1Request | 
try {
    CustomerImportIntoEDMV1Response result = apiInstance.customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCustomerID** | **Integer**|  | [default to null]
 **customerImportIntoEDMV1Request** | [**CustomerImportIntoEDMV1Request**](CustomerImportIntoEDMV1Request.md)|  |

### Return type

[**CustomerImportIntoEDMV1Response**](CustomerImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

