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
import org.openapitools.client.model.ApikeyResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/apikey
 **/
@ApiModel(description = "Payload for POST /2/object/apikey")
public class ApikeyCreateObjectV2ResponseMPayload {
  
  @SerializedName("a_objApikey")
  private List<ApikeyResponseCompound> aObjApikey = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ApikeyResponseCompound> getAObjApikey() {
    return aObjApikey;
  }
  public void setAObjApikey(List<ApikeyResponseCompound> aObjApikey) {
    this.aObjApikey = aObjApikey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyCreateObjectV2ResponseMPayload apikeyCreateObjectV2ResponseMPayload = (ApikeyCreateObjectV2ResponseMPayload) o;
    return (this.aObjApikey == null ? apikeyCreateObjectV2ResponseMPayload.aObjApikey == null : this.aObjApikey.equals(apikeyCreateObjectV2ResponseMPayload.aObjApikey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjApikey == null ? 0: this.aObjApikey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyCreateObjectV2ResponseMPayload {\n");
    
    sb.append("  aObjApikey: ").append(aObjApikey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
