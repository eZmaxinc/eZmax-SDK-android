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

import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.SubnetCreateObjectV1Request;
import org.openapitools.client.model.SubnetCreateObjectV1Response;
import org.openapitools.client.model.SubnetDeleteObjectV1Response;
import org.openapitools.client.model.SubnetEditObjectV1Request;
import org.openapitools.client.model.SubnetEditObjectV1Response;
import org.openapitools.client.model.SubnetGetObjectV2Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ObjectSubnetApi {
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
  * Create a new Subnet
  * The endpoint allows to create one or many elements at once.
   * @param subnetCreateObjectV1Request 
   * @return SubnetCreateObjectV1Response
  */
  public SubnetCreateObjectV1Response subnetCreateObjectV1 (SubnetCreateObjectV1Request subnetCreateObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = subnetCreateObjectV1Request;
    // verify the required parameter 'subnetCreateObjectV1Request' is set
    if (subnetCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subnetCreateObjectV1Request' when calling subnetCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'subnetCreateObjectV1Request' when calling subnetCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet";

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
         return (SubnetCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", SubnetCreateObjectV1Response.class);
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
   * Create a new Subnet
   * The endpoint allows to create one or many elements at once.
   * @param subnetCreateObjectV1Request 
  */
  public void subnetCreateObjectV1 (SubnetCreateObjectV1Request subnetCreateObjectV1Request, final Response.Listener<SubnetCreateObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = subnetCreateObjectV1Request;

    // verify the required parameter 'subnetCreateObjectV1Request' is set
    if (subnetCreateObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subnetCreateObjectV1Request' when calling subnetCreateObjectV1",
        new ApiException(400, "Missing the required parameter 'subnetCreateObjectV1Request' when calling subnetCreateObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SubnetCreateObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", SubnetCreateObjectV1Response.class));
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
  * Delete an existing Subnet
  * 
   * @param pkiSubnetID The unique ID of the Subnet
   * @return SubnetDeleteObjectV1Response
  */
  public SubnetDeleteObjectV1Response subnetDeleteObjectV1 (Integer pkiSubnetID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet/{pkiSubnetID}".replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
         return (SubnetDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", SubnetDeleteObjectV1Response.class);
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
   * Delete an existing Subnet
   * 
   * @param pkiSubnetID The unique ID of the Subnet
  */
  public void subnetDeleteObjectV1 (Integer pkiSubnetID, final Response.Listener<SubnetDeleteObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetDeleteObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetDeleteObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet/{pkiSubnetID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
              responseListener.onResponse((SubnetDeleteObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", SubnetDeleteObjectV1Response.class));
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
  * Edit an existing Subnet
  * 
   * @param pkiSubnetID The unique ID of the Subnet
   * @param subnetEditObjectV1Request 
   * @return SubnetEditObjectV1Response
  */
  public SubnetEditObjectV1Response subnetEditObjectV1 (Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = subnetEditObjectV1Request;
    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetEditObjectV1"));
    }
    // verify the required parameter 'subnetEditObjectV1Request' is set
    if (subnetEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subnetEditObjectV1Request' when calling subnetEditObjectV1",
        new ApiException(400, "Missing the required parameter 'subnetEditObjectV1Request' when calling subnetEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet/{pkiSubnetID}".replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
         return (SubnetEditObjectV1Response) ApiInvoker.deserialize(localVarResponse, "", SubnetEditObjectV1Response.class);
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
   * Edit an existing Subnet
   * 
   * @param pkiSubnetID The unique ID of the Subnet   * @param subnetEditObjectV1Request 
  */
  public void subnetEditObjectV1 (Integer pkiSubnetID, SubnetEditObjectV1Request subnetEditObjectV1Request, final Response.Listener<SubnetEditObjectV1Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = subnetEditObjectV1Request;

    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetEditObjectV1",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetEditObjectV1"));
    }
    // verify the required parameter 'subnetEditObjectV1Request' is set
    if (subnetEditObjectV1Request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subnetEditObjectV1Request' when calling subnetEditObjectV1",
        new ApiException(400, "Missing the required parameter 'subnetEditObjectV1Request' when calling subnetEditObjectV1"));
    }

    // create path and map variables
    String path = "/1/object/subnet/{pkiSubnetID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
              responseListener.onResponse((SubnetEditObjectV1Response) ApiInvoker.deserialize(localVarResponse,  "", SubnetEditObjectV1Response.class));
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
  * Retrieve an existing Subnet
  * 
   * @param pkiSubnetID The unique ID of the Subnet
   * @return SubnetGetObjectV2Response
  */
  public SubnetGetObjectV2Response subnetGetObjectV2 (Integer pkiSubnetID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/subnet/{pkiSubnetID}".replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
         return (SubnetGetObjectV2Response) ApiInvoker.deserialize(localVarResponse, "", SubnetGetObjectV2Response.class);
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
   * Retrieve an existing Subnet
   * 
   * @param pkiSubnetID The unique ID of the Subnet
  */
  public void subnetGetObjectV2 (Integer pkiSubnetID, final Response.Listener<SubnetGetObjectV2Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'pkiSubnetID' is set
    if (pkiSubnetID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'pkiSubnetID' when calling subnetGetObjectV2",
        new ApiException(400, "Missing the required parameter 'pkiSubnetID' when calling subnetGetObjectV2"));
    }

    // create path and map variables
    String path = "/2/object/subnet/{pkiSubnetID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "pkiSubnetID" + "\\}", apiInvoker.escapeString(pkiSubnetID.toString()));

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
              responseListener.onResponse((SubnetGetObjectV2Response) ApiInvoker.deserialize(localVarResponse,  "", SubnetGetObjectV2Response.class));
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
