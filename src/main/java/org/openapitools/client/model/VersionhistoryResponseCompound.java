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

import org.openapitools.client.model.FieldEVersionhistoryType;
import org.openapitools.client.model.FieldEVersionhistoryUsertype;
import org.openapitools.client.model.MultilingualVersionhistoryDetail;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Versionhistory Object
 **/
@ApiModel(description = "A Versionhistory Object")
public class VersionhistoryResponseCompound {
  
  @SerializedName("pkiVersionhistoryID")
  private Integer pkiVersionhistoryID = null;
  @SerializedName("fkiModuleID")
  private Integer fkiModuleID = null;
  @SerializedName("fkiModulesectionID")
  private Integer fkiModulesectionID = null;
  @SerializedName("sModuleNameX")
  private String sModuleNameX = null;
  @SerializedName("sModulesectionNameX")
  private String sModulesectionNameX = null;
  @SerializedName("eVersionhistoryUsertype")
  private FieldEVersionhistoryUsertype eVersionhistoryUsertype = null;
  @SerializedName("objVersionhistoryDetail")
  private MultilingualVersionhistoryDetail objVersionhistoryDetail = null;
  @SerializedName("dtVersionhistoryDate")
  private String dtVersionhistoryDate = null;
  @SerializedName("dtVersionhistoryDateend")
  private String dtVersionhistoryDateend = null;
  @SerializedName("eVersionhistoryType")
  private FieldEVersionhistoryType eVersionhistoryType = null;
  @SerializedName("bVersionhistoryDraft")
  private Boolean bVersionhistoryDraft = null;

  /**
   * The unique ID of the Versionhistory
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Versionhistory")
  public Integer getPkiVersionhistoryID() {
    return pkiVersionhistoryID;
  }
  public void setPkiVersionhistoryID(Integer pkiVersionhistoryID) {
    this.pkiVersionhistoryID = pkiVersionhistoryID;
  }

  /**
   * The unique ID of the Module
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Module")
  public Integer getFkiModuleID() {
    return fkiModuleID;
  }
  public void setFkiModuleID(Integer fkiModuleID) {
    this.fkiModuleID = fkiModuleID;
  }

  /**
   * The unique ID of the Modulesection
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Modulesection")
  public Integer getFkiModulesectionID() {
    return fkiModulesectionID;
  }
  public void setFkiModulesectionID(Integer fkiModulesectionID) {
    this.fkiModulesectionID = fkiModulesectionID;
  }

  /**
   * The Name of the Module in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Module in the language of the requester")
  public String getSModuleNameX() {
    return sModuleNameX;
  }
  public void setSModuleNameX(String sModuleNameX) {
    this.sModuleNameX = sModuleNameX;
  }

  /**
   * The Name of the Modulesection in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Modulesection in the language of the requester")
  public String getSModulesectionNameX() {
    return sModulesectionNameX;
  }
  public void setSModulesectionNameX(String sModulesectionNameX) {
    this.sModulesectionNameX = sModulesectionNameX;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEVersionhistoryUsertype getEVersionhistoryUsertype() {
    return eVersionhistoryUsertype;
  }
  public void setEVersionhistoryUsertype(FieldEVersionhistoryUsertype eVersionhistoryUsertype) {
    this.eVersionhistoryUsertype = eVersionhistoryUsertype;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualVersionhistoryDetail getObjVersionhistoryDetail() {
    return objVersionhistoryDetail;
  }
  public void setObjVersionhistoryDetail(MultilingualVersionhistoryDetail objVersionhistoryDetail) {
    this.objVersionhistoryDetail = objVersionhistoryDetail;
  }

  /**
   * The date  at which the Versionhistory was published or should be published
   **/
  @ApiModelProperty(required = true, value = "The date  at which the Versionhistory was published or should be published")
  public String getDtVersionhistoryDate() {
    return dtVersionhistoryDate;
  }
  public void setDtVersionhistoryDate(String dtVersionhistoryDate) {
    this.dtVersionhistoryDate = dtVersionhistoryDate;
  }

