/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.EzsignbulksendResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getObject API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getObject API Request")
public class EzsignbulksendGetObjectV1ResponseMPayload {
  
  @SerializedName("pkiEzsignbulksendID")
  private Integer pkiEzsignbulksendID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsignbulksendDescription")
  private String sEzsignbulksendDescription = null;
  @SerializedName("tEzsignbulksendNote")
  private String tEzsignbulksendNote = null;
  @SerializedName("bEzsignbulksendIsactive")
  private Boolean bEzsignbulksendIsactive = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezsignbulksend
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetObjectV1ResponseMPayload ezsignbulksendGetObjectV1ResponseMPayload = (EzsignbulksendGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsignbulksendID == null ? ezsignbulksendGetObjectV1ResponseMPayload.pkiEzsignbulksendID == null : this.pkiEzsignbulksendID.equals(ezsignbulksendGetObjectV1ResponseMPayload.pkiEzsignbulksendID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignbulksendGetObjectV1ResponseMPayload.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignbulksendGetObjectV1ResponseMPayload.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsignbulksendGetObjectV1ResponseMPayload.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignbulksendGetObjectV1ResponseMPayload.fkiLanguageID)) &&
        (this.sEzsignbulksendDescription == null ? ezsignbulksendGetObjectV1ResponseMPayload.sEzsignbulksendDescription == null : this.sEzsignbulksendDescription.equals(ezsignbulksendGetObjectV1ResponseMPayload.sEzsignbulksendDescription)) &&
        (this.tEzsignbulksendNote == null ? ezsignbulksendGetObjectV1ResponseMPayload.tEzsignbulksendNote == null : this.tEzsignbulksendNote.equals(ezsignbulksendGetObjectV1ResponseMPayload.tEzsignbulksendNote)) &&
        (this.bEzsignbulksendIsactive == null ? ezsignbulksendGetObjectV1ResponseMPayload.bEzsignbulksendIsactive == null : this.bEzsignbulksendIsactive.equals(ezsignbulksendGetObjectV1ResponseMPayload.bEzsignbulksendIsactive)) &&
        (this.objAudit == null ? ezsignbulksendGetObjectV1ResponseMPayload.objAudit == null : this.objAudit.equals(ezsignbulksendGetObjectV1ResponseMPayload.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendID == null ? 0: this.pkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsignbulksendDescription == null ? 0: this.sEzsignbulksendDescription.hashCode());
    result = 31 * result + (this.tEzsignbulksendNote == null ? 0: this.tEzsignbulksendNote.hashCode());
    result = 31 * result + (this.bEzsignbulksendIsactive == null ? 0: this.bEzsignbulksendIsactive.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsignbulksendID: ").append(pkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsignbulksendDescription: ").append(sEzsignbulksendDescription).append("\n");
    sb.append("  tEzsignbulksendNote: ").append(tEzsignbulksendNote).append("\n");
    sb.append("  bEzsignbulksendIsactive: ").append(bEzsignbulksendIsactive).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
