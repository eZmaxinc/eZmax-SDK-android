# ObjectTranqcontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tranqcontractGetCommunicationCountV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationCountV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount | Retrieve Communication count
[**tranqcontractGetCommunicationListV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationListV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList | Retrieve Communication list
[**tranqcontractGetCommunicationrecipientsV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationrecipientsV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients | Retrieve Tranqcontract&#39;s Communicationrecipient
[**tranqcontractGetCommunicationsendersV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationsendersV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders | Retrieve Tranqcontract&#39;s Communicationsender



## tranqcontractGetCommunicationCountV1

> TranqcontractGetCommunicationCountV1Response tranqcontractGetCommunicationCountV1(pkiTranqcontractID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTranqcontractApi;

ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi();
Integer pkiTranqcontractID = null; // Integer | 
try {
    TranqcontractGetCommunicationCountV1Response result = apiInstance.tranqcontractGetCommunicationCountV1(pkiTranqcontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiTranqcontractID** | **Integer**|  | [default to null]

### Return type

[**TranqcontractGetCommunicationCountV1Response**](TranqcontractGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## tranqcontractGetCommunicationListV1

> TranqcontractGetCommunicationListV1Response tranqcontractGetCommunicationListV1(pkiTranqcontractID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTranqcontractApi;

ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi();
Integer pkiTranqcontractID = null; // Integer | 
try {
    TranqcontractGetCommunicationListV1Response result = apiInstance.tranqcontractGetCommunicationListV1(pkiTranqcontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiTranqcontractID** | **Integer**|  | [default to null]

### Return type

[**TranqcontractGetCommunicationListV1Response**](TranqcontractGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## tranqcontractGetCommunicationrecipientsV1

> TranqcontractGetCommunicationrecipientsV1Response tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTranqcontractApi;

ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi();
Integer pkiTranqcontractID = null; // Integer | 
try {
    TranqcontractGetCommunicationrecipientsV1Response result = apiInstance.tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiTranqcontractID** | **Integer**|  | [default to null]

### Return type

[**TranqcontractGetCommunicationrecipientsV1Response**](TranqcontractGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## tranqcontractGetCommunicationsendersV1

> TranqcontractGetCommunicationsendersV1Response tranqcontractGetCommunicationsendersV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectTranqcontractApi;

ObjectTranqcontractApi apiInstance = new ObjectTranqcontractApi();
Integer pkiTranqcontractID = null; // Integer | 
try {
    TranqcontractGetCommunicationsendersV1Response result = apiInstance.tranqcontractGetCommunicationsendersV1(pkiTranqcontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectTranqcontractApi#tranqcontractGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiTranqcontractID** | **Integer**|  | [default to null]

### Return type

[**TranqcontractGetCommunicationsendersV1Response**](TranqcontractGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

