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

import java.util.*;
import org.openapitools.client.model.UsergroupexternalmembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships
 **/
@ApiModel(description = "Response for GET /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships")
public class UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload {
  
  @SerializedName("a_objUsergroupexternalmembership")
  private List<UsergroupexternalmembershipResponseCompound> aObjUsergroupexternalmembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupexternalmembershipResponseCompound> getAObjUsergroupexternalmembership() {
    return aObjUsergroupexternalmembership;
  }
  public void setAObjUsergroupexternalmembership(List<UsergroupexternalmembershipResponseCompound> aObjUsergroupexternalmembership) {
    this.aObjUsergroupexternalmembership = aObjUsergroupexternalmembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload usergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload = (UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload) o;
    return (this.aObjUsergroupexternalmembership == null ? usergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.aObjUsergroupexternalmembership == null : this.aObjUsergroupexternalmembership.equals(usergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.aObjUsergroupexternalmembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroupexternalmembership == null ? 0: this.aObjUsergroupexternalmembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload {\n");
    
    sb.append("  aObjUsergroupexternalmembership: ").append(aObjUsergroupexternalmembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
