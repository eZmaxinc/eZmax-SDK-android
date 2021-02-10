# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditObjectV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Modify an existing Ezsigndocument
[**ezsigndocumentGetChildrenV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetChildrenV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren | Retrieve an existing Ezsigndocument&#39;s children IDs
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument



## ezsigndocumentApplyEzsigntemplateV1

> EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)

Apply an Ezsign Template to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]
 **ezsigndocumentApplyEzsigntemplateV1Request** | [**EzsigndocumentApplyEzsigntemplateV1Request**](EzsigndocumentApplyEzsigntemplateV1Request.md)|  |

### Return type

[**EzsigndocumentApplyEzsigntemplateV1Response**](EzsigndocumentApplyEzsigntemplateV1Response.md)

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
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]

### Return type

[**EzsigndocumentDeleteObjectV1Response**](EzsigndocumentDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentEditObjectV1

> EzsigndocumentEditObjectV1Response ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentEditObjectV1Request)

Modify an existing Ezsigndocument

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
EzsigndocumentEditObjectV1Request ezsigndocumentEditObjectV1Request = new EzsigndocumentEditObjectV1Request(); // EzsigndocumentEditObjectV1Request | 
try {
    EzsigndocumentEditObjectV1Response result = apiInstance.ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]
 **ezsigndocumentEditObjectV1Request** | [**EzsigndocumentEditObjectV1Request**](EzsigndocumentEditObjectV1Request.md)|  |

### Return type

[**EzsigndocumentEditObjectV1Response**](EzsigndocumentEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigndocumentGetChildrenV1

> ezsigndocumentGetChildrenV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s children IDs

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
try {
    apiInstance.ezsigndocumentGetChildrenV1(pkiEzsigndocumentID);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigndocumentApi#ezsigndocumentGetChildrenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]

### Return type

null (empty response body)

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
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]
 **eDocumentType** | **String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  | [default to null] [enum: Initial, Signed, Proof, Proofdocument]

### Return type

[**EzsigndocumentGetDownloadUrlV1Response**](EzsigndocumentGetDownloadUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigndocumentGetObjectV1

> EzsigndocumentGetObjectV1Response ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigndocumentApi;

ObjectEzsigndocumentApi apiInstance = new ObjectEzsigndocumentApi();
Integer pkiEzsigndocumentID = null; // Integer | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **Integer**| The unique ID of the Ezsigndocument | [default to null]

### Return type

[**EzsigndocumentGetObjectV1Response**](EzsigndocumentGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

