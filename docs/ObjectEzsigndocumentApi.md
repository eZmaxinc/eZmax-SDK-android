# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
[**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
[**ezsigndocumentCreateEzsignelementsPositionedByWordV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateEzsignelementsPositionedByWordV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord | Create multiple Ezsignsignatures/Ezsignformfieldgroups
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentCreateObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeclineToSignV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeclineToSignV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/declineToSign | Decline to sign
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
[**ezsigndocumentEditEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
[**ezsigndocumentEndPrematurelyV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
[**ezsigndocumentFlattenV1**](ObjectEzsigndocumentApi.md#ezsigndocumentFlattenV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/flatten | Flatten
[**ezsigndocumentGetActionableElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetActionableElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument
[**ezsigndocumentGetAttachmentsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetAttachmentsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getAttachments | Retrieve Ezsigndocument&#39;s Attachments
[**ezsigndocumentGetCompletedElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetCompletedElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getCompletedElements | Retrieve completed elements for the Ezsigndocument
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetEzsignannotationsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignannotationsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignannotations | Retrieve an existing Ezsigndocument&#39;s Ezsignannotations
[**ezsigndocumentGetEzsigndiscussionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsigndiscussionsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsigndiscussions | Retrieve an existing Ezsigndocument&#39;s Ezsigndiscussions
[**ezsigndocumentGetEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups
[**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
[**ezsigndocumentGetEzsignsignaturesAutomaticV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures
[**ezsigndocumentGetEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures
[**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV2) | **GET** /2/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetTemporaryProofV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
[**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
[**ezsigndocumentPatchObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
[**ezsigndocumentSubmitEzsignformV1**](ObjectEzsigndocumentApi.md#ezsigndocumentSubmitEzsignformV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform | Submit the Ezsignform
[**ezsigndocumentUnsendV1**](ObjectEzsigndocumentApi.md#ezsigndocumentUnsendV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument



## ezsigndocumentApplyEzsigntemplateV1

> EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)

Apply an Ezsigntemplate to the Ezsigndocument.

This function is deprecated. Please use *applyEzsigntemplate* instead which is doing the same thing but with a capital \&quot;E\&quot; to normalize the nomenclature.  This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request = new EzsigndocumentApplyEzsigntemplateV1Request(); // EzsigndocumentApplyEzsigntemplateV1Request | 
try {
    EzsigndocumentApplyEzsigntemplateV1Response result = apiInstance.ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentApplyEzsigntemplateV1Request** | [**EzsigndocumentApplyEzsigntemplateV1Request**](EzsigndocumentApplyEzsigntemplateV1Request.md)|  |

### Return type

[**EzsigndocumentApplyEzsigntemplateV1Response**](EzsigndocumentApplyEzsigntemplateV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentApplyEzsigntemplateV2

> EzsigndocumentApplyEzsigntemplateV2Response ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request)

Apply an Ezsigntemplate to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentApplyEzsigntemplateV2Request ezsigndocumentApplyEzsigntemplateV2Request = new EzsigndocumentApplyEzsigntemplateV2Request(); // EzsigndocumentApplyEzsigntemplateV2Request | 
try {
    EzsigndocumentApplyEzsigntemplateV2Response result = apiInstance.ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentApplyEzsigntemplateV2Request** | [**EzsigndocumentApplyEzsigntemplateV2Request**](EzsigndocumentApplyEzsigntemplateV2Request.md)|  |

### Return type

[**EzsigndocumentApplyEzsigntemplateV2Response**](EzsigndocumentApplyEzsigntemplateV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentCreateEzsignelementsPositionedByWordV1

> EzsigndocumentCreateEzsignelementsPositionedByWordV1Response ezsigndocumentCreateEzsignelementsPositionedByWordV1(pkiEzsigndocumentID, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request)

Create multiple Ezsignsignatures/Ezsignformfieldgroups

Using this endpoint, you can create multiple Ezsignsignatures/Ezsignformfieldgroups positioned by word at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentCreateEzsignelementsPositionedByWordV1Request ezsigndocumentCreateEzsignelementsPositionedByWordV1Request = new EzsigndocumentCreateEzsignelementsPositionedByWordV1Request(); // EzsigndocumentCreateEzsignelementsPositionedByWordV1Request | 
try {
    EzsigndocumentCreateEzsignelementsPositionedByWordV1Response result = apiInstance.ezsigndocumentCreateEzsignelementsPositionedByWordV1(pkiEzsigndocumentID, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentCreateEzsignelementsPositionedByWordV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentCreateEzsignelementsPositionedByWordV1Request** | [**EzsigndocumentCreateEzsignelementsPositionedByWordV1Request**](EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.md)|  |

### Return type

[**EzsigndocumentCreateEzsignelementsPositionedByWordV1Response**](EzsigndocumentCreateEzsignelementsPositionedByWordV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentCreateObjectV1

> EzsigndocumentCreateObjectV1Response ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
List<EzsigndocumentCreateObjectV1Request> ezsigndocumentCreateObjectV1Request = Arrays.asList(new EzsigndocumentCreateObjectV1Request()); // List<EzsigndocumentCreateObjectV1Request> | 
try {
    EzsigndocumentCreateObjectV1Response result = apiInstance.ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndocumentCreateObjectV1Request** | [**List&lt;EzsigndocumentCreateObjectV1Request&gt;**](EzsigndocumentCreateObjectV1Request.md)|  |

### Return type

[**EzsigndocumentCreateObjectV1Response**](EzsigndocumentCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentCreateObjectV2

> EzsigndocumentCreateObjectV2Response ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
EzsigndocumentCreateObjectV2Request ezsigndocumentCreateObjectV2Request = new EzsigndocumentCreateObjectV2Request(); // EzsigndocumentCreateObjectV2Request | 
try {
    EzsigndocumentCreateObjectV2Response result = apiInstance.ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndocumentCreateObjectV2Request** | [**EzsigndocumentCreateObjectV2Request**](EzsigndocumentCreateObjectV2Request.md)|  |

### Return type

[**EzsigndocumentCreateObjectV2Response**](EzsigndocumentCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentDeclineToSignV1

> EzsigndocumentDeclineToSignV1Response ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentDeclineToSignV1Request)

Decline to sign

Decline to sign

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentDeclineToSignV1Request ezsigndocumentDeclineToSignV1Request = new EzsigndocumentDeclineToSignV1Request(); // EzsigndocumentDeclineToSignV1Request | 
try {
    EzsigndocumentDeclineToSignV1Response result = apiInstance.ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentDeclineToSignV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentDeclineToSignV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentDeclineToSignV1Request** | [**EzsigndocumentDeclineToSignV1Request**](EzsigndocumentDeclineToSignV1Request.md)|  |

### Return type

[**EzsigndocumentDeclineToSignV1Response**](EzsigndocumentDeclineToSignV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentDeleteObjectV1

> EzsigndocumentDeleteObjectV1Response ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)

Delete an existing Ezsigndocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentDeleteObjectV1Response result = apiInstance.ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentDeleteObjectV1Response**](EzsigndocumentDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentEditEzsignformfieldgroupsV1

> EzsigndocumentEditEzsignformfieldgroupsV1Response ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request)

Edit multiple Ezsignformfieldgroups

Using this endpoint, you can edit multiple Ezsignformfieldgroups at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentEditEzsignformfieldgroupsV1Request ezsigndocumentEditEzsignformfieldgroupsV1Request = new EzsigndocumentEditEzsignformfieldgroupsV1Request(); // EzsigndocumentEditEzsignformfieldgroupsV1Request | 
try {
    EzsigndocumentEditEzsignformfieldgroupsV1Response result = apiInstance.ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignformfieldgroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentEditEzsignformfieldgroupsV1Request** | [**EzsigndocumentEditEzsignformfieldgroupsV1Request**](EzsigndocumentEditEzsignformfieldgroupsV1Request.md)|  |

### Return type

[**EzsigndocumentEditEzsignformfieldgroupsV1Response**](EzsigndocumentEditEzsignformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentEditEzsignsignaturesV1

> EzsigndocumentEditEzsignsignaturesV1Response ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request)

Edit multiple Ezsignsignatures

Using this endpoint, you can edit multiple Ezsignsignatures at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentEditEzsignsignaturesV1Request ezsigndocumentEditEzsignsignaturesV1Request = new EzsigndocumentEditEzsignsignaturesV1Request(); // EzsigndocumentEditEzsignsignaturesV1Request | 
try {
    EzsigndocumentEditEzsignsignaturesV1Response result = apiInstance.ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignsignaturesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentEditEzsignsignaturesV1Request** | [**EzsigndocumentEditEzsignsignaturesV1Request**](EzsigndocumentEditEzsignsignaturesV1Request.md)|  |

### Return type

[**EzsigndocumentEditEzsignsignaturesV1Response**](EzsigndocumentEditEzsignsignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentEndPrematurelyV1

> EzsigndocumentEndPrematurelyV1Response ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)

End prematurely

End prematurely an Ezsigndocument when some signatures are still required

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigndocumentEndPrematurelyV1Response result = apiInstance.ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEndPrematurelyV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigndocumentEndPrematurelyV1Response**](EzsigndocumentEndPrematurelyV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentFlattenV1

> EzsigndocumentFlattenV1Response ezsigndocumentFlattenV1(pkiEzsigndocumentID, body)

Flatten

Flatten an Ezsigndocument signatures, forms and annotations. This process finalizes the PDF so that the forms and annotations become part of the document content and cannot be edited.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigndocumentFlattenV1Response result = apiInstance.ezsigndocumentFlattenV1(pkiEzsigndocumentID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentFlattenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigndocumentFlattenV1Response**](EzsigndocumentFlattenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentGetActionableElementsV1

> EzsigndocumentGetActionableElementsV1Response ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID)

Retrieve actionable elements for the Ezsigndocument

Return the Ezsignsignatures that can be signed and Ezsignformfieldgroups that can be filled by the current user at the current step in the process

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetActionableElementsV1Response result = apiInstance.ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetActionableElementsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetActionableElementsV1Response**](EzsigndocumentGetActionableElementsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetAttachmentsV1

> EzsigndocumentGetAttachmentsV1Response ezsigndocumentGetAttachmentsV1(pkiEzsigndocumentID)

Retrieve Ezsigndocument&#39;s Attachments



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetAttachmentsV1Response result = apiInstance.ezsigndocumentGetAttachmentsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetAttachmentsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetAttachmentsV1Response**](EzsigndocumentGetAttachmentsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetCompletedElementsV1

> EzsigndocumentGetCompletedElementsV1Response ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID)

Retrieve completed elements for the Ezsigndocument

Return the completed Ezsignsignatures, Ezsignformfieldgroups and Ezsignannotations at the current step in the process

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetCompletedElementsV1Response result = apiInstance.ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetCompletedElementsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetCompletedElementsV1Response**](EzsigndocumentGetCompletedElementsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetDownloadUrlV1

> EzsigndocumentGetDownloadUrlV1Response ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)

Retrieve a URL to download documents.

This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
String eDocumentType = null; // String | The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **SignatureReady** Is the version containing the annotations/form to show the signer. 3. **Signed** Is the final document once all signatures were applied in current document if eEzsignfolderCompletion is PerEzsigndocument.<br>     Is the final document once all signatures were applied in all documents if eEzsignfolderCompletion is PerEzsignfolder. 4. **Proofdocument** Is the evidence report. 5. **Proof** Is the complete evidence archive including all of the above and more. 
try {
    EzsigndocumentGetDownloadUrlV1Response result = apiInstance.ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetDownloadUrlV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **eDocumentType** | **String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **SignatureReady** Is the version containing the annotations/form to show the signer. 3. **Signed** Is the final document once all signatures were applied in current document if eEzsignfolderCompletion is PerEzsigndocument.&lt;br&gt;     Is the final document once all signatures were applied in all documents if eEzsignfolderCompletion is PerEzsignfolder. 4. **Proofdocument** Is the evidence report. 5. **Proof** Is the complete evidence archive including all of the above and more.  | [default to null] [enum: Initial, SignatureReady, Signed, Proof, Proofdocument]

### Return type

[**EzsigndocumentGetDownloadUrlV1Response**](EzsigndocumentGetDownloadUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsignannotationsV1

> EzsigndocumentGetEzsignannotationsV1Response ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignannotations



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsignannotationsV1Response result = apiInstance.ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignannotationsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsignannotationsV1Response**](EzsigndocumentGetEzsignannotationsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsigndiscussionsV1

> EzsigndocumentGetEzsigndiscussionsV1Response ezsigndocumentGetEzsigndiscussionsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsigndiscussions



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsigndiscussionsV1Response result = apiInstance.ezsigndocumentGetEzsigndiscussionsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsigndiscussionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsigndiscussionsV1Response**](EzsigndocumentGetEzsigndiscussionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsignformfieldgroupsV1

> EzsigndocumentGetEzsignformfieldgroupsV1Response ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsignformfieldgroupsV1Response result = apiInstance.ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignformfieldgroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsignformfieldgroupsV1Response**](EzsigndocumentGetEzsignformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsignpagesV1

> EzsigndocumentGetEzsignpagesV1Response ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignpages



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsignpagesV1Response result = apiInstance.ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignpagesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsignpagesV1Response**](EzsigndocumentGetEzsignpagesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsignsignaturesAutomaticV1

> EzsigndocumentGetEzsignsignaturesAutomaticV1Response ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures

Return the Ezsignsignatures that can be signed by the current user at the current step in the process

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsignsignaturesAutomaticV1Response result = apiInstance.ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesAutomaticV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsignsignaturesAutomaticV1Response**](EzsigndocumentGetEzsignsignaturesAutomaticV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetEzsignsignaturesV1

> EzsigndocumentGetEzsignsignaturesV1Response ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetEzsignsignaturesV1Response result = apiInstance.ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetEzsignsignaturesV1Response**](EzsigndocumentGetEzsignsignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetFormDataV1

> EzsigndocumentGetFormDataV1Response ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Form Data



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetFormDataV1Response result = apiInstance.ezsigndocumentGetFormDataV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetFormDataV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetFormDataV1Response**](EzsigndocumentGetFormDataV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/zip, text/csv


## ezsigndocumentGetObjectV1

> EzsigndocumentGetObjectV1Response ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetObjectV1Response result = apiInstance.ezsigndocumentGetObjectV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetObjectV1Response**](EzsigndocumentGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetObjectV2

> EzsigndocumentGetObjectV2Response ezsigndocumentGetObjectV2(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetObjectV2Response result = apiInstance.ezsigndocumentGetObjectV2(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetObjectV2Response**](EzsigndocumentGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetTemporaryProofV1

> EzsigndocumentGetTemporaryProofV1Response ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)

Retrieve the temporary proof

Retrieve the temporary proof while the Ezsigndocument is being processed since the proof isn&#39;t available until the Ezsigndocument is completed

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentGetTemporaryProofV1Response result = apiInstance.ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetTemporaryProofV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigndocumentGetTemporaryProofV1Response**](EzsigndocumentGetTemporaryProofV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetWordsPositionsV1

> EzsigndocumentGetWordsPositionsV1Response ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request)

Retrieve positions X,Y of given words from a Ezsigndocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentGetWordsPositionsV1Request ezsigndocumentGetWordsPositionsV1Request = new EzsigndocumentGetWordsPositionsV1Request(); // EzsigndocumentGetWordsPositionsV1Request | 
try {
    EzsigndocumentGetWordsPositionsV1Response result = apiInstance.ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetWordsPositionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentGetWordsPositionsV1Request** | [**EzsigndocumentGetWordsPositionsV1Request**](EzsigndocumentGetWordsPositionsV1Request.md)|  |

### Return type

[**EzsigndocumentGetWordsPositionsV1Response**](EzsigndocumentGetWordsPositionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentPatchObjectV1

> EzsigndocumentPatchObjectV1Response ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request)

Patch an existing Ezsigndocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentPatchObjectV1Request ezsigndocumentPatchObjectV1Request = new EzsigndocumentPatchObjectV1Request(); // EzsigndocumentPatchObjectV1Request | 
try {
    EzsigndocumentPatchObjectV1Response result = apiInstance.ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentPatchObjectV1Request** | [**EzsigndocumentPatchObjectV1Request**](EzsigndocumentPatchObjectV1Request.md)|  |

### Return type

[**EzsigndocumentPatchObjectV1Response**](EzsigndocumentPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentSubmitEzsignformV1

> EzsigndocumentSubmitEzsignformV1Response ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentSubmitEzsignformV1Request)

Submit the Ezsignform



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
EzsigndocumentSubmitEzsignformV1Request ezsigndocumentSubmitEzsignformV1Request = new EzsigndocumentSubmitEzsignformV1Request(); // EzsigndocumentSubmitEzsignformV1Request | 
try {
    EzsigndocumentSubmitEzsignformV1Response result = apiInstance.ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentSubmitEzsignformV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentSubmitEzsignformV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **ezsigndocumentSubmitEzsignformV1Request** | [**EzsigndocumentSubmitEzsignformV1Request**](EzsigndocumentSubmitEzsignformV1Request.md)|  |

### Return type

[**EzsigndocumentSubmitEzsignformV1Response**](EzsigndocumentSubmitEzsignformV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentUnsendV1

> EzsigndocumentUnsendV1Response ezsigndocumentUnsendV1(pkiEzsigndocumentID, body)

Unsend the Ezsigndocument

Once an Ezsigndocument has been sent to signatories, it cannot be modified.  Using this endpoint, you can unsend the Ezsigndocument and make it modifiable again.  Signatories will receive an email informing them the signature process was aborted and they might receive a new invitation to sign.  ⚠️ Warning: Any signature previously made by signatories on this Ezsigndocumentswill be lost.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigndocumentUnsendV1Response result = apiInstance.ezsigndocumentUnsendV1(pkiEzsigndocumentID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentUnsendV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigndocumentUnsendV1Response**](EzsigndocumentUnsendV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

