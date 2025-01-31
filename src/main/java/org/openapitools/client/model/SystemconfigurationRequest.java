/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldESystemconfigurationEzsign;
import org.openapitools.client.model.FieldESystemconfigurationEzsignofficeplan;
import org.openapitools.client.model.FieldESystemconfigurationLanguage1;
import org.openapitools.client.model.FieldESystemconfigurationLanguage2;
import org.openapitools.client.model.FieldESystemconfigurationNewexternaluseraction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Systemconfiguration Object
 **/
@ApiModel(description = "A Systemconfiguration Object")
public class SystemconfigurationRequest {
  
  @SerializedName("pkiSystemconfigurationID")
  private Integer pkiSystemconfigurationID = null;
  @SerializedName("fkiBrandingID")
  private Integer fkiBrandingID = null;
  @SerializedName("eSystemconfigurationNewexternaluseraction")
  private FieldESystemconfigurationNewexternaluseraction eSystemconfigurationNewexternaluseraction = null;
  @SerializedName("eSystemconfigurationLanguage1")
  private FieldESystemconfigurationLanguage1 eSystemconfigurationLanguage1 = null;
  @SerializedName("eSystemconfigurationLanguage2")
  private FieldESystemconfigurationLanguage2 eSystemconfigurationLanguage2 = null;
  @SerializedName("eSystemconfigurationEzsign")
  private FieldESystemconfigurationEzsign eSystemconfigurationEzsign = null;
  @SerializedName("eSystemconfigurationEzsignofficeplan")
  private FieldESystemconfigurationEzsignofficeplan eSystemconfigurationEzsignofficeplan = null;
  @SerializedName("bSystemconfigurationEzsignpaidbyoffice")
  private Boolean bSystemconfigurationEzsignpaidbyoffice = null;
  @SerializedName("bSystemconfigurationEzsignpersonnal")
  private Boolean bSystemconfigurationEzsignpersonnal = null;
  @SerializedName("bSystemconfigurationSspr")
  private Boolean bSystemconfigurationSspr = null;
  @SerializedName("dtSystemconfigurationReadonlyexpirationstart")
  private String dtSystemconfigurationReadonlyexpirationstart = null;
  @SerializedName("dtSystemconfigurationReadonlyexpirationend")
  private String dtSystemconfigurationReadonlyexpirationend = null;

  /**
   * The unique ID of the Systemconfiguration
   * minimum: 1
   * maximum: 1
   **/
  @ApiModelProperty(value = "The unique ID of the Systemconfiguration")
  public Integer getPkiSystemconfigurationID() {
    return pkiSystemconfigurationID;
  }
  public void setPkiSystemconfigurationID(Integer pkiSystemconfigurationID) {
    this.pkiSystemconfigurationID = pkiSystemconfigurationID;
  }

  /**
   * The unique ID of the Branding
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Branding")
  public Integer getFkiBrandingID() {
    return fkiBrandingID;
  }
  public void setFkiBrandingID(Integer fkiBrandingID) {
    this.fkiBrandingID = fkiBrandingID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldESystemconfigurationNewexternaluseraction getESystemconfigurationNewexternaluseraction() {
    return eSystemconfigurationNewexternaluseraction;
  }
  public void setESystemconfigurationNewexternaluseraction(FieldESystemconfigurationNewexternaluseraction eSystemconfigurationNewexternaluseraction) {
    this.eSystemconfigurationNewexternaluseraction = eSystemconfigurationNewexternaluseraction;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldESystemconfigurationLanguage1 getESystemconfigurationLanguage1() {
    return eSystemconfigurationLanguage1;
  }
  public void setESystemconfigurationLanguage1(FieldESystemconfigurationLanguage1 eSystemconfigurationLanguage1) {
    this.eSystemconfigurationLanguage1 = eSystemconfigurationLanguage1;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldESystemconfigurationLanguage2 getESystemconfigurationLanguage2() {
    return eSystemconfigurationLanguage2;
  }
  public void setESystemconfigurationLanguage2(FieldESystemconfigurationLanguage2 eSystemconfigurationLanguage2) {
    this.eSystemconfigurationLanguage2 = eSystemconfigurationLanguage2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldESystemconfigurationEzsign getESystemconfigurationEzsign() {
    return eSystemconfigurationEzsign;
  }
  public void setESystemconfigurationEzsign(FieldESystemconfigurationEzsign eSystemconfigurationEzsign) {
    this.eSystemconfigurationEzsign = eSystemconfigurationEzsign;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldESystemconfigurationEzsignofficeplan getESystemconfigurationEzsignofficeplan() {
    return eSystemconfigurationEzsignofficeplan;
  }
  public void setESystemconfigurationEzsignofficeplan(FieldESystemconfigurationEzsignofficeplan eSystemconfigurationEzsignofficeplan) {
    this.eSystemconfigurationEzsignofficeplan = eSystemconfigurationEzsignofficeplan;
  }

  /**
   * Whether if Ezsign is paid by the company or not
   **/
  @ApiModelProperty(value = "Whether if Ezsign is paid by the company or not")
  public Boolean getBSystemconfigurationEzsignpaidbyoffice() {
    return bSystemconfigurationEzsignpaidbyoffice;
  }
  public void setBSystemconfigurationEzsignpaidbyoffice(Boolean bSystemconfigurationEzsignpaidbyoffice) {
    this.bSystemconfigurationEzsignpaidbyoffice = bSystemconfigurationEzsignpaidbyoffice;
  }

