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

import java.util.*;
import org.openapitools.client.model.BillingentityinternalproductRequestCompound;
import org.openapitools.client.model.MultilingualBillingentityinternalDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Billingentityinternal Object and children
 **/
@ApiModel(description = "A Billingentityinternal Object and children")
public class BillingentityinternalRequestCompound {
  
  @SerializedName("pkiBillingentityinternalID")
  private Integer pkiBillingentityinternalID = null;
  @SerializedName("objBillingentityinternalDescription")
  private MultilingualBillingentityinternalDescription objBillingentityinternalDescription = null;
  @SerializedName("a_objBillingentityinternalproduct")
  private List<BillingentityinternalproductRequestCompound> aObjBillingentityinternalproduct = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BillingentityinternalproductRequestCompound> getAObjBillingentityinternalproduct() {
    return aObjBillingentityinternalproduct;
  }
  public void setAObjBillingentityinternalproduct(List<BillingentityinternalproductRequestCompound> aObjBillingentityinternalproduct) {
    this.aObjBillingentityinternalproduct = aObjBillingentityinternalproduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalRequestCompound billingentityinternalRequestCompound = (BillingentityinternalRequestCompound) o;
    return (this.pkiBillingentityinternalID == null ? billingentityinternalRequestCompound.pkiBillingentityinternalID == null : this.pkiBillingentityinternalID.equals(billingentityinternalRequestCompound.pkiBillingentityinternalID)) &&
        (this.objBillingentityinternalDescription == null ? billingentityinternalRequestCompound.objBillingentityinternalDescription == null : this.objBillingentityinternalDescription.equals(billingentityinternalRequestCompound.objBillingentityinternalDescription)) &&
        (this.aObjBillingentityinternalproduct == null ? billingentityinternalRequestCompound.aObjBillingentityinternalproduct == null : this.aObjBillingentityinternalproduct.equals(billingentityinternalRequestCompound.aObjBillingentityinternalproduct));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityinternalID == null ? 0: this.pkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.objBillingentityinternalDescription == null ? 0: this.objBillingentityinternalDescription.hashCode());
    result = 31 * result + (this.aObjBillingentityinternalproduct == null ? 0: this.aObjBillingentityinternalproduct.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalRequestCompound {\n");
    
    sb.append("  pkiBillingentityinternalID: ").append(pkiBillingentityinternalID).append("\n");
    sb.append("  objBillingentityinternalDescription: ").append(objBillingentityinternalDescription).append("\n");
    sb.append("  aObjBillingentityinternalproduct: ").append(aObjBillingentityinternalproduct).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
