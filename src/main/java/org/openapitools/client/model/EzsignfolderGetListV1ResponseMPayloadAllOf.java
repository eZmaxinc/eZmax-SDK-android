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
import org.openapitools.client.model.EzsignfolderListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignfolderGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objEzsignfolder")
  private List<EzsignfolderListElement> aObjEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfolderListElement> getAObjEzsignfolder() {
    return aObjEzsignfolder;
  }
  public void setAObjEzsignfolder(List<EzsignfolderListElement> aObjEzsignfolder) {
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
    EzsignfolderGetListV1ResponseMPayloadAllOf ezsignfolderGetListV1ResponseMPayloadAllOf = (EzsignfolderGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjEzsignfolder == null ? ezsignfolderGetListV1ResponseMPayloadAllOf.aObjEzsignfolder == null : this.aObjEzsignfolder.equals(ezsignfolderGetListV1ResponseMPayloadAllOf.aObjEzsignfolder));
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
    sb.append("class EzsignfolderGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjEzsignfolder: ").append(aObjEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
