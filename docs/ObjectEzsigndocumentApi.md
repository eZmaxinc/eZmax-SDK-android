# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple ezsignsignatures
[**ezsigndocumentEndPrematurelyV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
[**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetTemporaryProofV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
[**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
[**ezsigndocumentPatchObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument



## ezsigndocumentApplyEzsigntemplateV1

> EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)

Apply an Ezsign Template to the Ezsigndocument.

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

Apply an Ezsign Template to the Ezsigndocument.

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


## ezsigndocumentEditEzsignsignaturesV1

> EzsigndocumentEditEzsignsignaturesV1Response ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request)

Edit multiple ezsignsignatures

Using this endpoint, you can edit multiple ezsignsignatures at the same time.

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

> EzsigndocumentEndPrematurelyV1Response ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID)

End prematurely

End prematurely an Ezsigndocument when some signatures are still required

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | 
try {
    EzsigndocumentEndPrematurelyV1Response result = apiInstance.ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID);
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

### Return type

[**EzsigndocumentEndPrematurelyV1Response**](EzsigndocumentEndPrematurelyV1Response.md)

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
String eDocumentType = null; // String | The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more. 
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
 **eDocumentType** | **String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  | [default to null] [enum: Initial, Signed, Proof, Proofdocument]

### Return type

[**EzsigndocumentGetDownloadUrlV1Response**](EzsigndocumentGetDownloadUrlV1Response.md)

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

