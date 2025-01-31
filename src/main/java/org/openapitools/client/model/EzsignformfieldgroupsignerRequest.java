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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignformfieldgroupsigner Object
 **/
@ApiModel(description = "A Ezsignformfieldgroupsigner Object")
public class EzsignformfieldgroupsignerRequest {
  
  @SerializedName("pkiEzsignformfieldgroupsignerID")
  private Integer pkiEzsignformfieldgroupsignerID = null;
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;

  /**
   * The unique ID of the Ezsignformfieldgroupsigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfieldgroupsigner")
  public Integer getPkiEzsignformfieldgroupsignerID() {
    return pkiEzsignformfieldgroupsignerID;
  }
  public void setPkiEzsignformfieldgroupsignerID(Integer pkiEzsignformfieldgroupsignerID) {
    this.pkiEzsignformfieldgroupsignerID = pkiEzsignformfieldgroupsignerID;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }
  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupsignerRequest ezsignformfieldgroupsignerRequest = (EzsignformfieldgroupsignerRequest) o;
    return (this.pkiEzsignformfieldgroupsignerID == null ? ezsignformfieldgroupsignerRequest.pkiEzsignformfieldgroupsignerID == null : this.pkiEzsignformfieldgroupsignerID.equals(ezsignformfieldgroupsignerRequest.pkiEzsignformfieldgroupsignerID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsignformfieldgroupsignerRequest.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsignformfieldgroupsignerRequest.fkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignformfieldgroupsignerID == null ? 0: this.pkiEzsignformfieldgroupsignerID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupsignerRequest {\n");
    
    sb.append("  pkiEzsignformfieldgroupsignerID: ").append(pkiEzsignformfieldgroupsignerID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
