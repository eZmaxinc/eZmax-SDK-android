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
 * A Creditcarddetail Object
 **/
@ApiModel(description = "A Creditcarddetail Object")
public class CreditcarddetailResponseCompound {
  
  @SerializedName("pkiCreditcarddetailID")
  private Integer pkiCreditcarddetailID = null;
  @SerializedName("fkiCreditcardtypeID")
  private Integer fkiCreditcardtypeID = null;
  @SerializedName("sCreditcarddetailNumbermasked")
  private String sCreditcarddetailNumbermasked = null;
  @SerializedName("iCreditcarddetailExpirationmonth")
  private Integer iCreditcarddetailExpirationmonth = null;
  @SerializedName("iCreditcarddetailExpirationyear")
  private Integer iCreditcarddetailExpirationyear = null;
  @SerializedName("sCreditcarddetailCivic")
  private String sCreditcarddetailCivic = null;
  @SerializedName("sCreditcarddetailStreet")
  private String sCreditcarddetailStreet = null;
  @SerializedName("sCreditcarddetailZip")
  private String sCreditcarddetailZip = null;

  /**
   * The unique ID of the Creditcarddetail
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Creditcarddetail")
  public Integer getPkiCreditcarddetailID() {
    return pkiCreditcarddetailID;
  }
  public void setPkiCreditcarddetailID(Integer pkiCreditcarddetailID) {
    this.pkiCreditcarddetailID = pkiCreditcarddetailID;
  }

  /**
   * The unique ID of the Creditcardtype
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Creditcardtype")
  public Integer getFkiCreditcardtypeID() {
    return fkiCreditcardtypeID;
  }
  public void setFkiCreditcardtypeID(Integer fkiCreditcardtypeID) {
    this.fkiCreditcardtypeID = fkiCreditcardtypeID;
  }

  /**
   * The numbermasked of the Creditcarddetail
   **/
  @ApiModelProperty(required = true, value = "The numbermasked of the Creditcarddetail")
  public String getSCreditcarddetailNumbermasked() {
    return sCreditcarddetailNumbermasked;
  }
  public void setSCreditcarddetailNumbermasked(String sCreditcarddetailNumbermasked) {
    this.sCreditcarddetailNumbermasked = sCreditcarddetailNumbermasked;
  }

  /**
   * The expirationmonth of the Creditcarddetail
   * minimum: 0
   * maximum: 12
   **/
  @ApiModelProperty(required = true, value = "The expirationmonth of the Creditcarddetail")
  public Integer getICreditcarddetailExpirationmonth() {
    return iCreditcarddetailExpirationmonth;
  }
  public void setICreditcarddetailExpirationmonth(Integer iCreditcarddetailExpirationmonth) {
    this.iCreditcarddetailExpirationmonth = iCreditcarddetailExpirationmonth;
  }

  /**
   * The expirationyear of the Creditcarddetail
   * minimum: 0
   * maximum: 2200
   **/
  @ApiModelProperty(required = true, value = "The expirationyear of the Creditcarddetail")
  public Integer getICreditcarddetailExpirationyear() {
    return iCreditcarddetailExpirationyear;
  }
  public void setICreditcarddetailExpirationyear(Integer iCreditcarddetailExpirationyear) {
    this.iCreditcarddetailExpirationyear = iCreditcarddetailExpirationyear;
  }

  /**
   * The civic of the Creditcarddetail
   **/
  @ApiModelProperty(required = true, value = "The civic of the Creditcarddetail")
  public String getSCreditcarddetailCivic() {
    return sCreditcarddetailCivic;
  }
  public void setSCreditcarddetailCivic(String sCreditcarddetailCivic) {
    this.sCreditcarddetailCivic = sCreditcarddetailCivic;
  }

  /**
   * The street of the Creditcarddetail
   **/
  @ApiModelProperty(required = true, value = "The street of the Creditcarddetail")
  public String getSCreditcarddetailStreet() {
    return sCreditcarddetailStreet;
  }
  public void setSCreditcarddetailStreet(String sCreditcarddetailStreet) {
    this.sCreditcarddetailStreet = sCreditcarddetailStreet;
  }

