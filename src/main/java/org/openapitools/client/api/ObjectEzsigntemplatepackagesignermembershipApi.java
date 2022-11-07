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
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipCreateObjectV1Request;
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipCreateObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipDeleteObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipGetObjectV1Response;
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsigntemplatepackagesignermembershipApi {
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
  * Create a new Ezsigntemplatepackagesignermembership
  * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatepackagesignermembershipCreateObjectV1Request 
   * @return EzsigntemplatepackagesignermembershipCreateObjectV1Response
  */
  public EzsigntemplatepackagesignermembershipCreateObjectV1Response ezsigntemplatepackagesignermembershipCreateObjectV1 (EzsigntemplatepackagesignermembershipCreateObjectV1Request ezsigntemplatepackagesignermembershipCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsigntemplatepackagesignermembershipCreateObjectV1Request;
    // verify the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' is set
    if (ezsigntemplatepackagesignermembershipCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' when calling ezsigntemplatepackagesignermembershipCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' when calling ezsigntemplatepackagesignermembershipCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership";

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
         return (EzsigntemplatepackagesignermembershipCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignermembershipCreateObjectV1Response.class);
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
   * Create a new Ezsigntemplatepackagesignermembership
   * The endpoint allows to create one or many elements at once.
   * @param ezsigntemplatepackagesignermembershipCreateObjectV1Request 
  */
  public void ezsigntemplatepackagesignermembershipCreateObjectV1 (EzsigntemplatepackagesignermembershipCreateObjectV1Request ezsigntemplatepackagesignermembershipCreateObjectV1Request, final Response.Listener<EzsigntemplatepackagesignermembershipCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsigntemplatepackagesignermembershipCreateObjectV1Request;

    // verify the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' is set
    if (ezsigntemplatepackagesignermembershipCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' when calling ezsigntemplatepackagesignermembershipCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsigntemplatepackagesignermembershipCreateObjectV1Request' when calling ezsigntemplatepackagesignermembershipCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsigntemplatepackagesignermembershipCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignermembershipCreateObjectV1Response.class));
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
  * Delete an existing Ezsigntemplatepackagesignermembership
  * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
   * @return EzsigntemplatepackagesignermembershipDeleteObjectV1Response
  */
  public EzsigntemplatepackagesignermembershipDeleteObjectV1Response ezsigntemplatepackagesignermembershipDeleteObjectV1 (Integer pkiEzsigntemplatepackagesignermembershipID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
         return (EzsigntemplatepackagesignermembershipDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignermembershipDeleteObjectV1Response.class);
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
   * Delete an existing Ezsigntemplatepackagesignermembership
   * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
  */
  public void ezsigntemplatepackagesignermembershipDeleteObjectV1 (Integer pkiEzsigntemplatepackagesignermembershipID, final Response.Listener<EzsigntemplatepackagesignermembershipDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignermembershipDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignermembershipDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatepackagesignermembership
  * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
   * @return EzsigntemplatepackagesignermembershipGetObjectV1Response
  */
  public EzsigntemplatepackagesignermembershipGetObjectV1Response ezsigntemplatepackagesignermembershipGetObjectV1 (Integer pkiEzsigntemplatepackagesignermembershipID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
         return (EzsigntemplatepackagesignermembershipGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignermembershipGetObjectV1Response.class);
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
   * Retrieve an existing Ezsigntemplatepackagesignermembership
   * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
  */
  public void ezsigntemplatepackagesignermembershipGetObjectV1 (Integer pkiEzsigntemplatepackagesignermembershipID, final Response.Listener<EzsigntemplatepackagesignermembershipGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignermembershipGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignermembershipGetObjectV1Response.class));
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
  * Retrieve an existing Ezsigntemplatepackagesignermembership
  * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
   * @return EzsigntemplatepackagesignermembershipGetObjectV2Response
  */
  public EzsigntemplatepackagesignermembershipGetObjectV2Response ezsigntemplatepackagesignermembershipGetObjectV2 (Integer pkiEzsigntemplatepackagesignermembershipID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
         return (EzsigntemplatepackagesignermembershipGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsigntemplatepackagesignermembershipGetObjectV2Response.class);
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
   * Retrieve an existing Ezsigntemplatepackagesignermembership
   * 
   * @param pkiEzsigntemplatepackagesignermembershipID 
  */
  public void ezsigntemplatepackagesignermembershipGetObjectV2 (Integer pkiEzsigntemplatepackagesignermembershipID, final Response.Listener<EzsigntemplatepackagesignermembershipGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsigntemplatepackagesignermembershipID' is set
    if (pkiEzsigntemplatepackagesignermembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsigntemplatepackagesignermembershipID' when calling ezsigntemplatepackagesignermembershipGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsigntemplatepackagesignermembershipID" + "\\}", apiInvoker.escapeString(pkiEzsigntemplatepackagesignermembershipID.toString()));

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
              responseListener.onResponse((EzsigntemplatepackagesignermembershipGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsigntemplatepackagesignermembershipGetObjectV2Response.class));
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
