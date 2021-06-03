/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for the /1/object/ezsignfoldersignerassociation/getObject API Request
 **/
@ApiModel(description = "Response for the /1/object/ezsignfoldersignerassociation/getObject API Request")
public class EzsignfoldersignerassociationGetObjectV1Response {
  
  @SerializedName("mPayload")
  private Object mPayload = null;
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

  /**
   * Payload for the /1/object/ezsignfoldersignerassociation/getObject API Request
   **/
  @ApiModelProperty(required = true, value = "Payload for the /1/object/ezsignfoldersignerassociation/getObject API Request")
  public Object getMPayload() {
    return mPayload;
  }
  public void setMPayload(Object mPayload) {
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
    EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1Response = (EzsignfoldersignerassociationGetObjectV1Response) o;
    return (this.mPayload == null ? ezsignfoldersignerassociationGetObjectV1Response.mPayload == null : this.mPayload.equals(ezsignfoldersignerassociationGetObjectV1Response.mPayload)) &&
        (this.objDebugPayload == null ? ezsignfoldersignerassociationGetObjectV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignfoldersignerassociationGetObjectV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignfoldersignerassociationGetObjectV1Response.objDebug == null : this.objDebug.equals(ezsignfoldersignerassociationGetObjectV1Response.objDebug));
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
    sb.append("class EzsignfoldersignerassociationGetObjectV1Response {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
