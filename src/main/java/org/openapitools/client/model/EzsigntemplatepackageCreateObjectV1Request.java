/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatepackageRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigntemplatepackage
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplatepackage")
public class EzsigntemplatepackageCreateObjectV1Request {
  
  @SerializedName("a_objEzsigntemplatepackage")
  private List<EzsigntemplatepackageRequestCompound> aObjEzsigntemplatepackage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackageRequestCompound> getAObjEzsigntemplatepackage() {
    return aObjEzsigntemplatepackage;
  }
  public void setAObjEzsigntemplatepackage(List<EzsigntemplatepackageRequestCompound> aObjEzsigntemplatepackage) {
    this.aObjEzsigntemplatepackage = aObjEzsigntemplatepackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageCreateObjectV1Request ezsigntemplatepackageCreateObjectV1Request = (EzsigntemplatepackageCreateObjectV1Request) o;
    return (this.aObjEzsigntemplatepackage == null ? ezsigntemplatepackageCreateObjectV1Request.aObjEzsigntemplatepackage == null : this.aObjEzsigntemplatepackage.equals(ezsigntemplatepackageCreateObjectV1Request.aObjEzsigntemplatepackage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatepackage == null ? 0: this.aObjEzsigntemplatepackage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigntemplatepackage: ").append(aObjEzsigntemplatepackage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
