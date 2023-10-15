/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.LanguageAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/language/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/language/getAutocomplete")
public class LanguageGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objLanguage")
  private List<LanguageAutocompleteElementResponse> aObjLanguage = null;

  /**
   * An array of Language autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Language autocomplete element response.")
  public List<LanguageAutocompleteElementResponse> getAObjLanguage() {
    return aObjLanguage;
  }
  public void setAObjLanguage(List<LanguageAutocompleteElementResponse> aObjLanguage) {
    this.aObjLanguage = aObjLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageGetAutocompleteV2ResponseMPayload languageGetAutocompleteV2ResponseMPayload = (LanguageGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjLanguage == null ? languageGetAutocompleteV2ResponseMPayload.aObjLanguage == null : this.aObjLanguage.equals(languageGetAutocompleteV2ResponseMPayload.aObjLanguage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjLanguage == null ? 0: this.aObjLanguage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjLanguage: ").append(aObjLanguage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}