/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignfolderStep;
import org.openapitools.client.model.FieldEEzsignfoldertypePrivacylevel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder List Element
 **/
@ApiModel(description = "An Ezsignfolder List Element")
public class EzsignfolderListElement {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("eEzsignfoldertypePrivacylevel")
  private FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("eEzsignfolderStep")
  private FieldEEzsignfolderStep eEzsignfolderStep = null;
  @SerializedName("dtCreatedDate")
  private String dtCreatedDate = null;
  @SerializedName("dtEzsignfolderSentdate")
  private String dtEzsignfolderSentdate = null;
  @SerializedName("dtDueDate")
  private String dtDueDate = null;
  @SerializedName("iEzsigndocument")
  private Integer iEzsigndocument = null;
  @SerializedName("iEzsigndocumentEdm")
  private Integer iEzsigndocumentEdm = null;
  @SerializedName("iEzsignsignature")
  private Integer iEzsignsignature = null;
  @SerializedName("iEzsignsignatureSigned")
  private Integer iEzsignsignatureSigned = null;

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfoldertypePrivacylevel getEEzsignfoldertypePrivacylevel() {
    return eEzsignfoldertypePrivacylevel;
  }
  public void setEEzsignfoldertypePrivacylevel(FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel) {
    this.eEzsignfoldertypePrivacylevel = eEzsignfoldertypePrivacylevel;
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
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderStep getEEzsignfolderStep() {
    return eEzsignfolderStep;
  }
  public void setEEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    this.eEzsignfolderStep = eEzsignfolderStep;
  }

  /**
   * The date and time at which the object was created
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the object was created")
  public String getDtCreatedDate() {
    return dtCreatedDate;
  }
  public void setDtCreatedDate(String dtCreatedDate) {
    this.dtCreatedDate = dtCreatedDate;
  }

  /**
   * The date and time at which the Ezsign folder was sent the last time.
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the Ezsign folder was sent the last time.")
  public String getDtEzsignfolderSentdate() {
    return dtEzsignfolderSentdate;
  }
  public void setDtEzsignfolderSentdate(String dtEzsignfolderSentdate) {
    this.dtEzsignfolderSentdate = dtEzsignfolderSentdate;
  }

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
  public String getDtDueDate() {
    return dtDueDate;
  }
  public void setDtDueDate(String dtDueDate) {
    this.dtDueDate = dtDueDate;
  }

  /**
   * The total number of Ezsigndocument in the folder
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsigndocument in the folder")
  public Integer getIEzsigndocument() {
    return iEzsigndocument;
  }
  public void setIEzsigndocument(Integer iEzsigndocument) {
    this.iEzsigndocument = iEzsigndocument;
  }

  /**
   * The total number of Ezsigndocument in the folder that were saved in the edm system
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsigndocument in the folder that were saved in the edm system")
  public Integer getIEzsigndocumentEdm() {
    return iEzsigndocumentEdm;
  }
  public void setIEzsigndocumentEdm(Integer iEzsigndocumentEdm) {
    this.iEzsigndocumentEdm = iEzsigndocumentEdm;
  }

  /**
   * The total number of signature blocks in all Ezsigndocuments in the folder
   **/
  @ApiModelProperty(required = true, value = "The total number of signature blocks in all Ezsigndocuments in the folder")
  public Integer getIEzsignsignature() {
    return iEzsignsignature;
  }
  public void setIEzsignsignature(Integer iEzsignsignature) {
    this.iEzsignsignature = iEzsignsignature;
  }

