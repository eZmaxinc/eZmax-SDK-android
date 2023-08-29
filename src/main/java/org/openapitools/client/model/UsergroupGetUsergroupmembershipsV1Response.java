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

import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import org.openapitools.client.model.UsergroupGetUsergroupmembershipsV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships
 **/
@ApiModel(description = "Response for GET /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships")
public class UsergroupGetUsergroupmembershipsV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private UsergroupGetUsergroupmembershipsV1ResponseMPayload mPayload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonResponseObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }
  public void setObjDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonResponseObjDebug getObjDebug() {
    return objDebug;
  }
  public void setObjDebug(CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UsergroupGetUsergroupmembershipsV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(UsergroupGetUsergroupmembershipsV1ResponseMPayload mPayload) {
    this.mPayload = mPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupGetUsergroupmembershipsV1Response usergroupGetUsergroupmembershipsV1Response = (UsergroupGetUsergroupmembershipsV1Response) o;
    return (this.objDebugPayload == null ? usergroupGetUsergroupmembershipsV1Response.objDebugPayload == null : this.objDebugPayload.equals(usergroupGetUsergroupmembershipsV1Response.objDebugPayload)) &&
        (this.objDebug == null ? usergroupGetUsergroupmembershipsV1Response.objDebug == null : this.objDebug.equals(usergroupGetUsergroupmembershipsV1Response.objDebug)) &&
        (this.mPayload == null ? usergroupGetUsergroupmembershipsV1Response.mPayload == null : this.mPayload.equals(usergroupGetUsergroupmembershipsV1Response.mPayload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupGetUsergroupmembershipsV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
