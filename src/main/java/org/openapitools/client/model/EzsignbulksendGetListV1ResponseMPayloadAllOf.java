/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignbulksendListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignbulksendGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objEzsignfolder")
  private List<EzsignbulksendListElement> aObjEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EzsignbulksendListElement> getAObjEzsignfolder() {
    return aObjEzsignfolder;
  }
  public void setAObjEzsignfolder(List<EzsignbulksendListElement> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendGetListV1ResponseMPayloadAllOf ezsignbulksendGetListV1ResponseMPayloadAllOf = (EzsignbulksendGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjEzsignfolder == null ? ezsignbulksendGetListV1ResponseMPayloadAllOf.aObjEzsignfolder == null : this.aObjEzsignfolder.equals(ezsignbulksendGetListV1ResponseMPayloadAllOf.aObjEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfolder == null ? 0: this.aObjEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjEzsignfolder: ").append(aObjEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
