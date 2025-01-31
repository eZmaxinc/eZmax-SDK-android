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

import org.openapitools.client.model.FieldEEzsignfolderDocumentdependency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object
 **/
@ApiModel(description = "An Ezsignfolder Object")
public class EzsignfolderRequestV3 {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiTimezoneID")
  private Integer fkiTimezoneID = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("eEzsignfolderDocumentdependency")
  private FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("tEzsignfolderNote")
  private String tEzsignfolderNote = null;
  @SerializedName("tEzsignfolderMessage")
  private String tEzsignfolderMessage = null;
  @SerializedName("iEzsignfolderSendreminderfirstdays")
  private Integer iEzsignfolderSendreminderfirstdays = null;
  @SerializedName("iEzsignfolderSendreminderotherdays")
  private Integer iEzsignfolderSendreminderotherdays = null;
  @SerializedName("sEzsignfolderExternalid")
  private String sEzsignfolderExternalid = null;

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
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
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }

  /**
   * The unique ID of the Timezone
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Timezone")
  public Integer getFkiTimezoneID() {
    return fkiTimezoneID;
  }
  public void setFkiTimezoneID(Integer fkiTimezoneID) {
    this.fkiTimezoneID = fkiTimezoneID;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }
  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfolderDocumentdependency getEEzsignfolderDocumentdependency() {
    return eEzsignfolderDocumentdependency;
  }
  public void setEEzsignfolderDocumentdependency(FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency) {
    this.eEzsignfolderDocumentdependency = eEzsignfolderDocumentdependency;
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
  @ApiModelProperty(value = "Note about the Ezsignfolder")
  public String getTEzsignfolderNote() {
    return tEzsignfolderNote;
  }
  public void setTEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfolderMessage() {
    return tEzsignfolderMessage;
  }
  public void setTEzsignfolderMessage(String tEzsignfolderMessage) {
    this.tEzsignfolderMessage = tEzsignfolderMessage;
  }

  /**
   * The number of days before the the first reminder sending
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The number of days before the the first reminder sending")
  public Integer getIEzsignfolderSendreminderfirstdays() {
    return iEzsignfolderSendreminderfirstdays;
  }
  public void setIEzsignfolderSendreminderfirstdays(Integer iEzsignfolderSendreminderfirstdays) {
    this.iEzsignfolderSendreminderfirstdays = iEzsignfolderSendreminderfirstdays;
  }

  /**
   * The number of days after the first reminder sending
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The number of days after the first reminder sending")
  public Integer getIEzsignfolderSendreminderotherdays() {
    return iEzsignfolderSendreminderotherdays;
  }
  public void setIEzsignfolderSendreminderotherdays(Integer iEzsignfolderSendreminderotherdays) {
    this.iEzsignfolderSendreminderotherdays = iEzsignfolderSendreminderotherdays;
  }

  /**
   * This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
   **/
  @ApiModelProperty(value = "This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. ")
  public String getSEzsignfolderExternalid() {
    return sEzsignfolderExternalid;
  }
  public void setSEzsignfolderExternalid(String sEzsignfolderExternalid) {
    this.sEzsignfolderExternalid = sEzsignfolderExternalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderRequestV3 ezsignfolderRequestV3 = (EzsignfolderRequestV3) o;
    return (this.pkiEzsignfolderID == null ? ezsignfolderRequestV3.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(ezsignfolderRequestV3.pkiEzsignfolderID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignfolderRequestV3.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignfolderRequestV3.fkiEzsignfoldertypeID)) &&
        (this.fkiTimezoneID == null ? ezsignfolderRequestV3.fkiTimezoneID == null : this.fkiTimezoneID.equals(ezsignfolderRequestV3.fkiTimezoneID)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignfolderRequestV3.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignfolderRequestV3.fkiEzsigntsarequirementID)) &&
        (this.eEzsignfolderDocumentdependency == null ? ezsignfolderRequestV3.eEzsignfolderDocumentdependency == null : this.eEzsignfolderDocumentdependency.equals(ezsignfolderRequestV3.eEzsignfolderDocumentdependency)) &&
        (this.sEzsignfolderDescription == null ? ezsignfolderRequestV3.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(ezsignfolderRequestV3.sEzsignfolderDescription)) &&
        (this.tEzsignfolderNote == null ? ezsignfolderRequestV3.tEzsignfolderNote == null : this.tEzsignfolderNote.equals(ezsignfolderRequestV3.tEzsignfolderNote)) &&
        (this.tEzsignfolderMessage == null ? ezsignfolderRequestV3.tEzsignfolderMessage == null : this.tEzsignfolderMessage.equals(ezsignfolderRequestV3.tEzsignfolderMessage)) &&
        (this.iEzsignfolderSendreminderfirstdays == null ? ezsignfolderRequestV3.iEzsignfolderSendreminderfirstdays == null : this.iEzsignfolderSendreminderfirstdays.equals(ezsignfolderRequestV3.iEzsignfolderSendreminderfirstdays)) &&
        (this.iEzsignfolderSendreminderotherdays == null ? ezsignfolderRequestV3.iEzsignfolderSendreminderotherdays == null : this.iEzsignfolderSendreminderotherdays.equals(ezsignfolderRequestV3.iEzsignfolderSendreminderotherdays)) &&
        (this.sEzsignfolderExternalid == null ? ezsignfolderRequestV3.sEzsignfolderExternalid == null : this.sEzsignfolderExternalid.equals(ezsignfolderRequestV3.sEzsignfolderExternalid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiTimezoneID == null ? 0: this.fkiTimezoneID.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.eEzsignfolderDocumentdependency == null ? 0: this.eEzsignfolderDocumentdependency.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.tEzsignfolderNote == null ? 0: this.tEzsignfolderNote.hashCode());
    result = 31 * result + (this.tEzsignfolderMessage == null ? 0: this.tEzsignfolderMessage.hashCode());
    result = 31 * result + (this.iEzsignfolderSendreminderfirstdays == null ? 0: this.iEzsignfolderSendreminderfirstdays.hashCode());
    result = 31 * result + (this.iEzsignfolderSendreminderotherdays == null ? 0: this.iEzsignfolderSendreminderotherdays.hashCode());
    result = 31 * result + (this.sEzsignfolderExternalid == null ? 0: this.sEzsignfolderExternalid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderRequestV3 {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiTimezoneID: ").append(fkiTimezoneID).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  eEzsignfolderDocumentdependency: ").append(eEzsignfolderDocumentdependency).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  tEzsignfolderNote: ").append(tEzsignfolderNote).append("\n");
    sb.append("  tEzsignfolderMessage: ").append(tEzsignfolderMessage).append("\n");
    sb.append("  iEzsignfolderSendreminderfirstdays: ").append(iEzsignfolderSendreminderfirstdays).append("\n");
    sb.append("  iEzsignfolderSendreminderotherdays: ").append(iEzsignfolderSendreminderotherdays).append("\n");
    sb.append("  sEzsignfolderExternalid: ").append(sEzsignfolderExternalid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
