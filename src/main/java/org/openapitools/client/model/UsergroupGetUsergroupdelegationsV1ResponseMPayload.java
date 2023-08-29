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
import org.openapitools.client.model.UsergroupdelegationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/usergroup/{pkiUsergroupID}/getUsergroupdelegations
 **/
@ApiModel(description = "Response for GET /1/object/usergroup/{pkiUsergroupID}/getUsergroupdelegations")
public class UsergroupGetUsergroupdelegationsV1ResponseMPayload {
  
  @SerializedName("a_objUsergroupdelegation")
  private List<UsergroupdelegationResponseCompound> aObjUsergroupdelegation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupdelegationResponseCompound> getAObjUsergroupdelegation() {
    return aObjUsergroupdelegation;
  }
  public void setAObjUsergroupdelegation(List<UsergroupdelegationResponseCompound> aObjUsergroupdelegation) {
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
    UsergroupGetUsergroupdelegationsV1ResponseMPayload usergroupGetUsergroupdelegationsV1ResponseMPayload = (UsergroupGetUsergroupdelegationsV1ResponseMPayload) o;
    return (this.aObjUsergroupdelegation == null ? usergroupGetUsergroupdelegationsV1ResponseMPayload.aObjUsergroupdelegation == null : this.aObjUsergroupdelegation.equals(usergroupGetUsergroupdelegationsV1ResponseMPayload.aObjUsergroupdelegation));
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
    sb.append("class UsergroupGetUsergroupdelegationsV1ResponseMPayload {\n");
    
    sb.append("  aObjUsergroupdelegation: ").append(aObjUsergroupdelegation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
