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

import org.openapitools.client.model.PermissionRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/permission/{pkiPermissionID}
 **/
@ApiModel(description = "Request for PUT /1/object/permission/{pkiPermissionID}")
public class PermissionEditObjectV1Request {
  
  @SerializedName("objPermission")
  private PermissionRequestCompound objPermission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PermissionRequestCompound getObjPermission() {
    return objPermission;
  }
  public void setObjPermission(PermissionRequestCompound objPermission) {
    this.objPermission = objPermission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionEditObjectV1Request permissionEditObjectV1Request = (PermissionEditObjectV1Request) o;
    return (this.objPermission == null ? permissionEditObjectV1Request.objPermission == null : this.objPermission.equals(permissionEditObjectV1Request.objPermission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objPermission == null ? 0: this.objPermission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionEditObjectV1Request {\n");
    
    sb.append("  objPermission: ").append(objPermission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
