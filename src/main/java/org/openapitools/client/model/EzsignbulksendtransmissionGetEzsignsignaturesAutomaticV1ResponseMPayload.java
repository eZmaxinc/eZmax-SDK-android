/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomEzsignfolderEzsignsignaturesAutomaticResponse;
import org.openapitools.client.model.FieldEEzsignsignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic")
public class EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload {
  
  @SerializedName("a_eEzsignsignatureType")
  private Set<FieldEEzsignsignatureType> aEEzsignsignatureType = null;
  @SerializedName("a_objEzsignfolder")
  private List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> aObjEzsignfolder = null;

  /**
   * All eEzsignsignatureType contained in the response
   **/
  @ApiModelProperty(required = true, value = "All eEzsignsignatureType contained in the response")
  public Set<FieldEEzsignsignatureType> getAEEzsignsignatureType() {
    return aEEzsignsignatureType;
  }
  public void setAEEzsignsignatureType(Set<FieldEEzsignsignatureType> aEEzsignsignatureType) {
    this.aEEzsignsignatureType = aEEzsignsignatureType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> getAObjEzsignfolder() {
    return aObjEzsignfolder;
  }
  public void setAObjEzsignfolder(List<CustomEzsignfolderEzsignsignaturesAutomaticResponse> aObjEzsignfolder) {
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
    EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload = (EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload) o;
    return (this.aEEzsignsignatureType == null ? ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aEEzsignsignatureType == null : this.aEEzsignsignatureType.equals(ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aEEzsignsignatureType)) &&
        (this.aObjEzsignfolder == null ? ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aObjEzsignfolder == null : this.aObjEzsignfolder.equals(ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.aObjEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aEEzsignsignatureType == null ? 0: this.aEEzsignsignatureType.hashCode());
    result = 31 * result + (this.aObjEzsignfolder == null ? 0: this.aObjEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload {\n");
    
    sb.append("  aEEzsignsignatureType: ").append(aEEzsignsignatureType).append("\n");
    sb.append("  aObjEzsignfolder: ").append(aObjEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
