/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
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

import org.openapitools.client.model.CommonResponse;
import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.EzsignfoldertypeCreateObjectV3Request;
import org.openapitools.client.model.EzsignfoldertypeCreateObjectV3Response;
import org.openapitools.client.model.EzsignfoldertypeEditObjectV3Request;
import org.openapitools.client.model.EzsignfoldertypeGetAutocompleteV2Response;
import org.openapitools.client.model.EzsignfoldertypeGetListV1Response;
import org.openapitools.client.model.EzsignfoldertypeGetObjectV2Response;
import org.openapitools.client.model.EzsignfoldertypeGetObjectV4Response;
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

public class ObjectEzsignfoldertypeApi {
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
  * Create a new Ezsignfoldertype
  * The endpoint allows to create one or many elements at once.
   * @param ezsignfoldertypeCreateObjectV3Request 
   * @return EzsignfoldertypeCreateObjectV3Response
  */
  public EzsignfoldertypeCreateObjectV3Response ezsignfoldertypeCreateObjectV3 (EzsignfoldertypeCreateObjectV3Request ezsignfoldertypeCreateObjectV3Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfoldertypeCreateObjectV3Request;
    // verify the required parameter 'ezsignfoldertypeCreateObjectV3Request' is set
    if (ezsignfoldertypeCreateObjectV3Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldertypeCreateObjectV3Request' when calling ezsignfoldertypeCreateObjectV3",
        new ApiException(400, "Missing the required parameter 'ezsignfoldertypeCreateObjectV3Request' when calling ezsignfoldertypeCreateObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsignfoldertype";

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
         return (EzsignfoldertypeCreateObjectV3Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldertypeCreateObjectV3Response.class);
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
   * Create a new Ezsignfoldertype
   * The endpoint allows to create one or many elements at once.
   * @param ezsignfoldertypeCreateObjectV3Request 
  */
  public void ezsignfoldertypeCreateObjectV3 (EzsignfoldertypeCreateObjectV3Request ezsignfoldertypeCreateObjectV3Request, final Response.Listener<EzsignfoldertypeCreateObjectV3Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfoldertypeCreateObjectV3Request;

    // verify the required parameter 'ezsignfoldertypeCreateObjectV3Request' is set
    if (ezsignfoldertypeCreateObjectV3Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldertypeCreateObjectV3Request' when calling ezsignfoldertypeCreateObjectV3",
        new ApiException(400, "Missing the required parameter 'ezsignfoldertypeCreateObjectV3Request' when calling ezsignfoldertypeCreateObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsignfoldertype".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignfoldertypeCreateObjectV3Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldertypeCreateObjectV3Response.class));
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
  * Edit an existing Ezsignfoldertype
  * 
   * @param pkiEzsignfoldertypeID 
   * @param ezsignfoldertypeEditObjectV3Request 
   * @return CommonResponse
  */
  public CommonResponse ezsignfoldertypeEditObjectV3 (Integer pkiEzsignfoldertypeID, EzsignfoldertypeEditObjectV3Request ezsignfoldertypeEditObjectV3Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = ezsignfoldertypeEditObjectV3Request;
    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeEditObjectV3",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeEditObjectV3"));
    }
    // verify the required parameter 'ezsignfoldertypeEditObjectV3Request' is set
    if (ezsignfoldertypeEditObjectV3Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldertypeEditObjectV3Request' when calling ezsignfoldertypeEditObjectV3",
        new ApiException(400, "Missing the required parameter 'ezsignfoldertypeEditObjectV3Request' when calling ezsignfoldertypeEditObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
         return (CommonResponse) ApiInvoker.deserialize(localVarResponse, "", CommonResponse.class);
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
   * Edit an existing Ezsignfoldertype
   * 
   * @param pkiEzsignfoldertypeID    * @param ezsignfoldertypeEditObjectV3Request 
  */
  public void ezsignfoldertypeEditObjectV3 (Integer pkiEzsignfoldertypeID, EzsignfoldertypeEditObjectV3Request ezsignfoldertypeEditObjectV3Request, final Response.Listener<CommonResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = ezsignfoldertypeEditObjectV3Request;

    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeEditObjectV3",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeEditObjectV3"));
    }
    // verify the required parameter 'ezsignfoldertypeEditObjectV3Request' is set
    if (ezsignfoldertypeEditObjectV3Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ezsignfoldertypeEditObjectV3Request' when calling ezsignfoldertypeEditObjectV3",
        new ApiException(400, "Missing the required parameter 'ezsignfoldertypeEditObjectV3Request' when calling ezsignfoldertypeEditObjectV3"));
    }

    // create path and map variables
    String path = "/3/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
              responseListener.onResponse((CommonResponse) ApiInvoker.deserialize(localVarResponse,  "", CommonResponse.class));
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
  * Retrieve Ezsignfoldertypes and IDs
  * Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezsignfoldertypes to return
   * @param eFilterActive Specify which results we want to display.
   * @param sQuery Allow to filter the returned results
   * @param acceptLanguage 
   * @return EzsignfoldertypeGetAutocompleteV2Response
  */
  public EzsignfoldertypeGetAutocompleteV2Response ezsignfoldertypeGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezsignfoldertypeGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezsignfoldertypeGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldertype/getAutocomplete/{sSelector}".replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
         return (EzsignfoldertypeGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldertypeGetAutocompleteV2Response.class);
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
   * Retrieve Ezsignfoldertypes and IDs
   * Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezsignfoldertypes to return   * @param eFilterActive Specify which results we want to display.   * @param sQuery Allow to filter the returned results   * @param acceptLanguage 
  */
  public void ezsignfoldertypeGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final Response.Listener<EzsignfoldertypeGetAutocompleteV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezsignfoldertypeGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezsignfoldertypeGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldertype/getAutocomplete/{sSelector}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
              responseListener.onResponse((EzsignfoldertypeGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldertypeGetAutocompleteV2Response.class));
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
  * Retrieve Ezsignfoldertype list
  * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
   * @param eOrderBy Specify how you want the results to be sorted
   * @param iRowMax 
   * @param iRowOffset 
   * @param acceptLanguage 
   * @param sFilter 
   * @return EzsignfoldertypeGetListV1Response
  */
  public EzsignfoldertypeGetListV1Response ezsignfoldertypeGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/1/object/ezsignfoldertype/getList";

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
         return (EzsignfoldertypeGetListV1Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldertypeGetListV1Response.class);
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
   * Retrieve Ezsignfoldertype list
   * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
   * @param eOrderBy Specify how you want the results to be sorted   * @param iRowMax    * @param iRowOffset    * @param acceptLanguage    * @param sFilter 
  */
  public void ezsignfoldertypeGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter, final Response.Listener<EzsignfoldertypeGetListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/1/object/ezsignfoldertype/getList".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((EzsignfoldertypeGetListV1Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldertypeGetListV1Response.class));
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
  * Retrieve an existing Ezsignfoldertype
  * 
   * @param pkiEzsignfoldertypeID 
   * @return EzsignfoldertypeGetObjectV2Response
  */
  public EzsignfoldertypeGetObjectV2Response ezsignfoldertypeGetObjectV2 (Integer pkiEzsignfoldertypeID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
         return (EzsignfoldertypeGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldertypeGetObjectV2Response.class);
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
   * Retrieve an existing Ezsignfoldertype
   * 
   * @param pkiEzsignfoldertypeID 
  */
  public void ezsignfoldertypeGetObjectV2 (Integer pkiEzsignfoldertypeID, final Response.Listener<EzsignfoldertypeGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
              responseListener.onResponse((EzsignfoldertypeGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldertypeGetObjectV2Response.class));
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
  * Retrieve an existing Ezsignfoldertype
  * 
   * @param pkiEzsignfoldertypeID 
   * @return EzsignfoldertypeGetObjectV4Response
  */
  public EzsignfoldertypeGetObjectV4Response ezsignfoldertypeGetObjectV4 (Integer pkiEzsignfoldertypeID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV4",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV4"));
    }

    // create path and map variables
    String path = "/4/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
         return (EzsignfoldertypeGetObjectV4Response) ApiInvoker.deserialize(localVarResponse, "", EzsignfoldertypeGetObjectV4Response.class);
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
   * Retrieve an existing Ezsignfoldertype
   * 
   * @param pkiEzsignfoldertypeID 
  */
  public void ezsignfoldertypeGetObjectV4 (Integer pkiEzsignfoldertypeID, final Response.Listener<EzsignfoldertypeGetObjectV4Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiEzsignfoldertypeID' is set
    if (pkiEzsignfoldertypeID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV4",
        new ApiException(400, "Missing the required parameter 'pkiEzsignfoldertypeID' when calling ezsignfoldertypeGetObjectV4"));
    }

    // create path and map variables
    String path = "/4/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiEzsignfoldertypeID" + "\\}", apiInvoker.escapeString(pkiEzsignfoldertypeID.toString()));

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
              responseListener.onResponse((EzsignfoldertypeGetObjectV4Response) ApiInvoker.deserialize(localVarResponse,  "", EzsignfoldertypeGetObjectV4Response.class));
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
