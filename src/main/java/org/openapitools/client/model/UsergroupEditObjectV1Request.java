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

import org.openapitools.client.model.UsergroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/usergroup/{pkiUsergroupID}
 **/
@ApiModel(description = "Request for PUT /1/object/usergroup/{pkiUsergroupID}")
public class UsergroupEditObjectV1Request {
  
  @SerializedName("objUsergroup")
  private UsergroupRequestCompound objUsergroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UsergroupRequestCompound getObjUsergroup() {
    return objUsergroup;
  }
  public void setObjUsergroup(UsergroupRequestCompound objUsergroup) {
    this.objUsergroup = objUsergroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupEditObjectV1Request usergroupEditObjectV1Request = (UsergroupEditObjectV1Request) o;
    return (this.objUsergroup == null ? usergroupEditObjectV1Request.objUsergroup == null : this.objUsergroup.equals(usergroupEditObjectV1Request.objUsergroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUsergroup == null ? 0: this.objUsergroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupEditObjectV1Request {\n");
    
    sb.append("  objUsergroup: ").append(objUsergroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}