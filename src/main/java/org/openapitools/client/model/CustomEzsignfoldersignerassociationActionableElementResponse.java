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

import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompoundUser;
import org.openapitools.client.model.EzsignsignerResponseCompound;
import org.openapitools.client.model.EzsignsignergroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignfoldersignerassociation Object with actionable elements
 **/
@ApiModel(description = "A Ezsignfoldersignerassociation Object with actionable elements")
public class CustomEzsignfoldersignerassociationActionableElementResponse {
  
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
  @SerializedName("objEzsignsignergroup")
  private EzsignsignergroupResponseCompound objEzsignsignergroup = null;
  @SerializedName("objUser")
  private EzsignfoldersignerassociationResponseCompoundUser objUser = null;
  @SerializedName("objEzsignsigner")
  private EzsignsignerResponseCompound objEzsignsigner = null;
  @SerializedName("bEzsignfoldersignerassociationHasactionableelementsCurrent")
  private Boolean bEzsignfoldersignerassociationHasactionableelementsCurrent = null;
  @SerializedName("bEzsignfoldersignerassociationHasactionableelementsFuture")
  private Boolean bEzsignfoldersignerassociationHasactionableelementsFuture = null;

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

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignergroupResponseCompound getObjEzsignsignergroup() {
    return objEzsignsignergroup;
  }
  public void setObjEzsignsignergroup(EzsignsignergroupResponseCompound objEzsignsignergroup) {
    this.objEzsignsignergroup = objEzsignsignergroup;
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

  /**
   * Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step
   **/
  @ApiModelProperty(required = true, value = "Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step")
  public Boolean getBEzsignfoldersignerassociationHasactionableelementsCurrent() {
    return bEzsignfoldersignerassociationHasactionableelementsCurrent;
  }
  public void setBEzsignfoldersignerassociationHasactionableelementsCurrent(Boolean bEzsignfoldersignerassociationHasactionableelementsCurrent) {
    this.bEzsignfoldersignerassociationHasactionableelementsCurrent = bEzsignfoldersignerassociationHasactionableelementsCurrent;
  }

  /**
   * Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step
   **/
  @ApiModelProperty(required = true, value = "Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step")
  public Boolean getBEzsignfoldersignerassociationHasactionableelementsFuture() {
    return bEzsignfoldersignerassociationHasactionableelementsFuture;
  }
  public void setBEzsignfoldersignerassociationHasactionableelementsFuture(Boolean bEzsignfoldersignerassociationHasactionableelementsFuture) {
    this.bEzsignfoldersignerassociationHasactionableelementsFuture = bEzsignfoldersignerassociationHasactionableelementsFuture;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldersignerassociationActionableElementResponse customEzsignfoldersignerassociationActionableElementResponse = (CustomEzsignfoldersignerassociationActionableElementResponse) o;
    return (this.pkiEzsignfoldersignerassociationID == null ? customEzsignfoldersignerassociationActionableElementResponse.pkiEzsignfoldersignerassociationID == null : this.pkiEzsignfoldersignerassociationID.equals(customEzsignfoldersignerassociationActionableElementResponse.pkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignfolderID == null ? customEzsignfoldersignerassociationActionableElementResponse.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(customEzsignfoldersignerassociationActionableElementResponse.fkiEzsignfolderID)) &&
        (this.bEzsignfoldersignerassociationDelayedsend == null ? customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationDelayedsend == null : this.bEzsignfoldersignerassociationDelayedsend.equals(customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationDelayedsend)) &&
        (this.bEzsignfoldersignerassociationReceivecopy == null ? customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationReceivecopy == null : this.bEzsignfoldersignerassociationReceivecopy.equals(customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationReceivecopy)) &&
        (this.tEzsignfoldersignerassociationMessage == null ? customEzsignfoldersignerassociationActionableElementResponse.tEzsignfoldersignerassociationMessage == null : this.tEzsignfoldersignerassociationMessage.equals(customEzsignfoldersignerassociationActionableElementResponse.tEzsignfoldersignerassociationMessage)) &&
        (this.bEzsignfoldersignerassociationAllowsigninginperson == null ? customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationAllowsigninginperson == null : this.bEzsignfoldersignerassociationAllowsigninginperson.equals(customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationAllowsigninginperson)) &&
        (this.objEzsignsignergroup == null ? customEzsignfoldersignerassociationActionableElementResponse.objEzsignsignergroup == null : this.objEzsignsignergroup.equals(customEzsignfoldersignerassociationActionableElementResponse.objEzsignsignergroup)) &&
        (this.objUser == null ? customEzsignfoldersignerassociationActionableElementResponse.objUser == null : this.objUser.equals(customEzsignfoldersignerassociationActionableElementResponse.objUser)) &&
        (this.objEzsignsigner == null ? customEzsignfoldersignerassociationActionableElementResponse.objEzsignsigner == null : this.objEzsignsigner.equals(customEzsignfoldersignerassociationActionableElementResponse.objEzsignsigner)) &&
        (this.bEzsignfoldersignerassociationHasactionableelementsCurrent == null ? customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationHasactionableelementsCurrent == null : this.bEzsignfoldersignerassociationHasactionableelementsCurrent.equals(customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationHasactionableelementsCurrent)) &&
        (this.bEzsignfoldersignerassociationHasactionableelementsFuture == null ? customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationHasactionableelementsFuture == null : this.bEzsignfoldersignerassociationHasactionableelementsFuture.equals(customEzsignfoldersignerassociationActionableElementResponse.bEzsignfoldersignerassociationHasactionableelementsFuture));
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
    result = 31 * result + (this.objEzsignsignergroup == null ? 0: this.objEzsignsignergroup.hashCode());
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationHasactionableelementsCurrent == null ? 0: this.bEzsignfoldersignerassociationHasactionableelementsCurrent.hashCode());
    result = 31 * result + (this.bEzsignfoldersignerassociationHasactionableelementsFuture == null ? 0: this.bEzsignfoldersignerassociationHasactionableelementsFuture.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldersignerassociationActionableElementResponse {\n");
    
    sb.append("  pkiEzsignfoldersignerassociationID: ").append(pkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  bEzsignfoldersignerassociationDelayedsend: ").append(bEzsignfoldersignerassociationDelayedsend).append("\n");
    sb.append("  bEzsignfoldersignerassociationReceivecopy: ").append(bEzsignfoldersignerassociationReceivecopy).append("\n");
    sb.append("  tEzsignfoldersignerassociationMessage: ").append(tEzsignfoldersignerassociationMessage).append("\n");
    sb.append("  bEzsignfoldersignerassociationAllowsigninginperson: ").append(bEzsignfoldersignerassociationAllowsigninginperson).append("\n");
    sb.append("  objEzsignsignergroup: ").append(objEzsignsignergroup).append("\n");
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("  bEzsignfoldersignerassociationHasactionableelementsCurrent: ").append(bEzsignfoldersignerassociationHasactionableelementsCurrent).append("\n");
    sb.append("  bEzsignfoldersignerassociationHasactionableelementsFuture: ").append(bEzsignfoldersignerassociationHasactionableelementsFuture).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
