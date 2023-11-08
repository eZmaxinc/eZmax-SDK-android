# ObjectInscriptiontempApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptiontempGetCommunicationListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationListV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList | Retrieve Communication list



## inscriptiontempGetCommunicationListV1

> InscriptiontempGetCommunicationListV1Response inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectInscriptiontempApi;

ObjectInscriptiontempApi apiInstance = new ObjectInscriptiontempApi();
Integer pkiInscriptiontempID = null; // Integer | 
try {
    InscriptiontempGetCommunicationListV1Response result = apiInstance.inscriptiontempGetCommunicationListV1(pkiInscriptiontempID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **Integer**|  | [default to null]

### Return type

[**InscriptiontempGetCommunicationListV1Response**](InscriptiontempGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

