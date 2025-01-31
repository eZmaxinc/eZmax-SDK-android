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
 * A Ezsigntemplatepackage Object
 **/
@ApiModel(description = "A Ezsigntemplatepackage Object")
public class EzsigntemplatepackageResponse {
  
  @SerializedName("pkiEzsigntemplatepackageID")
  private Integer pkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiEzdoctemplatedocumentID")
  private Integer fkiEzdoctemplatedocumentID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzdoctemplatedocumentNameX")
  private String sEzdoctemplatedocumentNameX = null;
  @SerializedName("sLanguageNameX")
  private String sLanguageNameX = null;
  @SerializedName("sEzsigntemplatepackageDescription")
  private String sEzsigntemplatepackageDescription = null;
  @SerializedName("bEzsigntemplatepackageAdminonly")
  private Boolean bEzsigntemplatepackageAdminonly = null;
  @SerializedName("bEzsigntemplatepackageNeedvalidation")
  private Boolean bEzsigntemplatepackageNeedvalidation = null;
  @SerializedName("bEzsigntemplatepackageIsactive")
  private Boolean bEzsigntemplatepackageIsactive = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("bEzsigntemplatepackageEditallowed")
  private Boolean bEzsigntemplatepackageEditallowed = null;

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getPkiEzsigntemplatepackageID() {
    return pkiEzsigntemplatepackageID;
  }
  public void setPkiEzsigntemplatepackageID(Integer pkiEzsigntemplatepackageID) {
    this.pkiEzsigntemplatepackageID = pkiEzsigntemplatepackageID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
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
   * The Name of the Language in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Language in the language of the requester")
  public String getSLanguageNameX() {
    return sLanguageNameX;
  }
  public void setSLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }

