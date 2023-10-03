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
 * A Usergroupdelegation Object
 **/
@ApiModel(description = "A Usergroupdelegation Object")
public class UsergroupdelegationResponseCompound {
  
  @SerializedName("pkiUsergroupdelegationID")
  private Integer pkiUsergroupdelegationID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sUsergroupNameX")
  private String sUsergroupNameX = null;

  /**
   * The unique ID of the Usergroupdelegation
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Usergroupdelegation")
  public Integer getPkiUsergroupdelegationID() {
    return pkiUsergroupdelegationID;
  }
  public void setPkiUsergroupdelegationID(Integer pkiUsergroupdelegationID) {
    this.pkiUsergroupdelegationID = pkiUsergroupdelegationID;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Usergroup")
  public Integer getFkiUsergroupID() {
    return fkiUsergroupID;
  }
  public void setFkiUsergroupID(Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The first name of the user
   **/
  @ApiModelProperty(required = true, value = "The first name of the user")
  public String getSUserFirstname() {
    return sUserFirstname;
  }
  public void setSUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }

  /**
   * The last name of the user
   **/
  @ApiModelProperty(required = true, value = "The last name of the user")
  public String getSUserLastname() {
    return sUserLastname;
  }
  public void setSUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }

  /**
   * The login name of the User.
   **/
  @ApiModelProperty(required = true, value = "The login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Usergroup in the language of the requester")
  public String getSUsergroupNameX() {
    return sUsergroupNameX;
  }
  public void setSUsergroupNameX(String sUsergroupNameX) {
    this.sUsergroupNameX = sUsergroupNameX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupdelegationResponseCompound usergroupdelegationResponseCompound = (UsergroupdelegationResponseCompound) o;
    return (this.pkiUsergroupdelegationID == null ? usergroupdelegationResponseCompound.pkiUsergroupdelegationID == null : this.pkiUsergroupdelegationID.equals(usergroupdelegationResponseCompound.pkiUsergroupdelegationID)) &&
        (this.fkiUsergroupID == null ? usergroupdelegationResponseCompound.fkiUsergroupID == null : this.fkiUsergroupID.equals(usergroupdelegationResponseCompound.fkiUsergroupID)) &&
        (this.fkiUserID == null ? usergroupdelegationResponseCompound.fkiUserID == null : this.fkiUserID.equals(usergroupdelegationResponseCompound.fkiUserID)) &&
        (this.sUserFirstname == null ? usergroupdelegationResponseCompound.sUserFirstname == null : this.sUserFirstname.equals(usergroupdelegationResponseCompound.sUserFirstname)) &&
        (this.sUserLastname == null ? usergroupdelegationResponseCompound.sUserLastname == null : this.sUserLastname.equals(usergroupdelegationResponseCompound.sUserLastname)) &&
        (this.sUserLoginname == null ? usergroupdelegationResponseCompound.sUserLoginname == null : this.sUserLoginname.equals(usergroupdelegationResponseCompound.sUserLoginname)) &&
        (this.sEmailAddress == null ? usergroupdelegationResponseCompound.sEmailAddress == null : this.sEmailAddress.equals(usergroupdelegationResponseCompound.sEmailAddress)) &&
        (this.sUsergroupNameX == null ? usergroupdelegationResponseCompound.sUsergroupNameX == null : this.sUsergroupNameX.equals(usergroupdelegationResponseCompound.sUsergroupNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUsergroupdelegationID == null ? 0: this.pkiUsergroupdelegationID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sUsergroupNameX == null ? 0: this.sUsergroupNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupdelegationResponseCompound {\n");
    
    sb.append("  pkiUsergroupdelegationID: ").append(pkiUsergroupdelegationID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sUsergroupNameX: ").append(sUsergroupNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}