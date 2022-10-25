/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
import org.openapitools.client.model.EzsigndocumentGetFormDataV1ResponseAllOf;
import org.openapitools.client.model.EzsigndocumentGetFormDataV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getFormData
 **/
@ApiModel(description = "Response for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getFormData")
public class EzsigndocumentGetFormDataV1Response {
  
  @SerializedName("mPayload")
  private EzsigndocumentGetFormDataV1ResponseMPayload mPayload = null;
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigndocumentGetFormDataV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsigndocumentGetFormDataV1ResponseMPayload mPayload) {
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
    EzsigndocumentGetFormDataV1Response ezsigndocumentGetFormDataV1Response = (EzsigndocumentGetFormDataV1Response) o;
    return (this.mPayload == null ? ezsigndocumentGetFormDataV1Response.mPayload == null : this.mPayload.equals(ezsigndocumentGetFormDataV1Response.mPayload)) &&
        (this.objDebugPayload == null ? ezsigndocumentGetFormDataV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsigndocumentGetFormDataV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsigndocumentGetFormDataV1Response.objDebug == null : this.objDebug.equals(ezsigndocumentGetFormDataV1Response.objDebug));
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
    sb.append("class EzsigndocumentGetFormDataV1Response {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
