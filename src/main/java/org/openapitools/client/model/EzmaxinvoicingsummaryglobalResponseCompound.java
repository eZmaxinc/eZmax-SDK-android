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

import java.util.*;
import org.openapitools.client.model.EzmaxinvoicingcommissionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingsummaryglobal Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryglobal Object")
public class EzmaxinvoicingsummaryglobalResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingsummaryglobalID")
  private Integer pkiEzmaxinvoicingsummaryglobalID = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiEzmaxproductID")
  private Integer fkiEzmaxproductID = null;
  @SerializedName("sEzmaxproductDescriptionX")
  private String sEzmaxproductDescriptionX = null;
  @SerializedName("dtEzmaxinvoicingsummaryglobalStart")
  private String dtEzmaxinvoicingsummaryglobalStart = null;
  @SerializedName("dtEzmaxinvoicingsummaryglobalEnd")
  private String dtEzmaxinvoicingsummaryglobalEnd = null;
  @SerializedName("iEzmaxinvoicingsummaryglobalDays")
  private Integer iEzmaxinvoicingsummaryglobalDays = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalCountreal")
  private String dEzmaxinvoicingsummaryglobalCountreal = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalCountbilled")
  private String dEzmaxinvoicingsummaryglobalCountbilled = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalSubtotal")
  private String dEzmaxinvoicingsummaryglobalSubtotal = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalRebateamount")
  private String dEzmaxinvoicingsummaryglobalRebateamount = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalRebatepercent")
  private String dEzmaxinvoicingsummaryglobalRebatepercent = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalRebatetotal")
  private String dEzmaxinvoicingsummaryglobalRebatetotal = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalTotal")
  private String dEzmaxinvoicingsummaryglobalTotal = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalRepresentative")
  private String dEzmaxinvoicingsummaryglobalRepresentative = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalPartner")
  private String dEzmaxinvoicingsummaryglobalPartner = null;
  @SerializedName("dEzmaxinvoicingsummaryglobalNet")
  private String dEzmaxinvoicingsummaryglobalNet = null;
  @SerializedName("bEzmaxinvoicingsummaryglobalAdjustment")
  private Boolean bEzmaxinvoicingsummaryglobalAdjustment = null;
  @SerializedName("tEzmaxproductHelpX")
  private String tEzmaxproductHelpX = null;
  @SerializedName("a_objEzmaxinvoicingcommission")
  private List<EzmaxinvoicingcommissionResponseCompound> aObjEzmaxinvoicingcommission = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryglobal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryglobal")
  public Integer getPkiEzmaxinvoicingsummaryglobalID() {
    return pkiEzmaxinvoicingsummaryglobalID;
  }
  public void setPkiEzmaxinvoicingsummaryglobalID(Integer pkiEzmaxinvoicingsummaryglobalID) {
    this.pkiEzmaxinvoicingsummaryglobalID = pkiEzmaxinvoicingsummaryglobalID;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicing")
  public Integer getFkiEzmaxinvoicingID() {
    return fkiEzmaxinvoicingID;
  }
  public void setFkiEzmaxinvoicingID(Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
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
   * The start date for the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "The start date for the Ezmaxinvoicingsummaryglobal")
  public String getDtEzmaxinvoicingsummaryglobalStart() {
    return dtEzmaxinvoicingsummaryglobalStart;
  }
  public void setDtEzmaxinvoicingsummaryglobalStart(String dtEzmaxinvoicingsummaryglobalStart) {
    this.dtEzmaxinvoicingsummaryglobalStart = dtEzmaxinvoicingsummaryglobalStart;
  }

  /**
   * The end date for the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "The end date for the Ezmaxinvoicingsummaryglobal")
  public String getDtEzmaxinvoicingsummaryglobalEnd() {
    return dtEzmaxinvoicingsummaryglobalEnd;
  }
  public void setDtEzmaxinvoicingsummaryglobalEnd(String dtEzmaxinvoicingsummaryglobalEnd) {
    this.dtEzmaxinvoicingsummaryglobalEnd = dtEzmaxinvoicingsummaryglobalEnd;
  }

  /**
   * The number of days for the Ezmaxinvoicingsummaryglobal
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The number of days for the Ezmaxinvoicingsummaryglobal")
  public Integer getIEzmaxinvoicingsummaryglobalDays() {
    return iEzmaxinvoicingsummaryglobalDays;
  }
  public void setIEzmaxinvoicingsummaryglobalDays(Integer iEzmaxinvoicingsummaryglobalDays) {
    this.iEzmaxinvoicingsummaryglobalDays = iEzmaxinvoicingsummaryglobalDays;
  }

  /**
   * The count item calculated
   **/
  @ApiModelProperty(required = true, value = "The count item calculated")
  public String getDEzmaxinvoicingsummaryglobalCountreal() {
    return dEzmaxinvoicingsummaryglobalCountreal;
  }
  public void setDEzmaxinvoicingsummaryglobalCountreal(String dEzmaxinvoicingsummaryglobalCountreal) {
    this.dEzmaxinvoicingsummaryglobalCountreal = dEzmaxinvoicingsummaryglobalCountreal;
  }

  /**
   * The count item billed
   **/
  @ApiModelProperty(required = true, value = "The count item billed")
  public String getDEzmaxinvoicingsummaryglobalCountbilled() {
    return dEzmaxinvoicingsummaryglobalCountbilled;
  }
  public void setDEzmaxinvoicingsummaryglobalCountbilled(String dEzmaxinvoicingsummaryglobalCountbilled) {
    this.dEzmaxinvoicingsummaryglobalCountbilled = dEzmaxinvoicingsummaryglobalCountbilled;
  }

  /**
   * The Ezmaxinvoicingsummaryglobal subtotal
   **/
  @ApiModelProperty(required = true, value = "The Ezmaxinvoicingsummaryglobal subtotal")
  public String getDEzmaxinvoicingsummaryglobalSubtotal() {
    return dEzmaxinvoicingsummaryglobalSubtotal;
  }
  public void setDEzmaxinvoicingsummaryglobalSubtotal(String dEzmaxinvoicingsummaryglobalSubtotal) {
    this.dEzmaxinvoicingsummaryglobalSubtotal = dEzmaxinvoicingsummaryglobalSubtotal;
  }

  /**
   * The rebate amount for the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "The rebate amount for the Ezmaxinvoicingsummaryglobal")
  public String getDEzmaxinvoicingsummaryglobalRebateamount() {
    return dEzmaxinvoicingsummaryglobalRebateamount;
  }
  public void setDEzmaxinvoicingsummaryglobalRebateamount(String dEzmaxinvoicingsummaryglobalRebateamount) {
    this.dEzmaxinvoicingsummaryglobalRebateamount = dEzmaxinvoicingsummaryglobalRebateamount;
  }

  /**
   * The rebate percentage of the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "The rebate percentage of the Ezmaxinvoicingsummaryglobal")
  public String getDEzmaxinvoicingsummaryglobalRebatepercent() {
    return dEzmaxinvoicingsummaryglobalRebatepercent;
  }
  public void setDEzmaxinvoicingsummaryglobalRebatepercent(String dEzmaxinvoicingsummaryglobalRebatepercent) {
    this.dEzmaxinvoicingsummaryglobalRebatepercent = dEzmaxinvoicingsummaryglobalRebatepercent;
  }

  /**
   * The rebate amount total for the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "The rebate amount total for the Ezmaxinvoicingsummaryglobal")
  public String getDEzmaxinvoicingsummaryglobalRebatetotal() {
    return dEzmaxinvoicingsummaryglobalRebatetotal;
  }
  public void setDEzmaxinvoicingsummaryglobalRebatetotal(String dEzmaxinvoicingsummaryglobalRebatetotal) {
    this.dEzmaxinvoicingsummaryglobalRebatetotal = dEzmaxinvoicingsummaryglobalRebatetotal;
  }

  /**
   * The Ezmaxinvoicingsummaryglobal total
   **/
  @ApiModelProperty(required = true, value = "The Ezmaxinvoicingsummaryglobal total")
  public String getDEzmaxinvoicingsummaryglobalTotal() {
    return dEzmaxinvoicingsummaryglobalTotal;
  }
  public void setDEzmaxinvoicingsummaryglobalTotal(String dEzmaxinvoicingsummaryglobalTotal) {
    this.dEzmaxinvoicingsummaryglobalTotal = dEzmaxinvoicingsummaryglobalTotal;
  }

  /**
   * The amount of commission for the representative
   **/
  @ApiModelProperty(value = "The amount of commission for the representative")
  public String getDEzmaxinvoicingsummaryglobalRepresentative() {
    return dEzmaxinvoicingsummaryglobalRepresentative;
  }
  public void setDEzmaxinvoicingsummaryglobalRepresentative(String dEzmaxinvoicingsummaryglobalRepresentative) {
    this.dEzmaxinvoicingsummaryglobalRepresentative = dEzmaxinvoicingsummaryglobalRepresentative;
  }

  /**
   * The amount of commission for the partner
   **/
  @ApiModelProperty(value = "The amount of commission for the partner")
  public String getDEzmaxinvoicingsummaryglobalPartner() {
    return dEzmaxinvoicingsummaryglobalPartner;
  }
  public void setDEzmaxinvoicingsummaryglobalPartner(String dEzmaxinvoicingsummaryglobalPartner) {
    this.dEzmaxinvoicingsummaryglobalPartner = dEzmaxinvoicingsummaryglobalPartner;
  }

  /**
   * The net amount of the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(value = "The net amount of the Ezmaxinvoicingsummaryglobal")
  public String getDEzmaxinvoicingsummaryglobalNet() {
    return dEzmaxinvoicingsummaryglobalNet;
  }
  public void setDEzmaxinvoicingsummaryglobalNet(String dEzmaxinvoicingsummaryglobalNet) {
    this.dEzmaxinvoicingsummaryglobalNet = dEzmaxinvoicingsummaryglobalNet;
  }

  /**
   * Whether it is adjustment for the Ezmaxinvoicingsummaryglobal
   **/
  @ApiModelProperty(required = true, value = "Whether it is adjustment for the Ezmaxinvoicingsummaryglobal")
  public Boolean getBEzmaxinvoicingsummaryglobalAdjustment() {
    return bEzmaxinvoicingsummaryglobalAdjustment;
  }
  public void setBEzmaxinvoicingsummaryglobalAdjustment(Boolean bEzmaxinvoicingsummaryglobalAdjustment) {
    this.bEzmaxinvoicingsummaryglobalAdjustment = bEzmaxinvoicingsummaryglobalAdjustment;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EzmaxinvoicingcommissionResponseCompound> getAObjEzmaxinvoicingcommission() {
    return aObjEzmaxinvoicingcommission;
  }
  public void setAObjEzmaxinvoicingcommission(List<EzmaxinvoicingcommissionResponseCompound> aObjEzmaxinvoicingcommission) {
    this.aObjEzmaxinvoicingcommission = aObjEzmaxinvoicingcommission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryglobalResponseCompound ezmaxinvoicingsummaryglobalResponseCompound = (EzmaxinvoicingsummaryglobalResponseCompound) o;
    return (this.pkiEzmaxinvoicingsummaryglobalID == null ? ezmaxinvoicingsummaryglobalResponseCompound.pkiEzmaxinvoicingsummaryglobalID == null : this.pkiEzmaxinvoicingsummaryglobalID.equals(ezmaxinvoicingsummaryglobalResponseCompound.pkiEzmaxinvoicingsummaryglobalID)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicingsummaryglobalResponseCompound.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicingsummaryglobalResponseCompound.fkiEzmaxinvoicingID)) &&
        (this.fkiEzmaxproductID == null ? ezmaxinvoicingsummaryglobalResponseCompound.fkiEzmaxproductID == null : this.fkiEzmaxproductID.equals(ezmaxinvoicingsummaryglobalResponseCompound.fkiEzmaxproductID)) &&
        (this.sEzmaxproductDescriptionX == null ? ezmaxinvoicingsummaryglobalResponseCompound.sEzmaxproductDescriptionX == null : this.sEzmaxproductDescriptionX.equals(ezmaxinvoicingsummaryglobalResponseCompound.sEzmaxproductDescriptionX)) &&
        (this.dtEzmaxinvoicingsummaryglobalStart == null ? ezmaxinvoicingsummaryglobalResponseCompound.dtEzmaxinvoicingsummaryglobalStart == null : this.dtEzmaxinvoicingsummaryglobalStart.equals(ezmaxinvoicingsummaryglobalResponseCompound.dtEzmaxinvoicingsummaryglobalStart)) &&
        (this.dtEzmaxinvoicingsummaryglobalEnd == null ? ezmaxinvoicingsummaryglobalResponseCompound.dtEzmaxinvoicingsummaryglobalEnd == null : this.dtEzmaxinvoicingsummaryglobalEnd.equals(ezmaxinvoicingsummaryglobalResponseCompound.dtEzmaxinvoicingsummaryglobalEnd)) &&
        (this.iEzmaxinvoicingsummaryglobalDays == null ? ezmaxinvoicingsummaryglobalResponseCompound.iEzmaxinvoicingsummaryglobalDays == null : this.iEzmaxinvoicingsummaryglobalDays.equals(ezmaxinvoicingsummaryglobalResponseCompound.iEzmaxinvoicingsummaryglobalDays)) &&
        (this.dEzmaxinvoicingsummaryglobalCountreal == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalCountreal == null : this.dEzmaxinvoicingsummaryglobalCountreal.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalCountreal)) &&
        (this.dEzmaxinvoicingsummaryglobalCountbilled == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalCountbilled == null : this.dEzmaxinvoicingsummaryglobalCountbilled.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalCountbilled)) &&
        (this.dEzmaxinvoicingsummaryglobalSubtotal == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalSubtotal == null : this.dEzmaxinvoicingsummaryglobalSubtotal.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalSubtotal)) &&
        (this.dEzmaxinvoicingsummaryglobalRebateamount == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebateamount == null : this.dEzmaxinvoicingsummaryglobalRebateamount.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebateamount)) &&
        (this.dEzmaxinvoicingsummaryglobalRebatepercent == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebatepercent == null : this.dEzmaxinvoicingsummaryglobalRebatepercent.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebatepercent)) &&
        (this.dEzmaxinvoicingsummaryglobalRebatetotal == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebatetotal == null : this.dEzmaxinvoicingsummaryglobalRebatetotal.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRebatetotal)) &&
        (this.dEzmaxinvoicingsummaryglobalTotal == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalTotal == null : this.dEzmaxinvoicingsummaryglobalTotal.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalTotal)) &&
        (this.dEzmaxinvoicingsummaryglobalRepresentative == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRepresentative == null : this.dEzmaxinvoicingsummaryglobalRepresentative.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalRepresentative)) &&
        (this.dEzmaxinvoicingsummaryglobalPartner == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalPartner == null : this.dEzmaxinvoicingsummaryglobalPartner.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalPartner)) &&
        (this.dEzmaxinvoicingsummaryglobalNet == null ? ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalNet == null : this.dEzmaxinvoicingsummaryglobalNet.equals(ezmaxinvoicingsummaryglobalResponseCompound.dEzmaxinvoicingsummaryglobalNet)) &&
        (this.bEzmaxinvoicingsummaryglobalAdjustment == null ? ezmaxinvoicingsummaryglobalResponseCompound.bEzmaxinvoicingsummaryglobalAdjustment == null : this.bEzmaxinvoicingsummaryglobalAdjustment.equals(ezmaxinvoicingsummaryglobalResponseCompound.bEzmaxinvoicingsummaryglobalAdjustment)) &&
        (this.tEzmaxproductHelpX == null ? ezmaxinvoicingsummaryglobalResponseCompound.tEzmaxproductHelpX == null : this.tEzmaxproductHelpX.equals(ezmaxinvoicingsummaryglobalResponseCompound.tEzmaxproductHelpX)) &&
        (this.aObjEzmaxinvoicingcommission == null ? ezmaxinvoicingsummaryglobalResponseCompound.aObjEzmaxinvoicingcommission == null : this.aObjEzmaxinvoicingcommission.equals(ezmaxinvoicingsummaryglobalResponseCompound.aObjEzmaxinvoicingcommission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryglobalID == null ? 0: this.pkiEzmaxinvoicingsummaryglobalID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiEzmaxproductID == null ? 0: this.fkiEzmaxproductID.hashCode());
    result = 31 * result + (this.sEzmaxproductDescriptionX == null ? 0: this.sEzmaxproductDescriptionX.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingsummaryglobalStart == null ? 0: this.dtEzmaxinvoicingsummaryglobalStart.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingsummaryglobalEnd == null ? 0: this.dtEzmaxinvoicingsummaryglobalEnd.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingsummaryglobalDays == null ? 0: this.iEzmaxinvoicingsummaryglobalDays.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalCountreal == null ? 0: this.dEzmaxinvoicingsummaryglobalCountreal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalCountbilled == null ? 0: this.dEzmaxinvoicingsummaryglobalCountbilled.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalSubtotal == null ? 0: this.dEzmaxinvoicingsummaryglobalSubtotal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalRebateamount == null ? 0: this.dEzmaxinvoicingsummaryglobalRebateamount.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalRebatepercent == null ? 0: this.dEzmaxinvoicingsummaryglobalRebatepercent.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalRebatetotal == null ? 0: this.dEzmaxinvoicingsummaryglobalRebatetotal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalTotal == null ? 0: this.dEzmaxinvoicingsummaryglobalTotal.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalRepresentative == null ? 0: this.dEzmaxinvoicingsummaryglobalRepresentative.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalPartner == null ? 0: this.dEzmaxinvoicingsummaryglobalPartner.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingsummaryglobalNet == null ? 0: this.dEzmaxinvoicingsummaryglobalNet.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingsummaryglobalAdjustment == null ? 0: this.bEzmaxinvoicingsummaryglobalAdjustment.hashCode());
    result = 31 * result + (this.tEzmaxproductHelpX == null ? 0: this.tEzmaxproductHelpX.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingcommission == null ? 0: this.aObjEzmaxinvoicingcommission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryglobalResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryglobalID: ").append(pkiEzmaxinvoicingsummaryglobalID).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiEzmaxproductID: ").append(fkiEzmaxproductID).append("\n");
    sb.append("  sEzmaxproductDescriptionX: ").append(sEzmaxproductDescriptionX).append("\n");
    sb.append("  dtEzmaxinvoicingsummaryglobalStart: ").append(dtEzmaxinvoicingsummaryglobalStart).append("\n");
    sb.append("  dtEzmaxinvoicingsummaryglobalEnd: ").append(dtEzmaxinvoicingsummaryglobalEnd).append("\n");
    sb.append("  iEzmaxinvoicingsummaryglobalDays: ").append(iEzmaxinvoicingsummaryglobalDays).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalCountreal: ").append(dEzmaxinvoicingsummaryglobalCountreal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalCountbilled: ").append(dEzmaxinvoicingsummaryglobalCountbilled).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalSubtotal: ").append(dEzmaxinvoicingsummaryglobalSubtotal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalRebateamount: ").append(dEzmaxinvoicingsummaryglobalRebateamount).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalRebatepercent: ").append(dEzmaxinvoicingsummaryglobalRebatepercent).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalRebatetotal: ").append(dEzmaxinvoicingsummaryglobalRebatetotal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalTotal: ").append(dEzmaxinvoicingsummaryglobalTotal).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalRepresentative: ").append(dEzmaxinvoicingsummaryglobalRepresentative).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalPartner: ").append(dEzmaxinvoicingsummaryglobalPartner).append("\n");
    sb.append("  dEzmaxinvoicingsummaryglobalNet: ").append(dEzmaxinvoicingsummaryglobalNet).append("\n");
    sb.append("  bEzmaxinvoicingsummaryglobalAdjustment: ").append(bEzmaxinvoicingsummaryglobalAdjustment).append("\n");
    sb.append("  tEzmaxproductHelpX: ").append(tEzmaxproductHelpX).append("\n");
    sb.append("  aObjEzmaxinvoicingcommission: ").append(aObjEzmaxinvoicingcommission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
