/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * Payload for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures
 **/
@ApiModel(description = "Payload for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures")
public class EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplatesignatureID")
  private List<Integer> aPkiEzsigntemplatesignatureID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsigntemplatesignatureID() {
    return aPkiEzsigntemplatesignatureID;
  }
  public void setAPkiEzsigntemplatesignatureID(List<Integer> aPkiEzsigntemplatesignatureID) {
    this.aPkiEzsigntemplatesignatureID = aPkiEzsigntemplatesignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload ezsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload = (EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplatesignatureID == null ? ezsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.aPkiEzsigntemplatesignatureID == null : this.aPkiEzsigntemplatesignatureID.equals(ezsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.aPkiEzsigntemplatesignatureID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplatesignatureID == null ? 0: this.aPkiEzsigntemplatesignatureID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplatesignatureID: ").append(aPkiEzsigntemplatesignatureID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
