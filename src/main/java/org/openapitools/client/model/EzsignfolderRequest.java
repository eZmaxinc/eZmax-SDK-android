/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignfolderSendreminderfrequency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object
 **/
@ApiModel(description = "An Ezsignfolder Object")
public class EzsignfolderRequest {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("tEzsignfolderNote")
  private String tEzsignfolderNote = null;
  @SerializedName("eEzsignfolderSendreminderfrequency")
  private FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency = null;

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
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
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }
  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }

  /**
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   * Note about the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "Note about the Ezsignfolder")
  public String getTEzsignfolderNote() {
    return tEzsignfolderNote;
  }
  public void setTEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderSendreminderfrequency getEEzsignfolderSendreminderfrequency() {
    return eEzsignfolderSendreminderfrequency;
  }
  public void setEEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    this.eEzsignfolderSendreminderfrequency = eEzsignfolderSendreminderfrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderRequest ezsignfolderRequest = (EzsignfolderRequest) o;
    return (this.pkiEzsignfolderID == null ? ezsignfolderRequest.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(ezsignfolderRequest.pkiEzsignfolderID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignfolderRequest.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignfolderRequest.fkiEzsignfoldertypeID)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignfolderRequest.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignfolderRequest.fkiEzsigntsarequirementID)) &&
        (this.sEzsignfolderDescription == null ? ezsignfolderRequest.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(ezsignfolderRequest.sEzsignfolderDescription)) &&
        (this.tEzsignfolderNote == null ? ezsignfolderRequest.tEzsignfolderNote == null : this.tEzsignfolderNote.equals(ezsignfolderRequest.tEzsignfolderNote)) &&
        (this.eEzsignfolderSendreminderfrequency == null ? ezsignfolderRequest.eEzsignfolderSendreminderfrequency == null : this.eEzsignfolderSendreminderfrequency.equals(ezsignfolderRequest.eEzsignfolderSendreminderfrequency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.tEzsignfolderNote == null ? 0: this.tEzsignfolderNote.hashCode());
    result = 31 * result + (this.eEzsignfolderSendreminderfrequency == null ? 0: this.eEzsignfolderSendreminderfrequency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderRequest {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  tEzsignfolderNote: ").append(tEzsignfolderNote).append("\n");
    sb.append("  eEzsignfolderSendreminderfrequency: ").append(eEzsignfolderSendreminderfrequency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
