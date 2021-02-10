/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for the /1/customer/{pksCustomerCode}/endpoint API Request
 **/
@ApiModel(description = "Response for the /1/customer/{pksCustomerCode}/endpoint API Request")
public class GlobalCustomerGetEndpointV1Response {
  
  @SerializedName("sEndpointURL")
  private String sEndpointURL = null;

  /**
   * The endpoint's URL
   **/
  @ApiModelProperty(required = true, value = "The endpoint's URL")
  public String getSEndpointURL() {
    return sEndpointURL;
  }
  public void setSEndpointURL(String sEndpointURL) {
    this.sEndpointURL = sEndpointURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1Response = (GlobalCustomerGetEndpointV1Response) o;
    return (this.sEndpointURL == null ? globalCustomerGetEndpointV1Response.sEndpointURL == null : this.sEndpointURL.equals(globalCustomerGetEndpointV1Response.sEndpointURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEndpointURL == null ? 0: this.sEndpointURL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCustomerGetEndpointV1Response {\n");
    
    sb.append("  sEndpointURL: ").append(sEndpointURL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
