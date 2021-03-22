/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
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

import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.SsprResetPasswordRequestV1Request;
import org.openapitools.client.model.SsprResetPasswordV1Request;
import org.openapitools.client.model.SsprSendUsernamesV1Request;
import org.openapitools.client.model.SsprUnlockAccountRequestV1Request;
import org.openapitools.client.model.SsprUnlockAccountV1Request;
import org.openapitools.client.model.SsprValidateTokenV1Request;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ModuleSsprApi {
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
  * Reset Password Request
  * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprResetPasswordRequestV1Request 
   * @return void
  */
  public void ssprResetPasswordRequestV1 (SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprResetPasswordRequestV1Request;
    // verify the required parameter 'ssprResetPasswordRequestV1Request' is set
    if (ssprResetPasswordRequestV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprResetPasswordRequestV1Request' when calling ssprResetPasswordRequestV1",
        new ApiException(400, "Missing the required parameter 'ssprResetPasswordRequestV1Request' when calling ssprResetPasswordRequestV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/resetPasswordRequest";

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
         return ;
      } else {
         return ;
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
   * Reset Password Request
   * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprResetPasswordRequestV1Request 
  */
  public void ssprResetPasswordRequestV1 (SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprResetPasswordRequestV1Request;

    // verify the required parameter 'ssprResetPasswordRequestV1Request' is set
    if (ssprResetPasswordRequestV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprResetPasswordRequestV1Request' when calling ssprResetPasswordRequestV1",
        new ApiException(400, "Missing the required parameter 'ssprResetPasswordRequestV1Request' when calling ssprResetPasswordRequestV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/resetPasswordRequest".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
  * Reset Password
  * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprResetPasswordV1Request 
   * @return void
  */
  public void ssprResetPasswordV1 (SsprResetPasswordV1Request ssprResetPasswordV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprResetPasswordV1Request;
    // verify the required parameter 'ssprResetPasswordV1Request' is set
    if (ssprResetPasswordV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprResetPasswordV1Request' when calling ssprResetPasswordV1",
        new ApiException(400, "Missing the required parameter 'ssprResetPasswordV1Request' when calling ssprResetPasswordV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/resetPassword";

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
         return ;
      } else {
         return ;
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
   * Reset Password
   * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprResetPasswordV1Request 
  */
  public void ssprResetPasswordV1 (SsprResetPasswordV1Request ssprResetPasswordV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprResetPasswordV1Request;

    // verify the required parameter 'ssprResetPasswordV1Request' is set
    if (ssprResetPasswordV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprResetPasswordV1Request' when calling ssprResetPasswordV1",
        new ApiException(400, "Missing the required parameter 'ssprResetPasswordV1Request' when calling ssprResetPasswordV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/resetPassword".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
  * Send username(s)
  * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
   * @param ssprSendUsernamesV1Request 
   * @return void
  */
  public void ssprSendUsernamesV1 (SsprSendUsernamesV1Request ssprSendUsernamesV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprSendUsernamesV1Request;
    // verify the required parameter 'ssprSendUsernamesV1Request' is set
    if (ssprSendUsernamesV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprSendUsernamesV1Request' when calling ssprSendUsernamesV1",
        new ApiException(400, "Missing the required parameter 'ssprSendUsernamesV1Request' when calling ssprSendUsernamesV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/sendUsernames";

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
         return ;
      } else {
         return ;
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
   * Send username(s)
   * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
   * @param ssprSendUsernamesV1Request 
  */
  public void ssprSendUsernamesV1 (SsprSendUsernamesV1Request ssprSendUsernamesV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprSendUsernamesV1Request;

    // verify the required parameter 'ssprSendUsernamesV1Request' is set
    if (ssprSendUsernamesV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprSendUsernamesV1Request' when calling ssprSendUsernamesV1",
        new ApiException(400, "Missing the required parameter 'ssprSendUsernamesV1Request' when calling ssprSendUsernamesV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/sendUsernames".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
  * Unlock Account Request
  * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprUnlockAccountRequestV1Request 
   * @return void
  */
  public void ssprUnlockAccountRequestV1 (SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprUnlockAccountRequestV1Request;
    // verify the required parameter 'ssprUnlockAccountRequestV1Request' is set
    if (ssprUnlockAccountRequestV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprUnlockAccountRequestV1Request' when calling ssprUnlockAccountRequestV1",
        new ApiException(400, "Missing the required parameter 'ssprUnlockAccountRequestV1Request' when calling ssprUnlockAccountRequestV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/unlockAccountRequest";

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
         return ;
      } else {
         return ;
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
   * Unlock Account Request
   * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprUnlockAccountRequestV1Request 
  */
  public void ssprUnlockAccountRequestV1 (SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprUnlockAccountRequestV1Request;

    // verify the required parameter 'ssprUnlockAccountRequestV1Request' is set
    if (ssprUnlockAccountRequestV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprUnlockAccountRequestV1Request' when calling ssprUnlockAccountRequestV1",
        new ApiException(400, "Missing the required parameter 'ssprUnlockAccountRequestV1Request' when calling ssprUnlockAccountRequestV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/unlockAccountRequest".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
  * Unlock Account
  * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprUnlockAccountV1Request 
   * @return void
  */
  public void ssprUnlockAccountV1 (SsprUnlockAccountV1Request ssprUnlockAccountV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprUnlockAccountV1Request;
    // verify the required parameter 'ssprUnlockAccountV1Request' is set
    if (ssprUnlockAccountV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprUnlockAccountV1Request' when calling ssprUnlockAccountV1",
        new ApiException(400, "Missing the required parameter 'ssprUnlockAccountV1Request' when calling ssprUnlockAccountV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/unlockAccount";

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
         return ;
      } else {
         return ;
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
   * Unlock Account
   * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprUnlockAccountV1Request 
  */
  public void ssprUnlockAccountV1 (SsprUnlockAccountV1Request ssprUnlockAccountV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprUnlockAccountV1Request;

    // verify the required parameter 'ssprUnlockAccountV1Request' is set
    if (ssprUnlockAccountV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprUnlockAccountV1Request' when calling ssprUnlockAccountV1",
        new ApiException(400, "Missing the required parameter 'ssprUnlockAccountV1Request' when calling ssprUnlockAccountV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/unlockAccount".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
  * Validate Token
  * This endpoint validates if a Token is valid and not expired.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprValidateTokenV1Request 
   * @return void
  */
  public void ssprValidateTokenV1 (SsprValidateTokenV1Request ssprValidateTokenV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ssprValidateTokenV1Request;
    // verify the required parameter 'ssprValidateTokenV1Request' is set
    if (ssprValidateTokenV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprValidateTokenV1Request' when calling ssprValidateTokenV1",
        new ApiException(400, "Missing the required parameter 'ssprValidateTokenV1Request' when calling ssprValidateTokenV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/validateToken";

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
         return ;
      } else {
         return ;
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
   * Validate Token
   * This endpoint validates if a Token is valid and not expired.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
   * @param ssprValidateTokenV1Request 
  */
  public void ssprValidateTokenV1 (SsprValidateTokenV1Request ssprValidateTokenV1Request, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ssprValidateTokenV1Request;

    // verify the required parameter 'ssprValidateTokenV1Request' is set
    if (ssprValidateTokenV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ssprValidateTokenV1Request' when calling ssprValidateTokenV1",
        new ApiException(400, "Missing the required parameter 'ssprValidateTokenV1Request' when calling ssprValidateTokenV1"));
    }

    // create path and map variables
    String path = "/1/module/sspr/validateToken".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse(localVarResponse);
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
