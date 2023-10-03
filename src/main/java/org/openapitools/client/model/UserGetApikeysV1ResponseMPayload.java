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
import org.openapitools.client.model.ApikeyResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/user/{pkiUserID}/getApikeys
 **/
@ApiModel(description = "Response for GET /1/object/user/{pkiUserID}/getApikeys")
public class UserGetApikeysV1ResponseMPayload {
  
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
    UserGetApikeysV1ResponseMPayload userGetApikeysV1ResponseMPayload = (UserGetApikeysV1ResponseMPayload) o;
    return (this.aObjApikey == null ? userGetApikeysV1ResponseMPayload.aObjApikey == null : this.aObjApikey.equals(userGetApikeysV1ResponseMPayload.aObjApikey));
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
    sb.append("class UserGetApikeysV1ResponseMPayload {\n");
    
    sb.append("  aObjApikey: ").append(aObjApikey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}