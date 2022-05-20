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

import java.util.*;
import org.openapitools.client.model.EzsigntemplatesignatureResponse;
import org.openapitools.client.model.EzsigntemplatesignatureResponseCompoundAllOf;
import org.openapitools.client.model.EzsigntemplatesignaturecustomdateResponseCompound;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureFont;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatesignature Object
 **/
@ApiModel(description = "A Ezsigntemplatesignature Object")
public class EzsigntemplatesignatureResponseCompound {
  
  @SerializedName("pkiEzsigntemplatesignatureID")
  private Integer pkiEzsigntemplatesignatureID = null;
  @SerializedName("fkiEzsigntemplatedocumentID")
  private Integer fkiEzsigntemplatedocumentID = null;
  @SerializedName("fkiEzsigntemplatesignerID")
  private Integer fkiEzsigntemplatesignerID = null;
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
  @SerializedName("bEzsigntemplatesignatureCustomdate")
  private Boolean bEzsigntemplatesignatureCustomdate = null;
  @SerializedName("a_objEzsigntemplatesignaturecustomdate")
  private List<EzsigntemplatesignaturecustomdateResponseCompound> aObjEzsigntemplatesignaturecustomdate = null;

  /**
   * The unique ID of the Ezsigntemplatesignature
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
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerID() {
    return fkiEzsigntemplatesignerID;
  }
  public void setFkiEzsigntemplatesignerID(Integer fkiEzsigntemplatesignerID) {
    this.fkiEzsigntemplatesignerID = fkiEzsigntemplatesignerID;
  }

  /**
   * The page number in the Ezsigntemplatedocument
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
   * Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)")
  public Boolean getBEzsigntemplatesignatureCustomdate() {
    return bEzsigntemplatesignatureCustomdate;
  }
  public void setBEzsigntemplatesignatureCustomdate(Boolean bEzsigntemplatesignatureCustomdate) {
    this.bEzsigntemplatesignatureCustomdate = bEzsigntemplatesignatureCustomdate;
  }

  /**
   * An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
   **/
  @ApiModelProperty(value = "An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.")
  public List<EzsigntemplatesignaturecustomdateResponseCompound> getAObjEzsigntemplatesignaturecustomdate() {
    return aObjEzsigntemplatesignaturecustomdate;
  }
  public void setAObjEzsigntemplatesignaturecustomdate(List<EzsigntemplatesignaturecustomdateResponseCompound> aObjEzsigntemplatesignaturecustomdate) {
    this.aObjEzsigntemplatesignaturecustomdate = aObjEzsigntemplatesignaturecustomdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureResponseCompound ezsigntemplatesignatureResponseCompound = (EzsigntemplatesignatureResponseCompound) o;
    return (this.pkiEzsigntemplatesignatureID == null ? ezsigntemplatesignatureResponseCompound.pkiEzsigntemplatesignatureID == null : this.pkiEzsigntemplatesignatureID.equals(ezsigntemplatesignatureResponseCompound.pkiEzsigntemplatesignatureID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplatesignatureResponseCompound.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplatesignatureResponseCompound.fkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatesignatureResponseCompound.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatesignatureResponseCompound.fkiEzsigntemplatesignerID)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplatesignatureResponseCompound.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplatesignatureResponseCompound.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.iEzsigntemplatesignatureX == null ? ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureX == null : this.iEzsigntemplatesignatureX.equals(ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureX)) &&
        (this.iEzsigntemplatesignatureY == null ? ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureY == null : this.iEzsigntemplatesignatureY.equals(ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureY)) &&
        (this.iEzsigntemplatesignatureStep == null ? ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureStep == null : this.iEzsigntemplatesignatureStep.equals(ezsigntemplatesignatureResponseCompound.iEzsigntemplatesignatureStep)) &&
        (this.eEzsigntemplatesignatureType == null ? ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureType == null : this.eEzsigntemplatesignatureType.equals(ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureType)) &&
        (this.tEzsigntemplatesignatureTooltip == null ? ezsigntemplatesignatureResponseCompound.tEzsigntemplatesignatureTooltip == null : this.tEzsigntemplatesignatureTooltip.equals(ezsigntemplatesignatureResponseCompound.tEzsigntemplatesignatureTooltip)) &&
        (this.eEzsigntemplatesignatureTooltipposition == null ? ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureTooltipposition == null : this.eEzsigntemplatesignatureTooltipposition.equals(ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureTooltipposition)) &&
        (this.eEzsigntemplatesignatureFont == null ? ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureFont == null : this.eEzsigntemplatesignatureFont.equals(ezsigntemplatesignatureResponseCompound.eEzsigntemplatesignatureFont)) &&
        (this.bEzsigntemplatesignatureCustomdate == null ? ezsigntemplatesignatureResponseCompound.bEzsigntemplatesignatureCustomdate == null : this.bEzsigntemplatesignatureCustomdate.equals(ezsigntemplatesignatureResponseCompound.bEzsigntemplatesignatureCustomdate)) &&
        (this.aObjEzsigntemplatesignaturecustomdate == null ? ezsigntemplatesignatureResponseCompound.aObjEzsigntemplatesignaturecustomdate == null : this.aObjEzsigntemplatesignaturecustomdate.equals(ezsigntemplatesignatureResponseCompound.aObjEzsigntemplatesignaturecustomdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatesignatureID == null ? 0: this.pkiEzsigntemplatesignatureID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatedocumentID == null ? 0: this.fkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerID == null ? 0: this.fkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagePagenumber == null ? 0: this.iEzsigntemplatedocumentpagePagenumber.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureX == null ? 0: this.iEzsigntemplatesignatureX.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureY == null ? 0: this.iEzsigntemplatesignatureY.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignatureStep == null ? 0: this.iEzsigntemplatesignatureStep.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureType == null ? 0: this.eEzsigntemplatesignatureType.hashCode());
    result = 31 * result + (this.tEzsigntemplatesignatureTooltip == null ? 0: this.tEzsigntemplatesignatureTooltip.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureTooltipposition == null ? 0: this.eEzsigntemplatesignatureTooltipposition.hashCode());
    result = 31 * result + (this.eEzsigntemplatesignatureFont == null ? 0: this.eEzsigntemplatesignatureFont.hashCode());
    result = 31 * result + (this.bEzsigntemplatesignatureCustomdate == null ? 0: this.bEzsigntemplatesignatureCustomdate.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatesignaturecustomdate == null ? 0: this.aObjEzsigntemplatesignaturecustomdate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureResponseCompound {\n");
    
    sb.append("  pkiEzsigntemplatesignatureID: ").append(pkiEzsigntemplatesignatureID).append("\n");
    sb.append("  fkiEzsigntemplatedocumentID: ").append(fkiEzsigntemplatedocumentID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("  iEzsigntemplatedocumentpagePagenumber: ").append(iEzsigntemplatedocumentpagePagenumber).append("\n");
    sb.append("  iEzsigntemplatesignatureX: ").append(iEzsigntemplatesignatureX).append("\n");
    sb.append("  iEzsigntemplatesignatureY: ").append(iEzsigntemplatesignatureY).append("\n");
    sb.append("  iEzsigntemplatesignatureStep: ").append(iEzsigntemplatesignatureStep).append("\n");
    sb.append("  eEzsigntemplatesignatureType: ").append(eEzsigntemplatesignatureType).append("\n");
    sb.append("  tEzsigntemplatesignatureTooltip: ").append(tEzsigntemplatesignatureTooltip).append("\n");
    sb.append("  eEzsigntemplatesignatureTooltipposition: ").append(eEzsigntemplatesignatureTooltipposition).append("\n");
    sb.append("  eEzsigntemplatesignatureFont: ").append(eEzsigntemplatesignatureFont).append("\n");
    sb.append("  bEzsigntemplatesignatureCustomdate: ").append(bEzsigntemplatesignatureCustomdate).append("\n");
    sb.append("  aObjEzsigntemplatesignaturecustomdate: ").append(aObjEzsigntemplatesignaturecustomdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}