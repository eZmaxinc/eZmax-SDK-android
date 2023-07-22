/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * A Userstaged Object
 **/
@ApiModel(description = "A Userstaged Object")
public class UserstagedResponseCompound {
  
  @SerializedName("pkiUserstagedID")
  private Integer pkiUserstagedID = null;
  @SerializedName("fkiEmailID")
  private Integer fkiEmailID = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sUserstagedFirstname")
  private String sUserstagedFirstname = null;
  @SerializedName("sUserstagedLastname")
  private String sUserstagedLastname = null;
  @SerializedName("sUserstagedExternalid")
  private String sUserstagedExternalid = null;

  /**
   * The unique ID of the Userstaged
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Userstaged")
  public Integer getPkiUserstagedID() {
    return pkiUserstagedID;
  }
  public void setPkiUserstagedID(Integer pkiUserstagedID) {
    this.pkiUserstagedID = pkiUserstagedID;
  }

  /**
   * The unique ID of the Email
   * minimum: 1
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Email")
  public Integer getFkiEmailID() {
    return fkiEmailID;
  }
  public void setFkiEmailID(Integer fkiEmailID) {
    this.fkiEmailID = fkiEmailID;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(required = true, value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The firstname of the Userstaged
   **/
  @ApiModelProperty(required = true, value = "The firstname of the Userstaged")
  public String getSUserstagedFirstname() {
    return sUserstagedFirstname;
  }
  public void setSUserstagedFirstname(String sUserstagedFirstname) {
    this.sUserstagedFirstname = sUserstagedFirstname;
  }

  /**
   * The lastname of the Userstaged
   **/
  @ApiModelProperty(required = true, value = "The lastname of the Userstaged")
  public String getSUserstagedLastname() {
    return sUserstagedLastname;
  }
  public void setSUserstagedLastname(String sUserstagedLastname) {
    this.sUserstagedLastname = sUserstagedLastname;
  }

  /**
   * The externalid of the Userstaged
   **/
  @ApiModelProperty(required = true, value = "The externalid of the Userstaged")
  public String getSUserstagedExternalid() {
    return sUserstagedExternalid;
  }
  public void setSUserstagedExternalid(String sUserstagedExternalid) {
    this.sUserstagedExternalid = sUserstagedExternalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserstagedResponseCompound userstagedResponseCompound = (UserstagedResponseCompound) o;
    return (this.pkiUserstagedID == null ? userstagedResponseCompound.pkiUserstagedID == null : this.pkiUserstagedID.equals(userstagedResponseCompound.pkiUserstagedID)) &&
        (this.fkiEmailID == null ? userstagedResponseCompound.fkiEmailID == null : this.fkiEmailID.equals(userstagedResponseCompound.fkiEmailID)) &&
        (this.sEmailAddress == null ? userstagedResponseCompound.sEmailAddress == null : this.sEmailAddress.equals(userstagedResponseCompound.sEmailAddress)) &&
        (this.sUserstagedFirstname == null ? userstagedResponseCompound.sUserstagedFirstname == null : this.sUserstagedFirstname.equals(userstagedResponseCompound.sUserstagedFirstname)) &&
        (this.sUserstagedLastname == null ? userstagedResponseCompound.sUserstagedLastname == null : this.sUserstagedLastname.equals(userstagedResponseCompound.sUserstagedLastname)) &&
        (this.sUserstagedExternalid == null ? userstagedResponseCompound.sUserstagedExternalid == null : this.sUserstagedExternalid.equals(userstagedResponseCompound.sUserstagedExternalid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserstagedID == null ? 0: this.pkiUserstagedID.hashCode());
    result = 31 * result + (this.fkiEmailID == null ? 0: this.fkiEmailID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sUserstagedFirstname == null ? 0: this.sUserstagedFirstname.hashCode());
    result = 31 * result + (this.sUserstagedLastname == null ? 0: this.sUserstagedLastname.hashCode());
    result = 31 * result + (this.sUserstagedExternalid == null ? 0: this.sUserstagedExternalid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserstagedResponseCompound {\n");
    
    sb.append("  pkiUserstagedID: ").append(pkiUserstagedID).append("\n");
    sb.append("  fkiEmailID: ").append(fkiEmailID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sUserstagedFirstname: ").append(sUserstagedFirstname).append("\n");
    sb.append("  sUserstagedLastname: ").append(sUserstagedLastname).append("\n");
    sb.append("  sUserstagedExternalid: ").append(sUserstagedExternalid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
