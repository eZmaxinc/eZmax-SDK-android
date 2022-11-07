/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
 * Generic AutocompleteElement Response
 **/
@ApiModel(description = "Generic AutocompleteElement Response")
public class CustomAutocompleteElementResponse {
  
  @SerializedName("sCategory")
  private String sCategory = null;
  @SerializedName("sLabel")
  private String sLabel = null;
  @SerializedName("sValue")
  private String sValue = null;
  @SerializedName("mValue")
  private String mValue = null;
  @SerializedName("bActive")
  private Boolean bActive = null;

  /**
   * The Category for the dropdown or an empty string if not categorized
   **/
  @ApiModelProperty(required = true, value = "The Category for the dropdown or an empty string if not categorized")
  public String getSCategory() {
    return sCategory;
  }
  public void setSCategory(String sCategory) {
    this.sCategory = sCategory;
  }

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
   * The Unique ID of the element
   **/
  @ApiModelProperty(required = true, value = "The Unique ID of the element")
  public String getSValue() {
    return sValue;
  }
  public void setSValue(String sValue) {
    this.sValue = sValue;
  }

  /**
   * The Unique ID of the element
   **/
  @ApiModelProperty(value = "The Unique ID of the element")
  public String getMValue() {
    return mValue;
  }
  public void setMValue(String mValue) {
    this.mValue = mValue;
  }

  /**
   * Indicates if the element is active
   **/
  @ApiModelProperty(required = true, value = "Indicates if the element is active")
  public Boolean getBActive() {
    return bActive;
  }
  public void setBActive(Boolean bActive) {
    this.bActive = bActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAutocompleteElementResponse customAutocompleteElementResponse = (CustomAutocompleteElementResponse) o;
    return (this.sCategory == null ? customAutocompleteElementResponse.sCategory == null : this.sCategory.equals(customAutocompleteElementResponse.sCategory)) &&
        (this.sLabel == null ? customAutocompleteElementResponse.sLabel == null : this.sLabel.equals(customAutocompleteElementResponse.sLabel)) &&
        (this.sValue == null ? customAutocompleteElementResponse.sValue == null : this.sValue.equals(customAutocompleteElementResponse.sValue)) &&
        (this.mValue == null ? customAutocompleteElementResponse.mValue == null : this.mValue.equals(customAutocompleteElementResponse.mValue)) &&
        (this.bActive == null ? customAutocompleteElementResponse.bActive == null : this.bActive.equals(customAutocompleteElementResponse.bActive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCategory == null ? 0: this.sCategory.hashCode());
    result = 31 * result + (this.sLabel == null ? 0: this.sLabel.hashCode());
    result = 31 * result + (this.sValue == null ? 0: this.sValue.hashCode());
    result = 31 * result + (this.mValue == null ? 0: this.mValue.hashCode());
    result = 31 * result + (this.bActive == null ? 0: this.bActive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAutocompleteElementResponse {\n");
    
    sb.append("  sCategory: ").append(sCategory).append("\n");
    sb.append("  sLabel: ").append(sLabel).append("\n");
    sb.append("  sValue: ").append(sValue).append("\n");
    sb.append("  mValue: ").append(mValue).append("\n");
    sb.append("  bActive: ").append(bActive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
