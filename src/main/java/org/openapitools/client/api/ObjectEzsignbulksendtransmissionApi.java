/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
import org.openapitools.client.model.EzsignbulksendtransmissionGetFormsDataV1Response;
import org.openapitools.client.model.EzsignbulksendtransmissionGetObjectV1Response;
import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignbulksendtransmissionApi {
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
  * Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
  * 
   * @param pkiEzsignbulksendtransmissionID 
   * @return String
  */
  public String ezsignbulksendtransmissionGetCsvErrorsV1 (Integer pkiEzsignbulksendtransmissionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetCsvErrorsV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetCsvErrorsV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors".replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
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
   * Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
   * 
   * @param pkiEzsignbulksendtransmissionID 
  */
  public void ezsignbulksendtransmissionGetCsvErrorsV1 (Integer pkiEzsignbulksendtransmissionID, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetCsvErrorsV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetCsvErrorsV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
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
  * Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
  * 
   * @param pkiEzsignbulksendtransmissionID 
   * @return EzsignbulksendtransmissionGetFormsDataV1Response
  */
  public EzsignbulksendtransmissionGetFormsDataV1Response ezsignbulksendtransmissionGetFormsDataV1 (Integer pkiEzsignbulksendtransmissionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetFormsDataV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetFormsDataV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData".replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
         return (EzsignbulksendtransmissionGetFormsDataV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksendtransmissionGetFormsDataV1Response.class);
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
   * Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
   * 
   * @param pkiEzsignbulksendtransmissionID 
  */
  public void ezsignbulksendtransmissionGetFormsDataV1 (Integer pkiEzsignbulksendtransmissionID, final Response.Listener<EzsignbulksendtransmissionGetFormsDataV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetFormsDataV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetFormsDataV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
              responseListener.onResponse((EzsignbulksendtransmissionGetFormsDataV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksendtransmissionGetFormsDataV1Response.class));
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
  * Retrieve an existing Ezsignbulksendtransmission
  * 
   * @param pkiEzsignbulksendtransmissionID 
   * @return EzsignbulksendtransmissionGetObjectV1Response
  */
  public EzsignbulksendtransmissionGetObjectV1Response ezsignbulksendtransmissionGetObjectV1 (Integer pkiEzsignbulksendtransmissionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}".replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
         return (EzsignbulksendtransmissionGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksendtransmissionGetObjectV1Response.class);
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
   * Retrieve an existing Ezsignbulksendtransmission
   * 
   * @param pkiEzsignbulksendtransmissionID 
  */
  public void ezsignbulksendtransmissionGetObjectV1 (Integer pkiEzsignbulksendtransmissionID, final Response.Listener<EzsignbulksendtransmissionGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksendtransmissionID' is set
    if (pkiEzsignbulksendtransmissionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendtransmissionID' when calling ezsignbulksendtransmissionGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksendtransmissionID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendtransmissionID.toString()));

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
              responseListener.onResponse((EzsignbulksendtransmissionGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksendtransmissionGetObjectV1Response.class));
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
