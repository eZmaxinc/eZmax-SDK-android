# ObjectBillingentityinternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingentityinternalCreateObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalCreateObjectV1) | **POST** /1/object/billingentityinternal | Create a new Billingentityinternal
[**billingentityinternalEditObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalEditObjectV1) | **PUT** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Edit an existing Billingentityinternal
[**billingentityinternalGetAutocompleteV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
[**billingentityinternalGetListV1**](ObjectBillingentityinternalApi.md#billingentityinternalGetListV1) | **GET** /1/object/billingentityinternal/getList | Retrieve Billingentityinternal list
[**billingentityinternalGetObjectV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetObjectV2) | **GET** /2/object/billingentityinternal/{pkiBillingentityinternalID} | Retrieve an existing Billingentityinternal



## billingentityinternalCreateObjectV1

> BillingentityinternalCreateObjectV1Response billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request)

Create a new Billingentityinternal

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityinternalApi;

ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi();
BillingentityinternalCreateObjectV1Request billingentityinternalCreateObjectV1Request = new BillingentityinternalCreateObjectV1Request(); // BillingentityinternalCreateObjectV1Request | 
try {
    BillingentityinternalCreateObjectV1Response result = apiInstance.billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingentityinternalCreateObjectV1Request** | [**BillingentityinternalCreateObjectV1Request**](BillingentityinternalCreateObjectV1Request.md)|  |

### Return type

[**BillingentityinternalCreateObjectV1Response**](BillingentityinternalCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## billingentityinternalEditObjectV1

> BillingentityinternalEditObjectV1Response billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request)

Edit an existing Billingentityinternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityinternalApi;

ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi();
Integer pkiBillingentityinternalID = null; // Integer | The unique ID of the Billingentityinternal
BillingentityinternalEditObjectV1Request billingentityinternalEditObjectV1Request = new BillingentityinternalEditObjectV1Request(); // BillingentityinternalEditObjectV1Request | 
try {
    BillingentityinternalEditObjectV1Response result = apiInstance.billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityinternalID** | **Integer**| The unique ID of the Billingentityinternal | [default to null]
 **billingentityinternalEditObjectV1Request** | [**BillingentityinternalEditObjectV1Request**](BillingentityinternalEditObjectV1Request.md)|  |

### Return type

[**BillingentityinternalEditObjectV1Response**](BillingentityinternalEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## billingentityinternalGetAutocompleteV2

> BillingentityinternalGetAutocompleteV2Response billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityinternals and IDs

Get the list of Billingentityinternal to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityinternalApi;

ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi();
String sSelector = null; // String | The type of Billingentityinternals to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    BillingentityinternalGetAutocompleteV2Response result = apiInstance.billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Billingentityinternals to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**BillingentityinternalGetAutocompleteV2Response**](BillingentityinternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## billingentityinternalGetListV1

> BillingentityinternalGetListV1Response billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Billingentityinternal list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityinternalApi;

ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = 10000; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    BillingentityinternalGetListV1Response result = apiInstance.billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiBillingentityinternalID_ASC, pkiBillingentityinternalID_DESC, sBillingentityinternalDescriptionX_ASC, sBillingentityinternalDescriptionX_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to 10000]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**BillingentityinternalGetListV1Response**](BillingentityinternalGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## billingentityinternalGetObjectV2

> BillingentityinternalGetObjectV2Response billingentityinternalGetObjectV2(pkiBillingentityinternalID)

Retrieve an existing Billingentityinternal



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityinternalApi;

ObjectBillingentityinternalApi apiInstance = new ObjectBillingentityinternalApi();
Integer pkiBillingentityinternalID = null; // Integer | The unique ID of the Billingentityinternal
try {
    BillingentityinternalGetObjectV2Response result = apiInstance.billingentityinternalGetObjectV2(pkiBillingentityinternalID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityinternalApi#billingentityinternalGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityinternalID** | **Integer**| The unique ID of the Billingentityinternal | [default to null]

### Return type

[**BillingentityinternalGetObjectV2Response**](BillingentityinternalGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

