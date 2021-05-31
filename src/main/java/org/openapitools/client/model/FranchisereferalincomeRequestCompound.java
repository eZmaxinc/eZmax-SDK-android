/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AddressRequest;
import org.openapitools.client.model.ContactRequestCompound;
import org.openapitools.client.model.FranchisereferalincomeRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Franchisereferalincome Object and children to create a complete structure
 **/
@ApiModel(description = "A Franchisereferalincome Object and children to create a complete structure")
public class FranchisereferalincomeRequestCompound {
  
  @SerializedName("objAddress")
  private AddressRequest objAddress = null;
  @SerializedName("a_objContact")
  private List<ContactRequestCompound> aObjContact = null;
  @SerializedName("fkiFranchisebrokerID")
  private Integer fkiFranchisebrokerID = null;
  @SerializedName("fkiFranchisereferalincomeprogramID")
  private Integer fkiFranchisereferalincomeprogramID = null;
  @SerializedName("fkiPeriodID")
  private Integer fkiPeriodID = null;
  @SerializedName("dFranchisereferalincomeLoan")
  private String dFranchisereferalincomeLoan = null;
  @SerializedName("dFranchisereferalincomeFranchiseamount")
  private String dFranchisereferalincomeFranchiseamount = null;
  @SerializedName("dFranchisereferalincomeFranchisoramount")
  private String dFranchisereferalincomeFranchisoramount = null;
  @SerializedName("dFranchisereferalincomeAgentamount")
  private String dFranchisereferalincomeAgentamount = null;
  @SerializedName("dtFranchisereferalincomeDisbursed")
  private String dtFranchisereferalincomeDisbursed = null;
  @SerializedName("tFranchisereferalincomeComment")
  private String tFranchisereferalincomeComment = null;
  @SerializedName("fkiFranchiseofficeID")
  private Integer fkiFranchiseofficeID = null;
  @SerializedName("sFranchisereferalincomeRemoteid")
  private String sFranchisereferalincomeRemoteid = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public AddressRequest getObjAddress() {
    return objAddress;
  }
  public void setObjAddress(AddressRequest objAddress) {
    this.objAddress = objAddress;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ContactRequestCompound> getAObjContact() {
    return aObjContact;
  }
  public void setAObjContact(List<ContactRequestCompound> aObjContact) {
    this.aObjContact = aObjContact;
  }

  /**
   * The unique ID of the Franchisebroker
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Franchisebroker")
  public Integer getFkiFranchisebrokerID() {
    return fkiFranchisebrokerID;
  }
  public void setFkiFranchisebrokerID(Integer fkiFranchisebrokerID) {
    this.fkiFranchisebrokerID = fkiFranchisebrokerID;
  }

  /**
   * The unique ID of the Franchisereferalincomeprogram
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Franchisereferalincomeprogram")
  public Integer getFkiFranchisereferalincomeprogramID() {
    return fkiFranchisereferalincomeprogramID;
  }
  public void setFkiFranchisereferalincomeprogramID(Integer fkiFranchisereferalincomeprogramID) {
    this.fkiFranchisereferalincomeprogramID = fkiFranchisereferalincomeprogramID;
  }

  /**
   * The unique ID of the Period
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Period")
  public Integer getFkiPeriodID() {
    return fkiPeriodID;
  }
  public void setFkiPeriodID(Integer fkiPeriodID) {
    this.fkiPeriodID = fkiPeriodID;
  }

  /**
   * The loan amount
   **/
  @ApiModelProperty(required = true, value = "The loan amount")
  public String getDFranchisereferalincomeLoan() {
    return dFranchisereferalincomeLoan;
  }
  public void setDFranchisereferalincomeLoan(String dFranchisereferalincomeLoan) {
    this.dFranchisereferalincomeLoan = dFranchisereferalincomeLoan;
  }

  /**
   * The amount that will be given to the franchise
   **/
  @ApiModelProperty(required = true, value = "The amount that will be given to the franchise")
  public String getDFranchisereferalincomeFranchiseamount() {
    return dFranchisereferalincomeFranchiseamount;
  }
  public void setDFranchisereferalincomeFranchiseamount(String dFranchisereferalincomeFranchiseamount) {
    this.dFranchisereferalincomeFranchiseamount = dFranchisereferalincomeFranchiseamount;
  }

  /**
   * The amount that will be kept by the franchisor
   **/
  @ApiModelProperty(required = true, value = "The amount that will be kept by the franchisor")
  public String getDFranchisereferalincomeFranchisoramount() {
    return dFranchisereferalincomeFranchisoramount;
  }
  public void setDFranchisereferalincomeFranchisoramount(String dFranchisereferalincomeFranchisoramount) {
    this.dFranchisereferalincomeFranchisoramount = dFranchisereferalincomeFranchisoramount;
  }

  /**
   * The amount that will be given to the agent
   **/
  @ApiModelProperty(required = true, value = "The amount that will be given to the agent")
  public String getDFranchisereferalincomeAgentamount() {
    return dFranchisereferalincomeAgentamount;
  }
  public void setDFranchisereferalincomeAgentamount(String dFranchisereferalincomeAgentamount) {
    this.dFranchisereferalincomeAgentamount = dFranchisereferalincomeAgentamount;
  }

  /**
   * The date the amounts were disbursed
   **/
  @ApiModelProperty(required = true, value = "The date the amounts were disbursed")
  public String getDtFranchisereferalincomeDisbursed() {
    return dtFranchisereferalincomeDisbursed;
  }
  public void setDtFranchisereferalincomeDisbursed(String dtFranchisereferalincomeDisbursed) {
    this.dtFranchisereferalincomeDisbursed = dtFranchisereferalincomeDisbursed;
  }

  /**
   * A comment about the transaction
   **/
  @ApiModelProperty(required = true, value = "A comment about the transaction")
  public String getTFranchisereferalincomeComment() {
    return tFranchisereferalincomeComment;
  }
  public void setTFranchisereferalincomeComment(String tFranchisereferalincomeComment) {
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
  }

  /**
   * The unique ID of the Franchisereoffice
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Franchisereoffice")
  public Integer getFkiFranchiseofficeID() {
    return fkiFranchiseofficeID;
  }
  public void setFkiFranchiseofficeID(Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSFranchisereferalincomeRemoteid() {
    return sFranchisereferalincomeRemoteid;
  }
  public void setSFranchisereferalincomeRemoteid(String sFranchisereferalincomeRemoteid) {
    this.sFranchisereferalincomeRemoteid = sFranchisereferalincomeRemoteid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeRequestCompound franchisereferalincomeRequestCompound = (FranchisereferalincomeRequestCompound) o;
    return (this.objAddress == null ? franchisereferalincomeRequestCompound.objAddress == null : this.objAddress.equals(franchisereferalincomeRequestCompound.objAddress)) &&
        (this.aObjContact == null ? franchisereferalincomeRequestCompound.aObjContact == null : this.aObjContact.equals(franchisereferalincomeRequestCompound.aObjContact)) &&
        (this.fkiFranchisebrokerID == null ? franchisereferalincomeRequestCompound.fkiFranchisebrokerID == null : this.fkiFranchisebrokerID.equals(franchisereferalincomeRequestCompound.fkiFranchisebrokerID)) &&
        (this.fkiFranchisereferalincomeprogramID == null ? franchisereferalincomeRequestCompound.fkiFranchisereferalincomeprogramID == null : this.fkiFranchisereferalincomeprogramID.equals(franchisereferalincomeRequestCompound.fkiFranchisereferalincomeprogramID)) &&
        (this.fkiPeriodID == null ? franchisereferalincomeRequestCompound.fkiPeriodID == null : this.fkiPeriodID.equals(franchisereferalincomeRequestCompound.fkiPeriodID)) &&
        (this.dFranchisereferalincomeLoan == null ? franchisereferalincomeRequestCompound.dFranchisereferalincomeLoan == null : this.dFranchisereferalincomeLoan.equals(franchisereferalincomeRequestCompound.dFranchisereferalincomeLoan)) &&
        (this.dFranchisereferalincomeFranchiseamount == null ? franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchiseamount == null : this.dFranchisereferalincomeFranchiseamount.equals(franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchiseamount)) &&
        (this.dFranchisereferalincomeFranchisoramount == null ? franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchisoramount == null : this.dFranchisereferalincomeFranchisoramount.equals(franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchisoramount)) &&
        (this.dFranchisereferalincomeAgentamount == null ? franchisereferalincomeRequestCompound.dFranchisereferalincomeAgentamount == null : this.dFranchisereferalincomeAgentamount.equals(franchisereferalincomeRequestCompound.dFranchisereferalincomeAgentamount)) &&
        (this.dtFranchisereferalincomeDisbursed == null ? franchisereferalincomeRequestCompound.dtFranchisereferalincomeDisbursed == null : this.dtFranchisereferalincomeDisbursed.equals(franchisereferalincomeRequestCompound.dtFranchisereferalincomeDisbursed)) &&
        (this.tFranchisereferalincomeComment == null ? franchisereferalincomeRequestCompound.tFranchisereferalincomeComment == null : this.tFranchisereferalincomeComment.equals(franchisereferalincomeRequestCompound.tFranchisereferalincomeComment)) &&
        (this.fkiFranchiseofficeID == null ? franchisereferalincomeRequestCompound.fkiFranchiseofficeID == null : this.fkiFranchiseofficeID.equals(franchisereferalincomeRequestCompound.fkiFranchiseofficeID)) &&
        (this.sFranchisereferalincomeRemoteid == null ? franchisereferalincomeRequestCompound.sFranchisereferalincomeRemoteid == null : this.sFranchisereferalincomeRemoteid.equals(franchisereferalincomeRequestCompound.sFranchisereferalincomeRemoteid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objAddress == null ? 0: this.objAddress.hashCode());
    result = 31 * result + (this.aObjContact == null ? 0: this.aObjContact.hashCode());
    result = 31 * result + (this.fkiFranchisebrokerID == null ? 0: this.fkiFranchisebrokerID.hashCode());
    result = 31 * result + (this.fkiFranchisereferalincomeprogramID == null ? 0: this.fkiFranchisereferalincomeprogramID.hashCode());
    result = 31 * result + (this.fkiPeriodID == null ? 0: this.fkiPeriodID.hashCode());
    result = 31 * result + (this.dFranchisereferalincomeLoan == null ? 0: this.dFranchisereferalincomeLoan.hashCode());
    result = 31 * result + (this.dFranchisereferalincomeFranchiseamount == null ? 0: this.dFranchisereferalincomeFranchiseamount.hashCode());
    result = 31 * result + (this.dFranchisereferalincomeFranchisoramount == null ? 0: this.dFranchisereferalincomeFranchisoramount.hashCode());
    result = 31 * result + (this.dFranchisereferalincomeAgentamount == null ? 0: this.dFranchisereferalincomeAgentamount.hashCode());
    result = 31 * result + (this.dtFranchisereferalincomeDisbursed == null ? 0: this.dtFranchisereferalincomeDisbursed.hashCode());
    result = 31 * result + (this.tFranchisereferalincomeComment == null ? 0: this.tFranchisereferalincomeComment.hashCode());
    result = 31 * result + (this.fkiFranchiseofficeID == null ? 0: this.fkiFranchiseofficeID.hashCode());
    result = 31 * result + (this.sFranchisereferalincomeRemoteid == null ? 0: this.sFranchisereferalincomeRemoteid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeRequestCompound {\n");
    
    sb.append("  objAddress: ").append(objAddress).append("\n");
    sb.append("  aObjContact: ").append(aObjContact).append("\n");
    sb.append("  fkiFranchisebrokerID: ").append(fkiFranchisebrokerID).append("\n");
    sb.append("  fkiFranchisereferalincomeprogramID: ").append(fkiFranchisereferalincomeprogramID).append("\n");
    sb.append("  fkiPeriodID: ").append(fkiPeriodID).append("\n");
    sb.append("  dFranchisereferalincomeLoan: ").append(dFranchisereferalincomeLoan).append("\n");
    sb.append("  dFranchisereferalincomeFranchiseamount: ").append(dFranchisereferalincomeFranchiseamount).append("\n");
    sb.append("  dFranchisereferalincomeFranchisoramount: ").append(dFranchisereferalincomeFranchisoramount).append("\n");
    sb.append("  dFranchisereferalincomeAgentamount: ").append(dFranchisereferalincomeAgentamount).append("\n");
    sb.append("  dtFranchisereferalincomeDisbursed: ").append(dtFranchisereferalincomeDisbursed).append("\n");
    sb.append("  tFranchisereferalincomeComment: ").append(tFranchisereferalincomeComment).append("\n");
    sb.append("  fkiFranchiseofficeID: ").append(fkiFranchiseofficeID).append("\n");
    sb.append("  sFranchisereferalincomeRemoteid: ").append(sFranchisereferalincomeRemoteid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
