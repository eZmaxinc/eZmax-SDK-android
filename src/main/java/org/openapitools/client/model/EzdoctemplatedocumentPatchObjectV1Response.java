/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for PATCH /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}
 **/
@ApiModel(description = "Response for PATCH /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}")
public class EzdoctemplatedocumentPatchObjectV1Response {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatedocumentPatchObjectV1Response ezdoctemplatedocumentPatchObjectV1Response = (EzdoctemplatedocumentPatchObjectV1Response) o;
    return (this.objDebugPayload == null ? ezdoctemplatedocumentPatchObjectV1Response.objDebugPayload == null : this.objDebugPayload.equals(ezdoctemplatedocumentPatchObjectV1Response.objDebugPayload)) &&
        (this.objDebug == null ? ezdoctemplatedocumentPatchObjectV1Response.objDebug == null : this.objDebug.equals(ezdoctemplatedocumentPatchObjectV1Response.objDebug));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatedocumentPatchObjectV1Response {\n");
    
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
