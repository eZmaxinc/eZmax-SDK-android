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
import org.openapitools.client.model.ModulegroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/modulegroup/getAll
 **/
@ApiModel(description = "Response for GET /1/object/modulegroup/getAll")
public class ModulegroupGetAllV1ResponseMPayload {
  
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
    ModulegroupGetAllV1ResponseMPayload modulegroupGetAllV1ResponseMPayload = (ModulegroupGetAllV1ResponseMPayload) o;
    return (this.aObjModulegroup == null ? modulegroupGetAllV1ResponseMPayload.aObjModulegroup == null : this.aObjModulegroup.equals(modulegroupGetAllV1ResponseMPayload.aObjModulegroup));
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
    sb.append("class ModulegroupGetAllV1ResponseMPayload {\n");
    
    sb.append("  aObjModulegroup: ").append(aObjModulegroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
