# ObjectPermissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionCreateObjectV1**](ObjectPermissionApi.md#permissionCreateObjectV1) | **POST** /1/object/permission | Create a new Permission
[**permissionDeleteObjectV1**](ObjectPermissionApi.md#permissionDeleteObjectV1) | **DELETE** /1/object/permission/{pkiPermissionID} | Delete an existing Permission
[**permissionEditObjectV1**](ObjectPermissionApi.md#permissionEditObjectV1) | **PUT** /1/object/permission/{pkiPermissionID} | Edit an existing Permission
[**permissionGetObjectV2**](ObjectPermissionApi.md#permissionGetObjectV2) | **GET** /2/object/permission/{pkiPermissionID} | Retrieve an existing Permission



## permissionCreateObjectV1

> PermissionCreateObjectV1Response permissionCreateObjectV1(permissionCreateObjectV1Request)

Create a new Permission

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPermissionApi;

ObjectPermissionApi apiInstance = new ObjectPermissionApi();
PermissionCreateObjectV1Request permissionCreateObjectV1Request = new PermissionCreateObjectV1Request(); // PermissionCreateObjectV1Request | 
try {
    PermissionCreateObjectV1Response result = apiInstance.permissionCreateObjectV1(permissionCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPermissionApi#permissionCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionCreateObjectV1Request** | [**PermissionCreateObjectV1Request**](PermissionCreateObjectV1Request.md)|  |

### Return type

[**PermissionCreateObjectV1Response**](PermissionCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## permissionDeleteObjectV1

> CommonResponse permissionDeleteObjectV1(pkiPermissionID)

Delete an existing Permission



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPermissionApi;

ObjectPermissionApi apiInstance = new ObjectPermissionApi();
Integer pkiPermissionID = null; // Integer | The unique ID of the Permission
try {
    CommonResponse result = apiInstance.permissionDeleteObjectV1(pkiPermissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPermissionApi#permissionDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **Integer**| The unique ID of the Permission | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## permissionEditObjectV1

> CommonResponse permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request)

Edit an existing Permission



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPermissionApi;

ObjectPermissionApi apiInstance = new ObjectPermissionApi();
Integer pkiPermissionID = null; // Integer | The unique ID of the Permission
PermissionEditObjectV1Request permissionEditObjectV1Request = new PermissionEditObjectV1Request(); // PermissionEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPermissionApi#permissionEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **Integer**| The unique ID of the Permission | [default to null]
 **permissionEditObjectV1Request** | [**PermissionEditObjectV1Request**](PermissionEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## permissionGetObjectV2

> PermissionGetObjectV2Response permissionGetObjectV2(pkiPermissionID)

Retrieve an existing Permission



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectPermissionApi;

ObjectPermissionApi apiInstance = new ObjectPermissionApi();
Integer pkiPermissionID = null; // Integer | The unique ID of the Permission
try {
    PermissionGetObjectV2Response result = apiInstance.permissionGetObjectV2(pkiPermissionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectPermissionApi#permissionGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **Integer**| The unique ID of the Permission | [default to null]

### Return type

[**PermissionGetObjectV2Response**](PermissionGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

