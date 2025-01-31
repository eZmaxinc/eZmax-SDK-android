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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Creditcardmerchant Object
 **/
@ApiModel(description = "A Creditcardmerchant Object")
public class CreditcardmerchantRequest {
  
  @SerializedName("pkiCreditcardmerchantID")
  private Integer pkiCreditcardmerchantID = null;
  @SerializedName("fkiBankaccountID")
  private Integer fkiBankaccountID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("bCreditcardmerchantDenyvisa")
  private Boolean bCreditcardmerchantDenyvisa = null;
  @SerializedName("bCreditcardmerchantDenymastercard")
  private Boolean bCreditcardmerchantDenymastercard = null;
  @SerializedName("bCreditcardmerchantDenyamex")
  private Boolean bCreditcardmerchantDenyamex = null;
  @SerializedName("bCreditcardmerchantIsactive")
  private Boolean bCreditcardmerchantIsactive = null;
  @SerializedName("sCreditcardmerchantApitoken")
  private String sCreditcardmerchantApitoken = null;
  @SerializedName("sCreditcardmerchantDescription")
  private String sCreditcardmerchantDescription = null;
  @SerializedName("sCreditcardmerchantStoreid")
  private String sCreditcardmerchantStoreid = null;

  /**
   * The unique ID of the Creditcardmerchant
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Creditcardmerchant")
  public Integer getPkiCreditcardmerchantID() {
    return pkiCreditcardmerchantID;
  }
  public void setPkiCreditcardmerchantID(Integer pkiCreditcardmerchantID) {
    this.pkiCreditcardmerchantID = pkiCreditcardmerchantID;
  }

  /**
   * The unique ID of the Bankaccount
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Bankaccount")
  public Integer getFkiBankaccountID() {
    return fkiBankaccountID;
  }
  public void setFkiBankaccountID(Integer fkiBankaccountID) {
    this.fkiBankaccountID = fkiBankaccountID;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * Whether if visa are denied
   **/
  @ApiModelProperty(required = true, value = "Whether if visa are denied")
  public Boolean getBCreditcardmerchantDenyvisa() {
    return bCreditcardmerchantDenyvisa;
  }
  public void setBCreditcardmerchantDenyvisa(Boolean bCreditcardmerchantDenyvisa) {
    this.bCreditcardmerchantDenyvisa = bCreditcardmerchantDenyvisa;
  }

  /**
   * Whether if mastercard are denied
   **/
  @ApiModelProperty(required = true, value = "Whether if mastercard are denied")
  public Boolean getBCreditcardmerchantDenymastercard() {
    return bCreditcardmerchantDenymastercard;
  }
  public void setBCreditcardmerchantDenymastercard(Boolean bCreditcardmerchantDenymastercard) {
    this.bCreditcardmerchantDenymastercard = bCreditcardmerchantDenymastercard;
  }

  /**
   * Whether if amex are denied
   **/
  @ApiModelProperty(required = true, value = "Whether if amex are denied")
  public Boolean getBCreditcardmerchantDenyamex() {
    return bCreditcardmerchantDenyamex;
  }
  public void setBCreditcardmerchantDenyamex(Boolean bCreditcardmerchantDenyamex) {
    this.bCreditcardmerchantDenyamex = bCreditcardmerchantDenyamex;
  }

  /**
   * Whether the creditcardmerchant is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the creditcardmerchant is active or not")
  public Boolean getBCreditcardmerchantIsactive() {
    return bCreditcardmerchantIsactive;
  }
  public void setBCreditcardmerchantIsactive(Boolean bCreditcardmerchantIsactive) {
    this.bCreditcardmerchantIsactive = bCreditcardmerchantIsactive;
  }

  /**
   * The apitoken of the Creditcardmerchant
   **/
  @ApiModelProperty(value = "The apitoken of the Creditcardmerchant")
  public String getSCreditcardmerchantApitoken() {
    return sCreditcardmerchantApitoken;
  }
  public void setSCreditcardmerchantApitoken(String sCreditcardmerchantApitoken) {
    this.sCreditcardmerchantApitoken = sCreditcardmerchantApitoken;
  }

  /**
   * The description of the Creditcardmerchant
   **/
  @ApiModelProperty(required = true, value = "The description of the Creditcardmerchant")
  public String getSCreditcardmerchantDescription() {
    return sCreditcardmerchantDescription;
  }
  public void setSCreditcardmerchantDescription(String sCreditcardmerchantDescription) {
    this.sCreditcardmerchantDescription = sCreditcardmerchantDescription;
  }

