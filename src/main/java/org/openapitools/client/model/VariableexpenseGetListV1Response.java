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
import org.openapitools.client.model.CommonResponseObjDebugPayloadGetList;
import org.openapitools.client.model.VariableexpenseGetListV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/variableexpense/getList
 **/
@ApiModel(description = "Response for GET /1/object/variableexpense/getList")
public class VariableexpenseGetListV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayloadGetList objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private VariableexpenseGetListV1ResponseMPayload mPayload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonResponseObjDebugPayloadGetList getObjDebugPayload() {
    return objDebugPayload;
  }
  public void setObjDebugPayload(CommonResponseObjDebugPayloadGetList objDebugPayload) {
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
  public VariableexpenseGetListV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(VariableexpenseGetListV1ResponseMPayload mPayload) {
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
    VariableexpenseGetListV1Response variableexpenseGetListV1Response = (VariableexpenseGetListV1Response) o;
    return (this.objDebugPayload == null ? variableexpenseGetListV1Response.objDebugPayload == null : this.objDebugPayload.equals(variableexpenseGetListV1Response.objDebugPayload)) &&
        (this.objDebug == null ? variableexpenseGetListV1Response.objDebug == null : this.objDebug.equals(variableexpenseGetListV1Response.objDebug)) &&
        (this.mPayload == null ? variableexpenseGetListV1Response.mPayload == null : this.mPayload.equals(variableexpenseGetListV1Response.mPayload));
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
    sb.append("class VariableexpenseGetListV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
