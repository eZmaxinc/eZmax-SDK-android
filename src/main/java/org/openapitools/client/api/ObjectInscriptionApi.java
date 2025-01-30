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
import org.openapitools.client.model.InscriptionGetAttachmentsV1Response;
import org.openapitools.client.model.InscriptionGetCommunicationCountV1Response;
import org.openapitools.client.model.InscriptionGetCommunicationListV1Response;
import org.openapitools.client.model.InscriptionGetCommunicationrecipientsV1Response;
import org.openapitools.client.model.InscriptionGetCommunicationsendersV1Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectInscriptionApi {
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
  * Retrieve Inscription&#39;s Attachments
  * 
   * @param pkiInscriptionID 
   * @return InscriptionGetAttachmentsV1Response
  */
  public InscriptionGetAttachmentsV1Response inscriptionGetAttachmentsV1 (Integer pkiInscriptionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetAttachmentsV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetAttachmentsV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getAttachments".replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
         return (InscriptionGetAttachmentsV1Response) ApiInvoker.deserialize(localVarResponse, "", InscriptionGetAttachmentsV1Response.class);
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
   * Retrieve Inscription&#39;s Attachments
   * 
   * @param pkiInscriptionID 
  */
  public void inscriptionGetAttachmentsV1 (Integer pkiInscriptionID, final Response.Listener<InscriptionGetAttachmentsV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetAttachmentsV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetAttachmentsV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getAttachments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
              responseListener.onResponse((InscriptionGetAttachmentsV1Response) ApiInvoker.deserialize(localVarResponse,  "", InscriptionGetAttachmentsV1Response.class));
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
  * Retrieve Communication count
  * 
   * @param pkiInscriptionID 
   * @return InscriptionGetCommunicationCountV1Response
  */
  public InscriptionGetCommunicationCountV1Response inscriptionGetCommunicationCountV1 (Integer pkiInscriptionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationCount".replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
         return (InscriptionGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse, "", InscriptionGetCommunicationCountV1Response.class);
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
   * @param pkiInscriptionID 
  */
  public void inscriptionGetCommunicationCountV1 (Integer pkiInscriptionID, final Response.Listener<InscriptionGetCommunicationCountV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationCountV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationCountV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationCount".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
              responseListener.onResponse((InscriptionGetCommunicationCountV1Response) ApiInvoker.deserialize(localVarResponse,  "", InscriptionGetCommunicationCountV1Response.class));
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
   * @param pkiInscriptionID 
   * @return InscriptionGetCommunicationListV1Response
  */
  public InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1 (Integer pkiInscriptionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationList".replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
         return (InscriptionGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse, "", InscriptionGetCommunicationListV1Response.class);
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
   * @param pkiInscriptionID 
  */
  public void inscriptionGetCommunicationListV1 (Integer pkiInscriptionID, final Response.Listener<InscriptionGetCommunicationListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationListV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationListV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationList".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
              responseListener.onResponse((InscriptionGetCommunicationListV1Response) ApiInvoker.deserialize(localVarResponse,  "", InscriptionGetCommunicationListV1Response.class));
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
  * Retrieve Inscription&#39;s Communicationrecipient
  * 
   * @param pkiInscriptionID 
   * @return InscriptionGetCommunicationrecipientsV1Response
  */
  public InscriptionGetCommunicationrecipientsV1Response inscriptionGetCommunicationrecipientsV1 (Integer pkiInscriptionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients".replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
         return (InscriptionGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse, "", InscriptionGetCommunicationrecipientsV1Response.class);
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
   * Retrieve Inscription&#39;s Communicationrecipient
   * 
   * @param pkiInscriptionID 
  */
  public void inscriptionGetCommunicationrecipientsV1 (Integer pkiInscriptionID, final Response.Listener<InscriptionGetCommunicationrecipientsV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationrecipientsV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationrecipientsV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
              responseListener.onResponse((InscriptionGetCommunicationrecipientsV1Response) ApiInvoker.deserialize(localVarResponse,  "", InscriptionGetCommunicationrecipientsV1Response.class));
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
  * Retrieve Inscription&#39;s Communicationsender
  * 
   * @param pkiInscriptionID 
   * @return InscriptionGetCommunicationsendersV1Response
  */
  public InscriptionGetCommunicationsendersV1Response inscriptionGetCommunicationsendersV1 (Integer pkiInscriptionID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationsenders".replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
         return (InscriptionGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse, "", InscriptionGetCommunicationsendersV1Response.class);
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
   * Retrieve Inscription&#39;s Communicationsender
   * 
   * @param pkiInscriptionID 
  */
  public void inscriptionGetCommunicationsendersV1 (Integer pkiInscriptionID, final Response.Listener<InscriptionGetCommunicationsendersV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiInscriptionID' is set
    if (pkiInscriptionID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationsendersV1",
        new ApiException(400, "Missing the required parameter 'pkiInscriptionID' when calling inscriptionGetCommunicationsendersV1"));
    }

    // create path and map variables
    String path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationsenders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiInscriptionID" + "\\}", apiInvoker.escapeString(pkiInscriptionID.toString()));

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
              responseListener.onResponse((InscriptionGetCommunicationsendersV1Response) ApiInvoker.deserialize(localVarResponse,  "", InscriptionGetCommunicationsendersV1Response.class));
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
