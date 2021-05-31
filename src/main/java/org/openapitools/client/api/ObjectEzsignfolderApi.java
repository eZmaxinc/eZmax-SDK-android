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
import org.openapitools.client.model.EzsignfolderCreateObjectV1Request;
import org.openapitools.client.model.EzsignfolderCreateObjectV1Response;
import org.openapitools.client.model.EzsignfolderDeleteObjectV1Response;
import org.openapitools.client.model.EzsignfolderGetObjectV1Response;
import org.openapitools.client.model.EzsignfolderSendV1Request;
import org.openapitools.client.model.EzsignfolderSendV1Response;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignfolderApi {
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
  * Create a new Ezsignfolder
  * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignfolderCreateObjectV1Request 
   * @return EzsignfolderCreateObjectV1Response
  */
  public EzsignfolderCreateObjectV1Response ezsignfolderCreateObjectV1 (List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfolderCreateObjectV1Request;
    // verify the required parameter 'ezsignfolderCreateObjectV1Request' is set
    if (ezsignfolderCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfolderCreateObjectV1Request' when calling ezsignfolderCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignfolderCreateObjectV1Request' when calling ezsignfolderCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder";

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
         return (EzsignfolderCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfolderCreateObjectV1Response.class);
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
   * Create a new Ezsignfolder
   * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignfolderCreateObjectV1Request 
  */
  public void ezsignfolderCreateObjectV1 (List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request, final Response.Listener<EzsignfolderCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfolderCreateObjectV1Request;

    // verify the required parameter 'ezsignfolderCreateObjectV1Request' is set
    if (ezsignfolderCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfolderCreateObjectV1Request' when calling ezsignfolderCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignfolderCreateObjectV1Request' when calling ezsignfolderCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignfolderCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfolderCreateObjectV1Response.class));
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
  * Delete an existing Ezsignfolder
  * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
   * @return EzsignfolderDeleteObjectV1Response
  */
  public EzsignfolderDeleteObjectV1Response ezsignfolderDeleteObjectV1 (Integer pkiEzsignfolderID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
         return (EzsignfolderDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfolderDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignfolder
   * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
  */
  public void ezsignfolderDeleteObjectV1 (Integer pkiEzsignfolderID, final Response.Listener<EzsignfolderDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
              responseListener.onResponse((EzsignfolderDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfolderDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsignfolder&#39;s children IDs
  * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
   * @return void
  */
  public void ezsignfolderGetChildrenV1 (Integer pkiEzsignfolderID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren".replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
   * Retrieve an existing Ezsignfolder&#39;s children IDs
   * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
  */
  public void ezsignfolderGetChildrenV1 (Integer pkiEzsignfolderID, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetChildrenV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetChildrenV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
  * Retrieve an existing Ezsignfolder
  * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
   * @return EzsignfolderGetObjectV1Response
  */
  public EzsignfolderGetObjectV1Response ezsignfolderGetObjectV1 (Integer pkiEzsignfolderID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
         return (EzsignfolderGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfolderGetObjectV1Response.class);
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
   * Retrieve an existing Ezsignfolder
   * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
  */
  public void ezsignfolderGetObjectV1 (Integer pkiEzsignfolderID, final Response.Listener<EzsignfolderGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
              responseListener.onResponse((EzsignfolderGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfolderGetObjectV1Response.class));
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
  * Send the Ezsignfolder to the signatories for signature
  * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
   * @param ezsignfolderSendV1Request 
   * @return EzsignfolderSendV1Response
  */
  public EzsignfolderSendV1Response ezsignfolderSendV1 (Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfolderSendV1Request;
    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderSendV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderSendV1"));
    }
    // verify the required parameter 'ezsignfolderSendV1Request' is set
    if (ezsignfolderSendV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfolderSendV1Request' when calling ezsignfolderSendV1",
        new ApiException(400, "Missing the required parameter 'ezsignfolderSendV1Request' when calling ezsignfolderSendV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/send".replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
         return (EzsignfolderSendV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfolderSendV1Response.class);
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
   * Send the Ezsignfolder to the signatories for signature
   * 
   * @param pkiEzsignfolderID The unique ID of the Ezsignfolder   * @param ezsignfolderSendV1Request 
  */
  public void ezsignfolderSendV1 (Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request, final Response.Listener<EzsignfolderSendV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfolderSendV1Request;

    // verify the required parameter 'pkiEzsignfolderID' is set
    if (pkiEzsignfolderID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderSendV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderSendV1"));
    }
    // verify the required parameter 'ezsignfolderSendV1Request' is set
    if (ezsignfolderSendV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfolderSendV1Request' when calling ezsignfolderSendV1",
        new ApiException(400, "Missing the required parameter 'ezsignfolderSendV1Request' when calling ezsignfolderSendV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/send".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", apiInvoker.escapeString(pkiEzsignfolderID.toString()));

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
              responseListener.onResponse((EzsignfolderSendV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfolderSendV1Response.class));
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
