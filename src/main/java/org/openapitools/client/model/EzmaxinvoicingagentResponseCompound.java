/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.FieldEEzmaxinvoicingagentVariationezmax;
import org.openapitools.client.model.FieldEEzmaxinvoicingagentVariationezsign;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingagent Object
 **/
@ApiModel(description = "A Ezmaxinvoicingagent Object")
public class EzmaxinvoicingagentResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingagentID")
  private Integer pkiEzmaxinvoicingagentID = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("fkiAgentID")
  private Integer fkiAgentID = null;
  @SerializedName("fkiBrokerID")
  private Integer fkiBrokerID = null;
  @SerializedName("iEzmaxinvoicingagentSession")
  private Integer iEzmaxinvoicingagentSession = null;
  @SerializedName("iEzmaxinvoicingagentCloned")
  private Integer iEzmaxinvoicingagentCloned = null;
  @SerializedName("iEzmaxinvoicingagentInvoice")
  private Integer iEzmaxinvoicingagentInvoice = null;
  @SerializedName("iEzmaxinvoicingagentInscription")
  private Integer iEzmaxinvoicingagentInscription = null;
  @SerializedName("iEzmaxinvoicingagentInscriptionactive")
  private Integer iEzmaxinvoicingagentInscriptionactive = null;
  @SerializedName("iEzmaxinvoicingagentSale")
  private Integer iEzmaxinvoicingagentSale = null;
  @SerializedName("iEzmaxinvoicingagentOtherincome")
  private Integer iEzmaxinvoicingagentOtherincome = null;
  @SerializedName("iEzmaxinvoicingagentCommissioncalculation")
  private Integer iEzmaxinvoicingagentCommissioncalculation = null;
  @SerializedName("iEzmaxinvoicingagentEzsigndocument")
  private Integer iEzmaxinvoicingagentEzsigndocument = null;
  @SerializedName("bEzmaxinvoicingagentEzsignaccount")
  private Boolean bEzmaxinvoicingagentEzsignaccount = null;
  @SerializedName("bEzmaxinvoicingagentBillableezmax")
  private Boolean bEzmaxinvoicingagentBillableezmax = null;
  @SerializedName("eEzmaxinvoicingagentVariationezmax")
  private FieldEEzmaxinvoicingagentVariationezmax eEzmaxinvoicingagentVariationezmax = null;
  @SerializedName("bEzmaxinvoicingagentBillableezsign")
  private Boolean bEzmaxinvoicingagentBillableezsign = null;
  @SerializedName("eEzmaxinvoicingagentVariationezsign")
  private FieldEEzmaxinvoicingagentVariationezsign eEzmaxinvoicingagentVariationezsign = null;
  @SerializedName("objContactName")
  private CustomContactNameResponse objContactName = null;

  /**
   * The unique ID of the Ezmaxinvoicingagent
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingagent")
  public Integer getPkiEzmaxinvoicingagentID() {
    return pkiEzmaxinvoicingagentID;
  }
  public void setPkiEzmaxinvoicingagentID(Integer pkiEzmaxinvoicingagentID) {
    this.pkiEzmaxinvoicingagentID = pkiEzmaxinvoicingagentID;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicing")
  public Integer getFkiEzmaxinvoicingID() {
    return fkiEzmaxinvoicingID;
  }
  public void setFkiEzmaxinvoicingID(Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
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
   * The number of sessions
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of sessions")
  public Integer getIEzmaxinvoicingagentSession() {
    return iEzmaxinvoicingagentSession;
  }
  public void setIEzmaxinvoicingagentSession(Integer iEzmaxinvoicingagentSession) {
    this.iEzmaxinvoicingagentSession = iEzmaxinvoicingagentSession;
  }

  /**
   * The number of times this user was cloned
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of times this user was cloned")
  public Integer getIEzmaxinvoicingagentCloned() {
    return iEzmaxinvoicingagentCloned;
  }
  public void setIEzmaxinvoicingagentCloned(Integer iEzmaxinvoicingagentCloned) {
    this.iEzmaxinvoicingagentCloned = iEzmaxinvoicingagentCloned;
  }

  /**
   * The number of invoices
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of invoices")
  public Integer getIEzmaxinvoicingagentInvoice() {
    return iEzmaxinvoicingagentInvoice;
  }
  public void setIEzmaxinvoicingagentInvoice(Integer iEzmaxinvoicingagentInvoice) {
    this.iEzmaxinvoicingagentInvoice = iEzmaxinvoicingagentInvoice;
  }

  /**
   * The number of inscriptions
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of inscriptions")
  public Integer getIEzmaxinvoicingagentInscription() {
    return iEzmaxinvoicingagentInscription;
  }
  public void setIEzmaxinvoicingagentInscription(Integer iEzmaxinvoicingagentInscription) {
    this.iEzmaxinvoicingagentInscription = iEzmaxinvoicingagentInscription;
  }

  /**
   * The number of active inscriptions
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of active inscriptions")
  public Integer getIEzmaxinvoicingagentInscriptionactive() {
    return iEzmaxinvoicingagentInscriptionactive;
  }
  public void setIEzmaxinvoicingagentInscriptionactive(Integer iEzmaxinvoicingagentInscriptionactive) {
    this.iEzmaxinvoicingagentInscriptionactive = iEzmaxinvoicingagentInscriptionactive;
  }

  /**
   * The number of sales
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of sales")
  public Integer getIEzmaxinvoicingagentSale() {
    return iEzmaxinvoicingagentSale;
  }
  public void setIEzmaxinvoicingagentSale(Integer iEzmaxinvoicingagentSale) {
    this.iEzmaxinvoicingagentSale = iEzmaxinvoicingagentSale;
  }

  /**
   * The number of otherincomes
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of otherincomes")
  public Integer getIEzmaxinvoicingagentOtherincome() {
    return iEzmaxinvoicingagentOtherincome;
  }
  public void setIEzmaxinvoicingagentOtherincome(Integer iEzmaxinvoicingagentOtherincome) {
    this.iEzmaxinvoicingagentOtherincome = iEzmaxinvoicingagentOtherincome;
  }

  /**
   * The number of commission calculations
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of commission calculations")
  public Integer getIEzmaxinvoicingagentCommissioncalculation() {
    return iEzmaxinvoicingagentCommissioncalculation;
  }
  public void setIEzmaxinvoicingagentCommissioncalculation(Integer iEzmaxinvoicingagentCommissioncalculation) {
    this.iEzmaxinvoicingagentCommissioncalculation = iEzmaxinvoicingagentCommissioncalculation;
  }

  /**
   * The number of ezsign documents
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of ezsign documents")
  public Integer getIEzmaxinvoicingagentEzsigndocument() {
    return iEzmaxinvoicingagentEzsigndocument;
  }
  public void setIEzmaxinvoicingagentEzsigndocument(Integer iEzmaxinvoicingagentEzsigndocument) {
    this.iEzmaxinvoicingagentEzsigndocument = iEzmaxinvoicingagentEzsigndocument;
  }

  /**
   * Whether the agent has an eZsign account
   **/
  @ApiModelProperty(required = true, value = "Whether the agent has an eZsign account")
  public Boolean getBEzmaxinvoicingagentEzsignaccount() {
    return bEzmaxinvoicingagentEzsignaccount;
  }
  public void setBEzmaxinvoicingagentEzsignaccount(Boolean bEzmaxinvoicingagentEzsignaccount) {
    this.bEzmaxinvoicingagentEzsignaccount = bEzmaxinvoicingagentEzsignaccount;
  }

  /**
   * Whether it is billable for eZmax
   **/
  @ApiModelProperty(required = true, value = "Whether it is billable for eZmax")
  public Boolean getBEzmaxinvoicingagentBillableezmax() {
    return bEzmaxinvoicingagentBillableezmax;
  }
  public void setBEzmaxinvoicingagentBillableezmax(Boolean bEzmaxinvoicingagentBillableezmax) {
    this.bEzmaxinvoicingagentBillableezmax = bEzmaxinvoicingagentBillableezmax;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzmaxinvoicingagentVariationezmax getEEzmaxinvoicingagentVariationezmax() {
    return eEzmaxinvoicingagentVariationezmax;
  }
  public void setEEzmaxinvoicingagentVariationezmax(FieldEEzmaxinvoicingagentVariationezmax eEzmaxinvoicingagentVariationezmax) {
    this.eEzmaxinvoicingagentVariationezmax = eEzmaxinvoicingagentVariationezmax;
  }

  /**
   * Whether it is billable for eZsign
   **/
  @ApiModelProperty(required = true, value = "Whether it is billable for eZsign")
  public Boolean getBEzmaxinvoicingagentBillableezsign() {
    return bEzmaxinvoicingagentBillableezsign;
  }
  public void setBEzmaxinvoicingagentBillableezsign(Boolean bEzmaxinvoicingagentBillableezsign) {
    this.bEzmaxinvoicingagentBillableezsign = bEzmaxinvoicingagentBillableezsign;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzmaxinvoicingagentVariationezsign getEEzmaxinvoicingagentVariationezsign() {
    return eEzmaxinvoicingagentVariationezsign;
  }
  public void setEEzmaxinvoicingagentVariationezsign(FieldEEzmaxinvoicingagentVariationezsign eEzmaxinvoicingagentVariationezsign) {
    this.eEzmaxinvoicingagentVariationezsign = eEzmaxinvoicingagentVariationezsign;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomContactNameResponse getObjContactName() {
    return objContactName;
  }
  public void setObjContactName(CustomContactNameResponse objContactName) {
    this.objContactName = objContactName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingagentResponseCompound ezmaxinvoicingagentResponseCompound = (EzmaxinvoicingagentResponseCompound) o;
    return (this.pkiEzmaxinvoicingagentID == null ? ezmaxinvoicingagentResponseCompound.pkiEzmaxinvoicingagentID == null : this.pkiEzmaxinvoicingagentID.equals(ezmaxinvoicingagentResponseCompound.pkiEzmaxinvoicingagentID)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicingagentResponseCompound.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicingagentResponseCompound.fkiEzmaxinvoicingID)) &&
        (this.fkiBillingentityinternalID == null ? ezmaxinvoicingagentResponseCompound.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezmaxinvoicingagentResponseCompound.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezmaxinvoicingagentResponseCompound.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezmaxinvoicingagentResponseCompound.sBillingentityinternalDescriptionX)) &&
        (this.fkiAgentID == null ? ezmaxinvoicingagentResponseCompound.fkiAgentID == null : this.fkiAgentID.equals(ezmaxinvoicingagentResponseCompound.fkiAgentID)) &&
        (this.fkiBrokerID == null ? ezmaxinvoicingagentResponseCompound.fkiBrokerID == null : this.fkiBrokerID.equals(ezmaxinvoicingagentResponseCompound.fkiBrokerID)) &&
        (this.iEzmaxinvoicingagentSession == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentSession == null : this.iEzmaxinvoicingagentSession.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentSession)) &&
        (this.iEzmaxinvoicingagentCloned == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentCloned == null : this.iEzmaxinvoicingagentCloned.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentCloned)) &&
        (this.iEzmaxinvoicingagentInvoice == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInvoice == null : this.iEzmaxinvoicingagentInvoice.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInvoice)) &&
        (this.iEzmaxinvoicingagentInscription == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInscription == null : this.iEzmaxinvoicingagentInscription.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInscription)) &&
        (this.iEzmaxinvoicingagentInscriptionactive == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInscriptionactive == null : this.iEzmaxinvoicingagentInscriptionactive.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentInscriptionactive)) &&
        (this.iEzmaxinvoicingagentSale == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentSale == null : this.iEzmaxinvoicingagentSale.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentSale)) &&
        (this.iEzmaxinvoicingagentOtherincome == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentOtherincome == null : this.iEzmaxinvoicingagentOtherincome.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentOtherincome)) &&
        (this.iEzmaxinvoicingagentCommissioncalculation == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentCommissioncalculation == null : this.iEzmaxinvoicingagentCommissioncalculation.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentCommissioncalculation)) &&
        (this.iEzmaxinvoicingagentEzsigndocument == null ? ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentEzsigndocument == null : this.iEzmaxinvoicingagentEzsigndocument.equals(ezmaxinvoicingagentResponseCompound.iEzmaxinvoicingagentEzsigndocument)) &&
        (this.bEzmaxinvoicingagentEzsignaccount == null ? ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentEzsignaccount == null : this.bEzmaxinvoicingagentEzsignaccount.equals(ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentEzsignaccount)) &&
        (this.bEzmaxinvoicingagentBillableezmax == null ? ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentBillableezmax == null : this.bEzmaxinvoicingagentBillableezmax.equals(ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentBillableezmax)) &&
        (this.eEzmaxinvoicingagentVariationezmax == null ? ezmaxinvoicingagentResponseCompound.eEzmaxinvoicingagentVariationezmax == null : this.eEzmaxinvoicingagentVariationezmax.equals(ezmaxinvoicingagentResponseCompound.eEzmaxinvoicingagentVariationezmax)) &&
        (this.bEzmaxinvoicingagentBillableezsign == null ? ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentBillableezsign == null : this.bEzmaxinvoicingagentBillableezsign.equals(ezmaxinvoicingagentResponseCompound.bEzmaxinvoicingagentBillableezsign)) &&
        (this.eEzmaxinvoicingagentVariationezsign == null ? ezmaxinvoicingagentResponseCompound.eEzmaxinvoicingagentVariationezsign == null : this.eEzmaxinvoicingagentVariationezsign.equals(ezmaxinvoicingagentResponseCompound.eEzmaxinvoicingagentVariationezsign)) &&
        (this.objContactName == null ? ezmaxinvoicingagentResponseCompound.objContactName == null : this.objContactName.equals(ezmaxinvoicingagentResponseCompound.objContactName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingagentID == null ? 0: this.pkiEzmaxinvoicingagentID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiAgentID == null ? 0: this.fkiAgentID.hashCode());
    result = 31 * result + (this.fkiBrokerID == null ? 0: this.fkiBrokerID.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentSession == null ? 0: this.iEzmaxinvoicingagentSession.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentCloned == null ? 0: this.iEzmaxinvoicingagentCloned.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentInvoice == null ? 0: this.iEzmaxinvoicingagentInvoice.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentInscription == null ? 0: this.iEzmaxinvoicingagentInscription.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentInscriptionactive == null ? 0: this.iEzmaxinvoicingagentInscriptionactive.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentSale == null ? 0: this.iEzmaxinvoicingagentSale.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentOtherincome == null ? 0: this.iEzmaxinvoicingagentOtherincome.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentCommissioncalculation == null ? 0: this.iEzmaxinvoicingagentCommissioncalculation.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingagentEzsigndocument == null ? 0: this.iEzmaxinvoicingagentEzsigndocument.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingagentEzsignaccount == null ? 0: this.bEzmaxinvoicingagentEzsignaccount.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingagentBillableezmax == null ? 0: this.bEzmaxinvoicingagentBillableezmax.hashCode());
    result = 31 * result + (this.eEzmaxinvoicingagentVariationezmax == null ? 0: this.eEzmaxinvoicingagentVariationezmax.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingagentBillableezsign == null ? 0: this.bEzmaxinvoicingagentBillableezsign.hashCode());
    result = 31 * result + (this.eEzmaxinvoicingagentVariationezsign == null ? 0: this.eEzmaxinvoicingagentVariationezsign.hashCode());
    result = 31 * result + (this.objContactName == null ? 0: this.objContactName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingagentResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingagentID: ").append(pkiEzmaxinvoicingagentID).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  fkiAgentID: ").append(fkiAgentID).append("\n");
    sb.append("  fkiBrokerID: ").append(fkiBrokerID).append("\n");
    sb.append("  iEzmaxinvoicingagentSession: ").append(iEzmaxinvoicingagentSession).append("\n");
    sb.append("  iEzmaxinvoicingagentCloned: ").append(iEzmaxinvoicingagentCloned).append("\n");
    sb.append("  iEzmaxinvoicingagentInvoice: ").append(iEzmaxinvoicingagentInvoice).append("\n");
    sb.append("  iEzmaxinvoicingagentInscription: ").append(iEzmaxinvoicingagentInscription).append("\n");
    sb.append("  iEzmaxinvoicingagentInscriptionactive: ").append(iEzmaxinvoicingagentInscriptionactive).append("\n");
    sb.append("  iEzmaxinvoicingagentSale: ").append(iEzmaxinvoicingagentSale).append("\n");
    sb.append("  iEzmaxinvoicingagentOtherincome: ").append(iEzmaxinvoicingagentOtherincome).append("\n");
    sb.append("  iEzmaxinvoicingagentCommissioncalculation: ").append(iEzmaxinvoicingagentCommissioncalculation).append("\n");
    sb.append("  iEzmaxinvoicingagentEzsigndocument: ").append(iEzmaxinvoicingagentEzsigndocument).append("\n");
    sb.append("  bEzmaxinvoicingagentEzsignaccount: ").append(bEzmaxinvoicingagentEzsignaccount).append("\n");
    sb.append("  bEzmaxinvoicingagentBillableezmax: ").append(bEzmaxinvoicingagentBillableezmax).append("\n");
    sb.append("  eEzmaxinvoicingagentVariationezmax: ").append(eEzmaxinvoicingagentVariationezmax).append("\n");
    sb.append("  bEzmaxinvoicingagentBillableezsign: ").append(bEzmaxinvoicingagentBillableezsign).append("\n");
    sb.append("  eEzmaxinvoicingagentVariationezsign: ").append(eEzmaxinvoicingagentVariationezsign).append("\n");
    sb.append("  objContactName: ").append(objContactName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
