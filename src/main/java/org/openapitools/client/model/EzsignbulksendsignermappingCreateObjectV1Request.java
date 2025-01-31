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
import org.openapitools.client.model.EzsignbulksendsignermappingRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignbulksendsignermapping
 **/
@ApiModel(description = "Request for POST /1/object/ezsignbulksendsignermapping")
public class EzsignbulksendsignermappingCreateObjectV1Request {
  
  @SerializedName("a_objEzsignbulksendsignermapping")
  private List<EzsignbulksendsignermappingRequestCompound> aObjEzsignbulksendsignermapping = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendsignermappingRequestCompound> getAObjEzsignbulksendsignermapping() {
    return aObjEzsignbulksendsignermapping;
  }
  public void setAObjEzsignbulksendsignermapping(List<EzsignbulksendsignermappingRequestCompound> aObjEzsignbulksendsignermapping) {
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
    EzsignbulksendsignermappingCreateObjectV1Request ezsignbulksendsignermappingCreateObjectV1Request = (EzsignbulksendsignermappingCreateObjectV1Request) o;
    return (this.aObjEzsignbulksendsignermapping == null ? ezsignbulksendsignermappingCreateObjectV1Request.aObjEzsignbulksendsignermapping == null : this.aObjEzsignbulksendsignermapping.equals(ezsignbulksendsignermappingCreateObjectV1Request.aObjEzsignbulksendsignermapping));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksendsignermapping == null ? 0: this.aObjEzsignbulksendsignermapping.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendsignermappingCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsignbulksendsignermapping: ").append(aObjEzsignbulksendsignermapping).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
