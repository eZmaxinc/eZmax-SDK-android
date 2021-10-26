/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.2
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

import org.openapitools.client.model.AuthenticateAuthenticateV2Request;
import org.openapitools.client.model.AuthenticateAuthenticateV2Response;
import org.openapitools.client.model.CommonResponseError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ModuleAuthenticateApi {
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
  * Authenticate a user
  * This endpoint authenticates a user.
   * @param eSessionType 
   * @param authenticateAuthenticateV2Request 
   * @return AuthenticateAuthenticateV2Response
  */
  public AuthenticateAuthenticateV2Response authenticateAuthenticateV2 (String eSessionType, AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = authenticateAuthenticateV2Request;
    // verify the required parameter 'eSessionType' is set
    if (eSessionType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'eSessionType' when calling authenticateAuthenticateV2",
        new ApiException(400, "Missing the required parameter 'eSessionType' when calling authenticateAuthenticateV2"));
    }
    // verify the required parameter 'authenticateAuthenticateV2Request' is set
    if (authenticateAuthenticateV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authenticateAuthenticateV2Request' when calling authenticateAuthenticateV2",
        new ApiException(400, "Missing the required parameter 'authenticateAuthenticateV2Request' when calling authenticateAuthenticateV2"));
    }

    // create path and map variables
    String path = "/2/module/authenticate/authenticate/{eSessionType}".replaceAll("\\{" + "eSessionType" + "\\}", apiInvoker.escapeString(eSessionType.toString()));

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
         return (AuthenticateAuthenticateV2Response) ApiInvoker.deserialize(localVarResponse, "", AuthenticateAuthenticateV2Response.class);
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
   * Authenticate a user
   * This endpoint authenticates a user.
   * @param eSessionType    * @param authenticateAuthenticateV2Request 
  */
  public void authenticateAuthenticateV2 (String eSessionType, AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request, final Response.Listener<AuthenticateAuthenticateV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = authenticateAuthenticateV2Request;

    // verify the required parameter 'eSessionType' is set
    if (eSessionType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'eSessionType' when calling authenticateAuthenticateV2",
        new ApiException(400, "Missing the required parameter 'eSessionType' when calling authenticateAuthenticateV2"));
    }
    // verify the required parameter 'authenticateAuthenticateV2Request' is set
    if (authenticateAuthenticateV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authenticateAuthenticateV2Request' when calling authenticateAuthenticateV2",
        new ApiException(400, "Missing the required parameter 'authenticateAuthenticateV2Request' when calling authenticateAuthenticateV2"));
    }

    // create path and map variables
    String path = "/2/module/authenticate/authenticate/{eSessionType}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "eSessionType" + "\\}", apiInvoker.escapeString(eSessionType.toString()));

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
              responseListener.onResponse((AuthenticateAuthenticateV2Response) ApiInvoker.deserialize(localVarResponse,  "", AuthenticateAuthenticateV2Response.class));
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
