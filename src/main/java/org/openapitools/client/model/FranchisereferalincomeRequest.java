/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * An Franchisereferalincome Object
 **/
@ApiModel(description = "An Franchisereferalincome Object")
public class FranchisereferalincomeRequest {
  
  @SerializedName("pkiFranchisereferalincomeID")
  private Integer pkiFranchisereferalincomeID = null;
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
   * The unique ID of the Franchisereferalincome
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Franchisereferalincome")
  public Integer getPkiFranchisereferalincomeID() {
    return pkiFranchisereferalincomeID;
  }
  public void setPkiFranchisereferalincomeID(Integer pkiFranchisereferalincomeID) {
    this.pkiFranchisereferalincomeID = pkiFranchisereferalincomeID;
  }

  /**
   * The unique ID of the Franchisebroker
   * minimum: 0
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
   * minimum: 0
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
   * minimum: 0
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
   * Comment about the transaction
   **/
  @ApiModelProperty(required = true, value = "Comment about the transaction")
  public String getTFranchisereferalincomeComment() {
    return tFranchisereferalincomeComment;
  }
  public void setTFranchisereferalincomeComment(String tFranchisereferalincomeComment) {
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
  }

  /**
   * The unique ID of the Franchisereoffice
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Franchisereoffice")
  public Integer getFkiFranchiseofficeID() {
    return fkiFranchiseofficeID;
  }
  public void setFkiFranchiseofficeID(Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
  }

  /**
   * 
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
    FranchisereferalincomeRequest franchisereferalincomeRequest = (FranchisereferalincomeRequest) o;
    return (this.pkiFranchisereferalincomeID == null ? franchisereferalincomeRequest.pkiFranchisereferalincomeID == null : this.pkiFranchisereferalincomeID.equals(franchisereferalincomeRequest.pkiFranchisereferalincomeID)) &&
        (this.fkiFranchisebrokerID == null ? franchisereferalincomeRequest.fkiFranchisebrokerID == null : this.fkiFranchisebrokerID.equals(franchisereferalincomeRequest.fkiFranchisebrokerID)) &&
        (this.fkiFranchisereferalincomeprogramID == null ? franchisereferalincomeRequest.fkiFranchisereferalincomeprogramID == null : this.fkiFranchisereferalincomeprogramID.equals(franchisereferalincomeRequest.fkiFranchisereferalincomeprogramID)) &&
        (this.fkiPeriodID == null ? franchisereferalincomeRequest.fkiPeriodID == null : this.fkiPeriodID.equals(franchisereferalincomeRequest.fkiPeriodID)) &&
        (this.dFranchisereferalincomeLoan == null ? franchisereferalincomeRequest.dFranchisereferalincomeLoan == null : this.dFranchisereferalincomeLoan.equals(franchisereferalincomeRequest.dFranchisereferalincomeLoan)) &&
        (this.dFranchisereferalincomeFranchiseamount == null ? franchisereferalincomeRequest.dFranchisereferalincomeFranchiseamount == null : this.dFranchisereferalincomeFranchiseamount.equals(franchisereferalincomeRequest.dFranchisereferalincomeFranchiseamount)) &&
        (this.dFranchisereferalincomeFranchisoramount == null ? franchisereferalincomeRequest.dFranchisereferalincomeFranchisoramount == null : this.dFranchisereferalincomeFranchisoramount.equals(franchisereferalincomeRequest.dFranchisereferalincomeFranchisoramount)) &&
        (this.dFranchisereferalincomeAgentamount == null ? franchisereferalincomeRequest.dFranchisereferalincomeAgentamount == null : this.dFranchisereferalincomeAgentamount.equals(franchisereferalincomeRequest.dFranchisereferalincomeAgentamount)) &&
        (this.dtFranchisereferalincomeDisbursed == null ? franchisereferalincomeRequest.dtFranchisereferalincomeDisbursed == null : this.dtFranchisereferalincomeDisbursed.equals(franchisereferalincomeRequest.dtFranchisereferalincomeDisbursed)) &&
        (this.tFranchisereferalincomeComment == null ? franchisereferalincomeRequest.tFranchisereferalincomeComment == null : this.tFranchisereferalincomeComment.equals(franchisereferalincomeRequest.tFranchisereferalincomeComment)) &&
        (this.fkiFranchiseofficeID == null ? franchisereferalincomeRequest.fkiFranchiseofficeID == null : this.fkiFranchiseofficeID.equals(franchisereferalincomeRequest.fkiFranchiseofficeID)) &&
        (this.sFranchisereferalincomeRemoteid == null ? franchisereferalincomeRequest.sFranchisereferalincomeRemoteid == null : this.sFranchisereferalincomeRemoteid.equals(franchisereferalincomeRequest.sFranchisereferalincomeRemoteid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiFranchisereferalincomeID == null ? 0: this.pkiFranchisereferalincomeID.hashCode());
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
    sb.append("class FranchisereferalincomeRequest {\n");
    
    sb.append("  pkiFranchisereferalincomeID: ").append(pkiFranchisereferalincomeID).append("\n");
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
