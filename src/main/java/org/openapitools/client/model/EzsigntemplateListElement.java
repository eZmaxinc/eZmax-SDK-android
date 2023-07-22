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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplate List Element
 **/
@ApiModel(description = "A Ezsigntemplate List Element")
public class EzsigntemplateListElement {
  
  @SerializedName("pkiEzsigntemplateID")
  private Integer pkiEzsigntemplateID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigntemplateDescription")
  private String sEzsigntemplateDescription = null;
  @SerializedName("iEzsigntemplatedocumentPagetotal")
  private Integer iEzsigntemplatedocumentPagetotal = null;
  @SerializedName("iEzsigntemplateSignaturetotal")
  private Integer iEzsigntemplateSignaturetotal = null;
  @SerializedName("iEzsigntemplateFormfieldtotal")
  private Integer iEzsigntemplateFormfieldtotal = null;
  @SerializedName("bEzsigntemplateIncomplete")
  private Boolean bEzsigntemplateIncomplete = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getPkiEzsigntemplateID() {
    return pkiEzsigntemplateID;
  }
  public void setPkiEzsigntemplateID(Integer pkiEzsigntemplateID) {
    this.pkiEzsigntemplateID = pkiEzsigntemplateID;
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
   * The description of the Ezsigntemplate
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplate")
  public String getSEzsigntemplateDescription() {
    return sEzsigntemplateDescription;
  }
  public void setSEzsigntemplateDescription(String sEzsigntemplateDescription) {
    this.sEzsigntemplateDescription = sEzsigntemplateDescription;
  }

  /**
   * The number of pages in the Ezsigntemplatedocument.
   * minimum: 1
   **/
  @ApiModelProperty(value = "The number of pages in the Ezsigntemplatedocument.")
  public Integer getIEzsigntemplatedocumentPagetotal() {
    return iEzsigntemplatedocumentPagetotal;
  }
  public void setIEzsigntemplatedocumentPagetotal(Integer iEzsigntemplatedocumentPagetotal) {
    this.iEzsigntemplatedocumentPagetotal = iEzsigntemplatedocumentPagetotal;
  }

  /**
   * The number of total signatures in the Ezsigntemplate.
   **/
  @ApiModelProperty(value = "The number of total signatures in the Ezsigntemplate.")
  public Integer getIEzsigntemplateSignaturetotal() {
    return iEzsigntemplateSignaturetotal;
  }
  public void setIEzsigntemplateSignaturetotal(Integer iEzsigntemplateSignaturetotal) {
    this.iEzsigntemplateSignaturetotal = iEzsigntemplateSignaturetotal;
  }

  /**
   * The number of total form fields in the Ezsigntemplate.
   **/
  @ApiModelProperty(value = "The number of total form fields in the Ezsigntemplate.")
  public Integer getIEzsigntemplateFormfieldtotal() {
    return iEzsigntemplateFormfieldtotal;
  }
  public void setIEzsigntemplateFormfieldtotal(Integer iEzsigntemplateFormfieldtotal) {
    this.iEzsigntemplateFormfieldtotal = iEzsigntemplateFormfieldtotal;
  }

  /**
   * Indicate the Ezsigntemplate is incomplete and cannot be used
   **/
  @ApiModelProperty(required = true, value = "Indicate the Ezsigntemplate is incomplete and cannot be used")
  public Boolean getBEzsigntemplateIncomplete() {
    return bEzsigntemplateIncomplete;
  }
  public void setBEzsigntemplateIncomplete(Boolean bEzsigntemplateIncomplete) {
    this.bEzsigntemplateIncomplete = bEzsigntemplateIncomplete;
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
    EzsigntemplateListElement ezsigntemplateListElement = (EzsigntemplateListElement) o;
    return (this.pkiEzsigntemplateID == null ? ezsigntemplateListElement.pkiEzsigntemplateID == null : this.pkiEzsigntemplateID.equals(ezsigntemplateListElement.pkiEzsigntemplateID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplateListElement.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplateListElement.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplateListElement.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplateListElement.fkiLanguageID)) &&
        (this.sEzsigntemplateDescription == null ? ezsigntemplateListElement.sEzsigntemplateDescription == null : this.sEzsigntemplateDescription.equals(ezsigntemplateListElement.sEzsigntemplateDescription)) &&
        (this.iEzsigntemplatedocumentPagetotal == null ? ezsigntemplateListElement.iEzsigntemplatedocumentPagetotal == null : this.iEzsigntemplatedocumentPagetotal.equals(ezsigntemplateListElement.iEzsigntemplatedocumentPagetotal)) &&
        (this.iEzsigntemplateSignaturetotal == null ? ezsigntemplateListElement.iEzsigntemplateSignaturetotal == null : this.iEzsigntemplateSignaturetotal.equals(ezsigntemplateListElement.iEzsigntemplateSignaturetotal)) &&
        (this.iEzsigntemplateFormfieldtotal == null ? ezsigntemplateListElement.iEzsigntemplateFormfieldtotal == null : this.iEzsigntemplateFormfieldtotal.equals(ezsigntemplateListElement.iEzsigntemplateFormfieldtotal)) &&
        (this.bEzsigntemplateIncomplete == null ? ezsigntemplateListElement.bEzsigntemplateIncomplete == null : this.bEzsigntemplateIncomplete.equals(ezsigntemplateListElement.bEzsigntemplateIncomplete)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsigntemplateListElement.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsigntemplateListElement.sEzsignfoldertypeNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateID == null ? 0: this.pkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigntemplateDescription == null ? 0: this.sEzsigntemplateDescription.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentPagetotal == null ? 0: this.iEzsigntemplatedocumentPagetotal.hashCode());
    result = 31 * result + (this.iEzsigntemplateSignaturetotal == null ? 0: this.iEzsigntemplateSignaturetotal.hashCode());
    result = 31 * result + (this.iEzsigntemplateFormfieldtotal == null ? 0: this.iEzsigntemplateFormfieldtotal.hashCode());
    result = 31 * result + (this.bEzsigntemplateIncomplete == null ? 0: this.bEzsigntemplateIncomplete.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateListElement {\n");
    
    sb.append("  pkiEzsigntemplateID: ").append(pkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigntemplateDescription: ").append(sEzsigntemplateDescription).append("\n");
    sb.append("  iEzsigntemplatedocumentPagetotal: ").append(iEzsigntemplatedocumentPagetotal).append("\n");
    sb.append("  iEzsigntemplateSignaturetotal: ").append(iEzsigntemplateSignaturetotal).append("\n");
    sb.append("  iEzsigntemplateFormfieldtotal: ").append(iEzsigntemplateFormfieldtotal).append("\n");
    sb.append("  bEzsigntemplateIncomplete: ").append(bEzsigntemplateIncomplete).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
