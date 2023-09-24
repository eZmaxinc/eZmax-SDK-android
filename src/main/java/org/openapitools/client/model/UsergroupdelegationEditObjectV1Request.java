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

import org.openapitools.client.model.UsergroupdelegationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/usergroupdelegation/{pkiUsergroupdelegationID}
 **/
@ApiModel(description = "Request for PUT /1/object/usergroupdelegation/{pkiUsergroupdelegationID}")
public class UsergroupdelegationEditObjectV1Request {
  
  @SerializedName("objUsergroupdelegation")
  private UsergroupdelegationRequestCompound objUsergroupdelegation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UsergroupdelegationRequestCompound getObjUsergroupdelegation() {
    return objUsergroupdelegation;
  }
  public void setObjUsergroupdelegation(UsergroupdelegationRequestCompound objUsergroupdelegation) {
    this.objUsergroupdelegation = objUsergroupdelegation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupdelegationEditObjectV1Request usergroupdelegationEditObjectV1Request = (UsergroupdelegationEditObjectV1Request) o;
    return (this.objUsergroupdelegation == null ? usergroupdelegationEditObjectV1Request.objUsergroupdelegation == null : this.objUsergroupdelegation.equals(usergroupdelegationEditObjectV1Request.objUsergroupdelegation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUsergroupdelegation == null ? 0: this.objUsergroupdelegation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupdelegationEditObjectV1Request {\n");
    
    sb.append("  objUsergroupdelegation: ").append(objUsergroupdelegation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
