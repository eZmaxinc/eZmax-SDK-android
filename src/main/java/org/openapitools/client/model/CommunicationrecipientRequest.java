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

import org.openapitools.client.model.FieldECommunicationrecipientType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communicationrecipient Object
 **/
@ApiModel(description = "A Communicationrecipient Object")
public class CommunicationrecipientRequest {
  
  @SerializedName("pkiCommunicationrecipientID")
  private Integer pkiCommunicationrecipientID = null;
  @SerializedName("fkiAgentID")
  private Integer fkiAgentID = null;
  @SerializedName("fkiBrokerID")
  private Integer fkiBrokerID = null;
  @SerializedName("fkiContactID")
  private Integer fkiContactID = null;
  @SerializedName("fkiCustomerID")
  private Integer fkiCustomerID = null;
  @SerializedName("fkiEmployeeID")
  private Integer fkiEmployeeID = null;
  @SerializedName("fkiAssistantID")
  private Integer fkiAssistantID = null;
  @SerializedName("fkiExternalbrokerID")
  private Integer fkiExternalbrokerID = null;
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("fkiNotaryID")
  private Integer fkiNotaryID = null;
  @SerializedName("fkiSupplierID")
  private Integer fkiSupplierID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiMailboxsharedID")
  private Integer fkiMailboxsharedID = null;
  @SerializedName("fkiPhonelinesharedID")
  private Integer fkiPhonelinesharedID = null;
  @SerializedName("eCommunicationrecipientType")
  private FieldECommunicationrecipientType eCommunicationrecipientType = null;

