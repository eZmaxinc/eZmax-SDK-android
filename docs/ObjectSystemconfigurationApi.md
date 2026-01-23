# ObjectSystemconfigurationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemconfigurationEditObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV2) | **PUT** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration
[**systemconfigurationGetObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration



## systemconfigurationEditObjectV2

> SystemconfigurationEditObjectV2Response systemconfigurationEditObjectV2(pkiSystemconfigurationID, systemconfigurationEditObjectV2Request)

Edit an existing Systemconfiguration



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSystemconfigurationApi;

ObjectSystemconfigurationApi apiInstance = new ObjectSystemconfigurationApi();
Integer pkiSystemconfigurationID = null; // Integer | The unique ID of the Systemconfiguration
SystemconfigurationEditObjectV2Request systemconfigurationEditObjectV2Request = new SystemconfigurationEditObjectV2Request(); // SystemconfigurationEditObjectV2Request | 
try {
    SystemconfigurationEditObjectV2Response result = apiInstance.systemconfigurationEditObjectV2(pkiSystemconfigurationID, systemconfigurationEditObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSystemconfigurationID** | **Integer**| The unique ID of the Systemconfiguration | [default to null]
 **systemconfigurationEditObjectV2Request** | [**SystemconfigurationEditObjectV2Request**](SystemconfigurationEditObjectV2Request.md)|  |

### Return type

[**SystemconfigurationEditObjectV2Response**](SystemconfigurationEditObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## systemconfigurationGetObjectV2

> SystemconfigurationGetObjectV2Response systemconfigurationGetObjectV2(pkiSystemconfigurationID)

Retrieve an existing Systemconfiguration



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectSystemconfigurationApi;

ObjectSystemconfigurationApi apiInstance = new ObjectSystemconfigurationApi();
Integer pkiSystemconfigurationID = null; // Integer | The unique ID of the Systemconfiguration
try {
    SystemconfigurationGetObjectV2Response result = apiInstance.systemconfigurationGetObjectV2(pkiSystemconfigurationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectSystemconfigurationApi#systemconfigurationGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSystemconfigurationID** | **Integer**| The unique ID of the Systemconfiguration | [default to null]

### Return type

[**SystemconfigurationGetObjectV2Response**](SystemconfigurationGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

