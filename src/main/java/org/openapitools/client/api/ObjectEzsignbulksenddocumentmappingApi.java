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
import org.openapitools.client.model.EzsignbulksenddocumentmappingCreateObjectV1Request;
import org.openapitools.client.model.EzsignbulksenddocumentmappingCreateObjectV1Response;
import org.openapitools.client.model.EzsignbulksenddocumentmappingDeleteObjectV1Response;
import org.openapitools.client.model.EzsignbulksenddocumentmappingGetObjectV1Response;
import org.openapitools.client.model.EzsignbulksenddocumentmappingGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignbulksenddocumentmappingApi {
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
  * Create a new Ezsignbulksenddocumentmapping
  * The endpoint allows to create one or many elements at once.
   * @param ezsignbulksenddocumentmappingCreateObjectV1Request 
   * @return EzsignbulksenddocumentmappingCreateObjectV1Response
  */
  public EzsignbulksenddocumentmappingCreateObjectV1Response ezsignbulksenddocumentmappingCreateObjectV1 (EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignbulksenddocumentmappingCreateObjectV1Request;
    // verify the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' is set
    if (ezsignbulksenddocumentmappingCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' when calling ezsignbulksenddocumentmappingCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' when calling ezsignbulksenddocumentmappingCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping";

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
         return (EzsignbulksenddocumentmappingCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksenddocumentmappingCreateObjectV1Response.class);
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
   * Create a new Ezsignbulksenddocumentmapping
   * The endpoint allows to create one or many elements at once.
   * @param ezsignbulksenddocumentmappingCreateObjectV1Request 
  */
  public void ezsignbulksenddocumentmappingCreateObjectV1 (EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request, final Response.Listener<EzsignbulksenddocumentmappingCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignbulksenddocumentmappingCreateObjectV1Request;

    // verify the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' is set
    if (ezsignbulksenddocumentmappingCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' when calling ezsignbulksenddocumentmappingCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignbulksenddocumentmappingCreateObjectV1Request' when calling ezsignbulksenddocumentmappingCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignbulksenddocumentmappingCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksenddocumentmappingCreateObjectV1Response.class));
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
  * Delete an existing Ezsignbulksenddocumentmapping
  * 
   * @param pkiEzsignbulksenddocumentmappingID 
   * @return EzsignbulksenddocumentmappingDeleteObjectV1Response
  */
  public EzsignbulksenddocumentmappingDeleteObjectV1Response ezsignbulksenddocumentmappingDeleteObjectV1 (Integer pkiEzsignbulksenddocumentmappingID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
         return (EzsignbulksenddocumentmappingDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksenddocumentmappingDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignbulksenddocumentmapping
   * 
   * @param pkiEzsignbulksenddocumentmappingID 
  */
  public void ezsignbulksenddocumentmappingDeleteObjectV1 (Integer pkiEzsignbulksenddocumentmappingID, final Response.Listener<EzsignbulksenddocumentmappingDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
              responseListener.onResponse((EzsignbulksenddocumentmappingDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksenddocumentmappingDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsignbulksenddocumentmapping
  * 
   * @param pkiEzsignbulksenddocumentmappingID 
   * @return EzsignbulksenddocumentmappingGetObjectV1Response
  */
  public EzsignbulksenddocumentmappingGetObjectV1Response ezsignbulksenddocumentmappingGetObjectV1 (Integer pkiEzsignbulksenddocumentmappingID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
         return (EzsignbulksenddocumentmappingGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksenddocumentmappingGetObjectV1Response.class);
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
   * Retrieve an existing Ezsignbulksenddocumentmapping
   * 
   * @param pkiEzsignbulksenddocumentmappingID 
  */
  public void ezsignbulksenddocumentmappingGetObjectV1 (Integer pkiEzsignbulksenddocumentmappingID, final Response.Listener<EzsignbulksenddocumentmappingGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
              responseListener.onResponse((EzsignbulksenddocumentmappingGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksenddocumentmappingGetObjectV1Response.class));
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
  * Retrieve an existing Ezsignbulksenddocumentmapping
  * 
   * @param pkiEzsignbulksenddocumentmappingID 
   * @return EzsignbulksenddocumentmappingGetObjectV2Response
  */
  public EzsignbulksenddocumentmappingGetObjectV2Response ezsignbulksenddocumentmappingGetObjectV2 (Integer pkiEzsignbulksenddocumentmappingID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
         return (EzsignbulksenddocumentmappingGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksenddocumentmappingGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignbulksenddocumentmapping
   * 
   * @param pkiEzsignbulksenddocumentmappingID 
  */
  public void ezsignbulksenddocumentmappingGetObjectV2 (Integer pkiEzsignbulksenddocumentmappingID, final Response.Listener<EzsignbulksenddocumentmappingGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksenddocumentmappingID' is set
    if (pkiEzsignbulksenddocumentmappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksenddocumentmappingID' when calling ezsignbulksenddocumentmappingGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksenddocumentmappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksenddocumentmappingID.toString()));

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
              responseListener.onResponse((EzsignbulksenddocumentmappingGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksenddocumentmappingGetObjectV2Response.class));
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
