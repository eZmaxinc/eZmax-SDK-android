/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.FontAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/font/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/font/getAutocomplete")
public class FontGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objFont")
  private List<FontAutocompleteElementResponse> aObjFont = null;

  /**
   * An array of Font autocomplete element response.
   **/
  @ApiModelProperty(value = "An array of Font autocomplete element response.")
  public List<FontAutocompleteElementResponse> getAObjFont() {
    return aObjFont;
  }
  public void setAObjFont(List<FontAutocompleteElementResponse> aObjFont) {
    this.aObjFont = aObjFont;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontGetAutocompleteV2ResponseMPayload fontGetAutocompleteV2ResponseMPayload = (FontGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjFont == null ? fontGetAutocompleteV2ResponseMPayload.aObjFont == null : this.aObjFont.equals(fontGetAutocompleteV2ResponseMPayload.aObjFont));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjFont == null ? 0: this.aObjFont.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjFont: ").append(aObjFont).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}