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

import org.openapitools.client.model.EzmaxproductGetAutocompleteV2Response;
import org.openapitools.client.model.HeaderAcceptLanguage;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectEzmaxproductApi {
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
  * Retrieve Ezmaxproducts and IDs
  * Get the list of Ezmaxproduct to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezmaxproducts to return
   * @param eFilterActive Specify which results we want to display.
   * @param sQuery Allow to filter the returned results
   * @param acceptLanguage 
   * @return EzmaxproductGetAutocompleteV2Response
  */
  public EzmaxproductGetAutocompleteV2Response ezmaxproductGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezmaxproductGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezmaxproductGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezmaxproduct/getAutocomplete/{sSelector}".replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
         return (EzmaxproductGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse, "", EzmaxproductGetAutocompleteV2Response.class);
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
   * Retrieve Ezmaxproducts and IDs
   * Get the list of Ezmaxproduct to be used in a dropdown or autocomplete control.
   * @param sSelector The type of Ezmaxproducts to return   * @param eFilterActive Specify which results we want to display.   * @param sQuery Allow to filter the returned results   * @param acceptLanguage 
  */
  public void ezmaxproductGetAutocompleteV2 (String sSelector, String eFilterActive, String sQuery, HeaderAcceptLanguage acceptLanguage, final Response.Listener<EzmaxproductGetAutocompleteV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'sSelector' is set
    if (sSelector == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'sSelector' when calling ezmaxproductGetAutocompleteV2",
        new ApiException(400, "Missing the required parameter 'sSelector' when calling ezmaxproductGetAutocompleteV2"));
    }

    // create path and map variables
    String path = "/2/object/ezmaxproduct/getAutocomplete/{sSelector}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "sSelector" + "\\}", apiInvoker.escapeString(sSelector.toString()));

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
              responseListener.onResponse((EzmaxproductGetAutocompleteV2Response) ApiInvoker.deserialize(localVarResponse,  "", EzmaxproductGetAutocompleteV2Response.class));
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
