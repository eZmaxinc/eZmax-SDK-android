/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEUserTypeSSPR;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/module/sspr/resetPassword API Request
 **/
@ApiModel(description = "Request for the /1/module/sspr/resetPassword API Request")
public class SsprResetPasswordV1Request {
  
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("eUserTypeSSPR")
  private FieldEUserTypeSSPR eUserTypeSSPR = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("binUserSSPRtoken")
  private String binUserSSPRtoken = null;
  @SerializedName("sPassword")
  private String sPassword = null;

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
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserTypeSSPR getEUserTypeSSPR() {
    return eUserTypeSSPR;
  }
  public void setEUserTypeSSPR(FieldEUserTypeSSPR eUserTypeSSPR) {
    this.eUserTypeSSPR = eUserTypeSSPR;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The Login name of the User.
   **/
  @ApiModelProperty(value = "The Login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }

  /**
   * Hex Encoded Secret SSPR token
   **/
  @ApiModelProperty(required = true, value = "Hex Encoded Secret SSPR token")
  public String getBinUserSSPRtoken() {
    return binUserSSPRtoken;
  }
  public void setBinUserSSPRtoken(String binUserSSPRtoken) {
    this.binUserSSPRtoken = binUserSSPRtoken;
  }

  /**
   * A Password.  Must meet complexity requirements
   **/
  @ApiModelProperty(required = true, value = "A Password.  Must meet complexity requirements")
  public String getSPassword() {
    return sPassword;
  }
  public void setSPassword(String sPassword) {
    this.sPassword = sPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsprResetPasswordV1Request ssprResetPasswordV1Request = (SsprResetPasswordV1Request) o;
    return (this.pksCustomerCode == null ? ssprResetPasswordV1Request.pksCustomerCode == null : this.pksCustomerCode.equals(ssprResetPasswordV1Request.pksCustomerCode)) &&
        (this.fkiLanguageID == null ? ssprResetPasswordV1Request.fkiLanguageID == null : this.fkiLanguageID.equals(ssprResetPasswordV1Request.fkiLanguageID)) &&
        (this.eUserTypeSSPR == null ? ssprResetPasswordV1Request.eUserTypeSSPR == null : this.eUserTypeSSPR.equals(ssprResetPasswordV1Request.eUserTypeSSPR)) &&
        (this.sEmailAddress == null ? ssprResetPasswordV1Request.sEmailAddress == null : this.sEmailAddress.equals(ssprResetPasswordV1Request.sEmailAddress)) &&
        (this.sUserLoginname == null ? ssprResetPasswordV1Request.sUserLoginname == null : this.sUserLoginname.equals(ssprResetPasswordV1Request.sUserLoginname)) &&
        (this.binUserSSPRtoken == null ? ssprResetPasswordV1Request.binUserSSPRtoken == null : this.binUserSSPRtoken.equals(ssprResetPasswordV1Request.binUserSSPRtoken)) &&
        (this.sPassword == null ? ssprResetPasswordV1Request.sPassword == null : this.sPassword.equals(ssprResetPasswordV1Request.sPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.eUserTypeSSPR == null ? 0: this.eUserTypeSSPR.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.binUserSSPRtoken == null ? 0: this.binUserSSPRtoken.hashCode());
    result = 31 * result + (this.sPassword == null ? 0: this.sPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsprResetPasswordV1Request {\n");
    
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  eUserTypeSSPR: ").append(eUserTypeSSPR).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  binUserSSPRtoken: ").append(binUserSSPRtoken).append("\n");
    sb.append("  sPassword: ").append(sPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
