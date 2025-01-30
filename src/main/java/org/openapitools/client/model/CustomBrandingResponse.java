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
 * A Custom Branding Object
 **/
@ApiModel(description = "A Custom Branding Object")
public class CustomBrandingResponse {
  
  @SerializedName("iBrandingColor")
  private Integer iBrandingColor = null;
  @SerializedName("sBrandingLogointerfaceurl")
  private String sBrandingLogointerfaceurl = null;

  /**
   * The primary color. This is a RGB color converted into integer
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The primary color. This is a RGB color converted into integer")
  public Integer getIBrandingColor() {
    return iBrandingColor;
  }
  public void setIBrandingColor(Integer iBrandingColor) {
    this.iBrandingColor = iBrandingColor;
  }

  /**
   * The url of the picture used as logo in the Branding
   **/
  @ApiModelProperty(required = true, value = "The url of the picture used as logo in the Branding")
  public String getSBrandingLogointerfaceurl() {
    return sBrandingLogointerfaceurl;
  }
  public void setSBrandingLogointerfaceurl(String sBrandingLogointerfaceurl) {
    this.sBrandingLogointerfaceurl = sBrandingLogointerfaceurl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomBrandingResponse customBrandingResponse = (CustomBrandingResponse) o;
    return (this.iBrandingColor == null ? customBrandingResponse.iBrandingColor == null : this.iBrandingColor.equals(customBrandingResponse.iBrandingColor)) &&
        (this.sBrandingLogointerfaceurl == null ? customBrandingResponse.sBrandingLogointerfaceurl == null : this.sBrandingLogointerfaceurl.equals(customBrandingResponse.sBrandingLogointerfaceurl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iBrandingColor == null ? 0: this.iBrandingColor.hashCode());
    result = 31 * result + (this.sBrandingLogointerfaceurl == null ? 0: this.sBrandingLogointerfaceurl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomBrandingResponse {\n");
    
    sb.append("  iBrandingColor: ").append(iBrandingColor).append("\n");
    sb.append("  sBrandingLogointerfaceurl: ").append(sBrandingLogointerfaceurl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
