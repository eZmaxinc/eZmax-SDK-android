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
import org.openapitools.client.model.EzsigntemplatesignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigntemplatesignature
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplatesignature")
public class EzsigntemplatesignatureCreateObjectV1Request {
  
  @SerializedName("a_objEzsigntemplatesignature")
  private List<EzsigntemplatesignatureRequestCompound> aObjEzsigntemplatesignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatesignatureRequestCompound> getAObjEzsigntemplatesignature() {
    return aObjEzsigntemplatesignature;
  }
  public void setAObjEzsigntemplatesignature(List<EzsigntemplatesignatureRequestCompound> aObjEzsigntemplatesignature) {
    this.aObjEzsigntemplatesignature = aObjEzsigntemplatesignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureCreateObjectV1Request ezsigntemplatesignatureCreateObjectV1Request = (EzsigntemplatesignatureCreateObjectV1Request) o;
    return (this.aObjEzsigntemplatesignature == null ? ezsigntemplatesignatureCreateObjectV1Request.aObjEzsigntemplatesignature == null : this.aObjEzsigntemplatesignature.equals(ezsigntemplatesignatureCreateObjectV1Request.aObjEzsigntemplatesignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatesignature == null ? 0: this.aObjEzsigntemplatesignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigntemplatesignature: ").append(aObjEzsigntemplatesignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
