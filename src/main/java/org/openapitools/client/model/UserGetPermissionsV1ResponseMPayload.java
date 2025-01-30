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
import org.openapitools.client.model.ModulegroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/user/{pkiUserID}/getPermissions
 **/
@ApiModel(description = "Response for GET /1/object/user/{pkiUserID}/getPermissions")
public class UserGetPermissionsV1ResponseMPayload {
  
  @SerializedName("a_objModulegroup")
  private List<ModulegroupResponseCompound> aObjModulegroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ModulegroupResponseCompound> getAObjModulegroup() {
    return aObjModulegroup;
  }
  public void setAObjModulegroup(List<ModulegroupResponseCompound> aObjModulegroup) {
    this.aObjModulegroup = aObjModulegroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetPermissionsV1ResponseMPayload userGetPermissionsV1ResponseMPayload = (UserGetPermissionsV1ResponseMPayload) o;
    return (this.aObjModulegroup == null ? userGetPermissionsV1ResponseMPayload.aObjModulegroup == null : this.aObjModulegroup.equals(userGetPermissionsV1ResponseMPayload.aObjModulegroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjModulegroup == null ? 0: this.aObjModulegroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetPermissionsV1ResponseMPayload {\n");
    
    sb.append("  aObjModulegroup: ").append(aObjModulegroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