  /**
   * The zip of the Creditcarddetail
   **/
  @ApiModelProperty(required = true, value = "The zip of the Creditcarddetail")
  public String getSCreditcarddetailZip() {
    return sCreditcarddetailZip;
  }
  public void setSCreditcarddetailZip(String sCreditcarddetailZip) {
    this.sCreditcarddetailZip = sCreditcarddetailZip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcarddetailResponseCompound creditcarddetailResponseCompound = (CreditcarddetailResponseCompound) o;
    return (this.pkiCreditcarddetailID == null ? creditcarddetailResponseCompound.pkiCreditcarddetailID == null : this.pkiCreditcarddetailID.equals(creditcarddetailResponseCompound.pkiCreditcarddetailID)) &&
        (this.fkiCreditcardtypeID == null ? creditcarddetailResponseCompound.fkiCreditcardtypeID == null : this.fkiCreditcardtypeID.equals(creditcarddetailResponseCompound.fkiCreditcardtypeID)) &&
        (this.sCreditcarddetailNumbermasked == null ? creditcarddetailResponseCompound.sCreditcarddetailNumbermasked == null : this.sCreditcarddetailNumbermasked.equals(creditcarddetailResponseCompound.sCreditcarddetailNumbermasked)) &&
        (this.iCreditcarddetailExpirationmonth == null ? creditcarddetailResponseCompound.iCreditcarddetailExpirationmonth == null : this.iCreditcarddetailExpirationmonth.equals(creditcarddetailResponseCompound.iCreditcarddetailExpirationmonth)) &&
        (this.iCreditcarddetailExpirationyear == null ? creditcarddetailResponseCompound.iCreditcarddetailExpirationyear == null : this.iCreditcarddetailExpirationyear.equals(creditcarddetailResponseCompound.iCreditcarddetailExpirationyear)) &&
        (this.sCreditcarddetailCivic == null ? creditcarddetailResponseCompound.sCreditcarddetailCivic == null : this.sCreditcarddetailCivic.equals(creditcarddetailResponseCompound.sCreditcarddetailCivic)) &&
        (this.sCreditcarddetailStreet == null ? creditcarddetailResponseCompound.sCreditcarddetailStreet == null : this.sCreditcarddetailStreet.equals(creditcarddetailResponseCompound.sCreditcarddetailStreet)) &&
        (this.sCreditcarddetailZip == null ? creditcarddetailResponseCompound.sCreditcarddetailZip == null : this.sCreditcarddetailZip.equals(creditcarddetailResponseCompound.sCreditcarddetailZip));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCreditcarddetailID == null ? 0: this.pkiCreditcarddetailID.hashCode());
    result = 31 * result + (this.fkiCreditcardtypeID == null ? 0: this.fkiCreditcardtypeID.hashCode());
    result = 31 * result + (this.sCreditcarddetailNumbermasked == null ? 0: this.sCreditcarddetailNumbermasked.hashCode());
    result = 31 * result + (this.iCreditcarddetailExpirationmonth == null ? 0: this.iCreditcarddetailExpirationmonth.hashCode());
    result = 31 * result + (this.iCreditcarddetailExpirationyear == null ? 0: this.iCreditcarddetailExpirationyear.hashCode());
    result = 31 * result + (this.sCreditcarddetailCivic == null ? 0: this.sCreditcarddetailCivic.hashCode());
    result = 31 * result + (this.sCreditcarddetailStreet == null ? 0: this.sCreditcarddetailStreet.hashCode());
    result = 31 * result + (this.sCreditcarddetailZip == null ? 0: this.sCreditcarddetailZip.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcarddetailResponseCompound {\n");
    
    sb.append("  pkiCreditcarddetailID: ").append(pkiCreditcarddetailID).append("\n");
    sb.append("  fkiCreditcardtypeID: ").append(fkiCreditcardtypeID).append("\n");
    sb.append("  sCreditcarddetailNumbermasked: ").append(sCreditcarddetailNumbermasked).append("\n");
    sb.append("  iCreditcarddetailExpirationmonth: ").append(iCreditcarddetailExpirationmonth).append("\n");
    sb.append("  iCreditcarddetailExpirationyear: ").append(iCreditcarddetailExpirationyear).append("\n");
    sb.append("  sCreditcarddetailCivic: ").append(sCreditcarddetailCivic).append("\n");
    sb.append("  sCreditcarddetailStreet: ").append(sCreditcarddetailStreet).append("\n");
    sb.append("  sCreditcarddetailZip: ").append(sCreditcarddetailZip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
