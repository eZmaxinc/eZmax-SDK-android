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

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEEzmaxinvoicingPaymenttype;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicing Object
 **/
@ApiModel(description = "A Ezmaxinvoicing Object")
public class EzmaxinvoicingResponse {
  
  @SerializedName("pkiEzmaxinvoicingID")
  private Integer pkiEzmaxinvoicingID = null;
  @SerializedName("fkiEzmaxinvoicingcontractID")
  private Integer fkiEzmaxinvoicingcontractID = null;
  @SerializedName("fkiEzmaxpricingID")
  private Integer fkiEzmaxpricingID = null;
  @SerializedName("fkiSystemconfigurationtypeID")
  private Integer fkiSystemconfigurationtypeID = null;
  @SerializedName("sSystemconfigurationtypeDescriptionX")
  private String sSystemconfigurationtypeDescriptionX = null;
  @SerializedName("yyyymmEzmaxinvoicing")
  private String yyyymmEzmaxinvoicing = null;
  @SerializedName("iEzmaxinvoicingDays")
  private Integer iEzmaxinvoicingDays = null;
  @SerializedName("eEzmaxinvoicingPaymenttype")
  private FieldEEzmaxinvoicingPaymenttype eEzmaxinvoicingPaymenttype = null;
  @SerializedName("dEzmaxinvoicingRebatepaymenttype")
  private String dEzmaxinvoicingRebatepaymenttype = null;
  @SerializedName("iEzmaxinvoicingContractlength")
  private Integer iEzmaxinvoicingContractlength = null;
  @SerializedName("dEzmaxinvoicingRebatecontractlength")
  private String dEzmaxinvoicingRebatecontractlength = null;
  @SerializedName("bEzmaxinvoicingRebateEzsignallagents")
  private Boolean bEzmaxinvoicingRebateEzsignallagents = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicing")
  public Integer getPkiEzmaxinvoicingID() {
    return pkiEzmaxinvoicingID;
  }
  public void setPkiEzmaxinvoicingID(Integer pkiEzmaxinvoicingID) {
    this.pkiEzmaxinvoicingID = pkiEzmaxinvoicingID;
  }

  /**
   * The unique ID of the Ezmaxinvoicingcontract
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxinvoicingcontract")
  public Integer getFkiEzmaxinvoicingcontractID() {
    return fkiEzmaxinvoicingcontractID;
  }
  public void setFkiEzmaxinvoicingcontractID(Integer fkiEzmaxinvoicingcontractID) {
    this.fkiEzmaxinvoicingcontractID = fkiEzmaxinvoicingcontractID;
  }

  /**
   * The unique ID of the Ezmaxpricing
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxpricing")
  public Integer getFkiEzmaxpricingID() {
    return fkiEzmaxpricingID;
  }
  public void setFkiEzmaxpricingID(Integer fkiEzmaxpricingID) {
    this.fkiEzmaxpricingID = fkiEzmaxpricingID;
  }

  /**
   * The unique ID of the Systemconfigurationtype
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Systemconfigurationtype")
  public Integer getFkiSystemconfigurationtypeID() {
    return fkiSystemconfigurationtypeID;
  }
  public void setFkiSystemconfigurationtypeID(Integer fkiSystemconfigurationtypeID) {
    this.fkiSystemconfigurationtypeID = fkiSystemconfigurationtypeID;
  }

  /**
   * The description of the Systemconfigurationtype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Systemconfigurationtype in the language of the requester")
  public String getSSystemconfigurationtypeDescriptionX() {
    return sSystemconfigurationtypeDescriptionX;
  }
  public void setSSystemconfigurationtypeDescriptionX(String sSystemconfigurationtypeDescriptionX) {
    this.sSystemconfigurationtypeDescriptionX = sSystemconfigurationtypeDescriptionX;
  }

  /**
   * The YYYYMM period of the Ezmaxinvoicing
   **/
  @ApiModelProperty(required = true, value = "The YYYYMM period of the Ezmaxinvoicing")
  public String getYyyymmEzmaxinvoicing() {
    return yyyymmEzmaxinvoicing;
  }
  public void setYyyymmEzmaxinvoicing(String yyyymmEzmaxinvoicing) {
    this.yyyymmEzmaxinvoicing = yyyymmEzmaxinvoicing;
  }

