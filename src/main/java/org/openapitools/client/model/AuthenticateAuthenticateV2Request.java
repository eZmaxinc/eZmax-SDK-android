/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
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
 * Request for the /2/module/authenticate/authenticate API Request
 **/
@ApiModel(description = "Request for the /2/module/authenticate/authenticate API Request")
public class AuthenticateAuthenticateV2Request {
  
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("sPassword")
  private String sPassword = null;
  @SerializedName("sPasswordEncrypted")
  private String sPasswordEncrypted = null;

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
   * A Password.  Must meet complexity requirements
   **/
  @ApiModelProperty(value = "A Password.  Must meet complexity requirements")
  public String getSPassword() {
    return sPassword;
  }
  public void setSPassword(String sPassword) {
    this.sPassword = sPassword;
  }

  /**
   * A Password encrypted and encoded in Base64  Must meet complexity requirements
   **/
  @ApiModelProperty(value = "A Password encrypted and encoded in Base64  Must meet complexity requirements")
  public String getSPasswordEncrypted() {
    return sPasswordEncrypted;
  }
  public void setSPasswordEncrypted(String sPasswordEncrypted) {
    this.sPasswordEncrypted = sPasswordEncrypted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateAuthenticateV2Request authenticateAuthenticateV2Request = (AuthenticateAuthenticateV2Request) o;
    return (this.pksCustomerCode == null ? authenticateAuthenticateV2Request.pksCustomerCode == null : this.pksCustomerCode.equals(authenticateAuthenticateV2Request.pksCustomerCode)) &&
        (this.sEmailAddress == null ? authenticateAuthenticateV2Request.sEmailAddress == null : this.sEmailAddress.equals(authenticateAuthenticateV2Request.sEmailAddress)) &&
        (this.sUserLoginname == null ? authenticateAuthenticateV2Request.sUserLoginname == null : this.sUserLoginname.equals(authenticateAuthenticateV2Request.sUserLoginname)) &&
        (this.sPassword == null ? authenticateAuthenticateV2Request.sPassword == null : this.sPassword.equals(authenticateAuthenticateV2Request.sPassword)) &&
        (this.sPasswordEncrypted == null ? authenticateAuthenticateV2Request.sPasswordEncrypted == null : this.sPasswordEncrypted.equals(authenticateAuthenticateV2Request.sPasswordEncrypted));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.sPassword == null ? 0: this.sPassword.hashCode());
    result = 31 * result + (this.sPasswordEncrypted == null ? 0: this.sPasswordEncrypted.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateAuthenticateV2Request {\n");
    
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  sPassword: ").append(sPassword).append("\n");
    sb.append("  sPasswordEncrypted: ").append(sPasswordEncrypted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
