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

import org.openapitools.client.model.EzsigndocumentRequest;
import org.openapitools.client.model.EzsigndocumentRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigndocument
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndocument")
public class EzsigndocumentCreateObjectV1Request {
  
  @SerializedName("objEzsigndocument")
  private EzsigndocumentRequest objEzsigndocument = null;
  @SerializedName("objEzsigndocumentCompound")
  private EzsigndocumentRequestCompound objEzsigndocumentCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigndocumentRequest getObjEzsigndocument() {
    return objEzsigndocument;
  }
  public void setObjEzsigndocument(EzsigndocumentRequest objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigndocumentRequestCompound getObjEzsigndocumentCompound() {
    return objEzsigndocumentCompound;
  }
  public void setObjEzsigndocumentCompound(EzsigndocumentRequestCompound objEzsigndocumentCompound) {
    this.objEzsigndocumentCompound = objEzsigndocumentCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateObjectV1Request ezsigndocumentCreateObjectV1Request = (EzsigndocumentCreateObjectV1Request) o;
    return (this.objEzsigndocument == null ? ezsigndocumentCreateObjectV1Request.objEzsigndocument == null : this.objEzsigndocument.equals(ezsigndocumentCreateObjectV1Request.objEzsigndocument)) &&
        (this.objEzsigndocumentCompound == null ? ezsigndocumentCreateObjectV1Request.objEzsigndocumentCompound == null : this.objEzsigndocumentCompound.equals(ezsigndocumentCreateObjectV1Request.objEzsigndocumentCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigndocument == null ? 0: this.objEzsigndocument.hashCode());
    result = 31 * result + (this.objEzsigndocumentCompound == null ? 0: this.objEzsigndocumentCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateObjectV1Request {\n");
    
    sb.append("  objEzsigndocument: ").append(objEzsigndocument).append("\n");
    sb.append("  objEzsigndocumentCompound: ").append(objEzsigndocumentCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
