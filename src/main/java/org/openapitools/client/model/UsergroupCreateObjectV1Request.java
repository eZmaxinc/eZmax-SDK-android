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
import org.openapitools.client.model.UsergroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/usergroup
 **/
@ApiModel(description = "Request for POST /1/object/usergroup")
public class UsergroupCreateObjectV1Request {
  
  @SerializedName("a_objUsergroup")
  private List<UsergroupRequestCompound> aObjUsergroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupRequestCompound> getAObjUsergroup() {
    return aObjUsergroup;
  }
  public void setAObjUsergroup(List<UsergroupRequestCompound> aObjUsergroup) {
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
    UsergroupCreateObjectV1Request usergroupCreateObjectV1Request = (UsergroupCreateObjectV1Request) o;
    return (this.aObjUsergroup == null ? usergroupCreateObjectV1Request.aObjUsergroup == null : this.aObjUsergroup.equals(usergroupCreateObjectV1Request.aObjUsergroup));
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
    sb.append("class UsergroupCreateObjectV1Request {\n");
    
    sb.append("  aObjUsergroup: ").append(aObjUsergroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}