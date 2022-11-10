/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CommonGetAutocompleteV1ResponseAllOf {
  
  @SerializedName("mPayload")
  private List<CustomAutocompleteElementResponse> mPayload = null;

  /**
   * Generic Autocomplete Response
   **/
  @ApiModelProperty(required = true, value = "Generic Autocomplete Response")
  public List<CustomAutocompleteElementResponse> getMPayload() {
    return mPayload;
  }
  public void setMPayload(List<CustomAutocompleteElementResponse> mPayload) {
    this.mPayload = mPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGetAutocompleteV1ResponseAllOf commonGetAutocompleteV1ResponseAllOf = (CommonGetAutocompleteV1ResponseAllOf) o;
    return (this.mPayload == null ? commonGetAutocompleteV1ResponseAllOf.mPayload == null : this.mPayload.equals(commonGetAutocompleteV1ResponseAllOf.mPayload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGetAutocompleteV1ResponseAllOf {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
