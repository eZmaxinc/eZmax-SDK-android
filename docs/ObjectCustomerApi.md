# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCreateObjectV1**](ObjectCustomerApi.md#customerCreateObjectV1) | **POST** /1/object/customer | Create a new Customer
[**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer



## customerCreateObjectV1

> CustomerCreateObjectV1Response customerCreateObjectV1(customerCreateObjectV1Request)

Create a new Customer

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
CustomerCreateObjectV1Request customerCreateObjectV1Request = new CustomerCreateObjectV1Request(); // CustomerCreateObjectV1Request | 
try {
    CustomerCreateObjectV1Response result = apiInstance.customerCreateObjectV1(customerCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCreateObjectV1Request** | [**CustomerCreateObjectV1Request**](CustomerCreateObjectV1Request.md)|  |

### Return type

[**CustomerCreateObjectV1Response**](CustomerCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerGetObjectV2

> CustomerGetObjectV2Response customerGetObjectV2(pkiCustomerID)

Retrieve an existing Customer



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectCustomerApi;

ObjectCustomerApi apiInstance = new ObjectCustomerApi();
Integer pkiCustomerID = null; // Integer | The unique ID of the Customer
try {
    CustomerGetObjectV2Response result = apiInstance.customerGetObjectV2(pkiCustomerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectCustomerApi#customerGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCustomerID** | **Integer**| The unique ID of the Customer | [default to null]

### Return type

[**CustomerGetObjectV2Response**](CustomerGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

