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

import org.openapitools.client.model.CommonResponse;
import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import org.openapitools.client.model.UserstagedCreateUserV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for POST /1/object/userstaged/{pkiUserstagedID}/createUser
 **/
@ApiModel(description = "Response for POST /1/object/userstaged/{pkiUserstagedID}/createUser")
public class UserstagedCreateUserV1Response extends CommonResponse {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private UserstagedCreateUserV1ResponseMPayload mPayload = null;

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
  public UserstagedCreateUserV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(UserstagedCreateUserV1ResponseMPayload mPayload) {
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
    UserstagedCreateUserV1Response userstagedCreateUserV1Response = (UserstagedCreateUserV1Response) o;
    return (this.objDebugPayload == null ? userstagedCreateUserV1Response.objDebugPayload == null : this.objDebugPayload.equals(userstagedCreateUserV1Response.objDebugPayload)) &&
        (this.objDebug == null ? userstagedCreateUserV1Response.objDebug == null : this.objDebug.equals(userstagedCreateUserV1Response.objDebug)) &&
        (this.mPayload == null ? userstagedCreateUserV1Response.mPayload == null : this.mPayload.equals(userstagedCreateUserV1Response.mPayload));
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
    sb.append("class UserstagedCreateUserV1Response {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
