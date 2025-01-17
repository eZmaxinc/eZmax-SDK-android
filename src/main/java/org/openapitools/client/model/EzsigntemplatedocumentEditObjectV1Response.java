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

import java.util.*;
import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import org.openapitools.client.model.CommonResponseWarning;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 **/
@ApiModel(description = "Response for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}")
public class EzsigntemplatedocumentEditObjectV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("a_objWarning")
  private List<CommonResponseWarning> aObjWarning = null;

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
  @ApiModelProperty(value = "")
  public List<CommonResponseWarning> getAObjWarning() {
    return aObjWarning;
  }
  public void setAObjWarning(List<CommonResponseWarning> aObjWarning) {
    this.aObjWarning = aObjWarning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditObjectV1Response ezsigntemplatedocumentEditObjectV1Response = (EzsigntemplatedocumentEditObjectV1Response) o;
    return (this.objDebugPayload == null ? ezsigntemplatedocumentEditObjectV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezsigntemplatedocumentEditObjectV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezsigntemplatedocumentEditObjectV1Response.objDebug == null : this.objDebug.equals(ezsigntemplatedocumentEditObjectV1Response.objDebug)) &&
        (this.aObjWarning == null ? ezsigntemplatedocumentEditObjectV1Response.aObjWarning == null : this.aObjWarning.equals(ezsigntemplatedocumentEditObjectV1Response.aObjWarning));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    result = 31 * result + (this.aObjWarning == null ? 0: this.aObjWarning.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditObjectV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  aObjWarning: ").append(aObjWarning).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
