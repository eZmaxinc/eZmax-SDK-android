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

import org.openapitools.client.model.FieldEEzsigntemplateglobalModule;
import org.openapitools.client.model.FieldEEzsigntemplateglobalSupplier;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplateglobal Object
 **/
@ApiModel(description = "A Ezsigntemplateglobal Object")
public class EzsigntemplateglobalResponse {
  
  @SerializedName("pkiEzsigntemplateglobalID")
  private Integer pkiEzsigntemplateglobalID = null;
  @SerializedName("fkiEzsigntemplateglobaldocumentID")
  private Integer fkiEzsigntemplateglobaldocumentID = null;
  @SerializedName("fkiModuleID")
  private Integer fkiModuleID = null;
  @SerializedName("sModuleNameX")
  private String sModuleNameX = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sLanguageNameX")
  private String sLanguageNameX = null;
  @SerializedName("eEzsigntemplateglobalModule")
  private FieldEEzsigntemplateglobalModule eEzsigntemplateglobalModule = null;
  @SerializedName("eEzsigntemplateglobalSupplier")
  private FieldEEzsigntemplateglobalSupplier eEzsigntemplateglobalSupplier = null;
  @SerializedName("sEzsigntemplateglobalCode")
  private String sEzsigntemplateglobalCode = null;
  @SerializedName("sEzsigntemplateglobalDescription")
  private String sEzsigntemplateglobalDescription = null;

  /**
   * The unique ID of the Ezsigntemplateglobal
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplateglobal")
  public Integer getPkiEzsigntemplateglobalID() {
    return pkiEzsigntemplateglobalID;
  }
  public void setPkiEzsigntemplateglobalID(Integer pkiEzsigntemplateglobalID) {
    this.pkiEzsigntemplateglobalID = pkiEzsigntemplateglobalID;
  }

  /**
   * The unique ID of the Ezsigntemplateglobaldocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplateglobaldocument")
  public Integer getFkiEzsigntemplateglobaldocumentID() {
    return fkiEzsigntemplateglobaldocumentID;
  }
  public void setFkiEzsigntemplateglobaldocumentID(Integer fkiEzsigntemplateglobaldocumentID) {
    this.fkiEzsigntemplateglobaldocumentID = fkiEzsigntemplateglobaldocumentID;
  }

  /**
   * The unique ID of the Module
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Module")
  public Integer getFkiModuleID() {
    return fkiModuleID;
  }
  public void setFkiModuleID(Integer fkiModuleID) {
    this.fkiModuleID = fkiModuleID;
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
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * The Name of the Language in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Language in the language of the requester")
  public String getSLanguageNameX() {
    return sLanguageNameX;
  }
  public void setSLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplateglobalModule getEEzsigntemplateglobalModule() {
    return eEzsigntemplateglobalModule;
  }
  public void setEEzsigntemplateglobalModule(FieldEEzsigntemplateglobalModule eEzsigntemplateglobalModule) {
    this.eEzsigntemplateglobalModule = eEzsigntemplateglobalModule;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplateglobalSupplier getEEzsigntemplateglobalSupplier() {
    return eEzsigntemplateglobalSupplier;
  }
  public void setEEzsigntemplateglobalSupplier(FieldEEzsigntemplateglobalSupplier eEzsigntemplateglobalSupplier) {
    this.eEzsigntemplateglobalSupplier = eEzsigntemplateglobalSupplier;
  }

  /**
   * The Code of the Ezsigntemplateglobal
   **/
  @ApiModelProperty(required = true, value = "The Code of the Ezsigntemplateglobal")
  public String getSEzsigntemplateglobalCode() {
    return sEzsigntemplateglobalCode;
  }
  public void setSEzsigntemplateglobalCode(String sEzsigntemplateglobalCode) {
    this.sEzsigntemplateglobalCode = sEzsigntemplateglobalCode;
  }

