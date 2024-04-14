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
import org.openapitools.client.model.ModuleAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/module/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/module/getAutocomplete")
public class ModuleGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objModule")
  private List<ModuleAutocompleteElementResponse> aObjModule = null;

  /**
   * An array of Module autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Module autocomplete element response.")
  public List<ModuleAutocompleteElementResponse> getAObjModule() {
    return aObjModule;
  }
  public void setAObjModule(List<ModuleAutocompleteElementResponse> aObjModule) {
    this.aObjModule = aObjModule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleGetAutocompleteV2ResponseMPayload moduleGetAutocompleteV2ResponseMPayload = (ModuleGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjModule == null ? moduleGetAutocompleteV2ResponseMPayload.aObjModule == null : this.aObjModule.equals(moduleGetAutocompleteV2ResponseMPayload.aObjModule));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjModule == null ? 0: this.aObjModule.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjModule: ").append(aObjModule).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
