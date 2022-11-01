/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
import org.openapitools.client.model.VersionhistoryGetObjectV2ResponseAllOf;
import org.openapitools.client.model.VersionhistoryGetObjectV2ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /2/object/versionhistory/{pkiVersionhistoryID}
 **/
@ApiModel(description = "Response for GET /2/object/versionhistory/{pkiVersionhistoryID}")
public class VersionhistoryGetObjectV2Response {
  
  @SerializedName("mPayload")
  private VersionhistoryGetObjectV2ResponseMPayload mPayload = null;
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public VersionhistoryGetObjectV2ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(VersionhistoryGetObjectV2ResponseMPayload mPayload) {
    this.mPayload = mPayload;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionhistoryGetObjectV2Response versionhistoryGetObjectV2Response = (VersionhistoryGetObjectV2Response) o;
    return (this.mPayload == null ? versionhistoryGetObjectV2Response.mPayload == null : this.mPayload.equals(versionhistoryGetObjectV2Response.mPayload)) &&
        (this.objDebugPayload == null ? versionhistoryGetObjectV2Response.objDebugPayload == null : this.objDebugPayload.equals(versionhistoryGetObjectV2Response.objDebugPayload)) &&
        (this.objDebug == null ? versionhistoryGetObjectV2Response.objDebug == null : this.objDebug.equals(versionhistoryGetObjectV2Response.objDebug));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionhistoryGetObjectV2Response {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
