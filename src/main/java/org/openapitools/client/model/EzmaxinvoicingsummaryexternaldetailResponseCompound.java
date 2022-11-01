/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzmaxinvoicingsummaryexternaldetailResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingsummaryexternaldetail Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryexternaldetail Object")
public class EzmaxinvoicingsummaryexternaldetailResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingsummaryexternaldetailID")
  private Integer pkiEzmaxinvoicingsummaryexternaldetailID = null;
  @SerializedName("fkiEzmaxinvoicingsummaryexternalID")
  private Integer fkiEzmaxinvoicingsummaryexternalID = null;
  @SerializedName("fkiEzmaxproductID")
  private Integer fkiEzmaxproductID = null;
  @SerializedName("sEzmaxproductDescriptionX")
  private String sEzmaxproductDescriptionX = null;
  @SerializedName("dEzmaxinvoicingsummaryexternaldetailCountreal")
  private String dEzmaxinvoicingsummaryexternaldetailCountreal = null;
  @SerializedName("dEzmaxinvoicingsummaryexternaldetailSubtotal")
  private String dEzmaxinvoicingsummaryexternaldetailSubtotal = null;
  @SerializedName("dEzmaxinvoicingsummaryexternaldetailRebate")
  private String dEzmaxinvoicingsummaryexternaldetailRebate = null;
  @SerializedName("dEzmaxinvoicingsummaryexternaldetailTotal")
  private String dEzmaxinvoicingsummaryexternaldetailTotal = null;
  @SerializedName("bEzmaxinvoicingsummaryexternaldetailAdjustment")
  private Boolean bEzmaxinvoicingsummaryexternaldetailAdjustment = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryexternaldetail
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryexternaldetail")
  public Integer getPkiEzmaxinvoicingsummaryexternaldetailID() {
    return pkiEzmaxinvoicingsummaryexternaldetailID;
  }
  public void setPkiEzmaxinvoicingsummaryexternaldetailID(Integer pkiEzmaxinvoicingsummaryexternaldetailID) {
    this.pkiEzmaxinvoicingsummaryexternaldetailID = pkiEzmaxinvoicingsummaryexternaldetailID;
  }

  /**
   * The unique ID of the Ezmaxinvoicingsummaryexternal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryexternal")
  public Integer getFkiEzmaxinvoicingsummaryexternalID() {
    return fkiEzmaxinvoicingsummaryexternalID;
  }
  public void setFkiEzmaxinvoicingsummaryexternalID(Integer fkiEzmaxinvoicingsummaryexternalID) {
    this.fkiEzmaxinvoicingsummaryexternalID = fkiEzmaxinvoicingsummaryexternalID;
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
   * The count item invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The count item invoiced for the product")
  public String getDEzmaxinvoicingsummaryexternaldetailCountreal() {
    return dEzmaxinvoicingsummaryexternaldetailCountreal;
  }
  public void setDEzmaxinvoicingsummaryexternaldetailCountreal(String dEzmaxinvoicingsummaryexternaldetailCountreal) {
    this.dEzmaxinvoicingsummaryexternaldetailCountreal = dEzmaxinvoicingsummaryexternaldetailCountreal;
  }

  /**
   * The subtotal invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The subtotal invoiced for the product")
  public String getDEzmaxinvoicingsummaryexternaldetailSubtotal() {
    return dEzmaxinvoicingsummaryexternaldetailSubtotal;
  }
  public void setDEzmaxinvoicingsummaryexternaldetailSubtotal(String dEzmaxinvoicingsummaryexternaldetailSubtotal) {
    this.dEzmaxinvoicingsummaryexternaldetailSubtotal = dEzmaxinvoicingsummaryexternaldetailSubtotal;
  }

  /**
   * The rebate for the product
   **/
  @ApiModelProperty(required = true, value = "The rebate for the product")
  public String getDEzmaxinvoicingsummaryexternaldetailRebate() {
    return dEzmaxinvoicingsummaryexternaldetailRebate;
  }
  public void setDEzmaxinvoicingsummaryexternaldetailRebate(String dEzmaxinvoicingsummaryexternaldetailRebate) {
    this.dEzmaxinvoicingsummaryexternaldetailRebate = dEzmaxinvoicingsummaryexternaldetailRebate;
  }

  /**
   * The total invoiced for the product
   **/
  @ApiModelProperty(required = true, value = "The total invoiced for the product")
  public String getDEzmaxinvoicingsummaryexternaldetailTotal() {
    return dEzmaxinvoicingsummaryexternaldetailTotal;
  }
  public void setDEzmaxinvoicingsummaryexternaldetailTotal(String dEzmaxinvoicingsummaryexternaldetailTotal) {
    this.dEzmaxinvoicingsummaryexternaldetailTotal = dEzmaxinvoicingsummaryexternaldetailTotal;
  }

  /**
   * Whether it's an adjustment
   **/
  @ApiModelProperty(required = true, value = "Whether it's an adjustment")
  public Boolean getBEzmaxinvoicingsummaryexternaldetailAdjustment() {
    return bEzmaxinvoicingsummaryexternaldetailAdjustment;
  }
  public void setBEzmaxinvoicingsummaryexternaldetailAdjustment(Boolean bEzmaxinvoicingsummaryexternaldetailAdjustment) {
    this.bEzmaxinvoicingsummaryexternaldetailAdjustment = bEzmaxinvoicingsummaryexternaldetailAdjustment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryexternaldetailResponseCompound ezmaxinvoicingsummaryexternaldetailResponseCompound = (EzmaxinvoicingsummaryexternaldetailResponseCompound) o;
    return (this.pkiEzmaxinvoicingsummaryexternaldetailID == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.pkiEzmaxinvoicingsummaryexternaldetailID == null : this.pkiEzmaxinvoicingsummaryexternaldetailID.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.pkiEzmaxinvoicingsummaryexternaldetailID)) &&
        (this.fkiEzmaxinvoicingsummaryexternalID == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.fkiEzmaxinvoicingsummaryexternalID == null : this.fkiEzmaxinvoicingsummaryexternalID.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.fkiEzmaxinvoicingsummaryexternalID)) &&
        (this.fkiEzmaxproductID == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.fkiEzmaxproductID == null : this.fkiEzmaxproductID.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.fkiEzmaxproductID)) &&
        (this.sEzmaxproductDescriptionX == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.sEzmaxproductDescriptionX == null : this.sEzmaxproductDescriptionX.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.sEzmaxproductDescriptionX)) &&
        (this.dEzmaxinvoicingsummaryexternaldetailCountreal == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailCountreal == null : this.dEzmaxinvoicingsummaryexternaldetailCountreal.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailCountreal)) &&
        (this.dEzmaxinvoicingsummaryexternaldetailSubtotal == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailSubtotal == null : this.dEzmaxinvoicingsummaryexternaldetailSubtotal.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailSubtotal)) &&
        (this.dEzmaxinvoicingsummaryexternaldetailRebate == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailRebate == null : this.dEzmaxinvoicingsummaryexternaldetailRebate.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailRebate)) &&
        (this.dEzmaxinvoicingsummaryexternaldetailTotal == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailTotal == null : this.dEzmaxinvoicingsummaryexternaldetailTotal.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.dEzmaxinvoicingsummaryexternaldetailTotal)) &&
        (this.bEzmaxinvoicingsummaryexternaldetailAdjustment == null ? ezmaxinvoicingsummaryexternaldetailResponseCompound.bEzmaxinvoicingsummaryexternaldetailAdjustment == null : this.bEzmaxinvoicingsummaryexternaldetailAdjustment.equals(ezmaxinvoicingsummaryexternaldetailResponseCompound.bEzmaxinvoicingsummaryexternaldetailAdjustment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryexternaldetailID == null ? 0: this.pkiEzmaxinvoicingsummaryexternaldetailID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingsummaryexternalID == null ? 0: this.fkiEzmaxinvoicingsummaryexternalID.hashCode());
    result = 31 * result + (this.fkiEzmaxproductID == null ? 0: this.fkiEzmaxproductID.hashCode());
    result = 31 * result + (this.sEzmaxproductDescriptionX == null ? 0: this.sEzmaxproductDescriptionX.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryexternaldetailCountreal == null ? 0: this.dEzmaxinvoicingsummaryexternaldetailCountreal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryexternaldetailSubtotal == null ? 0: this.dEzmaxinvoicingsummaryexternaldetailSubtotal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryexternaldetailRebate == null ? 0: this.dEzmaxinvoicingsummaryexternaldetailRebate.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryexternaldetailTotal == null ? 0: this.dEzmaxinvoicingsummaryexternaldetailTotal.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingsummaryexternaldetailAdjustment == null ? 0: this.bEzmaxinvoicingsummaryexternaldetailAdjustment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryexternaldetailResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryexternaldetailID: ").append(pkiEzmaxinvoicingsummaryexternaldetailID).append("\n");
    sb.append("  fkiEzmaxinvoicingsummaryexternalID: ").append(fkiEzmaxinvoicingsummaryexternalID).append("\n");
    sb.append("  fkiEzmaxproductID: ").append(fkiEzmaxproductID).append("\n");
    sb.append("  sEzmaxproductDescriptionX: ").append(sEzmaxproductDescriptionX).append("\n");
    sb.append("  dEzmaxinvoicingsummaryexternaldetailCountreal: ").append(dEzmaxinvoicingsummaryexternaldetailCountreal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryexternaldetailSubtotal: ").append(dEzmaxinvoicingsummaryexternaldetailSubtotal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryexternaldetailRebate: ").append(dEzmaxinvoicingsummaryexternaldetailRebate).append("\n");
    sb.append("  dEzmaxinvoicingsummaryexternaldetailTotal: ").append(dEzmaxinvoicingsummaryexternaldetailTotal).append("\n");
    sb.append("  bEzmaxinvoicingsummaryexternaldetailAdjustment: ").append(bEzmaxinvoicingsummaryexternaldetailAdjustment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
