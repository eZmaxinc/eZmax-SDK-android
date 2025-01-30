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

import org.openapitools.client.model.FieldEPhoneType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Phone Object and children to create a complete structure
 **/
@ApiModel(description = "A Phone Object and children to create a complete structure")
public class PhoneResponseCompound {
  
  @SerializedName("pkiPhoneID")
  private Integer pkiPhoneID = null;
  @SerializedName("fkiPhonetypeID")
  private Integer fkiPhonetypeID = null;
  @SerializedName("ePhoneType")
  private FieldEPhoneType ePhoneType = null;
  @SerializedName("sPhoneE164")
  private String sPhoneE164 = null;
  @SerializedName("sPhoneExtension")
  private String sPhoneExtension = null;
  @SerializedName("bPhoneInternational")
  private Boolean bPhoneInternational = null;

  /**
   * The unique ID of the Phone.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Phone.")
  public Integer getPkiPhoneID() {
    return pkiPhoneID;
  }
  public void setPkiPhoneID(Integer pkiPhoneID) {
    this.pkiPhoneID = pkiPhoneID;
  }

  /**
   * The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|")
  public Integer getFkiPhonetypeID() {
    return fkiPhonetypeID;
  }
  public void setFkiPhonetypeID(Integer fkiPhonetypeID) {
    this.fkiPhonetypeID = fkiPhonetypeID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEPhoneType getEPhoneType() {
    return ePhoneType;
  }
  public void setEPhoneType(FieldEPhoneType ePhoneType) {
    this.ePhoneType = ePhoneType;
  }

  /**
   * A phone number in E.164 Format
   **/
  @ApiModelProperty(value = "A phone number in E.164 Format")
  public String getSPhoneE164() {
    return sPhoneE164;
  }
  public void setSPhoneE164(String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
  }

  /**
   * The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   **/
  @ApiModelProperty(value = "The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers")
  public String getSPhoneExtension() {
    return sPhoneExtension;
  }
  public void setSPhoneExtension(String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }

  /**
   * Indicate the phone number is an international phone number.
   **/
  @ApiModelProperty(value = "Indicate the phone number is an international phone number.")
  public Boolean getBPhoneInternational() {
    return bPhoneInternational;
  }
  public void setBPhoneInternational(Boolean bPhoneInternational) {
    this.bPhoneInternational = bPhoneInternational;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneResponseCompound phoneResponseCompound = (PhoneResponseCompound) o;
    return (this.pkiPhoneID == null ? phoneResponseCompound.pkiPhoneID == null : this.pkiPhoneID.equals(phoneResponseCompound.pkiPhoneID)) &&
        (this.fkiPhonetypeID == null ? phoneResponseCompound.fkiPhonetypeID == null : this.fkiPhonetypeID.equals(phoneResponseCompound.fkiPhonetypeID)) &&
        (this.ePhoneType == null ? phoneResponseCompound.ePhoneType == null : this.ePhoneType.equals(phoneResponseCompound.ePhoneType)) &&
        (this.sPhoneE164 == null ? phoneResponseCompound.sPhoneE164 == null : this.sPhoneE164.equals(phoneResponseCompound.sPhoneE164)) &&
        (this.sPhoneExtension == null ? phoneResponseCompound.sPhoneExtension == null : this.sPhoneExtension.equals(phoneResponseCompound.sPhoneExtension)) &&
        (this.bPhoneInternational == null ? phoneResponseCompound.bPhoneInternational == null : this.bPhoneInternational.equals(phoneResponseCompound.bPhoneInternational));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPhoneID == null ? 0: this.pkiPhoneID.hashCode());
    result = 31 * result + (this.fkiPhonetypeID == null ? 0: this.fkiPhonetypeID.hashCode());
    result = 31 * result + (this.ePhoneType == null ? 0: this.ePhoneType.hashCode());
    result = 31 * result + (this.sPhoneE164 == null ? 0: this.sPhoneE164.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    result = 31 * result + (this.bPhoneInternational == null ? 0: this.bPhoneInternational.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneResponseCompound {\n");
    
    sb.append("  pkiPhoneID: ").append(pkiPhoneID).append("\n");
    sb.append("  fkiPhonetypeID: ").append(fkiPhonetypeID).append("\n");
    sb.append("  ePhoneType: ").append(ePhoneType).append("\n");
    sb.append("  sPhoneE164: ").append(sPhoneE164).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("  bPhoneInternational: ").append(bPhoneInternational).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
