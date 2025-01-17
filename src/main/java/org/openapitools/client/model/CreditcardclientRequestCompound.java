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

import org.openapitools.client.model.CreditcarddetailRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Creditcardclient Object and children
 **/
@ApiModel(description = "A Creditcardclient Object and children")
public class CreditcardclientRequestCompound {
  
  @SerializedName("pkiCreditcardclientID")
  private Integer pkiCreditcardclientID = null;
  @SerializedName("fksCreditcardtokenID")
  private String fksCreditcardtokenID = null;
  @SerializedName("bCreditcardclientrelationIsdefault")
  private Boolean bCreditcardclientrelationIsdefault = null;
  @SerializedName("sCreditcardclientDescription")
  private String sCreditcardclientDescription = null;
  @SerializedName("bCreditcardclientAllowedcompanypayment")
  private Boolean bCreditcardclientAllowedcompanypayment = null;
  @SerializedName("bCreditcardclientAllowedezsign")
  private Boolean bCreditcardclientAllowedezsign = null;
  @SerializedName("bCreditcardclientAllowedtranquillit")
  private Boolean bCreditcardclientAllowedtranquillit = null;
  @SerializedName("objCreditcarddetail")
  private CreditcarddetailRequest objCreditcarddetail = null;
  @SerializedName("sCreditcardclientCVV")
  private String sCreditcardclientCVV = null;

  /**
   * The unique ID of the Creditcardclient
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Creditcardclient")
  public Integer getPkiCreditcardclientID() {
    return pkiCreditcardclientID;
  }
  public void setPkiCreditcardclientID(Integer pkiCreditcardclientID) {
    this.pkiCreditcardclientID = pkiCreditcardclientID;
  }

  /**
   * The creditcard token identifier
   **/
  @ApiModelProperty(value = "The creditcard token identifier")
  public String getFksCreditcardtokenID() {
    return fksCreditcardtokenID;
  }
  public void setFksCreditcardtokenID(String fksCreditcardtokenID) {
    this.fksCreditcardtokenID = fksCreditcardtokenID;
  }

  /**
   * Whether if it's the creditcardclient is the default one
   **/
  @ApiModelProperty(required = true, value = "Whether if it's the creditcardclient is the default one")
  public Boolean getBCreditcardclientrelationIsdefault() {
    return bCreditcardclientrelationIsdefault;
  }
  public void setBCreditcardclientrelationIsdefault(Boolean bCreditcardclientrelationIsdefault) {
    this.bCreditcardclientrelationIsdefault = bCreditcardclientrelationIsdefault;
  }

  /**
   * The description of the Creditcardclient
   **/
  @ApiModelProperty(required = true, value = "The description of the Creditcardclient")
  public String getSCreditcardclientDescription() {
    return sCreditcardclientDescription;
  }
  public void setSCreditcardclientDescription(String sCreditcardclientDescription) {
    this.sCreditcardclientDescription = sCreditcardclientDescription;
  }

