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
import org.openapitools.client.model.FranchisebrokerAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/franchisebroker/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/franchisebroker/getAutocomplete")
public class FranchisebrokerGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objFranchisebroker")
  private List<FranchisebrokerAutocompleteElementResponse> aObjFranchisebroker = null;

  /**
   * An array of Franchisebroker autocomplete element response.
   **/
  @ApiModelProperty(value = "An array of Franchisebroker autocomplete element response.")
  public List<FranchisebrokerAutocompleteElementResponse> getAObjFranchisebroker() {
    return aObjFranchisebroker;
  }
  public void setAObjFranchisebroker(List<FranchisebrokerAutocompleteElementResponse> aObjFranchisebroker) {
    this.aObjFranchisebroker = aObjFranchisebroker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisebrokerGetAutocompleteV2ResponseMPayload franchisebrokerGetAutocompleteV2ResponseMPayload = (FranchisebrokerGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjFranchisebroker == null ? franchisebrokerGetAutocompleteV2ResponseMPayload.aObjFranchisebroker == null : this.aObjFranchisebroker.equals(franchisebrokerGetAutocompleteV2ResponseMPayload.aObjFranchisebroker));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjFranchisebroker == null ? 0: this.aObjFranchisebroker.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisebrokerGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjFranchisebroker: ").append(aObjFranchisebroker).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
