/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompoundUser;
import org.openapitools.client.model.EzsignsignerResponseCompound;
import org.openapitools.client.model.EzsignsignergroupResponseCompound;
import org.openapitools.client.model.UsergroupResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignfoldersignerassociationResponseCompoundAllOf {
  
  @SerializedName("objEzsignsignergroup")
  private EzsignsignergroupResponseCompound objEzsignsignergroup = null;
  @SerializedName("objUser")
  private EzsignfoldersignerassociationResponseCompoundUser objUser = null;
  @SerializedName("objUsergroup")
  private UsergroupResponseCompound objUsergroup = null;
  @SerializedName("objEzsignsigner")
  private EzsignsignerResponseCompound objEzsignsigner = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignergroupResponseCompound getObjEzsignsignergroup() {
    return objEzsignsignergroup;
  }
  public void setObjEzsignsignergroup(EzsignsignergroupResponseCompound objEzsignsignergroup) {
    this.objEzsignsignergroup = objEzsignsignergroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfoldersignerassociationResponseCompoundUser getObjUser() {
    return objUser;
  }
  public void setObjUser(EzsignfoldersignerassociationResponseCompoundUser objUser) {
    this.objUser = objUser;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UsergroupResponseCompound getObjUsergroup() {
    return objUsergroup;
  }
  public void setObjUsergroup(UsergroupResponseCompound objUsergroup) {
    this.objUsergroup = objUsergroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignerResponseCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }
  public void setObjEzsignsigner(EzsignsignerResponseCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationResponseCompoundAllOf ezsignfoldersignerassociationResponseCompoundAllOf = (EzsignfoldersignerassociationResponseCompoundAllOf) o;
    return (this.objEzsignsignergroup == null ? ezsignfoldersignerassociationResponseCompoundAllOf.objEzsignsignergroup == null : this.objEzsignsignergroup.equals(ezsignfoldersignerassociationResponseCompoundAllOf.objEzsignsignergroup)) &&
        (this.objUser == null ? ezsignfoldersignerassociationResponseCompoundAllOf.objUser == null : this.objUser.equals(ezsignfoldersignerassociationResponseCompoundAllOf.objUser)) &&
        (this.objUsergroup == null ? ezsignfoldersignerassociationResponseCompoundAllOf.objUsergroup == null : this.objUsergroup.equals(ezsignfoldersignerassociationResponseCompoundAllOf.objUsergroup)) &&
        (this.objEzsignsigner == null ? ezsignfoldersignerassociationResponseCompoundAllOf.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationResponseCompoundAllOf.objEzsignsigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsignergroup == null ? 0: this.objEzsignsignergroup.hashCode());
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objUsergroup == null ? 0: this.objUsergroup.hashCode());
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponseCompoundAllOf {\n");
    
    sb.append("  objEzsignsignergroup: ").append(objEzsignsignergroup).append("\n");
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objUsergroup: ").append(objUsergroup).append("\n");
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
