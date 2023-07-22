/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.TaxassignmentAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/taxassignment/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/taxassignment/getAutocomplete")
public class TaxassignmentGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objTaxassignment")
  private List<TaxassignmentAutocompleteElementResponse> aObjTaxassignment = null;

  /**
   * An array of Taxassignment autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Taxassignment autocomplete element response.")
  public List<TaxassignmentAutocompleteElementResponse> getAObjTaxassignment() {
    return aObjTaxassignment;
  }
  public void setAObjTaxassignment(List<TaxassignmentAutocompleteElementResponse> aObjTaxassignment) {
    this.aObjTaxassignment = aObjTaxassignment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxassignmentGetAutocompleteV2ResponseMPayload taxassignmentGetAutocompleteV2ResponseMPayload = (TaxassignmentGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjTaxassignment == null ? taxassignmentGetAutocompleteV2ResponseMPayload.aObjTaxassignment == null : this.aObjTaxassignment.equals(taxassignmentGetAutocompleteV2ResponseMPayload.aObjTaxassignment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjTaxassignment == null ? 0: this.aObjTaxassignment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxassignmentGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjTaxassignment: ").append(aObjTaxassignment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
