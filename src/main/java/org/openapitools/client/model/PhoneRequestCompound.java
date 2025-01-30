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
public class PhoneRequestCompound {
  
  @SerializedName("pkiPhoneID")
  private Integer pkiPhoneID = null;
  @SerializedName("fkiPhonetypeID")
  private Integer fkiPhonetypeID = null;
  @SerializedName("ePhoneType")
  private FieldEPhoneType ePhoneType = null;
  @SerializedName("sPhoneRegion")
  private String sPhoneRegion = null;
  @SerializedName("sPhoneExchange")
  private String sPhoneExchange = null;
  @SerializedName("sPhoneNumber")
  private String sPhoneNumber = null;
  @SerializedName("sPhoneInternational")
  private String sPhoneInternational = null;
  @SerializedName("sPhoneExtension")
  private String sPhoneExtension = null;
  @SerializedName("sPhoneE164")
  private String sPhoneE164 = null;

  /**
   * The unique ID of the Phone.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Phone.")
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
   * The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(value = "The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneRegion() {
    return sPhoneRegion;
  }
  public void setSPhoneRegion(String sPhoneRegion) {
    this.sPhoneRegion = sPhoneRegion;
  }

  /**
   * The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(value = "The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneExchange() {
    return sPhoneExchange;
  }
  public void setSPhoneExchange(String sPhoneExchange) {
    this.sPhoneExchange = sPhoneExchange;
  }

  /**
   * The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
   **/
  @ApiModelProperty(value = "The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123")
  public String getSPhoneNumber() {
    return sPhoneNumber;
  }
  public void setSPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }

  /**
   * The international phone number.
   **/
  @ApiModelProperty(value = "The international phone number.")
  public String getSPhoneInternational() {
    return sPhoneInternational;
  }
  public void setSPhoneInternational(String sPhoneInternational) {
    this.sPhoneInternational = sPhoneInternational;
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
   * A phone number in E.164 Format
   **/
  @ApiModelProperty(value = "A phone number in E.164 Format")
  public String getSPhoneE164() {
    return sPhoneE164;
  }
  public void setSPhoneE164(String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneRequestCompound phoneRequestCompound = (PhoneRequestCompound) o;
    return (this.pkiPhoneID == null ? phoneRequestCompound.pkiPhoneID == null : this.pkiPhoneID.equals(phoneRequestCompound.pkiPhoneID)) &&
        (this.fkiPhonetypeID == null ? phoneRequestCompound.fkiPhonetypeID == null : this.fkiPhonetypeID.equals(phoneRequestCompound.fkiPhonetypeID)) &&
        (this.ePhoneType == null ? phoneRequestCompound.ePhoneType == null : this.ePhoneType.equals(phoneRequestCompound.ePhoneType)) &&
        (this.sPhoneRegion == null ? phoneRequestCompound.sPhoneRegion == null : this.sPhoneRegion.equals(phoneRequestCompound.sPhoneRegion)) &&
        (this.sPhoneExchange == null ? phoneRequestCompound.sPhoneExchange == null : this.sPhoneExchange.equals(phoneRequestCompound.sPhoneExchange)) &&
        (this.sPhoneNumber == null ? phoneRequestCompound.sPhoneNumber == null : this.sPhoneNumber.equals(phoneRequestCompound.sPhoneNumber)) &&
        (this.sPhoneInternational == null ? phoneRequestCompound.sPhoneInternational == null : this.sPhoneInternational.equals(phoneRequestCompound.sPhoneInternational)) &&
        (this.sPhoneExtension == null ? phoneRequestCompound.sPhoneExtension == null : this.sPhoneExtension.equals(phoneRequestCompound.sPhoneExtension)) &&
        (this.sPhoneE164 == null ? phoneRequestCompound.sPhoneE164 == null : this.sPhoneE164.equals(phoneRequestCompound.sPhoneE164));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPhoneID == null ? 0: this.pkiPhoneID.hashCode());
    result = 31 * result + (this.fkiPhonetypeID == null ? 0: this.fkiPhonetypeID.hashCode());
    result = 31 * result + (this.ePhoneType == null ? 0: this.ePhoneType.hashCode());
    result = 31 * result + (this.sPhoneRegion == null ? 0: this.sPhoneRegion.hashCode());
    result = 31 * result + (this.sPhoneExchange == null ? 0: this.sPhoneExchange.hashCode());
    result = 31 * result + (this.sPhoneNumber == null ? 0: this.sPhoneNumber.hashCode());
    result = 31 * result + (this.sPhoneInternational == null ? 0: this.sPhoneInternational.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    result = 31 * result + (this.sPhoneE164 == null ? 0: this.sPhoneE164.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRequestCompound {\n");
    
    sb.append("  pkiPhoneID: ").append(pkiPhoneID).append("\n");
    sb.append("  fkiPhonetypeID: ").append(fkiPhonetypeID).append("\n");
    sb.append("  ePhoneType: ").append(ePhoneType).append("\n");
    sb.append("  sPhoneRegion: ").append(sPhoneRegion).append("\n");
    sb.append("  sPhoneExchange: ").append(sPhoneExchange).append("\n");
    sb.append("  sPhoneNumber: ").append(sPhoneNumber).append("\n");
    sb.append("  sPhoneInternational: ").append(sPhoneInternational).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("  sPhoneE164: ").append(sPhoneE164).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
