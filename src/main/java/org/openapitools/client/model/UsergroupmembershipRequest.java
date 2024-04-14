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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Usergroupmembership Object
 **/
@ApiModel(description = "A Usergroupmembership Object")
public class UsergroupmembershipRequest {
  
  @SerializedName("pkiUsergroupmembershipID")
  private Integer pkiUsergroupmembershipID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiUsergroupexternalID")
  private Integer fkiUsergroupexternalID = null;

  /**
   * The unique ID of the Usergroupmembership
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroupmembership")
  public Integer getPkiUsergroupmembershipID() {
    return pkiUsergroupmembershipID;
  }
  public void setPkiUsergroupmembershipID(Integer pkiUsergroupmembershipID) {
    this.pkiUsergroupmembershipID = pkiUsergroupmembershipID;
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
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The unique ID of the Usergroupexternal
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroupexternal")
  public Integer getFkiUsergroupexternalID() {
    return fkiUsergroupexternalID;
  }
  public void setFkiUsergroupexternalID(Integer fkiUsergroupexternalID) {
    this.fkiUsergroupexternalID = fkiUsergroupexternalID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupmembershipRequest usergroupmembershipRequest = (UsergroupmembershipRequest) o;
    return (this.pkiUsergroupmembershipID == null ? usergroupmembershipRequest.pkiUsergroupmembershipID == null : this.pkiUsergroupmembershipID.equals(usergroupmembershipRequest.pkiUsergroupmembershipID)) &&
        (this.fkiUsergroupID == null ? usergroupmembershipRequest.fkiUsergroupID == null : this.fkiUsergroupID.equals(usergroupmembershipRequest.fkiUsergroupID)) &&
        (this.fkiUserID == null ? usergroupmembershipRequest.fkiUserID == null : this.fkiUserID.equals(usergroupmembershipRequest.fkiUserID)) &&
        (this.fkiUsergroupexternalID == null ? usergroupmembershipRequest.fkiUsergroupexternalID == null : this.fkiUsergroupexternalID.equals(usergroupmembershipRequest.fkiUsergroupexternalID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUsergroupmembershipID == null ? 0: this.pkiUsergroupmembershipID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiUsergroupexternalID == null ? 0: this.fkiUsergroupexternalID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupmembershipRequest {\n");
    
    sb.append("  pkiUsergroupmembershipID: ").append(pkiUsergroupmembershipID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiUsergroupexternalID: ").append(fkiUsergroupexternalID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
