# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprRemindUsernamesV1**](ModuleSsprApi.md#ssprRemindUsernamesV1) | **POST** /1/module/sspr/remindUsernames | Remind of forgotten username(s)



## ssprRemindUsernamesV1

> ssprRemindUsernamesV1()

Remind of forgotten username(s)

This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
try {
    apiInstance.ssprRemindUsernamesV1();
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprRemindUsernamesV1");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

