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
import org.openapitools.client.model.EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for POST /2/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 **/
@ApiModel(description = "Response for POST /2/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission")
public class EzsignbulksendCreateEzsignbulksendtransmissionV2Response extends CommonResponse {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload mPayload = null;

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
  public EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload mPayload) {
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
    EzsignbulksendCreateEzsignbulksendtransmissionV2Response ezsignbulksendCreateEzsignbulksendtransmissionV2Response = (EzsignbulksendCreateEzsignbulksendtransmissionV2Response) o;
    return (this.objDebugPayload == null ? ezsignbulksendCreateEzsignbulksendtransmissionV2Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignbulksendCreateEzsignbulksendtransmissionV2Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignbulksendCreateEzsignbulksendtransmissionV2Response.objDebug == null : this.objDebug.equals(ezsignbulksendCreateEzsignbulksendtransmissionV2Response.objDebug)) &&
        (this.mPayload == null ? ezsignbulksendCreateEzsignbulksendtransmissionV2Response.mPayload == null : this.mPayload.equals(ezsignbulksendCreateEzsignbulksendtransmissionV2Response.mPayload));
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
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV2Response {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
