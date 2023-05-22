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
import org.openapitools.client.model.CustomEzsigndocumentEzsignsignaturesAutomaticResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object in the context of an EzsignsignaturesAutomatic path
 **/
@ApiModel(description = "An Ezsignfolder Object in the context of an EzsignsignaturesAutomatic path")
public class CustomEzsignfolderEzsignsignaturesAutomaticResponse {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("a_objEzsigndocument")
  private List<CustomEzsigndocumentEzsignsignaturesAutomaticResponse> aObjEzsigndocument = null;

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
  }

  /**
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsigndocumentEzsignsignaturesAutomaticResponse> getAObjEzsigndocument() {
    return aObjEzsigndocument;
  }
  public void setAObjEzsigndocument(List<CustomEzsigndocumentEzsignsignaturesAutomaticResponse> aObjEzsigndocument) {
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
    CustomEzsignfolderEzsignsignaturesAutomaticResponse customEzsignfolderEzsignsignaturesAutomaticResponse = (CustomEzsignfolderEzsignsignaturesAutomaticResponse) o;
    return (this.pkiEzsignfolderID == null ? customEzsignfolderEzsignsignaturesAutomaticResponse.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(customEzsignfolderEzsignsignaturesAutomaticResponse.pkiEzsignfolderID)) &&
        (this.sEzsignfolderDescription == null ? customEzsignfolderEzsignsignaturesAutomaticResponse.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customEzsignfolderEzsignsignaturesAutomaticResponse.sEzsignfolderDescription)) &&
        (this.aObjEzsigndocument == null ? customEzsignfolderEzsignsignaturesAutomaticResponse.aObjEzsigndocument == null : this.aObjEzsigndocument.equals(customEzsignfolderEzsignsignaturesAutomaticResponse.aObjEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.aObjEzsigndocument == null ? 0: this.aObjEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfolderEzsignsignaturesAutomaticResponse {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  aObjEzsigndocument: ").append(aObjEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}