  /**
   * The storeid of the Creditcardmerchant
   **/
  @ApiModelProperty(required = true, value = "The storeid of the Creditcardmerchant")
  public String getSCreditcardmerchantStoreid() {
    return sCreditcardmerchantStoreid;
  }
  public void setSCreditcardmerchantStoreid(String sCreditcardmerchantStoreid) {
    this.sCreditcardmerchantStoreid = sCreditcardmerchantStoreid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardmerchantRequest creditcardmerchantRequest = (CreditcardmerchantRequest) o;
    return (this.pkiCreditcardmerchantID == null ? creditcardmerchantRequest.pkiCreditcardmerchantID == null : this.pkiCreditcardmerchantID.equals(creditcardmerchantRequest.pkiCreditcardmerchantID)) &&
        (this.fkiBankaccountID == null ? creditcardmerchantRequest.fkiBankaccountID == null : this.fkiBankaccountID.equals(creditcardmerchantRequest.fkiBankaccountID)) &&
        (this.fkiLanguageID == null ? creditcardmerchantRequest.fkiLanguageID == null : this.fkiLanguageID.equals(creditcardmerchantRequest.fkiLanguageID)) &&
        (this.bCreditcardmerchantDenyvisa == null ? creditcardmerchantRequest.bCreditcardmerchantDenyvisa == null : this.bCreditcardmerchantDenyvisa.equals(creditcardmerchantRequest.bCreditcardmerchantDenyvisa)) &&
        (this.bCreditcardmerchantDenymastercard == null ? creditcardmerchantRequest.bCreditcardmerchantDenymastercard == null : this.bCreditcardmerchantDenymastercard.equals(creditcardmerchantRequest.bCreditcardmerchantDenymastercard)) &&
        (this.bCreditcardmerchantDenyamex == null ? creditcardmerchantRequest.bCreditcardmerchantDenyamex == null : this.bCreditcardmerchantDenyamex.equals(creditcardmerchantRequest.bCreditcardmerchantDenyamex)) &&
        (this.bCreditcardmerchantIsactive == null ? creditcardmerchantRequest.bCreditcardmerchantIsactive == null : this.bCreditcardmerchantIsactive.equals(creditcardmerchantRequest.bCreditcardmerchantIsactive)) &&
        (this.sCreditcardmerchantApitoken == null ? creditcardmerchantRequest.sCreditcardmerchantApitoken == null : this.sCreditcardmerchantApitoken.equals(creditcardmerchantRequest.sCreditcardmerchantApitoken)) &&
        (this.sCreditcardmerchantDescription == null ? creditcardmerchantRequest.sCreditcardmerchantDescription == null : this.sCreditcardmerchantDescription.equals(creditcardmerchantRequest.sCreditcardmerchantDescription)) &&
        (this.sCreditcardmerchantStoreid == null ? creditcardmerchantRequest.sCreditcardmerchantStoreid == null : this.sCreditcardmerchantStoreid.equals(creditcardmerchantRequest.sCreditcardmerchantStoreid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCreditcardmerchantID == null ? 0: this.pkiCreditcardmerchantID.hashCode());
    result = 31 * result + (this.fkiBankaccountID == null ? 0: this.fkiBankaccountID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.bCreditcardmerchantDenyvisa == null ? 0: this.bCreditcardmerchantDenyvisa.hashCode());
    result = 31 * result + (this.bCreditcardmerchantDenymastercard == null ? 0: this.bCreditcardmerchantDenymastercard.hashCode());
    result = 31 * result + (this.bCreditcardmerchantDenyamex == null ? 0: this.bCreditcardmerchantDenyamex.hashCode());
    result = 31 * result + (this.bCreditcardmerchantIsactive == null ? 0: this.bCreditcardmerchantIsactive.hashCode());
    result = 31 * result + (this.sCreditcardmerchantApitoken == null ? 0: this.sCreditcardmerchantApitoken.hashCode());
    result = 31 * result + (this.sCreditcardmerchantDescription == null ? 0: this.sCreditcardmerchantDescription.hashCode());
    result = 31 * result + (this.sCreditcardmerchantStoreid == null ? 0: this.sCreditcardmerchantStoreid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardmerchantRequest {\n");
    
    sb.append("  pkiCreditcardmerchantID: ").append(pkiCreditcardmerchantID).append("\n");
    sb.append("  fkiBankaccountID: ").append(fkiBankaccountID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  bCreditcardmerchantDenyvisa: ").append(bCreditcardmerchantDenyvisa).append("\n");
    sb.append("  bCreditcardmerchantDenymastercard: ").append(bCreditcardmerchantDenymastercard).append("\n");
    sb.append("  bCreditcardmerchantDenyamex: ").append(bCreditcardmerchantDenyamex).append("\n");
    sb.append("  bCreditcardmerchantIsactive: ").append(bCreditcardmerchantIsactive).append("\n");
    sb.append("  sCreditcardmerchantApitoken: ").append(sCreditcardmerchantApitoken).append("\n");
    sb.append("  sCreditcardmerchantDescription: ").append(sCreditcardmerchantDescription).append("\n");
    sb.append("  sCreditcardmerchantStoreid: ").append(sCreditcardmerchantStoreid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
