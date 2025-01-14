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

import org.openapitools.client.model.FieldEEzsigntemplatepackagesignerMapping;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatepackagesigner Object
 **/
@ApiModel(description = "A Ezsigntemplatepackagesigner Object")
public class EzsigntemplatepackagesignerResponse {
  
  @SerializedName("pkiEzsigntemplatepackagesignerID")
  private Integer pkiEzsigntemplatepackagesignerID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzdoctemplatedocumentID")
  private Integer fkiEzdoctemplatedocumentID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("sEzdoctemplatedocumentNameX")
  private String sEzdoctemplatedocumentNameX = null;
  @SerializedName("bEzsigntemplatepackagesignerReceivecopy")
  private Boolean bEzsigntemplatepackagesignerReceivecopy = null;
  @SerializedName("eEzsigntemplatepackagesignerMapping")
  private FieldEEzsigntemplatepackagesignerMapping eEzsigntemplatepackagesignerMapping = null;
  @SerializedName("sEzsigntemplatepackagesignerDescription")
  private String sEzsigntemplatepackagesignerDescription = null;
  @SerializedName("sUserName")
  private String sUserName = null;
  @SerializedName("sUsergroupNameX")
  private String sUsergroupNameX = null;

  /**
   * The unique ID of the Ezsigntemplatepackagesigner
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagesigner")
  public Integer getPkiEzsigntemplatepackagesignerID() {
    return pkiEzsigntemplatepackagesignerID;
  }
  public void setPkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }
  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }

  /**
   * The unique ID of the Ezdoctemplatedocument
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezdoctemplatedocument")
  public Integer getFkiEzdoctemplatedocumentID() {
    return fkiEzdoctemplatedocumentID;
  }
  public void setFkiEzdoctemplatedocumentID(Integer fkiEzdoctemplatedocumentID) {
    this.fkiEzdoctemplatedocumentID = fkiEzdoctemplatedocumentID;
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
   * The unique ID of the Usergroup
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroup")
  public Integer getFkiUsergroupID() {
    return fkiUsergroupID;
  }
  public void setFkiUsergroupID(Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
  }

  /**
   * The name of the Ezdoctemplatedocument in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezdoctemplatedocument in the language of the requester")
  public String getSEzdoctemplatedocumentNameX() {
    return sEzdoctemplatedocumentNameX;
  }
  public void setSEzdoctemplatedocumentNameX(String sEzdoctemplatedocumentNameX) {
    this.sEzdoctemplatedocumentNameX = sEzdoctemplatedocumentNameX;
  }

  /**
   * If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
   **/
  @ApiModelProperty(value = "If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.")
  public Boolean getBEzsigntemplatepackagesignerReceivecopy() {
    return bEzsigntemplatepackagesignerReceivecopy;
  }
  public void setBEzsigntemplatepackagesignerReceivecopy(Boolean bEzsigntemplatepackagesignerReceivecopy) {
    this.bEzsigntemplatepackagesignerReceivecopy = bEzsigntemplatepackagesignerReceivecopy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplatepackagesignerMapping getEEzsigntemplatepackagesignerMapping() {
    return eEzsigntemplatepackagesignerMapping;
  }
  public void setEEzsigntemplatepackagesignerMapping(FieldEEzsigntemplatepackagesignerMapping eEzsigntemplatepackagesignerMapping) {
    this.eEzsigntemplatepackagesignerMapping = eEzsigntemplatepackagesignerMapping;
  }

  /**
   * The description of the Ezsigntemplatepackagesigner
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplatepackagesigner")
  public String getSEzsigntemplatepackagesignerDescription() {
    return sEzsigntemplatepackagesignerDescription;
  }
  public void setSEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
  }

  /**
   * The description of the User in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the User in the language of the requester")
  public String getSUserName() {
    return sUserName;
  }
  public void setSUserName(String sUserName) {
    this.sUserName = sUserName;
  }

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Usergroup in the language of the requester")
  public String getSUsergroupNameX() {
    return sUsergroupNameX;
  }
  public void setSUsergroupNameX(String sUsergroupNameX) {
    this.sUsergroupNameX = sUsergroupNameX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerResponse ezsigntemplatepackagesignerResponse = (EzsigntemplatepackagesignerResponse) o;
    return (this.pkiEzsigntemplatepackagesignerID == null ? ezsigntemplatepackagesignerResponse.pkiEzsigntemplatepackagesignerID == null : this.pkiEzsigntemplatepackagesignerID.equals(ezsigntemplatepackagesignerResponse.pkiEzsigntemplatepackagesignerID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsigntemplatepackagesignerResponse.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsigntemplatepackagesignerResponse.fkiEzsigntemplatepackageID)) &&
        (this.fkiEzdoctemplatedocumentID == null ? ezsigntemplatepackagesignerResponse.fkiEzdoctemplatedocumentID == null : this.fkiEzdoctemplatedocumentID.equals(ezsigntemplatepackagesignerResponse.fkiEzdoctemplatedocumentID)) &&
        (this.fkiUserID == null ? ezsigntemplatepackagesignerResponse.fkiUserID == null : this.fkiUserID.equals(ezsigntemplatepackagesignerResponse.fkiUserID)) &&
        (this.fkiUsergroupID == null ? ezsigntemplatepackagesignerResponse.fkiUsergroupID == null : this.fkiUsergroupID.equals(ezsigntemplatepackagesignerResponse.fkiUsergroupID)) &&
        (this.sEzdoctemplatedocumentNameX == null ? ezsigntemplatepackagesignerResponse.sEzdoctemplatedocumentNameX == null : this.sEzdoctemplatedocumentNameX.equals(ezsigntemplatepackagesignerResponse.sEzdoctemplatedocumentNameX)) &&
        (this.bEzsigntemplatepackagesignerReceivecopy == null ? ezsigntemplatepackagesignerResponse.bEzsigntemplatepackagesignerReceivecopy == null : this.bEzsigntemplatepackagesignerReceivecopy.equals(ezsigntemplatepackagesignerResponse.bEzsigntemplatepackagesignerReceivecopy)) &&
        (this.eEzsigntemplatepackagesignerMapping == null ? ezsigntemplatepackagesignerResponse.eEzsigntemplatepackagesignerMapping == null : this.eEzsigntemplatepackagesignerMapping.equals(ezsigntemplatepackagesignerResponse.eEzsigntemplatepackagesignerMapping)) &&
        (this.sEzsigntemplatepackagesignerDescription == null ? ezsigntemplatepackagesignerResponse.sEzsigntemplatepackagesignerDescription == null : this.sEzsigntemplatepackagesignerDescription.equals(ezsigntemplatepackagesignerResponse.sEzsigntemplatepackagesignerDescription)) &&
        (this.sUserName == null ? ezsigntemplatepackagesignerResponse.sUserName == null : this.sUserName.equals(ezsigntemplatepackagesignerResponse.sUserName)) &&
        (this.sUsergroupNameX == null ? ezsigntemplatepackagesignerResponse.sUsergroupNameX == null : this.sUsergroupNameX.equals(ezsigntemplatepackagesignerResponse.sUsergroupNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackagesignerID == null ? 0: this.pkiEzsigntemplatepackagesignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatedocumentID == null ? 0: this.fkiEzdoctemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.sEzdoctemplatedocumentNameX == null ? 0: this.sEzdoctemplatedocumentNameX.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackagesignerReceivecopy == null ? 0: this.bEzsigntemplatepackagesignerReceivecopy.hashCode());
    result = 31 * result + (this.eEzsigntemplatepackagesignerMapping == null ? 0: this.eEzsigntemplatepackagesignerMapping.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackagesignerDescription == null ? 0: this.sEzsigntemplatepackagesignerDescription.hashCode());
    result = 31 * result + (this.sUserName == null ? 0: this.sUserName.hashCode());
    result = 31 * result + (this.sUsergroupNameX == null ? 0: this.sUsergroupNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerResponse {\n");
    
    sb.append("  pkiEzsigntemplatepackagesignerID: ").append(pkiEzsigntemplatepackagesignerID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzdoctemplatedocumentID: ").append(fkiEzdoctemplatedocumentID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  sEzdoctemplatedocumentNameX: ").append(sEzdoctemplatedocumentNameX).append("\n");
    sb.append("  bEzsigntemplatepackagesignerReceivecopy: ").append(bEzsigntemplatepackagesignerReceivecopy).append("\n");
    sb.append("  eEzsigntemplatepackagesignerMapping: ").append(eEzsigntemplatepackagesignerMapping).append("\n");
    sb.append("  sEzsigntemplatepackagesignerDescription: ").append(sEzsigntemplatepackagesignerDescription).append("\n");
    sb.append("  sUserName: ").append(sUserName).append("\n");
    sb.append("  sUsergroupNameX: ").append(sUsergroupNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
