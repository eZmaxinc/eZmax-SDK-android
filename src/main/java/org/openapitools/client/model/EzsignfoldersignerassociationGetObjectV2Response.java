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
import org.openapitools.client.model.EzsignfoldersignerassociationGetObjectV2ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Response for GET /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}")
public class EzsignfoldersignerassociationGetObjectV2Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private EzsignfoldersignerassociationGetObjectV2ResponseMPayload mPayload = null;

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
  public EzsignfoldersignerassociationGetObjectV2ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignfoldersignerassociationGetObjectV2ResponseMPayload mPayload) {
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
    EzsignfoldersignerassociationGetObjectV2Response ezsignfoldersignerassociationGetObjectV2Response = (EzsignfoldersignerassociationGetObjectV2Response) o;
    return (this.objDebugPayload == null ? ezsignfoldersignerassociationGetObjectV2Response.objDebugPayload == null : this.objDebugPayload.equals(ezsignfoldersignerassociationGetObjectV2Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsignfoldersignerassociationGetObjectV2Response.objDebug == null : this.objDebug.equals(ezsignfoldersignerassociationGetObjectV2Response.objDebug)) &&
        (this.mPayload == null ? ezsignfoldersignerassociationGetObjectV2Response.mPayload == null : this.mPayload.equals(ezsignfoldersignerassociationGetObjectV2Response.mPayload));
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
    sb.append("class EzsignfoldersignerassociationGetObjectV2Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
