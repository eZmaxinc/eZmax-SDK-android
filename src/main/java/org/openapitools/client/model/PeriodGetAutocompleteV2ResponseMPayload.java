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
import org.openapitools.client.model.PeriodAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/period/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/period/getAutocomplete")
public class PeriodGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objPeriod")
  private List<PeriodAutocompleteElementResponse> aObjPeriod = null;

  /**
   * An array of Period autocomplete element response.
   **/
  @ApiModelProperty(value = "An array of Period autocomplete element response.")
  public List<PeriodAutocompleteElementResponse> getAObjPeriod() {
    return aObjPeriod;
  }
  public void setAObjPeriod(List<PeriodAutocompleteElementResponse> aObjPeriod) {
    this.aObjPeriod = aObjPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodGetAutocompleteV2ResponseMPayload periodGetAutocompleteV2ResponseMPayload = (PeriodGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjPeriod == null ? periodGetAutocompleteV2ResponseMPayload.aObjPeriod == null : this.aObjPeriod.equals(periodGetAutocompleteV2ResponseMPayload.aObjPeriod));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjPeriod == null ? 0: this.aObjPeriod.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjPeriod: ").append(aObjPeriod).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
