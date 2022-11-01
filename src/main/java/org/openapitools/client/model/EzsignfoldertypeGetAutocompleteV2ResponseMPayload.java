/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignfoldertypeAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/ezsignfoldertype/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/ezsignfoldertype/getAutocomplete")
public class EzsignfoldertypeGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objEzsignfoldertype")
  private List<EzsignfoldertypeAutocompleteElementResponse> aObjEzsignfoldertype = null;

  /**
   * An array of Ezsignfoldertype autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Ezsignfoldertype autocomplete element response.")
  public List<EzsignfoldertypeAutocompleteElementResponse> getAObjEzsignfoldertype() {
    return aObjEzsignfoldertype;
  }
  public void setAObjEzsignfoldertype(List<EzsignfoldertypeAutocompleteElementResponse> aObjEzsignfoldertype) {
    this.aObjEzsignfoldertype = aObjEzsignfoldertype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeGetAutocompleteV2ResponseMPayload ezsignfoldertypeGetAutocompleteV2ResponseMPayload = (EzsignfoldertypeGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjEzsignfoldertype == null ? ezsignfoldertypeGetAutocompleteV2ResponseMPayload.aObjEzsignfoldertype == null : this.aObjEzsignfoldertype.equals(ezsignfoldertypeGetAutocompleteV2ResponseMPayload.aObjEzsignfoldertype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldertype == null ? 0: this.aObjEzsignfoldertype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjEzsignfoldertype: ").append(aObjEzsignfoldertype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
