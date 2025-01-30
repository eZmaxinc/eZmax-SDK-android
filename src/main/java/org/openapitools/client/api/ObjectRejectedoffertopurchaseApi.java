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
import org.openapitools.client.model.RejectedoffertopurchaseGetCommunicationCountV1Response;
import org.openapitools.client.model.RejectedoffertopurchaseGetCommunicationListV1Response;
import org.openapitools.client.model.RejectedoffertopurchaseGetCommunicationrecipientsV1Response;
import org.openapitools.client.model.RejectedoffertopurchaseGetCommunicationsendersV1Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectRejectedoffertopurchaseApi {
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
   * @param pkiRejectedoffertopurchaseID 
   * @return RejectedoffertopurchaseGetCommunicationCountV1Response
  */
  public RejectedoffertopurchaseGetCommunicationCountV1Response rejectedoffertopurchaseGetCommunicationCountV1 (Integer pkiRejectedoffertopurchaseID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount".replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
         return (RejectedoffertopurchaseGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse, "", RejectedoffertopurchaseGetCommunicationCountV1Response.class);
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
   * @param pkiRejectedoffertopurchaseID 
  */
  public void rejectedoffertopurchaseGetCommunicationCountV1 (Integer pkiRejectedoffertopurchaseID, final Response.Listener<RejectedoffertopurchaseGetCommunicationCountV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
              responseListener.onResponse((RejectedoffertopurchaseGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse,  "", RejectedoffertopurchaseGetCommunicationCountV1Response.class));
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
   * @param pkiRejectedoffertopurchaseID 
   * @return RejectedoffertopurchaseGetCommunicationListV1Response
  */
  public RejectedoffertopurchaseGetCommunicationListV1Response rejectedoffertopurchaseGetCommunicationListV1 (Integer pkiRejectedoffertopurchaseID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList".replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
         return (RejectedoffertopurchaseGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse, "", RejectedoffertopurchaseGetCommunicationListV1Response.class);
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
   * @param pkiRejectedoffertopurchaseID 
  */
  public void rejectedoffertopurchaseGetCommunicationListV1 (Integer pkiRejectedoffertopurchaseID, final Response.Listener<RejectedoffertopurchaseGetCommunicationListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
              responseListener.onResponse((RejectedoffertopurchaseGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse,  "", RejectedoffertopurchaseGetCommunicationListV1Response.class));
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
  * Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient
  * 
   * @param pkiRejectedoffertopurchaseID 
   * @return RejectedoffertopurchaseGetCommunicationrecipientsV1Response
  */
  public RejectedoffertopurchaseGetCommunicationrecipientsV1Response rejectedoffertopurchaseGetCommunicationrecipientsV1 (Integer pkiRejectedoffertopurchaseID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients".replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
         return (RejectedoffertopurchaseGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse, "", RejectedoffertopurchaseGetCommunicationrecipientsV1Response.class);
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
   * Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient
   * 
   * @param pkiRejectedoffertopurchaseID 
  */
  public void rejectedoffertopurchaseGetCommunicationrecipientsV1 (Integer pkiRejectedoffertopurchaseID, final Response.Listener<RejectedoffertopurchaseGetCommunicationrecipientsV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
              responseListener.onResponse((RejectedoffertopurchaseGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse,  "", RejectedoffertopurchaseGetCommunicationrecipientsV1Response.class));
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
  * Retrieve Rejectedoffertopurchase&#39;s Communicationsender
  * 
   * @param pkiRejectedoffertopurchaseID 
   * @return RejectedoffertopurchaseGetCommunicationsendersV1Response
  */
  public RejectedoffertopurchaseGetCommunicationsendersV1Response rejectedoffertopurchaseGetCommunicationsendersV1 (Integer pkiRejectedoffertopurchaseID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders".replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
         return (RejectedoffertopurchaseGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse, "", RejectedoffertopurchaseGetCommunicationsendersV1Response.class);
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
   * Retrieve Rejectedoffertopurchase&#39;s Communicationsender
   * 
   * @param pkiRejectedoffertopurchaseID 
  */
  public void rejectedoffertopurchaseGetCommunicationsendersV1 (Integer pkiRejectedoffertopurchaseID, final Response.Listener<RejectedoffertopurchaseGetCommunicationsendersV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiRejectedoffertopurchaseID' is set
    if (pkiRejectedoffertopurchaseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiRejectedoffertopurchaseID' when calling rejectedoffertopurchaseGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiRejectedoffertopurchaseID" + "\\}", apiInvoker.escapeString(pkiRejectedoffertopurchaseID.toString()));

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
              responseListener.onResponse((RejectedoffertopurchaseGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse,  "", RejectedoffertopurchaseGetCommunicationsendersV1Response.class));
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
