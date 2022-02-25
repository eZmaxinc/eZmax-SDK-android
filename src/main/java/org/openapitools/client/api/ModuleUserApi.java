/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import java.util.*;
import org.openapitools.client.model.UserCreateEzsignuserV1Request;
import org.openapitools.client.model.UserCreateEzsignuserV1Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ModuleUserApi {
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
  * Create a new User of type Ezsignuser
  * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
   * @param userCreateEzsignuserV1Request 
   * @return UserCreateEzsignuserV1Response
  */
  public UserCreateEzsignuserV1Response userCreateEzsignuserV1 (List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = userCreateEzsignuserV1Request;
    // verify the required parameter 'userCreateEzsignuserV1Request' is set
    if (userCreateEzsignuserV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userCreateEzsignuserV1Request' when calling userCreateEzsignuserV1",
        new ApiException(400, "Missing the required parameter 'userCreateEzsignuserV1Request' when calling userCreateEzsignuserV1"));
    }

    // create path and map variables
    String path = "/1/module/user/createezsignuser";

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
         return (UserCreateEzsignuserV1Response) ApiInvoker.deserialize(localVarResponse, "", UserCreateEzsignuserV1Response.class);
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
   * Create a new User of type Ezsignuser
   * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
   * @param userCreateEzsignuserV1Request 
  */
  public void userCreateEzsignuserV1 (List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request, final Response.Listener<UserCreateEzsignuserV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = userCreateEzsignuserV1Request;

    // verify the required parameter 'userCreateEzsignuserV1Request' is set
    if (userCreateEzsignuserV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userCreateEzsignuserV1Request' when calling userCreateEzsignuserV1",
        new ApiException(400, "Missing the required parameter 'userCreateEzsignuserV1Request' when calling userCreateEzsignuserV1"));
    }

    // create path and map variables
    String path = "/1/module/user/createezsignuser".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((UserCreateEzsignuserV1Response) ApiInvoker.deserialize(localVarResponse,  "", UserCreateEzsignuserV1Response.class));
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
