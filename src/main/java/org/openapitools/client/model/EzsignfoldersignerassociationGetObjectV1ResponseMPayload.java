/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompound;
import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompoundUser;
import org.openapitools.client.model.EzsignsignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}")
public class EzsignfoldersignerassociationGetObjectV1ResponseMPayload {
  
  @SerializedName("pkiEzsignfoldersignerassociationID")
  private Integer pkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("bEzsignfoldersignerassociationDelayedsend")
  private Boolean bEzsignfoldersignerassociationDelayedsend = null;
  @SerializedName("bEzsignfoldersignerassociationReceivecopy")
  private Boolean bEzsignfoldersignerassociationReceivecopy = null;
  @SerializedName("tEzsignfoldersignerassociationMessage")
  private String tEzsignfoldersignerassociationMessage = null;
  @SerializedName("objUser")
  private EzsignfoldersignerassociationResponseCompoundUser objUser = null;
  @SerializedName("objEzsignsigner")
  private EzsignsignerResponseCompound objEzsignsigner = null;

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getPkiEzsignfoldersignerassociationID() {
    return pkiEzsignfoldersignerassociationID;
  }
  public void setPkiEzsignfoldersignerassociationID(Integer pkiEzsignfoldersignerassociationID) {
    this.pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID;
  }

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * If this flag is true the signatory is part of a delayed send.
   **/
  @ApiModelProperty(required = true, value = "If this flag is true the signatory is part of a delayed send.")
  public Boolean getBEzsignfoldersignerassociationDelayedsend() {
    return bEzsignfoldersignerassociationDelayedsend;
  }
  public void setBEzsignfoldersignerassociationDelayedsend(Boolean bEzsignfoldersignerassociationDelayedsend) {
    this.bEzsignfoldersignerassociationDelayedsend = bEzsignfoldersignerassociationDelayedsend;
  }

  /**
   * If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
   **/
  @ApiModelProperty(required = true, value = "If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.")
  public Boolean getBEzsignfoldersignerassociationReceivecopy() {
    return bEzsignfoldersignerassociationReceivecopy;
  }
  public void setBEzsignfoldersignerassociationReceivecopy(Boolean bEzsignfoldersignerassociationReceivecopy) {
    this.bEzsignfoldersignerassociationReceivecopy = bEzsignfoldersignerassociationReceivecopy;
  }

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(required = true, value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfoldersignerassociationMessage() {
    return tEzsignfoldersignerassociationMessage;
  }
  public void setTEzsignfoldersignerassociationMessage(String tEzsignfoldersignerassociationMessage) {
    this.tEzsignfoldersignerassociationMessage = tEzsignfoldersignerassociationMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfoldersignerassociationResponseCompoundUser getObjUser() {
    return objUser;
  }
  public void setObjUser(EzsignfoldersignerassociationResponseCompoundUser objUser) {
    this.objUser = objUser;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignerResponseCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }
  public void setObjEzsignsigner(EzsignsignerResponseCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationGetObjectV1ResponseMPayload ezsignfoldersignerassociationGetObjectV1ResponseMPayload = (EzsignfoldersignerassociationGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsignfoldersignerassociationID == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.pkiEzsignfoldersignerassociationID == null : this.pkiEzsignfoldersignerassociationID.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.pkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.fkiEzsignfolderID)) &&
        (this.bEzsignfoldersignerassociationDelayedsend == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationDelayedsend == null : this.bEzsignfoldersignerassociationDelayedsend.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationDelayedsend)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationReceivecopy)) &&
        (this.tEzsignfoldersignerassociationMessage == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.tEzsignfoldersignerassociationMessage == null : this.tEzsignfoldersignerassociationMessage.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.tEzsignfoldersignerassociationMessage)) &&
        (this.objUser == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objUser == null : this.objUser.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objUser)) &&
        (this.objEzsignsigner == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objEzsignsigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldersignerassociationID == null ? 0: this.pkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationDelayedsend == null ? 0: this.bEzsignfoldersignerassociationDelayedsend.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationReceivecopy == null ? 0: this.bEzsignfoldersignerassociationReceivecopy.hashCode());
    result = 31 * result + (this.tEzsignfoldersignerassociationMessage == null ? 0: this.tEzsignfoldersignerassociationMessage.hashCode());
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  bEzsignfoldersignerassociationDelayedsend: ").append(bEzsignfoldersignerassociationDelayedsend).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("  tEzsignfoldersignerassociationMessage: ").append(tEzsignfoldersignerassociationMessage).append("\n");
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
