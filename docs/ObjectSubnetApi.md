# ObjectSubnetApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subnetCreateObjectV1**](ObjectSubnetApi.md#subnetCreateObjectV1) | **POST** /1/object/subnet | Create a new Subnet
[**subnetDeleteObjectV1**](ObjectSubnetApi.md#subnetDeleteObjectV1) | **DELETE** /1/object/subnet/{pkiSubnetID} | Delete an existing Subnet
[**subnetEditObjectV1**](ObjectSubnetApi.md#subnetEditObjectV1) | **PUT** /1/object/subnet/{pkiSubnetID} | Edit an existing Subnet
[**subnetGetObjectV2**](ObjectSubnetApi.md#subnetGetObjectV2) | **GET** /2/object/subnet/{pkiSubnetID} | Retrieve an existing Subnet



## subnetCreateObjectV1

> SubnetCreateObjectV1Response subnetCreateObjectV1(subnetCreateObjectV1Request)

Create a new Subnet

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSubnetApi;

ObjectSubnetApi apiInstance = new ObjectSubnetApi();
SubnetCreateObjectV1Request subnetCreateObjectV1Request = new SubnetCreateObjectV1Request(); // SubnetCreateObjectV1Request | 
try {
    SubnetCreateObjectV1Response result = apiInstance.subnetCreateObjectV1(subnetCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSubnetApi#subnetCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetCreateObjectV1Request** | [**SubnetCreateObjectV1Request**](SubnetCreateObjectV1Request.md)|  |

### Return type

[**SubnetCreateObjectV1Response**](SubnetCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## subnetDeleteObjectV1

> SubnetDeleteObjectV1Response subnetDeleteObjectV1(pkiSubnetID)

Delete an existing Subnet



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSubnetApi;

ObjectSubnetApi apiInstance = new ObjectSubnetApi();
Integer pkiSubnetID = null; // Integer | The unique ID of the Subnet
try {
    SubnetDeleteObjectV1Response result = apiInstance.subnetDeleteObjectV1(pkiSubnetID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSubnetApi#subnetDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **Integer**| The unique ID of the Subnet | [default to null]

### Return type

[**SubnetDeleteObjectV1Response**](SubnetDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subnetEditObjectV1

> SubnetEditObjectV1Response subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request)

Edit an existing Subnet



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSubnetApi;

ObjectSubnetApi apiInstance = new ObjectSubnetApi();
Integer pkiSubnetID = null; // Integer | The unique ID of the Subnet
SubnetEditObjectV1Request subnetEditObjectV1Request = new SubnetEditObjectV1Request(); // SubnetEditObjectV1Request | 
try {
    SubnetEditObjectV1Response result = apiInstance.subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSubnetApi#subnetEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **Integer**| The unique ID of the Subnet | [default to null]
 **subnetEditObjectV1Request** | [**SubnetEditObjectV1Request**](SubnetEditObjectV1Request.md)|  |

### Return type

[**SubnetEditObjectV1Response**](SubnetEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## subnetGetObjectV2

> SubnetGetObjectV2Response subnetGetObjectV2(pkiSubnetID)

Retrieve an existing Subnet



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSubnetApi;

ObjectSubnetApi apiInstance = new ObjectSubnetApi();
Integer pkiSubnetID = null; // Integer | The unique ID of the Subnet
try {
    SubnetGetObjectV2Response result = apiInstance.subnetGetObjectV2(pkiSubnetID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSubnetApi#subnetGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **Integer**| The unique ID of the Subnet | [default to null]

### Return type

[**SubnetGetObjectV2Response**](SubnetGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

