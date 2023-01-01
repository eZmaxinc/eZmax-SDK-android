/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignsignaturecustomdateRequestCompound;
import org.openapitools.client.model.FieldEEzsignsignatureAttachmentnamesource;
import org.openapitools.client.model.FieldEEzsignsignatureFont;
import org.openapitools.client.model.FieldEEzsignsignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsignsignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignature Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignsignature Object and children to create a complete structure")
public class EzsignsignatureRequestCompound {
  
  @SerializedName("pkiEzsignsignatureID")
  private Integer pkiEzsignsignatureID = null;
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;
  @SerializedName("iEzsignsignatureX")
  private Integer iEzsignsignatureX = null;
  @SerializedName("iEzsignsignatureY")
  private Integer iEzsignsignatureY = null;
  @SerializedName("iEzsignsignatureStep")
  private Integer iEzsignsignatureStep = null;
  @SerializedName("eEzsignsignatureType")
  private FieldEEzsignsignatureType eEzsignsignatureType = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("tEzsignsignatureTooltip")
  private String tEzsignsignatureTooltip = null;
  @SerializedName("eEzsignsignatureTooltipposition")
  private FieldEEzsignsignatureTooltipposition eEzsignsignatureTooltipposition = null;
  @SerializedName("eEzsignsignatureFont")
  private FieldEEzsignsignatureFont eEzsignsignatureFont = null;
  @SerializedName("fkiEzsignfoldersignerassociationIDValidation")
  private Integer fkiEzsignfoldersignerassociationIDValidation = null;
  @SerializedName("bEzsignsignatureRequired")
  private Boolean bEzsignsignatureRequired = null;
  @SerializedName("eEzsignsignatureAttachmentnamesource")
  private FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource = null;
  @SerializedName("sEzsignsignatureAttachmentdescription")
  private String sEzsignsignatureAttachmentdescription = null;
  @SerializedName("iEzsignsignatureValidationstep")
  private Integer iEzsignsignatureValidationstep = null;
  @SerializedName("bEzsignsignatureCustomdate")
  private Boolean bEzsignsignatureCustomdate = null;
  @SerializedName("a_objEzsignsignaturecustomdate")
  private List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate = null;

