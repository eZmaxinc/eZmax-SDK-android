

# CommonResponseObjDebugPayloadGetList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iVersionMin** | **Integer** | The minimum version of the function that can be called | 
**iVersionMax** | **Integer** | The maximum version of the function that can be called | 
**aRequiredPermission** | **List&lt;Integer&gt;** | An array of permissions required to access this function.  If the value \&quot;0\&quot; is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don&#39;t need to have all of them. | 
**bVersionDeprecated** | **Boolean** | Wheter the current route is deprecated or not | 
**aFilter** | [**CommonResponseFilter**](CommonResponseFilter.md) |  | 
**aOrderBy** | **Map&lt;String, String&gt;** | List of available values for *eOrderBy* | 




