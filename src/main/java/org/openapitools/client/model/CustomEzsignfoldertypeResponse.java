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
  @SerializedName("bEzsignfoldertypeIncludeproofsigner")
  private Boolean bEzsignfoldertypeIncludeproofsigner = null;
  @SerializedName("bEzsignfoldertypeIncludeproofuser")
  private Boolean bEzsignfoldertypeIncludeproofuser = null;
  @SerializedName("bEzsignfoldertypeDelegate")
  private Boolean bEzsignfoldertypeDelegate = null;
  @SerializedName("bEzsignfoldertypeReassign")
  private Boolean bEzsignfoldertypeReassign = null;

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
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
  @ApiModelProperty(required = true, value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * Whether we include the proof with the signed Ezsigndocument for Ezsignsigners
   **/
  @ApiModelProperty(required = true, value = "Whether we include the proof with the signed Ezsigndocument for Ezsignsigners")
  public Boolean getBEzsignfoldertypeIncludeproofsigner() {
    return bEzsignfoldertypeIncludeproofsigner;
  }
  public void setBEzsignfoldertypeIncludeproofsigner(Boolean bEzsignfoldertypeIncludeproofsigner) {
    this.bEzsignfoldertypeIncludeproofsigner = bEzsignfoldertypeIncludeproofsigner;
  }

  /**
   * Whether we include the proof with the signed Ezsigndocument for users
   **/
  @ApiModelProperty(required = true, value = "Whether we include the proof with the signed Ezsigndocument for users")
  public Boolean getBEzsignfoldertypeIncludeproofuser() {
    return bEzsignfoldertypeIncludeproofuser;
  }
  public void setBEzsignfoldertypeIncludeproofuser(Boolean bEzsignfoldertypeIncludeproofuser) {
    this.bEzsignfoldertypeIncludeproofuser = bEzsignfoldertypeIncludeproofuser;
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
   * Wheter if Reassignment of signature is allowed to another signatory or not
   **/
  @ApiModelProperty(value = "Wheter if Reassignment of signature is allowed to another signatory or not")
  public Boolean getBEzsignfoldertypeReassign() {
    return bEzsignfoldertypeReassign;
  }
  public void setBEzsignfoldertypeReassign(Boolean bEzsignfoldertypeReassign) {
    this.bEzsignfoldertypeReassign = bEzsignfoldertypeReassign;
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
        (this.bEzsignfoldertypeIncludeproofsigner == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeIncludeproofsigner == null : this.bEzsignfoldertypeIncludeproofsigner.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeIncludeproofsigner)) &&
        (this.bEzsignfoldertypeIncludeproofuser == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeIncludeproofuser == null : this.bEzsignfoldertypeIncludeproofuser.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeIncludeproofuser)) &&
        (this.bEzsignfoldertypeDelegate == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeDelegate == null : this.bEzsignfoldertypeDelegate.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeDelegate)) &&
        (this.bEzsignfoldertypeReassign == null ? customEzsignfoldertypeResponse.bEzsignfoldertypeReassign == null : this.bEzsignfoldertypeReassign.equals(customEzsignfoldertypeResponse.bEzsignfoldertypeReassign));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldertypeID == null ? 0: this.pkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIncludeproofsigner == null ? 0: this.bEzsignfoldertypeIncludeproofsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIncludeproofuser == null ? 0: this.bEzsignfoldertypeIncludeproofuser.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeDelegate == null ? 0: this.bEzsignfoldertypeDelegate.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeReassign == null ? 0: this.bEzsignfoldertypeReassign.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldertypeResponse {\n");
    
    sb.append("  pkiEzsignfoldertypeID: ").append(pkiEzsignfoldertypeID).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  bEzsignfoldertypeIncludeproofsigner: ").append(bEzsignfoldertypeIncludeproofsigner).append("\n");
    sb.append("  bEzsignfoldertypeIncludeproofuser: ").append(bEzsignfoldertypeIncludeproofuser).append("\n");
    sb.append("  bEzsignfoldertypeDelegate: ").append(bEzsignfoldertypeDelegate).append("\n");
    sb.append("  bEzsignfoldertypeReassign: ").append(bEzsignfoldertypeReassign).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
