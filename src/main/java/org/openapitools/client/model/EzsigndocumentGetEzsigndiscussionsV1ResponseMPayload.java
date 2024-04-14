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
import org.openapitools.client.model.EzsigndiscussionResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsigndiscussions
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsigndiscussions")
public class EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload {
  
  @SerializedName("a_objEzsigndiscussion")
  private List<EzsigndiscussionResponse> aObjEzsigndiscussion = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigndiscussionResponse> getAObjEzsigndiscussion() {
    return aObjEzsigndiscussion;
  }
  public void setAObjEzsigndiscussion(List<EzsigndiscussionResponse> aObjEzsigndiscussion) {
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
    EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload ezsigndocumentGetEzsigndiscussionsV1ResponseMPayload = (EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload) o;
    return (this.aObjEzsigndiscussion == null ? ezsigndocumentGetEzsigndiscussionsV1ResponseMPayload.aObjEzsigndiscussion == null : this.aObjEzsigndiscussion.equals(ezsigndocumentGetEzsigndiscussionsV1ResponseMPayload.aObjEzsigndiscussion));
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
    sb.append("class EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigndiscussion: ").append(aObjEzsigndiscussion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
