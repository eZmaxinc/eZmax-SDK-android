/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
import org.openapitools.client.model.CommunicationSendV1Request;
import org.openapitools.client.model.CommunicationSendV1Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectCommunicationApi {
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
  * Retrieve the communication body.
  * This endpoint returns the communication body.
   * @param pkiCommunicationID 
   * @return void
  */
  public void communicationGetCommunicationBodyV1 (Integer pkiCommunicationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiCommunicationID' is set
    if (pkiCommunicationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCommunicationID' when calling communicationGetCommunicationBodyV1",
        new ApiException(400, "Missing the required parameter 'pkiCommunicationID' when calling communicationGetCommunicationBodyV1"));
    }

    // create path and map variables
    String path = "/1/object/communication/{pkiCommunicationID}/getCommunicationBody".replaceAll("\\{" + "pkiCommunicationID" + "\\}", apiInvoker.escapeString(pkiCommunicationID.toString()));

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
   * Retrieve the communication body.
   * This endpoint returns the communication body.
   * @param pkiCommunicationID 
  */
  public void communicationGetCommunicationBodyV1 (Integer pkiCommunicationID, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiCommunicationID' is set
    if (pkiCommunicationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCommunicationID' when calling communicationGetCommunicationBodyV1",
        new ApiException(400, "Missing the required parameter 'pkiCommunicationID' when calling communicationGetCommunicationBodyV1"));
    }

    // create path and map variables
    String path = "/1/object/communication/{pkiCommunicationID}/getCommunicationBody".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiCommunicationID" + "\\}", apiInvoker.escapeString(pkiCommunicationID.toString()));

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
  * Send a new Communication
  * The endpoint allows to send one or many elements at once.
   * @param communicationSendV1Request 
   * @return CommunicationSendV1Response
  */
  public CommunicationSendV1Response communicationSendV1 (CommunicationSendV1Request communicationSendV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = communicationSendV1Request;
    // verify the required parameter 'communicationSendV1Request' is set
    if (communicationSendV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'communicationSendV1Request' when calling communicationSendV1",
        new ApiException(400, "Missing the required parameter 'communicationSendV1Request' when calling communicationSendV1"));
    }

    // create path and map variables
    String path = "/1/object/communication/send";

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
         return (CommunicationSendV1Response) ApiInvoker.deserialize(localVarResponse, "", CommunicationSendV1Response.class);
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
   * Send a new Communication
   * The endpoint allows to send one or many elements at once.
   * @param communicationSendV1Request 
  */
  public void communicationSendV1 (CommunicationSendV1Request communicationSendV1Request, final Response.Listener<CommunicationSendV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = communicationSendV1Request;

    // verify the required parameter 'communicationSendV1Request' is set
    if (communicationSendV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'communicationSendV1Request' when calling communicationSendV1",
        new ApiException(400, "Missing the required parameter 'communicationSendV1Request' when calling communicationSendV1"));
    }

    // create path and map variables
    String path = "/1/object/communication/send".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((CommunicationSendV1Response) ApiInvoker.deserialize(localVarResponse,  "", CommunicationSendV1Response.class));
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
