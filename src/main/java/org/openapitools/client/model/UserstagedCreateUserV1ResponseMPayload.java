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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/userstaged/{pkiUserstagedID}/createUser
 **/
@ApiModel(description = "Payload for POST /1/object/userstaged/{pkiUserstagedID}/createUser")
public class UserstagedCreateUserV1ResponseMPayload {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getPkiUserID() {
    return pkiUserID;
  }
  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserstagedCreateUserV1ResponseMPayload userstagedCreateUserV1ResponseMPayload = (UserstagedCreateUserV1ResponseMPayload) o;
    return (this.pkiUserID == null ? userstagedCreateUserV1ResponseMPayload.pkiUserID == null : this.pkiUserID.equals(userstagedCreateUserV1ResponseMPayload.pkiUserID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserstagedCreateUserV1ResponseMPayload {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
