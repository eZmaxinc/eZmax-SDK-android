/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfoldersignerassociation Object
 **/
@ApiModel(description = "An Ezsignfoldersignerassociation Object")
public class EzsignfoldersignerassociationRequest {
  
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;

  /**
   * A reference to a valid User.  This is only used if the signatory will be a user from the system.
   * minimum: 1
   **/
  @ApiModelProperty(value = "A reference to a valid User.  This is only used if the signatory will be a user from the system.")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationRequest ezsignfoldersignerassociationRequest = (EzsignfoldersignerassociationRequest) o;
    return (this.fkiUserID == null ? ezsignfoldersignerassociationRequest.fkiUserID == null : this.fkiUserID.equals(ezsignfoldersignerassociationRequest.fkiUserID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationRequest.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationRequest.fkiEzsignfolderID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationRequest {\n");
    
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
