/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationResponse;
import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompoundAllOf;
import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompoundUser;
import org.openapitools.client.model.EzsignsignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfoldersignerassociation Object
 **/
@ApiModel(description = "An Ezsignfoldersignerassociation Object")
public class EzsignfoldersignerassociationResponseCompound {
  
  @SerializedName("pkiEzsignfoldersignerassociationID")
  private Integer pkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
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
    EzsignfoldersignerassociationResponseCompound ezsignfoldersignerassociationResponseCompound = (EzsignfoldersignerassociationResponseCompound) o;
    return (this.pkiEzsignfoldersignerassociationID == null ? ezsignfoldersignerassociationResponseCompound.pkiEzsignfoldersignerassociationID == null : this.pkiEzsignfoldersignerassociationID.equals(ezsignfoldersignerassociationResponseCompound.pkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationResponseCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationResponseCompound.fkiEzsignfolderID)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? ezsignfoldersignerassociationResponseCompound.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(ezsignfoldersignerassociationResponseCompound.bEzsignfoldersignerassociationReceivecopy)) &&
        (this.tEzsignfoldersignerassociationMessage == null ? ezsignfoldersignerassociationResponseCompound.tEzsignfoldersignerassociationMessage == null : this.tEzsignfoldersignerassociationMessage.equals(ezsignfoldersignerassociationResponseCompound.tEzsignfoldersignerassociationMessage)) &&
        (this.objUser == null ? ezsignfoldersignerassociationResponseCompound.objUser == null : this.objUser.equals(ezsignfoldersignerassociationResponseCompound.objUser)) &&
        (this.objEzsignsigner == null ? ezsignfoldersignerassociationResponseCompound.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationResponseCompound.objEzsignsigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldersignerassociationID == null ? 0: this.pkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationReceivecopy == null ? 0: this.bEzsignfoldersignerassociationReceivecopy.hashCode());
    result = 31 * result + (this.tEzsignfoldersignerassociationMessage == null ? 0: this.tEzsignfoldersignerassociationMessage.hashCode());
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponseCompound {\n");
    
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("  tEzsignfoldersignerassociationMessage: ").append(tEzsignfoldersignerassociationMessage).append("\n");
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
