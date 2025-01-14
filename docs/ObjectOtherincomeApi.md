# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**otherincomeGetCommunicationCountV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationCountV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationCount | Retrieve Communication count
[**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list
[**otherincomeGetCommunicationrecipientsV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationrecipientsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationrecipients | Retrieve Otherincome&#39;s Communicationrecipient
[**otherincomeGetCommunicationsendersV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationsendersV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders | Retrieve Otherincome&#39;s Communicationsender



## otherincomeGetCommunicationCountV1

> OtherincomeGetCommunicationCountV1Response otherincomeGetCommunicationCountV1(pkiOtherincomeID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetCommunicationCountV1Response result = apiInstance.otherincomeGetCommunicationCountV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetCommunicationCountV1Response**](OtherincomeGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## otherincomeGetCommunicationListV1

> OtherincomeGetCommunicationListV1Response otherincomeGetCommunicationListV1(pkiOtherincomeID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetCommunicationListV1Response result = apiInstance.otherincomeGetCommunicationListV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetCommunicationListV1Response**](OtherincomeGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## otherincomeGetCommunicationrecipientsV1

> OtherincomeGetCommunicationrecipientsV1Response otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetCommunicationrecipientsV1Response result = apiInstance.otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetCommunicationrecipientsV1Response**](OtherincomeGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## otherincomeGetCommunicationsendersV1

> OtherincomeGetCommunicationsendersV1Response otherincomeGetCommunicationsendersV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetCommunicationsendersV1Response result = apiInstance.otherincomeGetCommunicationsendersV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetCommunicationsendersV1Response**](OtherincomeGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

