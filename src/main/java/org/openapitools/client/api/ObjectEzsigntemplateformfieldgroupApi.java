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

import org.openapitools.client.model.CommonResponse;
import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.EzsigntemplateformfieldgroupCreateObjectV1Request;
import org.openapitools.client.model.EzsigntemplateformfieldgroupCreateObjectV1Response;
import org.openapitools.client.model.EzsigntemplateformfieldgroupEditObjectV1Request;
import org.openapitools.client.model.EzsigntemplateformfieldgroupGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigntemplateformfieldgroupApi {
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
  * Create a new Ezsigntemplateformfieldgroup
  * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplateformfieldgroupCreateObjectV1Request 
   * @return EzsigntemplateformfieldgroupCreateObjectV1Response
  */
  public EzsigntemplateformfieldgroupCreateObjectV1Response ezsigntemplateformfieldgroupCreateObjectV1 (EzsigntemplateformfieldgroupCreateObjectV1Request ezsigntemplateformfieldgroupCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplateformfieldgroupCreateObjectV1Request;
    // verify the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' is set
    if (ezsigntemplateformfieldgroupCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' when calling ezsigntemplateformfieldgroupCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' when calling ezsigntemplateformfieldgroupCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup";

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
         return (EzsigntemplateformfieldgroupCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplateformfieldgroupCreateObjectV1Response.class);
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
   * Create a new Ezsigntemplateformfieldgroup
   * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplateformfieldgroupCreateObjectV1Request 
  */
  public void ezsigntemplateformfieldgroupCreateObjectV1 (EzsigntemplateformfieldgroupCreateObjectV1Request ezsigntemplateformfieldgroupCreateObjectV1Request, final Response.Listener<EzsigntemplateformfieldgroupCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplateformfieldgroupCreateObjectV1Request;

    // verify the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' is set
    if (ezsigntemplateformfieldgroupCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' when calling ezsigntemplateformfieldgroupCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplateformfieldgroupCreateObjectV1Request' when calling ezsigntemplateformfieldgroupCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsigntemplateformfieldgroupCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplateformfieldgroupCreateObjectV1Response.class));
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
  * Delete an existing Ezsigntemplateformfieldgroup
  * 
   * @param pkiEzsigntemplateformfieldgroupID 
   * @return CommonResponse
  */
  public CommonResponse ezsigntemplateformfieldgroupDeleteObjectV1 (Integer pkiEzsigntemplateformfieldgroupID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
         return (CommonResponse) ApiInvoker.deserialize(localVarResponse, "", CommonResponse.class);
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
   * Delete an existing Ezsigntemplateformfieldgroup
   * 
   * @param pkiEzsigntemplateformfieldgroupID 
  */
  public void ezsigntemplateformfieldgroupDeleteObjectV1 (Integer pkiEzsigntemplateformfieldgroupID, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
              responseListener.onResponse((CommonResponse) ApiInvoker.deserialize(localVarResponse,  "", CommonResponse.class));
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
  * Edit an existing Ezsigntemplateformfieldgroup
  * 
   * @param pkiEzsigntemplateformfieldgroupID 
   * @param ezsigntemplateformfieldgroupEditObjectV1Request 
   * @return CommonResponse
  */
  public CommonResponse ezsigntemplateformfieldgroupEditObjectV1 (Integer pkiEzsigntemplateformfieldgroupID, EzsigntemplateformfieldgroupEditObjectV1Request ezsigntemplateformfieldgroupEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplateformfieldgroupEditObjectV1Request;
    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' is set
    if (ezsigntemplateformfieldgroupEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' when calling ezsigntemplateformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' when calling ezsigntemplateformfieldgroupEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
         return (CommonResponse) ApiInvoker.deserialize(localVarResponse, "", CommonResponse.class);
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
   * Edit an existing Ezsigntemplateformfieldgroup
   * 
   * @param pkiEzsigntemplateformfieldgroupID    * @param ezsigntemplateformfieldgroupEditObjectV1Request 
  */
  public void ezsigntemplateformfieldgroupEditObjectV1 (Integer pkiEzsigntemplateformfieldgroupID, EzsigntemplateformfieldgroupEditObjectV1Request ezsigntemplateformfieldgroupEditObjectV1Request, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplateformfieldgroupEditObjectV1Request;

    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupEditObjectV1"));
    }
    // verify the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' is set
    if (ezsigntemplateformfieldgroupEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' when calling ezsigntemplateformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplateformfieldgroupEditObjectV1Request' when calling ezsigntemplateformfieldgroupEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
              responseListener.onResponse((CommonResponse) ApiInvoker.deserialize(localVarResponse,  "", CommonResponse.class));
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
  * Retrieve an existing Ezsigntemplateformfieldgroup
  * 
   * @param pkiEzsigntemplateformfieldgroupID 
   * @return EzsigntemplateformfieldgroupGetObjectV2Response
  */
  public EzsigntemplateformfieldgroupGetObjectV2Response ezsigntemplateformfieldgroupGetObjectV2 (Integer pkiEzsigntemplateformfieldgroupID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
         return (EzsigntemplateformfieldgroupGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplateformfieldgroupGetObjectV2Response.class);
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
   * Retrieve an existing Ezsigntemplateformfieldgroup
   * 
   * @param pkiEzsigntemplateformfieldgroupID 
  */
  public void ezsigntemplateformfieldgroupGetObjectV2 (Integer pkiEzsigntemplateformfieldgroupID, final Response.Listener<EzsigntemplateformfieldgroupGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplateformfieldgroupID' is set
    if (pkiEzsigntemplateformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplateformfieldgroupID' when calling ezsigntemplateformfieldgroupGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplateformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplateformfieldgroupID.toString()));

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
              responseListener.onResponse((EzsigntemplateformfieldgroupGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplateformfieldgroupGetObjectV2Response.class));
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
