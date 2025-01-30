# ObjectEzsigntemplatepublicApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepublicCreateEzsignfolderV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateEzsignfolderV1) | **POST** /1/object/ezsigntemplatepublic/createEzsignfolder | Create an Ezsignfolder
[**ezsigntemplatepublicCreateObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateObjectV1) | **POST** /1/object/ezsigntemplatepublic | Create a new Ezsigntemplatepublic
[**ezsigntemplatepublicDeleteObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Delete an existing Ezsigntemplatepublic
[**ezsigntemplatepublicEditObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicEditObjectV1) | **PUT** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Edit an existing Ezsigntemplatepublic
[**ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1) | **POST** /1/object/ezsigntemplatepublic/getEzsigntemplatepublicDetails | Retrieve the Ezsigntemplatepublic details
[**ezsigntemplatepublicGetFormsDataV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetFormsDataV1) | **GET** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/getFormsData | Retrieve an existing Ezsigntemplatepublic&#39;s forms data
[**ezsigntemplatepublicGetListV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetListV1) | **GET** /1/object/ezsigntemplatepublic/getList | Retrieve Ezsigntemplatepublic list
[**ezsigntemplatepublicGetObjectV2**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetObjectV2) | **GET** /2/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Retrieve an existing Ezsigntemplatepublic
[**ezsigntemplatepublicResetLimitExceededCounterV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetLimitExceededCounterV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetLimitExceededCounter | Reset the limit exceeded counter
[**ezsigntemplatepublicResetUrlV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetUrlV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetUrl | Reset the Ezsigntemplatepublic url



## ezsigntemplatepublicCreateEzsignfolderV1

> EzsigntemplatepublicCreateEzsignfolderV1Response ezsigntemplatepublicCreateEzsignfolderV1(ezsigntemplatepublicCreateEzsignfolderV1Request)

Create an Ezsignfolder

Create an Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
EzsigntemplatepublicCreateEzsignfolderV1Request ezsigntemplatepublicCreateEzsignfolderV1Request = new EzsigntemplatepublicCreateEzsignfolderV1Request(); // EzsigntemplatepublicCreateEzsignfolderV1Request | 
try {
    EzsigntemplatepublicCreateEzsignfolderV1Response result = apiInstance.ezsigntemplatepublicCreateEzsignfolderV1(ezsigntemplatepublicCreateEzsignfolderV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateEzsignfolderV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepublicCreateEzsignfolderV1Request** | [**EzsigntemplatepublicCreateEzsignfolderV1Request**](EzsigntemplatepublicCreateEzsignfolderV1Request.md)|  |

### Return type

[**EzsigntemplatepublicCreateEzsignfolderV1Response**](EzsigntemplatepublicCreateEzsignfolderV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepublicCreateObjectV1

> EzsigntemplatepublicCreateObjectV1Response ezsigntemplatepublicCreateObjectV1(ezsigntemplatepublicCreateObjectV1Request)

Create a new Ezsigntemplatepublic

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
EzsigntemplatepublicCreateObjectV1Request ezsigntemplatepublicCreateObjectV1Request = new EzsigntemplatepublicCreateObjectV1Request(); // EzsigntemplatepublicCreateObjectV1Request | 
try {
    EzsigntemplatepublicCreateObjectV1Response result = apiInstance.ezsigntemplatepublicCreateObjectV1(ezsigntemplatepublicCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepublicCreateObjectV1Request** | [**EzsigntemplatepublicCreateObjectV1Request**](EzsigntemplatepublicCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepublicCreateObjectV1Response**](EzsigntemplatepublicCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepublicDeleteObjectV1

> EzsigntemplatepublicDeleteObjectV1Response ezsigntemplatepublicDeleteObjectV1(pkiEzsigntemplatepublicID)

Delete an existing Ezsigntemplatepublic



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | The unique ID of the Ezsigntemplatepublic
try {
    EzsigntemplatepublicDeleteObjectV1Response result = apiInstance.ezsigntemplatepublicDeleteObjectV1(pkiEzsigntemplatepublicID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**| The unique ID of the Ezsigntemplatepublic | [default to null]

### Return type

[**EzsigntemplatepublicDeleteObjectV1Response**](EzsigntemplatepublicDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepublicEditObjectV1

> EzsigntemplatepublicEditObjectV1Response ezsigntemplatepublicEditObjectV1(pkiEzsigntemplatepublicID, ezsigntemplatepublicEditObjectV1Request)

Edit an existing Ezsigntemplatepublic



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | The unique ID of the Ezsigntemplatepublic
EzsigntemplatepublicEditObjectV1Request ezsigntemplatepublicEditObjectV1Request = new EzsigntemplatepublicEditObjectV1Request(); // EzsigntemplatepublicEditObjectV1Request | 
try {
    EzsigntemplatepublicEditObjectV1Response result = apiInstance.ezsigntemplatepublicEditObjectV1(pkiEzsigntemplatepublicID, ezsigntemplatepublicEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**| The unique ID of the Ezsigntemplatepublic | [default to null]
 **ezsigntemplatepublicEditObjectV1Request** | [**EzsigntemplatepublicEditObjectV1Request**](EzsigntemplatepublicEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatepublicEditObjectV1Response**](EzsigntemplatepublicEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1

> EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1(ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request)

Retrieve the Ezsigntemplatepublic details

Retrieve the Ezsigntemplatepublic details

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request = new EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request(); // EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request | 
try {
    EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response result = apiInstance.ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1(ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request** | [**EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request**](EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request.md)|  |

### Return type

[**EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response**](EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepublicGetFormsDataV1

> EzsigntemplatepublicGetFormsDataV1Response ezsigntemplatepublicGetFormsDataV1(pkiEzsigntemplatepublicID)

Retrieve an existing Ezsigntemplatepublic&#39;s forms data



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | 
try {
    EzsigntemplatepublicGetFormsDataV1Response result = apiInstance.ezsigntemplatepublicGetFormsDataV1(pkiEzsigntemplatepublicID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetFormsDataV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatepublicGetFormsDataV1Response**](EzsigntemplatepublicGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/zip


## ezsigntemplatepublicGetListV1

> EzsigntemplatepublicGetListV1Response ezsigntemplatepublicGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepublic list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepublicLimittype | Hour&lt;br&gt;Day&lt;br&gt;Month&lt;br&gt;Total |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsigntemplatepublicGetListV1Response result = apiInstance.ezsigntemplatepublicGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsigntemplatepublicID_ASC, pkiEzsigntemplatepublicID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, fkiUserlogintypeID_ASC, fkiUserlogintypeID_DESC, fkiEzsigntemplateID_ASC, fkiEzsigntemplateID_DESC, fkiEzsigntemplatepackageID_ASC, fkiEzsigntemplatepackageID_DESC, sEzsigntemplatepublicDescription_ASC, sEzsigntemplatepublicDescription_DESC, bEzsigntemplatepublicIsactive_ASC, bEzsigntemplatepublicIsactive_DESC, tEzsigntemplatepublicNote_ASC, tEzsigntemplatepublicNote_DESC, eEzsigntemplatepublicLimittype_ASC, eEzsigntemplatepublicLimittype_DESC, iEzsigntemplatepublicLimit_ASC, iEzsigntemplatepublicLimit_DESC, iEzsigntemplatepublicLimitexceeded_ASC, iEzsigntemplatepublicLimitexceeded_DESC, dtEzsigntemplatepublicLimitexceededsince_ASC, dtEzsigntemplatepublicLimitexceededsince_DESC, iEzsignfolder_ASC, iEzsignfolder_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, sEzsigntemplatepublicEzsigntemplatedescription_ASC, sEzsigntemplatepublicEzsigntemplatedescription_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsigntemplatepublicGetListV1Response**](EzsigntemplatepublicGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsigntemplatepublicGetObjectV2

> EzsigntemplatepublicGetObjectV2Response ezsigntemplatepublicGetObjectV2(pkiEzsigntemplatepublicID)

Retrieve an existing Ezsigntemplatepublic



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | The unique ID of the Ezsigntemplatepublic
try {
    EzsigntemplatepublicGetObjectV2Response result = apiInstance.ezsigntemplatepublicGetObjectV2(pkiEzsigntemplatepublicID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**| The unique ID of the Ezsigntemplatepublic | [default to null]

### Return type

[**EzsigntemplatepublicGetObjectV2Response**](EzsigntemplatepublicGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatepublicResetLimitExceededCounterV1

> EzsigntemplatepublicResetLimitExceededCounterV1Response ezsigntemplatepublicResetLimitExceededCounterV1(pkiEzsigntemplatepublicID, body)

Reset the limit exceeded counter



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigntemplatepublicResetLimitExceededCounterV1Response result = apiInstance.ezsigntemplatepublicResetLimitExceededCounterV1(pkiEzsigntemplatepublicID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetLimitExceededCounterV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigntemplatepublicResetLimitExceededCounterV1Response**](EzsigntemplatepublicResetLimitExceededCounterV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatepublicResetUrlV1

> EzsigntemplatepublicResetUrlV1Response ezsigntemplatepublicResetUrlV1(pkiEzsigntemplatepublicID, body)

Reset the Ezsigntemplatepublic url



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatepublicApi;

ObjectEzsigntemplatepublicApi apiInstance = new ObjectEzsigntemplatepublicApi();
Integer pkiEzsigntemplatepublicID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigntemplatepublicResetUrlV1Response result = apiInstance.ezsigntemplatepublicResetUrlV1(pkiEzsigntemplatepublicID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetUrlV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepublicID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigntemplatepublicResetUrlV1Response**](EzsigntemplatepublicResetUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

