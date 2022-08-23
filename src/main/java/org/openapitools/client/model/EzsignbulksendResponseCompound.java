/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.EzsignbulksendResponse;
import org.openapitools.client.model.EzsignbulksendResponseCompoundAllOf;
import org.openapitools.client.model.EzsignbulksenddocumentmappingResponseCompound;
import org.openapitools.client.model.EzsignbulksendsignermappingResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignbulksend Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignbulksend Object and children to create a complete structure")
public class EzsignbulksendResponseCompound {
  
  @SerializedName("pkiEzsignbulksendID")
  private Integer pkiEzsignbulksendID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sLanguageNameX")
  private String sLanguageNameX = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("sEzsignbulksendDescription")
  private String sEzsignbulksendDescription = null;
  @SerializedName("tEzsignbulksendNote")
  private String tEzsignbulksendNote = null;
  @SerializedName("bEzsignbulksendNeedvalidation")
  private Boolean bEzsignbulksendNeedvalidation = null;
  @SerializedName("bEzsignbulksendIsactive")
  private Boolean bEzsignbulksendIsactive = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
  @SerializedName("a_objEzsignbulksenddocumentmapping")
  private List<EzsignbulksenddocumentmappingResponseCompound> aObjEzsignbulksenddocumentmapping = null;
  @SerializedName("a_objEzsignbulksendsignermapping")
  private List<EzsignbulksendsignermappingResponse> aObjEzsignbulksendsignermapping = null;

