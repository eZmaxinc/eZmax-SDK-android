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
 * An Ezsignbulksend List Element
 **/
@ApiModel(description = "An Ezsignbulksend List Element")
public class EzsignbulksendListElement {
  
  @SerializedName("pkiEzsignbulksendID")
  private Integer pkiEzsignbulksendID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("sEzsignbulksendDescription")
  private String sEzsignbulksendDescription = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("bEzsignbulksendNeedvalidation")
  private Boolean bEzsignbulksendNeedvalidation = null;
  @SerializedName("bEzsignbulksendIsactive")
  private Boolean bEzsignbulksendIsactive = null;
  @SerializedName("iEzsignbulksendtransmission")
  private Integer iEzsignbulksendtransmission = null;
  @SerializedName("iEzsignfolder")
  private Integer iEzsignfolder = null;
  @SerializedName("iEzsigndocument")
  private Integer iEzsigndocument = null;
  @SerializedName("iEzsignsignature")
  private Integer iEzsignsignature = null;
  @SerializedName("iEzsignsignatureSigned")
  private Integer iEzsignsignatureSigned = null;

  /**
   * The unique ID of the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksend")
  public Integer getPkiEzsignbulksendID() {
    return pkiEzsignbulksendID;
  }
  public void setPkiEzsignbulksendID(Integer pkiEzsignbulksendID) {
    this.pkiEzsignbulksendID = pkiEzsignbulksendID;
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
   * The description of the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksend")
  public String getSEzsignbulksendDescription() {
    return sEzsignbulksendDescription;
  }
  public void setSEzsignbulksendDescription(String sEzsignbulksendDescription) {
    this.sEzsignbulksendDescription = sEzsignbulksendDescription;
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
   * Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation")
  public Boolean getBEzsignbulksendNeedvalidation() {
    return bEzsignbulksendNeedvalidation;
  }
  public void setBEzsignbulksendNeedvalidation(Boolean bEzsignbulksendNeedvalidation) {
    this.bEzsignbulksendNeedvalidation = bEzsignbulksendNeedvalidation;
  }

  /**
   * Whether the Ezsignbulksend is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend is active or not")
  public Boolean getBEzsignbulksendIsactive() {
    return bEzsignbulksendIsactive;
  }
  public void setBEzsignbulksendIsactive(Boolean bEzsignbulksendIsactive) {
    this.bEzsignbulksendIsactive = bEzsignbulksendIsactive;
  }

  /**
   * The total number of Ezsignbulksendtransmissions in the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsignbulksendtransmissions in the Ezsignbulksend")
  public Integer getIEzsignbulksendtransmission() {
    return iEzsignbulksendtransmission;
  }
  public void setIEzsignbulksendtransmission(Integer iEzsignbulksendtransmission) {
    this.iEzsignbulksendtransmission = iEzsignbulksendtransmission;
  }

  /**
   * The total number of Ezsignfolders in the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsignfolders in the Ezsignbulksend")
  public Integer getIEzsignfolder() {
    return iEzsignfolder;
  }
  public void setIEzsignfolder(Integer iEzsignfolder) {
    this.iEzsignfolder = iEzsignfolder;
  }

  /**
   * The total number of Ezsigndocuments in the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsigndocuments in the Ezsignbulksend")
  public Integer getIEzsigndocument() {
    return iEzsigndocument;
  }
  public void setIEzsigndocument(Integer iEzsigndocument) {
    this.iEzsigndocument = iEzsigndocument;
  }

  /**
   * The total number of Ezsignsignature in the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsignsignature in the Ezsignbulksend")
  public Integer getIEzsignsignature() {
    return iEzsignsignature;
  }
  public void setIEzsignsignature(Integer iEzsignsignature) {
    this.iEzsignsignature = iEzsignsignature;
  }

  /**
   * The total number of already signed Ezsignsignature blocks in the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The total number of already signed Ezsignsignature blocks in the Ezsignbulksend")
  public Integer getIEzsignsignatureSigned() {
    return iEzsignsignatureSigned;
  }
  public void setIEzsignsignatureSigned(Integer iEzsignsignatureSigned) {
    this.iEzsignsignatureSigned = iEzsignsignatureSigned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendListElement ezsignbulksendListElement = (EzsignbulksendListElement) o;
    return (this.pkiEzsignbulksendID == null ? ezsignbulksendListElement.pkiEzsignbulksendID == null : this.pkiEzsignbulksendID.equals(ezsignbulksendListElement.pkiEzsignbulksendID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignbulksendListElement.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignbulksendListElement.fkiEzsignfoldertypeID)) &&
        (this.sEzsignbulksendDescription == null ? ezsignbulksendListElement.sEzsignbulksendDescription == null : this.sEzsignbulksendDescription.equals(ezsignbulksendListElement.sEzsignbulksendDescription)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignbulksendListElement.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignbulksendListElement.sEzsignfoldertypeNameX)) &&
        (this.bEzsignbulksendNeedvalidation == null ? ezsignbulksendListElement.bEzsignbulksendNeedvalidation == null : this.bEzsignbulksendNeedvalidation.equals(ezsignbulksendListElement.bEzsignbulksendNeedvalidation)) &&
        (this.bEzsignbulksendIsactive == null ? ezsignbulksendListElement.bEzsignbulksendIsactive == null : this.bEzsignbulksendIsactive.equals(ezsignbulksendListElement.bEzsignbulksendIsactive)) &&
        (this.iEzsignbulksendtransmission == null ? ezsignbulksendListElement.iEzsignbulksendtransmission == null : this.iEzsignbulksendtransmission.equals(ezsignbulksendListElement.iEzsignbulksendtransmission)) &&
        (this.iEzsignfolder == null ? ezsignbulksendListElement.iEzsignfolder == null : this.iEzsignfolder.equals(ezsignbulksendListElement.iEzsignfolder)) &&
        (this.iEzsigndocument == null ? ezsignbulksendListElement.iEzsigndocument == null : this.iEzsigndocument.equals(ezsignbulksendListElement.iEzsigndocument)) &&
        (this.iEzsignsignature == null ? ezsignbulksendListElement.iEzsignsignature == null : this.iEzsignsignature.equals(ezsignbulksendListElement.iEzsignsignature)) &&
        (this.iEzsignsignatureSigned == null ? ezsignbulksendListElement.iEzsignsignatureSigned == null : this.iEzsignsignatureSigned.equals(ezsignbulksendListElement.iEzsignsignatureSigned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendID == null ? 0: this.pkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sEzsignbulksendDescription == null ? 0: this.sEzsignbulksendDescription.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.bEzsignbulksendNeedvalidation == null ? 0: this.bEzsignbulksendNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsignbulksendIsactive == null ? 0: this.bEzsignbulksendIsactive.hashCode());
    result = 31 * result + (this.iEzsignbulksendtransmission == null ? 0: this.iEzsignbulksendtransmission.hashCode());
    result = 31 * result + (this.iEzsignfolder == null ? 0: this.iEzsignfolder.hashCode());
    result = 31 * result + (this.iEzsigndocument == null ? 0: this.iEzsigndocument.hashCode());
    result = 31 * result + (this.iEzsignsignature == null ? 0: this.iEzsignsignature.hashCode());
    result = 31 * result + (this.iEzsignsignatureSigned == null ? 0: this.iEzsignsignatureSigned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendListElement {\n");
    
    sb.append("  pkiEzsignbulksendID: ").append(pkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  sEzsignbulksendDescription: ").append(sEzsignbulksendDescription).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  bEzsignbulksendNeedvalidation: ").append(bEzsignbulksendNeedvalidation).append("\n");
    sb.append("  bEzsignbulksendIsactive: ").append(bEzsignbulksendIsactive).append("\n");
    sb.append("  iEzsignbulksendtransmission: ").append(iEzsignbulksendtransmission).append("\n");
    sb.append("  iEzsignfolder: ").append(iEzsignfolder).append("\n");
    sb.append("  iEzsigndocument: ").append(iEzsigndocument).append("\n");
    sb.append("  iEzsignsignature: ").append(iEzsignsignature).append("\n");
    sb.append("  iEzsignsignatureSigned: ").append(iEzsignsignatureSigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
