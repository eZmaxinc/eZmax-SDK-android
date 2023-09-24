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
import org.openapitools.client.model.PermissionRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/permission
 **/
@ApiModel(description = "Request for POST /1/object/permission")
public class PermissionCreateObjectV1Request {
  
  @SerializedName("a_objPermission")
  private List<PermissionRequestCompound> aObjPermission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PermissionRequestCompound> getAObjPermission() {
    return aObjPermission;
  }
  public void setAObjPermission(List<PermissionRequestCompound> aObjPermission) {
    this.aObjPermission = aObjPermission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionCreateObjectV1Request permissionCreateObjectV1Request = (PermissionCreateObjectV1Request) o;
    return (this.aObjPermission == null ? permissionCreateObjectV1Request.aObjPermission == null : this.aObjPermission.equals(permissionCreateObjectV1Request.aObjPermission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjPermission == null ? 0: this.aObjPermission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionCreateObjectV1Request {\n");
    
    sb.append("  aObjPermission: ").append(aObjPermission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
