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
import org.openapitools.client.model.EzsigntemplatesignatureRequest;
import org.openapitools.client.model.EzsigntemplatesignatureRequestCompoundAllOf;
import org.openapitools.client.model.EzsigntemplatesignaturecustomdateRequestCompound;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureFont;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplatesignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatesignature Object and children
 **/
@ApiModel(description = "A Ezsigntemplatesignature Object and children")
public class EzsigntemplatesignatureRequestCompound {
  
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
  private List<EzsigntemplatesignaturecustomdateRequestCompound> aObjEzsigntemplatesignaturecustomdate = null;

  /**
   * The unique ID of the Ezsigntemplatesignature
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatesignature")
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
  public List<EzsigntemplatesignaturecustomdateRequestCompound> getAObjEzsigntemplatesignaturecustomdate() {
    return aObjEzsigntemplatesignaturecustomdate;
  }
  public void setAObjEzsigntemplatesignaturecustomdate(List<EzsigntemplatesignaturecustomdateRequestCompound> aObjEzsigntemplatesignaturecustomdate) {
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
    EzsigntemplatesignatureRequestCompound ezsigntemplatesignatureRequestCompound = (EzsigntemplatesignatureRequestCompound) o;
    return (this.pkiEzsigntemplatesignatureID == null ? ezsigntemplatesignatureRequestCompound.pkiEzsigntemplatesignatureID == null : this.pkiEzsigntemplatesignatureID.equals(ezsigntemplatesignatureRequestCompound.pkiEzsigntemplatesignatureID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplatesignatureRequestCompound.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplatesignatureRequestCompound.fkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatesignatureRequestCompound.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatesignatureRequestCompound.fkiEzsigntemplatesignerID)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplatesignatureRequestCompound.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplatesignatureRequestCompound.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.iEzsigntemplatesignatureX == null ? ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureX == null : this.iEzsigntemplatesignatureX.equals(ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureX)) &&
        (this.iEzsigntemplatesignatureY == null ? ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureY == null : this.iEzsigntemplatesignatureY.equals(ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureY)) &&
        (this.iEzsigntemplatesignatureStep == null ? ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureStep == null : this.iEzsigntemplatesignatureStep.equals(ezsigntemplatesignatureRequestCompound.iEzsigntemplatesignatureStep)) &&
        (this.eEzsigntemplatesignatureType == null ? ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureType == null : this.eEzsigntemplatesignatureType.equals(ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureType)) &&
        (this.tEzsigntemplatesignatureTooltip == null ? ezsigntemplatesignatureRequestCompound.tEzsigntemplatesignatureTooltip == null : this.tEzsigntemplatesignatureTooltip.equals(ezsigntemplatesignatureRequestCompound.tEzsigntemplatesignatureTooltip)) &&
        (this.eEzsigntemplatesignatureTooltipposition == null ? ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureTooltipposition == null : this.eEzsigntemplatesignatureTooltipposition.equals(ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureTooltipposition)) &&
        (this.eEzsigntemplatesignatureFont == null ? ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureFont == null : this.eEzsigntemplatesignatureFont.equals(ezsigntemplatesignatureRequestCompound.eEzsigntemplatesignatureFont)) &&
        (this.bEzsigntemplatesignatureCustomdate == null ? ezsigntemplatesignatureRequestCompound.bEzsigntemplatesignatureCustomdate == null : this.bEzsigntemplatesignatureCustomdate.equals(ezsigntemplatesignatureRequestCompound.bEzsigntemplatesignatureCustomdate)) &&
        (this.aObjEzsigntemplatesignaturecustomdate == null ? ezsigntemplatesignatureRequestCompound.aObjEzsigntemplatesignaturecustomdate == null : this.aObjEzsigntemplatesignaturecustomdate.equals(ezsigntemplatesignatureRequestCompound.aObjEzsigntemplatesignaturecustomdate));
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
    sb.append("class EzsigntemplatesignatureRequestCompound {\n");
    
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
