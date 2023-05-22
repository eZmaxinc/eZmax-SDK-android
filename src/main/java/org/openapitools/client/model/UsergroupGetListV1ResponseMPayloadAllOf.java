/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.UsergroupListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UsergroupGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objUsergroup")
  private List<UsergroupListElement> aObjUsergroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupListElement> getAObjUsergroup() {
    return aObjUsergroup;
  }
  public void setAObjUsergroup(List<UsergroupListElement> aObjUsergroup) {
    this.aObjUsergroup = aObjUsergroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupGetListV1ResponseMPayloadAllOf usergroupGetListV1ResponseMPayloadAllOf = (UsergroupGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjUsergroup == null ? usergroupGetListV1ResponseMPayloadAllOf.aObjUsergroup == null : this.aObjUsergroup.equals(usergroupGetListV1ResponseMPayloadAllOf.aObjUsergroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroup == null ? 0: this.aObjUsergroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjUsergroup: ").append(aObjUsergroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}