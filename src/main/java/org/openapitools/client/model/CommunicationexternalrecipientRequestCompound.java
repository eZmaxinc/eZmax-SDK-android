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

import org.openapitools.client.model.FieldECommunicationexternalrecipientType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communicationexternalrecipient Object and children
 **/
@ApiModel(description = "A Communicationexternalrecipient Object and children")
public class CommunicationexternalrecipientRequestCompound {
  
  @SerializedName("pkiCommunicationexternalrecipientID")
  private Integer pkiCommunicationexternalrecipientID = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sPhoneE164")
  private String sPhoneE164 = null;
  @SerializedName("eCommunicationexternalrecipientType")
  private FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType = null;
  @SerializedName("sCommunicationexternalrecipientName")
  private String sCommunicationexternalrecipientName = null;

  /**
   * The unique ID of the Communicationexternalrecipient
   **/
  @ApiModelProperty(value = "The unique ID of the Communicationexternalrecipient")
  public Integer getPkiCommunicationexternalrecipientID() {
    return pkiCommunicationexternalrecipientID;
  }
  public void setPkiCommunicationexternalrecipientID(Integer pkiCommunicationexternalrecipientID) {
    this.pkiCommunicationexternalrecipientID = pkiCommunicationexternalrecipientID;
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
   **/
  @ApiModelProperty(value = "")
  public FieldECommunicationexternalrecipientType getECommunicationexternalrecipientType() {
    return eCommunicationexternalrecipientType;
  }
  public void setECommunicationexternalrecipientType(FieldECommunicationexternalrecipientType eCommunicationexternalrecipientType) {
    this.eCommunicationexternalrecipientType = eCommunicationexternalrecipientType;
  }

  /**
   * The name of the Communicationexternalrecipient
   **/
  @ApiModelProperty(value = "The name of the Communicationexternalrecipient")
  public String getSCommunicationexternalrecipientName() {
    return sCommunicationexternalrecipientName;
  }
  public void setSCommunicationexternalrecipientName(String sCommunicationexternalrecipientName) {
    this.sCommunicationexternalrecipientName = sCommunicationexternalrecipientName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationexternalrecipientRequestCompound communicationexternalrecipientRequestCompound = (CommunicationexternalrecipientRequestCompound) o;
    return (this.pkiCommunicationexternalrecipientID == null ? communicationexternalrecipientRequestCompound.pkiCommunicationexternalrecipientID == null : this.pkiCommunicationexternalrecipientID.equals(communicationexternalrecipientRequestCompound.pkiCommunicationexternalrecipientID)) &&
        (this.sEmailAddress == null ? communicationexternalrecipientRequestCompound.sEmailAddress == null : this.sEmailAddress.equals(communicationexternalrecipientRequestCompound.sEmailAddress)) &&
        (this.sPhoneE164 == null ? communicationexternalrecipientRequestCompound.sPhoneE164 == null : this.sPhoneE164.equals(communicationexternalrecipientRequestCompound.sPhoneE164)) &&
        (this.eCommunicationexternalrecipientType == null ? communicationexternalrecipientRequestCompound.eCommunicationexternalrecipientType == null : this.eCommunicationexternalrecipientType.equals(communicationexternalrecipientRequestCompound.eCommunicationexternalrecipientType)) &&
        (this.sCommunicationexternalrecipientName == null ? communicationexternalrecipientRequestCompound.sCommunicationexternalrecipientName == null : this.sCommunicationexternalrecipientName.equals(communicationexternalrecipientRequestCompound.sCommunicationexternalrecipientName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationexternalrecipientID == null ? 0: this.pkiCommunicationexternalrecipientID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sPhoneE164 == null ? 0: this.sPhoneE164.hashCode());
    result = 31 * result + (this.eCommunicationexternalrecipientType == null ? 0: this.eCommunicationexternalrecipientType.hashCode());
    result = 31 * result + (this.sCommunicationexternalrecipientName == null ? 0: this.sCommunicationexternalrecipientName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationexternalrecipientRequestCompound {\n");
    
    sb.append("  pkiCommunicationexternalrecipientID: ").append(pkiCommunicationexternalrecipientID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sPhoneE164: ").append(sPhoneE164).append("\n");
    sb.append("  eCommunicationexternalrecipientType: ").append(eCommunicationexternalrecipientType).append("\n");
    sb.append("  sCommunicationexternalrecipientName: ").append(sCommunicationexternalrecipientName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}