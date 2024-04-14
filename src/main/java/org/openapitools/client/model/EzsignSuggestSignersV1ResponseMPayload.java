/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomUserResponse;
import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/module/ezsign/suggestSigners
 **/
@ApiModel(description = "Payload for GET /1/module/ezsign/suggestSigners")
public class EzsignSuggestSignersV1ResponseMPayload {
  
  @SerializedName("a_objEzsignfoldersignerassociation")
  private List<EzsignfoldersignerassociationResponseCompound> aObjEzsignfoldersignerassociation = null;
  @SerializedName("a_objUserTeam")
  private List<CustomUserResponse> aObjUserTeam = null;
  @SerializedName("a_objUser")
  private List<CustomUserResponse> aObjUser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfoldersignerassociationResponseCompound> getAObjEzsignfoldersignerassociation() {
    return aObjEzsignfoldersignerassociation;
  }
  public void setAObjEzsignfoldersignerassociation(List<EzsignfoldersignerassociationResponseCompound> aObjEzsignfoldersignerassociation) {
    this.aObjEzsignfoldersignerassociation = aObjEzsignfoldersignerassociation;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomUserResponse> getAObjUserTeam() {
    return aObjUserTeam;
  }
  public void setAObjUserTeam(List<CustomUserResponse> aObjUserTeam) {
    this.aObjUserTeam = aObjUserTeam;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomUserResponse> getAObjUser() {
    return aObjUser;
  }
  public void setAObjUser(List<CustomUserResponse> aObjUser) {
    this.aObjUser = aObjUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignSuggestSignersV1ResponseMPayload ezsignSuggestSignersV1ResponseMPayload = (EzsignSuggestSignersV1ResponseMPayload) o;
    return (this.aObjEzsignfoldersignerassociation == null ? ezsignSuggestSignersV1ResponseMPayload.aObjEzsignfoldersignerassociation == null : this.aObjEzsignfoldersignerassociation.equals(ezsignSuggestSignersV1ResponseMPayload.aObjEzsignfoldersignerassociation)) &&
        (this.aObjUserTeam == null ? ezsignSuggestSignersV1ResponseMPayload.aObjUserTeam == null : this.aObjUserTeam.equals(ezsignSuggestSignersV1ResponseMPayload.aObjUserTeam)) &&
        (this.aObjUser == null ? ezsignSuggestSignersV1ResponseMPayload.aObjUser == null : this.aObjUser.equals(ezsignSuggestSignersV1ResponseMPayload.aObjUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldersignerassociation == null ? 0: this.aObjEzsignfoldersignerassociation.hashCode());
    result = 31 * result + (this.aObjUserTeam == null ? 0: this.aObjUserTeam.hashCode());
    result = 31 * result + (this.aObjUser == null ? 0: this.aObjUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignSuggestSignersV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignfoldersignerassociation: ").append(aObjEzsignfoldersignerassociation).append("\n");
    sb.append("  aObjUserTeam: ").append(aObjUserTeam).append("\n");
    sb.append("  aObjUser: ").append(aObjUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
