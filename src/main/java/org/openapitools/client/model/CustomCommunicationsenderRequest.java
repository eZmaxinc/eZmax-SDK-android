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
 * A Communicationsender Object
 **/
@ApiModel(description = "A Communicationsender Object")
public class CustomCommunicationsenderRequest {
  
  @SerializedName("fkiAgentID")
  private Integer fkiAgentID = null;
  @SerializedName("fkiBrokerID")
  private Integer fkiBrokerID = null;
  @SerializedName("fkiMailboxsharedID")
  private Integer fkiMailboxsharedID = null;
  @SerializedName("fkiPhonelinesharedID")
  private Integer fkiPhonelinesharedID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;

  /**
   * The unique ID of the Agent.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Agent.")
  public Integer getFkiAgentID() {
    return fkiAgentID;
  }
  public void setFkiAgentID(Integer fkiAgentID) {
    this.fkiAgentID = fkiAgentID;
  }

  /**
   * The unique ID of the Broker.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Broker.")
  public Integer getFkiBrokerID() {
    return fkiBrokerID;
  }
  public void setFkiBrokerID(Integer fkiBrokerID) {
    this.fkiBrokerID = fkiBrokerID;
  }

  /**
   * The unique ID of the Mailboxshared
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Mailboxshared")
  public Integer getFkiMailboxsharedID() {
    return fkiMailboxsharedID;
  }
  public void setFkiMailboxsharedID(Integer fkiMailboxsharedID) {
    this.fkiMailboxsharedID = fkiMailboxsharedID;
  }

  /**
   * The unique ID of the Phonelineshared
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Phonelineshared")
  public Integer getFkiPhonelinesharedID() {
    return fkiPhonelinesharedID;
  }
  public void setFkiPhonelinesharedID(Integer fkiPhonelinesharedID) {
    this.fkiPhonelinesharedID = fkiPhonelinesharedID;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCommunicationsenderRequest customCommunicationsenderRequest = (CustomCommunicationsenderRequest) o;
    return (this.fkiAgentID == null ? customCommunicationsenderRequest.fkiAgentID == null : this.fkiAgentID.equals(customCommunicationsenderRequest.fkiAgentID)) &&
        (this.fkiBrokerID == null ? customCommunicationsenderRequest.fkiBrokerID == null : this.fkiBrokerID.equals(customCommunicationsenderRequest.fkiBrokerID)) &&
        (this.fkiMailboxsharedID == null ? customCommunicationsenderRequest.fkiMailboxsharedID == null : this.fkiMailboxsharedID.equals(customCommunicationsenderRequest.fkiMailboxsharedID)) &&
        (this.fkiPhonelinesharedID == null ? customCommunicationsenderRequest.fkiPhonelinesharedID == null : this.fkiPhonelinesharedID.equals(customCommunicationsenderRequest.fkiPhonelinesharedID)) &&
        (this.fkiUserID == null ? customCommunicationsenderRequest.fkiUserID == null : this.fkiUserID.equals(customCommunicationsenderRequest.fkiUserID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiAgentID == null ? 0: this.fkiAgentID.hashCode());
    result = 31 * result + (this.fkiBrokerID == null ? 0: this.fkiBrokerID.hashCode());
    result = 31 * result + (this.fkiMailboxsharedID == null ? 0: this.fkiMailboxsharedID.hashCode());
    result = 31 * result + (this.fkiPhonelinesharedID == null ? 0: this.fkiPhonelinesharedID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCommunicationsenderRequest {\n");
    
    sb.append("  fkiAgentID: ").append(fkiAgentID).append("\n");
    sb.append("  fkiBrokerID: ").append(fkiBrokerID).append("\n");
    sb.append("  fkiMailboxsharedID: ").append(fkiMailboxsharedID).append("\n");
    sb.append("  fkiPhonelinesharedID: ").append(fkiPhonelinesharedID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
