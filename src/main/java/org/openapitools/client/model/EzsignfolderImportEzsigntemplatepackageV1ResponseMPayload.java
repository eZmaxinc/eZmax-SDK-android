/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigndocumentResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage")
public class EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload {
  
  @SerializedName("a_objEzsigndocument")
  private List<EzsigndocumentResponseCompound> aObjEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigndocumentResponseCompound> getAObjEzsigndocument() {
    return aObjEzsigndocument;
  }
  public void setAObjEzsigndocument(List<EzsigndocumentResponseCompound> aObjEzsigndocument) {
    this.aObjEzsigndocument = aObjEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload ezsignfolderImportEzsigntemplatepackageV1ResponseMPayload = (EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload) o;
    return (this.aObjEzsigndocument == null ? ezsignfolderImportEzsigntemplatepackageV1ResponseMPayload.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(ezsignfolderImportEzsigntemplatepackageV1ResponseMPayload.aObjEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigndocument == null ? 0: this.aObjEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
