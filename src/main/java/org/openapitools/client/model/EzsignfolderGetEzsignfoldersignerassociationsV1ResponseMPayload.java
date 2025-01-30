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
import org.openapitools.client.model.CustomEzsignfoldersignerassociationActionableElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsignfoldersignerassociations
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsignfoldersignerassociations")
public class EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload {
  
  @SerializedName("a_objEzsignfoldersignerassociation")
  private List<CustomEzsignfoldersignerassociationActionableElementResponse> aObjEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldersignerassociationActionableElementResponse> getAObjEzsignfoldersignerassociation() {
    return aObjEzsignfoldersignerassociation;
  }
  public void setAObjEzsignfoldersignerassociation(List<CustomEzsignfoldersignerassociationActionableElementResponse> aObjEzsignfoldersignerassociation) {
    this.aObjEzsignfoldersignerassociation = aObjEzsignfoldersignerassociation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload ezsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload = (EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload) o;
    return (this.aObjEzsignfoldersignerassociation == null ? ezsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload.aObjEzsignfoldersignerassociation == null : this.aObjEzsignfoldersignerassociation.equals(ezsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload.aObjEzsignfoldersignerassociation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldersignerassociation == null ? 0: this.aObjEzsignfoldersignerassociation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignfoldersignerassociation: ").append(aObjEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