  /**
   * The total number of already signed signature blocks in all Ezsigndocuments in the folder
   **/
  @ApiModelProperty(required = true, value = "The total number of already signed signature blocks in all Ezsigndocuments in the folder")
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
    EzsignfolderListElement ezsignfolderListElement = (EzsignfolderListElement) o;
    return (this.pkiEzsignfolderID == null ? ezsignfolderListElement.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(ezsignfolderListElement.pkiEzsignfolderID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignfolderListElement.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignfolderListElement.fkiEzsignfoldertypeID)) &&
        (this.eEzsignfoldertypePrivacylevel == null ? ezsignfolderListElement.eEzsignfoldertypePrivacylevel == null : this.eEzsignfoldertypePrivacylevel.equals(ezsignfolderListElement.eEzsignfoldertypePrivacylevel)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignfolderListElement.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignfolderListElement.sEzsignfoldertypeNameX)) &&
        (this.sEzsignfolderDescription == null ? ezsignfolderListElement.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(ezsignfolderListElement.sEzsignfolderDescription)) &&
        (this.eEzsignfolderStep == null ? ezsignfolderListElement.eEzsignfolderStep == null : this.eEzsignfolderStep.equals(ezsignfolderListElement.eEzsignfolderStep)) &&
        (this.dtCreatedDate == null ? ezsignfolderListElement.dtCreatedDate == null : this.dtCreatedDate.equals(ezsignfolderListElement.dtCreatedDate)) &&
        (this.dtEzsignfolderSentdate == null ? ezsignfolderListElement.dtEzsignfolderSentdate == null : this.dtEzsignfolderSentdate.equals(ezsignfolderListElement.dtEzsignfolderSentdate)) &&
        (this.dtDueDate == null ? ezsignfolderListElement.dtDueDate == null : this.dtDueDate.equals(ezsignfolderListElement.dtDueDate)) &&
        (this.iEzsigndocument == null ? ezsignfolderListElement.iEzsigndocument == null : this.iEzsigndocument.equals(ezsignfolderListElement.iEzsigndocument)) &&
        (this.iEzsigndocumentEdm == null ? ezsignfolderListElement.iEzsigndocumentEdm == null : this.iEzsigndocumentEdm.equals(ezsignfolderListElement.iEzsigndocumentEdm)) &&
        (this.iEzsignsignature == null ? ezsignfolderListElement.iEzsignsignature == null : this.iEzsignsignature.equals(ezsignfolderListElement.iEzsignsignature)) &&
        (this.iEzsignsignatureSigned == null ? ezsignfolderListElement.iEzsignsignatureSigned == null : this.iEzsignsignatureSigned.equals(ezsignfolderListElement.iEzsignsignatureSigned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.eEzsignfoldertypePrivacylevel == null ? 0: this.eEzsignfoldertypePrivacylevel.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.eEzsignfolderStep == null ? 0: this.eEzsignfolderStep.hashCode());
    result = 31 * result + (this.dtCreatedDate == null ? 0: this.dtCreatedDate.hashCode());
    result = 31 * result + (this.dtEzsignfolderSentdate == null ? 0: this.dtEzsignfolderSentdate.hashCode());
    result = 31 * result + (this.dtDueDate == null ? 0: this.dtDueDate.hashCode());
    result = 31 * result + (this.iEzsigndocument == null ? 0: this.iEzsigndocument.hashCode());
    result = 31 * result + (this.iEzsigndocumentEdm == null ? 0: this.iEzsigndocumentEdm.hashCode());
    result = 31 * result + (this.iEzsignsignature == null ? 0: this.iEzsignsignature.hashCode());
    result = 31 * result + (this.iEzsignsignatureSigned == null ? 0: this.iEzsignsignatureSigned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderListElement {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  eEzsignfoldertypePrivacylevel: ").append(eEzsignfoldertypePrivacylevel).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  eEzsignfolderStep: ").append(eEzsignfolderStep).append("\n");
    sb.append("  dtCreatedDate: ").append(dtCreatedDate).append("\n");
    sb.append("  dtEzsignfolderSentdate: ").append(dtEzsignfolderSentdate).append("\n");
    sb.append("  dtDueDate: ").append(dtDueDate).append("\n");
    sb.append("  iEzsigndocument: ").append(iEzsigndocument).append("\n");
    sb.append("  iEzsigndocumentEdm: ").append(iEzsigndocumentEdm).append("\n");
    sb.append("  iEzsignsignature: ").append(iEzsignsignature).append("\n");
    sb.append("  iEzsignsignatureSigned: ").append(iEzsignsignatureSigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
