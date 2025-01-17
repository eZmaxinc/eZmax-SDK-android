# ObjectEzsignsignergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignergroupmembershipCreateObjectV1**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipCreateObjectV1) | **POST** /1/object/ezsignsignergroupmembership | Create a new Ezsignsignergroupmembership
[**ezsignsignergroupmembershipDeleteObjectV1**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Delete an existing Ezsignsignergroupmembership
[**ezsignsignergroupmembershipGetObjectV2**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipGetObjectV2) | **GET** /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Retrieve an existing Ezsignsignergroupmembership



## ezsignsignergroupmembershipCreateObjectV1

> EzsignsignergroupmembershipCreateObjectV1Response ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request)

Create a new Ezsignsignergroupmembership

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupmembershipApi;

ObjectEzsignsignergroupmembershipApi apiInstance = new ObjectEzsignsignergroupmembershipApi();
EzsignsignergroupmembershipCreateObjectV1Request ezsignsignergroupmembershipCreateObjectV1Request = new EzsignsignergroupmembershipCreateObjectV1Request(); // EzsignsignergroupmembershipCreateObjectV1Request | 
try {
    EzsignsignergroupmembershipCreateObjectV1Response result = apiInstance.ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignergroupmembershipCreateObjectV1Request** | [**EzsignsignergroupmembershipCreateObjectV1Request**](EzsignsignergroupmembershipCreateObjectV1Request.md)|  |

### Return type

[**EzsignsignergroupmembershipCreateObjectV1Response**](EzsignsignergroupmembershipCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignergroupmembershipDeleteObjectV1

> EzsignsignergroupmembershipDeleteObjectV1Response ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID)

Delete an existing Ezsignsignergroupmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupmembershipApi;

ObjectEzsignsignergroupmembershipApi apiInstance = new ObjectEzsignsignergroupmembershipApi();
Integer pkiEzsignsignergroupmembershipID = null; // Integer | The unique ID of the Ezsignsignergroupmembership
try {
    EzsignsignergroupmembershipDeleteObjectV1Response result = apiInstance.ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupmembershipID** | **Integer**| The unique ID of the Ezsignsignergroupmembership | [default to null]

### Return type

[**EzsignsignergroupmembershipDeleteObjectV1Response**](EzsignsignergroupmembershipDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignergroupmembershipGetObjectV2

> EzsignsignergroupmembershipGetObjectV2Response ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID)

Retrieve an existing Ezsignsignergroupmembership



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupmembershipApi;

ObjectEzsignsignergroupmembershipApi apiInstance = new ObjectEzsignsignergroupmembershipApi();
Integer pkiEzsignsignergroupmembershipID = null; // Integer | The unique ID of the Ezsignsignergroupmembership
try {
    EzsignsignergroupmembershipGetObjectV2Response result = apiInstance.ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupmembershipID** | **Integer**| The unique ID of the Ezsignsignergroupmembership | [default to null]

### Return type

[**EzsignsignergroupmembershipGetObjectV2Response**](EzsignsignergroupmembershipGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

