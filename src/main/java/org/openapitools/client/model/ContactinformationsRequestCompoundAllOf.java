/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

@ApiModel(description = "")
public class ContactinformationsRequestCompoundAllOf {
  
  @SerializedName("a_objAddress")
  private List<AddressRequestCompound> aObjAddress = null;
  @SerializedName("a_objPhone")
  private List<PhoneRequestCompound> aObjPhone = null;
  @SerializedName("a_objEmail")
  private List<EmailRequestCompound> aObjEmail = null;
  @SerializedName("a_objWebsite")
  private List<WebsiteRequestCompound> aObjWebsite = null;

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
    ContactinformationsRequestCompoundAllOf contactinformationsRequestCompoundAllOf = (ContactinformationsRequestCompoundAllOf) o;
    return (this.aObjAddress == null ? contactinformationsRequestCompoundAllOf.aObjAddress == null : this.aObjAddress.equals(contactinformationsRequestCompoundAllOf.aObjAddress)) &&
        (this.aObjPhone == null ? contactinformationsRequestCompoundAllOf.aObjPhone == null : this.aObjPhone.equals(contactinformationsRequestCompoundAllOf.aObjPhone)) &&
        (this.aObjEmail == null ? contactinformationsRequestCompoundAllOf.aObjEmail == null : this.aObjEmail.equals(contactinformationsRequestCompoundAllOf.aObjEmail)) &&
        (this.aObjWebsite == null ? contactinformationsRequestCompoundAllOf.aObjWebsite == null : this.aObjWebsite.equals(contactinformationsRequestCompoundAllOf.aObjWebsite));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjAddress == null ? 0: this.aObjAddress.hashCode());
    result = 31 * result + (this.aObjPhone == null ? 0: this.aObjPhone.hashCode());
    result = 31 * result + (this.aObjEmail == null ? 0: this.aObjEmail.hashCode());
    result = 31 * result + (this.aObjWebsite == null ? 0: this.aObjWebsite.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationsRequestCompoundAllOf {\n");
    
    sb.append("  aObjAddress: ").append(aObjAddress).append("\n");
    sb.append("  aObjPhone: ").append(aObjPhone).append("\n");
    sb.append("  aObjEmail: ").append(aObjEmail).append("\n");
    sb.append("  aObjWebsite: ").append(aObjWebsite).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
