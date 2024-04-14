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

import java.util.*;
import org.openapitools.client.model.UsergroupdelegationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/usergroupdelegation
 **/
@ApiModel(description = "Request for POST /1/object/usergroupdelegation")
public class UsergroupdelegationCreateObjectV1Request {
  
  @SerializedName("a_objUsergroupdelegation")
  private List<UsergroupdelegationRequestCompound> aObjUsergroupdelegation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupdelegationRequestCompound> getAObjUsergroupdelegation() {
    return aObjUsergroupdelegation;
  }
  public void setAObjUsergroupdelegation(List<UsergroupdelegationRequestCompound> aObjUsergroupdelegation) {
    this.aObjUsergroupdelegation = aObjUsergroupdelegation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupdelegationCreateObjectV1Request usergroupdelegationCreateObjectV1Request = (UsergroupdelegationCreateObjectV1Request) o;
    return (this.aObjUsergroupdelegation == null ? usergroupdelegationCreateObjectV1Request.aObjUsergroupdelegation == null : this.aObjUsergroupdelegation.equals(usergroupdelegationCreateObjectV1Request.aObjUsergroupdelegation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroupdelegation == null ? 0: this.aObjUsergroupdelegation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupdelegationCreateObjectV1Request {\n");
    
    sb.append("  aObjUsergroupdelegation: ").append(aObjUsergroupdelegation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
