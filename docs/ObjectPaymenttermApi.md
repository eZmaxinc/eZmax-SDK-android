# ObjectPaymenttermApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymenttermCreateObjectV1**](ObjectPaymenttermApi.md#paymenttermCreateObjectV1) | **POST** /1/object/paymentterm | Create a new Paymentterm
[**paymenttermEditObjectV1**](ObjectPaymenttermApi.md#paymenttermEditObjectV1) | **PUT** /1/object/paymentterm/{pkiPaymenttermID} | Edit an existing Paymentterm
[**paymenttermGetAutocompleteV2**](ObjectPaymenttermApi.md#paymenttermGetAutocompleteV2) | **GET** /2/object/paymentterm/getAutocomplete/{sSelector} | Retrieve Paymentterms and IDs
[**paymenttermGetListV1**](ObjectPaymenttermApi.md#paymenttermGetListV1) | **GET** /1/object/paymentterm/getList | Retrieve Paymentterm list
[**paymenttermGetObjectV2**](ObjectPaymenttermApi.md#paymenttermGetObjectV2) | **GET** /2/object/paymentterm/{pkiPaymenttermID} | Retrieve an existing Paymentterm



## paymenttermCreateObjectV1

> PaymenttermCreateObjectV1Response paymenttermCreateObjectV1(paymenttermCreateObjectV1Request)

Create a new Paymentterm

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymenttermApi;

ObjectPaymenttermApi apiInstance = new ObjectPaymenttermApi();
PaymenttermCreateObjectV1Request paymenttermCreateObjectV1Request = new PaymenttermCreateObjectV1Request(); // PaymenttermCreateObjectV1Request | 
try {
    PaymenttermCreateObjectV1Response result = apiInstance.paymenttermCreateObjectV1(paymenttermCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymenttermApi#paymenttermCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymenttermCreateObjectV1Request** | [**PaymenttermCreateObjectV1Request**](PaymenttermCreateObjectV1Request.md)|  |

### Return type

[**PaymenttermCreateObjectV1Response**](PaymenttermCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## paymenttermEditObjectV1

> CommonResponse paymenttermEditObjectV1(pkiPaymenttermID, paymenttermEditObjectV1Request)

Edit an existing Paymentterm



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymenttermApi;

ObjectPaymenttermApi apiInstance = new ObjectPaymenttermApi();
Integer pkiPaymenttermID = null; // Integer | 
PaymenttermEditObjectV1Request paymenttermEditObjectV1Request = new PaymenttermEditObjectV1Request(); // PaymenttermEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.paymenttermEditObjectV1(pkiPaymenttermID, paymenttermEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymenttermApi#paymenttermEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymenttermID** | **Integer**|  | [default to null]
 **paymenttermEditObjectV1Request** | [**PaymenttermEditObjectV1Request**](PaymenttermEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## paymenttermGetAutocompleteV2

> PaymenttermGetAutocompleteV2Response paymenttermGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentterms and IDs

Get the list of Paymentterm to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymenttermApi;

ObjectPaymenttermApi apiInstance = new ObjectPaymenttermApi();
String sSelector = null; // String | The type of Paymentterms to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    PaymenttermGetAutocompleteV2Response result = apiInstance.paymenttermGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymenttermApi#paymenttermGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Paymentterms to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**PaymenttermGetAutocompleteV2Response**](PaymenttermGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## paymenttermGetListV1

> PaymenttermGetListV1Response paymenttermGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Paymentterm list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymenttermApi;

ObjectPaymenttermApi apiInstance = new ObjectPaymenttermApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    PaymenttermGetListV1Response result = apiInstance.paymenttermGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymenttermApi#paymenttermGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiPaymenttermID_ASC, pkiPaymenttermID_DESC, sPaymenttermCode_ASC, sPaymenttermCode_DESC, ePaymenttermType_ASC, ePaymenttermType_DESC, iPaymenttermDay_ASC, iPaymenttermDay_DESC, sPaymenttermDescriptionX_ASC, sPaymenttermDescriptionX_DESC, bPaymenttermIsactive_ASC, bPaymenttermIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**PaymenttermGetListV1Response**](PaymenttermGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## paymenttermGetObjectV2

> PaymenttermGetObjectV2Response paymenttermGetObjectV2(pkiPaymenttermID)

Retrieve an existing Paymentterm



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPaymenttermApi;

ObjectPaymenttermApi apiInstance = new ObjectPaymenttermApi();
Integer pkiPaymenttermID = null; // Integer | 
try {
    PaymenttermGetObjectV2Response result = apiInstance.paymenttermGetObjectV2(pkiPaymenttermID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPaymenttermApi#paymenttermGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymenttermID** | **Integer**|  | [default to null]

### Return type

[**PaymenttermGetObjectV2Response**](PaymenttermGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

