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
import org.openapitools.client.model.EzsignsignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignsignatures
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignsignatures")
public class EzsigndocumentGetEzsignsignaturesV1ResponseMPayload {
  
  @SerializedName("a_objEzsignsignature")
  private List<EzsignsignatureResponseCompound> aObjEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignsignatureResponseCompound> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<EzsignsignatureResponseCompound> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetEzsignsignaturesV1ResponseMPayload ezsigndocumentGetEzsignsignaturesV1ResponseMPayload = (EzsigndocumentGetEzsignsignaturesV1ResponseMPayload) o;
    return (this.aObjEzsignsignature == null ? ezsigndocumentGetEzsignsignaturesV1ResponseMPayload.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(ezsigndocumentGetEzsignsignaturesV1ResponseMPayload.aObjEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetEzsignsignaturesV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
