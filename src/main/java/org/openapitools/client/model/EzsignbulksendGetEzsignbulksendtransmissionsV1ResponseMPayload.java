/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignbulksendtransmissionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsignbulksend/{pkiEzsignbulksend}/getEzsignbulksendtransmissions API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsignbulksend/{pkiEzsignbulksend}/getEzsignbulksendtransmissions API Request")
public class EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload {
  
  @SerializedName("a_objEzsignbulksendtransmission")
  private List<EzsignbulksendtransmissionResponseCompound> aObjEzsignbulksendtransmission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendtransmissionResponseCompound> getAObjEzsignbulksendtransmission() {
    return aObjEzsignbulksendtransmission;
  }
  public void setAObjEzsignbulksendtransmission(List<EzsignbulksendtransmissionResponseCompound> aObjEzsignbulksendtransmission) {
    this.aObjEzsignbulksendtransmission = aObjEzsignbulksendtransmission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload ezsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload = (EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload) o;
    return (this.aObjEzsignbulksendtransmission == null ? ezsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload.aObjEzsignbulksendtransmission == null : this.aObjEzsignbulksendtransmission.equals(ezsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload.aObjEzsignbulksendtransmission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksendtransmission == null ? 0: this.aObjEzsignbulksendtransmission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignbulksendtransmission: ").append(aObjEzsignbulksendtransmission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
