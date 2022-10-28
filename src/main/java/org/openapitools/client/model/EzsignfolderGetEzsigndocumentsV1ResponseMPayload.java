/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsigndocuments
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsigndocuments")
public class EzsignfolderGetEzsigndocumentsV1ResponseMPayload {
  
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
    EzsignfolderGetEzsigndocumentsV1ResponseMPayload ezsignfolderGetEzsigndocumentsV1ResponseMPayload = (EzsignfolderGetEzsigndocumentsV1ResponseMPayload) o;
    return (this.aObjEzsigndocument == null ? ezsignfolderGetEzsigndocumentsV1ResponseMPayload.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(ezsignfolderGetEzsigndocumentsV1ResponseMPayload.aObjEzsigndocument));
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
    sb.append("class EzsignfolderGetEzsigndocumentsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