  /**
   * The date  at which the Versionhistory will no longer be visible
   **/
  @ApiModelProperty(value = "The date  at which the Versionhistory will no longer be visible")
  public String getDtVersionhistoryDateend() {
    return dtVersionhistoryDateend;
  }
  public void setDtVersionhistoryDateend(String dtVersionhistoryDateend) {
    this.dtVersionhistoryDateend = dtVersionhistoryDateend;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEVersionhistoryType getEVersionhistoryType() {
    return eVersionhistoryType;
  }
  public void setEVersionhistoryType(FieldEVersionhistoryType eVersionhistoryType) {
    this.eVersionhistoryType = eVersionhistoryType;
  }

  /**
   * Whether the Versionhistory is published or still a draft
   **/
  @ApiModelProperty(required = true, value = "Whether the Versionhistory is published or still a draft")
  public Boolean getBVersionhistoryDraft() {
    return bVersionhistoryDraft;
  }
  public void setBVersionhistoryDraft(Boolean bVersionhistoryDraft) {
    this.bVersionhistoryDraft = bVersionhistoryDraft;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionhistoryResponseCompound versionhistoryResponseCompound = (VersionhistoryResponseCompound) o;
    return (this.pkiVersionhistoryID == null ? versionhistoryResponseCompound.pkiVersionhistoryID == null : this.pkiVersionhistoryID.equals(versionhistoryResponseCompound.pkiVersionhistoryID)) &&
        (this.fkiModuleID == null ? versionhistoryResponseCompound.fkiModuleID == null : this.fkiModuleID.equals(versionhistoryResponseCompound.fkiModuleID)) &&
        (this.fkiModulesectionID == null ? versionhistoryResponseCompound.fkiModulesectionID == null : this.fkiModulesectionID.equals(versionhistoryResponseCompound.fkiModulesectionID)) &&
        (this.sModuleNameX == null ? versionhistoryResponseCompound.sModuleNameX == null : this.sModuleNameX.equals(versionhistoryResponseCompound.sModuleNameX)) &&
        (this.sModulesectionNameX == null ? versionhistoryResponseCompound.sModulesectionNameX == null : this.sModulesectionNameX.equals(versionhistoryResponseCompound.sModulesectionNameX)) &&
        (this.eVersionhistoryUsertype == null ? versionhistoryResponseCompound.eVersionhistoryUsertype == null : this.eVersionhistoryUsertype.equals(versionhistoryResponseCompound.eVersionhistoryUsertype)) &&
        (this.objVersionhistoryDetail == null ? versionhistoryResponseCompound.objVersionhistoryDetail == null : this.objVersionhistoryDetail.equals(versionhistoryResponseCompound.objVersionhistoryDetail)) &&
        (this.dtVersionhistoryDate == null ? versionhistoryResponseCompound.dtVersionhistoryDate == null : this.dtVersionhistoryDate.equals(versionhistoryResponseCompound.dtVersionhistoryDate)) &&
        (this.dtVersionhistoryDateend == null ? versionhistoryResponseCompound.dtVersionhistoryDateend == null : this.dtVersionhistoryDateend.equals(versionhistoryResponseCompound.dtVersionhistoryDateend)) &&
        (this.eVersionhistoryType == null ? versionhistoryResponseCompound.eVersionhistoryType == null : this.eVersionhistoryType.equals(versionhistoryResponseCompound.eVersionhistoryType)) &&
        (this.bVersionhistoryDraft == null ? versionhistoryResponseCompound.bVersionhistoryDraft == null : this.bVersionhistoryDraft.equals(versionhistoryResponseCompound.bVersionhistoryDraft));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiVersionhistoryID == null ? 0: this.pkiVersionhistoryID.hashCode());
    result = 31 * result + (this.fkiModuleID == null ? 0: this.fkiModuleID.hashCode());
    result = 31 * result + (this.fkiModulesectionID == null ? 0: this.fkiModulesectionID.hashCode());
    result = 31 * result + (this.sModuleNameX == null ? 0: this.sModuleNameX.hashCode());
    result = 31 * result + (this.sModulesectionNameX == null ? 0: this.sModulesectionNameX.hashCode());
    result = 31 * result + (this.eVersionhistoryUsertype == null ? 0: this.eVersionhistoryUsertype.hashCode());
    result = 31 * result + (this.objVersionhistoryDetail == null ? 0: this.objVersionhistoryDetail.hashCode());
    result = 31 * result + (this.dtVersionhistoryDate == null ? 0: this.dtVersionhistoryDate.hashCode());
    result = 31 * result + (this.dtVersionhistoryDateend == null ? 0: this.dtVersionhistoryDateend.hashCode());
    result = 31 * result + (this.eVersionhistoryType == null ? 0: this.eVersionhistoryType.hashCode());
    result = 31 * result + (this.bVersionhistoryDraft == null ? 0: this.bVersionhistoryDraft.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionhistoryResponseCompound {\n");
    
    sb.append("  pkiVersionhistoryID: ").append(pkiVersionhistoryID).append("\n");
    sb.append("  fkiModuleID: ").append(fkiModuleID).append("\n");
    sb.append("  fkiModulesectionID: ").append(fkiModulesectionID).append("\n");
    sb.append("  sModuleNameX: ").append(sModuleNameX).append("\n");
    sb.append("  sModulesectionNameX: ").append(sModulesectionNameX).append("\n");
    sb.append("  eVersionhistoryUsertype: ").append(eVersionhistoryUsertype).append("\n");
    sb.append("  objVersionhistoryDetail: ").append(objVersionhistoryDetail).append("\n");
    sb.append("  dtVersionhistoryDate: ").append(dtVersionhistoryDate).append("\n");
    sb.append("  dtVersionhistoryDateend: ").append(dtVersionhistoryDateend).append("\n");
    sb.append("  eVersionhistoryType: ").append(eVersionhistoryType).append("\n");
    sb.append("  bVersionhistoryDraft: ").append(bVersionhistoryDraft).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
