/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
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
import org.openapitools.client.model.EzsignsignatureCreateObjectV1Request;
import org.openapitools.client.model.EzsignsignatureCreateObjectV1Response;
import org.openapitools.client.model.EzsignsignatureDeleteObjectV1Response;
import org.openapitools.client.model.EzsignsignatureGetObjectV1Response;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignsignatureApi {
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
  * Create a new Ezsignsignature
  * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignsignatureCreateObjectV1Request 
   * @return EzsignsignatureCreateObjectV1Response
  */
  public EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1 (List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignsignatureCreateObjectV1Request;
    // verify the required parameter 'ezsignsignatureCreateObjectV1Request' is set
    if (ezsignsignatureCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsignatureCreateObjectV1Request' when calling ezsignsignatureCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsignatureCreateObjectV1Request' when calling ezsignsignatureCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature";

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
         return (EzsignsignatureCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignatureCreateObjectV1Response.class);
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
   * Create a new Ezsignsignature
   * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignsignatureCreateObjectV1Request 
  */
  public void ezsignsignatureCreateObjectV1 (List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request, final Response.Listener<EzsignsignatureCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignsignatureCreateObjectV1Request;

    // verify the required parameter 'ezsignsignatureCreateObjectV1Request' is set
    if (ezsignsignatureCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsignatureCreateObjectV1Request' when calling ezsignsignatureCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsignatureCreateObjectV1Request' when calling ezsignsignatureCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignsignatureCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignatureCreateObjectV1Response.class));
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
  * Delete an existing Ezsignsignature
  * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
   * @return EzsignsignatureDeleteObjectV1Response
  */
  public EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1 (Integer pkiEzsignsignatureID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
         return (EzsignsignatureDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignatureDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignsignature
   * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
  */
  public void ezsignsignatureDeleteObjectV1 (Integer pkiEzsignsignatureID, final Response.Listener<EzsignsignatureDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
              responseListener.onResponse((EzsignsignatureDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignatureDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsignsignature&#39;s children IDs
  * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
   * @return void
  */
  public void ezsignsignatureGetChildrenV1 (Integer pkiEzsignsignatureID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren".replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
   * Retrieve an existing Ezsignsignature&#39;s children IDs
   * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
  */
  public void ezsignsignatureGetChildrenV1 (Integer pkiEzsignsignatureID, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
  * Retrieve an existing Ezsignsignature
  * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
   * @return EzsignsignatureGetObjectV1Response
  */
  public EzsignsignatureGetObjectV1Response ezsignsignatureGetObjectV1 (Integer pkiEzsignsignatureID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
         return (EzsignsignatureGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignatureGetObjectV1Response.class);
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
   * Retrieve an existing Ezsignsignature
   * 
   * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
  */
  public void ezsignsignatureGetObjectV1 (Integer pkiEzsignsignatureID, final Response.Listener<EzsignsignatureGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsignatureID' is set
    if (pkiEzsignsignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", apiInvoker.escapeString(pkiEzsignsignatureID.toString()));

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
              responseListener.onResponse((EzsignsignatureGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignatureGetObjectV1Response.class));
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
