/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignfoldertypeListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignfoldertypeGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objEzsignfoldertype")
  private List<EzsignfoldertypeListElement> aObjEzsignfoldertype = null;

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfoldertypeListElement> getAObjEzsignfoldertype() {
    return aObjEzsignfoldertype;
  }
  public void setAObjEzsignfoldertype(List<EzsignfoldertypeListElement> aObjEzsignfoldertype) {
    this.aObjEzsignfoldertype = aObjEzsignfoldertype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeGetListV1ResponseMPayloadAllOf ezsignfoldertypeGetListV1ResponseMPayloadAllOf = (EzsignfoldertypeGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjEzsignfoldertype == null ? ezsignfoldertypeGetListV1ResponseMPayloadAllOf.aObjEzsignfoldertype == null : this.aObjEzsignfoldertype.equals(ezsignfoldertypeGetListV1ResponseMPayloadAllOf.aObjEzsignfoldertype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldertype == null ? 0: this.aObjEzsignfoldertype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjEzsignfoldertype: ").append(aObjEzsignfoldertype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
