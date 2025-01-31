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
import org.openapitools.client.model.CorsCreateObjectV1Request;
import org.openapitools.client.model.CorsCreateObjectV1Response;
import org.openapitools.client.model.CorsDeleteObjectV1Response;
import org.openapitools.client.model.CorsEditObjectV1Request;
import org.openapitools.client.model.CorsEditObjectV1Response;
import org.openapitools.client.model.CorsGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectCorsApi {
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
  * Create a new Cors
  * The endpoint allows to create one or many elements at once.
   * @param corsCreateObjectV1Request 
   * @return CorsCreateObjectV1Response
  */
  public CorsCreateObjectV1Response corsCreateObjectV1 (CorsCreateObjectV1Request corsCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = corsCreateObjectV1Request;
    // verify the required parameter 'corsCreateObjectV1Request' is set
    if (corsCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'corsCreateObjectV1Request' when calling corsCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'corsCreateObjectV1Request' when calling corsCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors";

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
         return (CorsCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", CorsCreateObjectV1Response.class);
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
   * Create a new Cors
   * The endpoint allows to create one or many elements at once.
   * @param corsCreateObjectV1Request 
  */
  public void corsCreateObjectV1 (CorsCreateObjectV1Request corsCreateObjectV1Request, final Response.Listener<CorsCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = corsCreateObjectV1Request;

    // verify the required parameter 'corsCreateObjectV1Request' is set
    if (corsCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'corsCreateObjectV1Request' when calling corsCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'corsCreateObjectV1Request' when calling corsCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((CorsCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", CorsCreateObjectV1Response.class));
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
  * Delete an existing Cors
  * 
   * @param pkiCorsID The unique ID of the Cors
   * @return CorsDeleteObjectV1Response
  */
  public CorsDeleteObjectV1Response corsDeleteObjectV1 (Integer pkiCorsID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors/{pkiCorsID}".replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
         return (CorsDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", CorsDeleteObjectV1Response.class);
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
   * Delete an existing Cors
   * 
   * @param pkiCorsID The unique ID of the Cors
  */
  public void corsDeleteObjectV1 (Integer pkiCorsID, final Response.Listener<CorsDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors/{pkiCorsID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
              responseListener.onResponse((CorsDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", CorsDeleteObjectV1Response.class));
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
  * Edit an existing Cors
  * 
   * @param pkiCorsID The unique ID of the Cors
   * @param corsEditObjectV1Request 
   * @return CorsEditObjectV1Response
  */
  public CorsEditObjectV1Response corsEditObjectV1 (Integer pkiCorsID, CorsEditObjectV1Request corsEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = corsEditObjectV1Request;
    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsEditObjectV1"));
    }
    // verify the required parameter 'corsEditObjectV1Request' is set
    if (corsEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'corsEditObjectV1Request' when calling corsEditObjectV1",
        new ApiException(400, "Missing the required parameter 'corsEditObjectV1Request' when calling corsEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors/{pkiCorsID}".replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
         return (CorsEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", CorsEditObjectV1Response.class);
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
   * Edit an existing Cors
   * 
   * @param pkiCorsID The unique ID of the Cors   * @param corsEditObjectV1Request 
  */
  public void corsEditObjectV1 (Integer pkiCorsID, CorsEditObjectV1Request corsEditObjectV1Request, final Response.Listener<CorsEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = corsEditObjectV1Request;

    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsEditObjectV1"));
    }
    // verify the required parameter 'corsEditObjectV1Request' is set
    if (corsEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'corsEditObjectV1Request' when calling corsEditObjectV1",
        new ApiException(400, "Missing the required parameter 'corsEditObjectV1Request' when calling corsEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/cors/{pkiCorsID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
              responseListener.onResponse((CorsEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", CorsEditObjectV1Response.class));
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
  * Retrieve an existing Cors
  * 
   * @param pkiCorsID The unique ID of the Cors
   * @return CorsGetObjectV2Response
  */
  public CorsGetObjectV2Response corsGetObjectV2 (Integer pkiCorsID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/cors/{pkiCorsID}".replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
         return (CorsGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", CorsGetObjectV2Response.class);
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
   * Retrieve an existing Cors
   * 
   * @param pkiCorsID The unique ID of the Cors
  */
  public void corsGetObjectV2 (Integer pkiCorsID, final Response.Listener<CorsGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiCorsID' is set
    if (pkiCorsID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiCorsID' when calling corsGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiCorsID' when calling corsGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/cors/{pkiCorsID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiCorsID" + "\\}", apiInvoker.escapeString(pkiCorsID.toString()));

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
              responseListener.onResponse((CorsGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", CorsGetObjectV2Response.class));
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
