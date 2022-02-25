/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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
import org.openapitools.client.model.EzsignfoldersignerassociationCreateObjectV1Request;
import org.openapitools.client.model.EzsignfoldersignerassociationCreateObjectV1Response;
import org.openapitools.client.model.EzsignfoldersignerassociationCreateObjectV2Request;
import org.openapitools.client.model.EzsignfoldersignerassociationCreateObjectV2Response;
import org.openapitools.client.model.EzsignfoldersignerassociationDeleteObjectV1Response;
import org.openapitools.client.model.EzsignfoldersignerassociationGetInPersonLoginUrlV1Response;
import org.openapitools.client.model.EzsignfoldersignerassociationGetObjectV1Response;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignfoldersignerassociationApi {
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
  * Create a new Ezsignfoldersignerassociation
  * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignfoldersignerassociationCreateObjectV1Request 
   * @return EzsignfoldersignerassociationCreateObjectV1Response
  */
  public EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1 (List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfoldersignerassociationCreateObjectV1Request;
    // verify the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' is set
    if (ezsignfoldersignerassociationCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' when calling ezsignfoldersignerassociationCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' when calling ezsignfoldersignerassociationCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation";

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
         return (EzsignfoldersignerassociationCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldersignerassociationCreateObjectV1Response.class);
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
   * Create a new Ezsignfoldersignerassociation
   * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
   * @param ezsignfoldersignerassociationCreateObjectV1Request 
  */
  public void ezsignfoldersignerassociationCreateObjectV1 (List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request, final Response.Listener<EzsignfoldersignerassociationCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfoldersignerassociationCreateObjectV1Request;

    // verify the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' is set
    if (ezsignfoldersignerassociationCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' when calling ezsignfoldersignerassociationCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' when calling ezsignfoldersignerassociationCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignfoldersignerassociationCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldersignerassociationCreateObjectV1Response.class));
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
  * Create a new Ezsignfoldersignerassociation
  * The endpoint allows to create one or many elements at once.
   * @param ezsignfoldersignerassociationCreateObjectV2Request 
   * @return EzsignfoldersignerassociationCreateObjectV2Response
  */
  public EzsignfoldersignerassociationCreateObjectV2Response ezsignfoldersignerassociationCreateObjectV2 (EzsignfoldersignerassociationCreateObjectV2Request ezsignfoldersignerassociationCreateObjectV2Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfoldersignerassociationCreateObjectV2Request;
    // verify the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' is set
    if (ezsignfoldersignerassociationCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' when calling ezsignfoldersignerassociationCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' when calling ezsignfoldersignerassociationCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldersignerassociation";

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
         return (EzsignfoldersignerassociationCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldersignerassociationCreateObjectV2Response.class);
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
   * Create a new Ezsignfoldersignerassociation
   * The endpoint allows to create one or many elements at once.
   * @param ezsignfoldersignerassociationCreateObjectV2Request 
  */
  public void ezsignfoldersignerassociationCreateObjectV2 (EzsignfoldersignerassociationCreateObjectV2Request ezsignfoldersignerassociationCreateObjectV2Request, final Response.Listener<EzsignfoldersignerassociationCreateObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfoldersignerassociationCreateObjectV2Request;

    // verify the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' is set
    if (ezsignfoldersignerassociationCreateObjectV2Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' when calling ezsignfoldersignerassociationCreateObjectV2",
        new ApiException(400, "Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV2Request' when calling ezsignfoldersignerassociationCreateObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldersignerassociation".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignfoldersignerassociationCreateObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldersignerassociationCreateObjectV2Response.class));
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
  * Delete an existing Ezsignfoldersignerassociation
  * 
   * @param pkiEzsignfoldersignerassociationID 
   * @return EzsignfoldersignerassociationDeleteObjectV1Response
  */
  public EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1 (Integer pkiEzsignfoldersignerassociationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
         return (EzsignfoldersignerassociationDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldersignerassociationDeleteObjectV1Response.class);
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
   * Delete an existing Ezsignfoldersignerassociation
   * 
   * @param pkiEzsignfoldersignerassociationID 
  */
  public void ezsignfoldersignerassociationDeleteObjectV1 (Integer pkiEzsignfoldersignerassociationID, final Response.Listener<EzsignfoldersignerassociationDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
              responseListener.onResponse((EzsignfoldersignerassociationDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldersignerassociationDeleteObjectV1Response.class));
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
  * Retrieve a Login Url to allow In-Person signing
  * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
   * @param pkiEzsignfoldersignerassociationID 
   * @return EzsignfoldersignerassociationGetInPersonLoginUrlV1Response
  */
  public EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1 (Integer pkiEzsignfoldersignerassociationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetInPersonLoginUrlV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetInPersonLoginUrlV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl".replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
         return (EzsignfoldersignerassociationGetInPersonLoginUrlV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.class);
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
   * Retrieve a Login Url to allow In-Person signing
   * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
   * @param pkiEzsignfoldersignerassociationID 
  */
  public void ezsignfoldersignerassociationGetInPersonLoginUrlV1 (Integer pkiEzsignfoldersignerassociationID, final Response.Listener<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetInPersonLoginUrlV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetInPersonLoginUrlV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
              responseListener.onResponse((EzsignfoldersignerassociationGetInPersonLoginUrlV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.class));
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
  * Retrieve an existing Ezsignfoldersignerassociation
  * 
   * @param pkiEzsignfoldersignerassociationID 
   * @return EzsignfoldersignerassociationGetObjectV1Response
  */
  public EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1 (Integer pkiEzsignfoldersignerassociationID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
         return (EzsignfoldersignerassociationGetObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldersignerassociationGetObjectV1Response.class);
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
   * Retrieve an existing Ezsignfoldersignerassociation
   * 
   * @param pkiEzsignfoldersignerassociationID 
  */
  public void ezsignfoldersignerassociationGetObjectV1 (Integer pkiEzsignfoldersignerassociationID, final Response.Listener<EzsignfoldersignerassociationGetObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
    if (pkiEzsignfoldersignerassociationID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldersignerassociationID.toString()));

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
              responseListener.onResponse((EzsignfoldersignerassociationGetObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldersignerassociationGetObjectV1Response.class));
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
