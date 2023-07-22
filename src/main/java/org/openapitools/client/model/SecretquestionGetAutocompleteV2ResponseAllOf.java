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

import org.openapitools.client.model.SecretquestionGetAutocompleteV2ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SecretquestionGetAutocompleteV2ResponseAllOf {
  
  @SerializedName("mPayload")
  private SecretquestionGetAutocompleteV2ResponseMPayload mPayload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SecretquestionGetAutocompleteV2ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(SecretquestionGetAutocompleteV2ResponseMPayload mPayload) {
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
    SecretquestionGetAutocompleteV2ResponseAllOf secretquestionGetAutocompleteV2ResponseAllOf = (SecretquestionGetAutocompleteV2ResponseAllOf) o;
    return (this.mPayload == null ? secretquestionGetAutocompleteV2ResponseAllOf.mPayload == null : this.mPayload.equals(secretquestionGetAutocompleteV2ResponseAllOf.mPayload));
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
    sb.append("class SecretquestionGetAutocompleteV2ResponseAllOf {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
