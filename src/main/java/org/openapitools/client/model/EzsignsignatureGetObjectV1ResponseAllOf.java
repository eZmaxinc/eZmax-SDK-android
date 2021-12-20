/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignsignatureGetObjectV1ResponseAllOf {
  
  @SerializedName("mPayload")
  private Object mPayload = null;

  /**
   * Payload for the /1/object/ezsignsignature/getObject API Request
   **/
  @ApiModelProperty(required = true, value = "Payload for the /1/object/ezsignsignature/getObject API Request")
  public Object getMPayload() {
    return mPayload;
  }
  public void setMPayload(Object mPayload) {
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
    EzsignsignatureGetObjectV1ResponseAllOf ezsignsignatureGetObjectV1ResponseAllOf = (EzsignsignatureGetObjectV1ResponseAllOf) o;
    return (this.mPayload == null ? ezsignsignatureGetObjectV1ResponseAllOf.mPayload == null : this.mPayload.equals(ezsignsignatureGetObjectV1ResponseAllOf.mPayload));
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
    sb.append("class EzsignsignatureGetObjectV1ResponseAllOf {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
