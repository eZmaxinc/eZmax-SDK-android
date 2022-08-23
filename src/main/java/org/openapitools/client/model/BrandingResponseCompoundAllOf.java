/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BrandingResponseCompoundAllOf {
  
  @SerializedName("sBrandingLogourl")
  private String sBrandingLogourl = null;

  /**
   * The url of the picture used as logo in the Branding
   **/
  @ApiModelProperty(value = "The url of the picture used as logo in the Branding")
  public String getSBrandingLogourl() {
    return sBrandingLogourl;
  }
  public void setSBrandingLogourl(String sBrandingLogourl) {
    this.sBrandingLogourl = sBrandingLogourl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingResponseCompoundAllOf brandingResponseCompoundAllOf = (BrandingResponseCompoundAllOf) o;
    return (this.sBrandingLogourl == null ? brandingResponseCompoundAllOf.sBrandingLogourl == null : this.sBrandingLogourl.equals(brandingResponseCompoundAllOf.sBrandingLogourl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sBrandingLogourl == null ? 0: this.sBrandingLogourl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingResponseCompoundAllOf {\n");
    
    sb.append("  sBrandingLogourl: ").append(sBrandingLogourl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
