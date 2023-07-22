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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Description of the Branding
 **/
@ApiModel(description = "Description of the Branding")
public class MultilingualBrandingDescription {
  
  @SerializedName("sBrandingDescription1")
  private String sBrandingDescription1 = null;
  @SerializedName("sBrandingDescription2")
  private String sBrandingDescription2 = null;

  /**
   * The description of the Branding in French
   **/
  @ApiModelProperty(value = "The description of the Branding in French")
  public String getSBrandingDescription1() {
    return sBrandingDescription1;
  }
  public void setSBrandingDescription1(String sBrandingDescription1) {
    this.sBrandingDescription1 = sBrandingDescription1;
  }

  /**
   * The description of the Branding in English
   **/
  @ApiModelProperty(value = "The description of the Branding in English")
  public String getSBrandingDescription2() {
    return sBrandingDescription2;
  }
  public void setSBrandingDescription2(String sBrandingDescription2) {
    this.sBrandingDescription2 = sBrandingDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualBrandingDescription multilingualBrandingDescription = (MultilingualBrandingDescription) o;
    return (this.sBrandingDescription1 == null ? multilingualBrandingDescription.sBrandingDescription1 == null : this.sBrandingDescription1.equals(multilingualBrandingDescription.sBrandingDescription1)) &&
        (this.sBrandingDescription2 == null ? multilingualBrandingDescription.sBrandingDescription2 == null : this.sBrandingDescription2.equals(multilingualBrandingDescription.sBrandingDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sBrandingDescription1 == null ? 0: this.sBrandingDescription1.hashCode());
    result = 31 * result + (this.sBrandingDescription2 == null ? 0: this.sBrandingDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualBrandingDescription {\n");
    
    sb.append("  sBrandingDescription1: ").append(sBrandingDescription1).append("\n");
    sb.append("  sBrandingDescription2: ").append(sBrandingDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
