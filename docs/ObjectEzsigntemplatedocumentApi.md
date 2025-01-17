# ObjectEzsigntemplatedocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatedocumentCreateObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentCreateObjectV1) | **POST** /1/object/ezsigntemplatedocument | Create a new Ezsigntemplatedocument
[**ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatedocumentpagerecognitions | Edit multiple Ezsigntemplatedocumentpagerecognitions
[**ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups | Edit multiple Ezsigntemplateformfieldgroups
[**ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures | Edit multiple Ezsigntemplatesignatures
[**ezsigntemplatedocumentEditObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditObjectV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Edit an existing Ezsigntemplatedocument
[**ezsigntemplatedocumentExtractTextV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentExtractTextV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/extractText | Extract text from Ezsigntemplatedocument area
[**ezsigntemplatedocumentFlattenV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentFlattenV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/flatten | Flatten
[**ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpagerecognitions | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpagerecognitions
[**ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages
[**ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplateformfieldgroups | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups
[**ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatesignatures | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures
[**ezsigntemplatedocumentGetObjectV2**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetObjectV2) | **GET** /2/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
[**ezsigntemplatedocumentGetWordsPositionsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetWordsPositionsV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigntemplatedocument
[**ezsigntemplatedocumentPatchObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Patch an existing Ezsigntemplatedocument



## ezsigntemplatedocumentCreateObjectV1

> EzsigntemplatedocumentCreateObjectV1Response ezsigntemplatedocumentCreateObjectV1(ezsigntemplatedocumentCreateObjectV1Request)

Create a new Ezsigntemplatedocument

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
EzsigntemplatedocumentCreateObjectV1Request ezsigntemplatedocumentCreateObjectV1Request = new EzsigntemplatedocumentCreateObjectV1Request(); // EzsigntemplatedocumentCreateObjectV1Request | 
try {
    EzsigntemplatedocumentCreateObjectV1Response result = apiInstance.ezsigntemplatedocumentCreateObjectV1(ezsigntemplatedocumentCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatedocumentCreateObjectV1Request** | [**EzsigntemplatedocumentCreateObjectV1Request**](EzsigntemplatedocumentCreateObjectV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentCreateObjectV1Response**](EzsigntemplatedocumentCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1

> EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request)

Edit multiple Ezsigntemplatedocumentpagerecognitions

Edit multiple Ezsigntemplatedocumentpagerecognitions

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request = new EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request(); // EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request | 
try {
    EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response result = apiInstance.ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request** | [**EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request**](EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response**](EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1

> EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request)

Edit multiple Ezsigntemplateformfieldgroups

Using this endpoint, you can edit multiple Ezsigntemplateformfieldgroups at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request = new EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request(); // EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request | 
try {
    EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response result = apiInstance.ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request** | [**EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request**](EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response**](EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentEditEzsigntemplatesignaturesV1

> EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response ezsigntemplatedocumentEditEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request)

Edit multiple Ezsigntemplatesignatures

Using this endpoint, you can edit multiple Ezsigntemplatesignatures at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request = new EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request(); // EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request | 
try {
    EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response result = apiInstance.ezsigntemplatedocumentEditEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentEditEzsigntemplatesignaturesV1Request** | [**EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request**](EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response**](EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentEditObjectV1

> EzsigntemplatedocumentEditObjectV1Response ezsigntemplatedocumentEditObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditObjectV1Request)

Edit an existing Ezsigntemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentEditObjectV1Request ezsigntemplatedocumentEditObjectV1Request = new EzsigntemplatedocumentEditObjectV1Request(); // EzsigntemplatedocumentEditObjectV1Request | 
try {
    EzsigntemplatedocumentEditObjectV1Response result = apiInstance.ezsigntemplatedocumentEditObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentEditObjectV1Request** | [**EzsigntemplatedocumentEditObjectV1Request**](EzsigntemplatedocumentEditObjectV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentEditObjectV1Response**](EzsigntemplatedocumentEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentExtractTextV1

> EzsigntemplatedocumentExtractTextV1Response ezsigntemplatedocumentExtractTextV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentExtractTextV1Request)

Extract text from Ezsigntemplatedocument area

Extract text from Ezsigntemplatedocument area

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentExtractTextV1Request ezsigntemplatedocumentExtractTextV1Request = new EzsigntemplatedocumentExtractTextV1Request(); // EzsigntemplatedocumentExtractTextV1Request | 
try {
    EzsigntemplatedocumentExtractTextV1Response result = apiInstance.ezsigntemplatedocumentExtractTextV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentExtractTextV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentExtractTextV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentExtractTextV1Request** | [**EzsigntemplatedocumentExtractTextV1Request**](EzsigntemplatedocumentExtractTextV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentExtractTextV1Response**](EzsigntemplatedocumentExtractTextV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentFlattenV1

> EzsigntemplatedocumentFlattenV1Response ezsigntemplatedocumentFlattenV1(pkiEzsigntemplatedocumentID, body)

Flatten

Flatten an Ezsigntemplatedocument signatures, forms and annotations. This process finalizes the PDF so that the forms and annotations become part of the document content and cannot be edited.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
Object body = null; // Object | 
try {
    EzsigntemplatedocumentFlattenV1Response result = apiInstance.ezsigntemplatedocumentFlattenV1(pkiEzsigntemplatedocumentID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentFlattenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**EzsigntemplatedocumentFlattenV1Response**](EzsigntemplatedocumentFlattenV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1

> EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpagerecognitions



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
try {
    EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response result = apiInstance.ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1(pkiEzsigntemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response**](EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1

> EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
try {
    EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response result = apiInstance.ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1(pkiEzsigntemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response**](EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1

> EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
try {
    EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response result = apiInstance.ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response**](EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentGetEzsigntemplatesignaturesV1

> EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response ezsigntemplatedocumentGetEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
try {
    EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response result = apiInstance.ezsigntemplatedocumentGetEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response**](EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentGetObjectV2

> EzsigntemplatedocumentGetObjectV2Response ezsigntemplatedocumentGetObjectV2(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
try {
    EzsigntemplatedocumentGetObjectV2Response result = apiInstance.ezsigntemplatedocumentGetObjectV2(pkiEzsigntemplatedocumentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]

### Return type

[**EzsigntemplatedocumentGetObjectV2Response**](EzsigntemplatedocumentGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsigntemplatedocumentGetWordsPositionsV1

> EzsigntemplatedocumentGetWordsPositionsV1Response ezsigntemplatedocumentGetWordsPositionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentGetWordsPositionsV1Request)

Retrieve positions X,Y of given words from a Ezsigntemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentGetWordsPositionsV1Request ezsigntemplatedocumentGetWordsPositionsV1Request = new EzsigntemplatedocumentGetWordsPositionsV1Request(); // EzsigntemplatedocumentGetWordsPositionsV1Request | 
try {
    EzsigntemplatedocumentGetWordsPositionsV1Response result = apiInstance.ezsigntemplatedocumentGetWordsPositionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentGetWordsPositionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetWordsPositionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentGetWordsPositionsV1Request** | [**EzsigntemplatedocumentGetWordsPositionsV1Request**](EzsigntemplatedocumentGetWordsPositionsV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentGetWordsPositionsV1Response**](EzsigntemplatedocumentGetWordsPositionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsigntemplatedocumentPatchObjectV1

> EzsigntemplatedocumentPatchObjectV1Response ezsigntemplatedocumentPatchObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentPatchObjectV1Request)

Patch an existing Ezsigntemplatedocument



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsigntemplatedocumentApi;

ObjectEzsigntemplatedocumentApi apiInstance = new ObjectEzsigntemplatedocumentApi();
Integer pkiEzsigntemplatedocumentID = null; // Integer | 
EzsigntemplatedocumentPatchObjectV1Request ezsigntemplatedocumentPatchObjectV1Request = new EzsigntemplatedocumentPatchObjectV1Request(); // EzsigntemplatedocumentPatchObjectV1Request | 
try {
    EzsigntemplatedocumentPatchObjectV1Response result = apiInstance.ezsigntemplatedocumentPatchObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **Integer**|  | [default to null]
 **ezsigntemplatedocumentPatchObjectV1Request** | [**EzsigntemplatedocumentPatchObjectV1Request**](EzsigntemplatedocumentPatchObjectV1Request.md)|  |

### Return type

[**EzsigntemplatedocumentPatchObjectV1Response**](EzsigntemplatedocumentPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