  /**
   * The unique ID of the Ezsignsignature
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsignature")
  public Integer getPkiEzsignsignatureID() {
    return pkiEzsignsignatureID;
  }
  public void setPkiEzsignsignatureID(Integer pkiEzsignsignatureID) {
    this.pkiEzsignsignatureID = pkiEzsignsignatureID;
  }

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
   * The page number in the Ezsigndocument
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigndocument")
  public Integer getIEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }
  public void setIEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsignsignatureX() {
    return iEzsignsignatureX;
  }
  public void setIEzsignsignatureX(Integer iEzsignsignatureX) {
    this.iEzsignsignatureX = iEzsignsignatureX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsignsignatureY() {
    return iEzsignsignatureY;
  }
  public void setIEzsignsignatureY(Integer iEzsignsignatureY) {
    this.iEzsignsignatureY = iEzsignsignatureY;
  }

  /**
   * The step when the Ezsignsigner will be invited to sign
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsignsigner will be invited to sign")
  public Integer getIEzsignsignatureStep() {
    return iEzsignsignatureStep;
  }
  public void setIEzsignsignatureStep(Integer iEzsignsignatureStep) {
    this.iEzsignsignatureStep = iEzsignsignatureStep;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignsignatureType getEEzsignsignatureType() {
    return eEzsignsignatureType;
  }
  public void setEEzsignsignatureType(FieldEEzsignsignatureType eEzsignsignatureType) {
    this.eEzsignsignatureType = eEzsignsignatureType;
  }

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }
  public void setFkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
  }

  /**
   * A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
   **/
  @ApiModelProperty(value = "A tooltip that will be presented to Ezsignsigner about the Ezsignsignature")
  public String getTEzsignsignatureTooltip() {
    return tEzsignsignatureTooltip;
  }
  public void setTEzsignsignatureTooltip(String tEzsignsignatureTooltip) {
    this.tEzsignsignatureTooltip = tEzsignsignatureTooltip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureTooltipposition getEEzsignsignatureTooltipposition() {
    return eEzsignsignatureTooltipposition;
  }
  public void setEEzsignsignatureTooltipposition(FieldEEzsignsignatureTooltipposition eEzsignsignatureTooltipposition) {
    this.eEzsignsignatureTooltipposition = eEzsignsignatureTooltipposition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureFont getEEzsignsignatureFont() {
    return eEzsignsignatureFont;
  }
  public void setEEzsignsignatureFont(FieldEEzsignsignatureFont eEzsignsignatureFont) {
    this.eEzsignsignatureFont = eEzsignsignatureFont;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationIDValidation() {
    return fkiEzsignfoldersignerassociationIDValidation;
  }
  public void setFkiEzsignfoldersignerassociationIDValidation(Integer fkiEzsignfoldersignerassociationIDValidation) {
    this.fkiEzsignfoldersignerassociationIDValidation = fkiEzsignfoldersignerassociationIDValidation;
  }

  /**
   * Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments.
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments.")
  public Boolean getBEzsignsignatureRequired() {
    return bEzsignsignatureRequired;
  }
  public void setBEzsignsignatureRequired(Boolean bEzsignsignatureRequired) {
    this.bEzsignsignatureRequired = bEzsignsignatureRequired;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureAttachmentnamesource getEEzsignsignatureAttachmentnamesource() {
    return eEzsignsignatureAttachmentnamesource;
  }
  public void setEEzsignsignatureAttachmentnamesource(FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource) {
    this.eEzsignsignatureAttachmentnamesource = eEzsignsignatureAttachmentnamesource;
  }

  /**
   * The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
   **/
  @ApiModelProperty(value = "The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments")
  public String getSEzsignsignatureAttachmentdescription() {
    return sEzsignsignatureAttachmentdescription;
  }
  public void setSEzsignsignatureAttachmentdescription(String sEzsignsignatureAttachmentdescription) {
    this.sEzsignsignatureAttachmentdescription = sEzsignsignatureAttachmentdescription;
  }

  /**
   * The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
   **/
  @ApiModelProperty(value = "The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments")
  public Integer getIEzsignsignatureValidationstep() {
    return iEzsignsignatureValidationstep;
  }
  public void setIEzsignsignatureValidationstep(Integer iEzsignsignatureValidationstep) {
    this.iEzsignsignatureValidationstep = iEzsignsignatureValidationstep;
  }

  /**
   * Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)")
  public Boolean getBEzsignsignatureCustomdate() {
    return bEzsignsignatureCustomdate;
  }
  public void setBEzsignsignatureCustomdate(Boolean bEzsignsignatureCustomdate) {
    this.bEzsignsignatureCustomdate = bEzsignsignatureCustomdate;
  }

  /**
   * An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
   **/
  @ApiModelProperty(value = "An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.")
  public List<EzsignsignaturecustomdateRequestCompound> getAObjEzsignsignaturecustomdate() {
    return aObjEzsignsignaturecustomdate;
  }
  public void setAObjEzsignsignaturecustomdate(List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate) {
    this.aObjEzsignsignaturecustomdate = aObjEzsignsignaturecustomdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureRequestCompound ezsignsignatureRequestCompound = (EzsignsignatureRequestCompound) o;
    return (this.pkiEzsignsignatureID == null ? ezsignsignatureRequestCompound.pkiEzsignsignatureID == null : this.pkiEzsignsignatureID.equals(ezsignsignatureRequestCompound.pkiEzsignsignatureID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsignsignatureRequestCompound.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsignsignatureRequestCompound.fkiEzsignfoldersignerassociationID)) &&
        (this.iEzsignpagePagenumber == null ? ezsignsignatureRequestCompound.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(ezsignsignatureRequestCompound.iEzsignpagePagenumber)) &&
        (this.iEzsignsignatureX == null ? ezsignsignatureRequestCompound.iEzsignsignatureX == null : this.iEzsignsignatureX.equals(ezsignsignatureRequestCompound.iEzsignsignatureX)) &&
        (this.iEzsignsignatureY == null ? ezsignsignatureRequestCompound.iEzsignsignatureY == null : this.iEzsignsignatureY.equals(ezsignsignatureRequestCompound.iEzsignsignatureY)) &&
        (this.iEzsignsignatureStep == null ? ezsignsignatureRequestCompound.iEzsignsignatureStep == null : this.iEzsignsignatureStep.equals(ezsignsignatureRequestCompound.iEzsignsignatureStep)) &&
        (this.eEzsignsignatureType == null ? ezsignsignatureRequestCompound.eEzsignsignatureType == null : this.eEzsignsignatureType.equals(ezsignsignatureRequestCompound.eEzsignsignatureType)) &&
        (this.fkiEzsigndocumentID == null ? ezsignsignatureRequestCompound.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsignsignatureRequestCompound.fkiEzsigndocumentID)) &&
        (this.tEzsignsignatureTooltip == null ? ezsignsignatureRequestCompound.tEzsignsignatureTooltip == null : this.tEzsignsignatureTooltip.equals(ezsignsignatureRequestCompound.tEzsignsignatureTooltip)) &&
        (this.eEzsignsignatureTooltipposition == null ? ezsignsignatureRequestCompound.eEzsignsignatureTooltipposition == null : this.eEzsignsignatureTooltipposition.equals(ezsignsignatureRequestCompound.eEzsignsignatureTooltipposition)) &&
        (this.eEzsignsignatureFont == null ? ezsignsignatureRequestCompound.eEzsignsignatureFont == null : this.eEzsignsignatureFont.equals(ezsignsignatureRequestCompound.eEzsignsignatureFont)) &&
        (this.fkiEzsignfoldersignerassociationIDValidation == null ? ezsignsignatureRequestCompound.fkiEzsignfoldersignerassociationIDValidation == null : this.fkiEzsignfoldersignerassociationIDValidation.equals(ezsignsignatureRequestCompound.fkiEzsignfoldersignerassociationIDValidation)) &&
        (this.bEzsignsignatureRequired == null ? ezsignsignatureRequestCompound.bEzsignsignatureRequired == null : this.bEzsignsignatureRequired.equals(ezsignsignatureRequestCompound.bEzsignsignatureRequired)) &&
        (this.eEzsignsignatureAttachmentnamesource == null ? ezsignsignatureRequestCompound.eEzsignsignatureAttachmentnamesource == null : this.eEzsignsignatureAttachmentnamesource.equals(ezsignsignatureRequestCompound.eEzsignsignatureAttachmentnamesource)) &&
        (this.sEzsignsignatureAttachmentdescription == null ? ezsignsignatureRequestCompound.sEzsignsignatureAttachmentdescription == null : this.sEzsignsignatureAttachmentdescription.equals(ezsignsignatureRequestCompound.sEzsignsignatureAttachmentdescription)) &&
        (this.iEzsignsignatureValidationstep == null ? ezsignsignatureRequestCompound.iEzsignsignatureValidationstep == null : this.iEzsignsignatureValidationstep.equals(ezsignsignatureRequestCompound.iEzsignsignatureValidationstep)) &&
        (this.bEzsignsignatureCustomdate == null ? ezsignsignatureRequestCompound.bEzsignsignatureCustomdate == null : this.bEzsignsignatureCustomdate.equals(ezsignsignatureRequestCompound.bEzsignsignatureCustomdate)) &&
        (this.aObjEzsignsignaturecustomdate == null ? ezsignsignatureRequestCompound.aObjEzsignsignaturecustomdate == null : this.aObjEzsignsignaturecustomdate.equals(ezsignsignatureRequestCompound.aObjEzsignsignaturecustomdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignatureID == null ? 0: this.pkiEzsignsignatureID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    result = 31 * result + (this.iEzsignsignatureX == null ? 0: this.iEzsignsignatureX.hashCode());
    result = 31 * result + (this.iEzsignsignatureY == null ? 0: this.iEzsignsignatureY.hashCode());
    result = 31 * result + (this.iEzsignsignatureStep == null ? 0: this.iEzsignsignatureStep.hashCode());
    result = 31 * result + (this.eEzsignsignatureType == null ? 0: this.eEzsignsignatureType.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.tEzsignsignatureTooltip == null ? 0: this.tEzsignsignatureTooltip.hashCode());
    result = 31 * result + (this.eEzsignsignatureTooltipposition == null ? 0: this.eEzsignsignatureTooltipposition.hashCode());
    result = 31 * result + (this.eEzsignsignatureFont == null ? 0: this.eEzsignsignatureFont.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationIDValidation == null ? 0: this.fkiEzsignfoldersignerassociationIDValidation.hashCode());
    result = 31 * result + (this.bEzsignsignatureRequired == null ? 0: this.bEzsignsignatureRequired.hashCode());
    result = 31 * result + (this.eEzsignsignatureAttachmentnamesource == null ? 0: this.eEzsignsignatureAttachmentnamesource.hashCode());
    result = 31 * result + (this.sEzsignsignatureAttachmentdescription == null ? 0: this.sEzsignsignatureAttachmentdescription.hashCode());
    result = 31 * result + (this.iEzsignsignatureValidationstep == null ? 0: this.iEzsignsignatureValidationstep.hashCode());
    result = 31 * result + (this.bEzsignsignatureCustomdate == null ? 0: this.bEzsignsignatureCustomdate.hashCode());
    result = 31 * result + (this.aObjEzsignsignaturecustomdate == null ? 0: this.aObjEzsignsignaturecustomdate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureRequestCompound {\n");
    
    sb.append("  pkiEzsignsignatureID: ").append(pkiEzsignsignatureID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("  iEzsignsignatureX: ").append(iEzsignsignatureX).append("\n");
    sb.append("  iEzsignsignatureY: ").append(iEzsignsignatureY).append("\n");
    sb.append("  iEzsignsignatureStep: ").append(iEzsignsignatureStep).append("\n");
    sb.append("  eEzsignsignatureType: ").append(eEzsignsignatureType).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  tEzsignsignatureTooltip: ").append(tEzsignsignatureTooltip).append("\n");
    sb.append("  eEzsignsignatureTooltipposition: ").append(eEzsignsignatureTooltipposition).append("\n");
    sb.append("  eEzsignsignatureFont: ").append(eEzsignsignatureFont).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationIDValidation: ").append(fkiEzsignfoldersignerassociationIDValidation).append("\n");
    sb.append("  bEzsignsignatureRequired: ").append(bEzsignsignatureRequired).append("\n");
    sb.append("  eEzsignsignatureAttachmentnamesource: ").append(eEzsignsignatureAttachmentnamesource).append("\n");
    sb.append("  sEzsignsignatureAttachmentdescription: ").append(sEzsignsignatureAttachmentdescription).append("\n");
    sb.append("  iEzsignsignatureValidationstep: ").append(iEzsignsignatureValidationstep).append("\n");
    sb.append("  bEzsignsignatureCustomdate: ").append(bEzsignsignatureCustomdate).append("\n");
    sb.append("  aObjEzsignsignaturecustomdate: ").append(aObjEzsignsignaturecustomdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
