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
import org.openapitools.client.model.EzsignsignergroupmembershipCreateObjectV1Request;
import org.openapitools.client.model.EzsignsignergroupmembershipCreateObjectV1Response;
import org.openapitools.client.model.EzsignsignergroupmembershipDeleteObjectV1Response;
import org.openapitools.client.model.EzsignsignergroupmembershipGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignsignergroupmembershipApi {
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
  * Create a new Ezsignsignergroupmembership
  * The endpoint allows to create one or many elements at once.
   * @param ezsignsignergroupmembershipCreateObjectV1Request 
   * @return EzsignsignergroupmembershipCreateObjectV1Response
  */
  public EzsignsignergroupmembershipCreateObjectV1Response ezsignsignergroupmembershipCreateObjectV1 (EzsignsignergroupmembershipCreateObjectV1Request ezsignsignergroupmembershipCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignsignergroupmembershipCreateObjectV1Request;
    // verify the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' is set
    if (ezsignsignergroupmembershipCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' when calling ezsignsignergroupmembershipCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' when calling ezsignsignergroupmembershipCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignergroupmembership";

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
         return (EzsignsignergroupmembershipCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignergroupmembershipCreateObjectV1Response.class);
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
   * Create a new Ezsignsignergroupmembership
   * The endpoint allows to create one or many elements at once.
   * @param ezsignsignergroupmembershipCreateObjectV1Request 
  */
  public void ezsignsignergroupmembershipCreateObjectV1 (EzsignsignergroupmembershipCreateObjectV1Request ezsignsignergroupmembershipCreateObjectV1Request, final Response.Listener<EzsignsignergroupmembershipCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignsignergroupmembershipCreateObjectV1Request;

    // verify the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' is set
    if (ezsignsignergroupmembershipCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' when calling ezsignsignergroupmembershipCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsignergroupmembershipCreateObjectV1Request' when calling ezsignsignergroupmembershipCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignergroupmembership".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignsignergroupmembershipCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignergroupmembershipCreateObjectV1Response.class));
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
  * Delete an existing Ezsignsignergroupmembership
  * 
   * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
   * @return EzsignsignergroupmembershipDeleteObjectV1Response
  */
  public EzsignsignergroupmembershipDeleteObjectV1Response ezsignsignergroupmembershipDeleteObjectV1 (Integer pkiEzsignsignergroupmembershipID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsignergroupmembershipID' is set
    if (pkiEzsignsignergroupmembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replaceAll("\\{" + "pkiEzsignsignergroupmembershipID" + "\\}", apiInvoker.escapeString(pkiEzsignsignergroupmembershipID.toString()));

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
         return (EzsignsignergroupmembershipDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignergroupmembershipDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignsignergroupmembership
   * 
   * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
  */
  public void ezsignsignergroupmembershipDeleteObjectV1 (Integer pkiEzsignsignergroupmembershipID, final Response.Listener<EzsignsignergroupmembershipDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsignergroupmembershipID' is set
    if (pkiEzsignsignergroupmembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsignergroupmembershipID" + "\\}", apiInvoker.escapeString(pkiEzsignsignergroupmembershipID.toString()));

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
              responseListener.onResponse((EzsignsignergroupmembershipDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignergroupmembershipDeleteObjectV1Response.class));
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
  * Retrieve an existing Ezsignsignergroupmembership
  * 
   * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
   * @return EzsignsignergroupmembershipGetObjectV2Response
  */
  public EzsignsignergroupmembershipGetObjectV2Response ezsignsignergroupmembershipGetObjectV2 (Integer pkiEzsignsignergroupmembershipID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsignergroupmembershipID' is set
    if (pkiEzsignsignergroupmembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replaceAll("\\{" + "pkiEzsignsignergroupmembershipID" + "\\}", apiInvoker.escapeString(pkiEzsignsignergroupmembershipID.toString()));

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
         return (EzsignsignergroupmembershipGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsignergroupmembershipGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignsignergroupmembership
   * 
   * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
  */
  public void ezsignsignergroupmembershipGetObjectV2 (Integer pkiEzsignsignergroupmembershipID, final Response.Listener<EzsignsignergroupmembershipGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsignergroupmembershipID' is set
    if (pkiEzsignsignergroupmembershipID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsignergroupmembershipID' when calling ezsignsignergroupmembershipGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsignergroupmembershipID" + "\\}", apiInvoker.escapeString(pkiEzsignsignergroupmembershipID.toString()));

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
              responseListener.onResponse((EzsignsignergroupmembershipGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsignergroupmembershipGetObjectV2Response.class));
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
