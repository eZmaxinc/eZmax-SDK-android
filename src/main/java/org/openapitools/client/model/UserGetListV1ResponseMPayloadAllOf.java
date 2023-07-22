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

import java.util.*;
import org.openapitools.client.model.UserListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objUser")
  private List<UserListElement> aObjUser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UserListElement> getAObjUser() {
    return aObjUser;
  }
  public void setAObjUser(List<UserListElement> aObjUser) {
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
    UserGetListV1ResponseMPayloadAllOf userGetListV1ResponseMPayloadAllOf = (UserGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjUser == null ? userGetListV1ResponseMPayloadAllOf.aObjUser == null : this.aObjUser.equals(userGetListV1ResponseMPayloadAllOf.aObjUser));
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
    sb.append("class UserGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjUser: ").append(aObjUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
