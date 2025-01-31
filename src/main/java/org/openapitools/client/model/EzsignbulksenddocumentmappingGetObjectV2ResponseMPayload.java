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

import org.openapitools.client.model.EzsignbulksenddocumentmappingResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}")
public class EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignbulksenddocumentmapping")
  private EzsignbulksenddocumentmappingResponseCompound objEzsignbulksenddocumentmapping = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksenddocumentmappingResponseCompound getObjEzsignbulksenddocumentmapping() {
    return objEzsignbulksenddocumentmapping;
  }
  public void setObjEzsignbulksenddocumentmapping(EzsignbulksenddocumentmappingResponseCompound objEzsignbulksenddocumentmapping) {
    this.objEzsignbulksenddocumentmapping = objEzsignbulksenddocumentmapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload ezsignbulksenddocumentmappingGetObjectV2ResponseMPayload = (EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload) o;
    return (this.objEzsignbulksenddocumentmapping == null ? ezsignbulksenddocumentmappingGetObjectV2ResponseMPayload.objEzsignbulksenddocumentmapping == null : this.objEzsignbulksenddocumentmapping.equals(ezsignbulksenddocumentmappingGetObjectV2ResponseMPayload.objEzsignbulksenddocumentmapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignbulksenddocumentmapping == null ? 0: this.objEzsignbulksenddocumentmapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignbulksenddocumentmapping: ").append(objEzsignbulksenddocumentmapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
