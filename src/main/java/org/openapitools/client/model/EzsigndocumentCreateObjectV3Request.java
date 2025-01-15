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
import org.openapitools.client.model.EzsigndocumentRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /3/object/ezsigndocument
 **/
@ApiModel(description = "Request for POST /3/object/ezsigndocument")
public class EzsigndocumentCreateObjectV3Request {
  
  @SerializedName("a_objEzsigndocument")
  private List<EzsigndocumentRequestCompound> aObjEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigndocumentRequestCompound> getAObjEzsigndocument() {
    return aObjEzsigndocument;
  }
  public void setAObjEzsigndocument(List<EzsigndocumentRequestCompound> aObjEzsigndocument) {
    this.aObjEzsigndocument = aObjEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateObjectV3Request ezsigndocumentCreateObjectV3Request = (EzsigndocumentCreateObjectV3Request) o;
    return (this.aObjEzsigndocument == null ? ezsigndocumentCreateObjectV3Request.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(ezsigndocumentCreateObjectV3Request.aObjEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigndocument == null ? 0: this.aObjEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateObjectV3Request {\n");
    
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
