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

import org.openapitools.client.model.EzsignformfieldgroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}")
public class EzsignformfieldgroupGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignformfieldgroup")
  private EzsignformfieldgroupResponseCompound objEzsignformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignformfieldgroupResponseCompound getObjEzsignformfieldgroup() {
    return objEzsignformfieldgroup;
  }
  public void setObjEzsignformfieldgroup(EzsignformfieldgroupResponseCompound objEzsignformfieldgroup) {
    this.objEzsignformfieldgroup = objEzsignformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupGetObjectV2ResponseMPayload ezsignformfieldgroupGetObjectV2ResponseMPayload = (EzsignformfieldgroupGetObjectV2ResponseMPayload) o;
    return (this.objEzsignformfieldgroup == null ? ezsignformfieldgroupGetObjectV2ResponseMPayload.objEzsignformfieldgroup == null : this.objEzsignformfieldgroup.equals(ezsignformfieldgroupGetObjectV2ResponseMPayload.objEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignformfieldgroup == null ? 0: this.objEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignformfieldgroup: ").append(objEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}