# ObjectEzsignsignergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignergroupCreateObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupCreateObjectV1) | **POST** /1/object/ezsignsignergroup | Create a new Ezsignsignergroup
[**ezsignsignergroupDeleteObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Delete an existing Ezsignsignergroup
[**ezsignsignergroupEditEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditEzsignsignergroupmembershipsV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships | Edit multiple Ezsignsignergroupmemberships
[**ezsignsignergroupEditObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditObjectV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Edit an existing Ezsignsignergroup
[**ezsignsignergroupGetEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetEzsignsignergroupmembershipsV1) | **GET** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/getEzsignsignergroupmemberships | Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships
[**ezsignsignergroupGetObjectV2**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetObjectV2) | **GET** /2/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Retrieve an existing Ezsignsignergroup



## ezsignsignergroupCreateObjectV1

> EzsignsignergroupCreateObjectV1Response ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request)

Create a new Ezsignsignergroup

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
EzsignsignergroupCreateObjectV1Request ezsignsignergroupCreateObjectV1Request = new EzsignsignergroupCreateObjectV1Request(); // EzsignsignergroupCreateObjectV1Request | 
try {
    EzsignsignergroupCreateObjectV1Response result = apiInstance.ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignergroupCreateObjectV1Request** | [**EzsignsignergroupCreateObjectV1Request**](EzsignsignergroupCreateObjectV1Request.md)|  |

### Return type

[**EzsignsignergroupCreateObjectV1Response**](EzsignsignergroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignergroupDeleteObjectV1

> CommonResponse ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)

Delete an existing Ezsignsignergroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
Integer pkiEzsignsignergroupID = null; // Integer | The unique ID of the Ezsignsignergroup
try {
    CommonResponse result = apiInstance.ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupDeleteObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | [default to null]

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignergroupEditEzsignsignergroupmembershipsV1

> EzsignsignergroupEditEzsignsignergroupmembershipsV1Response ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request)

Edit multiple Ezsignsignergroupmemberships

Using this endpoint, you can edit multiple Ezsignsignergroupmemberships at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
Integer pkiEzsignsignergroupID = null; // Integer | 
EzsignsignergroupEditEzsignsignergroupmembershipsV1Request ezsignsignergroupEditEzsignsignergroupmembershipsV1Request = new EzsignsignergroupEditEzsignsignergroupmembershipsV1Request(); // EzsignsignergroupEditEzsignsignergroupmembershipsV1Request | 
try {
    EzsignsignergroupEditEzsignsignergroupmembershipsV1Response result = apiInstance.ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupEditEzsignsignergroupmembershipsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **Integer**|  | [default to null]
 **ezsignsignergroupEditEzsignsignergroupmembershipsV1Request** | [**EzsignsignergroupEditEzsignsignergroupmembershipsV1Request**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Request.md)|  |

### Return type

[**EzsignsignergroupEditEzsignsignergroupmembershipsV1Response**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignergroupEditObjectV1

> CommonResponse ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request)

Edit an existing Ezsignsignergroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
Integer pkiEzsignsignergroupID = null; // Integer | The unique ID of the Ezsignsignergroup
EzsignsignergroupEditObjectV1Request ezsignsignergroupEditObjectV1Request = new EzsignsignergroupEditObjectV1Request(); // EzsignsignergroupEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | [default to null]
 **ezsignsignergroupEditObjectV1Request** | [**EzsignsignergroupEditObjectV1Request**](EzsignsignergroupEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignsignergroupGetEzsignsignergroupmembershipsV1

> EzsignsignergroupGetEzsignsignergroupmembershipsV1Response ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
Integer pkiEzsignsignergroupID = null; // Integer | 
try {
    EzsignsignergroupGetEzsignsignergroupmembershipsV1Response result = apiInstance.ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupGetEzsignsignergroupmembershipsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **Integer**|  | [default to null]

### Return type

[**EzsignsignergroupGetEzsignsignergroupmembershipsV1Response**](EzsignsignergroupGetEzsignsignergroupmembershipsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ezsignsignergroupGetObjectV2

> EzsignsignergroupGetObjectV2Response ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignsignergroupApi;

ObjectEzsignsignergroupApi apiInstance = new ObjectEzsignsignergroupApi();
Integer pkiEzsignsignergroupID = null; // Integer | The unique ID of the Ezsignsignergroup
try {
    EzsignsignergroupGetObjectV2Response result = apiInstance.ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignsignergroupApi#ezsignsignergroupGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **Integer**| The unique ID of the Ezsignsignergroup | [default to null]

### Return type

[**EzsignsignergroupGetObjectV2Response**](EzsignsignergroupGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

