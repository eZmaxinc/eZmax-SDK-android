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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures
 **/
@ApiModel(description = "Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures")
public class EzsigndocumentEditEzsignsignaturesV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignsignatureID")
  private List<Integer> aPkiEzsignsignatureID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsignsignatureID() {
    return aPkiEzsignsignatureID;
  }
  public void setAPkiEzsignsignatureID(List<Integer> aPkiEzsignsignatureID) {
    this.aPkiEzsignsignatureID = aPkiEzsignsignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentEditEzsignsignaturesV1ResponseMPayload ezsigndocumentEditEzsignsignaturesV1ResponseMPayload = (EzsigndocumentEditEzsignsignaturesV1ResponseMPayload) o;
    return (this.aPkiEzsignsignatureID == null ? ezsigndocumentEditEzsignsignaturesV1ResponseMPayload.aPkiEzsignsignatureID == null : this.aPkiEzsignsignatureID.equals(ezsigndocumentEditEzsignsignaturesV1ResponseMPayload.aPkiEzsignsignatureID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignsignatureID == null ? 0: this.aPkiEzsignsignatureID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentEditEzsignsignaturesV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignsignatureID: ").append(aPkiEzsignsignatureID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
