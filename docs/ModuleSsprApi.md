# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprResetPasswordRequestV1**](ModuleSsprApi.md#ssprResetPasswordRequestV1) | **POST** /1/module/sspr/resetPasswordRequest | Reset Password Request
[**ssprResetPasswordV1**](ModuleSsprApi.md#ssprResetPasswordV1) | **POST** /1/module/sspr/resetPassword | Reset Password
[**ssprSendUsernamesV1**](ModuleSsprApi.md#ssprSendUsernamesV1) | **POST** /1/module/sspr/sendUsernames | Send username(s)
[**ssprUnlockAccountRequestV1**](ModuleSsprApi.md#ssprUnlockAccountRequestV1) | **POST** /1/module/sspr/unlockAccountRequest | Unlock Account Request
[**ssprUnlockAccountV1**](ModuleSsprApi.md#ssprUnlockAccountV1) | **POST** /1/module/sspr/unlockAccount | Unlock Account
[**ssprValidateTokenV1**](ModuleSsprApi.md#ssprValidateTokenV1) | **POST** /1/module/sspr/validateToken | Validate Token



## ssprResetPasswordRequestV1

> ssprResetPasswordRequestV1(ssprResetPasswordRequestV1Request)

Reset Password Request

This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request = new SsprResetPasswordRequestV1Request(); // SsprResetPasswordRequestV1Request | 
try {
    apiInstance.ssprResetPasswordRequestV1(ssprResetPasswordRequestV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprResetPasswordRequestV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprResetPasswordRequestV1Request** | [**SsprResetPasswordRequestV1Request**](SsprResetPasswordRequestV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssprResetPasswordV1

> ssprResetPasswordV1(ssprResetPasswordV1Request)

Reset Password

This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprResetPasswordV1Request ssprResetPasswordV1Request = new SsprResetPasswordV1Request(); // SsprResetPasswordV1Request | 
try {
    apiInstance.ssprResetPasswordV1(ssprResetPasswordV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprResetPasswordV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprResetPasswordV1Request** | [**SsprResetPasswordV1Request**](SsprResetPasswordV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssprSendUsernamesV1

> ssprSendUsernamesV1(ssprSendUsernamesV1Request)

Send username(s)

This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprSendUsernamesV1Request ssprSendUsernamesV1Request = new SsprSendUsernamesV1Request(); // SsprSendUsernamesV1Request | 
try {
    apiInstance.ssprSendUsernamesV1(ssprSendUsernamesV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprSendUsernamesV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprSendUsernamesV1Request** | [**SsprSendUsernamesV1Request**](SsprSendUsernamesV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssprUnlockAccountRequestV1

> ssprUnlockAccountRequestV1(ssprUnlockAccountRequestV1Request)

Unlock Account Request

This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request = new SsprUnlockAccountRequestV1Request(); // SsprUnlockAccountRequestV1Request | 
try {
    apiInstance.ssprUnlockAccountRequestV1(ssprUnlockAccountRequestV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprUnlockAccountRequestV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprUnlockAccountRequestV1Request** | [**SsprUnlockAccountRequestV1Request**](SsprUnlockAccountRequestV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssprUnlockAccountV1

> ssprUnlockAccountV1(ssprUnlockAccountV1Request)

Unlock Account

This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprUnlockAccountV1Request ssprUnlockAccountV1Request = new SsprUnlockAccountV1Request(); // SsprUnlockAccountV1Request | 
try {
    apiInstance.ssprUnlockAccountV1(ssprUnlockAccountV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprUnlockAccountV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprUnlockAccountV1Request** | [**SsprUnlockAccountV1Request**](SsprUnlockAccountV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ssprValidateTokenV1

> ssprValidateTokenV1(ssprValidateTokenV1Request)

Validate Token

This endpoint validates if a Token is valid and not expired.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModuleSsprApi;

ModuleSsprApi apiInstance = new ModuleSsprApi();
SsprValidateTokenV1Request ssprValidateTokenV1Request = new SsprValidateTokenV1Request(); // SsprValidateTokenV1Request | 
try {
    apiInstance.ssprValidateTokenV1(ssprValidateTokenV1Request);
} catch (ApiException e) {
    System.err.println("Exception when calling ModuleSsprApi#ssprValidateTokenV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprValidateTokenV1Request** | [**SsprValidateTokenV1Request**](SsprValidateTokenV1Request.md)|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

