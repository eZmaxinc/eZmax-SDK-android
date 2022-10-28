/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * Request for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign
 **/
@ApiModel(description = "Request for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign")
public class EzsignsignatureSignV1Request {
  
  @SerializedName("sValue")
  private String sValue = null;
  @SerializedName("bIsAutomatic")
  private Boolean bIsAutomatic = null;

  /**
   * The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**
   **/
  @ApiModelProperty(value = "The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**")
  public String getSValue() {
    return sValue;
  }
  public void setSValue(String sValue) {
    this.sValue = sValue;
  }

  /**
   * Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**. 
   **/
  @ApiModelProperty(required = true, value = "Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**. ")
  public Boolean getBIsAutomatic() {
    return bIsAutomatic;
  }
  public void setBIsAutomatic(Boolean bIsAutomatic) {
    this.bIsAutomatic = bIsAutomatic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureSignV1Request ezsignsignatureSignV1Request = (EzsignsignatureSignV1Request) o;
    return (this.sValue == null ? ezsignsignatureSignV1Request.sValue == null : this.sValue.equals(ezsignsignatureSignV1Request.sValue)) &&
        (this.bIsAutomatic == null ? ezsignsignatureSignV1Request.bIsAutomatic == null : this.bIsAutomatic.equals(ezsignsignatureSignV1Request.bIsAutomatic));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sValue == null ? 0: this.sValue.hashCode());
    result = 31 * result + (this.bIsAutomatic == null ? 0: this.bIsAutomatic.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureSignV1Request {\n");
    
    sb.append("  sValue: ").append(sValue).append("\n");
    sb.append("  bIsAutomatic: ").append(bIsAutomatic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
