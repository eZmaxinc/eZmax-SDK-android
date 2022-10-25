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
import org.openapitools.client.model.EzsigntemplateformfieldgroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplateformfieldgroups
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplateformfieldgroups")
public class EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload {
  
  @SerializedName("a_objEzsigntemplateformfieldgroup")
  private List<EzsigntemplateformfieldgroupResponseCompound> aObjEzsigntemplateformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldgroupResponseCompound> getAObjEzsigntemplateformfieldgroup() {
    return aObjEzsigntemplateformfieldgroup;
  }
  public void setAObjEzsigntemplateformfieldgroup(List<EzsigntemplateformfieldgroupResponseCompound> aObjEzsigntemplateformfieldgroup) {
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
    EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload = (EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload) o;
    return (this.aObjEzsigntemplateformfieldgroup == null ? ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload.aObjEzsigntemplateformfieldgroup == null : this.aObjEzsigntemplateformfieldgroup.equals(ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload.aObjEzsigntemplateformfieldgroup));
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
    sb.append("class EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigntemplateformfieldgroup: ").append(aObjEzsigntemplateformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
