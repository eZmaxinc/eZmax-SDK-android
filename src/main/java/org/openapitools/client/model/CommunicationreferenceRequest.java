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
 * A Communicationreference Object
 **/
@ApiModel(description = "A Communicationreference Object")
public class CommunicationreferenceRequest {
  
  @SerializedName("pkiCommunicationreferenceID")
  private Integer pkiCommunicationreferenceID = null;
  @SerializedName("fkiBuyercontractID")
  private Integer fkiBuyercontractID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiInscriptionID")
  private Integer fkiInscriptionID = null;
  @SerializedName("fkiInscriptiontempID")
  private Integer fkiInscriptiontempID = null;
  @SerializedName("fkiInvoiceID")
  private Integer fkiInvoiceID = null;
  @SerializedName("fkiOtherincomeID")
  private Integer fkiOtherincomeID = null;
  @SerializedName("fkiElectronicfundstransferID")
  private Integer fkiElectronicfundstransferID = null;
  @SerializedName("fkiRejectedoffertopurchaseID")
  private Integer fkiRejectedoffertopurchaseID = null;

  /**
   * The unique ID of the Communicationreference
   * minimum: 0
   * maximum: 4294967295
   **/
  @ApiModelProperty(value = "The unique ID of the Communicationreference")
  public Integer getPkiCommunicationreferenceID() {
    return pkiCommunicationreferenceID;
  }
  public void setPkiCommunicationreferenceID(Integer pkiCommunicationreferenceID) {
    this.pkiCommunicationreferenceID = pkiCommunicationreferenceID;
  }

  /**
   * The unique ID of the Buyercontract
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Buyercontract")
  public Integer getFkiBuyercontractID() {
    return fkiBuyercontractID;
  }
  public void setFkiBuyercontractID(Integer fkiBuyercontractID) {
    this.fkiBuyercontractID = fkiBuyercontractID;
  }

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The unique ID of the Inscription.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Inscription.")
  public Integer getFkiInscriptionID() {
    return fkiInscriptionID;
  }
  public void setFkiInscriptionID(Integer fkiInscriptionID) {
    this.fkiInscriptionID = fkiInscriptionID;
  }

  /**
   * The unique ID of the Inscriptiontemp
   * minimum: 1
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Inscriptiontemp")
  public Integer getFkiInscriptiontempID() {
    return fkiInscriptiontempID;
  }
  public void setFkiInscriptiontempID(Integer fkiInscriptiontempID) {
    this.fkiInscriptiontempID = fkiInscriptiontempID;
  }

  /**
   * The unique ID of the Invoice.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Invoice.")
  public Integer getFkiInvoiceID() {
    return fkiInvoiceID;
  }
  public void setFkiInvoiceID(Integer fkiInvoiceID) {
    this.fkiInvoiceID = fkiInvoiceID;
  }

  /**
   * The unique ID of the Otherincome
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Otherincome")
  public Integer getFkiOtherincomeID() {
    return fkiOtherincomeID;
  }
  public void setFkiOtherincomeID(Integer fkiOtherincomeID) {
    this.fkiOtherincomeID = fkiOtherincomeID;
  }

  /**
   * The unique ID of the Electronicfundstransfer
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Electronicfundstransfer")
  public Integer getFkiElectronicfundstransferID() {
    return fkiElectronicfundstransferID;
  }
  public void setFkiElectronicfundstransferID(Integer fkiElectronicfundstransferID) {
    this.fkiElectronicfundstransferID = fkiElectronicfundstransferID;
  }

  /**
   * The unique ID of the Rejectedoffertopurchase
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Rejectedoffertopurchase")
  public Integer getFkiRejectedoffertopurchaseID() {
    return fkiRejectedoffertopurchaseID;
  }
  public void setFkiRejectedoffertopurchaseID(Integer fkiRejectedoffertopurchaseID) {
    this.fkiRejectedoffertopurchaseID = fkiRejectedoffertopurchaseID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationreferenceRequest communicationreferenceRequest = (CommunicationreferenceRequest) o;
    return (this.pkiCommunicationreferenceID == null ? communicationreferenceRequest.pkiCommunicationreferenceID == null : this.pkiCommunicationreferenceID.equals(communicationreferenceRequest.pkiCommunicationreferenceID)) &&
        (this.fkiBuyercontractID == null ? communicationreferenceRequest.fkiBuyercontractID == null : this.fkiBuyercontractID.equals(communicationreferenceRequest.fkiBuyercontractID)) &&
        (this.fkiEzsignfolderID == null ? communicationreferenceRequest.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(communicationreferenceRequest.fkiEzsignfolderID)) &&
        (this.fkiInscriptionID == null ? communicationreferenceRequest.fkiInscriptionID == null : this.fkiInscriptionID.equals(communicationreferenceRequest.fkiInscriptionID)) &&
        (this.fkiInscriptiontempID == null ? communicationreferenceRequest.fkiInscriptiontempID == null : this.fkiInscriptiontempID.equals(communicationreferenceRequest.fkiInscriptiontempID)) &&
        (this.fkiInvoiceID == null ? communicationreferenceRequest.fkiInvoiceID == null : this.fkiInvoiceID.equals(communicationreferenceRequest.fkiInvoiceID)) &&
        (this.fkiOtherincomeID == null ? communicationreferenceRequest.fkiOtherincomeID == null : this.fkiOtherincomeID.equals(communicationreferenceRequest.fkiOtherincomeID)) &&
        (this.fkiElectronicfundstransferID == null ? communicationreferenceRequest.fkiElectronicfundstransferID == null : this.fkiElectronicfundstransferID.equals(communicationreferenceRequest.fkiElectronicfundstransferID)) &&
        (this.fkiRejectedoffertopurchaseID == null ? communicationreferenceRequest.fkiRejectedoffertopurchaseID == null : this.fkiRejectedoffertopurchaseID.equals(communicationreferenceRequest.fkiRejectedoffertopurchaseID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationreferenceID == null ? 0: this.pkiCommunicationreferenceID.hashCode());
    result = 31 * result + (this.fkiBuyercontractID == null ? 0: this.fkiBuyercontractID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiInscriptionID == null ? 0: this.fkiInscriptionID.hashCode());
    result = 31 * result + (this.fkiInscriptiontempID == null ? 0: this.fkiInscriptiontempID.hashCode());
    result = 31 * result + (this.fkiInvoiceID == null ? 0: this.fkiInvoiceID.hashCode());
    result = 31 * result + (this.fkiOtherincomeID == null ? 0: this.fkiOtherincomeID.hashCode());
    result = 31 * result + (this.fkiElectronicfundstransferID == null ? 0: this.fkiElectronicfundstransferID.hashCode());
    result = 31 * result + (this.fkiRejectedoffertopurchaseID == null ? 0: this.fkiRejectedoffertopurchaseID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationreferenceRequest {\n");
    
    sb.append("  pkiCommunicationreferenceID: ").append(pkiCommunicationreferenceID).append("\n");
    sb.append("  fkiBuyercontractID: ").append(fkiBuyercontractID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiInscriptionID: ").append(fkiInscriptionID).append("\n");
    sb.append("  fkiInscriptiontempID: ").append(fkiInscriptiontempID).append("\n");
    sb.append("  fkiInvoiceID: ").append(fkiInvoiceID).append("\n");
    sb.append("  fkiOtherincomeID: ").append(fkiOtherincomeID).append("\n");
    sb.append("  fkiElectronicfundstransferID: ").append(fkiElectronicfundstransferID).append("\n");
    sb.append("  fkiRejectedoffertopurchaseID: ").append(fkiRejectedoffertopurchaseID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
