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

import org.openapitools.client.model.CreditcarddetailResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Creditcardclient Object
 **/
@ApiModel(description = "A Creditcardclient Object")
public class CreditcardclientResponse {
  
  @SerializedName("pkiCreditcardclientID")
  private Integer pkiCreditcardclientID = null;
  @SerializedName("fkiCreditcarddetailID")
  private Integer fkiCreditcarddetailID = null;
  @SerializedName("bCreditcardclientrelationIsdefault")
  private Boolean bCreditcardclientrelationIsdefault = null;
  @SerializedName("sCreditcardclientDescription")
  private String sCreditcardclientDescription = null;
  @SerializedName("bCreditcardclientIsactive")
  private Boolean bCreditcardclientIsactive = null;
  @SerializedName("bCreditcardclientAllowedagencypayment")
  private Boolean bCreditcardclientAllowedagencypayment = null;
  @SerializedName("bCreditcardclientAllowedroyallepageprotection")
  private Boolean bCreditcardclientAllowedroyallepageprotection = null;
  @SerializedName("bCreditcardclientAllowedtranquillit")
  private Boolean bCreditcardclientAllowedtranquillit = null;
  @SerializedName("objCreditcarddetail")
  private CreditcarddetailResponseCompound objCreditcarddetail = null;

