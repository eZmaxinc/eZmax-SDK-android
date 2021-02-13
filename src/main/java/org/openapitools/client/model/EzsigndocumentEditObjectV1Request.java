/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.
 *
 * The version of the OpenAPI document: 1.0.30
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigndocumentRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsigndocument/editObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsigndocument/editObject API Request")
public class EzsigndocumentEditObjectV1Request {
  
  @SerializedName("objEzsigndocument")
  private EzsigndocumentRequest objEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigndocumentRequest getObjEzsigndocument() {
    return objEzsigndocument;
  }
  public void setObjEzsigndocument(EzsigndocumentRequest objEzsigndocument) {
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
    EzsigndocumentEditObjectV1Request ezsigndocumentEditObjectV1Request = (EzsigndocumentEditObjectV1Request) o;
    return (this.objEzsigndocument == null ? ezsigndocumentEditObjectV1Request.objEzsigndocument == null : this.objEzsigndocument.equals(ezsigndocumentEditObjectV1Request.objEzsigndocument));
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
    sb.append("class EzsigndocumentEditObjectV1Request {\n");
    
    sb.append("  objEzsigndocument: ").append(objEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
