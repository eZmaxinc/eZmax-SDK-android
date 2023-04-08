/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayloadGetList;
import org.openapitools.client.model.EzsignfolderGetCommunicationListV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationList
 **/
@ApiModel(description = "Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationList")
public class EzsignfolderGetCommunicationListV1Response {
  
  @SerializedName("mPayload")
  private EzsignfolderGetCommunicationListV1ResponseMPayload mPayload = null;
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayloadGetList objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfolderGetCommunicationListV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignfolderGetCommunicationListV1ResponseMPayload mPayload) {
    this.mPayload = mPayload;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderGetCommunicationListV1Response ezsignfolderGetCommunicationListV1Response = (EzsignfolderGetCommunicationListV1Response) o;
    return (this.mPayload == null ? ezsignfolderGetCommunicationListV1Response.mPayload == null : this.mPayload.equals(ezsignfolderGetCommunicationListV1Response.mPayload)) &&
        (this.objDebugPayload == null ? ezsignfolderGetCommunicationListV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignfolderGetCommunicationListV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignfolderGetCommunicationListV1Response.objDebug == null : this.objDebug.equals(ezsignfolderGetCommunicationListV1Response.objDebug));
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
    sb.append("class EzsignfolderGetCommunicationListV1Response {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
