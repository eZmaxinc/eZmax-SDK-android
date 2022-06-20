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

import org.openapitools.client.model.EzsigntemplateformfieldgroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}")
public class EzsigntemplateformfieldgroupEditObjectV1Request {
  
  @SerializedName("objEzsigntemplateformfieldgroup")
  private EzsigntemplateformfieldgroupRequestCompound objEzsigntemplateformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplateformfieldgroupRequestCompound getObjEzsigntemplateformfieldgroup() {
    return objEzsigntemplateformfieldgroup;
  }
  public void setObjEzsigntemplateformfieldgroup(EzsigntemplateformfieldgroupRequestCompound objEzsigntemplateformfieldgroup) {
    this.objEzsigntemplateformfieldgroup = objEzsigntemplateformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupEditObjectV1Request ezsigntemplateformfieldgroupEditObjectV1Request = (EzsigntemplateformfieldgroupEditObjectV1Request) o;
    return (this.objEzsigntemplateformfieldgroup == null ? ezsigntemplateformfieldgroupEditObjectV1Request.objEzsigntemplateformfieldgroup == null : this.objEzsigntemplateformfieldgroup.equals(ezsigntemplateformfieldgroupEditObjectV1Request.objEzsigntemplateformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplateformfieldgroup == null ? 0: this.objEzsigntemplateformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplateformfieldgroup: ").append(objEzsigntemplateformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
