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
import java.io.File;
import org.openapitools.client.model.HeaderAcceptLanguage;
import org.openapitools.client.model.PaymenttermCreateObjectV1Request;
import org.openapitools.client.model.PaymenttermCreateObjectV1Response;
import org.openapitools.client.model.PaymenttermEditObjectV1Request;
import org.openapitools.client.model.PaymenttermEditObjectV1Response;
import org.openapitools.client.model.PaymenttermGetAutocompleteV2Response;
import org.openapitools.client.model.PaymenttermGetListV1Response;
import org.openapitools.client.model.PaymenttermGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectPaymenttermApi {
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
  * Create a new Paymentterm
  * The endpoint allows to create one or many elements at once.
   * @param paymenttermCreateObjectV1Request 
   * @return PaymenttermCreateObjectV1Response
  */
  public PaymenttermCreateObjectV1Response paymenttermCreateObjectV1 (PaymenttermCreateObjectV1Request paymenttermCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = paymenttermCreateObjectV1Request;
    // verify the required parameter 'paymenttermCreateObjectV1Request' is set
    if (paymenttermCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'paymenttermCreateObjectV1Request' when calling paymenttermCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'paymenttermCreateObjectV1Request' when calling paymenttermCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/paymentterm";

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
         return (PaymenttermCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", PaymenttermCreateObjectV1Response.class);
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
   * Create a new Paymentterm
   * The endpoint allows to create one or many elements at once.
   * @param paymenttermCreateObjectV1Request 
  */
  public void paymenttermCreateObjectV1 (PaymenttermCreateObjectV1Request paymenttermCreateObjectV1Request, final Response.Listener<PaymenttermCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = paymenttermCreateObjectV1Request;

    // verify the required parameter 'paymenttermCreateObjectV1Request' is set
    if (paymenttermCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'paymenttermCreateObjectV1Request' when calling paymenttermCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'paymenttermCreateObjectV1Request' when calling paymenttermCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/paymentterm".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((PaymenttermCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", PaymenttermCreateObjectV1Response.class));
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
  * Edit an existing Paymentterm
  * 
   * @param pkiPaymenttermID 
   * @param paymenttermEditObjectV1Request 
   * @return PaymenttermEditObjectV1Response
  */
  public PaymenttermEditObjectV1Response paymenttermEditObjectV1 (Integer pkiPaymenttermID, PaymenttermEditObjectV1Request paymenttermEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = paymenttermEditObjectV1Request;
    // verify the required parameter 'pkiPaymenttermID' is set
    if (pkiPaymenttermID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiPaymenttermID' when calling paymenttermEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiPaymenttermID' when calling paymenttermEditObjectV1"));
    }
    // verify the required parameter 'paymenttermEditObjectV1Request' is set
    if (paymenttermEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'paymenttermEditObjectV1Request' when calling paymenttermEditObjectV1",
        new ApiException(400, "Missing the required parameter 'paymenttermEditObjectV1Request' when calling paymenttermEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/paymentterm/{pkiPaymenttermID}".replaceAll("\\{" + "pkiPaymenttermID" + "\\}", apiInvoker.escapeString(pkiPaymenttermID.toString()));

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
         return (PaymenttermEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", PaymenttermEditObjectV1Response.class);
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
   * Edit an existing Paymentterm
   * 
   * @param pkiPaymenttermID    * @param paymenttermEditObjectV1Request 
  */
  public void paymenttermEditObjectV1 (Integer pkiPaymenttermID, PaymenttermEditObjectV1Request paymenttermEditObjectV1Request, final Response.Listener<PaymenttermEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = paymenttermEditObjectV1Request;

    // verify the required parameter 'pkiPaymenttermID' is set
    if (pkiPaymenttermID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiPaymenttermID' when calling paymenttermEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiPaymenttermID' when calling paymenttermEditObjectV1"));
    }
    // verify the required parameter 'paymenttermEditObjectV1Request' is set
    if (paymenttermEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'paymenttermEditObjectV1Request' when calling paymenttermEditObjectV1",
        new ApiException(400, "Missing the required parameter 'paymenttermEditObjectV1Request' when calling paymenttermEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/paymentterm/{pkiPaymenttermID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiPaymenttermID" + "\\}", apiInvoker.escapeString(pkiPaymenttermID.toString()));

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
              responseListener.onResponse((PaymenttermEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", PaymenttermEditObjectV1Response.class));
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
  * Retrieve Paymentterms and IDs
  * Get the list of Paymentterm to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Paymentterms to return
   * @param eFilterActive Specify which results we want to display.
   * @param sQuery Allow to filter the returned results
   * @param acceptLanguage 
   * @return PaymenttermGetAutocompleteV2Response
  */
  public PaymenttermGetAutocompleteV2Response paymenttermGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling paymenttermGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling paymenttermGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/paymentterm/getAutocomplete/{sSelector}".replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
         return (PaymenttermGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse, "", PaymenttermGetAutocompleteV2Response.class);
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
   * Retrieve Paymentterms and IDs
   * Get the list of Paymentterm to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Paymentterms to return   * @param eFilterActive Specify which results we want to display.   * @param sQuery Allow to filter the returned results   * @param acceptLanguage 
  */
  public void paymenttermGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final Response.Listener<PaymenttermGetAutocompleteV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling paymenttermGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling paymenttermGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/paymentterm/getAutocomplete/{sSelector}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
              responseListener.onResponse((PaymenttermGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse,  "", PaymenttermGetAutocompleteV2Response.class));
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
  * Retrieve Paymentterm list
  * 
   * @param eOrderBy Specify how you want the results to be sorted
   * @param iRowMax 
   * @param iRowOffset 
   * @param acceptLanguage 
   * @param sFilter 
   * @return PaymenttermGetListV1Response
  */
  public PaymenttermGetListV1Response paymenttermGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/1/object/paymentterm/getList";

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
         return (PaymenttermGetListV1Response) ApiInvoker.deserialize(localVarResponse, "", PaymenttermGetListV1Response.class);
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
   * Retrieve Paymentterm list
   * 
   * @param eOrderBy Specify how you want the results to be sorted   * @param iRowMax    * @param iRowOffset    * @param acceptLanguage    * @param sFilter 
  */
  public void paymenttermGetListV1 (String eOrderBy, Integer iRowMax, Integer iRowOffset, HeaderAcceptLanguage acceptLanguage, String sFilter, final Response.Listener<PaymenttermGetListV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/1/object/paymentterm/getList".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((PaymenttermGetListV1Response) ApiInvoker.deserialize(localVarResponse,  "", PaymenttermGetListV1Response.class));
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
  * Retrieve an existing Paymentterm
  * 
   * @param pkiPaymenttermID 
   * @return PaymenttermGetObjectV2Response
  */
  public PaymenttermGetObjectV2Response paymenttermGetObjectV2 (Integer pkiPaymenttermID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiPaymenttermID' is set
    if (pkiPaymenttermID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiPaymenttermID' when calling paymenttermGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiPaymenttermID' when calling paymenttermGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/paymentterm/{pkiPaymenttermID}".replaceAll("\\{" + "pkiPaymenttermID" + "\\}", apiInvoker.escapeString(pkiPaymenttermID.toString()));

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
         return (PaymenttermGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", PaymenttermGetObjectV2Response.class);
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
   * Retrieve an existing Paymentterm
   * 
   * @param pkiPaymenttermID 
  */
  public void paymenttermGetObjectV2 (Integer pkiPaymenttermID, final Response.Listener<PaymenttermGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiPaymenttermID' is set
    if (pkiPaymenttermID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiPaymenttermID' when calling paymenttermGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiPaymenttermID' when calling paymenttermGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/paymentterm/{pkiPaymenttermID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiPaymenttermID" + "\\}", apiInvoker.escapeString(pkiPaymenttermID.toString()));

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
              responseListener.onResponse((PaymenttermGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", PaymenttermGetObjectV2Response.class));
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
