/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.32
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
 * Description of the API Key  
 **/
@ApiModel(description = "Description of the API Key  ")
public class MultilingualApikeyDescription {
  
  @SerializedName("sApikeyDescription1")
  private String sApikeyDescription1 = null;
  @SerializedName("sApikeyDescription2")
  private String sApikeyDescription2 = null;

  /**
   * Value in French
   **/
  @ApiModelProperty(value = "Value in French")
  public String getSApikeyDescription1() {
    return sApikeyDescription1;
  }
  public void setSApikeyDescription1(String sApikeyDescription1) {
    this.sApikeyDescription1 = sApikeyDescription1;
  }

  /**
   * Value in English
   **/
  @ApiModelProperty(value = "Value in English")
  public String getSApikeyDescription2() {
    return sApikeyDescription2;
  }
  public void setSApikeyDescription2(String sApikeyDescription2) {
    this.sApikeyDescription2 = sApikeyDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualApikeyDescription multilingualApikeyDescription = (MultilingualApikeyDescription) o;
    return (this.sApikeyDescription1 == null ? multilingualApikeyDescription.sApikeyDescription1 == null : this.sApikeyDescription1.equals(multilingualApikeyDescription.sApikeyDescription1)) &&
        (this.sApikeyDescription2 == null ? multilingualApikeyDescription.sApikeyDescription2 == null : this.sApikeyDescription2.equals(multilingualApikeyDescription.sApikeyDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sApikeyDescription1 == null ? 0: this.sApikeyDescription1.hashCode());
    result = 31 * result + (this.sApikeyDescription2 == null ? 0: this.sApikeyDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualApikeyDescription {\n");
    
    sb.append("  sApikeyDescription1: ").append(sApikeyDescription1).append("\n");
    sb.append("  sApikeyDescription2: ").append(sApikeyDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
