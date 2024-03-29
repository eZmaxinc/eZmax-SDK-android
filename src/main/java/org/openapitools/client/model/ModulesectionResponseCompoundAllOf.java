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
import org.openapitools.client.model.PermissionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModulesectionResponseCompoundAllOf {
  
  @SerializedName("a_objPermission")
  private List<PermissionResponseCompound> aObjPermission = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PermissionResponseCompound> getAObjPermission() {
    return aObjPermission;
  }
  public void setAObjPermission(List<PermissionResponseCompound> aObjPermission) {
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
    ModulesectionResponseCompoundAllOf modulesectionResponseCompoundAllOf = (ModulesectionResponseCompoundAllOf) o;
    return (this.aObjPermission == null ? modulesectionResponseCompoundAllOf.aObjPermission == null : this.aObjPermission.equals(modulesectionResponseCompoundAllOf.aObjPermission));
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
    sb.append("class ModulesectionResponseCompoundAllOf {\n");
    
    sb.append("  aObjPermission: ").append(aObjPermission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