  /**
   * The unique ID of the Ezsignbulksend
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksend")
  public Integer getPkiEzsignbulksendID() {
    return pkiEzsignbulksendID;
  }
  public void setPkiEzsignbulksendID(Integer pkiEzsignbulksendID) {
    this.pkiEzsignbulksendID = pkiEzsignbulksendID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * The description of the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksend")
  public String getSEzsignbulksendDescription() {
    return sEzsignbulksendDescription;
  }
  public void setSEzsignbulksendDescription(String sEzsignbulksendDescription) {
    this.sEzsignbulksendDescription = sEzsignbulksendDescription;
  }

  /**
   * Note about the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "Note about the Ezsignbulksend")
  public String getTEzsignbulksendNote() {
    return tEzsignbulksendNote;
  }
  public void setTEzsignbulksendNote(String tEzsignbulksendNote) {
    this.tEzsignbulksendNote = tEzsignbulksendNote;
  }

  /**
   * Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation")
  public Boolean getBEzsignbulksendNeedvalidation() {
    return bEzsignbulksendNeedvalidation;
  }
  public void setBEzsignbulksendNeedvalidation(Boolean bEzsignbulksendNeedvalidation) {
    this.bEzsignbulksendNeedvalidation = bEzsignbulksendNeedvalidation;
  }

  /**
   * Whether the Ezsignbulksend is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend is active or not")
  public Boolean getBEzsignbulksendIsactive() {
    return bEzsignbulksendIsactive;
  }
  public void setBEzsignbulksendIsactive(Boolean bEzsignbulksendIsactive) {
    this.bEzsignbulksendIsactive = bEzsignbulksendIsactive;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksenddocumentmappingResponseCompound> getAObjEzsignbulksenddocumentmapping() {
    return aObjEzsignbulksenddocumentmapping;
  }
  public void setAObjEzsignbulksenddocumentmapping(List<EzsignbulksenddocumentmappingResponseCompound> aObjEzsignbulksenddocumentmapping) {
    this.aObjEzsignbulksenddocumentmapping = aObjEzsignbulksenddocumentmapping;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendsignermappingResponse> getAObjEzsignbulksendsignermapping() {
    return aObjEzsignbulksendsignermapping;
  }
  public void setAObjEzsignbulksendsignermapping(List<EzsignbulksendsignermappingResponse> aObjEzsignbulksendsignermapping) {
    this.aObjEzsignbulksendsignermapping = aObjEzsignbulksendsignermapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendResponseCompound ezsignbulksendResponseCompound = (EzsignbulksendResponseCompound) o;
    return (this.pkiEzsignbulksendID == null ? ezsignbulksendResponseCompound.pkiEzsignbulksendID == null : this.pkiEzsignbulksendID.equals(ezsignbulksendResponseCompound.pkiEzsignbulksendID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignbulksendResponseCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignbulksendResponseCompound.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsignbulksendResponseCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignbulksendResponseCompound.fkiLanguageID)) &&
        (this.sLanguageNameX == null ? ezsignbulksendResponseCompound.sLanguageNameX == null : this.sLanguageNameX.equals(ezsignbulksendResponseCompound.sLanguageNameX)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignbulksendResponseCompound.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignbulksendResponseCompound.sEzsignfoldertypeNameX)) &&
        (this.sEzsignbulksendDescription == null ? ezsignbulksendResponseCompound.sEzsignbulksendDescription == null : this.sEzsignbulksendDescription.equals(ezsignbulksendResponseCompound.sEzsignbulksendDescription)) &&
        (this.tEzsignbulksendNote == null ? ezsignbulksendResponseCompound.tEzsignbulksendNote == null : this.tEzsignbulksendNote.equals(ezsignbulksendResponseCompound.tEzsignbulksendNote)) &&
        (this.bEzsignbulksendNeedvalidation == null ? ezsignbulksendResponseCompound.bEzsignbulksendNeedvalidation == null : this.bEzsignbulksendNeedvalidation.equals(ezsignbulksendResponseCompound.bEzsignbulksendNeedvalidation)) &&
        (this.bEzsignbulksendIsactive == null ? ezsignbulksendResponseCompound.bEzsignbulksendIsactive == null : this.bEzsignbulksendIsactive.equals(ezsignbulksendResponseCompound.bEzsignbulksendIsactive)) &&
        (this.objAudit == null ? ezsignbulksendResponseCompound.objAudit == null : this.objAudit.equals(ezsignbulksendResponseCompound.objAudit)) &&
        (this.aObjEzsignbulksenddocumentmapping == null ? ezsignbulksendResponseCompound.aObjEzsignbulksenddocumentmapping == null : this.aObjEzsignbulksenddocumentmapping.equals(ezsignbulksendResponseCompound.aObjEzsignbulksenddocumentmapping)) &&
        (this.aObjEzsignbulksendsignermapping == null ? ezsignbulksendResponseCompound.aObjEzsignbulksendsignermapping == null : this.aObjEzsignbulksendsignermapping.equals(ezsignbulksendResponseCompound.aObjEzsignbulksendsignermapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendID == null ? 0: this.pkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.sEzsignbulksendDescription == null ? 0: this.sEzsignbulksendDescription.hashCode());
    result = 31 * result + (this.tEzsignbulksendNote == null ? 0: this.tEzsignbulksendNote.hashCode());
    result = 31 * result + (this.bEzsignbulksendNeedvalidation == null ? 0: this.bEzsignbulksendNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsignbulksendIsactive == null ? 0: this.bEzsignbulksendIsactive.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.aObjEzsignbulksenddocumentmapping == null ? 0: this.aObjEzsignbulksenddocumentmapping.hashCode());
    result = 31 * result + (this.aObjEzsignbulksendsignermapping == null ? 0: this.aObjEzsignbulksendsignermapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendResponseCompound {\n");
    
    sb.append("  pkiEzsignbulksendID: ").append(pkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  sEzsignbulksendDescription: ").append(sEzsignbulksendDescription).append("\n");
    sb.append("  tEzsignbulksendNote: ").append(tEzsignbulksendNote).append("\n");
    sb.append("  bEzsignbulksendNeedvalidation: ").append(bEzsignbulksendNeedvalidation).append("\n");
    sb.append("  bEzsignbulksendIsactive: ").append(bEzsignbulksendIsactive).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  aObjEzsignbulksenddocumentmapping: ").append(aObjEzsignbulksenddocumentmapping).append("\n");
    sb.append("  aObjEzsignbulksendsignermapping: ").append(aObjEzsignbulksendsignermapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
