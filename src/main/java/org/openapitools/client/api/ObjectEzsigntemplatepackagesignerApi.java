/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
import org.openapitools.client.model.EzsigntemplatepackagesignerCreateObjectV1Request;
import org.openapitools.client.model.EzsigntemplatepackagesignerCreateObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignerDeleteObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignerEditObjectV1Request;
import org.openapitools.client.model.EzsigntemplatepackagesignerEditObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignerGetObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignerGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigntemplatepackagesignerApi {
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
  * Create a new Ezsigntemplatepackagesigner
  * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatepackagesignerCreateObjectV1Request 
   * @return EzsigntemplatepackagesignerCreateObjectV1Response
  */
  public EzsigntemplatepackagesignerCreateObjectV1Response ezsigntemplatepackagesignerCreateObjectV1 (EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatepackagesignerCreateObjectV1Request;
    // verify the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' is set
    if (ezsigntemplatepackagesignerCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' when calling ezsigntemplatepackagesignerCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' when calling ezsigntemplatepackagesignerCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner";

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
         return (EzsigntemplatepackagesignerCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignerCreateObjectV1Response.class);
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
   * Create a new Ezsigntemplatepackagesigner
   * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatepackagesignerCreateObjectV1Request 
  */
  public void ezsigntemplatepackagesignerCreateObjectV1 (EzsigntemplatepackagesignerCreateObjectV1Request ezsigntemplatepackagesignerCreateObjectV1Request, final Response.Listener<EzsigntemplatepackagesignerCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatepackagesignerCreateObjectV1Request;

    // verify the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' is set
    if (ezsigntemplatepackagesignerCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' when calling ezsigntemplatepackagesignerCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignerCreateObjectV1Request' when calling ezsigntemplatepackagesignerCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsigntemplatepackagesignerCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignerCreateObjectV1Response.class));
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
  * Delete an existing Ezsigntemplatepackagesigner
  * 
   * @param pkiEzsigntemplatepackagesignerID 
   * @return EzsigntemplatepackagesignerDeleteObjectV1Response
  */
  public EzsigntemplatepackagesignerDeleteObjectV1Response ezsigntemplatepackagesignerDeleteObjectV1 (Integer pkiEzsigntemplatepackagesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
         return (EzsigntemplatepackagesignerDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignerDeleteObjectV1Response.class);
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
   * Delete an existing Ezsigntemplatepackagesigner
   * 
   * @param pkiEzsigntemplatepackagesignerID 
  */
  public void ezsigntemplatepackagesignerDeleteObjectV1 (Integer pkiEzsigntemplatepackagesignerID, final Response.Listener<EzsigntemplatepackagesignerDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignerDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignerDeleteObjectV1Response.class));
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
  * Edit an existing Ezsigntemplatepackagesigner
  * 
   * @param pkiEzsigntemplatepackagesignerID 
   * @param ezsigntemplatepackagesignerEditObjectV1Request 
   * @return EzsigntemplatepackagesignerEditObjectV1Response
  */
  public EzsigntemplatepackagesignerEditObjectV1Response ezsigntemplatepackagesignerEditObjectV1 (Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatepackagesignerEditObjectV1Request;
    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' is set
    if (ezsigntemplatepackagesignerEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' when calling ezsigntemplatepackagesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' when calling ezsigntemplatepackagesignerEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
         return (EzsigntemplatepackagesignerEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignerEditObjectV1Response.class);
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
   * Edit an existing Ezsigntemplatepackagesigner
   * 
   * @param pkiEzsigntemplatepackagesignerID    * @param ezsigntemplatepackagesignerEditObjectV1Request 
  */
  public void ezsigntemplatepackagesignerEditObjectV1 (Integer pkiEzsigntemplatepackagesignerID, EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request, final Response.Listener<EzsigntemplatepackagesignerEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatepackagesignerEditObjectV1Request;

    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' is set
    if (ezsigntemplatepackagesignerEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' when calling ezsigntemplatepackagesignerEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignerEditObjectV1Request' when calling ezsigntemplatepackagesignerEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignerEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignerEditObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatepackagesigner
  * 
   * @param pkiEzsigntemplatepackagesignerID 
   * @return EzsigntemplatepackagesignerGetObjectV1Response
  */
  public EzsigntemplatepackagesignerGetObjectV1Response ezsigntemplatepackagesignerGetObjectV1 (Integer pkiEzsigntemplatepackagesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
         return (EzsigntemplatepackagesignerGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignerGetObjectV1Response.class);
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
   * Retrieve an existing Ezsigntemplatepackagesigner
   * 
   * @param pkiEzsigntemplatepackagesignerID 
  */
  public void ezsigntemplatepackagesignerGetObjectV1 (Integer pkiEzsigntemplatepackagesignerID, final Response.Listener<EzsigntemplatepackagesignerGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignerGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignerGetObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatepackagesigner
  * 
   * @param pkiEzsigntemplatepackagesignerID 
   * @return EzsigntemplatepackagesignerGetObjectV2Response
  */
  public EzsigntemplatepackagesignerGetObjectV2Response ezsigntemplatepackagesignerGetObjectV2 (Integer pkiEzsigntemplatepackagesignerID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
         return (EzsigntemplatepackagesignerGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignerGetObjectV2Response.class);
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
   * Retrieve an existing Ezsigntemplatepackagesigner
   * 
   * @param pkiEzsigntemplatepackagesignerID 
  */
  public void ezsigntemplatepackagesignerGetObjectV2 (Integer pkiEzsigntemplatepackagesignerID, final Response.Listener<EzsigntemplatepackagesignerGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignerID' is set
    if (pkiEzsigntemplatepackagesignerID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignerID' when calling ezsigntemplatepackagesignerGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignerID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignerID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignerGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignerGetObjectV2Response.class));
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
