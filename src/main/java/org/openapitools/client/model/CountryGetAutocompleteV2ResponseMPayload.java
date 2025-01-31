/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CountryAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/country/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/country/getAutocomplete")
public class CountryGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objCountry")
  private List<CountryAutocompleteElementResponse> aObjCountry = null;

  /**
   * An array of Country autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Country autocomplete element response.")
  public List<CountryAutocompleteElementResponse> getAObjCountry() {
    return aObjCountry;
  }
  public void setAObjCountry(List<CountryAutocompleteElementResponse> aObjCountry) {
    this.aObjCountry = aObjCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryGetAutocompleteV2ResponseMPayload countryGetAutocompleteV2ResponseMPayload = (CountryGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjCountry == null ? countryGetAutocompleteV2ResponseMPayload.aObjCountry == null : this.aObjCountry.equals(countryGetAutocompleteV2ResponseMPayload.aObjCountry));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCountry == null ? 0: this.aObjCountry.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjCountry: ").append(aObjCountry).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
