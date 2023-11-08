# ObjectUsergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupCreateObjectV1**](ObjectUsergroupApi.md#usergroupCreateObjectV1) | **POST** /1/object/usergroup | Create a new Usergroup
[**usergroupEditObjectV1**](ObjectUsergroupApi.md#usergroupEditObjectV1) | **PUT** /1/object/usergroup/{pkiUsergroupID} | Edit an existing Usergroup
[**usergroupEditPermissionsV1**](ObjectUsergroupApi.md#usergroupEditPermissionsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editPermissions | Edit multiple Permissions
[**usergroupEditUsergroupdelegationsV1**](ObjectUsergroupApi.md#usergroupEditUsergroupdelegationsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupdelegations | Edit multiple Usergroupdelegations
[**usergroupEditUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupEditUsergroupmembershipsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships | Edit multiple Usergroupmemberships
[**usergroupGetAutocompleteV2**](ObjectUsergroupApi.md#usergroupGetAutocompleteV2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
[**usergroupGetListV1**](ObjectUsergroupApi.md#usergroupGetListV1) | **GET** /1/object/usergroup/getList | Retrieve Usergroup list
[**usergroupGetObjectV2**](ObjectUsergroupApi.md#usergroupGetObjectV2) | **GET** /2/object/usergroup/{pkiUsergroupID} | Retrieve an existing Usergroup
[**usergroupGetPermissionsV1**](ObjectUsergroupApi.md#usergroupGetPermissionsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getPermissions | Retrieve an existing Usergroup&#39;s Permissions
[**usergroupGetUsergroupdelegationsV1**](ObjectUsergroupApi.md#usergroupGetUsergroupdelegationsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupdelegations | Retrieve an existing Usergroup&#39;s Usergroupdelegations
[**usergroupGetUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupGetUsergroupmembershipsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships | Retrieve an existing Usergroup&#39;s Usergroupmemberships



## usergroupCreateObjectV1

> UsergroupCreateObjectV1Response usergroupCreateObjectV1(usergroupCreateObjectV1Request)

Create a new Usergroup

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
UsergroupCreateObjectV1Request usergroupCreateObjectV1Request = new UsergroupCreateObjectV1Request(); // UsergroupCreateObjectV1Request | 
try {
    UsergroupCreateObjectV1Response result = apiInstance.usergroupCreateObjectV1(usergroupCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupCreateObjectV1Request** | [**UsergroupCreateObjectV1Request**](UsergroupCreateObjectV1Request.md)|  |

### Return type

[**UsergroupCreateObjectV1Response**](UsergroupCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupEditObjectV1

> UsergroupEditObjectV1Response usergroupEditObjectV1(pkiUsergroupID, usergroupEditObjectV1Request)

Edit an existing Usergroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
UsergroupEditObjectV1Request usergroupEditObjectV1Request = new UsergroupEditObjectV1Request(); // UsergroupEditObjectV1Request | 
try {
    UsergroupEditObjectV1Response result = apiInstance.usergroupEditObjectV1(pkiUsergroupID, usergroupEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]
 **usergroupEditObjectV1Request** | [**UsergroupEditObjectV1Request**](UsergroupEditObjectV1Request.md)|  |

### Return type

[**UsergroupEditObjectV1Response**](UsergroupEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupEditPermissionsV1

> UsergroupEditPermissionsV1Response usergroupEditPermissionsV1(pkiUsergroupID, usergroupEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
UsergroupEditPermissionsV1Request usergroupEditPermissionsV1Request = new UsergroupEditPermissionsV1Request(); // UsergroupEditPermissionsV1Request | 
try {
    UsergroupEditPermissionsV1Response result = apiInstance.usergroupEditPermissionsV1(pkiUsergroupID, usergroupEditPermissionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupEditPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]
 **usergroupEditPermissionsV1Request** | [**UsergroupEditPermissionsV1Request**](UsergroupEditPermissionsV1Request.md)|  |

### Return type

[**UsergroupEditPermissionsV1Response**](UsergroupEditPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupEditUsergroupdelegationsV1

> UsergroupEditUsergroupdelegationsV1Response usergroupEditUsergroupdelegationsV1(pkiUsergroupID, usergroupEditUsergroupdelegationsV1Request)

Edit multiple Usergroupdelegations

Edit multiple Usergroupdelegations

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
UsergroupEditUsergroupdelegationsV1Request usergroupEditUsergroupdelegationsV1Request = new UsergroupEditUsergroupdelegationsV1Request(); // UsergroupEditUsergroupdelegationsV1Request | 
try {
    UsergroupEditUsergroupdelegationsV1Response result = apiInstance.usergroupEditUsergroupdelegationsV1(pkiUsergroupID, usergroupEditUsergroupdelegationsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupEditUsergroupdelegationsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]
 **usergroupEditUsergroupdelegationsV1Request** | [**UsergroupEditUsergroupdelegationsV1Request**](UsergroupEditUsergroupdelegationsV1Request.md)|  |

### Return type

[**UsergroupEditUsergroupdelegationsV1Response**](UsergroupEditUsergroupdelegationsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupEditUsergroupmembershipsV1

> UsergroupEditUsergroupmembershipsV1Response usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupEditUsergroupmembershipsV1Request)

Edit multiple Usergroupmemberships

Using this endpoint, you can edit multiple Usergroupmemberships at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
UsergroupEditUsergroupmembershipsV1Request usergroupEditUsergroupmembershipsV1Request = new UsergroupEditUsergroupmembershipsV1Request(); // UsergroupEditUsergroupmembershipsV1Request | 
try {
    UsergroupEditUsergroupmembershipsV1Response result = apiInstance.usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupEditUsergroupmembershipsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupEditUsergroupmembershipsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]
 **usergroupEditUsergroupmembershipsV1Request** | [**UsergroupEditUsergroupmembershipsV1Request**](UsergroupEditUsergroupmembershipsV1Request.md)|  |

### Return type

[**UsergroupEditUsergroupmembershipsV1Response**](UsergroupEditUsergroupmembershipsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## usergroupGetAutocompleteV2

> UsergroupGetAutocompleteV2Response usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Usergroups and IDs

Get the list of Usergroup to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
String sSelector = null; // String | The type of Usergroups to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    UsergroupGetAutocompleteV2Response result = apiInstance.usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Usergroups to return | [default to null] [enum: All, AllButEveryone]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**UsergroupGetAutocompleteV2Response**](UsergroupGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupGetListV1

> UsergroupGetListV1Response usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Usergroup list



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    UsergroupGetListV1Response result = apiInstance.usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiUsergroupID_ASC, pkiUsergroupID_DESC, sUsergroupNameX_ASC, sUsergroupNameX_DESC, iCountUser_ASC, iCountUser_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**UsergroupGetListV1Response**](UsergroupGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## usergroupGetObjectV2

> UsergroupGetObjectV2Response usergroupGetObjectV2(pkiUsergroupID)

Retrieve an existing Usergroup



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
try {
    UsergroupGetObjectV2Response result = apiInstance.usergroupGetObjectV2(pkiUsergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]

### Return type

[**UsergroupGetObjectV2Response**](UsergroupGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupGetPermissionsV1

> UsergroupGetPermissionsV1Response usergroupGetPermissionsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Permissions

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
try {
    UsergroupGetPermissionsV1Response result = apiInstance.usergroupGetPermissionsV1(pkiUsergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]

### Return type

[**UsergroupGetPermissionsV1Response**](UsergroupGetPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupGetUsergroupdelegationsV1

> UsergroupGetUsergroupdelegationsV1Response usergroupGetUsergroupdelegationsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Usergroupdelegations

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
try {
    UsergroupGetUsergroupdelegationsV1Response result = apiInstance.usergroupGetUsergroupdelegationsV1(pkiUsergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetUsergroupdelegationsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]

### Return type

[**UsergroupGetUsergroupdelegationsV1Response**](UsergroupGetUsergroupdelegationsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroupGetUsergroupmembershipsV1

> UsergroupGetUsergroupmembershipsV1Response usergroupGetUsergroupmembershipsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Usergroupmemberships

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUsergroupApi;

ObjectUsergroupApi apiInstance = new ObjectUsergroupApi();
Integer pkiUsergroupID = null; // Integer | 
try {
    UsergroupGetUsergroupmembershipsV1Response result = apiInstance.usergroupGetUsergroupmembershipsV1(pkiUsergroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUsergroupApi#usergroupGetUsergroupmembershipsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **Integer**|  | [default to null]

### Return type

[**UsergroupGetUsergroupmembershipsV1Response**](UsergroupGetUsergroupmembershipsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