  /**
   * The unique ID of the Creditcardclient
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Creditcardclient")
  public Integer getPkiCreditcardclientID() {
    return pkiCreditcardclientID;
  }
  public void setPkiCreditcardclientID(Integer pkiCreditcardclientID) {
    this.pkiCreditcardclientID = pkiCreditcardclientID;
  }

  /**
   * The unique ID of the Creditcarddetail
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Creditcarddetail")
  public Integer getFkiCreditcarddetailID() {
    return fkiCreditcarddetailID;
  }
  public void setFkiCreditcarddetailID(Integer fkiCreditcarddetailID) {
    this.fkiCreditcarddetailID = fkiCreditcarddetailID;
  }

  /**
   * Whether if it's an relationisdefault
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an relationisdefault")
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
   * Whether the creditcardclient is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the creditcardclient is active or not")
  public Boolean getBCreditcardclientIsactive() {
    return bCreditcardclientIsactive;
  }
  public void setBCreditcardclientIsactive(Boolean bCreditcardclientIsactive) {
    this.bCreditcardclientIsactive = bCreditcardclientIsactive;
  }

  /**
   * Whether if it's an allowedagencypayment
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an allowedagencypayment")
  public Boolean getBCreditcardclientAllowedagencypayment() {
    return bCreditcardclientAllowedagencypayment;
  }
  public void setBCreditcardclientAllowedagencypayment(Boolean bCreditcardclientAllowedagencypayment) {
    this.bCreditcardclientAllowedagencypayment = bCreditcardclientAllowedagencypayment;
  }

  /**
   * Whether if it's an allowedroyallepageprotection
   **/
  @ApiModelProperty(required = true, value = "Whether if it's an allowedroyallepageprotection")
  public Boolean getBCreditcardclientAllowedroyallepageprotection() {
    return bCreditcardclientAllowedroyallepageprotection;
  }
  public void setBCreditcardclientAllowedroyallepageprotection(Boolean bCreditcardclientAllowedroyallepageprotection) {
    this.bCreditcardclientAllowedroyallepageprotection = bCreditcardclientAllowedroyallepageprotection;
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
  public CreditcarddetailResponseCompound getObjCreditcarddetail() {
    return objCreditcarddetail;
  }
  public void setObjCreditcarddetail(CreditcarddetailResponseCompound objCreditcarddetail) {
    this.objCreditcarddetail = objCreditcarddetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientResponse creditcardclientResponse = (CreditcardclientResponse) o;
    return (this.pkiCreditcardclientID == null ? creditcardclientResponse.pkiCreditcardclientID == null : this.pkiCreditcardclientID.equals(creditcardclientResponse.pkiCreditcardclientID)) &&
        (this.fkiCreditcarddetailID == null ? creditcardclientResponse.fkiCreditcarddetailID == null : this.fkiCreditcarddetailID.equals(creditcardclientResponse.fkiCreditcarddetailID)) &&
        (this.bCreditcardclientrelationIsdefault == null ? creditcardclientResponse.bCreditcardclientrelationIsdefault == null : this.bCreditcardclientrelationIsdefault.equals(creditcardclientResponse.bCreditcardclientrelationIsdefault)) &&
        (this.sCreditcardclientDescription == null ? creditcardclientResponse.sCreditcardclientDescription == null : this.sCreditcardclientDescription.equals(creditcardclientResponse.sCreditcardclientDescription)) &&
        (this.bCreditcardclientIsactive == null ? creditcardclientResponse.bCreditcardclientIsactive == null : this.bCreditcardclientIsactive.equals(creditcardclientResponse.bCreditcardclientIsactive)) &&
        (this.bCreditcardclientAllowedagencypayment == null ? creditcardclientResponse.bCreditcardclientAllowedagencypayment == null : this.bCreditcardclientAllowedagencypayment.equals(creditcardclientResponse.bCreditcardclientAllowedagencypayment)) &&
        (this.bCreditcardclientAllowedroyallepageprotection == null ? creditcardclientResponse.bCreditcardclientAllowedroyallepageprotection == null : this.bCreditcardclientAllowedroyallepageprotection.equals(creditcardclientResponse.bCreditcardclientAllowedroyallepageprotection)) &&
        (this.bCreditcardclientAllowedtranquillit == null ? creditcardclientResponse.bCreditcardclientAllowedtranquillit == null : this.bCreditcardclientAllowedtranquillit.equals(creditcardclientResponse.bCreditcardclientAllowedtranquillit)) &&
        (this.objCreditcarddetail == null ? creditcardclientResponse.objCreditcarddetail == null : this.objCreditcarddetail.equals(creditcardclientResponse.objCreditcarddetail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCreditcardclientID == null ? 0: this.pkiCreditcardclientID.hashCode());
    result = 31 * result + (this.fkiCreditcarddetailID == null ? 0: this.fkiCreditcarddetailID.hashCode());
    result = 31 * result + (this.bCreditcardclientrelationIsdefault == null ? 0: this.bCreditcardclientrelationIsdefault.hashCode());
    result = 31 * result + (this.sCreditcardclientDescription == null ? 0: this.sCreditcardclientDescription.hashCode());
    result = 31 * result + (this.bCreditcardclientIsactive == null ? 0: this.bCreditcardclientIsactive.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedagencypayment == null ? 0: this.bCreditcardclientAllowedagencypayment.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedroyallepageprotection == null ? 0: this.bCreditcardclientAllowedroyallepageprotection.hashCode());
    result = 31 * result + (this.bCreditcardclientAllowedtranquillit == null ? 0: this.bCreditcardclientAllowedtranquillit.hashCode());
    result = 31 * result + (this.objCreditcarddetail == null ? 0: this.objCreditcarddetail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientResponse {\n");
    
    sb.append("  pkiCreditcardclientID: ").append(pkiCreditcardclientID).append("\n");
    sb.append("  fkiCreditcarddetailID: ").append(fkiCreditcarddetailID).append("\n");
    sb.append("  bCreditcardclientrelationIsdefault: ").append(bCreditcardclientrelationIsdefault).append("\n");
    sb.append("  sCreditcardclientDescription: ").append(sCreditcardclientDescription).append("\n");
    sb.append("  bCreditcardclientIsactive: ").append(bCreditcardclientIsactive).append("\n");
    sb.append("  bCreditcardclientAllowedagencypayment: ").append(bCreditcardclientAllowedagencypayment).append("\n");
    sb.append("  bCreditcardclientAllowedroyallepageprotection: ").append(bCreditcardclientAllowedroyallepageprotection).append("\n");
    sb.append("  bCreditcardclientAllowedtranquillit: ").append(bCreditcardclientAllowedtranquillit).append("\n");
    sb.append("  objCreditcarddetail: ").append(objCreditcarddetail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}