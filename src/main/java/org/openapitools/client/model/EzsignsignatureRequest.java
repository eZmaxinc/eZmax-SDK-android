/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignsignatureFont;
import org.openapitools.client.model.FieldEEzsignsignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsignsignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignature Object
 **/
@ApiModel(description = "An Ezsignsignature Object")
public class EzsignsignatureRequest {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureRequest ezsignsignatureRequest = (EzsignsignatureRequest) o;
    return (this.pkiEzsignsignatureID == null ? ezsignsignatureRequest.pkiEzsignsignatureID == null : this.pkiEzsignsignatureID.equals(ezsignsignatureRequest.pkiEzsignsignatureID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsignsignatureRequest.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsignsignatureRequest.fkiEzsignfoldersignerassociationID)) &&
        (this.iEzsignpagePagenumber == null ? ezsignsignatureRequest.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(ezsignsignatureRequest.iEzsignpagePagenumber)) &&
        (this.iEzsignsignatureX == null ? ezsignsignatureRequest.iEzsignsignatureX == null : this.iEzsignsignatureX.equals(ezsignsignatureRequest.iEzsignsignatureX)) &&
        (this.iEzsignsignatureY == null ? ezsignsignatureRequest.iEzsignsignatureY == null : this.iEzsignsignatureY.equals(ezsignsignatureRequest.iEzsignsignatureY)) &&
        (this.iEzsignsignatureStep == null ? ezsignsignatureRequest.iEzsignsignatureStep == null : this.iEzsignsignatureStep.equals(ezsignsignatureRequest.iEzsignsignatureStep)) &&
        (this.eEzsignsignatureType == null ? ezsignsignatureRequest.eEzsignsignatureType == null : this.eEzsignsignatureType.equals(ezsignsignatureRequest.eEzsignsignatureType)) &&
        (this.fkiEzsigndocumentID == null ? ezsignsignatureRequest.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsignsignatureRequest.fkiEzsigndocumentID)) &&
        (this.tEzsignsignatureTooltip == null ? ezsignsignatureRequest.tEzsignsignatureTooltip == null : this.tEzsignsignatureTooltip.equals(ezsignsignatureRequest.tEzsignsignatureTooltip)) &&
        (this.eEzsignsignatureTooltipposition == null ? ezsignsignatureRequest.eEzsignsignatureTooltipposition == null : this.eEzsignsignatureTooltipposition.equals(ezsignsignatureRequest.eEzsignsignatureTooltipposition)) &&
        (this.eEzsignsignatureFont == null ? ezsignsignatureRequest.eEzsignsignatureFont == null : this.eEzsignsignatureFont.equals(ezsignsignatureRequest.eEzsignsignatureFont));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureRequest {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
