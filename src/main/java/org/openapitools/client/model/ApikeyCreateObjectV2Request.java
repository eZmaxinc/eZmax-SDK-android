/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ApikeyRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /2/object/apikey/createObject API Request
 **/
@ApiModel(description = "Request for the /2/object/apikey/createObject API Request")
public class ApikeyCreateObjectV2Request {
  
  @SerializedName("a_objApikey")
  private List<ApikeyRequestCompound> aObjApikey = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ApikeyRequestCompound> getAObjApikey() {
    return aObjApikey;
  }
  public void setAObjApikey(List<ApikeyRequestCompound> aObjApikey) {
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
    ApikeyCreateObjectV2Request apikeyCreateObjectV2Request = (ApikeyCreateObjectV2Request) o;
    return (this.aObjApikey == null ? apikeyCreateObjectV2Request.aObjApikey == null : this.aObjApikey.equals(apikeyCreateObjectV2Request.aObjApikey));
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
    sb.append("class ApikeyCreateObjectV2Request {\n");
    
    sb.append("  aObjApikey: ").append(aObjApikey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
