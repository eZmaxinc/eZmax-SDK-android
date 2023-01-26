# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetListV1**](ObjectCommunicationApi.md#communicationGetListV1) | **GET** /1/object/communication/getList | Retrieve Communication list
[**communicationGetObjectV2**](ObjectCommunicationApi.md#communicationGetObjectV2) | **GET** /2/object/communication/{pkiCommunicationID} | Retrieve an existing Communication



## communicationGetListV1

> CommunicationGetListV1Response communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Communication list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eCommunicationImportance | High&lt;br&gt;Normal&lt;br&gt;Low | | eCommunicationType | Email&lt;br&gt;Fax&lt;br&gt;Sms | | eCommunicationDirection | Inbound&lt;br&gt;Outbound |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommunicationApi;

ObjectCommunicationApi apiInstance = new ObjectCommunicationApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = null; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    CommunicationGetListV1Response result = apiInstance.communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommunicationApi#communicationGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiCommunicationID_ASC, pkiCommunicationID_DESC, fkiEzsignfolderID_ASC, fkiEzsignfolderID_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, eCommunicationDirection_ASC, eCommunicationDirection_DESC, eCommunicationImportance_ASC, eCommunicationImportance_DESC, eCommunicationType_ASC, eCommunicationType_DESC, iCommunicationrecipientCount_ASC, iCommunicationrecipientCount_DESC, sCommunicationSubject_ASC, sCommunicationSubject_DESC, sCommunicationSender_ASC, sCommunicationSender_DESC, sCommunicationRecipient_ASC, sCommunicationRecipient_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**CommunicationGetListV1Response**](CommunicationGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## communicationGetObjectV2

> CommunicationGetObjectV2Response communicationGetObjectV2(pkiCommunicationID)

Retrieve an existing Communication



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCommunicationApi;

ObjectCommunicationApi apiInstance = new ObjectCommunicationApi();
Integer pkiCommunicationID = null; // Integer | 
try {
    CommunicationGetObjectV2Response result = apiInstance.communicationGetObjectV2(pkiCommunicationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCommunicationApi#communicationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommunicationID** | **Integer**|  | [default to null]

### Return type

[**CommunicationGetObjectV2Response**](CommunicationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

