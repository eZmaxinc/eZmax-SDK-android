# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderArchiveV1**](ObjectEzsignfolderApi.md#ezsignfolderArchiveV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/archive | Archive the Ezsignfolder
[**ezsignfolderBatchDownloadV1**](ObjectEzsignfolderApi.md#ezsignfolderBatchDownloadV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload | Download multiples files from an Ezsignfolder
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderCreateObjectV2**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderDisposeEzsignfoldersV1**](ObjectEzsignfolderApi.md#ezsignfolderDisposeEzsignfoldersV1) | **POST** /1/object/ezsignfolder/disposeEzsignfolders | Dispose Ezsignfolders
[**ezsignfolderDisposeV1**](ObjectEzsignfolderApi.md#ezsignfolderDisposeV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/dispose | Dispose the Ezsignfolder
[**ezsignfolderEditObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
[**ezsignfolderGetActionableElementsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetActionableElementsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getActionableElements | Retrieve actionable elements for the Ezsignfolder
[**ezsignfolderGetEzsigndocumentsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsigndocumentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments
[**ezsignfolderGetEzsignfoldersignerassociationsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsignfoldersignerassociationsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations
[**ezsignfolderGetFormsDataV1**](ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
[**ezsignfolderGetListV1**](ObjectEzsignfolderApi.md#ezsignfolderGetListV1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
[**ezsignfolderGetObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderImportEzsignfoldersignerassociationsV1**](ObjectEzsignfolderApi.md#ezsignfolderImportEzsignfoldersignerassociationsV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations | Import an existing Ezsignfoldersignerassociation into this Ezsignfolder
[**ezsignfolderImportEzsigntemplatepackageV1**](ObjectEzsignfolderApi.md#ezsignfolderImportEzsigntemplatepackageV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage | Import an Ezsigntemplatepackage in the Ezsignfolder.
[**ezsignfolderReorderV1**](ObjectEzsignfolderApi.md#ezsignfolderReorderV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
[**ezsignfolderSendV1**](ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderSendV2**](ObjectEzsignfolderApi.md#ezsignfolderSendV2) | **POST** /2/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderUnsendV1**](ObjectEzsignfolderApi.md#ezsignfolderUnsendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder



## ezsignfolderArchiveV1

> EzsignfolderArchiveV1Response ezsignfolderArchiveV1(pkiEzsignfolderID, body)

Archive the Ezsignfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsignfolderArchiveV1Response result = apiInstance.ezsignfolderArchiveV1(pkiEzsignfolderID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderArchiveV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsignfolderArchiveV1Response**](EzsignfolderArchiveV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderBatchDownloadV1

> File ezsignfolderBatchDownloadV1(pkiEzsignfolderID, ezsignfolderBatchDownloadV1Request)

Download multiples files from an Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderBatchDownloadV1Request ezsignfolderBatchDownloadV1Request = new EzsignfolderBatchDownloadV1Request(); // EzsignfolderBatchDownloadV1Request | 
try {
    File result = apiInstance.ezsignfolderBatchDownloadV1(pkiEzsignfolderID, ezsignfolderBatchDownloadV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderBatchDownloadV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderBatchDownloadV1Request** | [**EzsignfolderBatchDownloadV1Request**](EzsignfolderBatchDownloadV1Request.md)|  |

### Return type

[**File**](File.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, application/json


## ezsignfolderCreateObjectV1

> EzsignfolderCreateObjectV1Response ezsignfolderCreateObjectV1(ezsignfolderCreateObjectV1Request)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request = Arrays.asList(new EzsignfolderCreateObjectV1Request()); // List<EzsignfolderCreateObjectV1Request> | 
try {
    EzsignfolderCreateObjectV1Response result = apiInstance.ezsignfolderCreateObjectV1(ezsignfolderCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderCreateObjectV1Request** | [**List&lt;EzsignfolderCreateObjectV1Request&gt;**](EzsignfolderCreateObjectV1Request.md)|  |

### Return type

[**EzsignfolderCreateObjectV1Response**](EzsignfolderCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderCreateObjectV2

> EzsignfolderCreateObjectV2Response ezsignfolderCreateObjectV2(ezsignfolderCreateObjectV2Request)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
EzsignfolderCreateObjectV2Request ezsignfolderCreateObjectV2Request = new EzsignfolderCreateObjectV2Request(); // EzsignfolderCreateObjectV2Request | 
try {
    EzsignfolderCreateObjectV2Response result = apiInstance.ezsignfolderCreateObjectV2(ezsignfolderCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderCreateObjectV2Request** | [**EzsignfolderCreateObjectV2Request**](EzsignfolderCreateObjectV2Request.md)|  |

### Return type

[**EzsignfolderCreateObjectV2Response**](EzsignfolderCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderDeleteObjectV1

> EzsignfolderDeleteObjectV1Response ezsignfolderDeleteObjectV1(pkiEzsignfolderID)

Delete an existing Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderDeleteObjectV1Response result = apiInstance.ezsignfolderDeleteObjectV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderDeleteObjectV1Response**](EzsignfolderDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfolderDisposeEzsignfoldersV1

> EzsignfolderDisposeEzsignfoldersV1Response ezsignfolderDisposeEzsignfoldersV1(ezsignfolderDisposeEzsignfoldersV1Request)

Dispose Ezsignfolders



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
EzsignfolderDisposeEzsignfoldersV1Request ezsignfolderDisposeEzsignfoldersV1Request = new EzsignfolderDisposeEzsignfoldersV1Request(); // EzsignfolderDisposeEzsignfoldersV1Request | 
try {
    EzsignfolderDisposeEzsignfoldersV1Response result = apiInstance.ezsignfolderDisposeEzsignfoldersV1(ezsignfolderDisposeEzsignfoldersV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderDisposeEzsignfoldersV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderDisposeEzsignfoldersV1Request** | [**EzsignfolderDisposeEzsignfoldersV1Request**](EzsignfolderDisposeEzsignfoldersV1Request.md)|  |

### Return type

[**EzsignfolderDisposeEzsignfoldersV1Response**](EzsignfolderDisposeEzsignfoldersV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderDisposeV1

> EzsignfolderDisposeV1Response ezsignfolderDisposeV1(pkiEzsignfolderID, body)

Dispose the Ezsignfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsignfolderDisposeV1Response result = apiInstance.ezsignfolderDisposeV1(pkiEzsignfolderID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderDisposeV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsignfolderDisposeV1Response**](EzsignfolderDisposeV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderEditObjectV1

> EzsignfolderEditObjectV1Response ezsignfolderEditObjectV1(pkiEzsignfolderID, ezsignfolderEditObjectV1Request)

Edit an existing Ezsignfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderEditObjectV1Request ezsignfolderEditObjectV1Request = new EzsignfolderEditObjectV1Request(); // EzsignfolderEditObjectV1Request | 
try {
    EzsignfolderEditObjectV1Response result = apiInstance.ezsignfolderEditObjectV1(pkiEzsignfolderID, ezsignfolderEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderEditObjectV1Request** | [**EzsignfolderEditObjectV1Request**](EzsignfolderEditObjectV1Request.md)|  |

### Return type

[**EzsignfolderEditObjectV1Response**](EzsignfolderEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderGetActionableElementsV1

> EzsignfolderGetActionableElementsV1Response ezsignfolderGetActionableElementsV1(pkiEzsignfolderID)

Retrieve actionable elements for the Ezsignfolder

Return the Ezsignsignatures that can be signed and Ezsignformfieldgroups that can be filled by the current user at the current step in the process

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderGetActionableElementsV1Response result = apiInstance.ezsignfolderGetActionableElementsV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetActionableElementsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderGetActionableElementsV1Response**](EzsignfolderGetActionableElementsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfolderGetEzsigndocumentsV1

> EzsignfolderGetEzsigndocumentsV1Response ezsignfolderGetEzsigndocumentsV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderGetEzsigndocumentsV1Response result = apiInstance.ezsignfolderGetEzsigndocumentsV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetEzsigndocumentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderGetEzsigndocumentsV1Response**](EzsignfolderGetEzsigndocumentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfolderGetEzsignfoldersignerassociationsV1

> EzsignfolderGetEzsignfoldersignerassociationsV1Response ezsignfolderGetEzsignfoldersignerassociationsV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderGetEzsignfoldersignerassociationsV1Response result = apiInstance.ezsignfolderGetEzsignfoldersignerassociationsV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetEzsignfoldersignerassociationsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderGetEzsignfoldersignerassociationsV1Response**](EzsignfolderGetEzsignfoldersignerassociationsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfolderGetFormsDataV1

> EzsignfolderGetFormsDataV1Response ezsignfolderGetFormsDataV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s forms data



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderGetFormsDataV1Response result = apiInstance.ezsignfolderGetFormsDataV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetFormsDataV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderGetFormsDataV1Response**](EzsignfolderGetFormsDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/zip


## ezsignfolderGetListV1

> EzsignfolderGetListV1Response ezsignfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfolder list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfolderStep | Unsent&lt;br&gt;Sent&lt;br&gt;PartiallySigned&lt;br&gt;Expired&lt;br&gt;Completed&lt;br&gt;Archived&lt;br&gt;Disposed| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = null; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    EzsignfolderGetListV1Response result = apiInstance.ezsignfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiEzsignfolderID_ASC, pkiEzsignfolderID_DESC, sEzsignfolderDescription_ASC, sEzsignfolderDescription_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfolderStep_ASC, eEzsignfolderStep_DESC, dtEzsignfolderSentdate_ASC, dtEzsignfolderSentdate_DESC, dtDueDate_ASC, dtDueDate_DESC, iTotalDocument_ASC, iTotalDocument_DESC, iTotalDocumentEdm_ASC, iTotalDocumentEdm_DESC, iTotalSignature_ASC, iTotalSignature_DESC, iTotalSignatureSigned_ASC, iTotalSignatureSigned_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**EzsignfolderGetListV1Response**](EzsignfolderGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## ezsignfolderGetObjectV1

> EzsignfolderGetObjectV1Response ezsignfolderGetObjectV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
try {
    EzsignfolderGetObjectV1Response result = apiInstance.ezsignfolderGetObjectV1(pkiEzsignfolderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]

### Return type

[**EzsignfolderGetObjectV1Response**](EzsignfolderGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignfolderImportEzsignfoldersignerassociationsV1

> EzsignfolderImportEzsignfoldersignerassociationsV1Response ezsignfolderImportEzsignfoldersignerassociationsV1(pkiEzsignfolderID, ezsignfolderImportEzsignfoldersignerassociationsV1Request)

Import an existing Ezsignfoldersignerassociation into this Ezsignfolder



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderImportEzsignfoldersignerassociationsV1Request ezsignfolderImportEzsignfoldersignerassociationsV1Request = new EzsignfolderImportEzsignfoldersignerassociationsV1Request(); // EzsignfolderImportEzsignfoldersignerassociationsV1Request | 
try {
    EzsignfolderImportEzsignfoldersignerassociationsV1Response result = apiInstance.ezsignfolderImportEzsignfoldersignerassociationsV1(pkiEzsignfolderID, ezsignfolderImportEzsignfoldersignerassociationsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderImportEzsignfoldersignerassociationsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderImportEzsignfoldersignerassociationsV1Request** | [**EzsignfolderImportEzsignfoldersignerassociationsV1Request**](EzsignfolderImportEzsignfoldersignerassociationsV1Request.md)|  |

### Return type

[**EzsignfolderImportEzsignfoldersignerassociationsV1Response**](EzsignfolderImportEzsignfoldersignerassociationsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderImportEzsigntemplatepackageV1

> EzsignfolderImportEzsigntemplatepackageV1Response ezsignfolderImportEzsigntemplatepackageV1(pkiEzsignfolderID, ezsignfolderImportEzsigntemplatepackageV1Request)

Import an Ezsigntemplatepackage in the Ezsignfolder.

This endpoint imports all of the Ezsigntemplates from the Ezsigntemplatepackage into the Ezsignfolder as Ezsigndocuments.  This allows to automatically apply all the Ezsigntemplateformfieldgroups and Ezsigntemplatesignatures on the newly created Ezsigndocuments in a single step.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderImportEzsigntemplatepackageV1Request ezsignfolderImportEzsigntemplatepackageV1Request = new EzsignfolderImportEzsigntemplatepackageV1Request(); // EzsignfolderImportEzsigntemplatepackageV1Request | 
try {
    EzsignfolderImportEzsigntemplatepackageV1Response result = apiInstance.ezsignfolderImportEzsigntemplatepackageV1(pkiEzsignfolderID, ezsignfolderImportEzsigntemplatepackageV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderImportEzsigntemplatepackageV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderImportEzsigntemplatepackageV1Request** | [**EzsignfolderImportEzsigntemplatepackageV1Request**](EzsignfolderImportEzsigntemplatepackageV1Request.md)|  |

### Return type

[**EzsignfolderImportEzsigntemplatepackageV1Response**](EzsignfolderImportEzsigntemplatepackageV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderReorderV1

> EzsignfolderReorderV1Response ezsignfolderReorderV1(pkiEzsignfolderID, ezsignfolderReorderV1Request)

Reorder Ezsigndocuments in the Ezsignfolder

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderReorderV1Request ezsignfolderReorderV1Request = new EzsignfolderReorderV1Request(); // EzsignfolderReorderV1Request | 
try {
    EzsignfolderReorderV1Response result = apiInstance.ezsignfolderReorderV1(pkiEzsignfolderID, ezsignfolderReorderV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderReorderV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderReorderV1Request** | [**EzsignfolderReorderV1Request**](EzsignfolderReorderV1Request.md)|  |

### Return type

[**EzsignfolderReorderV1Response**](EzsignfolderReorderV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderSendV1

> EzsignfolderSendV1Response ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderSendV1Request)

Send the Ezsignfolder to the signatories for signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderSendV1Request ezsignfolderSendV1Request = new EzsignfolderSendV1Request(); // EzsignfolderSendV1Request | 
try {
    EzsignfolderSendV1Response result = apiInstance.ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderSendV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderSendV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderSendV1Request** | [**EzsignfolderSendV1Request**](EzsignfolderSendV1Request.md)|  |

### Return type

[**EzsignfolderSendV1Response**](EzsignfolderSendV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderSendV2

> EzsignfolderSendV2Response ezsignfolderSendV2(pkiEzsignfolderID, ezsignfolderSendV2Request)

Send the Ezsignfolder to the signatories for signature



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
EzsignfolderSendV2Request ezsignfolderSendV2Request = new EzsignfolderSendV2Request(); // EzsignfolderSendV2Request | 
try {
    EzsignfolderSendV2Response result = apiInstance.ezsignfolderSendV2(pkiEzsignfolderID, ezsignfolderSendV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderSendV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **ezsignfolderSendV2Request** | [**EzsignfolderSendV2Request**](EzsignfolderSendV2Request.md)|  |

### Return type

[**EzsignfolderSendV2Response**](EzsignfolderSendV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignfolderUnsendV1

> EzsignfolderUnsendV1Response ezsignfolderUnsendV1(pkiEzsignfolderID, body)

Unsend the Ezsignfolder

Once an Ezsignfolder has been sent to signatories, it cannot be modified.  Using this endpoint, you can unsend the Ezsignfolder and make it modifiable again.  Signatories will receive an email informing them the signature process was aborted and they might receive a new invitation to sign.  ⚠️ Warning: Any signature previously made by signatories on \&quot;Non-completed\&quot; Ezsigndocuments will be lost.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignfolderApi;

ObjectEzsignfolderApi apiInstance = new ObjectEzsignfolderApi();
Integer pkiEzsignfolderID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsignfolderUnsendV1Response result = apiInstance.ezsignfolderUnsendV1(pkiEzsignfolderID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignfolderApi#ezsignfolderUnsendV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsignfolderUnsendV1Response**](EzsignfolderUnsendV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

