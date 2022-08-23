/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigndocumentRequestPatch;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PATCH /1/object/ezsigndocument/{pkiEzsigndocumentID}
 **/
@ApiModel(description = "Request for PATCH /1/object/ezsigndocument/{pkiEzsigndocumentID}")
public class EzsigndocumentPatchObjectV1Request {
  
  @SerializedName("objEzsigndocument")
  private EzsigndocumentRequestPatch objEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigndocumentRequestPatch getObjEzsigndocument() {
    return objEzsigndocument;
  }
  public void setObjEzsigndocument(EzsigndocumentRequestPatch objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentPatchObjectV1Request ezsigndocumentPatchObjectV1Request = (EzsigndocumentPatchObjectV1Request) o;
    return (this.objEzsigndocument == null ? ezsigndocumentPatchObjectV1Request.objEzsigndocument == null : this.objEzsigndocument.equals(ezsigndocumentPatchObjectV1Request.objEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigndocument == null ? 0: this.objEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentPatchObjectV1Request {\n");
    
    sb.append("  objEzsigndocument: ").append(objEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
