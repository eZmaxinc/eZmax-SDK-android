# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerBatchDownloadV1**](ObjectCustomerApi.md#customerBatchDownloadV1) | **POST** /1/object/customer/{pkiCustomerID}/batchDownload | Download multiples attachments from a Customer
[**customerGetAttachmentsV1**](ObjectCustomerApi.md#customerGetAttachmentsV1) | **GET** /1/object/customer/{pkiCustomerID}/getAttachments | Retrieve Customer&#39;s attachments
[**customerGetAutocompleteV2**](ObjectCustomerApi.md#customerGetAutocompleteV2) | **GET** /2/object/customer/getAutocomplete/{sSelector} | Retrieve Customers and IDs
[**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer
[**customerImportIntoEDMV1**](ObjectCustomerApi.md#customerImportIntoEDMV1) | **POST** /1/object/customer/{pkiCustomerID}/importIntoEDM | Import attachments into the Customer



## customerBatchDownloadV1

> File customerBatchDownloadV1(pkiCustomerID, customerBatchDownloadV1Request)

Download multiples attachments from a Customer

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
Integer pkiCustomerID = null; // Integer | 
CustomerBatchDownloadV1Request customerBatchDownloadV1Request = new CustomerBatchDownloadV1Request(); // CustomerBatchDownloadV1Request | 
try {
    File result = apiInstance.customerBatchDownloadV1(pkiCustomerID, customerBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCustomerID** | **Integer**|  | [default to null]
 **customerBatchDownloadV1Request** | [**CustomerBatchDownloadV1Request**](CustomerBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## customerGetAttachmentsV1

> CustomerGetAttachmentsV1Response customerGetAttachmentsV1(pkiCustomerID)

Retrieve Customer&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
Integer pkiCustomerID = null; // Integer | 
try {
    CustomerGetAttachmentsV1Response result = apiInstance.customerGetAttachmentsV1(pkiCustomerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCustomerID** | **Integer**|  | [default to null]

### Return type

[**CustomerGetAttachmentsV1Response**](CustomerGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
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

Import attachments into the Customer



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

