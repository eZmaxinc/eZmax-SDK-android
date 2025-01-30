/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
import org.openapitools.client.model.EzsignformfieldgroupCreateObjectV1Request;
import org.openapitools.client.model.EzsignformfieldgroupCreateObjectV1Response;
import org.openapitools.client.model.EzsignformfieldgroupDeleteObjectV1Response;
import org.openapitools.client.model.EzsignformfieldgroupEditObjectV1Request;
import org.openapitools.client.model.EzsignformfieldgroupEditObjectV1Response;
import org.openapitools.client.model.EzsignformfieldgroupGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignformfieldgroupApi {
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
  * Create a new Ezsignformfieldgroup
  * The endpoint allows to create one or many elements at once.
   * @param ezsignformfieldgroupCreateObjectV1Request 
   * @return EzsignformfieldgroupCreateObjectV1Response
  */
  public EzsignformfieldgroupCreateObjectV1Response ezsignformfieldgroupCreateObjectV1 (EzsignformfieldgroupCreateObjectV1Request ezsignformfieldgroupCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignformfieldgroupCreateObjectV1Request;
    // verify the required parameter 'ezsignformfieldgroupCreateObjectV1Request' is set
    if (ezsignformfieldgroupCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignformfieldgroupCreateObjectV1Request' when calling ezsignformfieldgroupCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignformfieldgroupCreateObjectV1Request' when calling ezsignformfieldgroupCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup";

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
         return (EzsignformfieldgroupCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignformfieldgroupCreateObjectV1Response.class);
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
   * Create a new Ezsignformfieldgroup
   * The endpoint allows to create one or many elements at once.
   * @param ezsignformfieldgroupCreateObjectV1Request 
  */
  public void ezsignformfieldgroupCreateObjectV1 (EzsignformfieldgroupCreateObjectV1Request ezsignformfieldgroupCreateObjectV1Request, final Response.Listener<EzsignformfieldgroupCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignformfieldgroupCreateObjectV1Request;

    // verify the required parameter 'ezsignformfieldgroupCreateObjectV1Request' is set
    if (ezsignformfieldgroupCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignformfieldgroupCreateObjectV1Request' when calling ezsignformfieldgroupCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignformfieldgroupCreateObjectV1Request' when calling ezsignformfieldgroupCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignformfieldgroupCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignformfieldgroupCreateObjectV1Response.class));
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
  * Delete an existing Ezsignformfieldgroup
  * 
   * @param pkiEzsignformfieldgroupID 
   * @return EzsignformfieldgroupDeleteObjectV1Response
  */
  public EzsignformfieldgroupDeleteObjectV1Response ezsignformfieldgroupDeleteObjectV1 (Integer pkiEzsignformfieldgroupID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
         return (EzsignformfieldgroupDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignformfieldgroupDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignformfieldgroup
   * 
   * @param pkiEzsignformfieldgroupID 
  */
  public void ezsignformfieldgroupDeleteObjectV1 (Integer pkiEzsignformfieldgroupID, final Response.Listener<EzsignformfieldgroupDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
              responseListener.onResponse((EzsignformfieldgroupDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignformfieldgroupDeleteObjectV1Response.class));
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
  * Edit an existing Ezsignformfieldgroup
  * 
   * @param pkiEzsignformfieldgroupID 
   * @param ezsignformfieldgroupEditObjectV1Request 
   * @return EzsignformfieldgroupEditObjectV1Response
  */
  public EzsignformfieldgroupEditObjectV1Response ezsignformfieldgroupEditObjectV1 (Integer pkiEzsignformfieldgroupID, EzsignformfieldgroupEditObjectV1Request ezsignformfieldgroupEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignformfieldgroupEditObjectV1Request;
    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupEditObjectV1"));
    }
    // verify the required parameter 'ezsignformfieldgroupEditObjectV1Request' is set
    if (ezsignformfieldgroupEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignformfieldgroupEditObjectV1Request' when calling ezsignformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignformfieldgroupEditObjectV1Request' when calling ezsignformfieldgroupEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
         return (EzsignformfieldgroupEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignformfieldgroupEditObjectV1Response.class);
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
   * Edit an existing Ezsignformfieldgroup
   * 
   * @param pkiEzsignformfieldgroupID    * @param ezsignformfieldgroupEditObjectV1Request 
  */
  public void ezsignformfieldgroupEditObjectV1 (Integer pkiEzsignformfieldgroupID, EzsignformfieldgroupEditObjectV1Request ezsignformfieldgroupEditObjectV1Request, final Response.Listener<EzsignformfieldgroupEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignformfieldgroupEditObjectV1Request;

    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupEditObjectV1"));
    }
    // verify the required parameter 'ezsignformfieldgroupEditObjectV1Request' is set
    if (ezsignformfieldgroupEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignformfieldgroupEditObjectV1Request' when calling ezsignformfieldgroupEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignformfieldgroupEditObjectV1Request' when calling ezsignformfieldgroupEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
              responseListener.onResponse((EzsignformfieldgroupEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignformfieldgroupEditObjectV1Response.class));
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
  * Retrieve an existing Ezsignformfieldgroup
  * 
   * @param pkiEzsignformfieldgroupID 
   * @return EzsignformfieldgroupGetObjectV2Response
  */
  public EzsignformfieldgroupGetObjectV2Response ezsignformfieldgroupGetObjectV2 (Integer pkiEzsignformfieldgroupID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
         return (EzsignformfieldgroupGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignformfieldgroupGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignformfieldgroup
   * 
   * @param pkiEzsignformfieldgroupID 
  */
  public void ezsignformfieldgroupGetObjectV2 (Integer pkiEzsignformfieldgroupID, final Response.Listener<EzsignformfieldgroupGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignformfieldgroupID' is set
    if (pkiEzsignformfieldgroupID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignformfieldgroupID' when calling ezsignformfieldgroupGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignformfieldgroupID" + "\\}", apiInvoker.escapeString(pkiEzsignformfieldgroupID.toString()));

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
              responseListener.onResponse((EzsignformfieldgroupGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignformfieldgroupGetObjectV2Response.class));
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
