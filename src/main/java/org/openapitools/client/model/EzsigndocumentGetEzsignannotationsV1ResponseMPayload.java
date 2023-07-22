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
import org.openapitools.client.model.EzsignannotationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignannotations
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignannotations")
public class EzsigndocumentGetEzsignannotationsV1ResponseMPayload {
  
  @SerializedName("a_objEzsignannotation")
  private List<EzsignannotationResponseCompound> aObjEzsignannotation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignannotationResponseCompound> getAObjEzsignannotation() {
    return aObjEzsignannotation;
  }
  public void setAObjEzsignannotation(List<EzsignannotationResponseCompound> aObjEzsignannotation) {
    this.aObjEzsignannotation = aObjEzsignannotation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetEzsignannotationsV1ResponseMPayload ezsigndocumentGetEzsignannotationsV1ResponseMPayload = (EzsigndocumentGetEzsignannotationsV1ResponseMPayload) o;
    return (this.aObjEzsignannotation == null ? ezsigndocumentGetEzsignannotationsV1ResponseMPayload.aObjEzsignannotation == null : this.aObjEzsignannotation.equals(ezsigndocumentGetEzsignannotationsV1ResponseMPayload.aObjEzsignannotation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignannotation == null ? 0: this.aObjEzsignannotation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetEzsignannotationsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignannotation: ").append(aObjEzsignannotation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
