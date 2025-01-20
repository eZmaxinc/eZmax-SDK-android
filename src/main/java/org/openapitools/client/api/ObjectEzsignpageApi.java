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

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignpageApi {
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
  * Consult an Ezsignpage
  * 
   * @param pkiEzsignpageID 
   * @param body 
   * @return CommonResponse
  */
  public CommonResponse ezsignpageConsultV1 (Integer pkiEzsignpageID, Object body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'pkiEzsignpageID' is set
    if (pkiEzsignpageID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignpageID' when calling ezsignpageConsultV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignpageID' when calling ezsignpageConsultV1"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling ezsignpageConsultV1",
        new ApiException(400, "Missing the required parameter 'body' when calling ezsignpageConsultV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignpage/{pkiEzsignpageID}/consult".replaceAll("\\{" + "pkiEzsignpageID" + "\\}", apiInvoker.escapeString(pkiEzsignpageID.toString()));

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
   * Consult an Ezsignpage
   * 
   * @param pkiEzsignpageID    * @param body 
  */
  public void ezsignpageConsultV1 (Integer pkiEzsignpageID, Object body, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'pkiEzsignpageID' is set
    if (pkiEzsignpageID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignpageID' when calling ezsignpageConsultV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignpageID' when calling ezsignpageConsultV1"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling ezsignpageConsultV1",
        new ApiException(400, "Missing the required parameter 'body' when calling ezsignpageConsultV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignpage/{pkiEzsignpageID}/consult".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignpageID" + "\\}", apiInvoker.escapeString(pkiEzsignpageID.toString()));

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
