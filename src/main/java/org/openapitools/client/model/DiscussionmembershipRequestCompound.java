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
 * A Discussionmembership Object and children
 **/
@ApiModel(description = "A Discussionmembership Object and children")
public class DiscussionmembershipRequestCompound {
  
  @SerializedName("pkiDiscussionmembershipID")
  private Integer pkiDiscussionmembershipID = null;
  @SerializedName("fkiDiscussionID")
  private Integer fkiDiscussionID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("fkiModulesectionID")
  private Integer fkiModulesectionID = null;
  @SerializedName("dtDiscussionmembershipJoined")
  private String dtDiscussionmembershipJoined = null;

  /**
   * The unique ID of the Discussionmembership
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Discussionmembership")
  public Integer getPkiDiscussionmembershipID() {
    return pkiDiscussionmembershipID;
  }
  public void setPkiDiscussionmembershipID(Integer pkiDiscussionmembershipID) {
    this.pkiDiscussionmembershipID = pkiDiscussionmembershipID;
  }

  /**
   * The unique ID of the Discussion
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Discussion")
  public Integer getFkiDiscussionID() {
    return fkiDiscussionID;
  }
  public void setFkiDiscussionID(Integer fkiDiscussionID) {
    this.fkiDiscussionID = fkiDiscussionID;
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
   * The unique ID of the Modulesection
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Modulesection")
  public Integer getFkiModulesectionID() {
    return fkiModulesectionID;
  }
  public void setFkiModulesectionID(Integer fkiModulesectionID) {
    this.fkiModulesectionID = fkiModulesectionID;
  }

  /**
   * The joined date of the Discussionmembership
   **/
  @ApiModelProperty(required = true, value = "The joined date of the Discussionmembership")
  public String getDtDiscussionmembershipJoined() {
    return dtDiscussionmembershipJoined;
  }
  public void setDtDiscussionmembershipJoined(String dtDiscussionmembershipJoined) {
    this.dtDiscussionmembershipJoined = dtDiscussionmembershipJoined;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionmembershipRequestCompound discussionmembershipRequestCompound = (DiscussionmembershipRequestCompound) o;
    return (this.pkiDiscussionmembershipID == null ? discussionmembershipRequestCompound.pkiDiscussionmembershipID == null : this.pkiDiscussionmembershipID.equals(discussionmembershipRequestCompound.pkiDiscussionmembershipID)) &&
        (this.fkiDiscussionID == null ? discussionmembershipRequestCompound.fkiDiscussionID == null : this.fkiDiscussionID.equals(discussionmembershipRequestCompound.fkiDiscussionID)) &&
        (this.fkiUserID == null ? discussionmembershipRequestCompound.fkiUserID == null : this.fkiUserID.equals(discussionmembershipRequestCompound.fkiUserID)) &&
        (this.fkiUsergroupID == null ? discussionmembershipRequestCompound.fkiUsergroupID == null : this.fkiUsergroupID.equals(discussionmembershipRequestCompound.fkiUsergroupID)) &&
        (this.fkiModulesectionID == null ? discussionmembershipRequestCompound.fkiModulesectionID == null : this.fkiModulesectionID.equals(discussionmembershipRequestCompound.fkiModulesectionID)) &&
        (this.dtDiscussionmembershipJoined == null ? discussionmembershipRequestCompound.dtDiscussionmembershipJoined == null : this.dtDiscussionmembershipJoined.equals(discussionmembershipRequestCompound.dtDiscussionmembershipJoined));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiDiscussionmembershipID == null ? 0: this.pkiDiscussionmembershipID.hashCode());
    result = 31 * result + (this.fkiDiscussionID == null ? 0: this.fkiDiscussionID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.fkiModulesectionID == null ? 0: this.fkiModulesectionID.hashCode());
    result = 31 * result + (this.dtDiscussionmembershipJoined == null ? 0: this.dtDiscussionmembershipJoined.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionmembershipRequestCompound {\n");
    
    sb.append("  pkiDiscussionmembershipID: ").append(pkiDiscussionmembershipID).append("\n");
    sb.append("  fkiDiscussionID: ").append(fkiDiscussionID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  fkiModulesectionID: ").append(fkiModulesectionID).append("\n");
    sb.append("  dtDiscussionmembershipJoined: ").append(dtDiscussionmembershipJoined).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
