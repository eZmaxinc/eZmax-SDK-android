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
import org.openapitools.client.model.UsergroupexternalResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/user/{pkiUserID}/getUsergroupexternals
 **/
@ApiModel(description = "Response for GET /1/object/user/{pkiUserID}/getUsergroupexternals")
public class UserGetUsergroupexternalsV1ResponseMPayload {
  
  @SerializedName("a_objUsergroupexternal")
  private List<UsergroupexternalResponseCompound> aObjUsergroupexternal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<UsergroupexternalResponseCompound> getAObjUsergroupexternal() {
    return aObjUsergroupexternal;
  }
  public void setAObjUsergroupexternal(List<UsergroupexternalResponseCompound> aObjUsergroupexternal) {
    this.aObjUsergroupexternal = aObjUsergroupexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetUsergroupexternalsV1ResponseMPayload userGetUsergroupexternalsV1ResponseMPayload = (UserGetUsergroupexternalsV1ResponseMPayload) o;
    return (this.aObjUsergroupexternal == null ? userGetUsergroupexternalsV1ResponseMPayload.aObjUsergroupexternal == null : this.aObjUsergroupexternal.equals(userGetUsergroupexternalsV1ResponseMPayload.aObjUsergroupexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjUsergroupexternal == null ? 0: this.aObjUsergroupexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetUsergroupexternalsV1ResponseMPayload {\n");
    
    sb.append("  aObjUsergroupexternal: ").append(aObjUsergroupexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
