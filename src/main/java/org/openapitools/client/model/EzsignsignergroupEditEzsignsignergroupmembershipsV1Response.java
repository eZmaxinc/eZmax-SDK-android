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
import org.openapitools.client.model.EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for PUT /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships
 **/
@ApiModel(description = "Response for PUT /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships")
public class EzsignsignergroupEditEzsignsignergroupmembershipsV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload mPayload = null;

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
  public EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload mPayload) {
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
    EzsignsignergroupEditEzsignsignergroupmembershipsV1Response ezsignsignergroupEditEzsignsignergroupmembershipsV1Response = (EzsignsignergroupEditEzsignsignergroupmembershipsV1Response) o;
    return (this.objDebugPayload == null ? ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.objDebug == null : this.objDebug.equals(ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.objDebug)) &&
        (this.mPayload == null ? ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.mPayload == null : this.mPayload.equals(ezsignsignergroupEditEzsignsignergroupmembershipsV1Response.mPayload));
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
    sb.append("class EzsignsignergroupEditEzsignsignergroupmembershipsV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
