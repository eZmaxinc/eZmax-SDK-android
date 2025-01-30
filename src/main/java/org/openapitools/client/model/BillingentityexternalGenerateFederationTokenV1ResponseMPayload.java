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

package org.openapitools.client.model;

import org.openapitools.client.model.CustomApikeyfederation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken
 **/
@ApiModel(description = "Payload for POST /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken")
public class BillingentityexternalGenerateFederationTokenV1ResponseMPayload {
  
  @SerializedName("objApikeyfederation")
  private CustomApikeyfederation objApikeyfederation = null;
  @SerializedName("sEzmaxcustomercodeUrl")
  private String sEzmaxcustomercodeUrl = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomApikeyfederation getObjApikeyfederation() {
    return objApikeyfederation;
  }
  public void setObjApikeyfederation(CustomApikeyfederation objApikeyfederation) {
    this.objApikeyfederation = objApikeyfederation;
  }

  /**
   * The url of the server the Ezmaxcustomer is located
   **/
  @ApiModelProperty(required = true, value = "The url of the server the Ezmaxcustomer is located")
  public String getSEzmaxcustomercodeUrl() {
    return sEzmaxcustomercodeUrl;
  }
  public void setSEzmaxcustomercodeUrl(String sEzmaxcustomercodeUrl) {
    this.sEzmaxcustomercodeUrl = sEzmaxcustomercodeUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityexternalGenerateFederationTokenV1ResponseMPayload billingentityexternalGenerateFederationTokenV1ResponseMPayload = (BillingentityexternalGenerateFederationTokenV1ResponseMPayload) o;
    return (this.objApikeyfederation == null ? billingentityexternalGenerateFederationTokenV1ResponseMPayload.objApikeyfederation == null : this.objApikeyfederation.equals(billingentityexternalGenerateFederationTokenV1ResponseMPayload.objApikeyfederation)) &&
        (this.sEzmaxcustomercodeUrl == null ? billingentityexternalGenerateFederationTokenV1ResponseMPayload.sEzmaxcustomercodeUrl == null : this.sEzmaxcustomercodeUrl.equals(billingentityexternalGenerateFederationTokenV1ResponseMPayload.sEzmaxcustomercodeUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objApikeyfederation == null ? 0: this.objApikeyfederation.hashCode());
    result = 31 * result + (this.sEzmaxcustomercodeUrl == null ? 0: this.sEzmaxcustomercodeUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityexternalGenerateFederationTokenV1ResponseMPayload {\n");
    
    sb.append("  objApikeyfederation: ").append(objApikeyfederation).append("\n");
    sb.append("  sEzmaxcustomercodeUrl: ").append(sEzmaxcustomercodeUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
