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

import org.openapitools.client.model.DescriptionstaticResponseCompound;
import org.openapitools.client.model.EmailstaticResponseCompound;
import org.openapitools.client.model.FieldECommunicationrecipientObjecttype;
import org.openapitools.client.model.FieldECommunicationrecipientType;
import org.openapitools.client.model.PhonestaticResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communicationreciient Object
 **/
@ApiModel(description = "A Communicationreciient Object")
public class CommunicationrecipientResponseCompound {
  
  @SerializedName("pkiCommunicationrecipientID")
  private Integer pkiCommunicationrecipientID = null;
  @SerializedName("eCommunicationrecipientObjecttype")
  private FieldECommunicationrecipientObjecttype eCommunicationrecipientObjecttype = null;
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
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("fkiFranchiseofficeID")
  private Integer fkiFranchiseofficeID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiAgentincorporationID")
  private Integer fkiAgentincorporationID = null;
  @SerializedName("fkiAssistantID")
  private Integer fkiAssistantID = null;
  @SerializedName("fkiExternalbrokerID")
  private Integer fkiExternalbrokerID = null;
  @SerializedName("fkiEzcomagentID")
  private Integer fkiEzcomagentID = null;
  @SerializedName("fkiNotaryID")
  private Integer fkiNotaryID = null;
  @SerializedName("fkiRewardmemberID")
  private Integer fkiRewardmemberID = null;
  @SerializedName("fkiSupplierID")
  private Integer fkiSupplierID = null;
  @SerializedName("eCommunicationrecipientType")
  private FieldECommunicationrecipientType eCommunicationrecipientType = null;
  @SerializedName("objDescriptionstatic")
  private DescriptionstaticResponseCompound objDescriptionstatic = null;
  @SerializedName("objEmailstatic")
  private EmailstaticResponseCompound objEmailstatic = null;
  @SerializedName("objPhonestatic")
  private PhonestaticResponseCompound objPhonestatic = null;

