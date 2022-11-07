/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignbulksendsignermappingResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}")
public class EzsignbulksendsignermappingGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignbulksendsignermapping")
  private EzsignbulksendsignermappingResponseCompound objEzsignbulksendsignermapping = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksendsignermappingResponseCompound getObjEzsignbulksendsignermapping() {
    return objEzsignbulksendsignermapping;
  }
  public void setObjEzsignbulksendsignermapping(EzsignbulksendsignermappingResponseCompound objEzsignbulksendsignermapping) {
    this.objEzsignbulksendsignermapping = objEzsignbulksendsignermapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendsignermappingGetObjectV2ResponseMPayload ezsignbulksendsignermappingGetObjectV2ResponseMPayload = (EzsignbulksendsignermappingGetObjectV2ResponseMPayload) o;
    return (this.objEzsignbulksendsignermapping == null ? ezsignbulksendsignermappingGetObjectV2ResponseMPayload.objEzsignbulksendsignermapping == null : this.objEzsignbulksendsignermapping.equals(ezsignbulksendsignermappingGetObjectV2ResponseMPayload.objEzsignbulksendsignermapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignbulksendsignermapping == null ? 0: this.objEzsignbulksendsignermapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendsignermappingGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignbulksendsignermapping: ").append(objEzsignbulksendsignermapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
