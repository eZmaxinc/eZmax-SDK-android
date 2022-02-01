/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * Payload for the /1/object/ezsignfoldersignerassociation/getObject API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsignfoldersignerassociation/getObject API Request")
public class EzsignfoldersignerassociationGetObjectV1ResponseMPayload {
  
  @SerializedName("objUser")
  private EzsignfoldersignerassociationResponseCompoundUser objUser = null;
  @SerializedName("objEzsignsigner")
  private EzsignsignerResponseCompound objEzsignsigner = null;
  @SerializedName("pkiEzsignfoldersignerassociationID")
  private Integer pkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("bEzsignfoldersignerassociationReceivecopy")
  private Boolean bEzsignfoldersignerassociationReceivecopy = null;

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

  /**
   * The unique ID of the Ezsignfoldersignerassociation
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
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationGetObjectV1ResponseMPayload ezsignfoldersignerassociationGetObjectV1ResponseMPayload = (EzsignfoldersignerassociationGetObjectV1ResponseMPayload) o;
    return (this.objUser == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objUser == null : this.objUser.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objUser)) &&
        (this.objEzsignsigner == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.objEzsignsigner)) &&
        (this.pkiEzsignfoldersignerassociationID == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.pkiEzsignfoldersignerassociationID == null : this.pkiEzsignfoldersignerassociationID.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.pkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.fkiEzsignfolderID)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(ezsignfoldersignerassociationGetObjectV1ResponseMPayload.bEzsignfoldersignerassociationReceivecopy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    result = 31 * result + (this.pkiEzsignfoldersignerassociationID == null ? 0: this.pkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationReceivecopy == null ? 0: this.bEzsignfoldersignerassociationReceivecopy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationGetObjectV1ResponseMPayload {\n");
    
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
