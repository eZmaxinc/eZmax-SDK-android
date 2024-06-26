# ObjectEzmaxinvoicingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxinvoicingGetAutocompleteV2**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetAutocompleteV2) | **GET** /2/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
[**ezmaxinvoicingGetObjectV2**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetObjectV2) | **GET** /2/object/ezmaxinvoicing/{pkiEzmaxinvoicingID} | Retrieve an existing Ezmaxinvoicing
[**ezmaxinvoicingGetProvisionalV1**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetProvisionalV1) | **GET** /1/object/ezmaxinvoicing/getProvisional | Retrieve provisional Ezmaxinvoicing



## ezmaxinvoicingGetAutocompleteV2

> EzmaxinvoicingGetAutocompleteV2Response ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezmaxinvoicings and IDs

Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxinvoicingApi;

ObjectEzmaxinvoicingApi apiInstance = new ObjectEzmaxinvoicingApi();
String sSelector = null; // String | The type of Ezmaxinvoicings to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    EzmaxinvoicingGetAutocompleteV2Response result = apiInstance.ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Ezmaxinvoicings to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**EzmaxinvoicingGetAutocompleteV2Response**](EzmaxinvoicingGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezmaxinvoicingGetObjectV2

> EzmaxinvoicingGetObjectV2Response ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID)

Retrieve an existing Ezmaxinvoicing



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxinvoicingApi;

ObjectEzmaxinvoicingApi apiInstance = new ObjectEzmaxinvoicingApi();
Integer pkiEzmaxinvoicingID = null; // Integer | 
try {
    EzmaxinvoicingGetObjectV2Response result = apiInstance.ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxinvoicingID** | **Integer**|  | [default to null]

### Return type

[**EzmaxinvoicingGetObjectV2Response**](EzmaxinvoicingGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezmaxinvoicingGetProvisionalV1

> EzmaxinvoicingGetProvisionalV1Response ezmaxinvoicingGetProvisionalV1()

Retrieve provisional Ezmaxinvoicing



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzmaxinvoicingApi;

ObjectEzmaxinvoicingApi apiInstance = new ObjectEzmaxinvoicingApi();
try {
    EzmaxinvoicingGetProvisionalV1Response result = apiInstance.ezmaxinvoicingGetProvisionalV1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetProvisionalV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**EzmaxinvoicingGetProvisionalV1Response**](EzmaxinvoicingGetProvisionalV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

