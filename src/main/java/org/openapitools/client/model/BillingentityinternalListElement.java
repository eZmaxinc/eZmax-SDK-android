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
 * A Billingentityinternal List Element
 **/
@ApiModel(description = "A Billingentityinternal List Element")
public class BillingentityinternalListElement {
  
  @SerializedName("pkiBillingentityinternalID")
  private Integer pkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getPkiBillingentityinternalID() {
    return pkiBillingentityinternalID;
  }
  public void setPkiBillingentityinternalID(Integer pkiBillingentityinternalID) {
    this.pkiBillingentityinternalID = pkiBillingentityinternalID;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalListElement billingentityinternalListElement = (BillingentityinternalListElement) o;
    return (this.pkiBillingentityinternalID == null ? billingentityinternalListElement.pkiBillingentityinternalID == null : this.pkiBillingentityinternalID.equals(billingentityinternalListElement.pkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? billingentityinternalListElement.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(billingentityinternalListElement.sBillingentityinternalDescriptionX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityinternalID == null ? 0: this.pkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalListElement {\n");
    
    sb.append("  pkiBillingentityinternalID: ").append(pkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
