# ObjectInscriptionnotauthenticatedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionnotauthenticatedGetCommunicationListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list



## inscriptionnotauthenticatedGetCommunicationListV1

> InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionnotauthenticatedApi;

ObjectInscriptionnotauthenticatedApi apiInstance = new ObjectInscriptionnotauthenticatedApi();
Integer pkiInscriptionnotauthenticatedID = null; // Integer | 
try {
    InscriptionnotauthenticatedGetCommunicationListV1Response result = apiInstance.inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **Integer**|  | [default to null]

### Return type

[**InscriptionnotauthenticatedGetCommunicationListV1Response**](InscriptionnotauthenticatedGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

