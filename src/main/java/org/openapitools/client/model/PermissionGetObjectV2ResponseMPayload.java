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

import org.openapitools.client.model.PermissionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/permission/{pkiPermissionID}
 **/
@ApiModel(description = "Payload for GET /2/object/permission/{pkiPermissionID}")
public class PermissionGetObjectV2ResponseMPayload {
  
  @SerializedName("objPermission")
  private PermissionResponseCompound objPermission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PermissionResponseCompound getObjPermission() {
    return objPermission;
  }
  public void setObjPermission(PermissionResponseCompound objPermission) {
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
    PermissionGetObjectV2ResponseMPayload permissionGetObjectV2ResponseMPayload = (PermissionGetObjectV2ResponseMPayload) o;
    return (this.objPermission == null ? permissionGetObjectV2ResponseMPayload.objPermission == null : this.objPermission.equals(permissionGetObjectV2ResponseMPayload.objPermission));
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
    sb.append("class PermissionGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objPermission: ").append(objPermission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
