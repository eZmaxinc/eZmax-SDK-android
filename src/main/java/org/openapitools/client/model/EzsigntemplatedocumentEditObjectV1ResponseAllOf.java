/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonResponseWarning;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplatedocumentEditObjectV1ResponseAllOf {
  
  @SerializedName("a_objWarning")
  private List<CommonResponseWarning> aObjWarning = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CommonResponseWarning> getAObjWarning() {
    return aObjWarning;
  }
  public void setAObjWarning(List<CommonResponseWarning> aObjWarning) {
    this.aObjWarning = aObjWarning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditObjectV1ResponseAllOf ezsigntemplatedocumentEditObjectV1ResponseAllOf = (EzsigntemplatedocumentEditObjectV1ResponseAllOf) o;
    return (this.aObjWarning == null ? ezsigntemplatedocumentEditObjectV1ResponseAllOf.aObjWarning == null : this.aObjWarning.equals(ezsigntemplatedocumentEditObjectV1ResponseAllOf.aObjWarning));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjWarning == null ? 0: this.aObjWarning.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditObjectV1ResponseAllOf {\n");
    
    sb.append("  aObjWarning: ").append(aObjWarning).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
