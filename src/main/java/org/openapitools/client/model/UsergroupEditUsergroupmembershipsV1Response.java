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

import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import org.openapitools.client.model.UsergroupEditUsergroupmembershipsV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for PUT /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships
 **/
@ApiModel(description = "Response for PUT /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships")
public class UsergroupEditUsergroupmembershipsV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private UsergroupEditUsergroupmembershipsV1ResponseMPayload mPayload = null;

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
  public UsergroupEditUsergroupmembershipsV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(UsergroupEditUsergroupmembershipsV1ResponseMPayload mPayload) {
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
    UsergroupEditUsergroupmembershipsV1Response usergroupEditUsergroupmembershipsV1Response = (UsergroupEditUsergroupmembershipsV1Response) o;
    return (this.objDebugPayload == null ? usergroupEditUsergroupmembershipsV1Response.objDebugPayload == null : this.objDebugPayload.equals(usergroupEditUsergroupmembershipsV1Response.objDebugPayload)) &&
        (this.objDebug == null ? usergroupEditUsergroupmembershipsV1Response.objDebug == null : this.objDebug.equals(usergroupEditUsergroupmembershipsV1Response.objDebug)) &&
        (this.mPayload == null ? usergroupEditUsergroupmembershipsV1Response.mPayload == null : this.mPayload.equals(usergroupEditUsergroupmembershipsV1Response.mPayload));
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
    sb.append("class UsergroupEditUsergroupmembershipsV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
