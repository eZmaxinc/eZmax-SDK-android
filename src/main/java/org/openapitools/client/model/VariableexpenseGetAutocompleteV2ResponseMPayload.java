/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.VariableexpenseAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/variableexpense/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/variableexpense/getAutocomplete")
public class VariableexpenseGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objVariableexpense")
  private List<VariableexpenseAutocompleteElementResponse> aObjVariableexpense = null;

  /**
   * An array of Variableexpense autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Variableexpense autocomplete element response.")
  public List<VariableexpenseAutocompleteElementResponse> getAObjVariableexpense() {
    return aObjVariableexpense;
  }
  public void setAObjVariableexpense(List<VariableexpenseAutocompleteElementResponse> aObjVariableexpense) {
    this.aObjVariableexpense = aObjVariableexpense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseGetAutocompleteV2ResponseMPayload variableexpenseGetAutocompleteV2ResponseMPayload = (VariableexpenseGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjVariableexpense == null ? variableexpenseGetAutocompleteV2ResponseMPayload.aObjVariableexpense == null : this.aObjVariableexpense.equals(variableexpenseGetAutocompleteV2ResponseMPayload.aObjVariableexpense));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjVariableexpense == null ? 0: this.aObjVariableexpense.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjVariableexpense: ").append(aObjVariableexpense).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
