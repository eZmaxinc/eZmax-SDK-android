/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.UsergroupAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/usergroup/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/usergroup/getAutocomplete")
public class UsergroupGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objUsergroup")
  private List<UsergroupAutocompleteElementResponse> aObjUsergroup = null;

  /**
   * An array of Usergroup autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Usergroup autocomplete element response.")
  public List<UsergroupAutocompleteElementResponse> getAObjUsergroup() {
    return aObjUsergroup;
  }
  public void setAObjUsergroup(List<UsergroupAutocompleteElementResponse> aObjUsergroup) {
    this.aObjUsergroup = aObjUsergroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupGetAutocompleteV2ResponseMPayload usergroupGetAutocompleteV2ResponseMPayload = (UsergroupGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjUsergroup == null ? usergroupGetAutocompleteV2ResponseMPayload.aObjUsergroup == null : this.aObjUsergroup.equals(usergroupGetAutocompleteV2ResponseMPayload.aObjUsergroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroup == null ? 0: this.aObjUsergroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjUsergroup: ").append(aObjUsergroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
