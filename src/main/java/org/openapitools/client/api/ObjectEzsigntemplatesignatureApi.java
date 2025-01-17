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
import org.openapitools.client.model.EzsigntemplatesignatureCreateObjectV2Request;
import org.openapitools.client.model.EzsigntemplatesignatureCreateObjectV2Response;
import org.openapitools.client.model.EzsigntemplatesignatureDeleteObjectV1Response;
import org.openapitools.client.model.EzsigntemplatesignatureEditObjectV2Request;
import org.openapitools.client.model.EzsigntemplatesignatureEditObjectV2Response;
import org.openapitools.client.model.EzsigntemplatesignatureGetObjectV3Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigntemplatesignatureApi {
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
  * Create a new Ezsigntemplatesignature
  * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatesignatureCreateObjectV2Request 
   * @return EzsigntemplatesignatureCreateObjectV2Response
  */
  public EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2 (EzsigntemplatesignatureCreateObjectV2Request ezsigntemplatesignatureCreateObjectV2Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatesignatureCreateObjectV2Request;
    // verify the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' is set
    if (ezsigntemplatesignatureCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' when calling ezsigntemplatesignatureCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' when calling ezsigntemplatesignatureCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesignature";

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
         return (EzsigntemplatesignatureCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignatureCreateObjectV2Response.class);
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
   * Create a new Ezsigntemplatesignature
   * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatesignatureCreateObjectV2Request 
  */
  public void ezsigntemplatesignatureCreateObjectV2 (EzsigntemplatesignatureCreateObjectV2Request ezsigntemplatesignatureCreateObjectV2Request, final Response.Listener<EzsigntemplatesignatureCreateObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatesignatureCreateObjectV2Request;

    // verify the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' is set
    if (ezsigntemplatesignatureCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' when calling ezsigntemplatesignatureCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignatureCreateObjectV2Request' when calling ezsigntemplatesignatureCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesignature".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsigntemplatesignatureCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignatureCreateObjectV2Response.class));
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
  * Delete an existing Ezsigntemplatesignature
  * 
   * @param pkiEzsigntemplatesignatureID 
   * @return EzsigntemplatesignatureDeleteObjectV1Response
  */
  public EzsigntemplatesignatureDeleteObjectV1Response ezsigntemplatesignatureDeleteObjectV1 (Integer pkiEzsigntemplatesignatureID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
         return (EzsigntemplatesignatureDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignatureDeleteObjectV1Response.class);
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
   * Delete an existing Ezsigntemplatesignature
   * 
   * @param pkiEzsigntemplatesignatureID 
  */
  public void ezsigntemplatesignatureDeleteObjectV1 (Integer pkiEzsigntemplatesignatureID, final Response.Listener<EzsigntemplatesignatureDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignatureDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignatureDeleteObjectV1Response.class));
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
  * Edit an existing Ezsigntemplatesignature
  * 
   * @param pkiEzsigntemplatesignatureID 
   * @param ezsigntemplatesignatureEditObjectV2Request 
   * @return EzsigntemplatesignatureEditObjectV2Response
  */
  public EzsigntemplatesignatureEditObjectV2Response ezsigntemplatesignatureEditObjectV2 (Integer pkiEzsigntemplatesignatureID, EzsigntemplatesignatureEditObjectV2Request ezsigntemplatesignatureEditObjectV2Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatesignatureEditObjectV2Request;
    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureEditObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureEditObjectV2"));
    }
    // verify the required parameter 'ezsigntemplatesignatureEditObjectV2Request' is set
    if (ezsigntemplatesignatureEditObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignatureEditObjectV2Request' when calling ezsigntemplatesignatureEditObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignatureEditObjectV2Request' when calling ezsigntemplatesignatureEditObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
         return (EzsigntemplatesignatureEditObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignatureEditObjectV2Response.class);
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
   * Edit an existing Ezsigntemplatesignature
   * 
   * @param pkiEzsigntemplatesignatureID    * @param ezsigntemplatesignatureEditObjectV2Request 
  */
  public void ezsigntemplatesignatureEditObjectV2 (Integer pkiEzsigntemplatesignatureID, EzsigntemplatesignatureEditObjectV2Request ezsigntemplatesignatureEditObjectV2Request, final Response.Listener<EzsigntemplatesignatureEditObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatesignatureEditObjectV2Request;

    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureEditObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureEditObjectV2"));
    }
    // verify the required parameter 'ezsigntemplatesignatureEditObjectV2Request' is set
    if (ezsigntemplatesignatureEditObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatesignatureEditObjectV2Request' when calling ezsigntemplatesignatureEditObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatesignatureEditObjectV2Request' when calling ezsigntemplatesignatureEditObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignatureEditObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignatureEditObjectV2Response.class));
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
  * Retrieve an existing Ezsigntemplatesignature
  * 
   * @param pkiEzsigntemplatesignatureID 
   * @return EzsigntemplatesignatureGetObjectV3Response
  */
  public EzsigntemplatesignatureGetObjectV3Response ezsigntemplatesignatureGetObjectV3 (Integer pkiEzsigntemplatesignatureID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureGetObjectV3",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureGetObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
         return (EzsigntemplatesignatureGetObjectV3Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatesignatureGetObjectV3Response.class);
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
   * Retrieve an existing Ezsigntemplatesignature
   * 
   * @param pkiEzsigntemplatesignatureID 
  */
  public void ezsigntemplatesignatureGetObjectV3 (Integer pkiEzsigntemplatesignatureID, final Response.Listener<EzsigntemplatesignatureGetObjectV3Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatesignatureID' is set
    if (pkiEzsigntemplatesignatureID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureGetObjectV3",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatesignatureID' when calling ezsigntemplatesignatureGetObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatesignatureID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatesignatureID.toString()));

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
              responseListener.onResponse((EzsigntemplatesignatureGetObjectV3Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatesignatureGetObjectV3Response.class));
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
