/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplateformfieldgroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigntemplateformfieldgroup
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplateformfieldgroup")
public class EzsigntemplateformfieldgroupCreateObjectV1Request {
  
  @SerializedName("a_objEzsigntemplateformfieldgroup")
  private List<EzsigntemplateformfieldgroupRequestCompound> aObjEzsigntemplateformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldgroupRequestCompound> getAObjEzsigntemplateformfieldgroup() {
    return aObjEzsigntemplateformfieldgroup;
  }
  public void setAObjEzsigntemplateformfieldgroup(List<EzsigntemplateformfieldgroupRequestCompound> aObjEzsigntemplateformfieldgroup) {
    this.aObjEzsigntemplateformfieldgroup = aObjEzsigntemplateformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupCreateObjectV1Request ezsigntemplateformfieldgroupCreateObjectV1Request = (EzsigntemplateformfieldgroupCreateObjectV1Request) o;
    return (this.aObjEzsigntemplateformfieldgroup == null ? ezsigntemplateformfieldgroupCreateObjectV1Request.aObjEzsigntemplateformfieldgroup == null : this.aObjEzsigntemplateformfieldgroup.equals(ezsigntemplateformfieldgroupCreateObjectV1Request.aObjEzsigntemplateformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplateformfieldgroup == null ? 0: this.aObjEzsigntemplateformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigntemplateformfieldgroup: ").append(aObjEzsigntemplateformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
