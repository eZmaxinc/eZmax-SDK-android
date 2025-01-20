/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import eZmaxAPI.ApiInvoker;
import eZmaxAPI.ApiException;
import eZmaxAPI.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.CommonResponse;
import org.openapitools.client.model.CommonResponseError;
import java.io.File;
import org.openapitools.client.model.HeaderAcceptLanguage;
import org.openapitools.client.model.UserstagedCreateUserV1Response;
import org.openapitools.client.model.UserstagedGetListV1Response;
import org.openapitools.client.model.UserstagedGetObjectV2Response;
import org.openapitools.client.model.UserstagedMapV1Request;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectUserstagedApi {
  String basePath = "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Create a User from a Userstaged and then map it
  * Default values will be used while creating the User. If you need to change those values, you should use the route to edit a User.
   * @param pkiUserstagedID 
   * @param body 
   * @return UserstagedCreateUserV1Response
  */
  public UserstagedCreateUserV1Response userstagedCreateUserV1 (Integer pkiUserstagedID, Object body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedCreateUserV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedCreateUserV1"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling userstagedCreateUserV1",
        new ApiException(400, "Missing the required parameter 'body' when calling userstagedCreateUserV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}/createUser".replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (UserstagedCreateUserV1Response) ApiInvoker.deserialize(localVarResponse, "", UserstagedCreateUserV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create a User from a Userstaged and then map it
   * Default values will be used while creating the User. If you need to change those values, you should use the route to edit a User.
   * @param pkiUserstagedID    * @param body 
  */
  public void userstagedCreateUserV1 (Integer pkiUserstagedID, Object body, final Response.Listener<UserstagedCreateUserV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedCreateUserV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedCreateUserV1"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling userstagedCreateUserV1",
        new ApiException(400, "Missing the required parameter 'body' when calling userstagedCreateUserV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}/createUser".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((UserstagedCreateUserV1Response) ApiInvoker.deserialize(localVarResponse,  "", UserstagedCreateUserV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete an existing Userstaged
  * 
   * @param pkiUserstagedID 
   * @return CommonResponse
  */
  public CommonResponse userstagedDeleteObjectV1 (Integer pkiUserstagedID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}".replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CommonResponse) ApiInvoker.deserialize(localVarResponse, "", CommonResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete an existing Userstaged
   * 
   * @param pkiUserstagedID 
  */
  public void userstagedDeleteObjectV1 (Integer pkiUserstagedID, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CommonResponse) ApiInvoker.deserialize(localVarResponse,  "", CommonResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve Userstaged list
  * 
   * @param eOrderBy Specify how you want the results to be sorted
   * @param iRowMax 
   * @param iRowOffset 
   * @param acceptLanguage 
   * @param sFilter 
   * @return UserstagedGetListV1Response
  */
  public UserstagedGetListV1Response userstagedGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/1/object/userstaged/getList";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "eOrderBy", eOrderBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowMax", iRowMax));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowOffset", iRowOffset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sFilter", sFilter));
    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (UserstagedGetListV1Response) ApiInvoker.deserialize(localVarResponse, "", UserstagedGetListV1Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve Userstaged list
   * 
   * @param eOrderBy Specify how you want the results to be sorted   * @param iRowMax    * @param iRowOffset    * @param acceptLanguage    * @param sFilter 
  */
  public void userstagedGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter, final Response.Listener<UserstagedGetListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/1/object/userstaged/getList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "eOrderBy", eOrderBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowMax", iRowMax));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowOffset", iRowOffset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sFilter", sFilter));

    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((UserstagedGetListV1Response) ApiInvoker.deserialize(localVarResponse,  "", UserstagedGetListV1Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Retrieve an existing Userstaged
  * 
   * @param pkiUserstagedID 
   * @return UserstagedGetObjectV2Response
  */
  public UserstagedGetObjectV2Response userstagedGetObjectV2 (Integer pkiUserstagedID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/userstaged/{pkiUserstagedID}".replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (UserstagedGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", UserstagedGetObjectV2Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Retrieve an existing Userstaged
   * 
   * @param pkiUserstagedID 
  */
  public void userstagedGetObjectV2 (Integer pkiUserstagedID, final Response.Listener<UserstagedGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/userstaged/{pkiUserstagedID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((UserstagedGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", UserstagedGetObjectV2Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Map the Userstaged to an existing user
  * 
   * @param pkiUserstagedID 
   * @param userstagedMapV1Request 
   * @return CommonResponse
  */
  public CommonResponse userstagedMapV1 (Integer pkiUserstagedID, UserstagedMapV1Request userstagedMapV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = userstagedMapV1Request;
    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedMapV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedMapV1"));
    }
    // verify the required parameter 'userstagedMapV1Request' is set
    if (userstagedMapV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userstagedMapV1Request' when calling userstagedMapV1",
        new ApiException(400, "Missing the required parameter 'userstagedMapV1Request' when calling userstagedMapV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}/map".replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CommonResponse) ApiInvoker.deserialize(localVarResponse, "", CommonResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Map the Userstaged to an existing user
   * 
   * @param pkiUserstagedID    * @param userstagedMapV1Request 
  */
  public void userstagedMapV1 (Integer pkiUserstagedID, UserstagedMapV1Request userstagedMapV1Request, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = userstagedMapV1Request;

    // verify the required parameter 'pkiUserstagedID' is set
    if (pkiUserstagedID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiUserstagedID' when calling userstagedMapV1",
        new ApiException(400, "Missing the required parameter 'pkiUserstagedID' when calling userstagedMapV1"));
    }
    // verify the required parameter 'userstagedMapV1Request' is set
    if (userstagedMapV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userstagedMapV1Request' when calling userstagedMapV1",
        new ApiException(400, "Missing the required parameter 'userstagedMapV1Request' when calling userstagedMapV1"));
    }

    // create path and map variables
    String path = "/1/object/userstaged/{pkiUserstagedID}/map".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiUserstagedID" + "\\}", apiInvoker.escapeString(pkiUserstagedID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CommonResponse) ApiInvoker.deserialize(localVarResponse,  "", CommonResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