  /**
   * The unique ID of the Communicationrecipient.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Communicationrecipient.")
  public Integer getPkiCommunicationrecipientID() {
    return pkiCommunicationrecipientID;
  }
  public void setPkiCommunicationrecipientID(Integer pkiCommunicationrecipientID) {
    this.pkiCommunicationrecipientID = pkiCommunicationrecipientID;
  }

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
   * The unique ID of the Contact
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Contact")
  public Integer getFkiContactID() {
    return fkiContactID;
  }
  public void setFkiContactID(Integer fkiContactID) {
    this.fkiContactID = fkiContactID;
  }

  /**
   * The unique ID of the Customer.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Customer.")
  public Integer getFkiCustomerID() {
    return fkiCustomerID;
  }
  public void setFkiCustomerID(Integer fkiCustomerID) {
    this.fkiCustomerID = fkiCustomerID;
  }

  /**
   * The unique ID of the Employee.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Employee.")
  public Integer getFkiEmployeeID() {
    return fkiEmployeeID;
  }
  public void setFkiEmployeeID(Integer fkiEmployeeID) {
    this.fkiEmployeeID = fkiEmployeeID;
  }

  /**
   * The unique ID of the Assistant.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Assistant.")
  public Integer getFkiAssistantID() {
    return fkiAssistantID;
  }
  public void setFkiAssistantID(Integer fkiAssistantID) {
    this.fkiAssistantID = fkiAssistantID;
  }

  /**
   * The unique ID of the Externalbroker.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Externalbroker.")
  public Integer getFkiExternalbrokerID() {
    return fkiExternalbrokerID;
  }
  public void setFkiExternalbrokerID(Integer fkiExternalbrokerID) {
    this.fkiExternalbrokerID = fkiExternalbrokerID;
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
   * The unique ID of the Notary.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Notary.")
  public Integer getFkiNotaryID() {
    return fkiNotaryID;
  }
  public void setFkiNotaryID(Integer fkiNotaryID) {
    this.fkiNotaryID = fkiNotaryID;
  }

  /**
   * The unique ID of the Supplier.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Supplier.")
  public Integer getFkiSupplierID() {
    return fkiSupplierID;
  }
  public void setFkiSupplierID(Integer fkiSupplierID) {
    this.fkiSupplierID = fkiSupplierID;
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
   **/
  @ApiModelProperty(value = "")
  public FieldECommunicationrecipientType getECommunicationrecipientType() {
    return eCommunicationrecipientType;
  }
  public void setECommunicationrecipientType(FieldECommunicationrecipientType eCommunicationrecipientType) {
    this.eCommunicationrecipientType = eCommunicationrecipientType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationrecipientRequest communicationrecipientRequest = (CommunicationrecipientRequest) o;
    return (this.pkiCommunicationrecipientID == null ? communicationrecipientRequest.pkiCommunicationrecipientID == null : this.pkiCommunicationrecipientID.equals(communicationrecipientRequest.pkiCommunicationrecipientID)) &&
        (this.fkiAgentID == null ? communicationrecipientRequest.fkiAgentID == null : this.fkiAgentID.equals(communicationrecipientRequest.fkiAgentID)) &&
        (this.fkiBrokerID == null ? communicationrecipientRequest.fkiBrokerID == null : this.fkiBrokerID.equals(communicationrecipientRequest.fkiBrokerID)) &&
        (this.fkiContactID == null ? communicationrecipientRequest.fkiContactID == null : this.fkiContactID.equals(communicationrecipientRequest.fkiContactID)) &&
        (this.fkiCustomerID == null ? communicationrecipientRequest.fkiCustomerID == null : this.fkiCustomerID.equals(communicationrecipientRequest.fkiCustomerID)) &&
        (this.fkiEmployeeID == null ? communicationrecipientRequest.fkiEmployeeID == null : this.fkiEmployeeID.equals(communicationrecipientRequest.fkiEmployeeID)) &&
        (this.fkiAssistantID == null ? communicationrecipientRequest.fkiAssistantID == null : this.fkiAssistantID.equals(communicationrecipientRequest.fkiAssistantID)) &&
        (this.fkiExternalbrokerID == null ? communicationrecipientRequest.fkiExternalbrokerID == null : this.fkiExternalbrokerID.equals(communicationrecipientRequest.fkiExternalbrokerID)) &&
        (this.fkiEzsignsignerID == null ? communicationrecipientRequest.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(communicationrecipientRequest.fkiEzsignsignerID)) &&
        (this.fkiNotaryID == null ? communicationrecipientRequest.fkiNotaryID == null : this.fkiNotaryID.equals(communicationrecipientRequest.fkiNotaryID)) &&
        (this.fkiSupplierID == null ? communicationrecipientRequest.fkiSupplierID == null : this.fkiSupplierID.equals(communicationrecipientRequest.fkiSupplierID)) &&
        (this.fkiUserID == null ? communicationrecipientRequest.fkiUserID == null : this.fkiUserID.equals(communicationrecipientRequest.fkiUserID)) &&
        (this.fkiMailboxsharedID == null ? communicationrecipientRequest.fkiMailboxsharedID == null : this.fkiMailboxsharedID.equals(communicationrecipientRequest.fkiMailboxsharedID)) &&
        (this.fkiPhonelinesharedID == null ? communicationrecipientRequest.fkiPhonelinesharedID == null : this.fkiPhonelinesharedID.equals(communicationrecipientRequest.fkiPhonelinesharedID)) &&
        (this.eCommunicationrecipientType == null ? communicationrecipientRequest.eCommunicationrecipientType == null : this.eCommunicationrecipientType.equals(communicationrecipientRequest.eCommunicationrecipientType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationrecipientID == null ? 0: this.pkiCommunicationrecipientID.hashCode());
    result = 31 * result + (this.fkiAgentID == null ? 0: this.fkiAgentID.hashCode());
    result = 31 * result + (this.fkiBrokerID == null ? 0: this.fkiBrokerID.hashCode());
    result = 31 * result + (this.fkiContactID == null ? 0: this.fkiContactID.hashCode());
    result = 31 * result + (this.fkiCustomerID == null ? 0: this.fkiCustomerID.hashCode());
    result = 31 * result + (this.fkiEmployeeID == null ? 0: this.fkiEmployeeID.hashCode());
    result = 31 * result + (this.fkiAssistantID == null ? 0: this.fkiAssistantID.hashCode());
    result = 31 * result + (this.fkiExternalbrokerID == null ? 0: this.fkiExternalbrokerID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiNotaryID == null ? 0: this.fkiNotaryID.hashCode());
    result = 31 * result + (this.fkiSupplierID == null ? 0: this.fkiSupplierID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiMailboxsharedID == null ? 0: this.fkiMailboxsharedID.hashCode());
    result = 31 * result + (this.fkiPhonelinesharedID == null ? 0: this.fkiPhonelinesharedID.hashCode());
    result = 31 * result + (this.eCommunicationrecipientType == null ? 0: this.eCommunicationrecipientType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationrecipientRequest {\n");
    
    sb.append("  pkiCommunicationrecipientID: ").append(pkiCommunicationrecipientID).append("\n");
    sb.append("  fkiAgentID: ").append(fkiAgentID).append("\n");
    sb.append("  fkiBrokerID: ").append(fkiBrokerID).append("\n");
    sb.append("  fkiContactID: ").append(fkiContactID).append("\n");
    sb.append("  fkiCustomerID: ").append(fkiCustomerID).append("\n");
    sb.append("  fkiEmployeeID: ").append(fkiEmployeeID).append("\n");
    sb.append("  fkiAssistantID: ").append(fkiAssistantID).append("\n");
    sb.append("  fkiExternalbrokerID: ").append(fkiExternalbrokerID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  fkiNotaryID: ").append(fkiNotaryID).append("\n");
    sb.append("  fkiSupplierID: ").append(fkiSupplierID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiMailboxsharedID: ").append(fkiMailboxsharedID).append("\n");
    sb.append("  fkiPhonelinesharedID: ").append(fkiPhonelinesharedID).append("\n");
    sb.append("  eCommunicationrecipientType: ").append(eCommunicationrecipientType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}