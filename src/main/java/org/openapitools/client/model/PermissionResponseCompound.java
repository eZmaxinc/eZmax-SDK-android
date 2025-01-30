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
 * A Permission Object and children to create a complete structure
 **/
@ApiModel(description = "A Permission Object and children to create a complete structure")
public class PermissionResponseCompound {
  
  @SerializedName("pkiPermissionID")
  private Integer pkiPermissionID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiApikeyID")
  private Integer fkiApikeyID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("fkiCompanyID")
  private Integer fkiCompanyID = null;
  @SerializedName("fkiModulesectionID")
  private Integer fkiModulesectionID = null;
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;

  /**
   * The unique ID of the Permission
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Permission")
  public Integer getPkiPermissionID() {
    return pkiPermissionID;
  }
  public void setPkiPermissionID(Integer pkiPermissionID) {
    this.pkiPermissionID = pkiPermissionID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The unique ID of the Apikey
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Apikey")
  public Integer getFkiApikeyID() {
    return fkiApikeyID;
  }
  public void setFkiApikeyID(Integer fkiApikeyID) {
    this.fkiApikeyID = fkiApikeyID;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroup")
  public Integer getFkiUsergroupID() {
    return fkiUsergroupID;
  }
  public void setFkiUsergroupID(Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
  }

  /**
   * The unique ID of the Company
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Company")
  public Integer getFkiCompanyID() {
    return fkiCompanyID;
  }
  public void setFkiCompanyID(Integer fkiCompanyID) {
    this.fkiCompanyID = fkiCompanyID;
  }

  /**
   * The unique ID of the Modulesection
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Modulesection")
  public Integer getFkiModulesectionID() {
    return fkiModulesectionID;
  }
  public void setFkiModulesectionID(Integer fkiModulesectionID) {
    this.fkiModulesectionID = fkiModulesectionID;
  }

  /**
   * The Name of the Company in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Company in the language of the requester")
  public String getSCompanyNameX() {
    return sCompanyNameX;
  }
  public void setSCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionResponseCompound permissionResponseCompound = (PermissionResponseCompound) o;
    return (this.pkiPermissionID == null ? permissionResponseCompound.pkiPermissionID == null : this.pkiPermissionID.equals(permissionResponseCompound.pkiPermissionID)) &&
        (this.fkiUserID == null ? permissionResponseCompound.fkiUserID == null : this.fkiUserID.equals(permissionResponseCompound.fkiUserID)) &&
        (this.fkiApikeyID == null ? permissionResponseCompound.fkiApikeyID == null : this.fkiApikeyID.equals(permissionResponseCompound.fkiApikeyID)) &&
        (this.fkiUsergroupID == null ? permissionResponseCompound.fkiUsergroupID == null : this.fkiUsergroupID.equals(permissionResponseCompound.fkiUsergroupID)) &&
        (this.fkiCompanyID == null ? permissionResponseCompound.fkiCompanyID == null : this.fkiCompanyID.equals(permissionResponseCompound.fkiCompanyID)) &&
        (this.fkiModulesectionID == null ? permissionResponseCompound.fkiModulesectionID == null : this.fkiModulesectionID.equals(permissionResponseCompound.fkiModulesectionID)) &&
        (this.sCompanyNameX == null ? permissionResponseCompound.sCompanyNameX == null : this.sCompanyNameX.equals(permissionResponseCompound.sCompanyNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPermissionID == null ? 0: this.pkiPermissionID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiApikeyID == null ? 0: this.fkiApikeyID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.fkiCompanyID == null ? 0: this.fkiCompanyID.hashCode());
    result = 31 * result + (this.fkiModulesectionID == null ? 0: this.fkiModulesectionID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionResponseCompound {\n");
    
    sb.append("  pkiPermissionID: ").append(pkiPermissionID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiApikeyID: ").append(fkiApikeyID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  fkiCompanyID: ").append(fkiCompanyID).append("\n");
    sb.append("  fkiModulesectionID: ").append(fkiModulesectionID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
