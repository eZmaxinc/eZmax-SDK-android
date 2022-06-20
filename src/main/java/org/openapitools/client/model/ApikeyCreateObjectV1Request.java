/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ApikeyRequest;
import org.openapitools.client.model.ApikeyRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/apikey
 **/
@ApiModel(description = "Request for POST /1/object/apikey")
public class ApikeyCreateObjectV1Request {
  
  @SerializedName("objApikey")
  private ApikeyRequest objApikey = null;
  @SerializedName("objApikeyCompound")
  private ApikeyRequestCompound objApikeyCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ApikeyRequest getObjApikey() {
    return objApikey;
  }
  public void setObjApikey(ApikeyRequest objApikey) {
    this.objApikey = objApikey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ApikeyRequestCompound getObjApikeyCompound() {
    return objApikeyCompound;
  }
  public void setObjApikeyCompound(ApikeyRequestCompound objApikeyCompound) {
    this.objApikeyCompound = objApikeyCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyCreateObjectV1Request apikeyCreateObjectV1Request = (ApikeyCreateObjectV1Request) o;
    return (this.objApikey == null ? apikeyCreateObjectV1Request.objApikey == null : this.objApikey.equals(apikeyCreateObjectV1Request.objApikey)) &&
        (this.objApikeyCompound == null ? apikeyCreateObjectV1Request.objApikeyCompound == null : this.objApikeyCompound.equals(apikeyCreateObjectV1Request.objApikeyCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objApikey == null ? 0: this.objApikey.hashCode());
    result = 31 * result + (this.objApikeyCompound == null ? 0: this.objApikeyCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyCreateObjectV1Request {\n");
    
    sb.append("  objApikey: ").append(objApikey).append("\n");
    sb.append("  objApikeyCompound: ").append(objApikeyCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