  /**
   * The description of the Ezsigntemplatepackage
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplatepackage")
  public String getSEzsigntemplatepackageDescription() {
    return sEzsigntemplatepackageDescription;
  }
  public void setSEzsigntemplatepackageDescription(String sEzsigntemplatepackageDescription) {
    this.sEzsigntemplatepackageDescription = sEzsigntemplatepackageDescription;
  }

  /**
   * Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)")
  public Boolean getBEzsigntemplatepackageAdminonly() {
    return bEzsigntemplatepackageAdminonly;
  }
  public void setBEzsigntemplatepackageAdminonly(Boolean bEzsigntemplatepackageAdminonly) {
    this.bEzsigntemplatepackageAdminonly = bEzsigntemplatepackageAdminonly;
  }

  /**
   * Whether the Ezsignbulksend was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend was automatically modified and needs a manual validation")
  public Boolean getBEzsigntemplatepackageNeedvalidation() {
    return bEzsigntemplatepackageNeedvalidation;
  }
  public void setBEzsigntemplatepackageNeedvalidation(Boolean bEzsigntemplatepackageNeedvalidation) {
    this.bEzsigntemplatepackageNeedvalidation = bEzsigntemplatepackageNeedvalidation;
  }

  /**
   * Whether the Ezsigntemplatepackage is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage is active or not")
  public Boolean getBEzsigntemplatepackageIsactive() {
    return bEzsigntemplatepackageIsactive;
  }
  public void setBEzsigntemplatepackageIsactive(Boolean bEzsigntemplatepackageIsactive) {
    this.bEzsigntemplatepackageIsactive = bEzsigntemplatepackageIsactive;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * Whether the Ezsigntemplatepackage if allowed to edit or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage if allowed to edit or not")
  public Boolean getBEzsigntemplatepackageEditallowed() {
    return bEzsigntemplatepackageEditallowed;
  }
  public void setBEzsigntemplatepackageEditallowed(Boolean bEzsigntemplatepackageEditallowed) {
    this.bEzsigntemplatepackageEditallowed = bEzsigntemplatepackageEditallowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageResponse ezsigntemplatepackageResponse = (EzsigntemplatepackageResponse) o;
    return (this.pkiEzsigntemplatepackageID == null ? ezsigntemplatepackageResponse.pkiEzsigntemplatepackageID == null : this.pkiEzsigntemplatepackageID.equals(ezsigntemplatepackageResponse.pkiEzsigntemplatepackageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplatepackageResponse.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplatepackageResponse.fkiEzsignfoldertypeID)) &&
        (this.fkiEzdoctemplatedocumentID == null ? ezsigntemplatepackageResponse.fkiEzdoctemplatedocumentID == null : this.fkiEzdoctemplatedocumentID.equals(ezsigntemplatepackageResponse.fkiEzdoctemplatedocumentID)) &&
        (this.fkiLanguageID == null ? ezsigntemplatepackageResponse.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplatepackageResponse.fkiLanguageID)) &&
        (this.sEzdoctemplatedocumentNameX == null ? ezsigntemplatepackageResponse.sEzdoctemplatedocumentNameX == null : this.sEzdoctemplatedocumentNameX.equals(ezsigntemplatepackageResponse.sEzdoctemplatedocumentNameX)) &&
        (this.sLanguageNameX == null ? ezsigntemplatepackageResponse.sLanguageNameX == null : this.sLanguageNameX.equals(ezsigntemplatepackageResponse.sLanguageNameX)) &&
        (this.sEzsigntemplatepackageDescription == null ? ezsigntemplatepackageResponse.sEzsigntemplatepackageDescription == null : this.sEzsigntemplatepackageDescription.equals(ezsigntemplatepackageResponse.sEzsigntemplatepackageDescription)) &&
        (this.bEzsigntemplatepackageAdminonly == null ? ezsigntemplatepackageResponse.bEzsigntemplatepackageAdminonly == null : this.bEzsigntemplatepackageAdminonly.equals(ezsigntemplatepackageResponse.bEzsigntemplatepackageAdminonly)) &&
        (this.bEzsigntemplatepackageNeedvalidation == null ? ezsigntemplatepackageResponse.bEzsigntemplatepackageNeedvalidation == null : this.bEzsigntemplatepackageNeedvalidation.equals(ezsigntemplatepackageResponse.bEzsigntemplatepackageNeedvalidation)) &&
        (this.bEzsigntemplatepackageIsactive == null ? ezsigntemplatepackageResponse.bEzsigntemplatepackageIsactive == null : this.bEzsigntemplatepackageIsactive.equals(ezsigntemplatepackageResponse.bEzsigntemplatepackageIsactive)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsigntemplatepackageResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsigntemplatepackageResponse.sEzsignfoldertypeNameX)) &&
        (this.bEzsigntemplatepackageEditallowed == null ? ezsigntemplatepackageResponse.bEzsigntemplatepackageEditallowed == null : this.bEzsigntemplatepackageEditallowed.equals(ezsigntemplatepackageResponse.bEzsigntemplatepackageEditallowed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackageID == null ? 0: this.pkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatedocumentID == null ? 0: this.fkiEzdoctemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzdoctemplatedocumentNameX == null ? 0: this.sEzdoctemplatedocumentNameX.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackageDescription == null ? 0: this.sEzsigntemplatepackageDescription.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageAdminonly == null ? 0: this.bEzsigntemplatepackageAdminonly.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageNeedvalidation == null ? 0: this.bEzsigntemplatepackageNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageIsactive == null ? 0: this.bEzsigntemplatepackageIsactive.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageEditallowed == null ? 0: this.bEzsigntemplatepackageEditallowed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageResponse {\n");
    
    sb.append("  pkiEzsigntemplatepackageID: ").append(pkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiEzdoctemplatedocumentID: ").append(fkiEzdoctemplatedocumentID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzdoctemplatedocumentNameX: ").append(sEzdoctemplatedocumentNameX).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  sEzsigntemplatepackageDescription: ").append(sEzsigntemplatepackageDescription).append("\n");
    sb.append("  bEzsigntemplatepackageAdminonly: ").append(bEzsigntemplatepackageAdminonly).append("\n");
    sb.append("  bEzsigntemplatepackageNeedvalidation: ").append(bEzsigntemplatepackageNeedvalidation).append("\n");
    sb.append("  bEzsigntemplatepackageIsactive: ").append(bEzsigntemplatepackageIsactive).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  bEzsigntemplatepackageEditallowed: ").append(bEzsigntemplatepackageEditallowed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
