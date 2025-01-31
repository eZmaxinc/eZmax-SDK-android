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
import org.openapitools.client.model.EzsignbulksenddocumentmappingRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignbulksenddocumentmapping
 **/
@ApiModel(description = "Request for POST /1/object/ezsignbulksenddocumentmapping")
public class EzsignbulksenddocumentmappingCreateObjectV1Request {
  
  @SerializedName("a_objEzsignbulksenddocumentmapping")
  private List<EzsignbulksenddocumentmappingRequestCompound> aObjEzsignbulksenddocumentmapping = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksenddocumentmappingRequestCompound> getAObjEzsignbulksenddocumentmapping() {
    return aObjEzsignbulksenddocumentmapping;
  }
  public void setAObjEzsignbulksenddocumentmapping(List<EzsignbulksenddocumentmappingRequestCompound> aObjEzsignbulksenddocumentmapping) {
    this.aObjEzsignbulksenddocumentmapping = aObjEzsignbulksenddocumentmapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingCreateObjectV1Request ezsignbulksenddocumentmappingCreateObjectV1Request = (EzsignbulksenddocumentmappingCreateObjectV1Request) o;
    return (this.aObjEzsignbulksenddocumentmapping == null ? ezsignbulksenddocumentmappingCreateObjectV1Request.aObjEzsignbulksenddocumentmapping == null : this.aObjEzsignbulksenddocumentmapping.equals(ezsignbulksenddocumentmappingCreateObjectV1Request.aObjEzsignbulksenddocumentmapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksenddocumentmapping == null ? 0: this.aObjEzsignbulksenddocumentmapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsignbulksenddocumentmapping: ").append(aObjEzsignbulksenddocumentmapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
