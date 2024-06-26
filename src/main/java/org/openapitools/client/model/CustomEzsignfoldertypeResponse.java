/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * A Custom Ezsignfoldertype Object
 **/
@ApiModel(description = "A Custom Ezsignfoldertype Object")
public class CustomEzsignfoldertypeResponse {
  
  @SerializedName("pkiEzsignfoldertypeID")
  private Integer pkiEzsignfoldertypeID = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("bEzsignfoldertypeSendproofezsignsigner")
  private Boolean bEzsignfoldertypeSendproofezsignsigner = null;
  @SerializedName("bEzsignfoldertypeAllowdownloadattachmentezsignsigner")
  private Boolean bEzsignfoldertypeAllowdownloadattachmentezsignsigner = null;
  @SerializedName("bEzsignfoldertypeAllowdownloadproofezsignsigner")
  private Boolean bEzsignfoldertypeAllowdownloadproofezsignsigner = null;
  @SerializedName("bEzsignfoldertypeDelegate")
  private Boolean bEzsignfoldertypeDelegate = null;
  @SerializedName("bEzsignfoldertypeDiscussion")
  private Boolean bEzsignfoldertypeDiscussion = null;
  @SerializedName("bEzsignfoldertypeReassignezsignsigner")
  private Boolean bEzsignfoldertypeReassignezsignsigner = null;
  @SerializedName("bEzsignfoldertypeReassignuser")
  private Boolean bEzsignfoldertypeReassignuser = null;

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getPkiEzsignfoldertypeID() {
    return pkiEzsignfoldertypeID;
  }
  public void setPkiEzsignfoldertypeID(Integer pkiEzsignfoldertypeID) {
    this.pkiEzsignfoldertypeID = pkiEzsignfoldertypeID;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * Whether we send the proof in the email to Ezsignsigner
   **/
  @ApiModelProperty(value = "Whether we send the proof in the email to Ezsignsigner")
  public Boolean getBEzsignfoldertypeSendproofezsignsigner() {
    return bEzsignfoldertypeSendproofezsignsigner;
  }
  public void setBEzsignfoldertypeSendproofezsignsigner(Boolean bEzsignfoldertypeSendproofezsignsigner) {
    this.bEzsignfoldertypeSendproofezsignsigner = bEzsignfoldertypeSendproofezsignsigner;
  }

  /**
   * Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner
   **/
  @ApiModelProperty(value = "Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner")
  public Boolean getBEzsignfoldertypeAllowdownloadattachmentezsignsigner() {
    return bEzsignfoldertypeAllowdownloadattachmentezsignsigner;
  }
  public void setBEzsignfoldertypeAllowdownloadattachmentezsignsigner(Boolean bEzsignfoldertypeAllowdownloadattachmentezsignsigner) {
    this.bEzsignfoldertypeAllowdownloadattachmentezsignsigner = bEzsignfoldertypeAllowdownloadattachmentezsignsigner;
  }

  /**
   * Whether we allow the proof to be downloaded by an Ezsignsigner
   **/
  @ApiModelProperty(value = "Whether we allow the proof to be downloaded by an Ezsignsigner")
  public Boolean getBEzsignfoldertypeAllowdownloadproofezsignsigner() {
    return bEzsignfoldertypeAllowdownloadproofezsignsigner;
  }
  public void setBEzsignfoldertypeAllowdownloadproofezsignsigner(Boolean bEzsignfoldertypeAllowdownloadproofezsignsigner) {
    this.bEzsignfoldertypeAllowdownloadproofezsignsigner = bEzsignfoldertypeAllowdownloadproofezsignsigner;
  }

  /**
   * Wheter if delegation of signature is allowed to another user or not
   **/
  @ApiModelProperty(value = "Wheter if delegation of signature is allowed to another user or not")
  public Boolean getBEzsignfoldertypeDelegate() {
    return bEzsignfoldertypeDelegate;
  }
  public void setBEzsignfoldertypeDelegate(Boolean bEzsignfoldertypeDelegate) {
    this.bEzsignfoldertypeDelegate = bEzsignfoldertypeDelegate;
  }

  /**
   * Wheter if creating a new Discussion is allowed or not
   **/
  @ApiModelProperty(value = "Wheter if creating a new Discussion is allowed or not")
  public Boolean getBEzsignfoldertypeDiscussion() {
    return bEzsignfoldertypeDiscussion;
  }
  public void setBEzsignfoldertypeDiscussion(Boolean bEzsignfoldertypeDiscussion) {
    this.bEzsignfoldertypeDiscussion = bEzsignfoldertypeDiscussion;
  }

  /**
   * Wheter if Reassignment of signature is allowed by a signatory to another signatory or not
   **/
  @ApiModelProperty(value = "Wheter if Reassignment of signature is allowed by a signatory to another signatory or not")
  public Boolean getBEzsignfoldertypeReassignezsignsigner() {
    return bEzsignfoldertypeReassignezsignsigner;
  }
  public void setBEzsignfoldertypeReassignezsignsigner(Boolean bEzsignfoldertypeReassignezsignsigner) {
    this.bEzsignfoldertypeReassignezsignsigner = bEzsignfoldertypeReassignezsignsigner;
  }

  /**
   * Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not
   **/
  @ApiModelProperty(value = "Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not")
  public Boolean getBEzsignfoldertypeReassignuser() {
    return bEzsignfoldertypeReassignuser;
  }
  public void setBEzsignfoldertypeReassignuser(Boolean bEzsignfoldertypeReassignuser) {
    this.bEzsignfoldertypeReassignuser = bEzsignfoldertypeReassignuser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldertypeResponse customEzsignfoldertypeResponse = (CustomEzsignfoldertypeResponse) o;
    return (this.pkiEzsignfoldertypeID == null ? customEzsignfoldertypeResponse.pkiEzsignfoldertypeID == null : this.pkiEzsignfoldertypeID.equals(customEzsignfoldertypeResponse.pkiEzsignfoldertypeID)) &&
        (this.sEzsignfoldertypeNameX == null ? customEzsignfoldertypeResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(customEzsignfoldertypeResponse.sEzsignfoldertypeNameX)) &&
        (this.bEzsignfoldertypeSendproofezsignsigner == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeSendproofezsignsigner == null : this.bEzsignfoldertypeSendproofezsignsigner.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeSendproofezsignsigner)) &&
        (this.bEzsignfoldertypeAllowdownloadattachmentezsignsigner == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeAllowdownloadattachmentezsignsigner == null : this.bEzsignfoldertypeAllowdownloadattachmentezsignsigner.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeAllowdownloadattachmentezsignsigner)) &&
        (this.bEzsignfoldertypeAllowdownloadproofezsignsigner == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeAllowdownloadproofezsignsigner == null : this.bEzsignfoldertypeAllowdownloadproofezsignsigner.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeAllowdownloadproofezsignsigner)) &&
        (this.bEzsignfoldertypeDelegate == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeDelegate == null : this.bEzsignfoldertypeDelegate.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeDelegate)) &&
        (this.bEzsignfoldertypeDiscussion == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeDiscussion == null : this.bEzsignfoldertypeDiscussion.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeDiscussion)) &&
        (this.bEzsignfoldertypeReassignezsignsigner == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeReassignezsignsigner == null : this.bEzsignfoldertypeReassignezsignsigner.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeReassignezsignsigner)) &&
        (this.bEzsignfoldertypeReassignuser == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeReassignuser == null : this.bEzsignfoldertypeReassignuser.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeReassignuser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldertypeID == null ? 0: this.pkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendproofezsignsigner == null ? 0: this.bEzsignfoldertypeSendproofezsignsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeAllowdownloadattachmentezsignsigner == null ? 0: this.bEzsignfoldertypeAllowdownloadattachmentezsignsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeAllowdownloadproofezsignsigner == null ? 0: this.bEzsignfoldertypeAllowdownloadproofezsignsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeDelegate == null ? 0: this.bEzsignfoldertypeDelegate.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeDiscussion == null ? 0: this.bEzsignfoldertypeDiscussion.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeReassignezsignsigner == null ? 0: this.bEzsignfoldertypeReassignezsignsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeReassignuser == null ? 0: this.bEzsignfoldertypeReassignuser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldertypeResponse {\n");
    
    sb.append("  pkiEzsignfoldertypeID: ").append(pkiEzsignfoldertypeID).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  bEzsignfoldertypeSendproofezsignsigner: ").append(bEzsignfoldertypeSendproofezsignsigner).append("\n");
    sb.append("  bEzsignfoldertypeAllowdownloadattachmentezsignsigner: ").append(bEzsignfoldertypeAllowdownloadattachmentezsignsigner).append("\n");
    sb.append("  bEzsignfoldertypeAllowdownloadproofezsignsigner: ").append(bEzsignfoldertypeAllowdownloadproofezsignsigner).append("\n");
    sb.append("  bEzsignfoldertypeDelegate: ").append(bEzsignfoldertypeDelegate).append("\n");
    sb.append("  bEzsignfoldertypeDiscussion: ").append(bEzsignfoldertypeDiscussion).append("\n");
    sb.append("  bEzsignfoldertypeReassignezsignsigner: ").append(bEzsignfoldertypeReassignezsignsigner).append("\n");
    sb.append("  bEzsignfoldertypeReassignuser: ").append(bEzsignfoldertypeReassignuser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
