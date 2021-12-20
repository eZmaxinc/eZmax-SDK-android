/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * Request for the /1/module/sspr/sendUsernames API Request
 **/
@ApiModel(description = "Request for the /1/module/sspr/sendUsernames API Request")
public class SsprSendUsernamesV1Request {
  
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("eUserTypeSSPR")
  private FieldEUserTypeSSPR eUserTypeSSPR = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;

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
  @ApiModelProperty(required = true, value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsprSendUsernamesV1Request ssprSendUsernamesV1Request = (SsprSendUsernamesV1Request) o;
    return (this.pksCustomerCode == null ? ssprSendUsernamesV1Request.pksCustomerCode == null : this.pksCustomerCode.equals(ssprSendUsernamesV1Request.pksCustomerCode)) &&
        (this.fkiLanguageID == null ? ssprSendUsernamesV1Request.fkiLanguageID == null : this.fkiLanguageID.equals(ssprSendUsernamesV1Request.fkiLanguageID)) &&
        (this.eUserTypeSSPR == null ? ssprSendUsernamesV1Request.eUserTypeSSPR == null : this.eUserTypeSSPR.equals(ssprSendUsernamesV1Request.eUserTypeSSPR)) &&
        (this.sEmailAddress == null ? ssprSendUsernamesV1Request.sEmailAddress == null : this.sEmailAddress.equals(ssprSendUsernamesV1Request.sEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.eUserTypeSSPR == null ? 0: this.eUserTypeSSPR.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsprSendUsernamesV1Request {\n");
    
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  eUserTypeSSPR: ").append(eUserTypeSSPR).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
