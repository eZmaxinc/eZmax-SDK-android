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

import java.util.*;
import org.openapitools.client.model.EzsignbulksenddocumentmappingResponseCompound;
import org.openapitools.client.model.EzsignbulksendsignermappingResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignbulksendResponseCompoundAllOf {
  
  @SerializedName("a_objEzsignbulksenddocumentmapping")
  private List<EzsignbulksenddocumentmappingResponseCompound> aObjEzsignbulksenddocumentmapping = null;
  @SerializedName("a_objEzsignbulksendsignermapping")
  private List<EzsignbulksendsignermappingResponse> aObjEzsignbulksendsignermapping = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksenddocumentmappingResponseCompound> getAObjEzsignbulksenddocumentmapping() {
    return aObjEzsignbulksenddocumentmapping;
  }
  public void setAObjEzsignbulksenddocumentmapping(List<EzsignbulksenddocumentmappingResponseCompound> aObjEzsignbulksenddocumentmapping) {
    this.aObjEzsignbulksenddocumentmapping = aObjEzsignbulksenddocumentmapping;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendsignermappingResponse> getAObjEzsignbulksendsignermapping() {
    return aObjEzsignbulksendsignermapping;
  }
  public void setAObjEzsignbulksendsignermapping(List<EzsignbulksendsignermappingResponse> aObjEzsignbulksendsignermapping) {
    this.aObjEzsignbulksendsignermapping = aObjEzsignbulksendsignermapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendResponseCompoundAllOf ezsignbulksendResponseCompoundAllOf = (EzsignbulksendResponseCompoundAllOf) o;
    return (this.aObjEzsignbulksenddocumentmapping == null ? ezsignbulksendResponseCompoundAllOf.aObjEzsignbulksenddocumentmapping == null : this.aObjEzsignbulksenddocumentmapping.equals(ezsignbulksendResponseCompoundAllOf.aObjEzsignbulksenddocumentmapping)) &&
        (this.aObjEzsignbulksendsignermapping == null ? ezsignbulksendResponseCompoundAllOf.aObjEzsignbulksendsignermapping == null : this.aObjEzsignbulksendsignermapping.equals(ezsignbulksendResponseCompoundAllOf.aObjEzsignbulksendsignermapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksenddocumentmapping == null ? 0: this.aObjEzsignbulksenddocumentmapping.hashCode());
    result = 31 * result + (this.aObjEzsignbulksendsignermapping == null ? 0: this.aObjEzsignbulksendsignermapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzsignbulksenddocumentmapping: ").append(aObjEzsignbulksenddocumentmapping).append("\n");
    sb.append("  aObjEzsignbulksendsignermapping: ").append(aObjEzsignbulksendsignermapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
