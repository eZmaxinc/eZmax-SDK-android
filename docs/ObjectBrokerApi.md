# ObjectBrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brokerBatchDownloadV1**](ObjectBrokerApi.md#brokerBatchDownloadV1) | **POST** /1/object/broker/{pkiBrokerID}/batchDownload | Download multiples attachments from a Broker
[**brokerGetAttachmentsV1**](ObjectBrokerApi.md#brokerGetAttachmentsV1) | **GET** /1/object/broker/{pkiBrokerID}/getAttachments | Retrieve Broker&#39;s attachments
[**brokerGetAutocompleteV2**](ObjectBrokerApi.md#brokerGetAutocompleteV2) | **GET** /2/object/broker/getAutocomplete/{sSelector} | Retrieve Brokers and IDs
[**brokerGetCommunicationCountV1**](ObjectBrokerApi.md#brokerGetCommunicationCountV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationCount | Retrieve Communication count
[**brokerGetCommunicationListV1**](ObjectBrokerApi.md#brokerGetCommunicationListV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationList | Retrieve Communication list
[**brokerGetCommunicationrecipientsV1**](ObjectBrokerApi.md#brokerGetCommunicationrecipientsV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationrecipients | Retrieve Communication recipients
[**brokerGetCommunicationsendersV1**](ObjectBrokerApi.md#brokerGetCommunicationsendersV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationsenders | Retrieve Communication senders
[**brokerGetListV1**](ObjectBrokerApi.md#brokerGetListV1) | **GET** /1/object/broker/getList | Retrieve Broker list
[**brokerImportIntoEDMV1**](ObjectBrokerApi.md#brokerImportIntoEDMV1) | **POST** /1/object/broker/{pkiBrokerID}/importIntoEDM | Import attachments into the Broker



## brokerBatchDownloadV1

> File brokerBatchDownloadV1(pkiBrokerID, brokerBatchDownloadV1Request)

Download multiples attachments from a Broker

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
BrokerBatchDownloadV1Request brokerBatchDownloadV1Request = new BrokerBatchDownloadV1Request(); // BrokerBatchDownloadV1Request | 
try {
    File result = apiInstance.brokerBatchDownloadV1(pkiBrokerID, brokerBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]
 **brokerBatchDownloadV1Request** | [**BrokerBatchDownloadV1Request**](BrokerBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## brokerGetAttachmentsV1

> BrokerGetAttachmentsV1Response brokerGetAttachmentsV1(pkiBrokerID)

Retrieve Broker&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
try {
    BrokerGetAttachmentsV1Response result = apiInstance.brokerGetAttachmentsV1(pkiBrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]

### Return type

[**BrokerGetAttachmentsV1Response**](BrokerGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetAutocompleteV2

> BrokerGetAutocompleteV2Response brokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Brokers and IDs

Get the list of Broker to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
String sSelector = null; // String | The type of Brokers to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    BrokerGetAutocompleteV2Response result = apiInstance.brokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Brokers to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**BrokerGetAutocompleteV2Response**](BrokerGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetCommunicationCountV1

> BrokerGetCommunicationCountV1Response brokerGetCommunicationCountV1(pkiBrokerID)

Retrieve Communication count

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
try {
    BrokerGetCommunicationCountV1Response result = apiInstance.brokerGetCommunicationCountV1(pkiBrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetCommunicationCountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]

### Return type

[**BrokerGetCommunicationCountV1Response**](BrokerGetCommunicationCountV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetCommunicationListV1

> BrokerGetCommunicationListV1Response brokerGetCommunicationListV1(pkiBrokerID)

Retrieve Communication list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
try {
    BrokerGetCommunicationListV1Response result = apiInstance.brokerGetCommunicationListV1(pkiBrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetCommunicationListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]

### Return type

[**BrokerGetCommunicationListV1Response**](BrokerGetCommunicationListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetCommunicationrecipientsV1

> BrokerGetCommunicationrecipientsV1Response brokerGetCommunicationrecipientsV1(pkiBrokerID)

Retrieve Communication recipients

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
try {
    BrokerGetCommunicationrecipientsV1Response result = apiInstance.brokerGetCommunicationrecipientsV1(pkiBrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetCommunicationrecipientsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]

### Return type

[**BrokerGetCommunicationrecipientsV1Response**](BrokerGetCommunicationrecipientsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetCommunicationsendersV1

> BrokerGetCommunicationsendersV1Response brokerGetCommunicationsendersV1(pkiBrokerID)

Retrieve Communication senders

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
try {
    BrokerGetCommunicationsendersV1Response result = apiInstance.brokerGetCommunicationsendersV1(pkiBrokerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetCommunicationsendersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]

### Return type

[**BrokerGetCommunicationsendersV1Response**](BrokerGetCommunicationsendersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## brokerGetListV1

> BrokerGetListV1Response brokerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Broker list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    BrokerGetListV1Response result = apiInstance.brokerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiBrokerID_ASC, pkiBrokerID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sLanguageNameX_ASC, sLanguageNameX_DESC, fkiBrokertypeID_ASC, fkiBrokertypeID_DESC, sBrokertypeNameX_ASC, sBrokertypeNameX_DESC, sRealestateboardnumberNumber_ASC, sRealestateboardnumberNumber_DESC, sBrokerCode_ASC, sBrokerCode_DESC, iBrokerPhotocopiercode_ASC, iBrokerPhotocopiercode_DESC, iBrokerLongdistancecode_ASC, iBrokerLongdistancecode_DESC, sBrokerName_ASC, sBrokerName_DESC, iAgentBannernumber_ASC, iAgentBannernumber_DESC, sBrokerRealestateassociationlicense_ASC, sBrokerRealestateassociationlicense_DESC, dtBrokerHiredate_ASC, dtBrokerHiredate_DESC, dtBrokerLeavedate_ASC, dtBrokerLeavedate_DESC, bBrokerTranquillit_ASC, bBrokerTranquillit_DESC, bBrokerResidentiallicense_ASC, bBrokerResidentiallicense_DESC, bBrokerCommerciallicense_ASC, bBrokerCommerciallicense_DESC, bBrokerMortgagelicense_ASC, bBrokerMortgagelicense_DESC, bBrokerPaidbyofficetranquillit_ASC, bBrokerPaidbyofficetranquillit_DESC, dtBrokerFintraccertification_ASC, dtBrokerFintraccertification_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, dtContactBirthdate_ASC, dtContactBirthdate_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, bBrokerIsactive_ASC, bBrokerIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**BrokerGetListV1Response**](BrokerGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## brokerImportIntoEDMV1

> BrokerImportIntoEDMV1Response brokerImportIntoEDMV1(pkiBrokerID, brokerImportIntoEDMV1Request)

Import attachments into the Broker



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectBrokerApi;

ObjectBrokerApi apiInstance = new ObjectBrokerApi();
Integer pkiBrokerID = null; // Integer | 
BrokerImportIntoEDMV1Request brokerImportIntoEDMV1Request = new BrokerImportIntoEDMV1Request(); // BrokerImportIntoEDMV1Request | 
try {
    BrokerImportIntoEDMV1Response result = apiInstance.brokerImportIntoEDMV1(pkiBrokerID, brokerImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectBrokerApi#brokerImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrokerID** | **Integer**|  | [default to null]
 **brokerImportIntoEDMV1Request** | [**BrokerImportIntoEDMV1Request**](BrokerImportIntoEDMV1Request.md)|  |

### Return type

[**BrokerImportIntoEDMV1Response**](BrokerImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

