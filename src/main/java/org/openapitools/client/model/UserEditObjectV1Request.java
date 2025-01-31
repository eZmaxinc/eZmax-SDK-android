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

import org.openapitools.client.model.UserRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/user/{pkiUserID}
 **/
@ApiModel(description = "Request for PUT /1/object/user/{pkiUserID}")
public class UserEditObjectV1Request {
  
  @SerializedName("objUser")
  private UserRequestCompound objUser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserRequestCompound getObjUser() {
    return objUser;
  }
  public void setObjUser(UserRequestCompound objUser) {
    this.objUser = objUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEditObjectV1Request userEditObjectV1Request = (UserEditObjectV1Request) o;
    return (this.objUser == null ? userEditObjectV1Request.objUser == null : this.objUser.equals(userEditObjectV1Request.objUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEditObjectV1Request {\n");
    
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
