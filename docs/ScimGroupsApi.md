# ScimGroupsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsCreateObjectScimV2**](ScimGroupsApi.md#groupsCreateObjectScimV2) | **POST** /2/scim/Groups | Create a new Usergroup
[**groupsDeleteObjectScimV2**](ScimGroupsApi.md#groupsDeleteObjectScimV2) | **DELETE** /2/scim/Groups/{groupId} | Delete an existing Usergroup
[**groupsEditObjectScimV2**](ScimGroupsApi.md#groupsEditObjectScimV2) | **PUT** /2/scim/Groups/{groupId} | Edit an existing Usergroup
[**groupsGetListScimV2**](ScimGroupsApi.md#groupsGetListScimV2) | **GET** /2/scim/Groups | Retrieve Usergroup list
[**groupsGetObjectScimV2**](ScimGroupsApi.md#groupsGetObjectScimV2) | **GET** /2/scim/Groups/{groupId} | Retrieve an existing Usergroup



## groupsCreateObjectScimV2

> ScimGroup groupsCreateObjectScimV2(scimGroup)

Create a new Usergroup

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimGroupsApi;

ScimGroupsApi apiInstance = new ScimGroupsApi();
ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
try {
    ScimGroup result = apiInstance.groupsCreateObjectScimV2(scimGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimGroupsApi#groupsCreateObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## groupsDeleteObjectScimV2

> groupsDeleteObjectScimV2(groupId)

Delete an existing Usergroup

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimGroupsApi;

ScimGroupsApi apiInstance = new ScimGroupsApi();
String groupId = null; // String | 
try {
    apiInstance.groupsDeleteObjectScimV2(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimGroupsApi#groupsDeleteObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## groupsEditObjectScimV2

> ScimGroup groupsEditObjectScimV2(groupId, scimGroup)

Edit an existing Usergroup

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimGroupsApi;

ScimGroupsApi apiInstance = new ScimGroupsApi();
String groupId = null; // String | 
ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
try {
    ScimGroup result = apiInstance.groupsEditObjectScimV2(groupId, scimGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimGroupsApi#groupsEditObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  | [default to null]
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## groupsGetListScimV2

> ScimGroup groupsGetListScimV2(filter)

Retrieve Usergroup list

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimGroupsApi;

ScimGroupsApi apiInstance = new ScimGroupsApi();
String filter = null; // String | Filter expression for searching groups
try {
    ScimGroup result = apiInstance.groupsGetListScimV2(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimGroupsApi#groupsGetListScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter expression for searching groups | [optional] [default to null]

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## groupsGetObjectScimV2

> ScimGroup groupsGetObjectScimV2(groupId)

Retrieve an existing Usergroup

### Example

```java
// Import classes:
//import org.openapitools.client.api.ScimGroupsApi;

ScimGroupsApi apiInstance = new ScimGroupsApi();
String groupId = null; // String | 
try {
    ScimGroup result = apiInstance.groupsGetObjectScimV2(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimGroupsApi#groupsGetObjectScimV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  | [default to null]

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

