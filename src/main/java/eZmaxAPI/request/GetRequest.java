/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.28
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package eZmaxAPI.request;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetRequest extends StringRequest{
  Map<String, String> apiHeaders;
  String contentType;

  public GetRequest(String url, Map<String, String> apiHeaders, String contentType, Response.Listener<String> listener, Response.ErrorListener errorListener) {
    super(Method.GET, url, listener, errorListener);
    this.apiHeaders = apiHeaders;
    this.contentType = contentType;
  }

  /* (non-Javadoc)
  * @see com.android.volley.Request#getHeaders()
  */
  @Override
  public Map<String, String> getHeaders() throws AuthFailureError {
    Map<String, String> headers = super.getHeaders();
    if (headers == null || headers.equals(Collections.emptyMap())) {
      headers = new HashMap<String, String>();
    }
    if (apiHeaders != null && !apiHeaders.equals(Collections.emptyMap())) {
      headers.putAll(apiHeaders);
    }
    if(contentType != null) {
      headers.put("Content-Type", contentType);
    }

    return headers;
  }
}
