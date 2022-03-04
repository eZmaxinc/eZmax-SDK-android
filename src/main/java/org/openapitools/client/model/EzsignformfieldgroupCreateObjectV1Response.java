/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
import org.openapitools.client.model.EzsignformfieldgroupCreateObjectV1ResponseAllOf;
import org.openapitools.client.model.EzsignformfieldgroupCreateObjectV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for the /1/object/ezsignformfieldgroup/createObject API Request
 **/
@ApiModel(description = "Response for the /1/object/ezsignformfieldgroup/createObject API Request")
public class EzsignformfieldgroupCreateObjectV1Response {
  
  @SerializedName("mPayload")
  private EzsignformfieldgroupCreateObjectV1ResponseMPayload mPayload = null;
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignformfieldgroupCreateObjectV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignformfieldgroupCreateObjectV1ResponseMPayload mPayload) {
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
    EzsignformfieldgroupCreateObjectV1Response ezsignformfieldgroupCreateObjectV1Response = (EzsignformfieldgroupCreateObjectV1Response) o;
    return (this.mPayload == null ? ezsignformfieldgroupCreateObjectV1Response.mPayload == null : this.mPayload.equals(ezsignformfieldgroupCreateObjectV1Response.mPayload)) &&
        (this.objDebugPayload == null ? ezsignformfieldgroupCreateObjectV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignformfieldgroupCreateObjectV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignformfieldgroupCreateObjectV1Response.objDebug == null : this.objDebug.equals(ezsignformfieldgroupCreateObjectV1Response.objDebug));
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
    sb.append("class EzsignformfieldgroupCreateObjectV1Response {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
