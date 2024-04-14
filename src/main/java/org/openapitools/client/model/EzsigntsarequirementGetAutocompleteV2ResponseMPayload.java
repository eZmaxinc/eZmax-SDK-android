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
import org.openapitools.client.model.EzsigntsarequirementAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/ezsigntsarequirement/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/ezsigntsarequirement/getAutocomplete")
public class EzsigntsarequirementGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objEzsigntsarequirement")
  private List<EzsigntsarequirementAutocompleteElementResponse> aObjEzsigntsarequirement = null;

  /**
   * An array of Ezsigntsarequirement autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Ezsigntsarequirement autocomplete element response.")
  public List<EzsigntsarequirementAutocompleteElementResponse> getAObjEzsigntsarequirement() {
    return aObjEzsigntsarequirement;
  }
  public void setAObjEzsigntsarequirement(List<EzsigntsarequirementAutocompleteElementResponse> aObjEzsigntsarequirement) {
    this.aObjEzsigntsarequirement = aObjEzsigntsarequirement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntsarequirementGetAutocompleteV2ResponseMPayload ezsigntsarequirementGetAutocompleteV2ResponseMPayload = (EzsigntsarequirementGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjEzsigntsarequirement == null ? ezsigntsarequirementGetAutocompleteV2ResponseMPayload.aObjEzsigntsarequirement == null : this.aObjEzsigntsarequirement.equals(ezsigntsarequirementGetAutocompleteV2ResponseMPayload.aObjEzsigntsarequirement));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntsarequirement == null ? 0: this.aObjEzsigntsarequirement.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntsarequirementGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjEzsigntsarequirement: ").append(aObjEzsigntsarequirement).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
