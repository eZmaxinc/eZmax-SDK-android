/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.EzmaxinvoicingagentResponseCompoundAllOf;
import org.openapitools.client.model.EzmaxinvoicinguserResponse;
import org.openapitools.client.model.FieldEEzmaxinvoicinguserVariationezsign;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicinguser Object
 **/
@ApiModel(description = "A Ezmaxinvoicinguser Object")
public class EzmaxinvoicinguserResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicinguserID")
  private Integer pkiEzmaxinvoicinguserID = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("iEzmaxinvoicinguserEzsigndocument")
  private Integer iEzmaxinvoicinguserEzsigndocument = null;
  @SerializedName("bEzmaxinvoicinguserEzsignaccount")
  private Boolean bEzmaxinvoicinguserEzsignaccount = null;
  @SerializedName("bEzmaxinvoicinguserBillableezsign")
  private Boolean bEzmaxinvoicinguserBillableezsign = null;
  @SerializedName("eEzmaxinvoicinguserVariationezsign")
  private FieldEEzmaxinvoicinguserVariationezsign eEzmaxinvoicinguserVariationezsign = null;
  @SerializedName("objContactName")
  private CustomContactNameResponse objContactName = null;

  /**
   * The unique ID of the Ezmaxinvoicinguser
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicinguser")
  public Integer getPkiEzmaxinvoicinguserID() {
    return pkiEzmaxinvoicinguserID;
  }
  public void setPkiEzmaxinvoicinguserID(Integer pkiEzmaxinvoicinguserID) {
    this.pkiEzmaxinvoicinguserID = pkiEzmaxinvoicinguserID;
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
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The number of ezsign documents
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of ezsign documents")
  public Integer getIEzmaxinvoicinguserEzsigndocument() {
    return iEzmaxinvoicinguserEzsigndocument;
  }
  public void setIEzmaxinvoicinguserEzsigndocument(Integer iEzmaxinvoicinguserEzsigndocument) {
    this.iEzmaxinvoicinguserEzsigndocument = iEzmaxinvoicinguserEzsigndocument;
  }

  /**
   * Whether there is an eZsign account
   **/
  @ApiModelProperty(required = true, value = "Whether there is an eZsign account")
  public Boolean getBEzmaxinvoicinguserEzsignaccount() {
    return bEzmaxinvoicinguserEzsignaccount;
  }
  public void setBEzmaxinvoicinguserEzsignaccount(Boolean bEzmaxinvoicinguserEzsignaccount) {
    this.bEzmaxinvoicinguserEzsignaccount = bEzmaxinvoicinguserEzsignaccount;
  }

  /**
   * Whether it is billable for eZsign
   **/
  @ApiModelProperty(required = true, value = "Whether it is billable for eZsign")
  public Boolean getBEzmaxinvoicinguserBillableezsign() {
    return bEzmaxinvoicinguserBillableezsign;
  }
  public void setBEzmaxinvoicinguserBillableezsign(Boolean bEzmaxinvoicinguserBillableezsign) {
    this.bEzmaxinvoicinguserBillableezsign = bEzmaxinvoicinguserBillableezsign;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzmaxinvoicinguserVariationezsign getEEzmaxinvoicinguserVariationezsign() {
    return eEzmaxinvoicinguserVariationezsign;
  }
  public void setEEzmaxinvoicinguserVariationezsign(FieldEEzmaxinvoicinguserVariationezsign eEzmaxinvoicinguserVariationezsign) {
    this.eEzmaxinvoicinguserVariationezsign = eEzmaxinvoicinguserVariationezsign;
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
    EzmaxinvoicinguserResponseCompound ezmaxinvoicinguserResponseCompound = (EzmaxinvoicinguserResponseCompound) o;
    return (this.pkiEzmaxinvoicinguserID == null ? ezmaxinvoicinguserResponseCompound.pkiEzmaxinvoicinguserID == null : this.pkiEzmaxinvoicinguserID.equals(ezmaxinvoicinguserResponseCompound.pkiEzmaxinvoicinguserID)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicinguserResponseCompound.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicinguserResponseCompound.fkiEzmaxinvoicingID)) &&
        (this.fkiBillingentityinternalID == null ? ezmaxinvoicinguserResponseCompound.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezmaxinvoicinguserResponseCompound.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezmaxinvoicinguserResponseCompound.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezmaxinvoicinguserResponseCompound.sBillingentityinternalDescriptionX)) &&
        (this.fkiUserID == null ? ezmaxinvoicinguserResponseCompound.fkiUserID == null : this.fkiUserID.equals(ezmaxinvoicinguserResponseCompound.fkiUserID)) &&
        (this.iEzmaxinvoicinguserEzsigndocument == null ? ezmaxinvoicinguserResponseCompound.iEzmaxinvoicinguserEzsigndocument == null : this.iEzmaxinvoicinguserEzsigndocument.equals(ezmaxinvoicinguserResponseCompound.iEzmaxinvoicinguserEzsigndocument)) &&
        (this.bEzmaxinvoicinguserEzsignaccount == null ? ezmaxinvoicinguserResponseCompound.bEzmaxinvoicinguserEzsignaccount == null : this.bEzmaxinvoicinguserEzsignaccount.equals(ezmaxinvoicinguserResponseCompound.bEzmaxinvoicinguserEzsignaccount)) &&
        (this.bEzmaxinvoicinguserBillableezsign == null ? ezmaxinvoicinguserResponseCompound.bEzmaxinvoicinguserBillableezsign == null : this.bEzmaxinvoicinguserBillableezsign.equals(ezmaxinvoicinguserResponseCompound.bEzmaxinvoicinguserBillableezsign)) &&
        (this.eEzmaxinvoicinguserVariationezsign == null ? ezmaxinvoicinguserResponseCompound.eEzmaxinvoicinguserVariationezsign == null : this.eEzmaxinvoicinguserVariationezsign.equals(ezmaxinvoicinguserResponseCompound.eEzmaxinvoicinguserVariationezsign)) &&
        (this.objContactName == null ? ezmaxinvoicinguserResponseCompound.objContactName == null : this.objContactName.equals(ezmaxinvoicinguserResponseCompound.objContactName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicinguserID == null ? 0: this.pkiEzmaxinvoicinguserID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.iEzmaxinvoicinguserEzsigndocument == null ? 0: this.iEzmaxinvoicinguserEzsigndocument.hashCode());
    result = 31 * result + (this.bEzmaxinvoicinguserEzsignaccount == null ? 0: this.bEzmaxinvoicinguserEzsignaccount.hashCode());
    result = 31 * result + (this.bEzmaxinvoicinguserBillableezsign == null ? 0: this.bEzmaxinvoicinguserBillableezsign.hashCode());
    result = 31 * result + (this.eEzmaxinvoicinguserVariationezsign == null ? 0: this.eEzmaxinvoicinguserVariationezsign.hashCode());
    result = 31 * result + (this.objContactName == null ? 0: this.objContactName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicinguserResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicinguserID: ").append(pkiEzmaxinvoicinguserID).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  iEzmaxinvoicinguserEzsigndocument: ").append(iEzmaxinvoicinguserEzsigndocument).append("\n");
    sb.append("  bEzmaxinvoicinguserEzsignaccount: ").append(bEzmaxinvoicinguserEzsignaccount).append("\n");
    sb.append("  bEzmaxinvoicinguserBillableezsign: ").append(bEzmaxinvoicinguserBillableezsign).append("\n");
    sb.append("  eEzmaxinvoicinguserVariationezsign: ").append(eEzmaxinvoicinguserVariationezsign).append("\n");
    sb.append("  objContactName: ").append(objContactName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
