/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatesignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigntemplatesigner
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplatesigner")
public class EzsigntemplatesignerCreateObjectV1Request {
  
  @SerializedName("a_objEzsigntemplatesigner")
  private List<EzsigntemplatesignerRequestCompound> aObjEzsigntemplatesigner = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatesignerRequestCompound> getAObjEzsigntemplatesigner() {
    return aObjEzsigntemplatesigner;
  }
  public void setAObjEzsigntemplatesigner(List<EzsigntemplatesignerRequestCompound> aObjEzsigntemplatesigner) {
    this.aObjEzsigntemplatesigner = aObjEzsigntemplatesigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerCreateObjectV1Request ezsigntemplatesignerCreateObjectV1Request = (EzsigntemplatesignerCreateObjectV1Request) o;
    return (this.aObjEzsigntemplatesigner == null ? ezsigntemplatesignerCreateObjectV1Request.aObjEzsigntemplatesigner == null : this.aObjEzsigntemplatesigner.equals(ezsigntemplatesignerCreateObjectV1Request.aObjEzsigntemplatesigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatesigner == null ? 0: this.aObjEzsigntemplatesigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigntemplatesigner: ").append(aObjEzsigntemplatesigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
