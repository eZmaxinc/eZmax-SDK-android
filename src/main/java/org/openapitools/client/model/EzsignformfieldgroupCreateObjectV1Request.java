/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignformfieldgroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsignformfieldgroup/createObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignformfieldgroup/createObject API Request")
public class EzsignformfieldgroupCreateObjectV1Request {
  
  @SerializedName("a_objEzsignformfieldgroup")
  private List<EzsignformfieldgroupRequestCompound> aObjEzsignformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldgroupRequestCompound> getAObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }
  public void setAObjEzsignformfieldgroup(List<EzsignformfieldgroupRequestCompound> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupCreateObjectV1Request ezsignformfieldgroupCreateObjectV1Request = (EzsignformfieldgroupCreateObjectV1Request) o;
    return (this.aObjEzsignformfieldgroup == null ? ezsignformfieldgroupCreateObjectV1Request.aObjEzsignformfieldgroup == null : this.aObjEzsignformfieldgroup.equals(ezsignformfieldgroupCreateObjectV1Request.aObjEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignformfieldgroup == null ? 0: this.aObjEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsignformfieldgroup: ").append(aObjEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
