# ObjectNotificationtestApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationtestGetElementsV1**](ObjectNotificationtestApi.md#notificationtestGetElementsV1) | **GET** /1/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements



## notificationtestGetElementsV1

> NotificationtestGetElementsV1Response notificationtestGetElementsV1(pkiNotificationtestID)

Retrieve an existing Notificationtest&#39;s Elements



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectNotificationtestApi;

ObjectNotificationtestApi apiInstance = new ObjectNotificationtestApi();
Integer pkiNotificationtestID = null; // Integer | 
try {
    NotificationtestGetElementsV1Response result = apiInstance.notificationtestGetElementsV1(pkiNotificationtestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectNotificationtestApi#notificationtestGetElementsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotificationtestID** | **Integer**|  | [default to null]

### Return type

[**NotificationtestGetElementsV1Response**](NotificationtestGetElementsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

