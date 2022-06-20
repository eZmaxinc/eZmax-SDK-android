/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigndocumentRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsigndocument
 **/
@ApiModel(description = "Request for POST /2/object/ezsigndocument")
public class EzsigndocumentCreateObjectV2Request {
  
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
    EzsigndocumentCreateObjectV2Request ezsigndocumentCreateObjectV2Request = (EzsigndocumentCreateObjectV2Request) o;
    return (this.aObjEzsigndocument == null ? ezsigndocumentCreateObjectV2Request.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(ezsigndocumentCreateObjectV2Request.aObjEzsigndocument));
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
    sb.append("class EzsigndocumentCreateObjectV2Request {\n");
    
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
