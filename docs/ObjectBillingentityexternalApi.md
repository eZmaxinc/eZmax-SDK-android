# ObjectBillingentityexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingentityexternalGenerateFederationTokenV1**](ObjectBillingentityexternalApi.md#billingentityexternalGenerateFederationTokenV1) | **POST** /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken | Generate a federation token
[**billingentityexternalGetAutocompleteV2**](ObjectBillingentityexternalApi.md#billingentityexternalGetAutocompleteV2) | **GET** /2/object/billingentityexternal/getAutocomplete/{sSelector} | Retrieve Billingentityexternals and IDs



## billingentityexternalGenerateFederationTokenV1

> BillingentityexternalGenerateFederationTokenV1Response billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request)

Generate a federation token



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityexternalApi;

ObjectBillingentityexternalApi apiInstance = new ObjectBillingentityexternalApi();
Integer pkiBillingentityexternalID = null; // Integer | 
BillingentityexternalGenerateFederationTokenV1Request billingentityexternalGenerateFederationTokenV1Request = new BillingentityexternalGenerateFederationTokenV1Request(); // BillingentityexternalGenerateFederationTokenV1Request | 
try {
    BillingentityexternalGenerateFederationTokenV1Response result = apiInstance.billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityexternalApi#billingentityexternalGenerateFederationTokenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityexternalID** | **Integer**|  | [default to null]
 **billingentityexternalGenerateFederationTokenV1Request** | [**BillingentityexternalGenerateFederationTokenV1Request**](BillingentityexternalGenerateFederationTokenV1Request.md)|  |

### Return type

[**BillingentityexternalGenerateFederationTokenV1Response**](BillingentityexternalGenerateFederationTokenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## billingentityexternalGetAutocompleteV2

> BillingentityexternalGetAutocompleteV2Response billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityexternals and IDs

Get the list of Billingentityexternal to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBillingentityexternalApi;

ObjectBillingentityexternalApi apiInstance = new ObjectBillingentityexternalApi();
String sSelector = null; // String | The type of Billingentityexternals to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    BillingentityexternalGetAutocompleteV2Response result = apiInstance.billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBillingentityexternalApi#billingentityexternalGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Billingentityexternals to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**BillingentityexternalGetAutocompleteV2Response**](BillingentityexternalGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

