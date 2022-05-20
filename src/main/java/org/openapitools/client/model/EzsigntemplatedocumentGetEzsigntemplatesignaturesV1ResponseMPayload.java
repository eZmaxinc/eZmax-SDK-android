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
import org.openapitools.client.model.EzsigntemplatesignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplatesignatures
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplatesignatures")
public class EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload {
  
  @SerializedName("a_objEzsigntemplatesignature")
  private List<EzsigntemplatesignatureResponseCompound> aObjEzsigntemplatesignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatesignatureResponseCompound> getAObjEzsigntemplatesignature() {
    return aObjEzsigntemplatesignature;
  }
  public void setAObjEzsigntemplatesignature(List<EzsigntemplatesignatureResponseCompound> aObjEzsigntemplatesignature) {
    this.aObjEzsigntemplatesignature = aObjEzsigntemplatesignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload ezsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload = (EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload) o;
    return (this.aObjEzsigntemplatesignature == null ? ezsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload.aObjEzsigntemplatesignature == null : this.aObjEzsigntemplatesignature.equals(ezsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload.aObjEzsigntemplatesignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatesignature == null ? 0: this.aObjEzsigntemplatesignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigntemplatesignature: ").append(aObjEzsigntemplatesignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}