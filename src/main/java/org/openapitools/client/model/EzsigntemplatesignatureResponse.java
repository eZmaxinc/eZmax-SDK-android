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

import org.openapitools.client.model.FieldEEzsigntemplatesignatureAttachmentnamesource;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureFont;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatesignature Object
 **/
@ApiModel(description = "A Ezsigntemplatesignature Object")
public class EzsigntemplatesignatureResponse {
  
  @SerializedName("pkiEzsigntemplatesignatureID")
  private Integer pkiEzsigntemplatesignatureID = null;
  @SerializedName("fkiEzsigntemplatedocumentID")
  private Integer fkiEzsigntemplatedocumentID = null;
  @SerializedName("fkiEzsigntemplatesignerID")
  private Integer fkiEzsigntemplatesignerID = null;
  @SerializedName("fkiEzsigntemplatesignerIDValidation")
  private Integer fkiEzsigntemplatesignerIDValidation = null;
  @SerializedName("iEzsigntemplatedocumentpagePagenumber")
  private Integer iEzsigntemplatedocumentpagePagenumber = null;
  @SerializedName("iEzsigntemplatesignatureX")
  private Integer iEzsigntemplatesignatureX = null;
  @SerializedName("iEzsigntemplatesignatureY")
  private Integer iEzsigntemplatesignatureY = null;
  @SerializedName("iEzsigntemplatesignatureStep")
  private Integer iEzsigntemplatesignatureStep = null;
  @SerializedName("eEzsigntemplatesignatureType")
  private FieldEEzsigntemplatesignatureType eEzsigntemplatesignatureType = null;
  @SerializedName("tEzsigntemplatesignatureTooltip")
  private String tEzsigntemplatesignatureTooltip = null;
  @SerializedName("eEzsigntemplatesignatureTooltipposition")
  private FieldEEzsigntemplatesignatureTooltipposition eEzsigntemplatesignatureTooltipposition = null;
  @SerializedName("eEzsigntemplatesignatureFont")
  private FieldEEzsigntemplatesignatureFont eEzsigntemplatesignatureFont = null;
  @SerializedName("iEzsigntemplatesignatureValidationstep")
  private Integer iEzsigntemplatesignatureValidationstep = null;
  @SerializedName("sEzsigntemplatesignatureAttachmentdescription")
  private String sEzsigntemplatesignatureAttachmentdescription = null;
  @SerializedName("eEzsigntemplatesignatureAttachmentnamesource")
  private FieldEEzsigntemplatesignatureAttachmentnamesource eEzsigntemplatesignatureAttachmentnamesource = null;
  @SerializedName("bEzsigntemplatesignatureRequired")
  private Boolean bEzsigntemplatesignatureRequired = null;

