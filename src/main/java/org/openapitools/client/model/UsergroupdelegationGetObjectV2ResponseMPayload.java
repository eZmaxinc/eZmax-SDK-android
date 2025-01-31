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

import org.openapitools.client.model.UsergroupdelegationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/usergroupdelegation/{pkiUsergroupdelegationID}
 **/
@ApiModel(description = "Payload for GET /2/object/usergroupdelegation/{pkiUsergroupdelegationID}")
public class UsergroupdelegationGetObjectV2ResponseMPayload {
  
  @SerializedName("objUsergroupdelegation")
  private UsergroupdelegationResponseCompound objUsergroupdelegation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UsergroupdelegationResponseCompound getObjUsergroupdelegation() {
    return objUsergroupdelegation;
  }
  public void setObjUsergroupdelegation(UsergroupdelegationResponseCompound objUsergroupdelegation) {
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
    UsergroupdelegationGetObjectV2ResponseMPayload usergroupdelegationGetObjectV2ResponseMPayload = (UsergroupdelegationGetObjectV2ResponseMPayload) o;
    return (this.objUsergroupdelegation == null ? usergroupdelegationGetObjectV2ResponseMPayload.objUsergroupdelegation == null : this.objUsergroupdelegation.equals(usergroupdelegationGetObjectV2ResponseMPayload.objUsergroupdelegation));
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
    sb.append("class UsergroupdelegationGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objUsergroupdelegation: ").append(objUsergroupdelegation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
