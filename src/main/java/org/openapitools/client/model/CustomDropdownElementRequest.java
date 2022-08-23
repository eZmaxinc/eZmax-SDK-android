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

/**
 * Generic DropdownElement Request
 **/
@ApiModel(description = "Generic DropdownElement Request")
public class CustomDropdownElementRequest {
  
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
    CustomDropdownElementRequest customDropdownElementRequest = (CustomDropdownElementRequest) o;
    return (this.sLabel == null ? customDropdownElementRequest.sLabel == null : this.sLabel.equals(customDropdownElementRequest.sLabel)) &&
        (this.sValue == null ? customDropdownElementRequest.sValue == null : this.sValue.equals(customDropdownElementRequest.sValue));
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
    sb.append("class CustomDropdownElementRequest {\n");
    
    sb.append("  sLabel: ").append(sLabel).append("\n");
    sb.append("  sValue: ").append(sValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
