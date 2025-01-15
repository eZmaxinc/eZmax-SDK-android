# ObjectEzsignsigningreasonApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsigningreasonCreateObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonCreateObjectV1) | **POST** /1/object/ezsignsigningreason | Create a new Ezsignsigningreason
[**ezsignsigningreasonEditObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonEditObjectV1) | **PUT** /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Edit an existing Ezsignsigningreason
[**ezsignsigningreasonGetAutocompleteV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetAutocompleteV2) | **GET** /2/object/ezsignsigningreason/getAutocomplete/{sSelector} | Retrieve Ezsignsigningreasons and IDs
[**ezsignsigningreasonGetListV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetListV1) | **GET** /1/object/ezsignsigningreason/getList | Retrieve Ezsignsigningreason list
[**ezsignsigningreasonGetObjectV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetObjectV2) | **GET** /2/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Retrieve an existing Ezsignsigningreason



## ezsignsigningreasonCreateObjectV1

> EzsignsigningreasonCreateObjectV1Response ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request)

Create a new Ezsignsigningreason

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsigningreasonApi;

ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi();
EzsignsigningreasonCreateObjectV1Request ezsignsigningreasonCreateObjectV1Request = new EzsignsigningreasonCreateObjectV1Request(); // EzsignsigningreasonCreateObjectV1Request | 
try {
    EzsignsigningreasonCreateObjectV1Response result = apiInstance.ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsigningreasonCreateObjectV1Request** | [**EzsignsigningreasonCreateObjectV1Request**](EzsignsigningreasonCreateObjectV1Request.md)|  |

### Return type

[**EzsignsigningreasonCreateObjectV1Response**](EzsignsigningreasonCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsigningreasonEditObjectV1

> CommonResponse ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request)

Edit an existing Ezsignsigningreason



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsigningreasonApi;

ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi();
Integer pkiEzsignsigningreasonID = null; // Integer | The unique ID of the Ezsignsigningreason
EzsignsigningreasonEditObjectV1Request ezsignsigningreasonEditObjectV1Request = new EzsignsigningreasonEditObjectV1Request(); // EzsignsigningreasonEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsigningreasonID** | **Integer**| The unique ID of the Ezsignsigningreason | [default to null]
 **ezsignsigningreasonEditObjectV1Request** | [**EzsignsigningreasonEditObjectV1Request**](EzsignsigningreasonEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsigningreasonGetAutocompleteV2

> EzsignsigningreasonGetAutocompleteV2Response ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignsigningreasons and IDs

Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsigningreasonApi;

ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi();
String sSelector = null; // String | The type of Ezsignsigningreasons to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    EzsignsigningreasonGetAutocompleteV2Response result = apiInstance.ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezsignsigningreasons to return | [default to null] [enum: All, Active]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**EzsignsigningreasonGetAutocompleteV2Response**](EzsignsigningreasonGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsigningreasonGetListV1

> EzsignsigningreasonGetListV1Response ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignsigningreason list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsigningreasonApi;

ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsignsigningreasonGetListV1Response result = apiInstance.ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsignsigningreasonID_ASC, pkiEzsignsigningreasonID_DESC, sEzsignsigningreasonDescriptionX_ASC, sEzsignsigningreasonDescriptionX_DESC, bEzsignsigningreasonIsactive_ASC, bEzsignsigningreasonIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsignsigningreasonGetListV1Response**](EzsignsigningreasonGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsignsigningreasonGetObjectV2

> EzsignsigningreasonGetObjectV2Response ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID)

Retrieve an existing Ezsignsigningreason



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsigningreasonApi;

ObjectEzsignsigningreasonApi apiInstance = new ObjectEzsignsigningreasonApi();
Integer pkiEzsignsigningreasonID = null; // Integer | The unique ID of the Ezsignsigningreason
try {
    EzsignsigningreasonGetObjectV2Response result = apiInstance.ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsigningreasonID** | **Integer**| The unique ID of the Ezsignsigningreason | [default to null]

### Return type

[**EzsignsigningreasonGetObjectV2Response**](EzsignsigningreasonGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