  /**
   * The unique ID of the Communicationrecipient.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Communicationrecipient.")
  public Integer getPkiCommunicationrecipientID() {
    return pkiCommunicationrecipientID;
  }
  public void setPkiCommunicationrecipientID(Integer pkiCommunicationrecipientID) {
    this.pkiCommunicationrecipientID = pkiCommunicationrecipientID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldECommunicationrecipientObjecttype getECommunicationrecipientObjecttype() {
    return eCommunicationrecipientObjecttype;
  }
  public void setECommunicationrecipientObjecttype(FieldECommunicationrecipientObjecttype eCommunicationrecipientObjecttype) {
    this.eCommunicationrecipientObjecttype = eCommunicationrecipientObjecttype;
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
   * The unique ID of the Franchisereoffice
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Franchisereoffice")
  public Integer getFkiFranchiseofficeID() {
    return fkiFranchiseofficeID;
  }
  public void setFkiFranchiseofficeID(Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
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
   * The unique ID of the Agentincorporation.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Agentincorporation.")
  public Integer getFkiAgentincorporationID() {
    return fkiAgentincorporationID;
  }
  public void setFkiAgentincorporationID(Integer fkiAgentincorporationID) {
    this.fkiAgentincorporationID = fkiAgentincorporationID;
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
   * The unique ID of the Ezcomagent.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezcomagent.")
  public Integer getFkiEzcomagentID() {
    return fkiEzcomagentID;
  }
  public void setFkiEzcomagentID(Integer fkiEzcomagentID) {
    this.fkiEzcomagentID = fkiEzcomagentID;
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
   * The unique ID of the Rewardmember.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Rewardmember.")
  public Integer getFkiRewardmemberID() {
    return fkiRewardmemberID;
  }
  public void setFkiRewardmemberID(Integer fkiRewardmemberID) {
    this.fkiRewardmemberID = fkiRewardmemberID;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldECommunicationrecipientType getECommunicationrecipientType() {
    return eCommunicationrecipientType;
  }
  public void setECommunicationrecipientType(FieldECommunicationrecipientType eCommunicationrecipientType) {
    this.eCommunicationrecipientType = eCommunicationrecipientType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DescriptionstaticResponseCompound getObjDescriptionstatic() {
    return objDescriptionstatic;
  }
  public void setObjDescriptionstatic(DescriptionstaticResponseCompound objDescriptionstatic) {
    this.objDescriptionstatic = objDescriptionstatic;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EmailstaticResponseCompound getObjEmailstatic() {
    return objEmailstatic;
  }
  public void setObjEmailstatic(EmailstaticResponseCompound objEmailstatic) {
    this.objEmailstatic = objEmailstatic;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhonestaticResponseCompound getObjPhonestatic() {
    return objPhonestatic;
  }
  public void setObjPhonestatic(PhonestaticResponseCompound objPhonestatic) {
    this.objPhonestatic = objPhonestatic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationrecipientResponseCompound communicationrecipientResponseCompound = (CommunicationrecipientResponseCompound) o;
    return (this.pkiCommunicationrecipientID == null ? communicationrecipientResponseCompound.pkiCommunicationrecipientID == null : this.pkiCommunicationrecipientID.equals(communicationrecipientResponseCompound.pkiCommunicationrecipientID)) &&
        (this.eCommunicationrecipientObjecttype == null ? communicationrecipientResponseCompound.eCommunicationrecipientObjecttype == null : this.eCommunicationrecipientObjecttype.equals(communicationrecipientResponseCompound.eCommunicationrecipientObjecttype)) &&
        (this.fkiAgentID == null ? communicationrecipientResponseCompound.fkiAgentID == null : this.fkiAgentID.equals(communicationrecipientResponseCompound.fkiAgentID)) &&
        (this.fkiBrokerID == null ? communicationrecipientResponseCompound.fkiBrokerID == null : this.fkiBrokerID.equals(communicationrecipientResponseCompound.fkiBrokerID)) &&
        (this.fkiContactID == null ? communicationrecipientResponseCompound.fkiContactID == null : this.fkiContactID.equals(communicationrecipientResponseCompound.fkiContactID)) &&
        (this.fkiCustomerID == null ? communicationrecipientResponseCompound.fkiCustomerID == null : this.fkiCustomerID.equals(communicationrecipientResponseCompound.fkiCustomerID)) &&
        (this.fkiEmployeeID == null ? communicationrecipientResponseCompound.fkiEmployeeID == null : this.fkiEmployeeID.equals(communicationrecipientResponseCompound.fkiEmployeeID)) &&
        (this.fkiEzsignsignerID == null ? communicationrecipientResponseCompound.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(communicationrecipientResponseCompound.fkiEzsignsignerID)) &&
        (this.fkiFranchiseofficeID == null ? communicationrecipientResponseCompound.fkiFranchiseofficeID == null : this.fkiFranchiseofficeID.equals(communicationrecipientResponseCompound.fkiFranchiseofficeID)) &&
        (this.fkiUserID == null ? communicationrecipientResponseCompound.fkiUserID == null : this.fkiUserID.equals(communicationrecipientResponseCompound.fkiUserID)) &&
        (this.fkiAgentincorporationID == null ? communicationrecipientResponseCompound.fkiAgentincorporationID == null : this.fkiAgentincorporationID.equals(communicationrecipientResponseCompound.fkiAgentincorporationID)) &&
        (this.fkiAssistantID == null ? communicationrecipientResponseCompound.fkiAssistantID == null : this.fkiAssistantID.equals(communicationrecipientResponseCompound.fkiAssistantID)) &&
        (this.fkiExternalbrokerID == null ? communicationrecipientResponseCompound.fkiExternalbrokerID == null : this.fkiExternalbrokerID.equals(communicationrecipientResponseCompound.fkiExternalbrokerID)) &&
        (this.fkiEzcomagentID == null ? communicationrecipientResponseCompound.fkiEzcomagentID == null : this.fkiEzcomagentID.equals(communicationrecipientResponseCompound.fkiEzcomagentID)) &&
        (this.fkiNotaryID == null ? communicationrecipientResponseCompound.fkiNotaryID == null : this.fkiNotaryID.equals(communicationrecipientResponseCompound.fkiNotaryID)) &&
        (this.fkiRewardmemberID == null ? communicationrecipientResponseCompound.fkiRewardmemberID == null : this.fkiRewardmemberID.equals(communicationrecipientResponseCompound.fkiRewardmemberID)) &&
        (this.fkiSupplierID == null ? communicationrecipientResponseCompound.fkiSupplierID == null : this.fkiSupplierID.equals(communicationrecipientResponseCompound.fkiSupplierID)) &&
        (this.eCommunicationrecipientType == null ? communicationrecipientResponseCompound.eCommunicationrecipientType == null : this.eCommunicationrecipientType.equals(communicationrecipientResponseCompound.eCommunicationrecipientType)) &&
        (this.objDescriptionstatic == null ? communicationrecipientResponseCompound.objDescriptionstatic == null : this.objDescriptionstatic.equals(communicationrecipientResponseCompound.objDescriptionstatic)) &&
        (this.objEmailstatic == null ? communicationrecipientResponseCompound.objEmailstatic == null : this.objEmailstatic.equals(communicationrecipientResponseCompound.objEmailstatic)) &&
        (this.objPhonestatic == null ? communicationrecipientResponseCompound.objPhonestatic == null : this.objPhonestatic.equals(communicationrecipientResponseCompound.objPhonestatic));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationrecipientID == null ? 0: this.pkiCommunicationrecipientID.hashCode());
    result = 31 * result + (this.eCommunicationrecipientObjecttype == null ? 0: this.eCommunicationrecipientObjecttype.hashCode());
    result = 31 * result + (this.fkiAgentID == null ? 0: this.fkiAgentID.hashCode());
    result = 31 * result + (this.fkiBrokerID == null ? 0: this.fkiBrokerID.hashCode());
    result = 31 * result + (this.fkiContactID == null ? 0: this.fkiContactID.hashCode());
    result = 31 * result + (this.fkiCustomerID == null ? 0: this.fkiCustomerID.hashCode());
    result = 31 * result + (this.fkiEmployeeID == null ? 0: this.fkiEmployeeID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiFranchiseofficeID == null ? 0: this.fkiFranchiseofficeID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiAgentincorporationID == null ? 0: this.fkiAgentincorporationID.hashCode());
    result = 31 * result + (this.fkiAssistantID == null ? 0: this.fkiAssistantID.hashCode());
    result = 31 * result + (this.fkiExternalbrokerID == null ? 0: this.fkiExternalbrokerID.hashCode());
    result = 31 * result + (this.fkiEzcomagentID == null ? 0: this.fkiEzcomagentID.hashCode());
    result = 31 * result + (this.fkiNotaryID == null ? 0: this.fkiNotaryID.hashCode());
    result = 31 * result + (this.fkiRewardmemberID == null ? 0: this.fkiRewardmemberID.hashCode());
    result = 31 * result + (this.fkiSupplierID == null ? 0: this.fkiSupplierID.hashCode());
    result = 31 * result + (this.eCommunicationrecipientType == null ? 0: this.eCommunicationrecipientType.hashCode());
    result = 31 * result + (this.objDescriptionstatic == null ? 0: this.objDescriptionstatic.hashCode());
    result = 31 * result + (this.objEmailstatic == null ? 0: this.objEmailstatic.hashCode());
    result = 31 * result + (this.objPhonestatic == null ? 0: this.objPhonestatic.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationrecipientResponseCompound {\n");
    
    sb.append("  pkiCommunicationrecipientID: ").append(pkiCommunicationrecipientID).append("\n");
    sb.append("  eCommunicationrecipientObjecttype: ").append(eCommunicationrecipientObjecttype).append("\n");
    sb.append("  fkiAgentID: ").append(fkiAgentID).append("\n");
    sb.append("  fkiBrokerID: ").append(fkiBrokerID).append("\n");
    sb.append("  fkiContactID: ").append(fkiContactID).append("\n");
    sb.append("  fkiCustomerID: ").append(fkiCustomerID).append("\n");
    sb.append("  fkiEmployeeID: ").append(fkiEmployeeID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  fkiFranchiseofficeID: ").append(fkiFranchiseofficeID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiAgentincorporationID: ").append(fkiAgentincorporationID).append("\n");
    sb.append("  fkiAssistantID: ").append(fkiAssistantID).append("\n");
    sb.append("  fkiExternalbrokerID: ").append(fkiExternalbrokerID).append("\n");
    sb.append("  fkiEzcomagentID: ").append(fkiEzcomagentID).append("\n");
    sb.append("  fkiNotaryID: ").append(fkiNotaryID).append("\n");
    sb.append("  fkiRewardmemberID: ").append(fkiRewardmemberID).append("\n");
    sb.append("  fkiSupplierID: ").append(fkiSupplierID).append("\n");
    sb.append("  eCommunicationrecipientType: ").append(eCommunicationrecipientType).append("\n");
    sb.append("  objDescriptionstatic: ").append(objDescriptionstatic).append("\n");
    sb.append("  objEmailstatic: ").append(objEmailstatic).append("\n");
    sb.append("  objPhonestatic: ").append(objPhonestatic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
