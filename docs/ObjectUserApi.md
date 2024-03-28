# ObjectUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateObjectV1**](ObjectUserApi.md#userCreateObjectV1) | **POST** /1/object/user | Create a new User
[**userCreateObjectV2**](ObjectUserApi.md#userCreateObjectV2) | **POST** /2/object/user | Create a new User
[**userEditObjectV1**](ObjectUserApi.md#userEditObjectV1) | **PUT** /1/object/user/{pkiUserID} | Edit an existing User
[**userEditPermissionsV1**](ObjectUserApi.md#userEditPermissionsV1) | **PUT** /1/object/user/{pkiUserID}/editPermissions | Edit multiple Permissions
[**userGetApikeysV1**](ObjectUserApi.md#userGetApikeysV1) | **GET** /1/object/user/{pkiUserID}/getApikeys | Retrieve an existing User&#39;s Apikeys
[**userGetAutocompleteV2**](ObjectUserApi.md#userGetAutocompleteV2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
[**userGetEffectivePermissionsV1**](ObjectUserApi.md#userGetEffectivePermissionsV1) | **GET** /1/object/user/{pkiUserID}/getEffectivePermissions | Retrieve an existing User&#39;s Effective Permissions
[**userGetListV1**](ObjectUserApi.md#userGetListV1) | **GET** /1/object/user/getList | Retrieve User list
[**userGetObjectV2**](ObjectUserApi.md#userGetObjectV2) | **GET** /2/object/user/{pkiUserID} | Retrieve an existing User
[**userGetPermissionsV1**](ObjectUserApi.md#userGetPermissionsV1) | **GET** /1/object/user/{pkiUserID}/getPermissions | Retrieve an existing User&#39;s Permissions
[**userGetSubnetsV1**](ObjectUserApi.md#userGetSubnetsV1) | **GET** /1/object/user/{pkiUserID}/getSubnets | Retrieve an existing User&#39;s Subnets
[**userGetUsergroupexternalsV1**](ObjectUserApi.md#userGetUsergroupexternalsV1) | **GET** /1/object/user/{pkiUserID}/getUsergroupexternals | Get User&#39;s Usergroupexternals
[**userGetUsergroupsV1**](ObjectUserApi.md#userGetUsergroupsV1) | **GET** /1/object/user/{pkiUserID}/getUsergroups | Get User&#39;s Usergroups
[**userSendPasswordResetV1**](ObjectUserApi.md#userSendPasswordResetV1) | **POST** /1/object/user/{pkiUserID}/sendPasswordReset | Send password reset



## userCreateObjectV1

> UserCreateObjectV1Response userCreateObjectV1(userCreateObjectV1Request)

Create a new User

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
UserCreateObjectV1Request userCreateObjectV1Request = new UserCreateObjectV1Request(); // UserCreateObjectV1Request | 
try {
    UserCreateObjectV1Response result = apiInstance.userCreateObjectV1(userCreateObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userCreateObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateObjectV1Request** | [**UserCreateObjectV1Request**](UserCreateObjectV1Request.md)|  |

### Return type

[**UserCreateObjectV1Response**](UserCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userCreateObjectV2

> UserCreateObjectV2Response userCreateObjectV2(userCreateObjectV2Request)

Create a new User

The endpoint allows to create one or many elements at once.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
UserCreateObjectV2Request userCreateObjectV2Request = new UserCreateObjectV2Request(); // UserCreateObjectV2Request | 
try {
    UserCreateObjectV2Response result = apiInstance.userCreateObjectV2(userCreateObjectV2Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userCreateObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateObjectV2Request** | [**UserCreateObjectV2Request**](UserCreateObjectV2Request.md)|  |

### Return type

[**UserCreateObjectV2Response**](UserCreateObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userEditObjectV1

> UserEditObjectV1Response userEditObjectV1(pkiUserID, userEditObjectV1Request)

Edit an existing User



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | The unique ID of the User
UserEditObjectV1Request userEditObjectV1Request = new UserEditObjectV1Request(); // UserEditObjectV1Request | 
try {
    UserEditObjectV1Response result = apiInstance.userEditObjectV1(pkiUserID, userEditObjectV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userEditObjectV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**| The unique ID of the User | [default to null]
 **userEditObjectV1Request** | [**UserEditObjectV1Request**](UserEditObjectV1Request.md)|  |

### Return type

[**UserEditObjectV1Response**](UserEditObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userEditPermissionsV1

> UserEditPermissionsV1Response userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
UserEditPermissionsV1Request userEditPermissionsV1Request = new UserEditPermissionsV1Request(); // UserEditPermissionsV1Request | 
try {
    UserEditPermissionsV1Response result = apiInstance.userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userEditPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]
 **userEditPermissionsV1Request** | [**UserEditPermissionsV1Request**](UserEditPermissionsV1Request.md)|  |

### Return type

[**UserEditPermissionsV1Response**](UserEditPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userGetApikeysV1

> UserGetApikeysV1Response userGetApikeysV1(pkiUserID)

Retrieve an existing User&#39;s Apikeys

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetApikeysV1Response result = apiInstance.userGetApikeysV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetApikeysV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetApikeysV1Response**](UserGetApikeysV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetAutocompleteV2

> UserGetAutocompleteV2Response userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Users and IDs

Get the list of User to be used in a dropdown or autocomplete control.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
String sSelector = null; // String | The type of Users to return
String eFilterActive = Active; // String | Specify which results we want to display.
String sQuery = null; // String | Allow to filter the returned results
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
try {
    UserGetAutocompleteV2Response result = apiInstance.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetAutocompleteV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **String**| The type of Users to return | [default to null] [enum: AgentBrokerEmployeeEzsignUserNormal, AgentBrokerEmployeeNormalBuiltIn, AgentBrokerEzsignuserNormal, ClonableUsers, EzsignuserBuiltIn, Normal, UsergroupDelegated]
 **eFilterActive** | **String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **String**| Allow to filter the returned results | [optional] [default to null]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]

### Return type

[**UserGetAutocompleteV2Response**](UserGetAutocompleteV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetEffectivePermissionsV1

> UserGetEffectivePermissionsV1Response userGetEffectivePermissionsV1(pkiUserID)

Retrieve an existing User&#39;s Effective Permissions

Effective Permissions refers to the combination of Permissions held by a User and the Permissions associated with the Usergroups they belong to.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetEffectivePermissionsV1Response result = apiInstance.userGetEffectivePermissionsV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetEffectivePermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetEffectivePermissionsV1Response**](UserGetEffectivePermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetListV1

> UserGetListV1Response userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve User list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eUserType | AgentBroker&lt;br&gt;Assistant&lt;br&gt;Employee&lt;br&gt;EzsignUser&lt;br&gt;Normal | | eUserOrigin | BuiltIn&lt;br&gt;External | | eUserEzsignaccess | No&lt;br&gt;PaidByOffice&lt;br&gt;PerDocument&lt;br&gt;Prepaid |

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
String eOrderBy = null; // String | Specify how you want the results to be sorted
Integer iRowMax = null; // Integer | 
Integer iRowOffset = 0; // Integer | 
HeaderAcceptLanguage acceptLanguage = null; // HeaderAcceptLanguage | 
String sFilter = null; // String | 
try {
    UserGetListV1Response result = apiInstance.userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetListV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **String**| Specify how you want the results to be sorted | [optional] [default to null] [enum: pkiUserID_ASC, pkiUserID_DESC, sUserFirstname_ASC, sUserFirstname_DESC, sUserLastname_ASC, sUserLastname_DESC, sUserLoginname_ASC, sUserLoginname_DESC, bUserIsactive_ASC, bUserIsactive_DESC, eUserType_ASC, eUserType_DESC, eUserOrigin_ASC, eUserOrigin_DESC, eUserEzsignaccess_ASC, eUserEzsignaccess_DESC, dtUserEzsignprepaidexpiration_ASC, dtUserEzsignprepaidexpiration_DESC, sEmailAddress_ASC, sEmailAddress_DESC]
 **iRowMax** | **Integer**|  | [optional] [default to null]
 **iRowOffset** | **Integer**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [default to null] [enum: *, en, fr]
 **sFilter** | **String**|  | [optional] [default to null]

### Return type

[**UserGetListV1Response**](UserGetListV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


## userGetObjectV2

> UserGetObjectV2Response userGetObjectV2(pkiUserID)

Retrieve an existing User



### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | The unique ID of the User
try {
    UserGetObjectV2Response result = apiInstance.userGetObjectV2(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetObjectV2");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**| The unique ID of the User | [default to null]

### Return type

[**UserGetObjectV2Response**](UserGetObjectV2Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetPermissionsV1

> UserGetPermissionsV1Response userGetPermissionsV1(pkiUserID)

Retrieve an existing User&#39;s Permissions

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetPermissionsV1Response result = apiInstance.userGetPermissionsV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetPermissionsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetPermissionsV1Response**](UserGetPermissionsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetSubnetsV1

> UserGetSubnetsV1Response userGetSubnetsV1(pkiUserID)

Retrieve an existing User&#39;s Subnets

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetSubnetsV1Response result = apiInstance.userGetSubnetsV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetSubnetsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetSubnetsV1Response**](UserGetSubnetsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetUsergroupexternalsV1

> UserGetUsergroupexternalsV1Response userGetUsergroupexternalsV1(pkiUserID)

Get User&#39;s Usergroupexternals

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetUsergroupexternalsV1Response result = apiInstance.userGetUsergroupexternalsV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetUsergroupexternalsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetUsergroupexternalsV1Response**](UserGetUsergroupexternalsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userGetUsergroupsV1

> UserGetUsergroupsV1Response userGetUsergroupsV1(pkiUserID)

Get User&#39;s Usergroups

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
try {
    UserGetUsergroupsV1Response result = apiInstance.userGetUsergroupsV1(pkiUserID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userGetUsergroupsV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]

### Return type

[**UserGetUsergroupsV1Response**](UserGetUsergroupsV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userSendPasswordResetV1

> UserSendPasswordResetV1Response userSendPasswordResetV1(pkiUserID, body)

Send password reset

Send the password reset email

### Example

```java
// Import classes:
//import org.openapitools.client.api.ObjectUserApi;

ObjectUserApi apiInstance = new ObjectUserApi();
Integer pkiUserID = null; // Integer | 
Object body = null; // Object | 
try {
    UserSendPasswordResetV1Response result = apiInstance.userSendPasswordResetV1(pkiUserID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectUserApi#userSendPasswordResetV1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **Integer**|  | [default to null]
 **body** | **Object**|  |

### Return type

[**UserSendPasswordResetV1Response**](UserSendPasswordResetV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