  /**
   * The description of the Ezsigntemplate
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplate")
  public String getSEzsigntemplateglobalDescription() {
    return sEzsigntemplateglobalDescription;
  }
  public void setSEzsigntemplateglobalDescription(String sEzsigntemplateglobalDescription) {
    this.sEzsigntemplateglobalDescription = sEzsigntemplateglobalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateglobalResponse ezsigntemplateglobalResponse = (EzsigntemplateglobalResponse) o;
    return (this.pkiEzsigntemplateglobalID == null ? ezsigntemplateglobalResponse.pkiEzsigntemplateglobalID == null : this.pkiEzsigntemplateglobalID.equals(ezsigntemplateglobalResponse.pkiEzsigntemplateglobalID)) &&
        (this.fkiEzsigntemplateglobaldocumentID == null ? ezsigntemplateglobalResponse.fkiEzsigntemplateglobaldocumentID == null : this.fkiEzsigntemplateglobaldocumentID.equals(ezsigntemplateglobalResponse.fkiEzsigntemplateglobaldocumentID)) &&
        (this.fkiModuleID == null ? ezsigntemplateglobalResponse.fkiModuleID == null : this.fkiModuleID.equals(ezsigntemplateglobalResponse.fkiModuleID)) &&
        (this.sModuleNameX == null ? ezsigntemplateglobalResponse.sModuleNameX == null : this.sModuleNameX.equals(ezsigntemplateglobalResponse.sModuleNameX)) &&
        (this.fkiLanguageID == null ? ezsigntemplateglobalResponse.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplateglobalResponse.fkiLanguageID)) &&
        (this.sLanguageNameX == null ? ezsigntemplateglobalResponse.sLanguageNameX == null : this.sLanguageNameX.equals(ezsigntemplateglobalResponse.sLanguageNameX)) &&
        (this.eEzsigntemplateglobalModule == null ? ezsigntemplateglobalResponse.eEzsigntemplateglobalModule == null : this.eEzsigntemplateglobalModule.equals(ezsigntemplateglobalResponse.eEzsigntemplateglobalModule)) &&
        (this.eEzsigntemplateglobalSupplier == null ? ezsigntemplateglobalResponse.eEzsigntemplateglobalSupplier == null : this.eEzsigntemplateglobalSupplier.equals(ezsigntemplateglobalResponse.eEzsigntemplateglobalSupplier)) &&
        (this.sEzsigntemplateglobalCode == null ? ezsigntemplateglobalResponse.sEzsigntemplateglobalCode == null : this.sEzsigntemplateglobalCode.equals(ezsigntemplateglobalResponse.sEzsigntemplateglobalCode)) &&
        (this.sEzsigntemplateglobalDescription == null ? ezsigntemplateglobalResponse.sEzsigntemplateglobalDescription == null : this.sEzsigntemplateglobalDescription.equals(ezsigntemplateglobalResponse.sEzsigntemplateglobalDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateglobalID == null ? 0: this.pkiEzsigntemplateglobalID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateglobaldocumentID == null ? 0: this.fkiEzsigntemplateglobaldocumentID.hashCode());
    result = 31 * result + (this.fkiModuleID == null ? 0: this.fkiModuleID.hashCode());
    result = 31 * result + (this.sModuleNameX == null ? 0: this.sModuleNameX.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.eEzsigntemplateglobalModule == null ? 0: this.eEzsigntemplateglobalModule.hashCode());
    result = 31 * result + (this.eEzsigntemplateglobalSupplier == null ? 0: this.eEzsigntemplateglobalSupplier.hashCode());
    result = 31 * result + (this.sEzsigntemplateglobalCode == null ? 0: this.sEzsigntemplateglobalCode.hashCode());
    result = 31 * result + (this.sEzsigntemplateglobalDescription == null ? 0: this.sEzsigntemplateglobalDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateglobalResponse {\n");
    
    sb.append("  pkiEzsigntemplateglobalID: ").append(pkiEzsigntemplateglobalID).append("\n");
    sb.append("  fkiEzsigntemplateglobaldocumentID: ").append(fkiEzsigntemplateglobaldocumentID).append("\n");
    sb.append("  fkiModuleID: ").append(fkiModuleID).append("\n");
    sb.append("  sModuleNameX: ").append(sModuleNameX).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  eEzsigntemplateglobalModule: ").append(eEzsigntemplateglobalModule).append("\n");
    sb.append("  eEzsigntemplateglobalSupplier: ").append(eEzsigntemplateglobalSupplier).append("\n");
    sb.append("  sEzsigntemplateglobalCode: ").append(sEzsigntemplateglobalCode).append("\n");
    sb.append("  sEzsigntemplateglobalDescription: ").append(sEzsigntemplateglobalDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
