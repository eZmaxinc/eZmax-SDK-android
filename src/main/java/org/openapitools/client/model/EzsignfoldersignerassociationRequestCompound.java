/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationRequest;
import org.openapitools.client.model.EzsignfoldersignerassociationRequestCompoundAllOf;
import org.openapitools.client.model.EzsignsignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfoldersignerassociation Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignfoldersignerassociation Object and children to create a complete structure")
public class EzsignfoldersignerassociationRequestCompound {
  
  @SerializedName("objEzsignsigner")
  private EzsignsignerRequestCompound objEzsignsigner = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignerRequestCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }
  public void setObjEzsignsigner(EzsignsignerRequestCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }

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
    EzsignfoldersignerassociationRequestCompound ezsignfoldersignerassociationRequestCompound = (EzsignfoldersignerassociationRequestCompound) o;
    return (this.objEzsignsigner == null ? ezsignfoldersignerassociationRequestCompound.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationRequestCompound.objEzsignsigner)) &&
        (this.fkiUserID == null ? ezsignfoldersignerassociationRequestCompound.fkiUserID == null : this.fkiUserID.equals(ezsignfoldersignerassociationRequestCompound.fkiUserID)) &&
        (this.fkiEzsignfolderID == null ? ezsignfoldersignerassociationRequestCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignfoldersignerassociationRequestCompound.fkiEzsignfolderID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationRequestCompound {\n");
    
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
