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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfoldersignerassociation Object
 **/
@ApiModel(description = "An Ezsignfoldersignerassociation Object")
public class EzsignfoldersignerassociationResponse {
  
  @SerializedName("pkiEzsignfoldersignerassociationID")
  private Integer pkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("bEzsignfoldersignerassociationReceivecopy")
  private Boolean bEzsignfoldersignerassociationReceivecopy = null;

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
   * The unique ID of the Ezsignsigner
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsigner")
  public Integer getFkiEzsignsignerID() {
    return fkiEzsignsignerID;
  }
  public void setFkiEzsignsignerID(Integer fkiEzsignsignerID) {
    this.fkiEzsignsignerID = fkiEzsignsignerID;
  }

  /**
   * The unique ID of the User
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
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
    EzsignfoldersignerassociationResponse ezsignfoldersignerassociationResponse = (EzsignfoldersignerassociationResponse) o;
    return (this.pkiEzsignfoldersignerassociationID == null ? ezsignfoldersignerassociationResponse.pkiEzsignfoldersignerassociationID == null : this.pkiEzsignfoldersignerassociationID.equals(ezsignfoldersignerassociationResponse.pkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationResponse.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationResponse.fkiEzsignfolderID)) &&
        (this.fkiEzsignsignerID == null ? ezsignfoldersignerassociationResponse.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(ezsignfoldersignerassociationResponse.fkiEzsignsignerID)) &&
        (this.fkiUserID == null ? ezsignfoldersignerassociationResponse.fkiUserID == null : this.fkiUserID.equals(ezsignfoldersignerassociationResponse.fkiUserID)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationReceivecopy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldersignerassociationID == null ? 0: this.pkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationReceivecopy == null ? 0: this.bEzsignfoldersignerassociationReceivecopy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponse {\n");
    
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