  /**
   * The number of days invoiced
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The number of days invoiced")
  public Integer getIEzmaxinvoicingDays() {
    return iEzmaxinvoicingDays;
  }
  public void setIEzmaxinvoicingDays(Integer iEzmaxinvoicingDays) {
    this.iEzmaxinvoicingDays = iEzmaxinvoicingDays;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzmaxinvoicingPaymenttype getEEzmaxinvoicingPaymenttype() {
    return eEzmaxinvoicingPaymenttype;
  }
  public void setEEzmaxinvoicingPaymenttype(FieldEEzmaxinvoicingPaymenttype eEzmaxinvoicingPaymenttype) {
    this.eEzmaxinvoicingPaymenttype = eEzmaxinvoicingPaymenttype;
  }

  /**
   * The percentage of rebate depending of the payment type
   **/
  @ApiModelProperty(required = true, value = "The percentage of rebate depending of the payment type")
  public String getDEzmaxinvoicingRebatepaymenttype() {
    return dEzmaxinvoicingRebatepaymenttype;
  }
  public void setDEzmaxinvoicingRebatepaymenttype(String dEzmaxinvoicingRebatepaymenttype) {
    this.dEzmaxinvoicingRebatepaymenttype = dEzmaxinvoicingRebatepaymenttype;
  }

  /**
   * The length of the contract in years
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The length of the contract in years")
  public Integer getIEzmaxinvoicingContractlength() {
    return iEzmaxinvoicingContractlength;
  }
  public void setIEzmaxinvoicingContractlength(Integer iEzmaxinvoicingContractlength) {
    this.iEzmaxinvoicingContractlength = iEzmaxinvoicingContractlength;
  }

  /**
   * The percentage of rebate depending of the contract length
   **/
  @ApiModelProperty(required = true, value = "The percentage of rebate depending of the contract length")
  public String getDEzmaxinvoicingRebatecontractlength() {
    return dEzmaxinvoicingRebatecontractlength;
  }
  public void setDEzmaxinvoicingRebatecontractlength(String dEzmaxinvoicingRebatecontractlength) {
    this.dEzmaxinvoicingRebatecontractlength = dEzmaxinvoicingRebatecontractlength;
  }

