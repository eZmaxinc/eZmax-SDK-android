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
import org.openapitools.client.model.EzmaxproductAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/ezmaxproduct/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/ezmaxproduct/getAutocomplete")
public class EzmaxproductGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objEzmaxproduct")
  private List<EzmaxproductAutocompleteElementResponse> aObjEzmaxproduct = null;

  /**
   * An array of Ezmaxproduct autocomplete element response.
   **/
  @ApiModelProperty(value = "An array of Ezmaxproduct autocomplete element response.")
  public List<EzmaxproductAutocompleteElementResponse> getAObjEzmaxproduct() {
    return aObjEzmaxproduct;
  }
  public void setAObjEzmaxproduct(List<EzmaxproductAutocompleteElementResponse> aObjEzmaxproduct) {
    this.aObjEzmaxproduct = aObjEzmaxproduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxproductGetAutocompleteV2ResponseMPayload ezmaxproductGetAutocompleteV2ResponseMPayload = (EzmaxproductGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjEzmaxproduct == null ? ezmaxproductGetAutocompleteV2ResponseMPayload.aObjEzmaxproduct == null : this.aObjEzmaxproduct.equals(ezmaxproductGetAutocompleteV2ResponseMPayload.aObjEzmaxproduct));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzmaxproduct == null ? 0: this.aObjEzmaxproduct.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxproductGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjEzmaxproduct: ").append(aObjEzmaxproduct).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}