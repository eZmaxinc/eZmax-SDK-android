# ObjectCreditcardmerchantApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditcardmerchantCreateObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantCreateObjectV1) | **POST** /1/object/creditcardmerchant | Create a new Creditcardmerchant
[**creditcardmerchantDeleteObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantDeleteObjectV1) | **DELETE** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Delete an existing Creditcardmerchant
[**creditcardmerchantEditObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantEditObjectV1) | **PUT** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Edit an existing Creditcardmerchant
[**creditcardmerchantGetAutocompleteV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetAutocompleteV2) | **GET** /2/object/creditcardmerchant/getAutocomplete/{sSelector} | Retrieve Creditcardmerchants and IDs
[**creditcardmerchantGetListV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetListV1) | **GET** /1/object/creditcardmerchant/getList | Retrieve Creditcardmerchant list
[**creditcardmerchantGetObjectV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetObjectV2) | **GET** /2/object/creditcardmerchant/{pkiCreditcardmerchantID} | Retrieve an existing Creditcardmerchant



## creditcardmerchantCreateObjectV1

> CreditcardmerchantCreateObjectV1Response creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request)

Create a new Creditcardmerchant

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
CreditcardmerchantCreateObjectV1Request creditcardmerchantCreateObjectV1Request = new CreditcardmerchantCreateObjectV1Request(); // CreditcardmerchantCreateObjectV1Request | 
try {
    CreditcardmerchantCreateObjectV1Response result = apiInstance.creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardmerchantCreateObjectV1Request** | [**CreditcardmerchantCreateObjectV1Request**](CreditcardmerchantCreateObjectV1Request.md)|  |

### Return type

[**CreditcardmerchantCreateObjectV1Response**](CreditcardmerchantCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## creditcardmerchantDeleteObjectV1

> CreditcardmerchantDeleteObjectV1Response creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID)

Delete an existing Creditcardmerchant



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
Integer pkiCreditcardmerchantID = null; // Integer | The unique ID of the Creditcardmerchant
try {
    CreditcardmerchantDeleteObjectV1Response result = apiInstance.creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | [default to null]

### Return type

[**CreditcardmerchantDeleteObjectV1Response**](CreditcardmerchantDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## creditcardmerchantEditObjectV1

> CreditcardmerchantEditObjectV1Response creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request)

Edit an existing Creditcardmerchant



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
Integer pkiCreditcardmerchantID = null; // Integer | The unique ID of the Creditcardmerchant
CreditcardmerchantEditObjectV1Request creditcardmerchantEditObjectV1Request = new CreditcardmerchantEditObjectV1Request(); // CreditcardmerchantEditObjectV1Request | 
try {
    CreditcardmerchantEditObjectV1Response result = apiInstance.creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | [default to null]
 **creditcardmerchantEditObjectV1Request** | [**CreditcardmerchantEditObjectV1Request**](CreditcardmerchantEditObjectV1Request.md)|  |

### Return type

[**CreditcardmerchantEditObjectV1Response**](CreditcardmerchantEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## creditcardmerchantGetAutocompleteV2

> CreditcardmerchantGetAutocompleteV2Response creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardmerchants and IDs

Get the list of Creditcardmerchant to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
String sSelector = null; // String | The type of Creditcardmerchants to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CreditcardmerchantGetAutocompleteV2Response result = apiInstance.creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Creditcardmerchants to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CreditcardmerchantGetAutocompleteV2Response**](CreditcardmerchantGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## creditcardmerchantGetListV1

> CreditcardmerchantGetListV1Response creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardmerchant list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    CreditcardmerchantGetListV1Response result = apiInstance.creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiCreditcardmerchantID_ASC, pkiCreditcardmerchantID_DESC, fkiBankaccountID_ASC, fkiBankaccountID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, bCreditcardmerchantDenyvisa_ASC, bCreditcardmerchantDenyvisa_DESC, bCreditcardmerchantDenymastercard_ASC, bCreditcardmerchantDenymastercard_DESC, bCreditcardmerchantDenyamex_ASC, bCreditcardmerchantDenyamex_DESC, bCreditcardmerchantIsactive_ASC, bCreditcardmerchantIsactive_DESC, sCreditcardmerchantDescription_ASC, sCreditcardmerchantDescription_DESC, sCreditcardmerchantStoreid_ASC, sCreditcardmerchantStoreid_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**CreditcardmerchantGetListV1Response**](CreditcardmerchantGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## creditcardmerchantGetObjectV2

> CreditcardmerchantGetObjectV2Response creditcardmerchantGetObjectV2(pkiCreditcardmerchantID)

Retrieve an existing Creditcardmerchant



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardmerchantApi;

ObjectCreditcardmerchantApi apiInstance = new ObjectCreditcardmerchantApi();
Integer pkiCreditcardmerchantID = null; // Integer | The unique ID of the Creditcardmerchant
try {
    CreditcardmerchantGetObjectV2Response result = apiInstance.creditcardmerchantGetObjectV2(pkiCreditcardmerchantID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardmerchantApi#creditcardmerchantGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardmerchantID** | **Integer**| The unique ID of the Creditcardmerchant | [default to null]

### Return type

[**CreditcardmerchantGetObjectV2Response**](CreditcardmerchantGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

