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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/apikey/{pkiApikeyID}/regenerate
 **/
@ApiModel(description = "Request for POST /1/object/apikey/{pkiApikeyID}/regenerate")
public class ApikeyRegenerateV1Request {
  
  @SerializedName("bApikeyIssigned")
  private Boolean bApikeyIssigned = null;

  /**
   * Whether the apikey is signed or not
   **/
  @ApiModelProperty(value = "Whether the apikey is signed or not")
  public Boolean getBApikeyIssigned() {
    return bApikeyIssigned;
  }
  public void setBApikeyIssigned(Boolean bApikeyIssigned) {
    this.bApikeyIssigned = bApikeyIssigned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyRegenerateV1Request apikeyRegenerateV1Request = (ApikeyRegenerateV1Request) o;
    return (this.bApikeyIssigned == null ? apikeyRegenerateV1Request.bApikeyIssigned == null : this.bApikeyIssigned.equals(apikeyRegenerateV1Request.bApikeyIssigned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bApikeyIssigned == null ? 0: this.bApikeyIssigned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRegenerateV1Request {\n");
    
    sb.append("  bApikeyIssigned: ").append(bApikeyIssigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
