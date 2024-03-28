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
import org.openapitools.client.model.UsergroupexternalAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/usergroupexternal/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/usergroupexternal/getAutocomplete")
public class UsergroupexternalGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objUsergroupexternal")
  private List<UsergroupexternalAutocompleteElementResponse> aObjUsergroupexternal = null;

  /**
   * An array of Usergroupexternal autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Usergroupexternal autocomplete element response.")
  public List<UsergroupexternalAutocompleteElementResponse> getAObjUsergroupexternal() {
    return aObjUsergroupexternal;
  }
  public void setAObjUsergroupexternal(List<UsergroupexternalAutocompleteElementResponse> aObjUsergroupexternal) {
    this.aObjUsergroupexternal = aObjUsergroupexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupexternalGetAutocompleteV2ResponseMPayload usergroupexternalGetAutocompleteV2ResponseMPayload = (UsergroupexternalGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjUsergroupexternal == null ? usergroupexternalGetAutocompleteV2ResponseMPayload.aObjUsergroupexternal == null : this.aObjUsergroupexternal.equals(usergroupexternalGetAutocompleteV2ResponseMPayload.aObjUsergroupexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroupexternal == null ? 0: this.aObjUsergroupexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupexternalGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjUsergroupexternal: ").append(aObjUsergroupexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
