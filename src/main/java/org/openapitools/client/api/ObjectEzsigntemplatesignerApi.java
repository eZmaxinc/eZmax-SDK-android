/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
import org.openapitools.client.model.EzsigntemplatesignerCreateObjectV1Request;
import org.openapitools.client.model.EzsigntemplatesignerCreateObjectV1Response;
import org.openapitools.client.model.EzsigntemplatesignerDeleteObjectV1Response;
import org.openapitools.client.model.EzsigntemplatesignerEditObjectV1Request;
import org.openapitools.client.model.EzsigntemplatesignerEditObjectV1Response;
import org.openapitools.client.model.EzsigntemplatesignerGetObjectV1Response;
import org.openapitools.client.model.EzsigntemplatesignerGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigntemplatesignerApi {
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
  * Create a new Ezsigntemplatesigner
  * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatesignerCreateObjectV1Request 
   * @return EzsigntemplatesignerCreateObjectV1Response
  */
  public EzsigntemplatesignerCreateObjectV1Response ezsigntemplatesignerCreateObjectV1 (EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatesignerCreateObjectV1Request;
    // verify the required parameter 'ezsigntemplatesignerCreateObjectV1Request' is set
    if (ezsigntemplatesignerCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignerCreateObjectV1Request' when calling ezsigntemplatesignerCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignerCreateObjectV1Request' when calling ezsigntemplatesignerCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner";

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
         return (EzsigntemplatesignerCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignerCreateObjectV1Response.class);
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
   * Create a new Ezsigntemplatesigner
   * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatesignerCreateObjectV1Request 
  */
  public void ezsigntemplatesignerCreateObjectV1 (EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request, final Response.Listener<EzsigntemplatesignerCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatesignerCreateObjectV1Request;

    // verify the required parameter 'ezsigntemplatesignerCreateObjectV1Request' is set
    if (ezsigntemplatesignerCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignerCreateObjectV1Request' when calling ezsigntemplatesignerCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignerCreateObjectV1Request' when calling ezsigntemplatesignerCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsigntemplatesignerCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignerCreateObjectV1Response.class));
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
  * Delete an existing Ezsigntemplatesigner
  * 
   * @param pkiEzsigntemplatesignerID 
   * @return EzsigntemplatesignerDeleteObjectV1Response
  */
  public EzsigntemplatesignerDeleteObjectV1Response ezsigntemplatesignerDeleteObjectV1 (Integer pkiEzsigntemplatesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
         return (EzsigntemplatesignerDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignerDeleteObjectV1Response.class);
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
   * Delete an existing Ezsigntemplatesigner
   * 
   * @param pkiEzsigntemplatesignerID 
  */
  public void ezsigntemplatesignerDeleteObjectV1 (Integer pkiEzsigntemplatesignerID, final Response.Listener<EzsigntemplatesignerDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignerDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignerDeleteObjectV1Response.class));
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
  * Edit an existing Ezsigntemplatesigner
  * 
   * @param pkiEzsigntemplatesignerID 
   * @param ezsigntemplatesignerEditObjectV1Request 
   * @return EzsigntemplatesignerEditObjectV1Response
  */
  public EzsigntemplatesignerEditObjectV1Response ezsigntemplatesignerEditObjectV1 (Integer pkiEzsigntemplatesignerID, EzsigntemplatesignerEditObjectV1Request ezsigntemplatesignerEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatesignerEditObjectV1Request;
    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplatesignerEditObjectV1Request' is set
    if (ezsigntemplatesignerEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignerEditObjectV1Request' when calling ezsigntemplatesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignerEditObjectV1Request' when calling ezsigntemplatesignerEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EzsigntemplatesignerEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignerEditObjectV1Response.class);
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
   * Edit an existing Ezsigntemplatesigner
   * 
   * @param pkiEzsigntemplatesignerID    * @param ezsigntemplatesignerEditObjectV1Request 
  */
  public void ezsigntemplatesignerEditObjectV1 (Integer pkiEzsigntemplatesignerID, EzsigntemplatesignerEditObjectV1Request ezsigntemplatesignerEditObjectV1Request, final Response.Listener<EzsigntemplatesignerEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatesignerEditObjectV1Request;

    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplatesignerEditObjectV1Request' is set
    if (ezsigntemplatesignerEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignerEditObjectV1Request' when calling ezsigntemplatesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignerEditObjectV1Request' when calling ezsigntemplatesignerEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EzsigntemplatesignerEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignerEditObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatesigner
  * 
   * @param pkiEzsigntemplatesignerID 
   * @return EzsigntemplatesignerGetObjectV1Response
  */
  public EzsigntemplatesignerGetObjectV1Response ezsigntemplatesignerGetObjectV1 (Integer pkiEzsigntemplatesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
         return (EzsigntemplatesignerGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignerGetObjectV1Response.class);
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
   * Retrieve an existing Ezsigntemplatesigner
   * 
   * @param pkiEzsigntemplatesignerID 
  */
  public void ezsigntemplatesignerGetObjectV1 (Integer pkiEzsigntemplatesignerID, final Response.Listener<EzsigntemplatesignerGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignerGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignerGetObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatesigner
  * 
   * @param pkiEzsigntemplatesignerID 
   * @return EzsigntemplatesignerGetObjectV2Response
  */
  public EzsigntemplatesignerGetObjectV2Response ezsigntemplatesignerGetObjectV2 (Integer pkiEzsigntemplatesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
         return (EzsigntemplatesignerGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignerGetObjectV2Response.class);
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
   * Retrieve an existing Ezsigntemplatesigner
   * 
   * @param pkiEzsigntemplatesignerID 
  */
  public void ezsigntemplatesignerGetObjectV2 (Integer pkiEzsigntemplatesignerID, final Response.Listener<EzsigntemplatesignerGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatesignerID' is set
    if (pkiEzsigntemplatesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignerID' when calling ezsigntemplatesignerGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignerGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignerGetObjectV2Response.class));
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
