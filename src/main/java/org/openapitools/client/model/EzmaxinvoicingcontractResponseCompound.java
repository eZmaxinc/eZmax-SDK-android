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

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEEzmaxinvoicingcontractPaymenttype;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingcontract Object
 **/
@ApiModel(description = "A Ezmaxinvoicingcontract Object")
public class EzmaxinvoicingcontractResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingcontractID")
  private Integer pkiEzmaxinvoicingcontractID = null;
  @SerializedName("eEzmaxinvoicingcontractPaymenttype")
  private FieldEEzmaxinvoicingcontractPaymenttype eEzmaxinvoicingcontractPaymenttype = null;
  @SerializedName("iEzmaxinvoicingcontractLength")
  private Integer iEzmaxinvoicingcontractLength = null;
  @SerializedName("dtEzmaxinvoicingcontractStart")
  private String dtEzmaxinvoicingcontractStart = null;
  @SerializedName("dtEzmaxinvoicingcontractEnd")
  private String dtEzmaxinvoicingcontractEnd = null;
  @SerializedName("dEzmaxinvoicingcontractLicense")
  private String dEzmaxinvoicingcontractLicense = null;
  @SerializedName("dEzmaxinvoicingcontract121qa")
  private String dEzmaxinvoicingcontract121qa = null;
  @SerializedName("bEzmaxinvoicingcontractEzsignallagents")
  private Boolean bEzmaxinvoicingcontractEzsignallagents = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezmaxinvoicingcontract
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxinvoicingcontract")
  public Integer getPkiEzmaxinvoicingcontractID() {
    return pkiEzmaxinvoicingcontractID;
  }
  public void setPkiEzmaxinvoicingcontractID(Integer pkiEzmaxinvoicingcontractID) {
    this.pkiEzmaxinvoicingcontractID = pkiEzmaxinvoicingcontractID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzmaxinvoicingcontractPaymenttype getEEzmaxinvoicingcontractPaymenttype() {
    return eEzmaxinvoicingcontractPaymenttype;
  }
  public void setEEzmaxinvoicingcontractPaymenttype(FieldEEzmaxinvoicingcontractPaymenttype eEzmaxinvoicingcontractPaymenttype) {
    this.eEzmaxinvoicingcontractPaymenttype = eEzmaxinvoicingcontractPaymenttype;
  }

  /**
   * The length in years of the Ezmaxinvoicingcontract
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The length in years of the Ezmaxinvoicingcontract")
  public Integer getIEzmaxinvoicingcontractLength() {
    return iEzmaxinvoicingcontractLength;
  }
  public void setIEzmaxinvoicingcontractLength(Integer iEzmaxinvoicingcontractLength) {
    this.iEzmaxinvoicingcontractLength = iEzmaxinvoicingcontractLength;
  }

  /**
   * The start date of the Ezmaxinvoicingcontract
   **/
  @ApiModelProperty(required = true, value = "The start date of the Ezmaxinvoicingcontract")
  public String getDtEzmaxinvoicingcontractStart() {
    return dtEzmaxinvoicingcontractStart;
  }
  public void setDtEzmaxinvoicingcontractStart(String dtEzmaxinvoicingcontractStart) {
    this.dtEzmaxinvoicingcontractStart = dtEzmaxinvoicingcontractStart;
  }

  /**
   * The end date of the Ezmaxinvoicingcontract
   **/
  @ApiModelProperty(required = true, value = "The end date of the Ezmaxinvoicingcontract")
  public String getDtEzmaxinvoicingcontractEnd() {
    return dtEzmaxinvoicingcontractEnd;
  }
  public void setDtEzmaxinvoicingcontractEnd(String dtEzmaxinvoicingcontractEnd) {
    this.dtEzmaxinvoicingcontractEnd = dtEzmaxinvoicingcontractEnd;
  }

  /**
   * The price of the license
   **/
  @ApiModelProperty(required = true, value = "The price of the license")
  public String getDEzmaxinvoicingcontractLicense() {
    return dEzmaxinvoicingcontractLicense;
  }
  public void setDEzmaxinvoicingcontractLicense(String dEzmaxinvoicingcontractLicense) {
    this.dEzmaxinvoicingcontractLicense = dEzmaxinvoicingcontractLicense;
  }

  /**
   * The price for 121QA
   **/
  @ApiModelProperty(required = true, value = "The price for 121QA")
  public String getDEzmaxinvoicingcontract121qa() {
    return dEzmaxinvoicingcontract121qa;
  }
  public void setDEzmaxinvoicingcontract121qa(String dEzmaxinvoicingcontract121qa) {
    this.dEzmaxinvoicingcontract121qa = dEzmaxinvoicingcontract121qa;
  }

  /**
   * Whether eZsign is for all agents
   **/
  @ApiModelProperty(required = true, value = "Whether eZsign is for all agents")
  public Boolean getBEzmaxinvoicingcontractEzsignallagents() {
    return bEzmaxinvoicingcontractEzsignallagents;
  }
  public void setBEzmaxinvoicingcontractEzsignallagents(Boolean bEzmaxinvoicingcontractEzsignallagents) {
    this.bEzmaxinvoicingcontractEzsignallagents = bEzmaxinvoicingcontractEzsignallagents;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    EzmaxinvoicingcontractResponseCompound ezmaxinvoicingcontractResponseCompound = (EzmaxinvoicingcontractResponseCompound) o;
    return (this.pkiEzmaxinvoicingcontractID == null ? ezmaxinvoicingcontractResponseCompound.pkiEzmaxinvoicingcontractID == null : this.pkiEzmaxinvoicingcontractID.equals(ezmaxinvoicingcontractResponseCompound.pkiEzmaxinvoicingcontractID)) &&
        (this.eEzmaxinvoicingcontractPaymenttype == null ? ezmaxinvoicingcontractResponseCompound.eEzmaxinvoicingcontractPaymenttype == null : this.eEzmaxinvoicingcontractPaymenttype.equals(ezmaxinvoicingcontractResponseCompound.eEzmaxinvoicingcontractPaymenttype)) &&
        (this.iEzmaxinvoicingcontractLength == null ? ezmaxinvoicingcontractResponseCompound.iEzmaxinvoicingcontractLength == null : this.iEzmaxinvoicingcontractLength.equals(ezmaxinvoicingcontractResponseCompound.iEzmaxinvoicingcontractLength)) &&
        (this.dtEzmaxinvoicingcontractStart == null ? ezmaxinvoicingcontractResponseCompound.dtEzmaxinvoicingcontractStart == null : this.dtEzmaxinvoicingcontractStart.equals(ezmaxinvoicingcontractResponseCompound.dtEzmaxinvoicingcontractStart)) &&
        (this.dtEzmaxinvoicingcontractEnd == null ? ezmaxinvoicingcontractResponseCompound.dtEzmaxinvoicingcontractEnd == null : this.dtEzmaxinvoicingcontractEnd.equals(ezmaxinvoicingcontractResponseCompound.dtEzmaxinvoicingcontractEnd)) &&
        (this.dEzmaxinvoicingcontractLicense == null ? ezmaxinvoicingcontractResponseCompound.dEzmaxinvoicingcontractLicense == null : this.dEzmaxinvoicingcontractLicense.equals(ezmaxinvoicingcontractResponseCompound.dEzmaxinvoicingcontractLicense)) &&
        (this.dEzmaxinvoicingcontract121qa == null ? ezmaxinvoicingcontractResponseCompound.dEzmaxinvoicingcontract121qa == null : this.dEzmaxinvoicingcontract121qa.equals(ezmaxinvoicingcontractResponseCompound.dEzmaxinvoicingcontract121qa)) &&
        (this.bEzmaxinvoicingcontractEzsignallagents == null ? ezmaxinvoicingcontractResponseCompound.bEzmaxinvoicingcontractEzsignallagents == null : this.bEzmaxinvoicingcontractEzsignallagents.equals(ezmaxinvoicingcontractResponseCompound.bEzmaxinvoicingcontractEzsignallagents)) &&
        (this.objAudit == null ? ezmaxinvoicingcontractResponseCompound.objAudit == null : this.objAudit.equals(ezmaxinvoicingcontractResponseCompound.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingcontractID == null ? 0: this.pkiEzmaxinvoicingcontractID.hashCode());
    result = 31 * result + (this.eEzmaxinvoicingcontractPaymenttype == null ? 0: this.eEzmaxinvoicingcontractPaymenttype.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingcontractLength == null ? 0: this.iEzmaxinvoicingcontractLength.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingcontractStart == null ? 0: this.dtEzmaxinvoicingcontractStart.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingcontractEnd == null ? 0: this.dtEzmaxinvoicingcontractEnd.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingcontractLicense == null ? 0: this.dEzmaxinvoicingcontractLicense.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingcontract121qa == null ? 0: this.dEzmaxinvoicingcontract121qa.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingcontractEzsignallagents == null ? 0: this.bEzmaxinvoicingcontractEzsignallagents.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingcontractResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingcontractID: ").append(pkiEzmaxinvoicingcontractID).append("\n");
    sb.append("  eEzmaxinvoicingcontractPaymenttype: ").append(eEzmaxinvoicingcontractPaymenttype).append("\n");
    sb.append("  iEzmaxinvoicingcontractLength: ").append(iEzmaxinvoicingcontractLength).append("\n");
    sb.append("  dtEzmaxinvoicingcontractStart: ").append(dtEzmaxinvoicingcontractStart).append("\n");
    sb.append("  dtEzmaxinvoicingcontractEnd: ").append(dtEzmaxinvoicingcontractEnd).append("\n");
    sb.append("  dEzmaxinvoicingcontractLicense: ").append(dEzmaxinvoicingcontractLicense).append("\n");
    sb.append("  dEzmaxinvoicingcontract121qa: ").append(dEzmaxinvoicingcontract121qa).append("\n");
    sb.append("  bEzmaxinvoicingcontractEzsignallagents: ").append(bEzmaxinvoicingcontractEzsignallagents).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