  /**
   * The unique ID of the Ezsigntemplatesignature
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesignature")
  public Integer getPkiEzsigntemplatesignatureID() {
    return pkiEzsigntemplatesignatureID;
  }
  public void setPkiEzsigntemplatesignatureID(Integer pkiEzsigntemplatesignatureID) {
    this.pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID;
  }

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocument")
  public Integer getFkiEzsigntemplatedocumentID() {
    return fkiEzsigntemplatedocumentID;
  }
  public void setFkiEzsigntemplatedocumentID(Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerID() {
    return fkiEzsigntemplatesignerID;
  }
  public void setFkiEzsigntemplatesignerID(Integer fkiEzsigntemplatesignerID) {
    this.fkiEzsigntemplatesignerID = fkiEzsigntemplatesignerID;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerIDValidation() {
    return fkiEzsigntemplatesignerIDValidation;
  }
  public void setFkiEzsigntemplatesignerIDValidation(Integer fkiEzsigntemplatesignerIDValidation) {
    this.fkiEzsigntemplatesignerIDValidation = fkiEzsigntemplatesignerIDValidation;
  }

  /**
   * The page number in the Ezsigntemplatedocument
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigntemplatedocument")
  public Integer getIEzsigntemplatedocumentpagePagenumber() {
    return iEzsigntemplatedocumentpagePagenumber;
  }
  public void setIEzsigntemplatedocumentpagePagenumber(Integer iEzsigntemplatedocumentpagePagenumber) {
    this.iEzsigntemplatedocumentpagePagenumber = iEzsigntemplatedocumentpagePagenumber;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsigntemplatesignatureX() {
    return iEzsigntemplatesignatureX;
  }
  public void setIEzsigntemplatesignatureX(Integer iEzsigntemplatesignatureX) {
    this.iEzsigntemplatesignatureX = iEzsigntemplatesignatureX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsigntemplatesignatureY() {
    return iEzsigntemplatesignatureY;
  }
  public void setIEzsigntemplatesignatureY(Integer iEzsigntemplatesignatureY) {
    this.iEzsigntemplatesignatureY = iEzsigntemplatesignatureY;
  }

  /**
   * The step when the Ezsigntemplatesigner will be invited to sign
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsigntemplatesigner will be invited to sign")
  public Integer getIEzsigntemplatesignatureStep() {
    return iEzsigntemplatesignatureStep;
  }
  public void setIEzsigntemplatesignatureStep(Integer iEzsigntemplatesignatureStep) {
    this.iEzsigntemplatesignatureStep = iEzsigntemplatesignatureStep;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplatesignatureType getEEzsigntemplatesignatureType() {
    return eEzsigntemplatesignatureType;
  }
  public void setEEzsigntemplatesignatureType(FieldEEzsigntemplatesignatureType eEzsigntemplatesignatureType) {
    this.eEzsigntemplatesignatureType = eEzsigntemplatesignatureType;
  }

  /**
   * A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
   **/
  @ApiModelProperty(value = "A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature")
  public String getTEzsigntemplatesignatureTooltip() {
    return tEzsigntemplatesignatureTooltip;
  }
  public void setTEzsigntemplatesignatureTooltip(String tEzsigntemplatesignatureTooltip) {
    this.tEzsigntemplatesignatureTooltip = tEzsigntemplatesignatureTooltip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplatesignatureTooltipposition getEEzsigntemplatesignatureTooltipposition() {
    return eEzsigntemplatesignatureTooltipposition;
  }
  public void setEEzsigntemplatesignatureTooltipposition(FieldEEzsigntemplatesignatureTooltipposition eEzsigntemplatesignatureTooltipposition) {
    this.eEzsigntemplatesignatureTooltipposition = eEzsigntemplatesignatureTooltipposition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplatesignatureFont getEEzsigntemplatesignatureFont() {
    return eEzsigntemplatesignatureFont;
  }
  public void setEEzsigntemplatesignatureFont(FieldEEzsigntemplatesignatureFont eEzsigntemplatesignatureFont) {
    this.eEzsigntemplatesignatureFont = eEzsigntemplatesignatureFont;
  }

  /**
   * The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
   **/
  @ApiModelProperty(value = "The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments")
  public Integer getIEzsigntemplatesignatureValidationstep() {
    return iEzsigntemplatesignatureValidationstep;
  }
  public void setIEzsigntemplatesignatureValidationstep(Integer iEzsigntemplatesignatureValidationstep) {
    this.iEzsigntemplatesignatureValidationstep = iEzsigntemplatesignatureValidationstep;
  }

  /**
   * The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
   **/
  @ApiModelProperty(value = "The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments")
  public String getSEzsigntemplatesignatureAttachmentdescription() {
    return sEzsigntemplatesignatureAttachmentdescription;
  }
  public void setSEzsigntemplatesignatureAttachmentdescription(String sEzsigntemplatesignatureAttachmentdescription) {
    this.sEzsigntemplatesignatureAttachmentdescription = sEzsigntemplatesignatureAttachmentdescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplatesignatureAttachmentnamesource getEEzsigntemplatesignatureAttachmentnamesource() {
    return eEzsigntemplatesignatureAttachmentnamesource;
  }
  public void setEEzsigntemplatesignatureAttachmentnamesource(FieldEEzsigntemplatesignatureAttachmentnamesource eEzsigntemplatesignatureAttachmentnamesource) {
    this.eEzsigntemplatesignatureAttachmentnamesource = eEzsigntemplatesignatureAttachmentnamesource;
  }

  /**
   * Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.")
  public Boolean getBEzsigntemplatesignatureRequired() {
    return bEzsigntemplatesignatureRequired;
  }
  public void setBEzsigntemplatesignatureRequired(Boolean bEzsigntemplatesignatureRequired) {
    this.bEzsigntemplatesignatureRequired = bEzsigntemplatesignatureRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureResponse ezsigntemplatesignatureResponse = (EzsigntemplatesignatureResponse) o;
    return (this.pkiEzsigntemplatesignatureID == null ? ezsigntemplatesignatureResponse.pkiEzsigntemplatesignatureID == null : this.pkiEzsigntemplatesignatureID.equals(ezsigntemplatesignatureResponse.pkiEzsigntemplatesignatureID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplatesignatureResponse.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplatesignatureResponse.fkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatesignatureResponse.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatesignatureResponse.fkiEzsigntemplatesignerID)) &&
        (this.fkiEzsigntemplatesignerIDValidation == null ? ezsigntemplatesignatureResponse.fkiEzsigntemplatesignerIDValidation == null : this.fkiEzsigntemplatesignerIDValidation.equals(ezsigntemplatesignatureResponse.fkiEzsigntemplatesignerIDValidation)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplatesignatureResponse.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplatesignatureResponse.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.iEzsigntemplatesignatureX == null ? ezsigntemplatesignatureResponse.iEzsigntemplatesignatureX == null : this.iEzsigntemplatesignatureX.equals(ezsigntemplatesignatureResponse.iEzsigntemplatesignatureX)) &&
        (this.iEzsigntemplatesignatureY == null ? ezsigntemplatesignatureResponse.iEzsigntemplatesignatureY == null : this.iEzsigntemplatesignatureY.equals(ezsigntemplatesignatureResponse.iEzsigntemplatesignatureY)) &&
        (this.iEzsigntemplatesignatureStep == null ? ezsigntemplatesignatureResponse.iEzsigntemplatesignatureStep == null : this.iEzsigntemplatesignatureStep.equals(ezsigntemplatesignatureResponse.iEzsigntemplatesignatureStep)) &&
        (this.eEzsigntemplatesignatureType == null ? ezsigntemplatesignatureResponse.eEzsigntemplatesignatureType == null : this.eEzsigntemplatesignatureType.equals(ezsigntemplatesignatureResponse.eEzsigntemplatesignatureType)) &&
        (this.tEzsigntemplatesignatureTooltip == null ? ezsigntemplatesignatureResponse.tEzsigntemplatesignatureTooltip == null : this.tEzsigntemplatesignatureTooltip.equals(ezsigntemplatesignatureResponse.tEzsigntemplatesignatureTooltip)) &&
        (this.eEzsigntemplatesignatureTooltipposition == null ? ezsigntemplatesignatureResponse.eEzsigntemplatesignatureTooltipposition == null : this.eEzsigntemplatesignatureTooltipposition.equals(ezsigntemplatesignatureResponse.eEzsigntemplatesignatureTooltipposition)) &&
        (this.eEzsigntemplatesignatureFont == null ? ezsigntemplatesignatureResponse.eEzsigntemplatesignatureFont == null : this.eEzsigntemplatesignatureFont.equals(ezsigntemplatesignatureResponse.eEzsigntemplatesignatureFont)) &&
        (this.iEzsigntemplatesignatureValidationstep == null ? ezsigntemplatesignatureResponse.iEzsigntemplatesignatureValidationstep == null : this.iEzsigntemplatesignatureValidationstep.equals(ezsigntemplatesignatureResponse.iEzsigntemplatesignatureValidationstep)) &&
        (this.sEzsigntemplatesignatureAttachmentdescription == null ? ezsigntemplatesignatureResponse.sEzsigntemplatesignatureAttachmentdescription == null : this.sEzsigntemplatesignatureAttachmentdescription.equals(ezsigntemplatesignatureResponse.sEzsigntemplatesignatureAttachmentdescription)) &&
        (this.eEzsigntemplatesignatureAttachmentnamesource == null ? ezsigntemplatesignatureResponse.eEzsigntemplatesignatureAttachmentnamesource == null : this.eEzsigntemplatesignatureAttachmentnamesource.equals(ezsigntemplatesignatureResponse.eEzsigntemplatesignatureAttachmentnamesource)) &&
        (this.bEzsigntemplatesignatureRequired == null ? ezsigntemplatesignatureResponse.bEzsigntemplatesignatureRequired == null : this.bEzsigntemplatesignatureRequired.equals(ezsigntemplatesignatureResponse.bEzsigntemplatesignatureRequired));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatesignatureID == null ? 0: this.pkiEzsigntemplatesignatureID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatedocumentID == null ? 0: this.fkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerID == null ? 0: this.fkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerIDValidation == null ? 0: this.fkiEzsigntemplatesignerIDValidation.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagePagenumber == null ? 0: this.iEzsigntemplatedocumentpagePagenumber.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureX == null ? 0: this.iEzsigntemplatesignatureX.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureY == null ? 0: this.iEzsigntemplatesignatureY.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureStep == null ? 0: this.iEzsigntemplatesignatureStep.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureType == null ? 0: this.eEzsigntemplatesignatureType.hashCode());
    result = 31 * result + (this.tEzsigntemplatesignatureTooltip == null ? 0: this.tEzsigntemplatesignatureTooltip.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureTooltipposition == null ? 0: this.eEzsigntemplatesignatureTooltipposition.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureFont == null ? 0: this.eEzsigntemplatesignatureFont.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureValidationstep == null ? 0: this.iEzsigntemplatesignatureValidationstep.hashCode());
    result = 31 * result + (this.sEzsigntemplatesignatureAttachmentdescription == null ? 0: this.sEzsigntemplatesignatureAttachmentdescription.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureAttachmentnamesource == null ? 0: this.eEzsigntemplatesignatureAttachmentnamesource.hashCode());
    result = 31 * result + (this.bEzsigntemplatesignatureRequired == null ? 0: this.bEzsigntemplatesignatureRequired.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureResponse {\n");
    
    sb.append("  pkiEzsigntemplatesignatureID: ").append(pkiEzsigntemplatesignatureID).append("\n");
    sb.append("  fkiEzsigntemplatedocumentID: ").append(fkiEzsigntemplatedocumentID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("  fkiEzsigntemplatesignerIDValidation: ").append(fkiEzsigntemplatesignerIDValidation).append("\n");
    sb.append("  iEzsigntemplatedocumentpagePagenumber: ").append(iEzsigntemplatedocumentpagePagenumber).append("\n");
    sb.append("  iEzsigntemplatesignatureX: ").append(iEzsigntemplatesignatureX).append("\n");
    sb.append("  iEzsigntemplatesignatureY: ").append(iEzsigntemplatesignatureY).append("\n");
    sb.append("  iEzsigntemplatesignatureStep: ").append(iEzsigntemplatesignatureStep).append("\n");
    sb.append("  eEzsigntemplatesignatureType: ").append(eEzsigntemplatesignatureType).append("\n");
    sb.append("  tEzsigntemplatesignatureTooltip: ").append(tEzsigntemplatesignatureTooltip).append("\n");
    sb.append("  eEzsigntemplatesignatureTooltipposition: ").append(eEzsigntemplatesignatureTooltipposition).append("\n");
    sb.append("  eEzsigntemplatesignatureFont: ").append(eEzsigntemplatesignatureFont).append("\n");
    sb.append("  iEzsigntemplatesignatureValidationstep: ").append(iEzsigntemplatesignatureValidationstep).append("\n");
    sb.append("  sEzsigntemplatesignatureAttachmentdescription: ").append(sEzsigntemplatesignatureAttachmentdescription).append("\n");
    sb.append("  eEzsigntemplatesignatureAttachmentnamesource: ").append(eEzsigntemplatesignatureAttachmentnamesource).append("\n");
    sb.append("  bEzsigntemplatesignatureRequired: ").append(bEzsigntemplatesignatureRequired).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
