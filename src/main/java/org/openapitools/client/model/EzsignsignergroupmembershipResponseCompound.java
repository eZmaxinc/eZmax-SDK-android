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

import org.openapitools.client.model.EzsignsignergroupmembershipResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignsignergroupmembership Object
 **/
@ApiModel(description = "A Ezsignsignergroupmembership Object")
public class EzsignsignergroupmembershipResponseCompound extends EzsignsignergroupmembershipResponse {
  
  @SerializedName("pkiEzsignsignergroupmembershipID")
  private Integer pkiEzsignsignergroupmembershipID = null;
  @SerializedName("fkiEzsignsignergroupID")
  private Integer fkiEzsignsignergroupID = null;
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;

  /**
   * The unique ID of the Ezsignsignergroupmembership
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsignergroupmembership")
  public Integer getPkiEzsignsignergroupmembershipID() {
    return pkiEzsignsignergroupmembershipID;
  }
  public void setPkiEzsignsignergroupmembershipID(Integer pkiEzsignsignergroupmembershipID) {
    this.pkiEzsignsignergroupmembershipID = pkiEzsignsignergroupmembershipID;
  }

  /**
   * The unique ID of the Ezsignsignergroup
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsignergroup")
  public Integer getFkiEzsignsignergroupID() {
    return fkiEzsignsignergroupID;
  }
  public void setFkiEzsignsignergroupID(Integer fkiEzsignsignergroupID) {
    this.fkiEzsignsignergroupID = fkiEzsignsignergroupID;
  }

  /**
   * The unique ID of the Ezsignsigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsigner")
  public Integer getFkiEzsignsignerID() {
    return fkiEzsignsignerID;
  }
  public void setFkiEzsignsignerID(Integer fkiEzsignsignerID) {
    this.fkiEzsignsignerID = fkiEzsignsignerID;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignergroupmembershipResponseCompound ezsignsignergroupmembershipResponseCompound = (EzsignsignergroupmembershipResponseCompound) o;
    return (this.pkiEzsignsignergroupmembershipID == null ? ezsignsignergroupmembershipResponseCompound.pkiEzsignsignergroupmembershipID == null : this.pkiEzsignsignergroupmembershipID.equals(ezsignsignergroupmembershipResponseCompound.pkiEzsignsignergroupmembershipID)) &&
        (this.fkiEzsignsignergroupID == null ? ezsignsignergroupmembershipResponseCompound.fkiEzsignsignergroupID == null : this.fkiEzsignsignergroupID.equals(ezsignsignergroupmembershipResponseCompound.fkiEzsignsignergroupID)) &&
        (this.fkiEzsignsignerID == null ? ezsignsignergroupmembershipResponseCompound.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(ezsignsignergroupmembershipResponseCompound.fkiEzsignsignerID)) &&
        (this.fkiUserID == null ? ezsignsignergroupmembershipResponseCompound.fkiUserID == null : this.fkiUserID.equals(ezsignsignergroupmembershipResponseCompound.fkiUserID)) &&
        (this.fkiUsergroupID == null ? ezsignsignergroupmembershipResponseCompound.fkiUsergroupID == null : this.fkiUsergroupID.equals(ezsignsignergroupmembershipResponseCompound.fkiUsergroupID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignergroupmembershipID == null ? 0: this.pkiEzsignsignergroupmembershipID.hashCode());
    result = 31 * result + (this.fkiEzsignsignergroupID == null ? 0: this.fkiEzsignsignergroupID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupmembershipResponseCompound {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  pkiEzsignsignergroupmembershipID: ").append(pkiEzsignsignergroupmembershipID).append("\n");
    sb.append("  fkiEzsignsignergroupID: ").append(fkiEzsignsignergroupID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
