# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list



## inscriptionGetCommunicationListV1

> InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1(pkiInscriptionID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptionApi;

ObjectInscriptionApi apiInstance = new ObjectInscriptionApi();
Integer pkiInscriptionID = null; // Integer | 
try {
    InscriptionGetCommunicationListV1Response result = apiInstance.inscriptionGetCommunicationListV1(pkiInscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptionApi#inscriptionGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **Integer**|  | [default to null]

### Return type

[**InscriptionGetCommunicationListV1Response**](InscriptionGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

