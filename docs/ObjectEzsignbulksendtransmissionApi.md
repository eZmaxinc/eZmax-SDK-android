# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendtransmissionGetCsvErrorsV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
[**ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures
[**ezsignbulksendtransmissionGetFormsDataV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
[**ezsignbulksendtransmissionGetObjectV2**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV2) | **GET** /2/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission



## ezsignbulksendtransmissionGetCsvErrorsV1

> String ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendtransmissionApi;

ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi();
Integer pkiEzsignbulksendtransmissionID = null; // Integer | 
try {
    String result = apiInstance.ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **Integer**|  | [default to null]

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/csv, application/json


## ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1

> EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures

Return the Ezsignsignatures that can be signed by the current user at the current step in the process

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendtransmissionApi;

ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi();
Integer pkiEzsignbulksendtransmissionID = null; // Integer | 
try {
    EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response result = apiInstance.ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendtransmissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response**](EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignbulksendtransmissionGetFormsDataV1

> EzsignbulksendtransmissionGetFormsDataV1Response ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s forms data



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendtransmissionApi;

ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi();
Integer pkiEzsignbulksendtransmissionID = null; // Integer | 
try {
    EzsignbulksendtransmissionGetFormsDataV1Response result = apiInstance.ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendtransmissionGetFormsDataV1Response**](EzsignbulksendtransmissionGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/zip


## ezsignbulksendtransmissionGetObjectV2

> EzsignbulksendtransmissionGetObjectV2Response ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignbulksendtransmissionApi;

ObjectEzsignbulksendtransmissionApi apiInstance = new ObjectEzsignbulksendtransmissionApi();
Integer pkiEzsignbulksendtransmissionID = null; // Integer | 
try {
    EzsignbulksendtransmissionGetObjectV2Response result = apiInstance.ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **Integer**|  | [default to null]

### Return type

[**EzsignbulksendtransmissionGetObjectV2Response**](EzsignbulksendtransmissionGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