  /**
   * Whether if it's an allowedagencypayment
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an allowedagencypayment")
  public Boolean getBCreditcardclientAllowedcompanypayment() {
    return bCreditcardclientAllowedcompanypayment;
  }
  public void setBCreditcardclientAllowedcompanypayment(Boolean bCreditcardclientAllowedcompanypayment) {
    this.bCreditcardclientAllowedcompanypayment = bCreditcardclientAllowedcompanypayment;
  }

  /**
   * Whether if it's an allowedroyallepageprotection
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an allowedroyallepageprotection")
  public Boolean getBCreditcardclientAllowedezsign() {
    return bCreditcardclientAllowedezsign;
  }
  public void setBCreditcardclientAllowedezsign(Boolean bCreditcardclientAllowedezsign) {
    this.bCreditcardclientAllowedezsign = bCreditcardclientAllowedezsign;
  }

  /**
   * Whether if it's an allowedtranquillit
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an allowedtranquillit")
  public Boolean getBCreditcardclientAllowedtranquillit() {
    return bCreditcardclientAllowedtranquillit;
  }
  public void setBCreditcardclientAllowedtranquillit(Boolean bCreditcardclientAllowedtranquillit) {
    this.bCreditcardclientAllowedtranquillit = bCreditcardclientAllowedtranquillit;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreditcarddetailRequest getObjCreditcarddetail() {
    return objCreditcarddetail;
  }
  public void setObjCreditcarddetail(CreditcarddetailRequest objCreditcarddetail) {
    this.objCreditcarddetail = objCreditcarddetail;
  }

  /**
   * The creditcard card CVV
   **/
  @ApiModelProperty(required = true, value = "The creditcard card CVV")
  public String getSCreditcardclientCVV() {
    return sCreditcardclientCVV;
  }
  public void setSCreditcardclientCVV(String sCreditcardclientCVV) {
    this.sCreditcardclientCVV = sCreditcardclientCVV;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientRequestCompound creditcardclientRequestCompound = (CreditcardclientRequestCompound) o;
    return (this.pkiCreditcardclientID == null ? creditcardclientRequestCompound.pkiCreditcardclientID == null : this.pkiCreditcardclientID.equals(creditcardclientRequestCompound.pkiCreditcardclientID)) &&
        (this.fksCreditcardtokenID == null ? creditcardclientRequestCompound.fksCreditcardtokenID == null : this.fksCreditcardtokenID.equals(creditcardclientRequestCompound.fksCreditcardtokenID)) &&
        (this.bCreditcardclientrelationIsdefault == null ? creditcardclientRequestCompound.bCreditcardclientrelationIsdefault == null : this.bCreditcardclientrelationIsdefault.equals(creditcardclientRequestCompound.bCreditcardclientrelationIsdefault)) &&
        (this.sCreditcardclientDescription == null ? creditcardclientRequestCompound.sCreditcardclientDescription == null : this.sCreditcardclientDescription.equals(creditcardclientRequestCompound.sCreditcardclientDescription)) &&
        (this.bCreditcardclientAllowedcompanypayment == null ? creditcardclientRequestCompound.bCreditcardclientAllowedcompanypayment == null : this.bCreditcardclientAllowedcompanypayment.equals(creditcardclientRequestCompound.bCreditcardclientAllowedcompanypayment)) &&
        (this.bCreditcardclientAllowedezsign == null ? creditcardclientRequestCompound.bCreditcardclientAllowedezsign == null : this.bCreditcardclientAllowedezsign.equals(creditcardclientRequestCompound.bCreditcardclientAllowedezsign)) &&
        (this.bCreditcardclientAllowedtranquillit == null ? creditcardclientRequestCompound.bCreditcardclientAllowedtranquillit == null : this.bCreditcardclientAllowedtranquillit.equals(creditcardclientRequestCompound.bCreditcardclientAllowedtranquillit)) &&
        (this.objCreditcarddetail == null ? creditcardclientRequestCompound.objCreditcarddetail == null : this.objCreditcarddetail.equals(creditcardclientRequestCompound.objCreditcarddetail)) &&
        (this.sCreditcardclientCVV == null ? creditcardclientRequestCompound.sCreditcardclientCVV == null : this.sCreditcardclientCVV.equals(creditcardclientRequestCompound.sCreditcardclientCVV));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCreditcardclientID == null ? 0: this.pkiCreditcardclientID.hashCode());
    result = 31 * result + (this.fksCreditcardtokenID == null ? 0: this.fksCreditcardtokenID.hashCode());
    result = 31 * result + (this.bCreditcardclientrelationIsdefault == null ? 0: this.bCreditcardclientrelationIsdefault.hashCode());
    result = 31 * result + (this.sCreditcardclientDescription == null ? 0: this.sCreditcardclientDescription.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedcompanypayment == null ? 0: this.bCreditcardclientAllowedcompanypayment.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedezsign == null ? 0: this.bCreditcardclientAllowedezsign.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedtranquillit == null ? 0: this.bCreditcardclientAllowedtranquillit.hashCode());
    result = 31 * result + (this.objCreditcarddetail == null ? 0: this.objCreditcarddetail.hashCode());
    result = 31 * result + (this.sCreditcardclientCVV == null ? 0: this.sCreditcardclientCVV.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientRequestCompound {\n");
    
    sb.append("  pkiCreditcardclientID: ").append(pkiCreditcardclientID).append("\n");
    sb.append("  fksCreditcardtokenID: ").append(fksCreditcardtokenID).append("\n");
    sb.append("  bCreditcardclientrelationIsdefault: ").append(bCreditcardclientrelationIsdefault).append("\n");
    sb.append("  sCreditcardclientDescription: ").append(sCreditcardclientDescription).append("\n");
    sb.append("  bCreditcardclientAllowedcompanypayment: ").append(bCreditcardclientAllowedcompanypayment).append("\n");
    sb.append("  bCreditcardclientAllowedezsign: ").append(bCreditcardclientAllowedezsign).append("\n");
    sb.append("  bCreditcardclientAllowedtranquillit: ").append(bCreditcardclientAllowedtranquillit).append("\n");
    sb.append("  objCreditcarddetail: ").append(objCreditcarddetail).append("\n");
    sb.append("  sCreditcardclientCVV: ").append(sCreditcardclientCVV).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