  /**
   * Whether if we allow the creation of personal files in eZsign
   **/
  @ApiModelProperty(required = true, value = "Whether if we allow the creation of personal files in eZsign")
  public Boolean getBSystemconfigurationEzsignpersonnal() {
    return bSystemconfigurationEzsignpersonnal;
  }
  public void setBSystemconfigurationEzsignpersonnal(Boolean bSystemconfigurationEzsignpersonnal) {
    this.bSystemconfigurationEzsignpersonnal = bSystemconfigurationEzsignpersonnal;
  }

  /**
   * Whether if we allow SSPR
   **/
  @ApiModelProperty(required = true, value = "Whether if we allow SSPR")
  public Boolean getBSystemconfigurationSspr() {
    return bSystemconfigurationSspr;
  }
  public void setBSystemconfigurationSspr(Boolean bSystemconfigurationSspr) {
    this.bSystemconfigurationSspr = bSystemconfigurationSspr;
  }

  /**
   * The start date where the system will be in read only
   **/
  @ApiModelProperty(value = "The start date where the system will be in read only")
  public String getDtSystemconfigurationReadonlyexpirationstart() {
    return dtSystemconfigurationReadonlyexpirationstart;
  }
  public void setDtSystemconfigurationReadonlyexpirationstart(String dtSystemconfigurationReadonlyexpirationstart) {
    this.dtSystemconfigurationReadonlyexpirationstart = dtSystemconfigurationReadonlyexpirationstart;
  }

