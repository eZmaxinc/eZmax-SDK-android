/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
  @SerializedName("bEzsignfoldersignerassociationDelayedsend")
  private Boolean bEzsignfoldersignerassociationDelayedsend = null;
  @SerializedName("bEzsignfoldersignerassociationReceivecopy")
  private Boolean bEzsignfoldersignerassociationReceivecopy = null;
  @SerializedName("tEzsignfoldersignerassociationMessage")
  private String tEzsignfoldersignerassociationMessage = null;
  @SerializedName("bEzsignfoldersignerassociationAllowsigninginperson")
  private Boolean bEzsignfoldersignerassociationAllowsigninginperson = null;

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
   * If the Ezsignfoldersignerassociation is allowed to sign in person or not
   **/
  @ApiModelProperty(required = true, value = "If the Ezsignfoldersignerassociation is allowed to sign in person or not")
  public Boolean getBEzsignfoldersignerassociationAllowsigninginperson() {
    return bEzsignfoldersignerassociationAllowsigninginperson;
  }
  public void setBEzsignfoldersignerassociationAllowsigninginperson(Boolean bEzsignfoldersignerassociationAllowsigninginperson) {
    this.bEzsignfoldersignerassociationAllowsigninginperson = bEzsignfoldersignerassociationAllowsigninginperson;
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
        (this.bEzsignfoldersignerassociationDelayedsend == null ? ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationDelayedsend == null : this.bEzsignfoldersignerassociationDelayedsend.equals(ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationDelayedsend)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationReceivecopy)) &&
        (this.tEzsignfoldersignerassociationMessage == null ? ezsignfoldersignerassociationResponse.tEzsignfoldersignerassociationMessage == null : this.tEzsignfoldersignerassociationMessage.equals(ezsignfoldersignerassociationResponse.tEzsignfoldersignerassociationMessage)) &&
        (this.bEzsignfoldersignerassociationAllowsigninginperson == null ? ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationAllowsigninginperson == null : this.bEzsignfoldersignerassociationAllowsigninginperson.equals(ezsignfoldersignerassociationResponse.bEzsignfoldersignerassociationAllowsigninginperson));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldersignerassociationID == null ? 0: this.pkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationDelayedsend == null ? 0: this.bEzsignfoldersignerassociationDelayedsend.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationReceivecopy == null ? 0: this.bEzsignfoldersignerassociationReceivecopy.hashCode());
    result = 31 * result + (this.tEzsignfoldersignerassociationMessage == null ? 0: this.tEzsignfoldersignerassociationMessage.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationAllowsigninginperson == null ? 0: this.bEzsignfoldersignerassociationAllowsigninginperson.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponse {\n");
    
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  bEzsignfoldersignerassociationDelayedsend: ").append(bEzsignfoldersignerassociationDelayedsend).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("  tEzsignfoldersignerassociationMessage: ").append(tEzsignfoldersignerassociationMessage).append("\n");
    sb.append("  bEzsignfoldersignerassociationAllowsigninginperson: ").append(bEzsignfoldersignerassociationAllowsigninginperson).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
