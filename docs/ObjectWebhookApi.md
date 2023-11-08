# ObjectWebhookApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCreateObjectV1**](ObjectWebhookApi.md#webhookCreateObjectV1) | **POST** /1/object/webhook | Create a new Webhook
[**webhookDeleteObjectV1**](ObjectWebhookApi.md#webhookDeleteObjectV1) | **DELETE** /1/object/webhook/{pkiWebhookID} | Delete an existing Webhook
[**webhookEditObjectV1**](ObjectWebhookApi.md#webhookEditObjectV1) | **PUT** /1/object/webhook/{pkiWebhookID} | Edit an existing Webhook
[**webhookGetHistoryV1**](ObjectWebhookApi.md#webhookGetHistoryV1) | **GET** /1/object/webhook/{pkiWebhookID}/getHistory | Retrieve the logs for recent Webhook calls
[**webhookGetListV1**](ObjectWebhookApi.md#webhookGetListV1) | **GET** /1/object/webhook/getList | Retrieve Webhook list
[**webhookGetObjectV2**](ObjectWebhookApi.md#webhookGetObjectV2) | **GET** /2/object/webhook/{pkiWebhookID} | Retrieve an existing Webhook
[**webhookTestV1**](ObjectWebhookApi.md#webhookTestV1) | **POST** /1/object/webhook/{pkiWebhookID}/test | Test the Webhook by calling the Url



## webhookCreateObjectV1

> WebhookCreateObjectV1Response webhookCreateObjectV1(webhookCreateObjectV1Request)

Create a new Webhook

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
WebhookCreateObjectV1Request webhookCreateObjectV1Request = new WebhookCreateObjectV1Request(); // WebhookCreateObjectV1Request | 
try {
    WebhookCreateObjectV1Response result = apiInstance.webhookCreateObjectV1(webhookCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCreateObjectV1Request** | [**WebhookCreateObjectV1Request**](WebhookCreateObjectV1Request.md)|  |

### Return type

[**WebhookCreateObjectV1Response**](WebhookCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## webhookDeleteObjectV1

> WebhookDeleteObjectV1Response webhookDeleteObjectV1(pkiWebhookID)

Delete an existing Webhook



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
Integer pkiWebhookID = null; // Integer | 
try {
    WebhookDeleteObjectV1Response result = apiInstance.webhookDeleteObjectV1(pkiWebhookID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **Integer**|  | [default to null]

### Return type

[**WebhookDeleteObjectV1Response**](WebhookDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookEditObjectV1

> WebhookEditObjectV1Response webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request)

Edit an existing Webhook



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
Integer pkiWebhookID = null; // Integer | 
WebhookEditObjectV1Request webhookEditObjectV1Request = new WebhookEditObjectV1Request(); // WebhookEditObjectV1Request | 
try {
    WebhookEditObjectV1Response result = apiInstance.webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **Integer**|  | [default to null]
 **webhookEditObjectV1Request** | [**WebhookEditObjectV1Request**](WebhookEditObjectV1Request.md)|  |

### Return type

[**WebhookEditObjectV1Response**](WebhookEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## webhookGetHistoryV1

> WebhookGetHistoryV1Response webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)

Retrieve the logs for recent Webhook calls



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
Integer pkiWebhookID = null; // Integer | 
String eWebhookHistoryinterval = null; // String | The number of days to return
try {
    WebhookGetHistoryV1Response result = apiInstance.webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookGetHistoryV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **Integer**|  | [default to null]
 **eWebhookHistoryinterval** | **String**| The number of days to return | [default to null] [enum: LastDay, LastWeek]

### Return type

[**WebhookGetHistoryV1Response**](WebhookGetHistoryV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookGetListV1

> WebhookGetListV1Response webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Webhook list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eWebhookModule | Ezsign&lt;br&gt;Management | | eWebhookEzsignevent | DocumentCompleted&lt;br&gt;FolderCompleted | | eWebhookManagementevent | UserCreated |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    WebhookGetListV1Response result = apiInstance.webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiWebhookID_ASC, pkiWebhookID_DESC, sWebhookDescription_ASC, sWebhookDescription_DESC, eWebhookEzsignevent_ASC, eWebhookEzsignevent_DESC, eWebhookManagementevent_ASC, eWebhookManagementevent_DESC, eWebhookModule_ASC, eWebhookModule_DESC, sWebhookEmailfailed_ASC, sWebhookEmailfailed_DESC, sWebhookEvent_ASC, sWebhookEvent_DESC, sWebhookUrl_ASC, sWebhookUrl_DESC, bWebhookIsactive_ASC, bWebhookIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**WebhookGetListV1Response**](WebhookGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## webhookGetObjectV2

> WebhookGetObjectV2Response webhookGetObjectV2(pkiWebhookID)

Retrieve an existing Webhook



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
Integer pkiWebhookID = null; // Integer | 
try {
    WebhookGetObjectV2Response result = apiInstance.webhookGetObjectV2(pkiWebhookID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **Integer**|  | [default to null]

### Return type

[**WebhookGetObjectV2Response**](WebhookGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookTestV1

> WebhookTestV1Response webhookTestV1(pkiWebhookID, body)

Test the Webhook by calling the Url



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectWebhookApi;

ObjectWebhookApi apiInstance = new ObjectWebhookApi();
Integer pkiWebhookID = null; // Integer | 
Object body = null; // Object | 
try {
    WebhookTestV1Response result = apiInstance.webhookTestV1(pkiWebhookID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectWebhookApi#webhookTestV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**WebhookTestV1Response**](WebhookTestV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

