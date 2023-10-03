/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.MultilingualEzsignsignergroupDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignsignergroup Object and children
 **/
@ApiModel(description = "A Ezsignsignergroup Object and children")
public class EzsignsignergroupRequestCompound {
  
  @SerializedName("pkiEzsignsignergroupID")
  private Integer pkiEzsignsignergroupID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("objEzsignsignergroupDescription")
  private MultilingualEzsignsignergroupDescription objEzsignsignergroupDescription = null;

  /**
   * The unique ID of the Ezsignsignergroup
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsignergroup")
  public Integer getPkiEzsignsignergroupID() {
    return pkiEzsignsignergroupID;
  }
  public void setPkiEzsignsignergroupID(Integer pkiEzsignsignergroupID) {
    this.pkiEzsignsignergroupID = pkiEzsignsignergroupID;
  }

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzsignsignergroupDescription getObjEzsignsignergroupDescription() {
    return objEzsignsignergroupDescription;
  }
  public void setObjEzsignsignergroupDescription(MultilingualEzsignsignergroupDescription objEzsignsignergroupDescription) {
    this.objEzsignsignergroupDescription = objEzsignsignergroupDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignergroupRequestCompound ezsignsignergroupRequestCompound = (EzsignsignergroupRequestCompound) o;
    return (this.pkiEzsignsignergroupID == null ? ezsignsignergroupRequestCompound.pkiEzsignsignergroupID == null : this.pkiEzsignsignergroupID.equals(ezsignsignergroupRequestCompound.pkiEzsignsignergroupID)) &&
        (this.fkiEzsignfolderID == null ? ezsignsignergroupRequestCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsignsignergroupRequestCompound.fkiEzsignfolderID)) &&
        (this.objEzsignsignergroupDescription == null ? ezsignsignergroupRequestCompound.objEzsignsignergroupDescription == null : this.objEzsignsignergroupDescription.equals(ezsignsignergroupRequestCompound.objEzsignsignergroupDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignergroupID == null ? 0: this.pkiEzsignsignergroupID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.objEzsignsignergroupDescription == null ? 0: this.objEzsignsignergroupDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupRequestCompound {\n");
    
    sb.append("  pkiEzsignsignergroupID: ").append(pkiEzsignsignergroupID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  objEzsignsignergroupDescription: ").append(objEzsignsignergroupDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}