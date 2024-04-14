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
 * A Custom ContactName Object
 **/
@ApiModel(description = "A Custom ContactName Object")
public class CustomContactNameResponse {
  
  @SerializedName("sContactFirstname")
  private String sContactFirstname = null;
  @SerializedName("sContactLastname")
  private String sContactLastname = null;
  @SerializedName("sContactCompany")
  private String sContactCompany = null;

  /**
   * The First name of the contact
   **/
  @ApiModelProperty(value = "The First name of the contact")
  public String getSContactFirstname() {
    return sContactFirstname;
  }
  public void setSContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }

  /**
   * The Last name of the contact
   **/
  @ApiModelProperty(value = "The Last name of the contact")
  public String getSContactLastname() {
    return sContactLastname;
  }
  public void setSContactLastname(String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }

  /**
   * The Company name of the contact
   **/
  @ApiModelProperty(value = "The Company name of the contact")
  public String getSContactCompany() {
    return sContactCompany;
  }
  public void setSContactCompany(String sContactCompany) {
    this.sContactCompany = sContactCompany;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomContactNameResponse customContactNameResponse = (CustomContactNameResponse) o;
    return (this.sContactFirstname == null ? customContactNameResponse.sContactFirstname == null : this.sContactFirstname.equals(customContactNameResponse.sContactFirstname)) &&
        (this.sContactLastname == null ? customContactNameResponse.sContactLastname == null : this.sContactLastname.equals(customContactNameResponse.sContactLastname)) &&
        (this.sContactCompany == null ? customContactNameResponse.sContactCompany == null : this.sContactCompany.equals(customContactNameResponse.sContactCompany));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sContactFirstname == null ? 0: this.sContactFirstname.hashCode());
    result = 31 * result + (this.sContactLastname == null ? 0: this.sContactLastname.hashCode());
    result = 31 * result + (this.sContactCompany == null ? 0: this.sContactCompany.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomContactNameResponse {\n");
    
    sb.append("  sContactFirstname: ").append(sContactFirstname).append("\n");
    sb.append("  sContactLastname: ").append(sContactLastname).append("\n");
    sb.append("  sContactCompany: ").append(sContactCompany).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
