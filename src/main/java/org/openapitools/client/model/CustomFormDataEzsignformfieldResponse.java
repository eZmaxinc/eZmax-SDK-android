/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * An Ezsignformfield Object
 **/
@ApiModel(description = "An Ezsignformfield Object")
public class CustomFormDataEzsignformfieldResponse {
  
  @SerializedName("sEzsignformfieldLabel")
  private String sEzsignformfieldLabel = null;
  @SerializedName("sEzsignformfieldValue")
  private String sEzsignformfieldValue = null;

  /**
   * The Label for the Ezsignformfield
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsignformfield")
  public String getSEzsignformfieldLabel() {
    return sEzsignformfieldLabel;
  }
  public void setSEzsignformfieldLabel(String sEzsignformfieldLabel) {
    this.sEzsignformfieldLabel = sEzsignformfieldLabel;
  }

  /**
   * The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio
   **/
  @ApiModelProperty(required = true, value = "The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio")
  public String getSEzsignformfieldValue() {
    return sEzsignformfieldValue;
  }
  public void setSEzsignformfieldValue(String sEzsignformfieldValue) {
    this.sEzsignformfieldValue = sEzsignformfieldValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormDataEzsignformfieldResponse customFormDataEzsignformfieldResponse = (CustomFormDataEzsignformfieldResponse) o;
    return (this.sEzsignformfieldLabel == null ? customFormDataEzsignformfieldResponse.sEzsignformfieldLabel == null : this.sEzsignformfieldLabel.equals(customFormDataEzsignformfieldResponse.sEzsignformfieldLabel)) &&
        (this.sEzsignformfieldValue == null ? customFormDataEzsignformfieldResponse.sEzsignformfieldValue == null : this.sEzsignformfieldValue.equals(customFormDataEzsignformfieldResponse.sEzsignformfieldValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsignformfieldLabel == null ? 0: this.sEzsignformfieldLabel.hashCode());
    result = 31 * result + (this.sEzsignformfieldValue == null ? 0: this.sEzsignformfieldValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormDataEzsignformfieldResponse {\n");
    
    sb.append("  sEzsignformfieldLabel: ").append(sEzsignformfieldLabel).append("\n");
    sb.append("  sEzsignformfieldValue: ").append(sEzsignformfieldValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
