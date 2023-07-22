# ObjectVariableexpenseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**variableexpenseCreateObjectV1**](ObjectVariableexpenseApi.md#variableexpenseCreateObjectV1) | **POST** /1/object/variableexpense | Create a new Variableexpense
[**variableexpenseEditObjectV1**](ObjectVariableexpenseApi.md#variableexpenseEditObjectV1) | **PUT** /1/object/variableexpense/{pkiVariableexpenseID} | Edit an existing Variableexpense
[**variableexpenseGetAutocompleteV2**](ObjectVariableexpenseApi.md#variableexpenseGetAutocompleteV2) | **GET** /2/object/variableexpense/getAutocomplete/{sSelector} | Retrieve Variableexpenses and IDs
[**variableexpenseGetListV1**](ObjectVariableexpenseApi.md#variableexpenseGetListV1) | **GET** /1/object/variableexpense/getList | Retrieve Variableexpense list
[**variableexpenseGetObjectV2**](ObjectVariableexpenseApi.md#variableexpenseGetObjectV2) | **GET** /2/object/variableexpense/{pkiVariableexpenseID} | Retrieve an existing Variableexpense



## variableexpenseCreateObjectV1

> VariableexpenseCreateObjectV1Response variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request)

Create a new Variableexpense

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVariableexpenseApi;

ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi();
VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request = new VariableexpenseCreateObjectV1Request(); // VariableexpenseCreateObjectV1Request | 
try {
    VariableexpenseCreateObjectV1Response result = apiInstance.variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableexpenseCreateObjectV1Request** | [**VariableexpenseCreateObjectV1Request**](VariableexpenseCreateObjectV1Request.md)|  |

### Return type

[**VariableexpenseCreateObjectV1Response**](VariableexpenseCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## variableexpenseEditObjectV1

> VariableexpenseEditObjectV1Response variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request)

Edit an existing Variableexpense



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVariableexpenseApi;

ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi();
Integer pkiVariableexpenseID = null; // Integer | 
VariableexpenseEditObjectV1Request variableexpenseEditObjectV1Request = new VariableexpenseEditObjectV1Request(); // VariableexpenseEditObjectV1Request | 
try {
    VariableexpenseEditObjectV1Response result = apiInstance.variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiVariableexpenseID** | **Integer**|  | [default to null]
 **variableexpenseEditObjectV1Request** | [**VariableexpenseEditObjectV1Request**](VariableexpenseEditObjectV1Request.md)|  |

### Return type

[**VariableexpenseEditObjectV1Response**](VariableexpenseEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## variableexpenseGetAutocompleteV2

> VariableexpenseGetAutocompleteV2Response variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Variableexpenses and IDs

Get the list of Variableexpense to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVariableexpenseApi;

ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi();
String sSelector = null; // String | The type of Variableexpenses to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    VariableexpenseGetAutocompleteV2Response result = apiInstance.variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Variableexpenses to return | [default to null] [enum: All]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**VariableexpenseGetAutocompleteV2Response**](VariableexpenseGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## variableexpenseGetListV1

> VariableexpenseGetListV1Response variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Variableexpense list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eVariableexpenseTaxable | Yes&lt;br&gt;No&lt;br&gt;Included |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVariableexpenseApi;

ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = 10000; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    VariableexpenseGetListV1Response result = apiInstance.variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiVariableexpenseID_ASC, pkiVariableexpenseID_DESC, sVariableexpenseCode_ASC, sVariableexpenseCode_DESC, sVariableexpenseDescriptionX_ASC, sVariableexpenseDescriptionX_DESC, eVariableexpenseTaxable_ASC, eVariableexpenseTaxable_DESC, bVariableexpenseIsactive_ASC, bVariableexpenseIsactive_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to 10000]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**VariableexpenseGetListV1Response**](VariableexpenseGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## variableexpenseGetObjectV2

> VariableexpenseGetObjectV2Response variableexpenseGetObjectV2(pkiVariableexpenseID)

Retrieve an existing Variableexpense



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectVariableexpenseApi;

ObjectVariableexpenseApi apiInstance = new ObjectVariableexpenseApi();
Integer pkiVariableexpenseID = null; // Integer | 
try {
    VariableexpenseGetObjectV2Response result = apiInstance.variableexpenseGetObjectV2(pkiVariableexpenseID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectVariableexpenseApi#variableexpenseGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiVariableexpenseID** | **Integer**|  | [default to null]

### Return type

[**VariableexpenseGetObjectV2Response**](VariableexpenseGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

