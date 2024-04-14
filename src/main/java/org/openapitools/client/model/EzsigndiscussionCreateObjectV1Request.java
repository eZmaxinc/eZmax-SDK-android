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
import org.openapitools.client.model.EzsigndiscussionRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigndiscussion
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndiscussion")
public class EzsigndiscussionCreateObjectV1Request {
  
  @SerializedName("a_objEzsigndiscussion")
  private List<EzsigndiscussionRequestCompound> aObjEzsigndiscussion = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigndiscussionRequestCompound> getAObjEzsigndiscussion() {
    return aObjEzsigndiscussion;
  }
  public void setAObjEzsigndiscussion(List<EzsigndiscussionRequestCompound> aObjEzsigndiscussion) {
    this.aObjEzsigndiscussion = aObjEzsigndiscussion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndiscussionCreateObjectV1Request ezsigndiscussionCreateObjectV1Request = (EzsigndiscussionCreateObjectV1Request) o;
    return (this.aObjEzsigndiscussion == null ? ezsigndiscussionCreateObjectV1Request.aObjEzsigndiscussion == null : this.aObjEzsigndiscussion.equals(ezsigndiscussionCreateObjectV1Request.aObjEzsigndiscussion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigndiscussion == null ? 0: this.aObjEzsigndiscussion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndiscussionCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigndiscussion: ").append(aObjEzsigndiscussion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
