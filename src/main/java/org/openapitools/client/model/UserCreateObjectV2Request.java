/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.UserRequestCompoundV2;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/user
 **/
@ApiModel(description = "Request for POST /1/object/user")
public class UserCreateObjectV2Request {
  
  @SerializedName("a_objUser")
  private List<UserRequestCompoundV2> aObjUser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UserRequestCompoundV2> getAObjUser() {
    return aObjUser;
  }
  public void setAObjUser(List<UserRequestCompoundV2> aObjUser) {
    this.aObjUser = aObjUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateObjectV2Request userCreateObjectV2Request = (UserCreateObjectV2Request) o;
    return (this.aObjUser == null ? userCreateObjectV2Request.aObjUser == null : this.aObjUser.equals(userCreateObjectV2Request.aObjUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUser == null ? 0: this.aObjUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateObjectV2Request {\n");
    
    sb.append("  aObjUser: ").append(aObjUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