  /**
   * The end date where the system will be in read only
   **/
  @ApiModelProperty(value = "The end date where the system will be in read only")
  public String getDtSystemconfigurationReadonlyexpirationend() {
    return dtSystemconfigurationReadonlyexpirationend;
  }
  public void setDtSystemconfigurationReadonlyexpirationend(String dtSystemconfigurationReadonlyexpirationend) {
    this.dtSystemconfigurationReadonlyexpirationend = dtSystemconfigurationReadonlyexpirationend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemconfigurationRequest systemconfigurationRequest = (SystemconfigurationRequest) o;
    return (this.pkiSystemconfigurationID == null ? systemconfigurationRequest.pkiSystemconfigurationID == null : this.pkiSystemconfigurationID.equals(systemconfigurationRequest.pkiSystemconfigurationID)) &&
        (this.fkiBrandingID == null ? systemconfigurationRequest.fkiBrandingID == null : this.fkiBrandingID.equals(systemconfigurationRequest.fkiBrandingID)) &&
        (this.eSystemconfigurationNewexternaluseraction == null ? systemconfigurationRequest.eSystemconfigurationNewexternaluseraction == null : this.eSystemconfigurationNewexternaluseraction.equals(systemconfigurationRequest.eSystemconfigurationNewexternaluseraction)) &&
        (this.eSystemconfigurationLanguage1 == null ? systemconfigurationRequest.eSystemconfigurationLanguage1 == null : this.eSystemconfigurationLanguage1.equals(systemconfigurationRequest.eSystemconfigurationLanguage1)) &&
        (this.eSystemconfigurationLanguage2 == null ? systemconfigurationRequest.eSystemconfigurationLanguage2 == null : this.eSystemconfigurationLanguage2.equals(systemconfigurationRequest.eSystemconfigurationLanguage2)) &&
        (this.eSystemconfigurationEzsign == null ? systemconfigurationRequest.eSystemconfigurationEzsign == null : this.eSystemconfigurationEzsign.equals(systemconfigurationRequest.eSystemconfigurationEzsign)) &&
        (this.eSystemconfigurationEzsignofficeplan == null ? systemconfigurationRequest.eSystemconfigurationEzsignofficeplan == null : this.eSystemconfigurationEzsignofficeplan.equals(systemconfigurationRequest.eSystemconfigurationEzsignofficeplan)) &&
        (this.bSystemconfigurationEzsignpaidbyoffice == null ? systemconfigurationRequest.bSystemconfigurationEzsignpaidbyoffice == null : this.bSystemconfigurationEzsignpaidbyoffice.equals(systemconfigurationRequest.bSystemconfigurationEzsignpaidbyoffice)) &&
        (this.bSystemconfigurationEzsignpersonnal == null ? systemconfigurationRequest.bSystemconfigurationEzsignpersonnal == null : this.bSystemconfigurationEzsignpersonnal.equals(systemconfigurationRequest.bSystemconfigurationEzsignpersonnal)) &&
        (this.bSystemconfigurationSspr == null ? systemconfigurationRequest.bSystemconfigurationSspr == null : this.bSystemconfigurationSspr.equals(systemconfigurationRequest.bSystemconfigurationSspr)) &&
        (this.dtSystemconfigurationReadonlyexpirationstart == null ? systemconfigurationRequest.dtSystemconfigurationReadonlyexpirationstart == null : this.dtSystemconfigurationReadonlyexpirationstart.equals(systemconfigurationRequest.dtSystemconfigurationReadonlyexpirationstart)) &&
        (this.dtSystemconfigurationReadonlyexpirationend == null ? systemconfigurationRequest.dtSystemconfigurationReadonlyexpirationend == null : this.dtSystemconfigurationReadonlyexpirationend.equals(systemconfigurationRequest.dtSystemconfigurationReadonlyexpirationend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiSystemconfigurationID == null ? 0: this.pkiSystemconfigurationID.hashCode());
    result = 31 * result + (this.fkiBrandingID == null ? 0: this.fkiBrandingID.hashCode());
    result = 31 * result + (this.eSystemconfigurationNewexternaluseraction == null ? 0: this.eSystemconfigurationNewexternaluseraction.hashCode());
    result = 31 * result + (this.eSystemconfigurationLanguage1 == null ? 0: this.eSystemconfigurationLanguage1.hashCode());
    result = 31 * result + (this.eSystemconfigurationLanguage2 == null ? 0: this.eSystemconfigurationLanguage2.hashCode());
    result = 31 * result + (this.eSystemconfigurationEzsign == null ? 0: this.eSystemconfigurationEzsign.hashCode());
    result = 31 * result + (this.eSystemconfigurationEzsignofficeplan == null ? 0: this.eSystemconfigurationEzsignofficeplan.hashCode());
    result = 31 * result + (this.bSystemconfigurationEzsignpaidbyoffice == null ? 0: this.bSystemconfigurationEzsignpaidbyoffice.hashCode());
    result = 31 * result + (this.bSystemconfigurationEzsignpersonnal == null ? 0: this.bSystemconfigurationEzsignpersonnal.hashCode());
    result = 31 * result + (this.bSystemconfigurationSspr == null ? 0: this.bSystemconfigurationSspr.hashCode());
    result = 31 * result + (this.dtSystemconfigurationReadonlyexpirationstart == null ? 0: this.dtSystemconfigurationReadonlyexpirationstart.hashCode());
    result = 31 * result + (this.dtSystemconfigurationReadonlyexpirationend == null ? 0: this.dtSystemconfigurationReadonlyexpirationend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemconfigurationRequest {\n");
    
    sb.append("  pkiSystemconfigurationID: ").append(pkiSystemconfigurationID).append("\n");
    sb.append("  fkiBrandingID: ").append(fkiBrandingID).append("\n");
    sb.append("  eSystemconfigurationNewexternaluseraction: ").append(eSystemconfigurationNewexternaluseraction).append("\n");
    sb.append("  eSystemconfigurationLanguage1: ").append(eSystemconfigurationLanguage1).append("\n");
    sb.append("  eSystemconfigurationLanguage2: ").append(eSystemconfigurationLanguage2).append("\n");
    sb.append("  eSystemconfigurationEzsign: ").append(eSystemconfigurationEzsign).append("\n");
    sb.append("  eSystemconfigurationEzsignofficeplan: ").append(eSystemconfigurationEzsignofficeplan).append("\n");
    sb.append("  bSystemconfigurationEzsignpaidbyoffice: ").append(bSystemconfigurationEzsignpaidbyoffice).append("\n");
    sb.append("  bSystemconfigurationEzsignpersonnal: ").append(bSystemconfigurationEzsignpersonnal).append("\n");
    sb.append("  bSystemconfigurationSspr: ").append(bSystemconfigurationSspr).append("\n");
    sb.append("  dtSystemconfigurationReadonlyexpirationstart: ").append(dtSystemconfigurationReadonlyexpirationstart).append("\n");
    sb.append("  dtSystemconfigurationReadonlyexpirationend: ").append(dtSystemconfigurationReadonlyexpirationend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
