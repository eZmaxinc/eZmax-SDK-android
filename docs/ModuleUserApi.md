# ModuleUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateEzsignuserV1**](ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser



## userCreateEzsignuserV1

> UserCreateEzsignuserV1Response userCreateEzsignuserV1(userCreateEzsignuserV1Request)

Create a new User of type Ezsignuser

The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleUserApi;

ModuleUserApi apiInstance = new ModuleUserApi();
List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request = Arrays.asList(new UserCreateEzsignuserV1Request()); // List<UserCreateEzsignuserV1Request> | 
try {
    UserCreateEzsignuserV1Response result = apiInstance.userCreateEzsignuserV1(userCreateEzsignuserV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleUserApi#userCreateEzsignuserV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateEzsignuserV1Request** | [**List&lt;UserCreateEzsignuserV1Request&gt;**](UserCreateEzsignuserV1Request.md)|  |

### Return type

[**UserCreateEzsignuserV1Response**](UserCreateEzsignuserV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

