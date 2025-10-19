# ObjectInscriptionchecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionchecklistGetAutocompleteV2**](ObjectInscriptionchecklistApi.md#inscriptionchecklistGetAutocompleteV2) | **GET** /2/object/inscriptionchecklist/getAutocomplete/{sSelector} | Retrieve Inscriptionchecklists and IDs
[**inscriptionchecklistGetAutocompleteV3**](ObjectInscriptionchecklistApi.md#inscriptionchecklistGetAutocompleteV3) | **GET** /3/object/inscriptionchecklist/getAutocomplete/{sSelector} | Retrieve Inscriptionchecklists and IDs



## inscriptionchecklistGetAutocompleteV2

> InscriptionchecklistGetAutocompleteV2Response inscriptionchecklistGetAutocompleteV2(sSelector, fkiID, eType, eFilterActive, sQuery, acceptLanguage)

Retrieve Inscriptionchecklists and IDs

Get the list of Inscriptionchecklist to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionchecklistApi;

ObjectInscriptionchecklistApi apiInstance = new ObjectInscriptionchecklistApi();
String sSelector = null; // String | The type of Inscriptionchecklist to return
String fkiID = null; // String | Specify which fkiID we want to display.
String eType = null; // String | The type of Inscriptionchecklist
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    InscriptionchecklistGetAutocompleteV2Response result = apiInstance.inscriptionchecklistGetAutocompleteV2(sSelector, fkiID, eType, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Inscriptionchecklist to return | [default to null] [enum: All]
 **fkiID** | **String**| Specify which fkiID we want to display. | [optional] [default to null]
 **eType** | **String**| The type of Inscriptionchecklist | [optional] [default to null] [enum: Buyercontract, Inscription, Inscriptionnotauthenticated, Inscriptiontemp, Agent, Broker, Otherincome, Rejectedoffertopurchase]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**InscriptionchecklistGetAutocompleteV2Response**](InscriptionchecklistGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## inscriptionchecklistGetAutocompleteV3

> InscriptionchecklistGetAutocompleteV3Response inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage)

Retrieve Inscriptionchecklists and IDs

Get the list of Inscriptionchecklist to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionchecklistApi;

ObjectInscriptionchecklistApi apiInstance = new ObjectInscriptionchecklistApi();
String sSelector = null; // String | The type of Inscriptionchecklist to return
String fkiBuyercontractID = null; // String | Specify which Buyercontract we want to display.
String fkiInscriptionID = null; // String | Specify which Inscription we want to display.
String fkiInscriptionnotauthenticatedID = null; // String | Specify which Inscriptionnotauthenticated we want to display.
String fkiInscriptiontempID = null; // String | Specify which Inscriptiontemp we want to display.
String fkiAgentID = null; // String | Specify which Agent we want to display.
String fkiBrokerID = null; // String | Specify which Broker we want to display.
String fkiOtherincomeID = null; // String | Specify which Otherincome we want to display.
String fkiRejectedoffertopurchaseID = null; // String | Specify which Rejectedoffertopurchase we want to display.
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    InscriptionchecklistGetAutocompleteV3Response result = apiInstance.inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV3");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Inscriptionchecklist to return | [default to null] [enum: All]
 **fkiBuyercontractID** | **String**| Specify which Buyercontract we want to display. | [optional] [default to null]
 **fkiInscriptionID** | **String**| Specify which Inscription we want to display. | [optional] [default to null]
 **fkiInscriptionnotauthenticatedID** | **String**| Specify which Inscriptionnotauthenticated we want to display. | [optional] [default to null]
 **fkiInscriptiontempID** | **String**| Specify which Inscriptiontemp we want to display. | [optional] [default to null]
 **fkiAgentID** | **String**| Specify which Agent we want to display. | [optional] [default to null]
 **fkiBrokerID** | **String**| Specify which Broker we want to display. | [optional] [default to null]
 **fkiOtherincomeID** | **String**| Specify which Otherincome we want to display. | [optional] [default to null]
 **fkiRejectedoffertopurchaseID** | **String**| Specify which Rejectedoffertopurchase we want to display. | [optional] [default to null]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**InscriptionchecklistGetAutocompleteV3Response**](InscriptionchecklistGetAutocompleteV3Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

