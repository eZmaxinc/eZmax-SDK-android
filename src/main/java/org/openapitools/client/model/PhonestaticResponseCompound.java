/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * A Phonestatic Object and children to create a complete structure
 **/
@ApiModel(description = "A Phonestatic Object and children to create a complete structure")
public class PhonestaticResponseCompound {
  
  @SerializedName("pkiPhonestaticID")
  private Integer pkiPhonestaticID = null;
  @SerializedName("sPhonestaticE164")
  private String sPhonestaticE164 = null;
  @SerializedName("sPhonestaticExtension")
  private String sPhonestaticExtension = null;

  /**
   * The unique ID of the Phone.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Phone.")
  public Integer getPkiPhonestaticID() {
    return pkiPhonestaticID;
  }
  public void setPkiPhonestaticID(Integer pkiPhonestaticID) {
    this.pkiPhonestaticID = pkiPhonestaticID;
  }

  /**
   * A phone number in E.164 Format
   **/
  @ApiModelProperty(value = "A phone number in E.164 Format")
  public String getSPhonestaticE164() {
    return sPhonestaticE164;
  }
  public void setSPhonestaticE164(String sPhonestaticE164) {
    this.sPhonestaticE164 = sPhonestaticE164;
  }

  /**
   * The extension of the phone number.
   **/
  @ApiModelProperty(value = "The extension of the phone number.")
  public String getSPhonestaticExtension() {
    return sPhonestaticExtension;
  }
  public void setSPhonestaticExtension(String sPhonestaticExtension) {
    this.sPhonestaticExtension = sPhonestaticExtension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonestaticResponseCompound phonestaticResponseCompound = (PhonestaticResponseCompound) o;
    return (this.pkiPhonestaticID == null ? phonestaticResponseCompound.pkiPhonestaticID == null : this.pkiPhonestaticID.equals(phonestaticResponseCompound.pkiPhonestaticID)) &&
        (this.sPhonestaticE164 == null ? phonestaticResponseCompound.sPhonestaticE164 == null : this.sPhonestaticE164.equals(phonestaticResponseCompound.sPhonestaticE164)) &&
        (this.sPhonestaticExtension == null ? phonestaticResponseCompound.sPhonestaticExtension == null : this.sPhonestaticExtension.equals(phonestaticResponseCompound.sPhonestaticExtension));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPhonestaticID == null ? 0: this.pkiPhonestaticID.hashCode());
    result = 31 * result + (this.sPhonestaticE164 == null ? 0: this.sPhonestaticE164.hashCode());
    result = 31 * result + (this.sPhonestaticExtension == null ? 0: this.sPhonestaticExtension.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonestaticResponseCompound {\n");
    
    sb.append("  pkiPhonestaticID: ").append(pkiPhonestaticID).append("\n");
    sb.append("  sPhonestaticE164: ").append(sPhonestaticE164).append("\n");
    sb.append("  sPhonestaticExtension: ").append(sPhonestaticExtension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
