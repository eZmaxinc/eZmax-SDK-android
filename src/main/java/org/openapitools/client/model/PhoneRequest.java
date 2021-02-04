/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.28
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
 * A Phone Object
 **/
@ApiModel(description = "A Phone Object")
public class PhoneRequest {
  
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

  /**
   * The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
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
  @ApiModelProperty(required = true, value = "")
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
   * The international phone number. (For phone numbers outside of North)  Do not specify the \"011\" part of the phone number used to dial an international phone number from North America.  For example for this sample phone number \"+442071838750\", you would send \"442071838750\" without the \"+\" sign.
   **/
  @ApiModelProperty(value = "The international phone number. (For phone numbers outside of North)  Do not specify the \"011\" part of the phone number used to dial an international phone number from North America.  For example for this sample phone number \"+442071838750\", you would send \"442071838750\" without the \"+\" sign.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneRequest phoneRequest = (PhoneRequest) o;
    return (this.fkiPhonetypeID == null ? phoneRequest.fkiPhonetypeID == null : this.fkiPhonetypeID.equals(phoneRequest.fkiPhonetypeID)) &&
        (this.ePhoneType == null ? phoneRequest.ePhoneType == null : this.ePhoneType.equals(phoneRequest.ePhoneType)) &&
        (this.sPhoneRegion == null ? phoneRequest.sPhoneRegion == null : this.sPhoneRegion.equals(phoneRequest.sPhoneRegion)) &&
        (this.sPhoneExchange == null ? phoneRequest.sPhoneExchange == null : this.sPhoneExchange.equals(phoneRequest.sPhoneExchange)) &&
        (this.sPhoneNumber == null ? phoneRequest.sPhoneNumber == null : this.sPhoneNumber.equals(phoneRequest.sPhoneNumber)) &&
        (this.sPhoneInternational == null ? phoneRequest.sPhoneInternational == null : this.sPhoneInternational.equals(phoneRequest.sPhoneInternational)) &&
        (this.sPhoneExtension == null ? phoneRequest.sPhoneExtension == null : this.sPhoneExtension.equals(phoneRequest.sPhoneExtension));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiPhonetypeID == null ? 0: this.fkiPhonetypeID.hashCode());
    result = 31 * result + (this.ePhoneType == null ? 0: this.ePhoneType.hashCode());
    result = 31 * result + (this.sPhoneRegion == null ? 0: this.sPhoneRegion.hashCode());
    result = 31 * result + (this.sPhoneExchange == null ? 0: this.sPhoneExchange.hashCode());
    result = 31 * result + (this.sPhoneNumber == null ? 0: this.sPhoneNumber.hashCode());
    result = 31 * result + (this.sPhoneInternational == null ? 0: this.sPhoneInternational.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRequest {\n");
    
    sb.append("  fkiPhonetypeID: ").append(fkiPhonetypeID).append("\n");
    sb.append("  ePhoneType: ").append(ePhoneType).append("\n");
    sb.append("  sPhoneRegion: ").append(sPhoneRegion).append("\n");
    sb.append("  sPhoneExchange: ").append(sPhoneExchange).append("\n");
    sb.append("  sPhoneNumber: ").append(sPhoneNumber).append("\n");
    sb.append("  sPhoneInternational: ").append(sPhoneInternational).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
