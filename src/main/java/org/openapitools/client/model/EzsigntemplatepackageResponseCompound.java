/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatepackageResponse;
import org.openapitools.client.model.EzsigntemplatepackageResponseCompoundAllOf;
import org.openapitools.client.model.EzsigntemplatepackagemembershipResponseCompound;
import org.openapitools.client.model.EzsigntemplatepackagesignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatepackage Object
 **/
@ApiModel(description = "A Ezsigntemplatepackage Object")
public class EzsigntemplatepackageResponseCompound {
  
  @SerializedName("pkiEzsigntemplatepackageID")
  private Integer pkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
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
  @SerializedName("a_objEzsigntemplatepackagesigner")
  private List<EzsigntemplatepackagesignerResponseCompound> aObjEzsigntemplatepackagesigner = null;
  @SerializedName("a_objEzsigntemplatepackagemembership")
  private List<EzsigntemplatepackagemembershipResponseCompound> aObjEzsigntemplatepackagemembership = null;

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
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagesignerResponseCompound> getAObjEzsigntemplatepackagesigner() {
    return aObjEzsigntemplatepackagesigner;
  }
  public void setAObjEzsigntemplatepackagesigner(List<EzsigntemplatepackagesignerResponseCompound> aObjEzsigntemplatepackagesigner) {
    this.aObjEzsigntemplatepackagesigner = aObjEzsigntemplatepackagesigner;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagemembershipResponseCompound> getAObjEzsigntemplatepackagemembership() {
    return aObjEzsigntemplatepackagemembership;
  }
  public void setAObjEzsigntemplatepackagemembership(List<EzsigntemplatepackagemembershipResponseCompound> aObjEzsigntemplatepackagemembership) {
    this.aObjEzsigntemplatepackagemembership = aObjEzsigntemplatepackagemembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageResponseCompound ezsigntemplatepackageResponseCompound = (EzsigntemplatepackageResponseCompound) o;
    return (this.pkiEzsigntemplatepackageID == null ? ezsigntemplatepackageResponseCompound.pkiEzsigntemplatepackageID == null : this.pkiEzsigntemplatepackageID.equals(ezsigntemplatepackageResponseCompound.pkiEzsigntemplatepackageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplatepackageResponseCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplatepackageResponseCompound.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplatepackageResponseCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplatepackageResponseCompound.fkiLanguageID)) &&
        (this.sLanguageNameX == null ? ezsigntemplatepackageResponseCompound.sLanguageNameX == null : this.sLanguageNameX.equals(ezsigntemplatepackageResponseCompound.sLanguageNameX)) &&
        (this.sEzsigntemplatepackageDescription == null ? ezsigntemplatepackageResponseCompound.sEzsigntemplatepackageDescription == null : this.sEzsigntemplatepackageDescription.equals(ezsigntemplatepackageResponseCompound.sEzsigntemplatepackageDescription)) &&
        (this.bEzsigntemplatepackageAdminonly == null ? ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageAdminonly == null : this.bEzsigntemplatepackageAdminonly.equals(ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageAdminonly)) &&
        (this.bEzsigntemplatepackageNeedvalidation == null ? ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageNeedvalidation == null : this.bEzsigntemplatepackageNeedvalidation.equals(ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageNeedvalidation)) &&
        (this.bEzsigntemplatepackageIsactive == null ? ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageIsactive == null : this.bEzsigntemplatepackageIsactive.equals(ezsigntemplatepackageResponseCompound.bEzsigntemplatepackageIsactive)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsigntemplatepackageResponseCompound.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsigntemplatepackageResponseCompound.sEzsignfoldertypeNameX)) &&
        (this.aObjEzsigntemplatepackagesigner == null ? ezsigntemplatepackageResponseCompound.aObjEzsigntemplatepackagesigner == null : this.aObjEzsigntemplatepackagesigner.equals(ezsigntemplatepackageResponseCompound.aObjEzsigntemplatepackagesigner)) &&
        (this.aObjEzsigntemplatepackagemembership == null ? ezsigntemplatepackageResponseCompound.aObjEzsigntemplatepackagemembership == null : this.aObjEzsigntemplatepackagemembership.equals(ezsigntemplatepackageResponseCompound.aObjEzsigntemplatepackagemembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackageID == null ? 0: this.pkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackageDescription == null ? 0: this.sEzsigntemplatepackageDescription.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageAdminonly == null ? 0: this.bEzsigntemplatepackageAdminonly.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageNeedvalidation == null ? 0: this.bEzsigntemplatepackageNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageIsactive == null ? 0: this.bEzsigntemplatepackageIsactive.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatepackagesigner == null ? 0: this.aObjEzsigntemplatepackagesigner.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatepackagemembership == null ? 0: this.aObjEzsigntemplatepackagemembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageResponseCompound {\n");
    
    sb.append("  pkiEzsigntemplatepackageID: ").append(pkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  sEzsigntemplatepackageDescription: ").append(sEzsigntemplatepackageDescription).append("\n");
    sb.append("  bEzsigntemplatepackageAdminonly: ").append(bEzsigntemplatepackageAdminonly).append("\n");
    sb.append("  bEzsigntemplatepackageNeedvalidation: ").append(bEzsigntemplatepackageNeedvalidation).append("\n");
    sb.append("  bEzsigntemplatepackageIsactive: ").append(bEzsigntemplatepackageIsactive).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  aObjEzsigntemplatepackagesigner: ").append(aObjEzsigntemplatepackagesigner).append("\n");
    sb.append("  aObjEzsigntemplatepackagemembership: ").append(aObjEzsigntemplatepackagemembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
