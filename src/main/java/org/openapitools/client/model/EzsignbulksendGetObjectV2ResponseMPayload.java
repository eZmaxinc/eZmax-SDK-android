/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignbulksendResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignbulksend/{pkiEzsignbulksendID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignbulksend/{pkiEzsignbulksendID}")
public class EzsignbulksendGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignbulksend")
  private EzsignbulksendResponseCompound objEzsignbulksend = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksendResponseCompound getObjEzsignbulksend() {
    return objEzsignbulksend;
  }
  public void setObjEzsignbulksend(EzsignbulksendResponseCompound objEzsignbulksend) {
    this.objEzsignbulksend = objEzsignbulksend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetObjectV2ResponseMPayload ezsignbulksendGetObjectV2ResponseMPayload = (EzsignbulksendGetObjectV2ResponseMPayload) o;
    return (this.objEzsignbulksend == null ? ezsignbulksendGetObjectV2ResponseMPayload.objEzsignbulksend == null : this.objEzsignbulksend.equals(ezsignbulksendGetObjectV2ResponseMPayload.objEzsignbulksend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignbulksend == null ? 0: this.objEzsignbulksend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignbulksend: ").append(objEzsignbulksend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
