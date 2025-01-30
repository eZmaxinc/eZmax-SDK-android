/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * The description of the Ezsignsigningreason
 **/
@ApiModel(description = "The description of the Ezsignsigningreason")
public class MultilingualEzsignsigningreasonDescription {
  
  @SerializedName("sEzsignsigningreasonDescription1")
  private String sEzsignsigningreasonDescription1 = null;
  @SerializedName("sEzsignsigningreasonDescription2")
  private String sEzsignsigningreasonDescription2 = null;

  /**
   * The description of the Ezsignsigningreason in French
   **/
  @ApiModelProperty(value = "The description of the Ezsignsigningreason in French")
  public String getSEzsignsigningreasonDescription1() {
    return sEzsignsigningreasonDescription1;
  }
  public void setSEzsignsigningreasonDescription1(String sEzsignsigningreasonDescription1) {
    this.sEzsignsigningreasonDescription1 = sEzsignsigningreasonDescription1;
  }

  /**
   * The description of the Ezsignsigningreason in English
   **/
  @ApiModelProperty(value = "The description of the Ezsignsigningreason in English")
  public String getSEzsignsigningreasonDescription2() {
    return sEzsignsigningreasonDescription2;
  }
  public void setSEzsignsigningreasonDescription2(String sEzsignsigningreasonDescription2) {
    this.sEzsignsigningreasonDescription2 = sEzsignsigningreasonDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualEzsignsigningreasonDescription multilingualEzsignsigningreasonDescription = (MultilingualEzsignsigningreasonDescription) o;
    return (this.sEzsignsigningreasonDescription1 == null ? multilingualEzsignsigningreasonDescription.sEzsignsigningreasonDescription1 == null : this.sEzsignsigningreasonDescription1.equals(multilingualEzsignsigningreasonDescription.sEzsignsigningreasonDescription1)) &&
        (this.sEzsignsigningreasonDescription2 == null ? multilingualEzsignsigningreasonDescription.sEzsignsigningreasonDescription2 == null : this.sEzsignsigningreasonDescription2.equals(multilingualEzsignsigningreasonDescription.sEzsignsigningreasonDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsignsigningreasonDescription1 == null ? 0: this.sEzsignsigningreasonDescription1.hashCode());
    result = 31 * result + (this.sEzsignsigningreasonDescription2 == null ? 0: this.sEzsignsigningreasonDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualEzsignsigningreasonDescription {\n");
    
    sb.append("  sEzsignsigningreasonDescription1: ").append(sEzsignsigningreasonDescription1).append("\n");
    sb.append("  sEzsignsigningreasonDescription2: ").append(sEzsignsigningreasonDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
