# ObjectBankaccountApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bankaccountBatchDownloadV1**](ObjectBankaccountApi.md#bankaccountBatchDownloadV1) | **POST** /1/object/bankaccount/{pkiBankaccountID}/batchDownload | Download multiples attachments from a Bankaccount
[**bankaccountGetAttachmentsV1**](ObjectBankaccountApi.md#bankaccountGetAttachmentsV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getAttachments | Retrieve Bankaccount&#39;s attachments
[**bankaccountGetAutocompleteV2**](ObjectBankaccountApi.md#bankaccountGetAutocompleteV2) | **GET** /2/object/bankaccount/getAutocomplete/{sSelector} | Retrieve Bankaccounts and IDs
[**bankaccountImportIntoEDMV1**](ObjectBankaccountApi.md#bankaccountImportIntoEDMV1) | **POST** /1/object/bankaccount/{pkiBankaccountID}/importIntoEDM | Import attachments into the Bankaccount



## bankaccountBatchDownloadV1

> File bankaccountBatchDownloadV1(pkiBankaccountID, bankaccountBatchDownloadV1Request)

Download multiples attachments from a Bankaccount

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBankaccountApi;

ObjectBankaccountApi apiInstance = new ObjectBankaccountApi();
Integer pkiBankaccountID = null; // Integer | 
BankaccountBatchDownloadV1Request bankaccountBatchDownloadV1Request = new BankaccountBatchDownloadV1Request(); // BankaccountBatchDownloadV1Request | 
try {
    File result = apiInstance.bankaccountBatchDownloadV1(pkiBankaccountID, bankaccountBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBankaccountApi#bankaccountBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBankaccountID** | **Integer**|  | [default to null]
 **bankaccountBatchDownloadV1Request** | [**BankaccountBatchDownloadV1Request**](BankaccountBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## bankaccountGetAttachmentsV1

> BankaccountGetAttachmentsV1Response bankaccountGetAttachmentsV1(pkiBankaccountID)

Retrieve Bankaccount&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBankaccountApi;

ObjectBankaccountApi apiInstance = new ObjectBankaccountApi();
Integer pkiBankaccountID = null; // Integer | 
try {
    BankaccountGetAttachmentsV1Response result = apiInstance.bankaccountGetAttachmentsV1(pkiBankaccountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBankaccountApi#bankaccountGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBankaccountID** | **Integer**|  | [default to null]

### Return type

[**BankaccountGetAttachmentsV1Response**](BankaccountGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## bankaccountGetAutocompleteV2

> BankaccountGetAutocompleteV2Response bankaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Bankaccounts and IDs

Get the list of Bankaccount to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBankaccountApi;

ObjectBankaccountApi apiInstance = new ObjectBankaccountApi();
String sSelector = null; // String | The type of Bankaccounts to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    BankaccountGetAutocompleteV2Response result = apiInstance.bankaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBankaccountApi#bankaccountGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Bankaccounts to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**BankaccountGetAutocompleteV2Response**](BankaccountGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## bankaccountImportIntoEDMV1

> BankaccountImportIntoEDMV1Response bankaccountImportIntoEDMV1(pkiBankaccountID, bankaccountImportIntoEDMV1Request)

Import attachments into the Bankaccount

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBankaccountApi;

ObjectBankaccountApi apiInstance = new ObjectBankaccountApi();
Integer pkiBankaccountID = null; // Integer | 
BankaccountImportIntoEDMV1Request bankaccountImportIntoEDMV1Request = new BankaccountImportIntoEDMV1Request(); // BankaccountImportIntoEDMV1Request | 
try {
    BankaccountImportIntoEDMV1Response result = apiInstance.bankaccountImportIntoEDMV1(pkiBankaccountID, bankaccountImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBankaccountApi#bankaccountImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBankaccountID** | **Integer**|  | [default to null]
 **bankaccountImportIntoEDMV1Request** | [**BankaccountImportIntoEDMV1Request**](BankaccountImportIntoEDMV1Request.md)|  |

### Return type

[**BankaccountImportIntoEDMV1Response**](BankaccountImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

