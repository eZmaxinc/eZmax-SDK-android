/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * Generic DropdownElement Response
 **/
@ApiModel(description = "Generic DropdownElement Response")
public class CustomDropdownElementResponse {
  
  @SerializedName("sLabel")
  private String sLabel = null;
  @SerializedName("sValue")
  private String sValue = null;

  /**
   * The Description of the element
   **/
  @ApiModelProperty(required = true, value = "The Description of the element")
  public String getSLabel() {
    return sLabel;
  }
  public void setSLabel(String sLabel) {
    this.sLabel = sLabel;
  }

  /**
   * The Value of the element
   **/
  @ApiModelProperty(required = true, value = "The Value of the element")
  public String getSValue() {
    return sValue;
  }
  public void setSValue(String sValue) {
    this.sValue = sValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDropdownElementResponse customDropdownElementResponse = (CustomDropdownElementResponse) o;
    return (this.sLabel == null ? customDropdownElementResponse.sLabel == null : this.sLabel.equals(customDropdownElementResponse.sLabel)) &&
        (this.sValue == null ? customDropdownElementResponse.sValue == null : this.sValue.equals(customDropdownElementResponse.sValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sLabel == null ? 0: this.sLabel.hashCode());
    result = 31 * result + (this.sValue == null ? 0: this.sValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDropdownElementResponse {\n");
    
    sb.append("  sLabel: ").append(sLabel).append("\n");
    sb.append("  sValue: ").append(sValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
