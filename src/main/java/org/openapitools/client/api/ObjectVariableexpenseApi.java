/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
import java.io.File;
import org.openapitools.client.model.HeaderAcceptLanguage;
import org.openapitools.client.model.VariableexpenseCreateObjectV1Request;
import org.openapitools.client.model.VariableexpenseCreateObjectV1Response;
import org.openapitools.client.model.VariableexpenseEditObjectV1Request;
import org.openapitools.client.model.VariableexpenseEditObjectV1Response;
import org.openapitools.client.model.VariableexpenseGetAutocompleteV2Response;
import org.openapitools.client.model.VariableexpenseGetListV1Response;
import org.openapitools.client.model.VariableexpenseGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectVariableexpenseApi {
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
  * Create a new Variableexpense
  * The endpoint allows to create one or many elements at once.
   * @param variableexpenseCreateObjectV1Request 
   * @return VariableexpenseCreateObjectV1Response
  */
  public VariableexpenseCreateObjectV1Response variableexpenseCreateObjectV1 (VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = variableexpenseCreateObjectV1Request;
    // verify the required parameter 'variableexpenseCreateObjectV1Request' is set
    if (variableexpenseCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'variableexpenseCreateObjectV1Request' when calling variableexpenseCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'variableexpenseCreateObjectV1Request' when calling variableexpenseCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/variableexpense";

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
         return (VariableexpenseCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", VariableexpenseCreateObjectV1Response.class);
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
   * Create a new Variableexpense
   * The endpoint allows to create one or many elements at once.
   * @param variableexpenseCreateObjectV1Request 
  */
  public void variableexpenseCreateObjectV1 (VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request, final Response.Listener<VariableexpenseCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = variableexpenseCreateObjectV1Request;

    // verify the required parameter 'variableexpenseCreateObjectV1Request' is set
    if (variableexpenseCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'variableexpenseCreateObjectV1Request' when calling variableexpenseCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'variableexpenseCreateObjectV1Request' when calling variableexpenseCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/variableexpense".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((VariableexpenseCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", VariableexpenseCreateObjectV1Response.class));
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
  * Edit an existing Variableexpense
  * 
   * @param pkiVariableexpenseID The unique ID of the Variableexpense
   * @param variableexpenseEditObjectV1Request 
   * @return VariableexpenseEditObjectV1Response
  */
  public VariableexpenseEditObjectV1Response variableexpenseEditObjectV1 (Integer pkiVariableexpenseID, VariableexpenseEditObjectV1Request variableexpenseEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = variableexpenseEditObjectV1Request;
    // verify the required parameter 'pkiVariableexpenseID' is set
    if (pkiVariableexpenseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseEditObjectV1"));
    }
    // verify the required parameter 'variableexpenseEditObjectV1Request' is set
    if (variableexpenseEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'variableexpenseEditObjectV1Request' when calling variableexpenseEditObjectV1",
        new ApiException(400, "Missing the required parameter 'variableexpenseEditObjectV1Request' when calling variableexpenseEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/variableexpense/{pkiVariableexpenseID}".replaceAll("\\{" + "pkiVariableexpenseID" + "\\}", apiInvoker.escapeString(pkiVariableexpenseID.toString()));

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
         return (VariableexpenseEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", VariableexpenseEditObjectV1Response.class);
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
   * Edit an existing Variableexpense
   * 
   * @param pkiVariableexpenseID The unique ID of the Variableexpense   * @param variableexpenseEditObjectV1Request 
  */
  public void variableexpenseEditObjectV1 (Integer pkiVariableexpenseID, VariableexpenseEditObjectV1Request variableexpenseEditObjectV1Request, final Response.Listener<VariableexpenseEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = variableexpenseEditObjectV1Request;

    // verify the required parameter 'pkiVariableexpenseID' is set
    if (pkiVariableexpenseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseEditObjectV1"));
    }
    // verify the required parameter 'variableexpenseEditObjectV1Request' is set
    if (variableexpenseEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'variableexpenseEditObjectV1Request' when calling variableexpenseEditObjectV1",
        new ApiException(400, "Missing the required parameter 'variableexpenseEditObjectV1Request' when calling variableexpenseEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/variableexpense/{pkiVariableexpenseID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiVariableexpenseID" + "\\}", apiInvoker.escapeString(pkiVariableexpenseID.toString()));

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
              responseListener.onResponse((VariableexpenseEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", VariableexpenseEditObjectV1Response.class));
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
  * Retrieve Variableexpenses and IDs
  * Get the list of Variableexpense to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Variableexpenses to return
   * @param eFilterActive Specify which results we want to display.
   * @param sQuery Allow to filter the returned results
   * @param acceptLanguage 
   * @return VariableexpenseGetAutocompleteV2Response
  */
  public VariableexpenseGetAutocompleteV2Response variableexpenseGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling variableexpenseGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling variableexpenseGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/variableexpense/getAutocomplete/{sSelector}".replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
         return (VariableexpenseGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse, "", VariableexpenseGetAutocompleteV2Response.class);
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
   * Retrieve Variableexpenses and IDs
   * Get the list of Variableexpense to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Variableexpenses to return   * @param eFilterActive Specify which results we want to display.   * @param sQuery Allow to filter the returned results   * @param acceptLanguage 
  */
  public void variableexpenseGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final Response.Listener<VariableexpenseGetAutocompleteV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling variableexpenseGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling variableexpenseGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/variableexpense/getAutocomplete/{sSelector}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
              responseListener.onResponse((VariableexpenseGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse,  "", VariableexpenseGetAutocompleteV2Response.class));
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
  * Retrieve Variableexpense list
  * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eVariableexpenseTaxable | Yes&lt;br&gt;No&lt;br&gt;Included |
   * @param eOrderBy Specify how you want the results to be sorted
   * @param iRowMax 
   * @param iRowOffset 
   * @param acceptLanguage 
   * @param sFilter 
   * @return VariableexpenseGetListV1Response
  */
  public VariableexpenseGetListV1Response variableexpenseGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/1/object/variableexpense/getList";

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
         return (VariableexpenseGetListV1Response) ApiInvoker.deserialize(localVarResponse, "", VariableexpenseGetListV1Response.class);
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
   * Retrieve Variableexpense list
   * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eVariableexpenseTaxable | Yes&lt;br&gt;No&lt;br&gt;Included |
   * @param eOrderBy Specify how you want the results to be sorted   * @param iRowMax    * @param iRowOffset    * @param acceptLanguage    * @param sFilter 
  */
  public void variableexpenseGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter, final Response.Listener<VariableexpenseGetListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/1/object/variableexpense/getList".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((VariableexpenseGetListV1Response) ApiInvoker.deserialize(localVarResponse,  "", VariableexpenseGetListV1Response.class));
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
  * Retrieve an existing Variableexpense
  * 
   * @param pkiVariableexpenseID The unique ID of the Variableexpense
   * @return VariableexpenseGetObjectV2Response
  */
  public VariableexpenseGetObjectV2Response variableexpenseGetObjectV2 (Integer pkiVariableexpenseID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiVariableexpenseID' is set
    if (pkiVariableexpenseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/variableexpense/{pkiVariableexpenseID}".replaceAll("\\{" + "pkiVariableexpenseID" + "\\}", apiInvoker.escapeString(pkiVariableexpenseID.toString()));

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
         return (VariableexpenseGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", VariableexpenseGetObjectV2Response.class);
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
   * Retrieve an existing Variableexpense
   * 
   * @param pkiVariableexpenseID The unique ID of the Variableexpense
  */
  public void variableexpenseGetObjectV2 (Integer pkiVariableexpenseID, final Response.Listener<VariableexpenseGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiVariableexpenseID' is set
    if (pkiVariableexpenseID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiVariableexpenseID' when calling variableexpenseGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/variableexpense/{pkiVariableexpenseID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiVariableexpenseID" + "\\}", apiInvoker.escapeString(pkiVariableexpenseID.toString()));

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
              responseListener.onResponse((VariableexpenseGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", VariableexpenseGetObjectV2Response.class));
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
