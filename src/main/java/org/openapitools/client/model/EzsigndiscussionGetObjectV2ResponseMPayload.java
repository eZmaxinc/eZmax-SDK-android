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

import org.openapitools.client.model.EzsigndiscussionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigndiscussion/{pkiEzsigndiscussionID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigndiscussion/{pkiEzsigndiscussionID}")
public class EzsigndiscussionGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigndiscussion")
  private EzsigndiscussionResponseCompound objEzsigndiscussion = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigndiscussionResponseCompound getObjEzsigndiscussion() {
    return objEzsigndiscussion;
  }
  public void setObjEzsigndiscussion(EzsigndiscussionResponseCompound objEzsigndiscussion) {
    this.objEzsigndiscussion = objEzsigndiscussion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndiscussionGetObjectV2ResponseMPayload ezsigndiscussionGetObjectV2ResponseMPayload = (EzsigndiscussionGetObjectV2ResponseMPayload) o;
    return (this.objEzsigndiscussion == null ? ezsigndiscussionGetObjectV2ResponseMPayload.objEzsigndiscussion == null : this.objEzsigndiscussion.equals(ezsigndiscussionGetObjectV2ResponseMPayload.objEzsigndiscussion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigndiscussion == null ? 0: this.objEzsigndiscussion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndiscussionGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigndiscussion: ").append(objEzsigndiscussion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
