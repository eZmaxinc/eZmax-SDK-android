/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * A Timezone AutocompleteElement Response
 **/
@ApiModel(description = "A Timezone AutocompleteElement Response")
public class TimezoneAutocompleteElementResponse {
  
  @SerializedName("sTimezoneName")
  private String sTimezoneName = null;
  @SerializedName("pkiTimezoneID")
  private Integer pkiTimezoneID = null;
  @SerializedName("bTimezoneIsactive")
  private Boolean bTimezoneIsactive = null;

  /**
   * The description of the Timezone in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Timezone in the language of the requester")
  public String getSTimezoneName() {
    return sTimezoneName;
  }
  public void setSTimezoneName(String sTimezoneName) {
    this.sTimezoneName = sTimezoneName;
  }

  /**
   * The unique ID of the Timezone
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Timezone")
  public Integer getPkiTimezoneID() {
    return pkiTimezoneID;
  }
  public void setPkiTimezoneID(Integer pkiTimezoneID) {
    this.pkiTimezoneID = pkiTimezoneID;
  }

  /**
   * Whether the Timezone is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Timezone is active or not")
  public Boolean getBTimezoneIsactive() {
    return bTimezoneIsactive;
  }
  public void setBTimezoneIsactive(Boolean bTimezoneIsactive) {
    this.bTimezoneIsactive = bTimezoneIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneAutocompleteElementResponse timezoneAutocompleteElementResponse = (TimezoneAutocompleteElementResponse) o;
    return (this.sTimezoneName == null ? timezoneAutocompleteElementResponse.sTimezoneName == null : this.sTimezoneName.equals(timezoneAutocompleteElementResponse.sTimezoneName)) &&
        (this.pkiTimezoneID == null ? timezoneAutocompleteElementResponse.pkiTimezoneID == null : this.pkiTimezoneID.equals(timezoneAutocompleteElementResponse.pkiTimezoneID)) &&
        (this.bTimezoneIsactive == null ? timezoneAutocompleteElementResponse.bTimezoneIsactive == null : this.bTimezoneIsactive.equals(timezoneAutocompleteElementResponse.bTimezoneIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sTimezoneName == null ? 0: this.sTimezoneName.hashCode());
    result = 31 * result + (this.pkiTimezoneID == null ? 0: this.pkiTimezoneID.hashCode());
    result = 31 * result + (this.bTimezoneIsactive == null ? 0: this.bTimezoneIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneAutocompleteElementResponse {\n");
    
    sb.append("  sTimezoneName: ").append(sTimezoneName).append("\n");
    sb.append("  pkiTimezoneID: ").append(pkiTimezoneID).append("\n");
    sb.append("  bTimezoneIsactive: ").append(bTimezoneIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}