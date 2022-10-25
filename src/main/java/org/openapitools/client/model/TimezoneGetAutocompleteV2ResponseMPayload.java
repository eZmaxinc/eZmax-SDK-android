/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.TimezoneAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/timezone/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/timezone/getAutocomplete")
public class TimezoneGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objTimezone")
  private List<TimezoneAutocompleteElementResponse> aObjTimezone = null;

  /**
   * An array of Timezone autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Timezone autocomplete element response.")
  public List<TimezoneAutocompleteElementResponse> getAObjTimezone() {
    return aObjTimezone;
  }
  public void setAObjTimezone(List<TimezoneAutocompleteElementResponse> aObjTimezone) {
    this.aObjTimezone = aObjTimezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneGetAutocompleteV2ResponseMPayload timezoneGetAutocompleteV2ResponseMPayload = (TimezoneGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjTimezone == null ? timezoneGetAutocompleteV2ResponseMPayload.aObjTimezone == null : this.aObjTimezone.equals(timezoneGetAutocompleteV2ResponseMPayload.aObjTimezone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjTimezone == null ? 0: this.aObjTimezone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjTimezone: ").append(aObjTimezone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
