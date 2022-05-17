# ObjectNotificationsectionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsectionGetNotificationtestsV1**](ObjectNotificationsectionApi.md#notificationsectionGetNotificationtestsV1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection&#39;s Notificationtests



## notificationsectionGetNotificationtestsV1

> NotificationsectionGetNotificationtestsV1Response notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden)

Retrieve an existing Notificationsection&#39;s Notificationtests



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectNotificationsectionApi;

ObjectNotificationsectionApi apiInstance = new ObjectNotificationsectionApi();
Integer pkiNotificationsectionID = null; // Integer | 
Boolean bShowHidden = null; // Boolean | Whether or not to return the hidden Notificationtests
try {
    NotificationsectionGetNotificationtestsV1Response result = apiInstance.notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectNotificationsectionApi#notificationsectionGetNotificationtestsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotificationsectionID** | **Integer**|  | [default to null]
 **bShowHidden** | **Boolean**| Whether or not to return the hidden Notificationtests | [default to null]

### Return type

[**NotificationsectionGetNotificationtestsV1Response**](NotificationsectionGetNotificationtestsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

