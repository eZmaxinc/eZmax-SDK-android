/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
import org.openapitools.client.model.EzsignbulksendsignermappingCreateObjectV1Request;
import org.openapitools.client.model.EzsignbulksendsignermappingCreateObjectV1Response;
import org.openapitools.client.model.EzsignbulksendsignermappingDeleteObjectV1Response;
import org.openapitools.client.model.EzsignbulksendsignermappingGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignbulksendsignermappingApi {
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
  * Create a new Ezsignbulksendsignermapping
  * The endpoint allows to create one or many elements at once.
   * @param ezsignbulksendsignermappingCreateObjectV1Request 
   * @return EzsignbulksendsignermappingCreateObjectV1Response
  */
  public EzsignbulksendsignermappingCreateObjectV1Response ezsignbulksendsignermappingCreateObjectV1 (EzsignbulksendsignermappingCreateObjectV1Request ezsignbulksendsignermappingCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignbulksendsignermappingCreateObjectV1Request;
    // verify the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' is set
    if (ezsignbulksendsignermappingCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' when calling ezsignbulksendsignermappingCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' when calling ezsignbulksendsignermappingCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendsignermapping";

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
         return (EzsignbulksendsignermappingCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksendsignermappingCreateObjectV1Response.class);
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
   * Create a new Ezsignbulksendsignermapping
   * The endpoint allows to create one or many elements at once.
   * @param ezsignbulksendsignermappingCreateObjectV1Request 
  */
  public void ezsignbulksendsignermappingCreateObjectV1 (EzsignbulksendsignermappingCreateObjectV1Request ezsignbulksendsignermappingCreateObjectV1Request, final Response.Listener<EzsignbulksendsignermappingCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignbulksendsignermappingCreateObjectV1Request;

    // verify the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' is set
    if (ezsignbulksendsignermappingCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' when calling ezsignbulksendsignermappingCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignbulksendsignermappingCreateObjectV1Request' when calling ezsignbulksendsignermappingCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendsignermapping".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignbulksendsignermappingCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksendsignermappingCreateObjectV1Response.class));
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
  * Delete an existing Ezsignbulksendsignermapping
  * 
   * @param pkiEzsignbulksendsignermappingID 
   * @return EzsignbulksendsignermappingDeleteObjectV1Response
  */
  public EzsignbulksendsignermappingDeleteObjectV1Response ezsignbulksendsignermappingDeleteObjectV1 (Integer pkiEzsignbulksendsignermappingID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksendsignermappingID' is set
    if (pkiEzsignbulksendsignermappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replaceAll("\\{" + "pkiEzsignbulksendsignermappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendsignermappingID.toString()));

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
         return (EzsignbulksendsignermappingDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksendsignermappingDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignbulksendsignermapping
   * 
   * @param pkiEzsignbulksendsignermappingID 
  */
  public void ezsignbulksendsignermappingDeleteObjectV1 (Integer pkiEzsignbulksendsignermappingID, final Response.Listener<EzsignbulksendsignermappingDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksendsignermappingID' is set
    if (pkiEzsignbulksendsignermappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksendsignermappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendsignermappingID.toString()));

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
              responseListener.onResponse((EzsignbulksendsignermappingDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksendsignermappingDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsignbulksendsignermapping
  * 
   * @param pkiEzsignbulksendsignermappingID 
   * @return EzsignbulksendsignermappingGetObjectV2Response
  */
  public EzsignbulksendsignermappingGetObjectV2Response ezsignbulksendsignermappingGetObjectV2 (Integer pkiEzsignbulksendsignermappingID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignbulksendsignermappingID' is set
    if (pkiEzsignbulksendsignermappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replaceAll("\\{" + "pkiEzsignbulksendsignermappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendsignermappingID.toString()));

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
         return (EzsignbulksendsignermappingGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignbulksendsignermappingGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignbulksendsignermapping
   * 
   * @param pkiEzsignbulksendsignermappingID 
  */
  public void ezsignbulksendsignermappingGetObjectV2 (Integer pkiEzsignbulksendsignermappingID, final Response.Listener<EzsignbulksendsignermappingGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignbulksendsignermappingID' is set
    if (pkiEzsignbulksendsignermappingID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignbulksendsignermappingID' when calling ezsignbulksendsignermappingGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignbulksendsignermappingID" + "\\}", apiInvoker.escapeString(pkiEzsignbulksendsignermappingID.toString()));

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
              responseListener.onResponse((EzsignbulksendsignermappingGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignbulksendsignermappingGetObjectV2Response.class));
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
