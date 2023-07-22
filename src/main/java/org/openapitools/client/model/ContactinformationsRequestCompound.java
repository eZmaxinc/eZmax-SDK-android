/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AddressRequestCompound;
import org.openapitools.client.model.EmailRequestCompound;
import org.openapitools.client.model.PhoneRequestCompound;
import org.openapitools.client.model.WebsiteRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Contactinformations Object and children to create a complete structure
 **/
@ApiModel(description = "A Contactinformations Object and children to create a complete structure")
public class ContactinformationsRequestCompound {
  
  @SerializedName("iAddressDefault")
  private Integer iAddressDefault = null;
  @SerializedName("iPhoneDefault")
  private Integer iPhoneDefault = null;
  @SerializedName("iEmailDefault")
  private Integer iEmailDefault = null;
  @SerializedName("iWebsiteDefault")
  private Integer iWebsiteDefault = null;
  @SerializedName("a_objAddress")
  private List<AddressRequestCompound> aObjAddress = null;
  @SerializedName("a_objPhone")
  private List<PhoneRequestCompound> aObjPhone = null;
  @SerializedName("a_objEmail")
  private List<EmailRequestCompound> aObjEmail = null;
  @SerializedName("a_objWebsite")
  private List<WebsiteRequestCompound> aObjWebsite = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<AddressRequestCompound> getAObjAddress() {
    return aObjAddress;
  }
  public void setAObjAddress(List<AddressRequestCompound> aObjAddress) {
    this.aObjAddress = aObjAddress;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PhoneRequestCompound> getAObjPhone() {
    return aObjPhone;
  }
  public void setAObjPhone(List<PhoneRequestCompound> aObjPhone) {
    this.aObjPhone = aObjPhone;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EmailRequestCompound> getAObjEmail() {
    return aObjEmail;
  }
  public void setAObjEmail(List<EmailRequestCompound> aObjEmail) {
    this.aObjEmail = aObjEmail;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<WebsiteRequestCompound> getAObjWebsite() {
    return aObjWebsite;
  }
  public void setAObjWebsite(List<WebsiteRequestCompound> aObjWebsite) {
    this.aObjWebsite = aObjWebsite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationsRequestCompound contactinformationsRequestCompound = (ContactinformationsRequestCompound) o;
    return (this.iAddressDefault == null ? contactinformationsRequestCompound.iAddressDefault == null : this.iAddressDefault.equals(contactinformationsRequestCompound.iAddressDefault)) &&
        (this.iPhoneDefault == null ? contactinformationsRequestCompound.iPhoneDefault == null : this.iPhoneDefault.equals(contactinformationsRequestCompound.iPhoneDefault)) &&
        (this.iEmailDefault == null ? contactinformationsRequestCompound.iEmailDefault == null : this.iEmailDefault.equals(contactinformationsRequestCompound.iEmailDefault)) &&
        (this.iWebsiteDefault == null ? contactinformationsRequestCompound.iWebsiteDefault == null : this.iWebsiteDefault.equals(contactinformationsRequestCompound.iWebsiteDefault)) &&
        (this.aObjAddress == null ? contactinformationsRequestCompound.aObjAddress == null : this.aObjAddress.equals(contactinformationsRequestCompound.aObjAddress)) &&
        (this.aObjPhone == null ? contactinformationsRequestCompound.aObjPhone == null : this.aObjPhone.equals(contactinformationsRequestCompound.aObjPhone)) &&
        (this.aObjEmail == null ? contactinformationsRequestCompound.aObjEmail == null : this.aObjEmail.equals(contactinformationsRequestCompound.aObjEmail)) &&
        (this.aObjWebsite == null ? contactinformationsRequestCompound.aObjWebsite == null : this.aObjWebsite.equals(contactinformationsRequestCompound.aObjWebsite));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iAddressDefault == null ? 0: this.iAddressDefault.hashCode());
    result = 31 * result + (this.iPhoneDefault == null ? 0: this.iPhoneDefault.hashCode());
    result = 31 * result + (this.iEmailDefault == null ? 0: this.iEmailDefault.hashCode());
    result = 31 * result + (this.iWebsiteDefault == null ? 0: this.iWebsiteDefault.hashCode());
    result = 31 * result + (this.aObjAddress == null ? 0: this.aObjAddress.hashCode());
    result = 31 * result + (this.aObjPhone == null ? 0: this.aObjPhone.hashCode());
    result = 31 * result + (this.aObjEmail == null ? 0: this.aObjEmail.hashCode());
    result = 31 * result + (this.aObjWebsite == null ? 0: this.aObjWebsite.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequestCompound {\n");
    
    sb.append("  iAddressDefault: ").append(iAddressDefault).append("\n");
    sb.append("  iPhoneDefault: ").append(iPhoneDefault).append("\n");
    sb.append("  iEmailDefault: ").append(iEmailDefault).append("\n");
    sb.append("  iWebsiteDefault: ").append(iWebsiteDefault).append("\n");
    sb.append("  aObjAddress: ").append(aObjAddress).append("\n");
    sb.append("  aObjPhone: ").append(aObjPhone).append("\n");
    sb.append("  aObjEmail: ").append(aObjEmail).append("\n");
    sb.append("  aObjWebsite: ").append(aObjWebsite).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
