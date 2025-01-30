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
import org.openapitools.client.model.TranqcontractGetCommunicationCountV1Response;
import org.openapitools.client.model.TranqcontractGetCommunicationListV1Response;
import org.openapitools.client.model.TranqcontractGetCommunicationrecipientsV1Response;
import org.openapitools.client.model.TranqcontractGetCommunicationsendersV1Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectTranqcontractApi {
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
  * Retrieve Communication count
  * 
   * @param pkiTranqcontractID 
   * @return TranqcontractGetCommunicationCountV1Response
  */
  public TranqcontractGetCommunicationCountV1Response tranqcontractGetCommunicationCountV1 (Integer pkiTranqcontractID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount".replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
         return (TranqcontractGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse, "", TranqcontractGetCommunicationCountV1Response.class);
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
   * Retrieve Communication count
   * 
   * @param pkiTranqcontractID 
  */
  public void tranqcontractGetCommunicationCountV1 (Integer pkiTranqcontractID, final Response.Listener<TranqcontractGetCommunicationCountV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
              responseListener.onResponse((TranqcontractGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse,  "", TranqcontractGetCommunicationCountV1Response.class));
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
  * Retrieve Communication list
  * 
   * @param pkiTranqcontractID 
   * @return TranqcontractGetCommunicationListV1Response
  */
  public TranqcontractGetCommunicationListV1Response tranqcontractGetCommunicationListV1 (Integer pkiTranqcontractID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList".replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
         return (TranqcontractGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse, "", TranqcontractGetCommunicationListV1Response.class);
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
   * Retrieve Communication list
   * 
   * @param pkiTranqcontractID 
  */
  public void tranqcontractGetCommunicationListV1 (Integer pkiTranqcontractID, final Response.Listener<TranqcontractGetCommunicationListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
              responseListener.onResponse((TranqcontractGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse,  "", TranqcontractGetCommunicationListV1Response.class));
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
  * Retrieve Tranqcontract&#39;s Communicationrecipient
  * 
   * @param pkiTranqcontractID 
   * @return TranqcontractGetCommunicationrecipientsV1Response
  */
  public TranqcontractGetCommunicationrecipientsV1Response tranqcontractGetCommunicationrecipientsV1 (Integer pkiTranqcontractID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients".replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
         return (TranqcontractGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse, "", TranqcontractGetCommunicationrecipientsV1Response.class);
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
   * Retrieve Tranqcontract&#39;s Communicationrecipient
   * 
   * @param pkiTranqcontractID 
  */
  public void tranqcontractGetCommunicationrecipientsV1 (Integer pkiTranqcontractID, final Response.Listener<TranqcontractGetCommunicationrecipientsV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
              responseListener.onResponse((TranqcontractGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse,  "", TranqcontractGetCommunicationrecipientsV1Response.class));
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
  * Retrieve Tranqcontract&#39;s Communicationsender
  * 
   * @param pkiTranqcontractID 
   * @return TranqcontractGetCommunicationsendersV1Response
  */
  public TranqcontractGetCommunicationsendersV1Response tranqcontractGetCommunicationsendersV1 (Integer pkiTranqcontractID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders".replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
         return (TranqcontractGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse, "", TranqcontractGetCommunicationsendersV1Response.class);
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
   * Retrieve Tranqcontract&#39;s Communicationsender
   * 
   * @param pkiTranqcontractID 
  */
  public void tranqcontractGetCommunicationsendersV1 (Integer pkiTranqcontractID, final Response.Listener<TranqcontractGetCommunicationsendersV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiTranqcontractID' is set
    if (pkiTranqcontractID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiTranqcontractID' when calling tranqcontractGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiTranqcontractID" + "\\}", apiInvoker.escapeString(pkiTranqcontractID.toString()));

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
              responseListener.onResponse((TranqcontractGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse,  "", TranqcontractGetCommunicationsendersV1Response.class));
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
