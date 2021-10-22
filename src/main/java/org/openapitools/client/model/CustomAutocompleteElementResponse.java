/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.OneOfintegerstring;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Generic Autocomplete Response
 **/
@ApiModel(description = "Generic Autocomplete Response")
public class CustomAutocompleteElementResponse {
  
  @SerializedName("sCategory")
  private String sCategory = null;
  @SerializedName("sLabel")
  private String sLabel = null;
  @SerializedName("mValue")
  private OneOfintegerstring mValue = null;

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
  public OneOfintegerstring getMValue() {
    return mValue;
  }
  public void setMValue(OneOfintegerstring mValue) {
    this.mValue = mValue;
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
        (this.mValue == null ? customAutocompleteElementResponse.mValue == null : this.mValue.equals(customAutocompleteElementResponse.mValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCategory == null ? 0: this.sCategory.hashCode());
    result = 31 * result + (this.sLabel == null ? 0: this.sLabel.hashCode());
    result = 31 * result + (this.mValue == null ? 0: this.mValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAutocompleteElementResponse {\n");
    
    sb.append("  sCategory: ").append(sCategory).append("\n");
    sb.append("  sLabel: ").append(sLabel).append("\n");
    sb.append("  mValue: ").append(mValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
