/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.
 *
 * The version of the OpenAPI document: 1.0.30
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
 * A Contactinformations Object
 **/
@ApiModel(description = "A Contactinformations Object")
public class ContactinformationsRequest {
  
  @SerializedName("iAddressDefault")
  private Integer iAddressDefault = null;
  @SerializedName("iPhoneDefault")
  private Integer iPhoneDefault = null;
  @SerializedName("iEmailDefault")
  private Integer iEmailDefault = null;
  @SerializedName("iWebsiteDefault")
  private Integer iWebsiteDefault = null;

  /**
   * The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.
   **/
  @ApiModelProperty(required = true, value = "The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.")
  public Integer getIAddressDefault() {
    return iAddressDefault;
  }
  public void setIAddressDefault(Integer iAddressDefault) {
    this.iAddressDefault = iAddressDefault;
  }

  /**
   * The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.
   **/
  @ApiModelProperty(required = true, value = "The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.")
  public Integer getIPhoneDefault() {
    return iPhoneDefault;
  }
  public void setIPhoneDefault(Integer iPhoneDefault) {
    this.iPhoneDefault = iPhoneDefault;
  }

  /**
   * The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.
   **/
  @ApiModelProperty(required = true, value = "The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.")
  public Integer getIEmailDefault() {
    return iEmailDefault;
  }
  public void setIEmailDefault(Integer iEmailDefault) {
    this.iEmailDefault = iEmailDefault;
  }

  /**
   * The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.
   **/
  @ApiModelProperty(required = true, value = "The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.")
  public Integer getIWebsiteDefault() {
    return iWebsiteDefault;
  }
  public void setIWebsiteDefault(Integer iWebsiteDefault) {
    this.iWebsiteDefault = iWebsiteDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationsRequest contactinformationsRequest = (ContactinformationsRequest) o;
    return (this.iAddressDefault == null ? contactinformationsRequest.iAddressDefault == null : this.iAddressDefault.equals(contactinformationsRequest.iAddressDefault)) &&
        (this.iPhoneDefault == null ? contactinformationsRequest.iPhoneDefault == null : this.iPhoneDefault.equals(contactinformationsRequest.iPhoneDefault)) &&
        (this.iEmailDefault == null ? contactinformationsRequest.iEmailDefault == null : this.iEmailDefault.equals(contactinformationsRequest.iEmailDefault)) &&
        (this.iWebsiteDefault == null ? contactinformationsRequest.iWebsiteDefault == null : this.iWebsiteDefault.equals(contactinformationsRequest.iWebsiteDefault));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iAddressDefault == null ? 0: this.iAddressDefault.hashCode());
    result = 31 * result + (this.iPhoneDefault == null ? 0: this.iPhoneDefault.hashCode());
    result = 31 * result + (this.iEmailDefault == null ? 0: this.iEmailDefault.hashCode());
    result = 31 * result + (this.iWebsiteDefault == null ? 0: this.iWebsiteDefault.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequest {\n");
    
    sb.append("  iAddressDefault: ").append(iAddressDefault).append("\n");
    sb.append("  iPhoneDefault: ").append(iPhoneDefault).append("\n");
    sb.append("  iEmailDefault: ").append(iEmailDefault).append("\n");
    sb.append("  iWebsiteDefault: ").append(iWebsiteDefault).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
