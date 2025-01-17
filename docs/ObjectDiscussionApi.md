# ObjectDiscussionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionCreateObjectV1**](ObjectDiscussionApi.md#discussionCreateObjectV1) | **POST** /1/object/discussion | Create a new Discussion
[**discussionDeleteObjectV1**](ObjectDiscussionApi.md#discussionDeleteObjectV1) | **DELETE** /1/object/discussion/{pkiDiscussionID} | Delete an existing Discussion
[**discussionGetObjectV2**](ObjectDiscussionApi.md#discussionGetObjectV2) | **GET** /2/object/discussion/{pkiDiscussionID} | Retrieve an existing Discussion
[**discussionPatchObjectV1**](ObjectDiscussionApi.md#discussionPatchObjectV1) | **PATCH** /1/object/discussion/{pkiDiscussionID} | Patch an existing Discussion
[**discussionUpdateDiscussionreadstatusV1**](ObjectDiscussionApi.md#discussionUpdateDiscussionreadstatusV1) | **POST** /1/object/discussion/{pkiDiscussionID}/updateDiscussionreadstatus | Update the read status of the discussion



## discussionCreateObjectV1

> DiscussionCreateObjectV1Response discussionCreateObjectV1(discussionCreateObjectV1Request)

Create a new Discussion

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionApi;

ObjectDiscussionApi apiInstance = new ObjectDiscussionApi();
DiscussionCreateObjectV1Request discussionCreateObjectV1Request = new DiscussionCreateObjectV1Request(); // DiscussionCreateObjectV1Request | 
try {
    DiscussionCreateObjectV1Response result = apiInstance.discussionCreateObjectV1(discussionCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionApi#discussionCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionCreateObjectV1Request** | [**DiscussionCreateObjectV1Request**](DiscussionCreateObjectV1Request.md)|  |

### Return type

[**DiscussionCreateObjectV1Response**](DiscussionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## discussionDeleteObjectV1

> DiscussionDeleteObjectV1Response discussionDeleteObjectV1(pkiDiscussionID)

Delete an existing Discussion



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionApi;

ObjectDiscussionApi apiInstance = new ObjectDiscussionApi();
Integer pkiDiscussionID = null; // Integer | The unique ID of the Discussion
try {
    DiscussionDeleteObjectV1Response result = apiInstance.discussionDeleteObjectV1(pkiDiscussionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionApi#discussionDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **Integer**| The unique ID of the Discussion | [default to null]

### Return type

[**DiscussionDeleteObjectV1Response**](DiscussionDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## discussionGetObjectV2

> DiscussionGetObjectV2Response discussionGetObjectV2(pkiDiscussionID)

Retrieve an existing Discussion



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionApi;

ObjectDiscussionApi apiInstance = new ObjectDiscussionApi();
Integer pkiDiscussionID = null; // Integer | The unique ID of the Discussion
try {
    DiscussionGetObjectV2Response result = apiInstance.discussionGetObjectV2(pkiDiscussionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionApi#discussionGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **Integer**| The unique ID of the Discussion | [default to null]

### Return type

[**DiscussionGetObjectV2Response**](DiscussionGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## discussionPatchObjectV1

> DiscussionPatchObjectV1Response discussionPatchObjectV1(pkiDiscussionID, discussionPatchObjectV1Request)

Patch an existing Discussion



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionApi;

ObjectDiscussionApi apiInstance = new ObjectDiscussionApi();
Integer pkiDiscussionID = null; // Integer | The unique ID of the Discussion
DiscussionPatchObjectV1Request discussionPatchObjectV1Request = new DiscussionPatchObjectV1Request(); // DiscussionPatchObjectV1Request | 
try {
    DiscussionPatchObjectV1Response result = apiInstance.discussionPatchObjectV1(pkiDiscussionID, discussionPatchObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionApi#discussionPatchObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **Integer**| The unique ID of the Discussion | [default to null]
 **discussionPatchObjectV1Request** | [**DiscussionPatchObjectV1Request**](DiscussionPatchObjectV1Request.md)|  |

### Return type

[**DiscussionPatchObjectV1Response**](DiscussionPatchObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## discussionUpdateDiscussionreadstatusV1

> DiscussionUpdateDiscussionreadstatusV1Response discussionUpdateDiscussionreadstatusV1(pkiDiscussionID, discussionUpdateDiscussionreadstatusV1Request)

Update the read status of the discussion

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionApi;

ObjectDiscussionApi apiInstance = new ObjectDiscussionApi();
Integer pkiDiscussionID = null; // Integer | 
DiscussionUpdateDiscussionreadstatusV1Request discussionUpdateDiscussionreadstatusV1Request = new DiscussionUpdateDiscussionreadstatusV1Request(); // DiscussionUpdateDiscussionreadstatusV1Request | 
try {
    DiscussionUpdateDiscussionreadstatusV1Response result = apiInstance.discussionUpdateDiscussionreadstatusV1(pkiDiscussionID, discussionUpdateDiscussionreadstatusV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionApi#discussionUpdateDiscussionreadstatusV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **Integer**|  | [default to null]
 **discussionUpdateDiscussionreadstatusV1Request** | [**DiscussionUpdateDiscussionreadstatusV1Request**](DiscussionUpdateDiscussionreadstatusV1Request.md)|  |

### Return type

[**DiscussionUpdateDiscussionreadstatusV1Response**](DiscussionUpdateDiscussionreadstatusV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

