# ObjectCreditcardclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditcardclientCreateObjectV1**](ObjectCreditcardclientApi.md#creditcardclientCreateObjectV1) | **POST** /1/object/creditcardclient | Create a new Creditcardclient
[**creditcardclientDeleteObjectV1**](ObjectCreditcardclientApi.md#creditcardclientDeleteObjectV1) | **DELETE** /1/object/creditcardclient/{pkiCreditcardclientID} | Delete an existing Creditcardclient
[**creditcardclientEditObjectV1**](ObjectCreditcardclientApi.md#creditcardclientEditObjectV1) | **PUT** /1/object/creditcardclient/{pkiCreditcardclientID} | Edit an existing Creditcardclient
[**creditcardclientGetAutocompleteV2**](ObjectCreditcardclientApi.md#creditcardclientGetAutocompleteV2) | **GET** /2/object/creditcardclient/getAutocomplete/{sSelector} | Retrieve Creditcardclients and IDs
[**creditcardclientGetListV1**](ObjectCreditcardclientApi.md#creditcardclientGetListV1) | **GET** /1/object/creditcardclient/getList | Retrieve Creditcardclient list
[**creditcardclientGetObjectV2**](ObjectCreditcardclientApi.md#creditcardclientGetObjectV2) | **GET** /2/object/creditcardclient/{pkiCreditcardclientID} | Retrieve an existing Creditcardclient
[**creditcardclientPatchObjectV1**](ObjectCreditcardclientApi.md#creditcardclientPatchObjectV1) | **PATCH** /1/object/creditcardclient/{pkiCreditcardclientID} | Patch an existing Creditcardclient



## creditcardclientCreateObjectV1

> CreditcardclientCreateObjectV1Response creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request)

Create a new Creditcardclient

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
CreditcardclientCreateObjectV1Request creditcardclientCreateObjectV1Request = new CreditcardclientCreateObjectV1Request(); // CreditcardclientCreateObjectV1Request | 
try {
    CreditcardclientCreateObjectV1Response result = apiInstance.creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardclientCreateObjectV1Request** | [**CreditcardclientCreateObjectV1Request**](CreditcardclientCreateObjectV1Request.md)|  |

### Return type

[**CreditcardclientCreateObjectV1Response**](CreditcardclientCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## creditcardclientDeleteObjectV1

> CreditcardclientDeleteObjectV1Response creditcardclientDeleteObjectV1(pkiCreditcardclientID)

Delete an existing Creditcardclient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
Integer pkiCreditcardclientID = null; // Integer | The unique ID of the Creditcardclient
try {
    CreditcardclientDeleteObjectV1Response result = apiInstance.creditcardclientDeleteObjectV1(pkiCreditcardclientID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | [default to null]

### Return type

[**CreditcardclientDeleteObjectV1Response**](CreditcardclientDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## creditcardclientEditObjectV1

> CreditcardclientEditObjectV1Response creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request)

Edit an existing Creditcardclient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
Integer pkiCreditcardclientID = null; // Integer | The unique ID of the Creditcardclient
CreditcardclientEditObjectV1Request creditcardclientEditObjectV1Request = new CreditcardclientEditObjectV1Request(); // CreditcardclientEditObjectV1Request | 
try {
    CreditcardclientEditObjectV1Response result = apiInstance.creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | [default to null]
 **creditcardclientEditObjectV1Request** | [**CreditcardclientEditObjectV1Request**](CreditcardclientEditObjectV1Request.md)|  |

### Return type

[**CreditcardclientEditObjectV1Response**](CreditcardclientEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## creditcardclientGetAutocompleteV2

> CreditcardclientGetAutocompleteV2Response creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardclients and IDs

Get the list of Creditcardclient to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
String sSelector = null; // String | The type of Creditcardclients to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    CreditcardclientGetAutocompleteV2Response result = apiInstance.creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Creditcardclients to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**CreditcardclientGetAutocompleteV2Response**](CreditcardclientGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## creditcardclientGetListV1

> CreditcardclientGetListV1Response creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardclient list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    CreditcardclientGetListV1Response result = apiInstance.creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiCreditcardclientID_ASC, pkiCreditcardclientID_DESC, fkiCreditcarddetailID_ASC, fkiCreditcarddetailID_DESC, fkiCreditcardtypeID_ASC, fkiCreditcardtypeID_DESC, bCreditcardclientrelationIsdefault_ASC, bCreditcardclientrelationIsdefault_DESC, sCreditcardclientDescription_ASC, sCreditcardclientDescription_DESC, bCreditcardclientIsactive_ASC, bCreditcardclientIsactive_DESC, bCreditcardclientAllowedagencypayment_ASC, bCreditcardclientAllowedagencypayment_DESC, bCreditcardclientAllowedtranquillit_ASC, bCreditcardclientAllowedtranquillit_DESC, iCreditcarddetailExpirationmonth_ASC, iCreditcarddetailExpirationmonth_DESC, iCreditcarddetailExpirationyear_ASC, iCreditcarddetailExpirationyear_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**CreditcardclientGetListV1Response**](CreditcardclientGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## creditcardclientGetObjectV2

> CreditcardclientGetObjectV2Response creditcardclientGetObjectV2(pkiCreditcardclientID)

Retrieve an existing Creditcardclient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
Integer pkiCreditcardclientID = null; // Integer | The unique ID of the Creditcardclient
try {
    CreditcardclientGetObjectV2Response result = apiInstance.creditcardclientGetObjectV2(pkiCreditcardclientID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | [default to null]

### Return type

[**CreditcardclientGetObjectV2Response**](CreditcardclientGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## creditcardclientPatchObjectV1

> CreditcardclientPatchObjectV1Response creditcardclientPatchObjectV1(pkiCreditcardclientID, creditcardclientPatchObjectV1Request)

Patch an existing Creditcardclient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCreditcardclientApi;

ObjectCreditcardclientApi apiInstance = new ObjectCreditcardclientApi();
Integer pkiCreditcardclientID = null; // Integer | The unique ID of the Creditcardclient
CreditcardclientPatchObjectV1Request creditcardclientPatchObjectV1Request = new CreditcardclientPatchObjectV1Request(); // CreditcardclientPatchObjectV1Request | 
try {
    CreditcardclientPatchObjectV1Response result = apiInstance.creditcardclientPatchObjectV1(pkiCreditcardclientID, creditcardclientPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCreditcardclientApi#creditcardclientPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **Integer**| The unique ID of the Creditcardclient | [default to null]
 **creditcardclientPatchObjectV1Request** | [**CreditcardclientPatchObjectV1Request**](CreditcardclientPatchObjectV1Request.md)|  |

### Return type

[**CreditcardclientPatchObjectV1Response**](CreditcardclientPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

