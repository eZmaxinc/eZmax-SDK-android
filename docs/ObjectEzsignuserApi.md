# ObjectEzsignuserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignuserEditObjectV1**](ObjectEzsignuserApi.md#ezsignuserEditObjectV1) | **PUT** /1/object/ezsignuser/{pkiEzsignuserID} | Edit an existing Ezsignuser
[**ezsignuserGetObjectV2**](ObjectEzsignuserApi.md#ezsignuserGetObjectV2) | **GET** /2/object/ezsignuser/{pkiEzsignuserID} | Retrieve an existing Ezsignuser



## ezsignuserEditObjectV1

> CommonResponse ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request)

Edit an existing Ezsignuser



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignuserApi;

ObjectEzsignuserApi apiInstance = new ObjectEzsignuserApi();
Integer pkiEzsignuserID = null; // Integer | The unique ID of the Ezsignuser
EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request = new EzsignuserEditObjectV1Request(); // EzsignuserEditObjectV1Request | 
try {
    CommonResponse result = apiInstance.ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignuserApi#ezsignuserEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignuserID** | **Integer**| The unique ID of the Ezsignuser | [default to null]
 **ezsignuserEditObjectV1Request** | [**EzsignuserEditObjectV1Request**](EzsignuserEditObjectV1Request.md)|  |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## ezsignuserGetObjectV2

> EzsignuserGetObjectV2Response ezsignuserGetObjectV2(pkiEzsignuserID)

Retrieve an existing Ezsignuser



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectEzsignuserApi;

ObjectEzsignuserApi apiInstance = new ObjectEzsignuserApi();
Integer pkiEzsignuserID = null; // Integer | The unique ID of the Ezsignuser
try {
    EzsignuserGetObjectV2Response result = apiInstance.ezsignuserGetObjectV2(pkiEzsignuserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectEzsignuserApi#ezsignuserGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignuserID** | **Integer**| The unique ID of the Ezsignuser | [default to null]

### Return type

[**EzsignuserGetObjectV2Response**](EzsignuserGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

