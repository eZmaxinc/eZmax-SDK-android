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
import org.openapitools.client.model.EzsignsigningreasonCreateObjectV1Request;
import org.openapitools.client.model.EzsignsigningreasonCreateObjectV1Response;
import org.openapitools.client.model.EzsignsigningreasonEditObjectV1Request;
import org.openapitools.client.model.EzsignsigningreasonEditObjectV1Response;
import org.openapitools.client.model.EzsignsigningreasonGetAutocompleteV2Response;
import org.openapitools.client.model.EzsignsigningreasonGetListV1Response;
import org.openapitools.client.model.EzsignsigningreasonGetObjectV2Response;
import java.io.File;
import org.openapitools.client.model.HeaderAcceptLanguage;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzsignsigningreasonApi {
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
  * Create a new Ezsignsigningreason
  * The endpoint allows to create one or many elements at once.
   * @param ezsignsigningreasonCreateObjectV1Request 
   * @return EzsignsigningreasonCreateObjectV1Response
  */
  public EzsignsigningreasonCreateObjectV1Response ezsignsigningreasonCreateObjectV1 (EzsignsigningreasonCreateObjectV1Request ezsignsigningreasonCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignsigningreasonCreateObjectV1Request;
    // verify the required parameter 'ezsignsigningreasonCreateObjectV1Request' is set
    if (ezsignsigningreasonCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsigningreasonCreateObjectV1Request' when calling ezsignsigningreasonCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsigningreasonCreateObjectV1Request' when calling ezsignsigningreasonCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsigningreason";

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
         return (EzsignsigningreasonCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsigningreasonCreateObjectV1Response.class);
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
   * Create a new Ezsignsigningreason
   * The endpoint allows to create one or many elements at once.
   * @param ezsignsigningreasonCreateObjectV1Request 
  */
  public void ezsignsigningreasonCreateObjectV1 (EzsignsigningreasonCreateObjectV1Request ezsignsigningreasonCreateObjectV1Request, final Response.Listener<EzsignsigningreasonCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignsigningreasonCreateObjectV1Request;

    // verify the required parameter 'ezsignsigningreasonCreateObjectV1Request' is set
    if (ezsignsigningreasonCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsigningreasonCreateObjectV1Request' when calling ezsignsigningreasonCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsigningreasonCreateObjectV1Request' when calling ezsignsigningreasonCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsigningreason".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignsigningreasonCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsigningreasonCreateObjectV1Response.class));
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
  * Edit an existing Ezsignsigningreason
  * 
   * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
   * @param ezsignsigningreasonEditObjectV1Request 
   * @return EzsignsigningreasonEditObjectV1Response
  */
  public EzsignsigningreasonEditObjectV1Response ezsignsigningreasonEditObjectV1 (Integer pkiEzsignsigningreasonID, EzsignsigningreasonEditObjectV1Request ezsignsigningreasonEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignsigningreasonEditObjectV1Request;
    // verify the required parameter 'pkiEzsignsigningreasonID' is set
    if (pkiEzsignsigningreasonID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonEditObjectV1"));
    }
    // verify the required parameter 'ezsignsigningreasonEditObjectV1Request' is set
    if (ezsignsigningreasonEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsigningreasonEditObjectV1Request' when calling ezsignsigningreasonEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsigningreasonEditObjectV1Request' when calling ezsignsigningreasonEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replaceAll("\\{" + "pkiEzsignsigningreasonID" + "\\}", apiInvoker.escapeString(pkiEzsignsigningreasonID.toString()));

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
         return (EzsignsigningreasonEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsigningreasonEditObjectV1Response.class);
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
   * Edit an existing Ezsignsigningreason
   * 
   * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason   * @param ezsignsigningreasonEditObjectV1Request 
  */
  public void ezsignsigningreasonEditObjectV1 (Integer pkiEzsignsigningreasonID, EzsignsigningreasonEditObjectV1Request ezsignsigningreasonEditObjectV1Request, final Response.Listener<EzsignsigningreasonEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignsigningreasonEditObjectV1Request;

    // verify the required parameter 'pkiEzsignsigningreasonID' is set
    if (pkiEzsignsigningreasonID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonEditObjectV1"));
    }
    // verify the required parameter 'ezsignsigningreasonEditObjectV1Request' is set
    if (ezsignsigningreasonEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignsigningreasonEditObjectV1Request' when calling ezsignsigningreasonEditObjectV1",
        new ApiException(400, "Missing the required parameter 'ezsignsigningreasonEditObjectV1Request' when calling ezsignsigningreasonEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsigningreasonID" + "\\}", apiInvoker.escapeString(pkiEzsignsigningreasonID.toString()));

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
              responseListener.onResponse((EzsignsigningreasonEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsigningreasonEditObjectV1Response.class));
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
  * Retrieve Ezsignsigningreasons and IDs
  * Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezsignsigningreasons to return
   * @param eFilterActive Specify which results we want to display.
   * @param sQuery Allow to filter the returned results
   * @param acceptLanguage 
   * @return EzsignsigningreasonGetAutocompleteV2Response
  */
  public EzsignsigningreasonGetAutocompleteV2Response ezsignsigningreasonGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezsignsigningreasonGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezsignsigningreasonGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsigningreason/getAutocomplete/{sSelector}".replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "eFilterActive", eFilterActive));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sQuery", sQuery));
    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
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
         return (EzsignsigningreasonGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsigningreasonGetAutocompleteV2Response.class);
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
   * Retrieve Ezsignsigningreasons and IDs
   * Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezsignsigningreasons to return   * @param eFilterActive Specify which results we want to display.   * @param sQuery Allow to filter the returned results   * @param acceptLanguage 
  */
  public void ezsignsigningreasonGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final Response.Listener<EzsignsigningreasonGetAutocompleteV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezsignsigningreasonGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezsignsigningreasonGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsigningreason/getAutocomplete/{sSelector}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "eFilterActive", eFilterActive));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sQuery", sQuery));

    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));

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
              responseListener.onResponse((EzsignsigningreasonGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsigningreasonGetAutocompleteV2Response.class));
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
  * Retrieve Ezsignsigningreason list
  * 
   * @param eOrderBy Specify how you want the results to be sorted
   * @param iRowMax 
   * @param iRowOffset 
   * @param acceptLanguage 
   * @param sFilter 
   * @return EzsignsigningreasonGetListV1Response
  */
  public EzsignsigningreasonGetListV1Response ezsignsigningreasonGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/1/object/ezsignsigningreason/getList";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "eOrderBy", eOrderBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowMax", iRowMax));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowOffset", iRowOffset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sFilter", sFilter));
    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));
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
         return (EzsignsigningreasonGetListV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsigningreasonGetListV1Response.class);
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
   * Retrieve Ezsignsigningreason list
   * 
   * @param eOrderBy Specify how you want the results to be sorted   * @param iRowMax    * @param iRowOffset    * @param acceptLanguage    * @param sFilter 
  */
  public void ezsignsigningreasonGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter, final Response.Listener<EzsignsigningreasonGetListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/1/object/ezsignsigningreason/getList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "eOrderBy", eOrderBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowMax", iRowMax));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "iRowOffset", iRowOffset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sFilter", sFilter));

    headerParams.put("Accept-Language", ApiInvoker.parameterToString(acceptLanguage));

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
              responseListener.onResponse((EzsignsigningreasonGetListV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsigningreasonGetListV1Response.class));
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
  * Retrieve an existing Ezsignsigningreason
  * 
   * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
   * @return EzsignsigningreasonGetObjectV2Response
  */
  public EzsignsigningreasonGetObjectV2Response ezsignsigningreasonGetObjectV2 (Integer pkiEzsignsigningreasonID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignsigningreasonID' is set
    if (pkiEzsignsigningreasonID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replaceAll("\\{" + "pkiEzsignsigningreasonID" + "\\}", apiInvoker.escapeString(pkiEzsignsigningreasonID.toString()));

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
         return (EzsignsigningreasonGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignsigningreasonGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignsigningreason
   * 
   * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
  */
  public void ezsignsigningreasonGetObjectV2 (Integer pkiEzsignsigningreasonID, final Response.Listener<EzsignsigningreasonGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignsigningreasonID' is set
    if (pkiEzsignsigningreasonID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignsigningreasonID' when calling ezsignsigningreasonGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignsigningreasonID" + "\\}", apiInvoker.escapeString(pkiEzsignsigningreasonID.toString()));

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
              responseListener.onResponse((EzsignsigningreasonGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignsigningreasonGetObjectV2Response.class));
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
