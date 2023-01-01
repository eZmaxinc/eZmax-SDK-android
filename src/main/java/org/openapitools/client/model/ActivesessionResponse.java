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
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("fkiSystemconfigurationtypeID")
  private Integer fkiSystemconfigurationtypeID = null;

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
  @ApiModelProperty(value = "The unique ID of the Systemconfigurationtype")
  public Integer getFkiSystemconfigurationtypeID() {
    return fkiSystemconfigurationtypeID;
  }
  public void setFkiSystemconfigurationtypeID(Integer fkiSystemconfigurationtypeID) {
    this.fkiSystemconfigurationtypeID = fkiSystemconfigurationtypeID;
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
        (this.eActivesessionWeekdaystart == null ? activesessionResponse.eActivesessionWeekdaystart == null : this.eActivesessionWeekdaystart.equals(activesessionResponse.eActivesessionWeekdaystart)) &&
        (this.fkiLanguageID == null ? activesessionResponse.fkiLanguageID == null : this.fkiLanguageID.equals(activesessionResponse.fkiLanguageID)) &&
        (this.sCompanyNameX == null ? activesessionResponse.sCompanyNameX == null : this.sCompanyNameX.equals(activesessionResponse.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? activesessionResponse.sDepartmentNameX == null : this.sDepartmentNameX.equals(activesessionResponse.sDepartmentNameX)) &&
        (this.bActivesessionDebug == null ? activesessionResponse.bActivesessionDebug == null : this.bActivesessionDebug.equals(activesessionResponse.bActivesessionDebug)) &&
        (this.bActivesessionIssuperadmin == null ? activesessionResponse.bActivesessionIssuperadmin == null : this.bActivesessionIssuperadmin.equals(activesessionResponse.bActivesessionIssuperadmin)) &&
        (this.pksCustomerCode == null ? activesessionResponse.pksCustomerCode == null : this.pksCustomerCode.equals(activesessionResponse.pksCustomerCode)) &&
        (this.fkiSystemconfigurationtypeID == null ? activesessionResponse.fkiSystemconfigurationtypeID == null : this.fkiSystemconfigurationtypeID.equals(activesessionResponse.fkiSystemconfigurationtypeID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eActivesessionUsertype == null ? 0: this.eActivesessionUsertype.hashCode());
    result = 31 * result + (this.eActivesessionWeekdaystart == null ? 0: this.eActivesessionWeekdaystart.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.bActivesessionDebug == null ? 0: this.bActivesessionDebug.hashCode());
    result = 31 * result + (this.bActivesessionIssuperadmin == null ? 0: this.bActivesessionIssuperadmin.hashCode());
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.fkiSystemconfigurationtypeID == null ? 0: this.fkiSystemconfigurationtypeID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionResponse {\n");
    
    sb.append("  eActivesessionUsertype: ").append(eActivesessionUsertype).append("\n");
    sb.append("  eActivesessionWeekdaystart: ").append(eActivesessionWeekdaystart).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  bActivesessionDebug: ").append(bActivesessionDebug).append("\n");
    sb.append("  bActivesessionIssuperadmin: ").append(bActivesessionIssuperadmin).append("\n");
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  fkiSystemconfigurationtypeID: ").append(fkiSystemconfigurationtypeID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
