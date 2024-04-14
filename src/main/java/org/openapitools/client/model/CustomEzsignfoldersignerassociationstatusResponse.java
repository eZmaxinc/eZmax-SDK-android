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
import org.openapitools.client.model.CustomEzsignsignaturestatusResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignfoldersignerassociationstatus Object and children to create a complete structure
 **/
@ApiModel(description = "A Ezsignfoldersignerassociationstatus Object and children to create a complete structure")
public class CustomEzsignfoldersignerassociationstatusResponse {
  
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("sEzsignfoldersignerassociationstatusLastname")
  private String sEzsignfoldersignerassociationstatusLastname = null;
  @SerializedName("sEzsignfoldersignerassociationstatusFirstname")
  private String sEzsignfoldersignerassociationstatusFirstname = null;
  @SerializedName("sEzsignfoldersignerassociationstatusDescriptionX")
  private String sEzsignfoldersignerassociationstatusDescriptionX = null;
  @SerializedName("a_objEzsignsignaturestatus")
  private List<CustomEzsignsignaturestatusResponse> aObjEzsignsignaturestatus = null;

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
   * The last name of the Ezsignsigner
   **/
  @ApiModelProperty(value = "The last name of the Ezsignsigner")
  public String getSEzsignfoldersignerassociationstatusLastname() {
    return sEzsignfoldersignerassociationstatusLastname;
  }
  public void setSEzsignfoldersignerassociationstatusLastname(String sEzsignfoldersignerassociationstatusLastname) {
    this.sEzsignfoldersignerassociationstatusLastname = sEzsignfoldersignerassociationstatusLastname;
  }

  /**
   * The first name of the Ezsignsigner
   **/
  @ApiModelProperty(value = "The first name of the Ezsignsigner")
  public String getSEzsignfoldersignerassociationstatusFirstname() {
    return sEzsignfoldersignerassociationstatusFirstname;
  }
  public void setSEzsignfoldersignerassociationstatusFirstname(String sEzsignfoldersignerassociationstatusFirstname) {
    this.sEzsignfoldersignerassociationstatusFirstname = sEzsignfoldersignerassociationstatusFirstname;
  }

  /**
   * The description of the Ezsignsigner
   **/
  @ApiModelProperty(value = "The description of the Ezsignsigner")
  public String getSEzsignfoldersignerassociationstatusDescriptionX() {
    return sEzsignfoldersignerassociationstatusDescriptionX;
  }
  public void setSEzsignfoldersignerassociationstatusDescriptionX(String sEzsignfoldersignerassociationstatusDescriptionX) {
    this.sEzsignfoldersignerassociationstatusDescriptionX = sEzsignfoldersignerassociationstatusDescriptionX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignsignaturestatusResponse> getAObjEzsignsignaturestatus() {
    return aObjEzsignsignaturestatus;
  }
  public void setAObjEzsignsignaturestatus(List<CustomEzsignsignaturestatusResponse> aObjEzsignsignaturestatus) {
    this.aObjEzsignsignaturestatus = aObjEzsignsignaturestatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldersignerassociationstatusResponse customEzsignfoldersignerassociationstatusResponse = (CustomEzsignfoldersignerassociationstatusResponse) o;
    return (this.fkiEzsignfoldersignerassociationID == null ? customEzsignfoldersignerassociationstatusResponse.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(customEzsignfoldersignerassociationstatusResponse.fkiEzsignfoldersignerassociationID)) &&
        (this.sEzsignfoldersignerassociationstatusLastname == null ? customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusLastname == null : this.sEzsignfoldersignerassociationstatusLastname.equals(customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusLastname)) &&
        (this.sEzsignfoldersignerassociationstatusFirstname == null ? customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusFirstname == null : this.sEzsignfoldersignerassociationstatusFirstname.equals(customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusFirstname)) &&
        (this.sEzsignfoldersignerassociationstatusDescriptionX == null ? customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusDescriptionX == null : this.sEzsignfoldersignerassociationstatusDescriptionX.equals(customEzsignfoldersignerassociationstatusResponse.sEzsignfoldersignerassociationstatusDescriptionX)) &&
        (this.aObjEzsignsignaturestatus == null ? customEzsignfoldersignerassociationstatusResponse.aObjEzsignsignaturestatus == null : this.aObjEzsignsignaturestatus.equals(customEzsignfoldersignerassociationstatusResponse.aObjEzsignsignaturestatus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.sEzsignfoldersignerassociationstatusLastname == null ? 0: this.sEzsignfoldersignerassociationstatusLastname.hashCode());
    result = 31 * result + (this.sEzsignfoldersignerassociationstatusFirstname == null ? 0: this.sEzsignfoldersignerassociationstatusFirstname.hashCode());
    result = 31 * result + (this.sEzsignfoldersignerassociationstatusDescriptionX == null ? 0: this.sEzsignfoldersignerassociationstatusDescriptionX.hashCode());
    result = 31 * result + (this.aObjEzsignsignaturestatus == null ? 0: this.aObjEzsignsignaturestatus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldersignerassociationstatusResponse {\n");
    
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  sEzsignfoldersignerassociationstatusLastname: ").append(sEzsignfoldersignerassociationstatusLastname).append("\n");
    sb.append("  sEzsignfoldersignerassociationstatusFirstname: ").append(sEzsignfoldersignerassociationstatusFirstname).append("\n");
    sb.append("  sEzsignfoldersignerassociationstatusDescriptionX: ").append(sEzsignfoldersignerassociationstatusDescriptionX).append("\n");
    sb.append("  aObjEzsignsignaturestatus: ").append(aObjEzsignsignaturestatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
