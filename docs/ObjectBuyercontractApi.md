# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list



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

