/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomFormDataEzsignformfieldgroupResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A form Data Signer Object
 **/
@ApiModel(description = "A form Data Signer Object")
public class CustomFormDataSignerResponse {
  
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("sContactFirstname")
  private String sContactFirstname = null;
  @SerializedName("sContactLastname")
  private String sContactLastname = null;
  @SerializedName("a_objEzsignformfieldgroup")
  private List<CustomFormDataEzsignformfieldgroupResponse> aObjEzsignformfieldgroup = null;

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

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The First name of the contact
   **/
  @ApiModelProperty(required = true, value = "The First name of the contact")
  public String getSContactFirstname() {
    return sContactFirstname;
  }
  public void setSContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }

  /**
   * The Last name of the contact
   **/
  @ApiModelProperty(required = true, value = "The Last name of the contact")
  public String getSContactLastname() {
    return sContactLastname;
  }
  public void setSContactLastname(String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomFormDataEzsignformfieldgroupResponse> getAObjEzsignformfieldgroup() {
    return aObjEzsignformfieldgroup;
  }
  public void setAObjEzsignformfieldgroup(List<CustomFormDataEzsignformfieldgroupResponse> aObjEzsignformfieldgroup) {
    this.aObjEzsignformfieldgroup = aObjEzsignformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormDataSignerResponse customFormDataSignerResponse = (CustomFormDataSignerResponse) o;
    return (this.fkiEzsignfoldersignerassociationID == null ? customFormDataSignerResponse.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(customFormDataSignerResponse.fkiEzsignfoldersignerassociationID)) &&
        (this.fkiUserID == null ? customFormDataSignerResponse.fkiUserID == null : this.fkiUserID.equals(customFormDataSignerResponse.fkiUserID)) &&
        (this.sContactFirstname == null ? customFormDataSignerResponse.sContactFirstname == null : this.sContactFirstname.equals(customFormDataSignerResponse.sContactFirstname)) &&
        (this.sContactLastname == null ? customFormDataSignerResponse.sContactLastname == null : this.sContactLastname.equals(customFormDataSignerResponse.sContactLastname)) &&
        (this.aObjEzsignformfieldgroup == null ? customFormDataSignerResponse.aObjEzsignformfieldgroup == null : this.aObjEzsignformfieldgroup.equals(customFormDataSignerResponse.aObjEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.sContactFirstname == null ? 0: this.sContactFirstname.hashCode());
    result = 31 * result + (this.sContactLastname == null ? 0: this.sContactLastname.hashCode());
    result = 31 * result + (this.aObjEzsignformfieldgroup == null ? 0: this.aObjEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormDataSignerResponse {\n");
    
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  sContactFirstname: ").append(sContactFirstname).append("\n");
    sb.append("  sContactLastname: ").append(sContactLastname).append("\n");
    sb.append("  aObjEzsignformfieldgroup: ").append(aObjEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
