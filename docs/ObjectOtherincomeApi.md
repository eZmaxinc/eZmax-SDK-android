# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**otherincomeBatchDownloadV1**](ObjectOtherincomeApi.md#otherincomeBatchDownloadV1) | **POST** /1/object/otherincome/{pkiOtherincomeID}/batchDownload | Download multiples attachments from a Otherincome
[**otherincomeGetAttachmentsV1**](ObjectOtherincomeApi.md#otherincomeGetAttachmentsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getAttachments | Retrieve Otherincome&#39;s attachments
[**otherincomeGetCommunicationCountV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationCountV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationCount | Retrieve Communication count
[**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list
[**otherincomeGetCommunicationrecipientsV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationrecipientsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationrecipients | Retrieve Otherincome&#39;s Communicationrecipient
[**otherincomeGetCommunicationsendersV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationsendersV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders | Retrieve Otherincome&#39;s Communicationsender
[**otherincomeGetListV1**](ObjectOtherincomeApi.md#otherincomeGetListV1) | **GET** /1/object/otherincome/getList | Retrieve Otherincome list
[**otherincomeImportIntoEDMV1**](ObjectOtherincomeApi.md#otherincomeImportIntoEDMV1) | **POST** /1/object/otherincome/{pkiOtherincomeID}/importIntoEDM | Import attachments into the Otherincome



## otherincomeBatchDownloadV1

> File otherincomeBatchDownloadV1(pkiOtherincomeID, otherincomeBatchDownloadV1Request)

Download multiples attachments from a Otherincome

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
OtherincomeBatchDownloadV1Request otherincomeBatchDownloadV1Request = new OtherincomeBatchDownloadV1Request(); // OtherincomeBatchDownloadV1Request | 
try {
    File result = apiInstance.otherincomeBatchDownloadV1(pkiOtherincomeID, otherincomeBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]
 **otherincomeBatchDownloadV1Request** | [**OtherincomeBatchDownloadV1Request**](OtherincomeBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, text/xml, application/json


## otherincomeGetAttachmentsV1

> OtherincomeGetAttachmentsV1Response otherincomeGetAttachmentsV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s attachments

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
try {
    OtherincomeGetAttachmentsV1Response result = apiInstance.otherincomeGetAttachmentsV1(pkiOtherincomeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]

### Return type

[**OtherincomeGetAttachmentsV1Response**](OtherincomeGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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


## otherincomeGetListV1

> OtherincomeGetListV1Response otherincomeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Otherincome list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eOtherincomeRemunerationtype | Dollars&lt;br&gt;DollarsTaxesIncluded |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    OtherincomeGetListV1Response result = apiInstance.otherincomeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiOtherincomeID_ASC, pkiOtherincomeID_DESC, fkiOtherincometypeID_ASC, fkiOtherincometypeID_DESC, sOtherincometypeDescriptionX_ASC, sOtherincometypeDescriptionX_DESC, sOtherincomeDescription_ASC, sOtherincomeDescription_DESC, eOtherincomeRemunerationtype_ASC, eOtherincomeRemunerationtype_DESC, dOtherincomeRemunerationsubtotal_ASC, dOtherincomeRemunerationsubtotal_DESC, dOtherincomeRemunerationtaxes_ASC, dOtherincomeRemunerationtaxes_DESC, dOtherincomeRemunerationtotal_ASC, dOtherincomeRemunerationtotal_DESC, dtOtherincomePaid_ASC, dtOtherincomePaid_DESC, bOtherincomeIsactive_ASC, bOtherincomeIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**OtherincomeGetListV1Response**](OtherincomeGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## otherincomeImportIntoEDMV1

> OtherincomeImportIntoEDMV1Response otherincomeImportIntoEDMV1(pkiOtherincomeID, otherincomeImportIntoEDMV1Request)

Import attachments into the Otherincome



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectOtherincomeApi;

ObjectOtherincomeApi apiInstance = new ObjectOtherincomeApi();
Integer pkiOtherincomeID = null; // Integer | 
OtherincomeImportIntoEDMV1Request otherincomeImportIntoEDMV1Request = new OtherincomeImportIntoEDMV1Request(); // OtherincomeImportIntoEDMV1Request | 
try {
    OtherincomeImportIntoEDMV1Response result = apiInstance.otherincomeImportIntoEDMV1(pkiOtherincomeID, otherincomeImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectOtherincomeApi#otherincomeImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **Integer**|  | [default to null]
 **otherincomeImportIntoEDMV1Request** | [**OtherincomeImportIntoEDMV1Request**](OtherincomeImportIntoEDMV1Request.md)|  |

### Return type

[**OtherincomeImportIntoEDMV1Response**](OtherincomeImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

