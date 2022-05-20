/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignformfieldgroupResponseCompound;
import org.openapitools.client.model.EzsignsignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements")
public class EzsigndocumentGetActionableElementsV1ResponseMPayload {
  
  @SerializedName("a_objEzsignsignature")
  private List<EzsignsignatureResponseCompound> aObjEzsignsignature = null;
  @SerializedName("a_objEzsignformfieldgroup")
  private List<EzsignformfieldgroupResponseCompound> aObjEzsignformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignsignatureResponseCompound> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<EzsignsignatureResponseCompound> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldgroupResponseCompound> getAObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }
  public void setAObjEzsignformfieldgroup(List<EzsignformfieldgroupResponseCompound> aObjEzsignformfieldgroup) {
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
    EzsigndocumentGetActionableElementsV1ResponseMPayload ezsigndocumentGetActionableElementsV1ResponseMPayload = (EzsigndocumentGetActionableElementsV1ResponseMPayload) o;
    return (this.aObjEzsignsignature == null ? ezsigndocumentGetActionableElementsV1ResponseMPayload.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(ezsigndocumentGetActionableElementsV1ResponseMPayload.aObjEzsignsignature)) &&
        (this.aObjEzsignformfieldgroup == null ? ezsigndocumentGetActionableElementsV1ResponseMPayload.aObjEzsignformfieldgroup == null : this.aObjEzsignformfieldgroup.equals(ezsigndocumentGetActionableElementsV1ResponseMPayload.aObjEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    result = 31 * result + (this.aObjEzsignformfieldgroup == null ? 0: this.aObjEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetActionableElementsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("  aObjEzsignformfieldgroup: ").append(aObjEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}