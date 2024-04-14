/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups
 **/
@ApiModel(description = "Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups")
public class EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignformfieldgroupID")
  private List<Integer> aPkiEzsignformfieldgroupID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsignformfieldgroupID() {
    return aPkiEzsignformfieldgroupID;
  }
  public void setAPkiEzsignformfieldgroupID(List<Integer> aPkiEzsignformfieldgroupID) {
    this.aPkiEzsignformfieldgroupID = aPkiEzsignformfieldgroupID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload ezsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload = (EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload) o;
    return (this.aPkiEzsignformfieldgroupID == null ? ezsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload.aPkiEzsignformfieldgroupID == null : this.aPkiEzsignformfieldgroupID.equals(ezsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload.aPkiEzsignformfieldgroupID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignformfieldgroupID == null ? 0: this.aPkiEzsignformfieldgroupID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignformfieldgroupID: ").append(aPkiEzsignformfieldgroupID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
