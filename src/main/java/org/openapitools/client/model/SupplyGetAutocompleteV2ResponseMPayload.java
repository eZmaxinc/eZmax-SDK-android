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
import org.openapitools.client.model.SupplyAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/supply/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/supply/getAutocomplete")
public class SupplyGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objSupply")
  private List<SupplyAutocompleteElementResponse> aObjSupply = null;

  /**
   * An array of Supply autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Supply autocomplete element response.")
  public List<SupplyAutocompleteElementResponse> getAObjSupply() {
    return aObjSupply;
  }
  public void setAObjSupply(List<SupplyAutocompleteElementResponse> aObjSupply) {
    this.aObjSupply = aObjSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplyGetAutocompleteV2ResponseMPayload supplyGetAutocompleteV2ResponseMPayload = (SupplyGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjSupply == null ? supplyGetAutocompleteV2ResponseMPayload.aObjSupply == null : this.aObjSupply.equals(supplyGetAutocompleteV2ResponseMPayload.aObjSupply));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjSupply == null ? 0: this.aObjSupply.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplyGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjSupply: ").append(aObjSupply).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
