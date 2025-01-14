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
import org.openapitools.client.model.PdfalevelAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/pdfalevel/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/pdfalevel/getAutocomplete")
public class PdfalevelGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objPdfalevel")
  private List<PdfalevelAutocompleteElementResponse> aObjPdfalevel = null;

  /**
   * An array of Pdfalevel autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Pdfalevel autocomplete element response.")
  public List<PdfalevelAutocompleteElementResponse> getAObjPdfalevel() {
    return aObjPdfalevel;
  }
  public void setAObjPdfalevel(List<PdfalevelAutocompleteElementResponse> aObjPdfalevel) {
    this.aObjPdfalevel = aObjPdfalevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfalevelGetAutocompleteV2ResponseMPayload pdfalevelGetAutocompleteV2ResponseMPayload = (PdfalevelGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjPdfalevel == null ? pdfalevelGetAutocompleteV2ResponseMPayload.aObjPdfalevel == null : this.aObjPdfalevel.equals(pdfalevelGetAutocompleteV2ResponseMPayload.aObjPdfalevel));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjPdfalevel == null ? 0: this.aObjPdfalevel.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfalevelGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjPdfalevel: ").append(aObjPdfalevel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
