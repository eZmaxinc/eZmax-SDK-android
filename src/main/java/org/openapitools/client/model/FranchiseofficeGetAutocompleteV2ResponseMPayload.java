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
import org.openapitools.client.model.FranchiseofficeAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/franchiseoffice/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/franchiseoffice/getAutocomplete")
public class FranchiseofficeGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objFranchiseoffice")
  private List<FranchiseofficeAutocompleteElementResponse> aObjFranchiseoffice = null;

  /**
   * An array of Franchiseoffice autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Franchiseoffice autocomplete element response.")
  public List<FranchiseofficeAutocompleteElementResponse> getAObjFranchiseoffice() {
    return aObjFranchiseoffice;
  }
  public void setAObjFranchiseoffice(List<FranchiseofficeAutocompleteElementResponse> aObjFranchiseoffice) {
    this.aObjFranchiseoffice = aObjFranchiseoffice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchiseofficeGetAutocompleteV2ResponseMPayload franchiseofficeGetAutocompleteV2ResponseMPayload = (FranchiseofficeGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjFranchiseoffice == null ? franchiseofficeGetAutocompleteV2ResponseMPayload.aObjFranchiseoffice == null : this.aObjFranchiseoffice.equals(franchiseofficeGetAutocompleteV2ResponseMPayload.aObjFranchiseoffice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjFranchiseoffice == null ? 0: this.aObjFranchiseoffice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchiseofficeGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjFranchiseoffice: ").append(aObjFranchiseoffice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
