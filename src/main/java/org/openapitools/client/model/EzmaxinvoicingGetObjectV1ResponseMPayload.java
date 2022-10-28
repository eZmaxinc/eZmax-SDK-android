/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.CustomEzmaxinvoicingEzsigndocumentResponse;
import org.openapitools.client.model.CustomEzmaxinvoicingEzsignfolderResponse;
import org.openapitools.client.model.CustomEzmaxpricingResponse;
import org.openapitools.client.model.EzmaxinvoicingResponseCompound;
import org.openapitools.client.model.EzmaxinvoicingagentResponseCompound;
import org.openapitools.client.model.EzmaxinvoicingcontractResponseCompound;
import org.openapitools.client.model.EzmaxinvoicingsummaryexternalResponseCompound;
import org.openapitools.client.model.EzmaxinvoicingsummaryglobalResponseCompound;
import org.openapitools.client.model.EzmaxinvoicingsummaryinternalResponseCompound;
import org.openapitools.client.model.EzmaxinvoicinguserResponseCompound;
import org.openapitools.client.model.FieldEEzmaxinvoicingPaymenttype;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezmaxinvoicing/{pkiEzmaxinvoicingID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezmaxinvoicing/{pkiEzmaxinvoicingID}")
public class EzmaxinvoicingGetObjectV1ResponseMPayload {
  
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
  @SerializedName("objEzmaxinvoicingcontract")
  private EzmaxinvoicingcontractResponseCompound objEzmaxinvoicingcontract = null;
  @SerializedName("objEzmaxpricing")
  private CustomEzmaxpricingResponse objEzmaxpricing = null;
  @SerializedName("a_objEzmaxinvoicingsummaryglobal")
  private List<EzmaxinvoicingsummaryglobalResponseCompound> aObjEzmaxinvoicingsummaryglobal = null;
  @SerializedName("a_objEzmaxinvoicingsummaryexternal")
  private List<EzmaxinvoicingsummaryexternalResponseCompound> aObjEzmaxinvoicingsummaryexternal = null;
  @SerializedName("a_objEzmaxinvoicingsummaryinternal")
  private List<EzmaxinvoicingsummaryinternalResponseCompound> aObjEzmaxinvoicingsummaryinternal = null;
  @SerializedName("a_objEzmaxinvoicingagent")
  private List<EzmaxinvoicingagentResponseCompound> aObjEzmaxinvoicingagent = null;
  @SerializedName("a_objEzmaxinvoicinguser")
  private List<EzmaxinvoicinguserResponseCompound> aObjEzmaxinvoicinguser = null;
  @SerializedName("a_objEzmaxinvoicingezsignfolder")
  private List<CustomEzmaxinvoicingEzsignfolderResponse> aObjEzmaxinvoicingezsignfolder = null;
  @SerializedName("a_objEzmaxinvoicingezsigndocument")
  private List<CustomEzmaxinvoicingEzsigndocumentResponse> aObjEzmaxinvoicingezsigndocument = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzmaxinvoicingcontractResponseCompound getObjEzmaxinvoicingcontract() {
    return objEzmaxinvoicingcontract;
  }
  public void setObjEzmaxinvoicingcontract(EzmaxinvoicingcontractResponseCompound objEzmaxinvoicingcontract) {
    this.objEzmaxinvoicingcontract = objEzmaxinvoicingcontract;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomEzmaxpricingResponse getObjEzmaxpricing() {
    return objEzmaxpricing;
  }
  public void setObjEzmaxpricing(CustomEzmaxpricingResponse objEzmaxpricing) {
    this.objEzmaxpricing = objEzmaxpricing;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryglobalResponseCompound> getAObjEzmaxinvoicingsummaryglobal() {
    return aObjEzmaxinvoicingsummaryglobal;
  }
  public void setAObjEzmaxinvoicingsummaryglobal(List<EzmaxinvoicingsummaryglobalResponseCompound> aObjEzmaxinvoicingsummaryglobal) {
    this.aObjEzmaxinvoicingsummaryglobal = aObjEzmaxinvoicingsummaryglobal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryexternalResponseCompound> getAObjEzmaxinvoicingsummaryexternal() {
    return aObjEzmaxinvoicingsummaryexternal;
  }
  public void setAObjEzmaxinvoicingsummaryexternal(List<EzmaxinvoicingsummaryexternalResponseCompound> aObjEzmaxinvoicingsummaryexternal) {
    this.aObjEzmaxinvoicingsummaryexternal = aObjEzmaxinvoicingsummaryexternal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryinternalResponseCompound> getAObjEzmaxinvoicingsummaryinternal() {
    return aObjEzmaxinvoicingsummaryinternal;
  }
  public void setAObjEzmaxinvoicingsummaryinternal(List<EzmaxinvoicingsummaryinternalResponseCompound> aObjEzmaxinvoicingsummaryinternal) {
    this.aObjEzmaxinvoicingsummaryinternal = aObjEzmaxinvoicingsummaryinternal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingagentResponseCompound> getAObjEzmaxinvoicingagent() {
    return aObjEzmaxinvoicingagent;
  }
  public void setAObjEzmaxinvoicingagent(List<EzmaxinvoicingagentResponseCompound> aObjEzmaxinvoicingagent) {
    this.aObjEzmaxinvoicingagent = aObjEzmaxinvoicingagent;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicinguserResponseCompound> getAObjEzmaxinvoicinguser() {
    return aObjEzmaxinvoicinguser;
  }
  public void setAObjEzmaxinvoicinguser(List<EzmaxinvoicinguserResponseCompound> aObjEzmaxinvoicinguser) {
    this.aObjEzmaxinvoicinguser = aObjEzmaxinvoicinguser;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzmaxinvoicingEzsignfolderResponse> getAObjEzmaxinvoicingezsignfolder() {
    return aObjEzmaxinvoicingezsignfolder;
  }
  public void setAObjEzmaxinvoicingezsignfolder(List<CustomEzmaxinvoicingEzsignfolderResponse> aObjEzmaxinvoicingezsignfolder) {
    this.aObjEzmaxinvoicingezsignfolder = aObjEzmaxinvoicingezsignfolder;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzmaxinvoicingEzsigndocumentResponse> getAObjEzmaxinvoicingezsigndocument() {
    return aObjEzmaxinvoicingezsigndocument;
  }
  public void setAObjEzmaxinvoicingezsigndocument(List<CustomEzmaxinvoicingEzsigndocumentResponse> aObjEzmaxinvoicingezsigndocument) {
    this.aObjEzmaxinvoicingezsigndocument = aObjEzmaxinvoicingezsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingGetObjectV1ResponseMPayload ezmaxinvoicingGetObjectV1ResponseMPayload = (EzmaxinvoicingGetObjectV1ResponseMPayload) o;
    return (this.pkiEzmaxinvoicingID == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.pkiEzmaxinvoicingID == null : this.pkiEzmaxinvoicingID.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.pkiEzmaxinvoicingID)) &&
        (this.fkiEzmaxinvoicingcontractID == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.fkiEzmaxinvoicingcontractID == null : this.fkiEzmaxinvoicingcontractID.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.fkiEzmaxinvoicingcontractID)) &&
        (this.fkiEzmaxpricingID == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.fkiEzmaxpricingID == null : this.fkiEzmaxpricingID.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.fkiEzmaxpricingID)) &&
        (this.fkiSystemconfigurationtypeID == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.fkiSystemconfigurationtypeID == null : this.fkiSystemconfigurationtypeID.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.fkiSystemconfigurationtypeID)) &&
        (this.sSystemconfigurationtypeDescriptionX == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.sSystemconfigurationtypeDescriptionX == null : this.sSystemconfigurationtypeDescriptionX.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.sSystemconfigurationtypeDescriptionX)) &&
        (this.yyyymmEzmaxinvoicing == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.yyyymmEzmaxinvoicing == null : this.yyyymmEzmaxinvoicing.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.yyyymmEzmaxinvoicing)) &&
        (this.iEzmaxinvoicingDays == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.iEzmaxinvoicingDays == null : this.iEzmaxinvoicingDays.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.iEzmaxinvoicingDays)) &&
        (this.eEzmaxinvoicingPaymenttype == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.eEzmaxinvoicingPaymenttype == null : this.eEzmaxinvoicingPaymenttype.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.eEzmaxinvoicingPaymenttype)) &&
        (this.dEzmaxinvoicingRebatepaymenttype == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.dEzmaxinvoicingRebatepaymenttype == null : this.dEzmaxinvoicingRebatepaymenttype.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.dEzmaxinvoicingRebatepaymenttype)) &&
        (this.iEzmaxinvoicingContractlength == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.iEzmaxinvoicingContractlength == null : this.iEzmaxinvoicingContractlength.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.iEzmaxinvoicingContractlength)) &&
        (this.dEzmaxinvoicingRebatecontractlength == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.dEzmaxinvoicingRebatecontractlength == null : this.dEzmaxinvoicingRebatecontractlength.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.dEzmaxinvoicingRebatecontractlength)) &&
        (this.bEzmaxinvoicingRebateEzsignallagents == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.bEzmaxinvoicingRebateEzsignallagents == null : this.bEzmaxinvoicingRebateEzsignallagents.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.bEzmaxinvoicingRebateEzsignallagents)) &&
        (this.objAudit == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.objAudit == null : this.objAudit.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.objAudit)) &&
        (this.objEzmaxinvoicingcontract == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.objEzmaxinvoicingcontract == null : this.objEzmaxinvoicingcontract.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.objEzmaxinvoicingcontract)) &&
        (this.objEzmaxpricing == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.objEzmaxpricing == null : this.objEzmaxpricing.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.objEzmaxpricing)) &&
        (this.aObjEzmaxinvoicingsummaryglobal == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryglobal == null : this.aObjEzmaxinvoicingsummaryglobal.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryglobal)) &&
        (this.aObjEzmaxinvoicingsummaryexternal == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryexternal == null : this.aObjEzmaxinvoicingsummaryexternal.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryexternal)) &&
        (this.aObjEzmaxinvoicingsummaryinternal == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryinternal == null : this.aObjEzmaxinvoicingsummaryinternal.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingsummaryinternal)) &&
        (this.aObjEzmaxinvoicingagent == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingagent == null : this.aObjEzmaxinvoicingagent.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingagent)) &&
        (this.aObjEzmaxinvoicinguser == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicinguser == null : this.aObjEzmaxinvoicinguser.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicinguser)) &&
        (this.aObjEzmaxinvoicingezsignfolder == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingezsignfolder == null : this.aObjEzmaxinvoicingezsignfolder.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingezsignfolder)) &&
        (this.aObjEzmaxinvoicingezsigndocument == null ? ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingezsigndocument == null : this.aObjEzmaxinvoicingezsigndocument.equals(ezmaxinvoicingGetObjectV1ResponseMPayload.aObjEzmaxinvoicingezsigndocument));
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
    result = 31 * result + (this.objEzmaxinvoicingcontract == null ? 0: this.objEzmaxinvoicingcontract.hashCode());
    result = 31 * result + (this.objEzmaxpricing == null ? 0: this.objEzmaxpricing.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryglobal == null ? 0: this.aObjEzmaxinvoicingsummaryglobal.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryexternal == null ? 0: this.aObjEzmaxinvoicingsummaryexternal.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryinternal == null ? 0: this.aObjEzmaxinvoicingsummaryinternal.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingagent == null ? 0: this.aObjEzmaxinvoicingagent.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicinguser == null ? 0: this.aObjEzmaxinvoicinguser.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingezsignfolder == null ? 0: this.aObjEzmaxinvoicingezsignfolder.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingezsigndocument == null ? 0: this.aObjEzmaxinvoicingezsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingGetObjectV1ResponseMPayload {\n");
    
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
    sb.append("  objEzmaxinvoicingcontract: ").append(objEzmaxinvoicingcontract).append("\n");
    sb.append("  objEzmaxpricing: ").append(objEzmaxpricing).append("\n");
    sb.append("  aObjEzmaxinvoicingsummaryglobal: ").append(aObjEzmaxinvoicingsummaryglobal).append("\n");
    sb.append("  aObjEzmaxinvoicingsummaryexternal: ").append(aObjEzmaxinvoicingsummaryexternal).append("\n");
    sb.append("  aObjEzmaxinvoicingsummaryinternal: ").append(aObjEzmaxinvoicingsummaryinternal).append("\n");
    sb.append("  aObjEzmaxinvoicingagent: ").append(aObjEzmaxinvoicingagent).append("\n");
    sb.append("  aObjEzmaxinvoicinguser: ").append(aObjEzmaxinvoicinguser).append("\n");
    sb.append("  aObjEzmaxinvoicingezsignfolder: ").append(aObjEzmaxinvoicingezsignfolder).append("\n");
    sb.append("  aObjEzmaxinvoicingezsigndocument: ").append(aObjEzmaxinvoicingezsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
