/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEActivesessionEzsign;
import org.openapitools.client.model.FieldEActivesessionEzsignaccess;
import org.openapitools.client.model.FieldEActivesessionEzsignprepaid;
import org.openapitools.client.model.FieldEActivesessionOrigin;
import org.openapitools.client.model.FieldEActivesessionRealestateinprogress;
import org.openapitools.client.model.FieldEActivesessionUsertype;
import org.openapitools.client.model.FieldEActivesessionWeekdaystart;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Activesession Object
 **/
@ApiModel(description = "An Activesession Object")
public class ActivesessionResponse {
  
  @SerializedName("eActivesessionUsertype")
  private FieldEActivesessionUsertype eActivesessionUsertype = null;
  @SerializedName("eActivesessionOrigin")
  private FieldEActivesessionOrigin eActivesessionOrigin = null;
  @SerializedName("eActivesessionWeekdaystart")
  private FieldEActivesessionWeekdaystart eActivesessionWeekdaystart = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;
  @SerializedName("sDepartmentNameX")
  private String sDepartmentNameX = null;
  @SerializedName("bActivesessionDebug")
  private Boolean bActivesessionDebug = null;
  @SerializedName("bActivesessionIssuperadmin")
  private Boolean bActivesessionIssuperadmin = null;
  @SerializedName("bActivesessionAttachment")
  private Boolean bActivesessionAttachment = null;
  @SerializedName("bActivesessionCanafe")
  private Boolean bActivesessionCanafe = null;
  @SerializedName("bActivesessionFinancial")
  private Boolean bActivesessionFinancial = null;
  @SerializedName("bActivesessionRealestatecompleted")
  private Boolean bActivesessionRealestatecompleted = null;
  @SerializedName("eActivesessionEzsign")
  private FieldEActivesessionEzsign eActivesessionEzsign = null;
  @SerializedName("eActivesessionEzsignaccess")
  private FieldEActivesessionEzsignaccess eActivesessionEzsignaccess = null;
  @SerializedName("eActivesessionEzsignprepaid")
  private FieldEActivesessionEzsignprepaid eActivesessionEzsignprepaid = null;
  @SerializedName("eActivesessionRealestateinprogress")
  private FieldEActivesessionRealestateinprogress eActivesessionRealestateinprogress = null;
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("fkiSystemconfigurationtypeID")
  private Integer fkiSystemconfigurationtypeID = null;
  @SerializedName("fkiSignatureID")
  private Integer fkiSignatureID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionUsertype getEActivesessionUsertype() {
    return eActivesessionUsertype;
  }
  public void setEActivesessionUsertype(FieldEActivesessionUsertype eActivesessionUsertype) {
    this.eActivesessionUsertype = eActivesessionUsertype;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionOrigin getEActivesessionOrigin() {
    return eActivesessionOrigin;
  }
  public void setEActivesessionOrigin(FieldEActivesessionOrigin eActivesessionOrigin) {
    this.eActivesessionOrigin = eActivesessionOrigin;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionWeekdaystart getEActivesessionWeekdaystart() {
    return eActivesessionWeekdaystart;
  }
  public void setEActivesessionWeekdaystart(FieldEActivesessionWeekdaystart eActivesessionWeekdaystart) {
    this.eActivesessionWeekdaystart = eActivesessionWeekdaystart;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * The Name of the Company in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Company in the language of the requester")
  public String getSCompanyNameX() {
    return sCompanyNameX;
  }
  public void setSCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }

  /**
   * The Name of the Department in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Department in the language of the requester")
  public String getSDepartmentNameX() {
    return sDepartmentNameX;
  }
  public void setSDepartmentNameX(String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }

  /**
   * Whether the active session is in debug or not
   **/
  @ApiModelProperty(required = true, value = "Whether the active session is in debug or not")
  public Boolean getBActivesessionDebug() {
    return bActivesessionDebug;
  }
  public void setBActivesessionDebug(Boolean bActivesessionDebug) {
    this.bActivesessionDebug = bActivesessionDebug;
  }

  /**
   * Whether the active session is superadmin or not
   **/
  @ApiModelProperty(required = true, value = "Whether the active session is superadmin or not")
  public Boolean getBActivesessionIssuperadmin() {
    return bActivesessionIssuperadmin;
  }
  public void setBActivesessionIssuperadmin(Boolean bActivesessionIssuperadmin) {
    this.bActivesessionIssuperadmin = bActivesessionIssuperadmin;
  }

  /**
   * Can access attachment when we clone a user
   **/
  @ApiModelProperty(value = "Can access attachment when we clone a user")
  public Boolean getBActivesessionAttachment() {
    return bActivesessionAttachment;
  }
  public void setBActivesessionAttachment(Boolean bActivesessionAttachment) {
    this.bActivesessionAttachment = bActivesessionAttachment;
  }

  /**
   * Can access canafe when we clone a user
   **/
  @ApiModelProperty(value = "Can access canafe when we clone a user")
  public Boolean getBActivesessionCanafe() {
    return bActivesessionCanafe;
  }
  public void setBActivesessionCanafe(Boolean bActivesessionCanafe) {
    this.bActivesessionCanafe = bActivesessionCanafe;
  }

  /**
   * Can access financial element when we clone a user
   **/
  @ApiModelProperty(value = "Can access financial element when we clone a user")
  public Boolean getBActivesessionFinancial() {
    return bActivesessionFinancial;
  }
  public void setBActivesessionFinancial(Boolean bActivesessionFinancial) {
    this.bActivesessionFinancial = bActivesessionFinancial;
  }

  /**
   * Can access closed realestate folders when we clone a user
   **/
  @ApiModelProperty(value = "Can access closed realestate folders when we clone a user")
  public Boolean getBActivesessionRealestatecompleted() {
    return bActivesessionRealestatecompleted;
  }
  public void setBActivesessionRealestatecompleted(Boolean bActivesessionRealestatecompleted) {
    this.bActivesessionRealestatecompleted = bActivesessionRealestatecompleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEActivesessionEzsign getEActivesessionEzsign() {
    return eActivesessionEzsign;
  }
  public void setEActivesessionEzsign(FieldEActivesessionEzsign eActivesessionEzsign) {
    this.eActivesessionEzsign = eActivesessionEzsign;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionEzsignaccess getEActivesessionEzsignaccess() {
    return eActivesessionEzsignaccess;
  }
  public void setEActivesessionEzsignaccess(FieldEActivesessionEzsignaccess eActivesessionEzsignaccess) {
    this.eActivesessionEzsignaccess = eActivesessionEzsignaccess;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEActivesessionEzsignprepaid getEActivesessionEzsignprepaid() {
    return eActivesessionEzsignprepaid;
  }
  public void setEActivesessionEzsignprepaid(FieldEActivesessionEzsignprepaid eActivesessionEzsignprepaid) {
    this.eActivesessionEzsignprepaid = eActivesessionEzsignprepaid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEActivesessionRealestateinprogress getEActivesessionRealestateinprogress() {
    return eActivesessionRealestateinprogress;
  }
  public void setEActivesessionRealestateinprogress(FieldEActivesessionRealestateinprogress eActivesessionRealestateinprogress) {
    this.eActivesessionRealestateinprogress = eActivesessionRealestateinprogress;
  }

  /**
   * The customer code assigned to your account
   **/
  @ApiModelProperty(required = true, value = "The customer code assigned to your account")
  public String getPksCustomerCode() {
    return pksCustomerCode;
  }
  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
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
   * The unique ID of the Signature
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Signature")
  public Integer getFkiSignatureID() {
    return fkiSignatureID;
  }
  public void setFkiSignatureID(Integer fkiSignatureID) {
    this.fkiSignatureID = fkiSignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionResponse activesessionResponse = (ActivesessionResponse) o;
    return (this.eActivesessionUsertype == null ? activesessionResponse.eActivesessionUsertype == null : this.eActivesessionUsertype.equals(activesessionResponse.eActivesessionUsertype)) &&
        (this.eActivesessionOrigin == null ? activesessionResponse.eActivesessionOrigin == null : this.eActivesessionOrigin.equals(activesessionResponse.eActivesessionOrigin)) &&
        (this.eActivesessionWeekdaystart == null ? activesessionResponse.eActivesessionWeekdaystart == null : this.eActivesessionWeekdaystart.equals(activesessionResponse.eActivesessionWeekdaystart)) &&
        (this.fkiLanguageID == null ? activesessionResponse.fkiLanguageID == null : this.fkiLanguageID.equals(activesessionResponse.fkiLanguageID)) &&
        (this.sCompanyNameX == null ? activesessionResponse.sCompanyNameX == null : this.sCompanyNameX.equals(activesessionResponse.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? activesessionResponse.sDepartmentNameX == null : this.sDepartmentNameX.equals(activesessionResponse.sDepartmentNameX)) &&
        (this.bActivesessionDebug == null ? activesessionResponse.bActivesessionDebug == null : this.bActivesessionDebug.equals(activesessionResponse.bActivesessionDebug)) &&
        (this.bActivesessionIssuperadmin == null ? activesessionResponse.bActivesessionIssuperadmin == null : this.bActivesessionIssuperadmin.equals(activesessionResponse.bActivesessionIssuperadmin)) &&
        (this.bActivesessionAttachment == null ? activesessionResponse.bActivesessionAttachment == null : this.bActivesessionAttachment.equals(activesessionResponse.bActivesessionAttachment)) &&
        (this.bActivesessionCanafe == null ? activesessionResponse.bActivesessionCanafe == null : this.bActivesessionCanafe.equals(activesessionResponse.bActivesessionCanafe)) &&
        (this.bActivesessionFinancial == null ? activesessionResponse.bActivesessionFinancial == null : this.bActivesessionFinancial.equals(activesessionResponse.bActivesessionFinancial)) &&
        (this.bActivesessionRealestatecompleted == null ? activesessionResponse.bActivesessionRealestatecompleted == null : this.bActivesessionRealestatecompleted.equals(activesessionResponse.bActivesessionRealestatecompleted)) &&
        (this.eActivesessionEzsign == null ? activesessionResponse.eActivesessionEzsign == null : this.eActivesessionEzsign.equals(activesessionResponse.eActivesessionEzsign)) &&
        (this.eActivesessionEzsignaccess == null ? activesessionResponse.eActivesessionEzsignaccess == null : this.eActivesessionEzsignaccess.equals(activesessionResponse.eActivesessionEzsignaccess)) &&
        (this.eActivesessionEzsignprepaid == null ? activesessionResponse.eActivesessionEzsignprepaid == null : this.eActivesessionEzsignprepaid.equals(activesessionResponse.eActivesessionEzsignprepaid)) &&
        (this.eActivesessionRealestateinprogress == null ? activesessionResponse.eActivesessionRealestateinprogress == null : this.eActivesessionRealestateinprogress.equals(activesessionResponse.eActivesessionRealestateinprogress)) &&
        (this.pksCustomerCode == null ? activesessionResponse.pksCustomerCode == null : this.pksCustomerCode.equals(activesessionResponse.pksCustomerCode)) &&
        (this.fkiSystemconfigurationtypeID == null ? activesessionResponse.fkiSystemconfigurationtypeID == null : this.fkiSystemconfigurationtypeID.equals(activesessionResponse.fkiSystemconfigurationtypeID)) &&
        (this.fkiSignatureID == null ? activesessionResponse.fkiSignatureID == null : this.fkiSignatureID.equals(activesessionResponse.fkiSignatureID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eActivesessionUsertype == null ? 0: this.eActivesessionUsertype.hashCode());
    result = 31 * result + (this.eActivesessionOrigin == null ? 0: this.eActivesessionOrigin.hashCode());
    result = 31 * result + (this.eActivesessionWeekdaystart == null ? 0: this.eActivesessionWeekdaystart.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.bActivesessionDebug == null ? 0: this.bActivesessionDebug.hashCode());
    result = 31 * result + (this.bActivesessionIssuperadmin == null ? 0: this.bActivesessionIssuperadmin.hashCode());
    result = 31 * result + (this.bActivesessionAttachment == null ? 0: this.bActivesessionAttachment.hashCode());
    result = 31 * result + (this.bActivesessionCanafe == null ? 0: this.bActivesessionCanafe.hashCode());
    result = 31 * result + (this.bActivesessionFinancial == null ? 0: this.bActivesessionFinancial.hashCode());
    result = 31 * result + (this.bActivesessionRealestatecompleted == null ? 0: this.bActivesessionRealestatecompleted.hashCode());
    result = 31 * result + (this.eActivesessionEzsign == null ? 0: this.eActivesessionEzsign.hashCode());
    result = 31 * result + (this.eActivesessionEzsignaccess == null ? 0: this.eActivesessionEzsignaccess.hashCode());
    result = 31 * result + (this.eActivesessionEzsignprepaid == null ? 0: this.eActivesessionEzsignprepaid.hashCode());
    result = 31 * result + (this.eActivesessionRealestateinprogress == null ? 0: this.eActivesessionRealestateinprogress.hashCode());
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.fkiSystemconfigurationtypeID == null ? 0: this.fkiSystemconfigurationtypeID.hashCode());
    result = 31 * result + (this.fkiSignatureID == null ? 0: this.fkiSignatureID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionResponse {\n");
    
    sb.append("  eActivesessionUsertype: ").append(eActivesessionUsertype).append("\n");
    sb.append("  eActivesessionOrigin: ").append(eActivesessionOrigin).append("\n");
    sb.append("  eActivesessionWeekdaystart: ").append(eActivesessionWeekdaystart).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  bActivesessionDebug: ").append(bActivesessionDebug).append("\n");
    sb.append("  bActivesessionIssuperadmin: ").append(bActivesessionIssuperadmin).append("\n");
    sb.append("  bActivesessionAttachment: ").append(bActivesessionAttachment).append("\n");
    sb.append("  bActivesessionCanafe: ").append(bActivesessionCanafe).append("\n");
    sb.append("  bActivesessionFinancial: ").append(bActivesessionFinancial).append("\n");
    sb.append("  bActivesessionRealestatecompleted: ").append(bActivesessionRealestatecompleted).append("\n");
    sb.append("  eActivesessionEzsign: ").append(eActivesessionEzsign).append("\n");
    sb.append("  eActivesessionEzsignaccess: ").append(eActivesessionEzsignaccess).append("\n");
    sb.append("  eActivesessionEzsignprepaid: ").append(eActivesessionEzsignprepaid).append("\n");
    sb.append("  eActivesessionRealestateinprogress: ").append(eActivesessionRealestateinprogress).append("\n");
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  fkiSystemconfigurationtypeID: ").append(fkiSystemconfigurationtypeID).append("\n");
    sb.append("  fkiSignatureID: ").append(fkiSignatureID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
