/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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

import org.openapitools.client.model.FranchisereferalincomeCreateObjectV1Request;
import org.openapitools.client.model.FranchisereferalincomeCreateObjectV1Response;
import org.openapitools.client.model.FranchisereferalincomeCreateObjectV2Request;
import org.openapitools.client.model.FranchisereferalincomeCreateObjectV2Response;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectFranchisereferalincomeApi {
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
  * Create a new Franchisereferalincome
  * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param franchisereferalincomeCreateObjectV1Request 
   * @return FranchisereferalincomeCreateObjectV1Response
  */
  public FranchisereferalincomeCreateObjectV1Response franchisereferalincomeCreateObjectV1 (List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = franchisereferalincomeCreateObjectV1Request;
    // verify the required parameter 'franchisereferalincomeCreateObjectV1Request' is set
    if (franchisereferalincomeCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'franchisereferalincomeCreateObjectV1Request' when calling franchisereferalincomeCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'franchisereferalincomeCreateObjectV1Request' when calling franchisereferalincomeCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/franchisereferalincome";

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
         return (FranchisereferalincomeCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", FranchisereferalincomeCreateObjectV1Response.class);
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
   * Create a new Franchisereferalincome
   * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param franchisereferalincomeCreateObjectV1Request 
  */
  public void franchisereferalincomeCreateObjectV1 (List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request, final Response.Listener<FranchisereferalincomeCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = franchisereferalincomeCreateObjectV1Request;

    // verify the required parameter 'franchisereferalincomeCreateObjectV1Request' is set
    if (franchisereferalincomeCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'franchisereferalincomeCreateObjectV1Request' when calling franchisereferalincomeCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'franchisereferalincomeCreateObjectV1Request' when calling franchisereferalincomeCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/franchisereferalincome".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((FranchisereferalincomeCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", FranchisereferalincomeCreateObjectV1Response.class));
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
  * Create a new Franchisereferalincome
  * The endpoint allows to create one or many elements at once.
   * @param franchisereferalincomeCreateObjectV2Request 
   * @return FranchisereferalincomeCreateObjectV2Response
  */
  public FranchisereferalincomeCreateObjectV2Response franchisereferalincomeCreateObjectV2 (FranchisereferalincomeCreateObjectV2Request franchisereferalincomeCreateObjectV2Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = franchisereferalincomeCreateObjectV2Request;
    // verify the required parameter 'franchisereferalincomeCreateObjectV2Request' is set
    if (franchisereferalincomeCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'franchisereferalincomeCreateObjectV2Request' when calling franchisereferalincomeCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'franchisereferalincomeCreateObjectV2Request' when calling franchisereferalincomeCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/franchisereferalincome";

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
         return (FranchisereferalincomeCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", FranchisereferalincomeCreateObjectV2Response.class);
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
   * Create a new Franchisereferalincome
   * The endpoint allows to create one or many elements at once.
   * @param franchisereferalincomeCreateObjectV2Request 
  */
  public void franchisereferalincomeCreateObjectV2 (FranchisereferalincomeCreateObjectV2Request franchisereferalincomeCreateObjectV2Request, final Response.Listener<FranchisereferalincomeCreateObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = franchisereferalincomeCreateObjectV2Request;

    // verify the required parameter 'franchisereferalincomeCreateObjectV2Request' is set
    if (franchisereferalincomeCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'franchisereferalincomeCreateObjectV2Request' when calling franchisereferalincomeCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'franchisereferalincomeCreateObjectV2Request' when calling franchisereferalincomeCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/franchisereferalincome".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((FranchisereferalincomeCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", FranchisereferalincomeCreateObjectV2Response.class));
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
