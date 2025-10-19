# ObjectAgentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agentGetAutocompleteV2**](ObjectAgentApi.md#agentGetAutocompleteV2) | **GET** /2/object/agent/getAutocomplete/{sSelector} | Retrieve Agents and IDs
[**agentGetListV1**](ObjectAgentApi.md#agentGetListV1) | **GET** /1/object/agent/getList | Retrieve Agent list
[**agentImportIntoEDMV1**](ObjectAgentApi.md#agentImportIntoEDMV1) | **POST** /1/object/agent/{pkiAgentID}/importIntoEDM | Import attachments into the Agent



## agentGetAutocompleteV2

> AgentGetAutocompleteV2Response agentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Agents and IDs

Get the list of Agent to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAgentApi;

ObjectAgentApi apiInstance = new ObjectAgentApi();
String sSelector = null; // String | The type of Agents to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    AgentGetAutocompleteV2Response result = apiInstance.agentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAgentApi#agentGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Agents to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**AgentGetAutocompleteV2Response**](AgentGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## agentGetListV1

> AgentGetListV1Response agentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Agent list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAgentApi;

ObjectAgentApi apiInstance = new ObjectAgentApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    AgentGetListV1Response result = apiInstance.agentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAgentApi#agentGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiAgentID_ASC, pkiAgentID_DESC, fkiAgenttypeID_ASC, fkiAgenttypeID_DESC, sAgenttypeNameX_ASC, sAgenttypeNameX_DESC, fkiAgentincorporationID_ASC, fkiAgentincorporationID_DESC, sAgentincorporationName_ASC, sAgentincorporationName_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, sLanguageNameX_ASC, sLanguageNameX_DESC, sRealestateboardnumberNumber_ASC, sRealestateboardnumberNumber_DESC, sAgentCode_ASC, sAgentCode_DESC, iAgentPhotocopiercode_ASC, iAgentPhotocopiercode_DESC, iAgentLongdistancecode_ASC, iAgentLongdistancecode_DESC, iAgentBannernumber_ASC, iAgentBannernumber_DESC, sAgentRealestateassociationlicense_ASC, sAgentRealestateassociationlicense_DESC, dtAgentHiredate_ASC, dtAgentHiredate_DESC, dtAgentLeavedate_ASC, dtAgentLeavedate_DESC, bAgentTranquillit_ASC, bAgentTranquillit_DESC, bAgentResidentiallicense_ASC, bAgentResidentiallicense_DESC, bAgentCommerciallicense_ASC, bAgentCommerciallicense_DESC, bAgentMortgagelicense_ASC, bAgentMortgagelicense_DESC, bAgentPaidbyofficetranquillit_ASC, bAgentPaidbyofficetranquillit_DESC, dtAgentFintraccertification_ASC, dtAgentFintraccertification_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, dtContactBirthdate_ASC, dtContactBirthdate_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, bAgentIsactive_ASC, bAgentIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**AgentGetListV1Response**](AgentGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## agentImportIntoEDMV1

> AgentImportIntoEDMV1Response agentImportIntoEDMV1(pkiAgentID, agentImportIntoEDMV1Request)

Import attachments into the Agent



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectAgentApi;

ObjectAgentApi apiInstance = new ObjectAgentApi();
Integer pkiAgentID = null; // Integer | 
AgentImportIntoEDMV1Request agentImportIntoEDMV1Request = new AgentImportIntoEDMV1Request(); // AgentImportIntoEDMV1Request | 
try {
    AgentImportIntoEDMV1Response result = apiInstance.agentImportIntoEDMV1(pkiAgentID, agentImportIntoEDMV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectAgentApi#agentImportIntoEDMV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAgentID** | **Integer**|  | [default to null]
 **agentImportIntoEDMV1Request** | [**AgentImportIntoEDMV1Request**](AgentImportIntoEDMV1Request.md)|  |

### Return type

[**AgentImportIntoEDMV1Response**](AgentImportIntoEDMV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

