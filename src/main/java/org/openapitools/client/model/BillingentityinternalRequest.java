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

import org.openapitools.client.model.MultilingualBillingentityinternalDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Billingentityinternal Object
 **/
@ApiModel(description = "A Billingentityinternal Object")
public class BillingentityinternalRequest {
  
  @SerializedName("pkiBillingentityinternalID")
  private Integer pkiBillingentityinternalID = null;
  @SerializedName("objBillingentityinternalDescription")
  private MultilingualBillingentityinternalDescription objBillingentityinternalDescription = null;

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Billingentityinternal.")
  public Integer getPkiBillingentityinternalID() {
    return pkiBillingentityinternalID;
  }
  public void setPkiBillingentityinternalID(Integer pkiBillingentityinternalID) {
    this.pkiBillingentityinternalID = pkiBillingentityinternalID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualBillingentityinternalDescription getObjBillingentityinternalDescription() {
    return objBillingentityinternalDescription;
  }
  public void setObjBillingentityinternalDescription(MultilingualBillingentityinternalDescription objBillingentityinternalDescription) {
    this.objBillingentityinternalDescription = objBillingentityinternalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalRequest billingentityinternalRequest = (BillingentityinternalRequest) o;
    return (this.pkiBillingentityinternalID == null ? billingentityinternalRequest.pkiBillingentityinternalID == null : this.pkiBillingentityinternalID.equals(billingentityinternalRequest.pkiBillingentityinternalID)) &&
        (this.objBillingentityinternalDescription == null ? billingentityinternalRequest.objBillingentityinternalDescription == null : this.objBillingentityinternalDescription.equals(billingentityinternalRequest.objBillingentityinternalDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityinternalID == null ? 0: this.pkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.objBillingentityinternalDescription == null ? 0: this.objBillingentityinternalDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalRequest {\n");
    
    sb.append("  pkiBillingentityinternalID: ").append(pkiBillingentityinternalID).append("\n");
    sb.append("  objBillingentityinternalDescription: ").append(objBillingentityinternalDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
