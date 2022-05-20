/**
 * eZmax API Definition (Full)
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

import org.openapitools.client.model.EzsignbulksendtransmissionResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission")
public class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload {
  
  @SerializedName("objEzsignbulksendtransmission")
  private EzsignbulksendtransmissionResponse objEzsignbulksendtransmission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksendtransmissionResponse getObjEzsignbulksendtransmission() {
    return objEzsignbulksendtransmission;
  }
  public void setObjEzsignbulksendtransmission(EzsignbulksendtransmissionResponse objEzsignbulksendtransmission) {
    this.objEzsignbulksendtransmission = objEzsignbulksendtransmission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload = (EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload) o;
    return (this.objEzsignbulksendtransmission == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.objEzsignbulksendtransmission == null : this.objEzsignbulksendtransmission.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.objEzsignbulksendtransmission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignbulksendtransmission == null ? 0: this.objEzsignbulksendtransmission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload {\n");
    
    sb.append("  objEzsignbulksendtransmission: ").append(objEzsignbulksendtransmission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}