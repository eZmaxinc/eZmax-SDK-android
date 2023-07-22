/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * A Billingentityinternalproduct Object
 **/
@ApiModel(description = "A Billingentityinternalproduct Object")
public class BillingentityinternalproductResponseCompound {
  
  @SerializedName("pkiBillingentityinternalproductID")
  private Integer pkiBillingentityinternalproductID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("fkiEzmaxproductID")
  private Integer fkiEzmaxproductID = null;
  @SerializedName("sEzmaxproductDescriptionX")
  private String sEzmaxproductDescriptionX = null;
  @SerializedName("fkiBillingentityexternalID")
  private Integer fkiBillingentityexternalID = null;
  @SerializedName("sBillingentityexternalDescription")
  private String sBillingentityexternalDescription = null;

  /**
   * The unique ID of the Billingentityinternalproduct
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternalproduct")
  public Integer getPkiBillingentityinternalproductID() {
    return pkiBillingentityinternalproductID;
  }
  public void setPkiBillingentityinternalproductID(Integer pkiBillingentityinternalproductID) {
    this.pkiBillingentityinternalproductID = pkiBillingentityinternalproductID;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
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
   * The description of the Ezmaxproduct in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezmaxproduct in the language of the requester")
  public String getSEzmaxproductDescriptionX() {
    return sEzmaxproductDescriptionX;
  }
  public void setSEzmaxproductDescriptionX(String sEzmaxproductDescriptionX) {
    this.sEzmaxproductDescriptionX = sEzmaxproductDescriptionX;
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

  /**
   * The description of the Billingentityexternal
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityexternal")
  public String getSBillingentityexternalDescription() {
    return sBillingentityexternalDescription;
  }
  public void setSBillingentityexternalDescription(String sBillingentityexternalDescription) {
    this.sBillingentityexternalDescription = sBillingentityexternalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalproductResponseCompound billingentityinternalproductResponseCompound = (BillingentityinternalproductResponseCompound) o;
    return (this.pkiBillingentityinternalproductID == null ? billingentityinternalproductResponseCompound.pkiBillingentityinternalproductID == null : this.pkiBillingentityinternalproductID.equals(billingentityinternalproductResponseCompound.pkiBillingentityinternalproductID)) &&
        (this.fkiBillingentityinternalID == null ? billingentityinternalproductResponseCompound.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(billingentityinternalproductResponseCompound.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? billingentityinternalproductResponseCompound.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(billingentityinternalproductResponseCompound.sBillingentityinternalDescriptionX)) &&
        (this.fkiEzmaxproductID == null ? billingentityinternalproductResponseCompound.fkiEzmaxproductID == null : this.fkiEzmaxproductID.equals(billingentityinternalproductResponseCompound.fkiEzmaxproductID)) &&
        (this.sEzmaxproductDescriptionX == null ? billingentityinternalproductResponseCompound.sEzmaxproductDescriptionX == null : this.sEzmaxproductDescriptionX.equals(billingentityinternalproductResponseCompound.sEzmaxproductDescriptionX)) &&
        (this.fkiBillingentityexternalID == null ? billingentityinternalproductResponseCompound.fkiBillingentityexternalID == null : this.fkiBillingentityexternalID.equals(billingentityinternalproductResponseCompound.fkiBillingentityexternalID)) &&
        (this.sBillingentityexternalDescription == null ? billingentityinternalproductResponseCompound.sBillingentityexternalDescription == null : this.sBillingentityexternalDescription.equals(billingentityinternalproductResponseCompound.sBillingentityexternalDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityinternalproductID == null ? 0: this.pkiBillingentityinternalproductID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiEzmaxproductID == null ? 0: this.fkiEzmaxproductID.hashCode());
    result = 31 * result + (this.sEzmaxproductDescriptionX == null ? 0: this.sEzmaxproductDescriptionX.hashCode());
    result = 31 * result + (this.fkiBillingentityexternalID == null ? 0: this.fkiBillingentityexternalID.hashCode());
    result = 31 * result + (this.sBillingentityexternalDescription == null ? 0: this.sBillingentityexternalDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalproductResponseCompound {\n");
    
    sb.append("  pkiBillingentityinternalproductID: ").append(pkiBillingentityinternalproductID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  fkiEzmaxproductID: ").append(fkiEzmaxproductID).append("\n");
    sb.append("  sEzmaxproductDescriptionX: ").append(sEzmaxproductDescriptionX).append("\n");
    sb.append("  fkiBillingentityexternalID: ").append(fkiBillingentityexternalID).append("\n");
    sb.append("  sBillingentityexternalDescription: ").append(sBillingentityexternalDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}