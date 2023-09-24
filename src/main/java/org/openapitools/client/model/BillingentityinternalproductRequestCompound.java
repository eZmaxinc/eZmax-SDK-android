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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Billingentityinternalproduct Object and children
 **/
@ApiModel(description = "A Billingentityinternalproduct Object and children")
public class BillingentityinternalproductRequestCompound {
  
  @SerializedName("pkiBillingentityinternalproductID")
  private Integer pkiBillingentityinternalproductID = null;
  @SerializedName("fkiEzmaxproductID")
  private Integer fkiEzmaxproductID = null;
  @SerializedName("fkiBillingentityexternalID")
  private Integer fkiBillingentityexternalID = null;

  /**
   * The unique ID of the Billingentityinternalproduct
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Billingentityinternalproduct")
  public Integer getPkiBillingentityinternalproductID() {
    return pkiBillingentityinternalproductID;
  }
  public void setPkiBillingentityinternalproductID(Integer pkiBillingentityinternalproductID) {
    this.pkiBillingentityinternalproductID = pkiBillingentityinternalproductID;
  }

  /**
   * The unique ID of the Ezmaxproduct
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxproduct")
  public Integer getFkiEzmaxproductID() {
    return fkiEzmaxproductID;
  }
  public void setFkiEzmaxproductID(Integer fkiEzmaxproductID) {
    this.fkiEzmaxproductID = fkiEzmaxproductID;
  }

  /**
   * The unique ID of the Billingentityexternal
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityexternal")
  public Integer getFkiBillingentityexternalID() {
    return fkiBillingentityexternalID;
  }
  public void setFkiBillingentityexternalID(Integer fkiBillingentityexternalID) {
    this.fkiBillingentityexternalID = fkiBillingentityexternalID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalproductRequestCompound billingentityinternalproductRequestCompound = (BillingentityinternalproductRequestCompound) o;
    return (this.pkiBillingentityinternalproductID == null ? billingentityinternalproductRequestCompound.pkiBillingentityinternalproductID == null : this.pkiBillingentityinternalproductID.equals(billingentityinternalproductRequestCompound.pkiBillingentityinternalproductID)) &&
        (this.fkiEzmaxproductID == null ? billingentityinternalproductRequestCompound.fkiEzmaxproductID == null : this.fkiEzmaxproductID.equals(billingentityinternalproductRequestCompound.fkiEzmaxproductID)) &&
        (this.fkiBillingentityexternalID == null ? billingentityinternalproductRequestCompound.fkiBillingentityexternalID == null : this.fkiBillingentityexternalID.equals(billingentityinternalproductRequestCompound.fkiBillingentityexternalID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityinternalproductID == null ? 0: this.pkiBillingentityinternalproductID.hashCode());
    result = 31 * result + (this.fkiEzmaxproductID == null ? 0: this.fkiEzmaxproductID.hashCode());
    result = 31 * result + (this.fkiBillingentityexternalID == null ? 0: this.fkiBillingentityexternalID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalproductRequestCompound {\n");
    
    sb.append("  pkiBillingentityinternalproductID: ").append(pkiBillingentityinternalproductID).append("\n");
    sb.append("  fkiEzmaxproductID: ").append(fkiEzmaxproductID).append("\n");
    sb.append("  fkiBillingentityexternalID: ").append(fkiBillingentityexternalID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
