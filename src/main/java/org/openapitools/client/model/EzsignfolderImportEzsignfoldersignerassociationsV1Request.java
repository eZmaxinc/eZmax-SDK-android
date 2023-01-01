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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations")
public class EzsignfolderImportEzsignfoldersignerassociationsV1Request {
  
  @SerializedName("a_fkiEzsignfoldersignerassociationID")
  private Set<Integer> aFkiEzsignfoldersignerassociationID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Set<Integer> getAFkiEzsignfoldersignerassociationID() {
    return aFkiEzsignfoldersignerassociationID;
  }
  public void setAFkiEzsignfoldersignerassociationID(Set<Integer> aFkiEzsignfoldersignerassociationID) {
    this.aFkiEzsignfoldersignerassociationID = aFkiEzsignfoldersignerassociationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderImportEzsignfoldersignerassociationsV1Request ezsignfolderImportEzsignfoldersignerassociationsV1Request = (EzsignfolderImportEzsignfoldersignerassociationsV1Request) o;
    return (this.aFkiEzsignfoldersignerassociationID == null ? ezsignfolderImportEzsignfoldersignerassociationsV1Request.aFkiEzsignfoldersignerassociationID == null : this.aFkiEzsignfoldersignerassociationID.equals(ezsignfolderImportEzsignfoldersignerassociationsV1Request.aFkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aFkiEzsignfoldersignerassociationID == null ? 0: this.aFkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderImportEzsignfoldersignerassociationsV1Request {\n");
    
    sb.append("  aFkiEzsignfoldersignerassociationID: ").append(aFkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
