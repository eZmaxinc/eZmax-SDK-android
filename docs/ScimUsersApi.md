# ScimUsersApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersCreateObjectScimV2**](ScimUsersApi.md#usersCreateObjectScimV2) | **POST** /2/scim/Users | Create a new User
[**usersDeleteObjectScimV2**](ScimUsersApi.md#usersDeleteObjectScimV2) | **DELETE** /2/scim/Users/{userId} | Delete an existing User
[**usersEditObjectScimV2**](ScimUsersApi.md#usersEditObjectScimV2) | **PUT** /2/scim/Users/{userId} | Edit an existing User
[**usersGetListScimV2**](ScimUsersApi.md#usersGetListScimV2) | **GET** /2/scim/Users | Retrieve User list
[**usersGetObjectScimV2**](ScimUsersApi.md#usersGetObjectScimV2) | **GET** /2/scim/Users/{userId} | Retrieve an existing User



## usersCreateObjectScimV2

> ScimUser usersCreateObjectScimV2(scimUser)

Create a new User

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimUsersApi;

ScimUsersApi apiInstance = new ScimUsersApi();
ScimUser scimUser = new ScimUser(); // ScimUser | 
try {
    ScimUser result = apiInstance.usersCreateObjectScimV2(scimUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimUsersApi#usersCreateObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scimUser** | [**ScimUser**](ScimUser.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usersDeleteObjectScimV2

> usersDeleteObjectScimV2(userId)

Delete an existing User

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimUsersApi;

ScimUsersApi apiInstance = new ScimUsersApi();
String userId = null; // String | 
try {
    apiInstance.usersDeleteObjectScimV2(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimUsersApi#usersDeleteObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## usersEditObjectScimV2

> ScimUser usersEditObjectScimV2(userId, scimUser)

Edit an existing User

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimUsersApi;

ScimUsersApi apiInstance = new ScimUsersApi();
String userId = null; // String | 
ScimUser scimUser = new ScimUser(); // ScimUser | 
try {
    ScimUser result = apiInstance.usersEditObjectScimV2(userId, scimUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimUsersApi#usersEditObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [default to null]
 **scimUser** | [**ScimUser**](ScimUser.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usersGetListScimV2

> ScimUserList usersGetListScimV2(filter)

Retrieve User list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimUsersApi;

ScimUsersApi apiInstance = new ScimUsersApi();
String filter = null; // String | Filter expression for searching users
try {
    ScimUserList result = apiInstance.usersGetListScimV2(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimUsersApi#usersGetListScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter expression for searching users | [optional] [default to null]

### Return type

[**ScimUserList**](ScimUserList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usersGetObjectScimV2

> ScimUser usersGetObjectScimV2(userId)

Retrieve an existing User

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimUsersApi;

ScimUsersApi apiInstance = new ScimUsersApi();
String userId = null; // String | 
try {
    ScimUser result = apiInstance.usersGetObjectScimV2(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimUsersApi#usersGetObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [default to null]

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

