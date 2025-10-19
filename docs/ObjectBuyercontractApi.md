# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyercontractGetCommunicationCountV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count
[**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list
[**buyercontractGetCommunicationrecipientsV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient
[**buyercontractGetCommunicationsendersV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender
[**buyercontractGetListV1**](ObjectBuyercontractApi.md#buyercontractGetListV1) | **GET** /1/object/buyercontract/getList | Retrieve Buyercontract list
[**buyercontractImportIntoEDMV1**](ObjectBuyercontractApi.md#buyercontractImportIntoEDMV1) | **POST** /1/object/buyercontract/{pkiBuyercontractID}/importIntoEDM | Import attachments into the Buyercontract



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


## buyercontractGetListV1

> BuyercontractGetListV1Response buyercontractGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Buyercontract list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBuyercontractStep | Imported&lt;br&gt;Active&lt;br&gt;Modified&lt;br&gt;ContractEnded&lt;br&gt;ExpiredContract&lt;br&gt;Bought | | eBuyercontractType | Rent&lt;br&gt;Sale&lt;br&gt;RentOrSale |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    BuyercontractGetListV1Response result = apiInstance.buyercontractGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiBuyercontractID_ASC, pkiBuyercontractID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eBuyercontractStep_ASC, eBuyercontractStep_DESC, dBuyercontractMinimumprice_ASC, dBuyercontractMinimumprice_DESC, dBuyercontractMaximumprice_ASC, dBuyercontractMaximumprice_DESC, eBuyercontractType_ASC, eBuyercontractType_DESC, dtBuyercontractDate_ASC, dtBuyercontractDate_DESC, dtBuyercontractExpirationdate_ASC, dtBuyercontractExpirationdate_DESC, bBuyercontractIsactive_ASC, bBuyercontractIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**BuyercontractGetListV1Response**](BuyercontractGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## buyercontractImportIntoEDMV1

> BuyercontractImportIntoEDMV1Response buyercontractImportIntoEDMV1(pkiBuyercontractID, buyercontractImportIntoEDMV1Request)

Import attachments into the Buyercontract



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBuyercontractApi;

ObjectBuyercontractApi apiInstance = new ObjectBuyercontractApi();
Integer pkiBuyercontractID = null; // Integer | 
BuyercontractImportIntoEDMV1Request buyercontractImportIntoEDMV1Request = new BuyercontractImportIntoEDMV1Request(); // BuyercontractImportIntoEDMV1Request | 
try {
    BuyercontractImportIntoEDMV1Response result = apiInstance.buyercontractImportIntoEDMV1(pkiBuyercontractID, buyercontractImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBuyercontractApi#buyercontractImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **Integer**|  | [default to null]
 **buyercontractImportIntoEDMV1Request** | [**BuyercontractImportIntoEDMV1Request**](BuyercontractImportIntoEDMV1Request.md)|  |

### Return type

[**BuyercontractImportIntoEDMV1Response**](BuyercontractImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

