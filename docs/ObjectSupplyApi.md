# ObjectSupplyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supplyCreateObjectV1**](ObjectSupplyApi.md#supplyCreateObjectV1) | **POST** /1/object/supply | Create a new Supply
[**supplyDeleteObjectV1**](ObjectSupplyApi.md#supplyDeleteObjectV1) | **DELETE** /1/object/supply/{pkiSupplyID} | Delete an existing Supply
[**supplyEditObjectV1**](ObjectSupplyApi.md#supplyEditObjectV1) | **PUT** /1/object/supply/{pkiSupplyID} | Edit an existing Supply
[**supplyGetAutocompleteV2**](ObjectSupplyApi.md#supplyGetAutocompleteV2) | **GET** /2/object/supply/getAutocomplete/{sSelector} | Retrieve Supplys and IDs
[**supplyGetListV1**](ObjectSupplyApi.md#supplyGetListV1) | **GET** /1/object/supply/getList | Retrieve Supply list
[**supplyGetObjectV2**](ObjectSupplyApi.md#supplyGetObjectV2) | **GET** /2/object/supply/{pkiSupplyID} | Retrieve an existing Supply



## supplyCreateObjectV1

> SupplyCreateObjectV1Response supplyCreateObjectV1(supplyCreateObjectV1Request)

Create a new Supply

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
SupplyCreateObjectV1Request supplyCreateObjectV1Request = new SupplyCreateObjectV1Request(); // SupplyCreateObjectV1Request | 
try {
    SupplyCreateObjectV1Response result = apiInstance.supplyCreateObjectV1(supplyCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplyCreateObjectV1Request** | [**SupplyCreateObjectV1Request**](SupplyCreateObjectV1Request.md)|  |

### Return type

[**SupplyCreateObjectV1Response**](SupplyCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## supplyDeleteObjectV1

> CommonResponse supplyDeleteObjectV1(pkiSupplyID)

Delete an existing Supply



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
Integer pkiSupplyID = null; // Integer | The unique ID of the Supply
try {
    CommonResponse result = apiInstance.supplyDeleteObjectV1(pkiSupplyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSupplyID** | **Integer**| The unique ID of the Supply | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## supplyEditObjectV1

> CommonResponse supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request)

Edit an existing Supply



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
Integer pkiSupplyID = null; // Integer | The unique ID of the Supply
SupplyEditObjectV1Request supplyEditObjectV1Request = new SupplyEditObjectV1Request(); // SupplyEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSupplyID** | **Integer**| The unique ID of the Supply | [default to null]
 **supplyEditObjectV1Request** | [**SupplyEditObjectV1Request**](SupplyEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## supplyGetAutocompleteV2

> SupplyGetAutocompleteV2Response supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Supplys and IDs

Get the list of Supply to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
String sSelector = null; // String | The type of Supplys to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    SupplyGetAutocompleteV2Response result = apiInstance.supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Supplys to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**SupplyGetAutocompleteV2Response**](SupplyGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## supplyGetListV1

> SupplyGetListV1Response supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Supply list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    SupplyGetListV1Response result = apiInstance.supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiSupplyID_ASC, pkiSupplyID_DESC, fkiGlaccountID_ASC, fkiGlaccountID_DESC, fkiGlaccountcontainerID_ASC, fkiGlaccountcontainerID_DESC, fkiVariableexpenseID_ASC, fkiVariableexpenseID_DESC, sSupplyCode_ASC, sSupplyCode_DESC, sSupplyDescriptionX_ASC, sSupplyDescriptionX_DESC, dSupplyUnitprice_ASC, dSupplyUnitprice_DESC, bSupplyIsactive_ASC, bSupplyIsactive_DESC, bSupplyVariableprice_ASC, bSupplyVariableprice_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**SupplyGetListV1Response**](SupplyGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## supplyGetObjectV2

> SupplyGetObjectV2Response supplyGetObjectV2(pkiSupplyID)

Retrieve an existing Supply



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSupplyApi;

ObjectSupplyApi apiInstance = new ObjectSupplyApi();
Integer pkiSupplyID = null; // Integer | The unique ID of the Supply
try {
    SupplyGetObjectV2Response result = apiInstance.supplyGetObjectV2(pkiSupplyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSupplyApi#supplyGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSupplyID** | **Integer**| The unique ID of the Supply | [default to null]

### Return type

[**SupplyGetObjectV2Response**](SupplyGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

