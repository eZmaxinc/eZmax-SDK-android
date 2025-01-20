# ObjectDiscussionmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionmembershipCreateObjectV1**](ObjectDiscussionmembershipApi.md#discussionmembershipCreateObjectV1) | **POST** /1/object/discussionmembership | Create a new Discussionmembership
[**discussionmembershipDeleteObjectV1**](ObjectDiscussionmembershipApi.md#discussionmembershipDeleteObjectV1) | **DELETE** /1/object/discussionmembership/{pkiDiscussionmembershipID} | Delete an existing Discussionmembership



## discussionmembershipCreateObjectV1

> DiscussionmembershipCreateObjectV1Response discussionmembershipCreateObjectV1(discussionmembershipCreateObjectV1Request)

Create a new Discussionmembership

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionmembershipApi;

ObjectDiscussionmembershipApi apiInstance = new ObjectDiscussionmembershipApi();
DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request = new DiscussionmembershipCreateObjectV1Request(); // DiscussionmembershipCreateObjectV1Request | 
try {
    DiscussionmembershipCreateObjectV1Response result = apiInstance.discussionmembershipCreateObjectV1(discussionmembershipCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionmembershipApi#discussionmembershipCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionmembershipCreateObjectV1Request** | [**DiscussionmembershipCreateObjectV1Request**](DiscussionmembershipCreateObjectV1Request.md)|  |

### Return type

[**DiscussionmembershipCreateObjectV1Response**](DiscussionmembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## discussionmembershipDeleteObjectV1

> CommonResponse discussionmembershipDeleteObjectV1(pkiDiscussionmembershipID)

Delete an existing Discussionmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectDiscussionmembershipApi;

ObjectDiscussionmembershipApi apiInstance = new ObjectDiscussionmembershipApi();
Integer pkiDiscussionmembershipID = null; // Integer | The unique ID of the Discussionmembership
try {
    CommonResponse result = apiInstance.discussionmembershipDeleteObjectV1(pkiDiscussionmembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectDiscussionmembershipApi#discussionmembershipDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmembershipID** | **Integer**| The unique ID of the Discussionmembership | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

