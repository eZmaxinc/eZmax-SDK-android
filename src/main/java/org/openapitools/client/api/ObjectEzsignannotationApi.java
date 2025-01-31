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

import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.EzsignannotationCreateObjectV1Request;
import org.openapitools.client.model.EzsignannotationCreateObjectV1Response;
import org.openapitools.client.model.EzsignannotationDeleteObjectV1Response;
import org.openapitools.client.model.EzsignannotationEditObjectV1Request;
import org.openapitools.client.model.EzsignannotationEditObjectV1Response;
import org.openapitools.client.model.EzsignannotationGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignannotationApi {
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
  * Create a new Ezsignannotation
  * The endpoint allows to create one or many elements at once.
   * @param ezsignannotationCreateObjectV1Request 
   * @return EzsignannotationCreateObjectV1Response
  */
  public EzsignannotationCreateObjectV1Response ezsignannotationCreateObjectV1 (EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignannotationCreateObjectV1Request;
    // verify the required parameter 'ezsignannotationCreateObjectV1Request' is set
    if (ezsignannotationCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignannotationCreateObjectV1Request' when calling ezsignannotationCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignannotationCreateObjectV1Request' when calling ezsignannotationCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation";

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
         return (EzsignannotationCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignannotationCreateObjectV1Response.class);
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
   * Create a new Ezsignannotation
   * The endpoint allows to create one or many elements at once.
   * @param ezsignannotationCreateObjectV1Request 
  */
  public void ezsignannotationCreateObjectV1 (EzsignannotationCreateObjectV1Request ezsignannotationCreateObjectV1Request, final Response.Listener<EzsignannotationCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignannotationCreateObjectV1Request;

    // verify the required parameter 'ezsignannotationCreateObjectV1Request' is set
    if (ezsignannotationCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignannotationCreateObjectV1Request' when calling ezsignannotationCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignannotationCreateObjectV1Request' when calling ezsignannotationCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignannotationCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignannotationCreateObjectV1Response.class));
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
  * Delete an existing Ezsignannotation
  * 
   * @param pkiEzsignannotationID 
   * @return EzsignannotationDeleteObjectV1Response
  */
  public EzsignannotationDeleteObjectV1Response ezsignannotationDeleteObjectV1 (Integer pkiEzsignannotationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
         return (EzsignannotationDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignannotationDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignannotation
   * 
   * @param pkiEzsignannotationID 
  */
  public void ezsignannotationDeleteObjectV1 (Integer pkiEzsignannotationID, final Response.Listener<EzsignannotationDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
              responseListener.onResponse((EzsignannotationDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignannotationDeleteObjectV1Response.class));
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
  * Edit an existing Ezsignannotation
  * 
   * @param pkiEzsignannotationID 
   * @param ezsignannotationEditObjectV1Request 
   * @return EzsignannotationEditObjectV1Response
  */
  public EzsignannotationEditObjectV1Response ezsignannotationEditObjectV1 (Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignannotationEditObjectV1Request;
    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationEditObjectV1"));
    }
    // verify the required parameter 'ezsignannotationEditObjectV1Request' is set
    if (ezsignannotationEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignannotationEditObjectV1Request' when calling ezsignannotationEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignannotationEditObjectV1Request' when calling ezsignannotationEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
         return (EzsignannotationEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignannotationEditObjectV1Response.class);
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
   * Edit an existing Ezsignannotation
   * 
   * @param pkiEzsignannotationID    * @param ezsignannotationEditObjectV1Request 
  */
  public void ezsignannotationEditObjectV1 (Integer pkiEzsignannotationID, EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request, final Response.Listener<EzsignannotationEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignannotationEditObjectV1Request;

    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationEditObjectV1"));
    }
    // verify the required parameter 'ezsignannotationEditObjectV1Request' is set
    if (ezsignannotationEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignannotationEditObjectV1Request' when calling ezsignannotationEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignannotationEditObjectV1Request' when calling ezsignannotationEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
              responseListener.onResponse((EzsignannotationEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignannotationEditObjectV1Response.class));
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
  * Retrieve an existing Ezsignannotation
  * 
   * @param pkiEzsignannotationID 
   * @return EzsignannotationGetObjectV2Response
  */
  public EzsignannotationGetObjectV2Response ezsignannotationGetObjectV2 (Integer pkiEzsignannotationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
         return (EzsignannotationGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignannotationGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignannotation
   * 
   * @param pkiEzsignannotationID 
  */
  public void ezsignannotationGetObjectV2 (Integer pkiEzsignannotationID, final Response.Listener<EzsignannotationGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignannotationID' is set
    if (pkiEzsignannotationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignannotationID' when calling ezsignannotationGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignannotation/{pkiEzsignannotationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignannotationID" + "\\}", apiInvoker.escapeString(pkiEzsignannotationID.toString()));

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
              responseListener.onResponse((EzsignannotationGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignannotationGetObjectV2Response.class));
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
