# ObjectPaymentgatewayApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentgatewayCreateObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayCreateObjectV1) | **POST** /1/object/paymentgateway | Create a new Paymentgateway
[**paymentgatewayEditObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayEditObjectV1) | **PUT** /1/object/paymentgateway/{pkiPaymentgatewayID} | Edit an existing Paymentgateway
[**paymentgatewayGetAutocompleteV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetAutocompleteV2) | **GET** /2/object/paymentgateway/getAutocomplete/{sSelector} | Retrieve Paymentgateways and IDs
[**paymentgatewayGetListV1**](ObjectPaymentgatewayApi.md#paymentgatewayGetListV1) | **GET** /1/object/paymentgateway/getList | Retrieve Paymentgateway list
[**paymentgatewayGetObjectV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetObjectV2) | **GET** /2/object/paymentgateway/{pkiPaymentgatewayID} | Retrieve an existing Paymentgateway



## paymentgatewayCreateObjectV1

> PaymentgatewayCreateObjectV1Response paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request)

Create a new Paymentgateway

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentgatewayApi;

ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi();
PaymentgatewayCreateObjectV1Request paymentgatewayCreateObjectV1Request = new PaymentgatewayCreateObjectV1Request(); // PaymentgatewayCreateObjectV1Request | 
try {
    PaymentgatewayCreateObjectV1Response result = apiInstance.paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentgatewayCreateObjectV1Request** | [**PaymentgatewayCreateObjectV1Request**](PaymentgatewayCreateObjectV1Request.md)|  |

### Return type

[**PaymentgatewayCreateObjectV1Response**](PaymentgatewayCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## paymentgatewayEditObjectV1

> PaymentgatewayEditObjectV1Response paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request)

Edit an existing Paymentgateway



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentgatewayApi;

ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi();
Integer pkiPaymentgatewayID = null; // Integer | The unique ID of the Paymentgateway
PaymentgatewayEditObjectV1Request paymentgatewayEditObjectV1Request = new PaymentgatewayEditObjectV1Request(); // PaymentgatewayEditObjectV1Request | 
try {
    PaymentgatewayEditObjectV1Response result = apiInstance.paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymentgatewayID** | **Integer**| The unique ID of the Paymentgateway | [default to null]
 **paymentgatewayEditObjectV1Request** | [**PaymentgatewayEditObjectV1Request**](PaymentgatewayEditObjectV1Request.md)|  |

### Return type

[**PaymentgatewayEditObjectV1Response**](PaymentgatewayEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## paymentgatewayGetAutocompleteV2

> PaymentgatewayGetAutocompleteV2Response paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentgateways and IDs

Get the list of Paymentgateway to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentgatewayApi;

ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi();
String sSelector = null; // String | The type of Paymentgateways to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    PaymentgatewayGetAutocompleteV2Response result = apiInstance.paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Paymentgateways to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**PaymentgatewayGetAutocompleteV2Response**](PaymentgatewayGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## paymentgatewayGetListV1

> PaymentgatewayGetListV1Response paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Paymentgateway list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | ePaymentgatewayProcessor | Moneris |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentgatewayApi;

ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    PaymentgatewayGetListV1Response result = apiInstance.paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiPaymentgatewayID_ASC, pkiPaymentgatewayID_DESC, fkiCreditcardmerchantID_ASC, fkiCreditcardmerchantID_DESC, ePaymentgatewayProcessor_ASC, ePaymentgatewayProcessor_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**PaymentgatewayGetListV1Response**](PaymentgatewayGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## paymentgatewayGetObjectV2

> PaymentgatewayGetObjectV2Response paymentgatewayGetObjectV2(pkiPaymentgatewayID)

Retrieve an existing Paymentgateway



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymentgatewayApi;

ObjectPaymentgatewayApi apiInstance = new ObjectPaymentgatewayApi();
Integer pkiPaymentgatewayID = null; // Integer | The unique ID of the Paymentgateway
try {
    PaymentgatewayGetObjectV2Response result = apiInstance.paymentgatewayGetObjectV2(pkiPaymentgatewayID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymentgatewayApi#paymentgatewayGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymentgatewayID** | **Integer**| The unique ID of the Paymentgateway | [default to null]

### Return type

[**PaymentgatewayGetObjectV2Response**](PaymentgatewayGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

