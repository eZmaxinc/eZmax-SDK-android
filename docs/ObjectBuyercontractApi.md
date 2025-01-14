# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyercontractGetCommunicationCountV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count
[**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list
[**buyercontractGetCommunicationrecipientsV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient
[**buyercontractGetCommunicationsendersV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender



## buyercontractGetCommunicationCountV1

> BuyercontractGetCommunicationCountV1Response buyercontractGetCommunicationCountV1(pkiBuyercontractID)

Retrieve Communication count



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
Integer pkiBuyercontractID = null; // Integer | 
try {
    BuyercontractGetCommunicationCountV1Response result = apiInstance.buyercontractGetCommunicationCountV1(pkiBuyercontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **Integer**|  | [default to null]

### Return type

[**BuyercontractGetCommunicationCountV1Response**](BuyercontractGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## buyercontractGetCommunicationListV1

> BuyercontractGetCommunicationListV1Response buyercontractGetCommunicationListV1(pkiBuyercontractID)

Retrieve Communication list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
Integer pkiBuyercontractID = null; // Integer | 
try {
    BuyercontractGetCommunicationListV1Response result = apiInstance.buyercontractGetCommunicationListV1(pkiBuyercontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **Integer**|  | [default to null]

### Return type

[**BuyercontractGetCommunicationListV1Response**](BuyercontractGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## buyercontractGetCommunicationrecipientsV1

> BuyercontractGetCommunicationrecipientsV1Response buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationrecipient



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
Integer pkiBuyercontractID = null; // Integer | 
try {
    BuyercontractGetCommunicationrecipientsV1Response result = apiInstance.buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **Integer**|  | [default to null]

### Return type

[**BuyercontractGetCommunicationrecipientsV1Response**](BuyercontractGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## buyercontractGetCommunicationsendersV1

> BuyercontractGetCommunicationsendersV1Response buyercontractGetCommunicationsendersV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationsender



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
Integer pkiBuyercontractID = null; // Integer | 
try {
    BuyercontractGetCommunicationsendersV1Response result = apiInstance.buyercontractGetCommunicationsendersV1(pkiBuyercontractID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **Integer**|  | [default to null]

### Return type

[**BuyercontractGetCommunicationsendersV1Response**](BuyercontractGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

