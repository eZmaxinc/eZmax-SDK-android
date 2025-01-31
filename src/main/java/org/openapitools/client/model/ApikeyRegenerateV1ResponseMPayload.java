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

import org.openapitools.client.model.ApikeyResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/apikey/{pkiApikeyID}/regenerate
 **/
@ApiModel(description = "Response for GET /1/object/apikey/{pkiApikeyID}/regenerate")
public class ApikeyRegenerateV1ResponseMPayload {
  
  @SerializedName("objApikey")
  private ApikeyResponseCompound objApikey = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ApikeyResponseCompound getObjApikey() {
    return objApikey;
  }
  public void setObjApikey(ApikeyResponseCompound objApikey) {
    this.objApikey = objApikey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyRegenerateV1ResponseMPayload apikeyRegenerateV1ResponseMPayload = (ApikeyRegenerateV1ResponseMPayload) o;
    return (this.objApikey == null ? apikeyRegenerateV1ResponseMPayload.objApikey == null : this.objApikey.equals(apikeyRegenerateV1ResponseMPayload.objApikey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objApikey == null ? 0: this.objApikey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRegenerateV1ResponseMPayload {\n");
    
    sb.append("  objApikey: ").append(objApikey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
