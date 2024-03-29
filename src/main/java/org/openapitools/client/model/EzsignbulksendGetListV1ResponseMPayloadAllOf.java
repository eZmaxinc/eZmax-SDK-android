/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
  
  @SerializedName("a_objEzsignbulksend")
  private List<EzsignbulksendListElement> aObjEzsignbulksend = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendListElement> getAObjEzsignbulksend() {
    return aObjEzsignbulksend;
  }
  public void setAObjEzsignbulksend(List<EzsignbulksendListElement> aObjEzsignbulksend) {
    this.aObjEzsignbulksend = aObjEzsignbulksend;
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
    return (this.aObjEzsignbulksend == null ? ezsignbulksendGetListV1ResponseMPayloadAllOf.aObjEzsignbulksend == null : this.aObjEzsignbulksend.equals(ezsignbulksendGetListV1ResponseMPayloadAllOf.aObjEzsignbulksend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksend == null ? 0: this.aObjEzsignbulksend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjEzsignbulksend: ").append(aObjEzsignbulksend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
