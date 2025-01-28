# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey
[**apikeyEditObjectV1**](ObjectApikeyApi.md#apikeyEditObjectV1) | **PUT** /1/object/apikey/{pkiApikeyID} | Edit an existing Apikey
[**apikeyEditPermissionsV1**](ObjectApikeyApi.md#apikeyEditPermissionsV1) | **PUT** /1/object/apikey/{pkiApikeyID}/editPermissions | Edit multiple Permissions
[**apikeyGenerateDelegatedCredentialsV1**](ObjectApikeyApi.md#apikeyGenerateDelegatedCredentialsV1) | **POST** /1/object/apikey/generateDelegatedCredentials | Generate a delegated credentials
[**apikeyGetCorsV1**](ObjectApikeyApi.md#apikeyGetCorsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getCors | Retrieve an existing Apikey&#39;s cors
[**apikeyGetListV1**](ObjectApikeyApi.md#apikeyGetListV1) | **GET** /1/object/apikey/getList | Retrieve Apikey list
[**apikeyGetObjectV2**](ObjectApikeyApi.md#apikeyGetObjectV2) | **GET** /2/object/apikey/{pkiApikeyID} | Retrieve an existing Apikey
[**apikeyGetPermissionsV1**](ObjectApikeyApi.md#apikeyGetPermissionsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getPermissions | Retrieve an existing Apikey&#39;s Permissions
[**apikeyGetSubnetsV1**](ObjectApikeyApi.md#apikeyGetSubnetsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getSubnets | Retrieve an existing Apikey&#39;s subnets
[**apikeyRegenerateV1**](ObjectApikeyApi.md#apikeyRegenerateV1) | **POST** /1/object/apikey/{pkiApikeyID}/regenerate | Regenerate the Apikey



## apikeyCreateObjectV2

> ApikeyCreateObjectV2Response apikeyCreateObjectV2(apikeyCreateObjectV2Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = new ApikeyCreateObjectV2Request(); // ApikeyCreateObjectV2Request | 
try {
    ApikeyCreateObjectV2Response result = apiInstance.apikeyCreateObjectV2(apikeyCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyCreateObjectV2Request** | [**ApikeyCreateObjectV2Request**](ApikeyCreateObjectV2Request.md)|  |

### Return type

[**ApikeyCreateObjectV2Response**](ApikeyCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## apikeyEditObjectV1

> ApikeyEditObjectV1Response apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request)

Edit an existing Apikey



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | The unique ID of the Apikey
ApikeyEditObjectV1Request apikeyEditObjectV1Request = new ApikeyEditObjectV1Request(); // ApikeyEditObjectV1Request | 
try {
    ApikeyEditObjectV1Response result = apiInstance.apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**| The unique ID of the Apikey | [default to null]
 **apikeyEditObjectV1Request** | [**ApikeyEditObjectV1Request**](ApikeyEditObjectV1Request.md)|  |

### Return type

[**ApikeyEditObjectV1Response**](ApikeyEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## apikeyEditPermissionsV1

> ApikeyEditPermissionsV1Response apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | 
ApikeyEditPermissionsV1Request apikeyEditPermissionsV1Request = new ApikeyEditPermissionsV1Request(); // ApikeyEditPermissionsV1Request | 
try {
    ApikeyEditPermissionsV1Response result = apiInstance.apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyEditPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**|  | [default to null]
 **apikeyEditPermissionsV1Request** | [**ApikeyEditPermissionsV1Request**](ApikeyEditPermissionsV1Request.md)|  |

### Return type

[**ApikeyEditPermissionsV1Response**](ApikeyEditPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## apikeyGenerateDelegatedCredentialsV1

> ApikeyGenerateDelegatedCredentialsV1Response apikeyGenerateDelegatedCredentialsV1(apikeyGenerateDelegatedCredentialsV1Request)

Generate a delegated credentials



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
ApikeyGenerateDelegatedCredentialsV1Request apikeyGenerateDelegatedCredentialsV1Request = new ApikeyGenerateDelegatedCredentialsV1Request(); // ApikeyGenerateDelegatedCredentialsV1Request | 
try {
    ApikeyGenerateDelegatedCredentialsV1Response result = apiInstance.apikeyGenerateDelegatedCredentialsV1(apikeyGenerateDelegatedCredentialsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGenerateDelegatedCredentialsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyGenerateDelegatedCredentialsV1Request** | [**ApikeyGenerateDelegatedCredentialsV1Request**](ApikeyGenerateDelegatedCredentialsV1Request.md)|  |

### Return type

[**ApikeyGenerateDelegatedCredentialsV1Response**](ApikeyGenerateDelegatedCredentialsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## apikeyGetCorsV1

> ApikeyGetCorsV1Response apikeyGetCorsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s cors

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | 
try {
    ApikeyGetCorsV1Response result = apiInstance.apikeyGetCorsV1(pkiApikeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGetCorsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**|  | [default to null]

### Return type

[**ApikeyGetCorsV1Response**](ApikeyGetCorsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apikeyGetListV1

> ApikeyGetListV1Response apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Apikey list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    ApikeyGetListV1Response result = apiInstance.apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiApikeyID_ASC, pkiApikeyID_DESC, sApikeyDescriptionX_ASC, sApikeyDescriptionX_DESC, bApikeyIssigned_ASC, bApikeyIssigned_DESC, bApikeyIsactive_ASC, bApikeyIsactive_DESC, sUserFirstname_ASC, sUserFirstname_DESC, sUserLastname_ASC, sUserLastname_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**ApikeyGetListV1Response**](ApikeyGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## apikeyGetObjectV2

> ApikeyGetObjectV2Response apikeyGetObjectV2(pkiApikeyID)

Retrieve an existing Apikey



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | The unique ID of the Apikey
try {
    ApikeyGetObjectV2Response result = apiInstance.apikeyGetObjectV2(pkiApikeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**| The unique ID of the Apikey | [default to null]

### Return type

[**ApikeyGetObjectV2Response**](ApikeyGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apikeyGetPermissionsV1

> ApikeyGetPermissionsV1Response apikeyGetPermissionsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s Permissions

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | 
try {
    ApikeyGetPermissionsV1Response result = apiInstance.apikeyGetPermissionsV1(pkiApikeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGetPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**|  | [default to null]

### Return type

[**ApikeyGetPermissionsV1Response**](ApikeyGetPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apikeyGetSubnetsV1

> ApikeyGetSubnetsV1Response apikeyGetSubnetsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s subnets

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | 
try {
    ApikeyGetSubnetsV1Response result = apiInstance.apikeyGetSubnetsV1(pkiApikeyID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyGetSubnetsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**|  | [default to null]

### Return type

[**ApikeyGetSubnetsV1Response**](ApikeyGetSubnetsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apikeyRegenerateV1

> ApikeyRegenerateV1Response apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request)

Regenerate the Apikey



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectApikeyApi;

ObjectApikeyApi apiInstance = new ObjectApikeyApi();
Integer pkiApikeyID = null; // Integer | 
ApikeyRegenerateV1Request apikeyRegenerateV1Request = new ApikeyRegenerateV1Request(); // ApikeyRegenerateV1Request | 
try {
    ApikeyRegenerateV1Response result = apiInstance.apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectApikeyApi#apikeyRegenerateV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **Integer**|  | [default to null]
 **apikeyRegenerateV1Request** | [**ApikeyRegenerateV1Request**](ApikeyRegenerateV1Request.md)|  |

### Return type

[**ApikeyRegenerateV1Response**](ApikeyRegenerateV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

