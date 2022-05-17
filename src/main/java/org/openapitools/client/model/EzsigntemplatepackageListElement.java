/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * An Ezsigntemplatepackage List Element
 **/
@ApiModel(description = "An Ezsigntemplatepackage List Element")
public class EzsigntemplatepackageListElement {
  
  @SerializedName("pkiEzsigntemplatepackageID")
  private Integer pkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigntemplatepackageDescription")
  private String sEzsigntemplatepackageDescription = null;
  @SerializedName("bEzsigntemplatepackageIsactive")
  private Boolean bEzsigntemplatepackageIsactive = null;
  @SerializedName("bEzsigntemplatepackageNeedvalidation")
  private Boolean bEzsigntemplatepackageNeedvalidation = null;
  @SerializedName("iEzsigntemplatepackagemembership")
  private Integer iEzsigntemplatepackagemembership = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;

  /**
   * The unique ID of the Ezsigntemplatepackage
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
   * The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage")
  public Integer getIEzsigntemplatepackagemembership() {
    return iEzsigntemplatepackagemembership;
  }
  public void setIEzsigntemplatepackagemembership(Integer iEzsigntemplatepackagemembership) {
    this.iEzsigntemplatepackagemembership = iEzsigntemplatepackagemembership;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageListElement ezsigntemplatepackageListElement = (EzsigntemplatepackageListElement) o;
    return (this.pkiEzsigntemplatepackageID == null ? ezsigntemplatepackageListElement.pkiEzsigntemplatepackageID == null : this.pkiEzsigntemplatepackageID.equals(ezsigntemplatepackageListElement.pkiEzsigntemplatepackageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplatepackageListElement.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplatepackageListElement.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplatepackageListElement.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplatepackageListElement.fkiLanguageID)) &&
        (this.sEzsigntemplatepackageDescription == null ? ezsigntemplatepackageListElement.sEzsigntemplatepackageDescription == null : this.sEzsigntemplatepackageDescription.equals(ezsigntemplatepackageListElement.sEzsigntemplatepackageDescription)) &&
        (this.bEzsigntemplatepackageIsactive == null ? ezsigntemplatepackageListElement.bEzsigntemplatepackageIsactive == null : this.bEzsigntemplatepackageIsactive.equals(ezsigntemplatepackageListElement.bEzsigntemplatepackageIsactive)) &&
        (this.bEzsigntemplatepackageNeedvalidation == null ? ezsigntemplatepackageListElement.bEzsigntemplatepackageNeedvalidation == null : this.bEzsigntemplatepackageNeedvalidation.equals(ezsigntemplatepackageListElement.bEzsigntemplatepackageNeedvalidation)) &&
        (this.iEzsigntemplatepackagemembership == null ? ezsigntemplatepackageListElement.iEzsigntemplatepackagemembership == null : this.iEzsigntemplatepackagemembership.equals(ezsigntemplatepackageListElement.iEzsigntemplatepackagemembership)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsigntemplatepackageListElement.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsigntemplatepackageListElement.sEzsignfoldertypeNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackageID == null ? 0: this.pkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackageDescription == null ? 0: this.sEzsigntemplatepackageDescription.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageIsactive == null ? 0: this.bEzsigntemplatepackageIsactive.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageNeedvalidation == null ? 0: this.bEzsigntemplatepackageNeedvalidation.hashCode());
    result = 31 * result + (this.iEzsigntemplatepackagemembership == null ? 0: this.iEzsigntemplatepackagemembership.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageListElement {\n");
    
    sb.append("  pkiEzsigntemplatepackageID: ").append(pkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigntemplatepackageDescription: ").append(sEzsigntemplatepackageDescription).append("\n");
    sb.append("  bEzsigntemplatepackageIsactive: ").append(bEzsigntemplatepackageIsactive).append("\n");
    sb.append("  bEzsigntemplatepackageNeedvalidation: ").append(bEzsigntemplatepackageNeedvalidation).append("\n");
    sb.append("  iEzsigntemplatepackagemembership: ").append(iEzsigntemplatepackagemembership).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
