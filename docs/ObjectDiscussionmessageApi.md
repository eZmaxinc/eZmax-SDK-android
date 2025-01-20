# ObjectDiscussionmessageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionmessageCreateObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageCreateObjectV1) | **POST** /1/object/discussionmessage | Create a new Discussionmessage
[**discussionmessageDeleteObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageDeleteObjectV1) | **DELETE** /1/object/discussionmessage/{pkiDiscussionmessageID} | Delete an existing Discussionmessage
[**discussionmessagePatchObjectV1**](ObjectDiscussionmessageApi.md#discussionmessagePatchObjectV1) | **PATCH** /1/object/discussionmessage/{pkiDiscussionmessageID} | Patch an existing Discussionmessage



## discussionmessageCreateObjectV1

> DiscussionmessageCreateObjectV1Response discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request)

Create a new Discussionmessage

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionmessageApi;

ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi();
DiscussionmessageCreateObjectV1Request discussionmessageCreateObjectV1Request = new DiscussionmessageCreateObjectV1Request(); // DiscussionmessageCreateObjectV1Request | 
try {
    DiscussionmessageCreateObjectV1Response result = apiInstance.discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessageCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionmessageCreateObjectV1Request** | [**DiscussionmessageCreateObjectV1Request**](DiscussionmessageCreateObjectV1Request.md)|  |

### Return type

[**DiscussionmessageCreateObjectV1Response**](DiscussionmessageCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## discussionmessageDeleteObjectV1

> CommonResponse discussionmessageDeleteObjectV1(pkiDiscussionmessageID)

Delete an existing Discussionmessage



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionmessageApi;

ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi();
Integer pkiDiscussionmessageID = null; // Integer | The unique ID of the Discussionmessage
try {
    CommonResponse result = apiInstance.discussionmessageDeleteObjectV1(pkiDiscussionmessageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessageDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmessageID** | **Integer**| The unique ID of the Discussionmessage | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## discussionmessagePatchObjectV1

> CommonResponse discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request)

Patch an existing Discussionmessage



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionmessageApi;

ObjectDiscussionmessageApi apiInstance = new ObjectDiscussionmessageApi();
Integer pkiDiscussionmessageID = null; // Integer | The unique ID of the Discussionmessage
DiscussionmessagePatchObjectV1Request discussionmessagePatchObjectV1Request = new DiscussionmessagePatchObjectV1Request(); // DiscussionmessagePatchObjectV1Request | 
try {
    CommonResponse result = apiInstance.discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionmessageApi#discussionmessagePatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmessageID** | **Integer**| The unique ID of the Discussionmessage | [default to null]
 **discussionmessagePatchObjectV1Request** | [**DiscussionmessagePatchObjectV1Request**](DiscussionmessagePatchObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

