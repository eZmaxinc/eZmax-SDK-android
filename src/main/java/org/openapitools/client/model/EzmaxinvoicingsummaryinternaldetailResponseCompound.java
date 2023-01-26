/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Ezmaxinvoicingsummaryinternaldetail Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryinternaldetail Object")
public class EzmaxinvoicingsummaryinternaldetailResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingsummaryinternaldetailID")
  private Integer pkiEzmaxinvoicingsummaryinternaldetailID = null;
  @SerializedName("fkiEzmaxinvoicingsummaryinternalID")
  private Integer fkiEzmaxinvoicingsummaryinternalID = null;
  @SerializedName("fkiEzmaxproductID")
  private Integer fkiEzmaxproductID = null;
  @SerializedName("sEzmaxproductDescriptionX")
  private String sEzmaxproductDescriptionX = null;
  @SerializedName("fkiBillingentityexternalID")
  private Integer fkiBillingentityexternalID = null;
  @SerializedName("sBillingentityexternalDescription")
  private String sBillingentityexternalDescription = null;
  @SerializedName("dEzmaxinvoicingsummaryinternaldetailCountreal")
  private String dEzmaxinvoicingsummaryinternaldetailCountreal = null;
  @SerializedName("dEzmaxinvoicingsummaryinternaldetailSubtotal")
  private String dEzmaxinvoicingsummaryinternaldetailSubtotal = null;
  @SerializedName("dEzmaxinvoicingsummaryinternaldetailRebate")
  private String dEzmaxinvoicingsummaryinternaldetailRebate = null;
  @SerializedName("dEzmaxinvoicingsummaryinternaldetailTotal")
  private String dEzmaxinvoicingsummaryinternaldetailTotal = null;
  @SerializedName("bEzmaxinvoicingsummaryinternaldetailAdjustment")
  private Boolean bEzmaxinvoicingsummaryinternaldetailAdjustment = null;
  @SerializedName("tEzmaxproductHelpX")
  private String tEzmaxproductHelpX = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryinternaldetail
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryinternaldetail")
  public Integer getPkiEzmaxinvoicingsummaryinternaldetailID() {
    return pkiEzmaxinvoicingsummaryinternaldetailID;
  }
  public void setPkiEzmaxinvoicingsummaryinternaldetailID(Integer pkiEzmaxinvoicingsummaryinternaldetailID) {
    this.pkiEzmaxinvoicingsummaryinternaldetailID = pkiEzmaxinvoicingsummaryinternaldetailID;
  }

  /**
   * The unique ID of the Ezmaxinvoicingsummaryinternal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryinternal")
  public Integer getFkiEzmaxinvoicingsummaryinternalID() {
    return fkiEzmaxinvoicingsummaryinternalID;
  }
  public void setFkiEzmaxinvoicingsummaryinternalID(Integer fkiEzmaxinvoicingsummaryinternalID) {
    this.fkiEzmaxinvoicingsummaryinternalID = fkiEzmaxinvoicingsummaryinternalID;
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

  /**
   * The count item invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The count item invoiced for the product")
  public String getDEzmaxinvoicingsummaryinternaldetailCountreal() {
    return dEzmaxinvoicingsummaryinternaldetailCountreal;
  }
  public void setDEzmaxinvoicingsummaryinternaldetailCountreal(String dEzmaxinvoicingsummaryinternaldetailCountreal) {
    this.dEzmaxinvoicingsummaryinternaldetailCountreal = dEzmaxinvoicingsummaryinternaldetailCountreal;
  }

  /**
   * The subtotal invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The subtotal invoiced for the product")
  public String getDEzmaxinvoicingsummaryinternaldetailSubtotal() {
    return dEzmaxinvoicingsummaryinternaldetailSubtotal;
  }
  public void setDEzmaxinvoicingsummaryinternaldetailSubtotal(String dEzmaxinvoicingsummaryinternaldetailSubtotal) {
    this.dEzmaxinvoicingsummaryinternaldetailSubtotal = dEzmaxinvoicingsummaryinternaldetailSubtotal;
  }

  /**
   * The rebate for the product
   **/
  @ApiModelProperty(required = true, value = "The rebate for the product")
  public String getDEzmaxinvoicingsummaryinternaldetailRebate() {
    return dEzmaxinvoicingsummaryinternaldetailRebate;
  }
  public void setDEzmaxinvoicingsummaryinternaldetailRebate(String dEzmaxinvoicingsummaryinternaldetailRebate) {
    this.dEzmaxinvoicingsummaryinternaldetailRebate = dEzmaxinvoicingsummaryinternaldetailRebate;
  }

  /**
   * The total invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The total invoiced for the product")
  public String getDEzmaxinvoicingsummaryinternaldetailTotal() {
    return dEzmaxinvoicingsummaryinternaldetailTotal;
  }
  public void setDEzmaxinvoicingsummaryinternaldetailTotal(String dEzmaxinvoicingsummaryinternaldetailTotal) {
    this.dEzmaxinvoicingsummaryinternaldetailTotal = dEzmaxinvoicingsummaryinternaldetailTotal;
  }

  /**
   * Whether if it's an adjustment
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an adjustment")
  public Boolean getBEzmaxinvoicingsummaryinternaldetailAdjustment() {
    return bEzmaxinvoicingsummaryinternaldetailAdjustment;
  }
  public void setBEzmaxinvoicingsummaryinternaldetailAdjustment(Boolean bEzmaxinvoicingsummaryinternaldetailAdjustment) {
    this.bEzmaxinvoicingsummaryinternaldetailAdjustment = bEzmaxinvoicingsummaryinternaldetailAdjustment;
  }

  /**
   * The help message of the Ezmaxproduct in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The help message of the Ezmaxproduct in the language of the requester")
  public String getTEzmaxproductHelpX() {
    return tEzmaxproductHelpX;
  }
  public void setTEzmaxproductHelpX(String tEzmaxproductHelpX) {
    this.tEzmaxproductHelpX = tEzmaxproductHelpX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryinternaldetailResponseCompound ezmaxinvoicingsummaryinternaldetailResponseCompound = (EzmaxinvoicingsummaryinternaldetailResponseCompound) o;
    return (this.pkiEzmaxinvoicingsummaryinternaldetailID == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.pkiEzmaxinvoicingsummaryinternaldetailID == null : this.pkiEzmaxinvoicingsummaryinternaldetailID.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.pkiEzmaxinvoicingsummaryinternaldetailID)) &&
        (this.fkiEzmaxinvoicingsummaryinternalID == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiEzmaxinvoicingsummaryinternalID == null : this.fkiEzmaxinvoicingsummaryinternalID.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiEzmaxinvoicingsummaryinternalID)) &&
        (this.fkiEzmaxproductID == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiEzmaxproductID == null : this.fkiEzmaxproductID.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiEzmaxproductID)) &&
        (this.sEzmaxproductDescriptionX == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.sEzmaxproductDescriptionX == null : this.sEzmaxproductDescriptionX.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.sEzmaxproductDescriptionX)) &&
        (this.fkiBillingentityexternalID == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiBillingentityexternalID == null : this.fkiBillingentityexternalID.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.fkiBillingentityexternalID)) &&
        (this.sBillingentityexternalDescription == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.sBillingentityexternalDescription == null : this.sBillingentityexternalDescription.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.sBillingentityexternalDescription)) &&
        (this.dEzmaxinvoicingsummaryinternaldetailCountreal == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailCountreal == null : this.dEzmaxinvoicingsummaryinternaldetailCountreal.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailCountreal)) &&
        (this.dEzmaxinvoicingsummaryinternaldetailSubtotal == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailSubtotal == null : this.dEzmaxinvoicingsummaryinternaldetailSubtotal.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailSubtotal)) &&
        (this.dEzmaxinvoicingsummaryinternaldetailRebate == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailRebate == null : this.dEzmaxinvoicingsummaryinternaldetailRebate.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailRebate)) &&
        (this.dEzmaxinvoicingsummaryinternaldetailTotal == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailTotal == null : this.dEzmaxinvoicingsummaryinternaldetailTotal.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.dEzmaxinvoicingsummaryinternaldetailTotal)) &&
        (this.bEzmaxinvoicingsummaryinternaldetailAdjustment == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.bEzmaxinvoicingsummaryinternaldetailAdjustment == null : this.bEzmaxinvoicingsummaryinternaldetailAdjustment.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.bEzmaxinvoicingsummaryinternaldetailAdjustment)) &&
        (this.tEzmaxproductHelpX == null ? ezmaxinvoicingsummaryinternaldetailResponseCompound.tEzmaxproductHelpX == null : this.tEzmaxproductHelpX.equals(ezmaxinvoicingsummaryinternaldetailResponseCompound.tEzmaxproductHelpX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryinternaldetailID == null ? 0: this.pkiEzmaxinvoicingsummaryinternaldetailID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingsummaryinternalID == null ? 0: this.fkiEzmaxinvoicingsummaryinternalID.hashCode());
    result = 31 * result + (this.fkiEzmaxproductID == null ? 0: this.fkiEzmaxproductID.hashCode());
    result = 31 * result + (this.sEzmaxproductDescriptionX == null ? 0: this.sEzmaxproductDescriptionX.hashCode());
    result = 31 * result + (this.fkiBillingentityexternalID == null ? 0: this.fkiBillingentityexternalID.hashCode());
    result = 31 * result + (this.sBillingentityexternalDescription == null ? 0: this.sBillingentityexternalDescription.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryinternaldetailCountreal == null ? 0: this.dEzmaxinvoicingsummaryinternaldetailCountreal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryinternaldetailSubtotal == null ? 0: this.dEzmaxinvoicingsummaryinternaldetailSubtotal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryinternaldetailRebate == null ? 0: this.dEzmaxinvoicingsummaryinternaldetailRebate.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryinternaldetailTotal == null ? 0: this.dEzmaxinvoicingsummaryinternaldetailTotal.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingsummaryinternaldetailAdjustment == null ? 0: this.bEzmaxinvoicingsummaryinternaldetailAdjustment.hashCode());
    result = 31 * result + (this.tEzmaxproductHelpX == null ? 0: this.tEzmaxproductHelpX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryinternaldetailResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryinternaldetailID: ").append(pkiEzmaxinvoicingsummaryinternaldetailID).append("\n");
    sb.append("  fkiEzmaxinvoicingsummaryinternalID: ").append(fkiEzmaxinvoicingsummaryinternalID).append("\n");
    sb.append("  fkiEzmaxproductID: ").append(fkiEzmaxproductID).append("\n");
    sb.append("  sEzmaxproductDescriptionX: ").append(sEzmaxproductDescriptionX).append("\n");
    sb.append("  fkiBillingentityexternalID: ").append(fkiBillingentityexternalID).append("\n");
    sb.append("  sBillingentityexternalDescription: ").append(sBillingentityexternalDescription).append("\n");
    sb.append("  dEzmaxinvoicingsummaryinternaldetailCountreal: ").append(dEzmaxinvoicingsummaryinternaldetailCountreal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryinternaldetailSubtotal: ").append(dEzmaxinvoicingsummaryinternaldetailSubtotal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryinternaldetailRebate: ").append(dEzmaxinvoicingsummaryinternaldetailRebate).append("\n");
    sb.append("  dEzmaxinvoicingsummaryinternaldetailTotal: ").append(dEzmaxinvoicingsummaryinternaldetailTotal).append("\n");
    sb.append("  bEzmaxinvoicingsummaryinternaldetailAdjustment: ").append(bEzmaxinvoicingsummaryinternaldetailAdjustment).append("\n");
    sb.append("  tEzmaxproductHelpX: ").append(tEzmaxproductHelpX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