  /**
   * Whether the rebate for eZsign is for all agents
   **/
  @ApiModelProperty(required = true, value = "Whether the rebate for eZsign is for all agents")
  public Boolean getBEzmaxinvoicingRebateEzsignallagents() {
    return bEzmaxinvoicingRebateEzsignallagents;
  }
  public void setBEzmaxinvoicingRebateEzsignallagents(Boolean bEzmaxinvoicingRebateEzsignallagents) {
    this.bEzmaxinvoicingRebateEzsignallagents = bEzmaxinvoicingRebateEzsignallagents;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingResponse ezmaxinvoicingResponse = (EzmaxinvoicingResponse) o;
    return (this.pkiEzmaxinvoicingID == null ? ezmaxinvoicingResponse.pkiEzmaxinvoicingID == null : this.pkiEzmaxinvoicingID.equals(ezmaxinvoicingResponse.pkiEzmaxinvoicingID)) &&
        (this.fkiEzmaxinvoicingcontractID == null ? ezmaxinvoicingResponse.fkiEzmaxinvoicingcontractID == null : this.fkiEzmaxinvoicingcontractID.equals(ezmaxinvoicingResponse.fkiEzmaxinvoicingcontractID)) &&
        (this.fkiEzmaxpricingID == null ? ezmaxinvoicingResponse.fkiEzmaxpricingID == null : this.fkiEzmaxpricingID.equals(ezmaxinvoicingResponse.fkiEzmaxpricingID)) &&
        (this.fkiSystemconfigurationtypeID == null ? ezmaxinvoicingResponse.fkiSystemconfigurationtypeID == null : this.fkiSystemconfigurationtypeID.equals(ezmaxinvoicingResponse.fkiSystemconfigurationtypeID)) &&
        (this.sSystemconfigurationtypeDescriptionX == null ? ezmaxinvoicingResponse.sSystemconfigurationtypeDescriptionX == null : this.sSystemconfigurationtypeDescriptionX.equals(ezmaxinvoicingResponse.sSystemconfigurationtypeDescriptionX)) &&
        (this.yyyymmEzmaxinvoicing == null ? ezmaxinvoicingResponse.yyyymmEzmaxinvoicing == null : this.yyyymmEzmaxinvoicing.equals(ezmaxinvoicingResponse.yyyymmEzmaxinvoicing)) &&
        (this.iEzmaxinvoicingDays == null ? ezmaxinvoicingResponse.iEzmaxinvoicingDays == null : this.iEzmaxinvoicingDays.equals(ezmaxinvoicingResponse.iEzmaxinvoicingDays)) &&
        (this.eEzmaxinvoicingPaymenttype == null ? ezmaxinvoicingResponse.eEzmaxinvoicingPaymenttype == null : this.eEzmaxinvoicingPaymenttype.equals(ezmaxinvoicingResponse.eEzmaxinvoicingPaymenttype)) &&
        (this.dEzmaxinvoicingRebatepaymenttype == null ? ezmaxinvoicingResponse.dEzmaxinvoicingRebatepaymenttype == null : this.dEzmaxinvoicingRebatepaymenttype.equals(ezmaxinvoicingResponse.dEzmaxinvoicingRebatepaymenttype)) &&
        (this.iEzmaxinvoicingContractlength == null ? ezmaxinvoicingResponse.iEzmaxinvoicingContractlength == null : this.iEzmaxinvoicingContractlength.equals(ezmaxinvoicingResponse.iEzmaxinvoicingContractlength)) &&
        (this.dEzmaxinvoicingRebatecontractlength == null ? ezmaxinvoicingResponse.dEzmaxinvoicingRebatecontractlength == null : this.dEzmaxinvoicingRebatecontractlength.equals(ezmaxinvoicingResponse.dEzmaxinvoicingRebatecontractlength)) &&
        (this.bEzmaxinvoicingRebateEzsignallagents == null ? ezmaxinvoicingResponse.bEzmaxinvoicingRebateEzsignallagents == null : this.bEzmaxinvoicingRebateEzsignallagents.equals(ezmaxinvoicingResponse.bEzmaxinvoicingRebateEzsignallagents)) &&
        (this.objAudit == null ? ezmaxinvoicingResponse.objAudit == null : this.objAudit.equals(ezmaxinvoicingResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingID == null ? 0: this.pkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingcontractID == null ? 0: this.fkiEzmaxinvoicingcontractID.hashCode());
    result = 31 * result + (this.fkiEzmaxpricingID == null ? 0: this.fkiEzmaxpricingID.hashCode());
    result = 31 * result + (this.fkiSystemconfigurationtypeID == null ? 0: this.fkiSystemconfigurationtypeID.hashCode());
    result = 31 * result + (this.sSystemconfigurationtypeDescriptionX == null ? 0: this.sSystemconfigurationtypeDescriptionX.hashCode());
    result = 31 * result + (this.yyyymmEzmaxinvoicing == null ? 0: this.yyyymmEzmaxinvoicing.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingDays == null ? 0: this.iEzmaxinvoicingDays.hashCode());
    result = 31 * result + (this.eEzmaxinvoicingPaymenttype == null ? 0: this.eEzmaxinvoicingPaymenttype.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingRebatepaymenttype == null ? 0: this.dEzmaxinvoicingRebatepaymenttype.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingContractlength == null ? 0: this.iEzmaxinvoicingContractlength.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingRebatecontractlength == null ? 0: this.dEzmaxinvoicingRebatecontractlength.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingRebateEzsignallagents == null ? 0: this.bEzmaxinvoicingRebateEzsignallagents.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingResponse {\n");
    
    sb.append("  pkiEzmaxinvoicingID: ").append(pkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiEzmaxinvoicingcontractID: ").append(fkiEzmaxinvoicingcontractID).append("\n");
    sb.append("  fkiEzmaxpricingID: ").append(fkiEzmaxpricingID).append("\n");
    sb.append("  fkiSystemconfigurationtypeID: ").append(fkiSystemconfigurationtypeID).append("\n");
    sb.append("  sSystemconfigurationtypeDescriptionX: ").append(sSystemconfigurationtypeDescriptionX).append("\n");
    sb.append("  yyyymmEzmaxinvoicing: ").append(yyyymmEzmaxinvoicing).append("\n");
    sb.append("  iEzmaxinvoicingDays: ").append(iEzmaxinvoicingDays).append("\n");
    sb.append("  eEzmaxinvoicingPaymenttype: ").append(eEzmaxinvoicingPaymenttype).append("\n");
    sb.append("  dEzmaxinvoicingRebatepaymenttype: ").append(dEzmaxinvoicingRebatepaymenttype).append("\n");
    sb.append("  iEzmaxinvoicingContractlength: ").append(iEzmaxinvoicingContractlength).append("\n");
    sb.append("  dEzmaxinvoicingRebatecontractlength: ").append(dEzmaxinvoicingRebatecontractlength).append("\n");
    sb.append("  bEzmaxinvoicingRebateEzsignallagents: ").append(bEzmaxinvoicingRebateEzsignallagents).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
