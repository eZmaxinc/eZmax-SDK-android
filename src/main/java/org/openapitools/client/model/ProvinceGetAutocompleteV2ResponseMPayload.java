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
import org.openapitools.client.model.ProvinceAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/province/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/province/getAutocomplete")
public class ProvinceGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objProvince")
  private List<ProvinceAutocompleteElementResponse> aObjProvince = null;

  /**
   * An array of Province autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Province autocomplete element response.")
  public List<ProvinceAutocompleteElementResponse> getAObjProvince() {
    return aObjProvince;
  }
  public void setAObjProvince(List<ProvinceAutocompleteElementResponse> aObjProvince) {
    this.aObjProvince = aObjProvince;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvinceGetAutocompleteV2ResponseMPayload provinceGetAutocompleteV2ResponseMPayload = (ProvinceGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjProvince == null ? provinceGetAutocompleteV2ResponseMPayload.aObjProvince == null : this.aObjProvince.equals(provinceGetAutocompleteV2ResponseMPayload.aObjProvince));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjProvince == null ? 0: this.aObjProvince.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvinceGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjProvince: ").append(aObjProvince).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
