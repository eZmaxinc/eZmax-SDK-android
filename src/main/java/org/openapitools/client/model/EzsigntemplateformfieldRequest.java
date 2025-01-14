/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EnumHorizontalalignment;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldDependencyrequirement;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldPositioning;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldPositioningoccurence;
import org.openapitools.client.model.TextstylestaticRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplateformfield Object
 **/
@ApiModel(description = "A Ezsigntemplateformfield Object")
public class EzsigntemplateformfieldRequest {
  
  @SerializedName("pkiEzsigntemplateformfieldID")
  private Integer pkiEzsigntemplateformfieldID = null;
  @SerializedName("eEzsigntemplateformfieldPositioning")
  private FieldEEzsigntemplateformfieldPositioning eEzsigntemplateformfieldPositioning = null;
  @SerializedName("iEzsigntemplatedocumentpagePagenumber")
  private Integer iEzsigntemplatedocumentpagePagenumber = null;
  @SerializedName("sEzsigntemplateformfieldLabel")
  private String sEzsigntemplateformfieldLabel = null;
  @SerializedName("sEzsigntemplateformfieldValue")
  private String sEzsigntemplateformfieldValue = null;
  @SerializedName("iEzsigntemplateformfieldX")
  private Integer iEzsigntemplateformfieldX = null;
  @SerializedName("iEzsigntemplateformfieldY")
  private Integer iEzsigntemplateformfieldY = null;
  @SerializedName("iEzsigntemplateformfieldWidth")
  private Integer iEzsigntemplateformfieldWidth = null;
  @SerializedName("iEzsigntemplateformfieldHeight")
  private Integer iEzsigntemplateformfieldHeight = null;
  @SerializedName("bEzsigntemplateformfieldAutocomplete")
  private Boolean bEzsigntemplateformfieldAutocomplete = null;
  @SerializedName("bEzsigntemplateformfieldSelected")
  private Boolean bEzsigntemplateformfieldSelected = null;
  @SerializedName("eEzsigntemplateformfieldDependencyrequirement")
  private FieldEEzsigntemplateformfieldDependencyrequirement eEzsigntemplateformfieldDependencyrequirement = null;
  @SerializedName("sEzsigntemplateformfieldPositioningpattern")
  private String sEzsigntemplateformfieldPositioningpattern = null;
  @SerializedName("iEzsigntemplateformfieldPositioningoffsetx")
  private Integer iEzsigntemplateformfieldPositioningoffsetx = null;
  @SerializedName("iEzsigntemplateformfieldPositioningoffsety")
  private Integer iEzsigntemplateformfieldPositioningoffsety = null;
  @SerializedName("eEzsigntemplateformfieldPositioningoccurence")
  private FieldEEzsigntemplateformfieldPositioningoccurence eEzsigntemplateformfieldPositioningoccurence = null;
  @SerializedName("eEzsigntemplateformfieldHorizontalalignment")
  private EnumHorizontalalignment eEzsigntemplateformfieldHorizontalalignment = null;
  @SerializedName("objTextstylestatic")
  private TextstylestaticRequestCompound objTextstylestatic = null;

  /**
   * The unique ID of the Ezsigntemplateformfield
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplateformfield")
  public Integer getPkiEzsigntemplateformfieldID() {
    return pkiEzsigntemplateformfieldID;
  }
  public void setPkiEzsigntemplateformfieldID(Integer pkiEzsigntemplateformfieldID) {
    this.pkiEzsigntemplateformfieldID = pkiEzsigntemplateformfieldID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateformfieldPositioning getEEzsigntemplateformfieldPositioning() {
    return eEzsigntemplateformfieldPositioning;
  }
  public void setEEzsigntemplateformfieldPositioning(FieldEEzsigntemplateformfieldPositioning eEzsigntemplateformfieldPositioning) {
    this.eEzsigntemplateformfieldPositioning = eEzsigntemplateformfieldPositioning;
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
   * The Label for the Ezsigntemplateformfield
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsigntemplateformfield")
  public String getSEzsigntemplateformfieldLabel() {
    return sEzsigntemplateformfieldLabel;
  }
  public void setSEzsigntemplateformfieldLabel(String sEzsigntemplateformfieldLabel) {
    this.sEzsigntemplateformfieldLabel = sEzsigntemplateformfieldLabel;
  }

  /**
   * The value for the Ezsigntemplateformfield
   **/
  @ApiModelProperty(value = "The value for the Ezsigntemplateformfield")
  public String getSEzsigntemplateformfieldValue() {
    return sEzsigntemplateformfieldValue;
  }
  public void setSEzsigntemplateformfieldValue(String sEzsigntemplateformfieldValue) {
    this.sEzsigntemplateformfieldValue = sEzsigntemplateformfieldValue;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsigntemplateformfieldX() {
    return iEzsigntemplateformfieldX;
  }
  public void setIEzsigntemplateformfieldX(Integer iEzsigntemplateformfieldX) {
    this.iEzsigntemplateformfieldX = iEzsigntemplateformfieldX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsigntemplateformfieldY() {
    return iEzsigntemplateformfieldY;
  }
  public void setIEzsigntemplateformfieldY(Integer iEzsigntemplateformfieldY) {
    this.iEzsigntemplateformfieldY = iEzsigntemplateformfieldY;
  }

  /**
   * The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI")
  public Integer getIEzsigntemplateformfieldWidth() {
    return iEzsigntemplateformfieldWidth;
  }
  public void setIEzsigntemplateformfieldWidth(Integer iEzsigntemplateformfieldWidth) {
    this.iEzsigntemplateformfieldWidth = iEzsigntemplateformfieldWidth;
  }

  /**
   * The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI 
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI ")
  public Integer getIEzsigntemplateformfieldHeight() {
    return iEzsigntemplateformfieldHeight;
  }
  public void setIEzsigntemplateformfieldHeight(Integer iEzsigntemplateformfieldHeight) {
    this.iEzsigntemplateformfieldHeight = iEzsigntemplateformfieldHeight;
  }

  /**
   * Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text**
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text**")
  public Boolean getBEzsigntemplateformfieldAutocomplete() {
    return bEzsigntemplateformfieldAutocomplete;
  }
  public void setBEzsigntemplateformfieldAutocomplete(Boolean bEzsigntemplateformfieldAutocomplete) {
    this.bEzsigntemplateformfieldAutocomplete = bEzsigntemplateformfieldAutocomplete;
  }

  /**
   * Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio**
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio**")
  public Boolean getBEzsigntemplateformfieldSelected() {
    return bEzsigntemplateformfieldSelected;
  }
  public void setBEzsigntemplateformfieldSelected(Boolean bEzsigntemplateformfieldSelected) {
    this.bEzsigntemplateformfieldSelected = bEzsigntemplateformfieldSelected;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateformfieldDependencyrequirement getEEzsigntemplateformfieldDependencyrequirement() {
    return eEzsigntemplateformfieldDependencyrequirement;
  }
  public void setEEzsigntemplateformfieldDependencyrequirement(FieldEEzsigntemplateformfieldDependencyrequirement eEzsigntemplateformfieldDependencyrequirement) {
    this.eEzsigntemplateformfieldDependencyrequirement = eEzsigntemplateformfieldDependencyrequirement;
  }

  /**
   * The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   **/
  @ApiModelProperty(value = "The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**")
  public String getSEzsigntemplateformfieldPositioningpattern() {
    return sEzsigntemplateformfieldPositioningpattern;
  }
  public void setSEzsigntemplateformfieldPositioningpattern(String sEzsigntemplateformfieldPositioningpattern) {
    this.sEzsigntemplateformfieldPositioningpattern = sEzsigntemplateformfieldPositioningpattern;
  }

  /**
   * The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   **/
  @ApiModelProperty(value = "The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**")
  public Integer getIEzsigntemplateformfieldPositioningoffsetx() {
    return iEzsigntemplateformfieldPositioningoffsetx;
  }
  public void setIEzsigntemplateformfieldPositioningoffsetx(Integer iEzsigntemplateformfieldPositioningoffsetx) {
    this.iEzsigntemplateformfieldPositioningoffsetx = iEzsigntemplateformfieldPositioningoffsetx;
  }

  /**
   * The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
   **/
  @ApiModelProperty(value = "The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**")
  public Integer getIEzsigntemplateformfieldPositioningoffsety() {
    return iEzsigntemplateformfieldPositioningoffsety;
  }
  public void setIEzsigntemplateformfieldPositioningoffsety(Integer iEzsigntemplateformfieldPositioningoffsety) {
    this.iEzsigntemplateformfieldPositioningoffsety = iEzsigntemplateformfieldPositioningoffsety;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateformfieldPositioningoccurence getEEzsigntemplateformfieldPositioningoccurence() {
    return eEzsigntemplateformfieldPositioningoccurence;
  }
  public void setEEzsigntemplateformfieldPositioningoccurence(FieldEEzsigntemplateformfieldPositioningoccurence eEzsigntemplateformfieldPositioningoccurence) {
    this.eEzsigntemplateformfieldPositioningoccurence = eEzsigntemplateformfieldPositioningoccurence;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumHorizontalalignment getEEzsigntemplateformfieldHorizontalalignment() {
    return eEzsigntemplateformfieldHorizontalalignment;
  }
  public void setEEzsigntemplateformfieldHorizontalalignment(EnumHorizontalalignment eEzsigntemplateformfieldHorizontalalignment) {
    this.eEzsigntemplateformfieldHorizontalalignment = eEzsigntemplateformfieldHorizontalalignment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TextstylestaticRequestCompound getObjTextstylestatic() {
    return objTextstylestatic;
  }
  public void setObjTextstylestatic(TextstylestaticRequestCompound objTextstylestatic) {
    this.objTextstylestatic = objTextstylestatic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldRequest ezsigntemplateformfieldRequest = (EzsigntemplateformfieldRequest) o;
    return (this.pkiEzsigntemplateformfieldID == null ? ezsigntemplateformfieldRequest.pkiEzsigntemplateformfieldID == null : this.pkiEzsigntemplateformfieldID.equals(ezsigntemplateformfieldRequest.pkiEzsigntemplateformfieldID)) &&
        (this.eEzsigntemplateformfieldPositioning == null ? ezsigntemplateformfieldRequest.eEzsigntemplateformfieldPositioning == null : this.eEzsigntemplateformfieldPositioning.equals(ezsigntemplateformfieldRequest.eEzsigntemplateformfieldPositioning)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplateformfieldRequest.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplateformfieldRequest.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.sEzsigntemplateformfieldLabel == null ? ezsigntemplateformfieldRequest.sEzsigntemplateformfieldLabel == null : this.sEzsigntemplateformfieldLabel.equals(ezsigntemplateformfieldRequest.sEzsigntemplateformfieldLabel)) &&
        (this.sEzsigntemplateformfieldValue == null ? ezsigntemplateformfieldRequest.sEzsigntemplateformfieldValue == null : this.sEzsigntemplateformfieldValue.equals(ezsigntemplateformfieldRequest.sEzsigntemplateformfieldValue)) &&
        (this.iEzsigntemplateformfieldX == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldX == null : this.iEzsigntemplateformfieldX.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldX)) &&
        (this.iEzsigntemplateformfieldY == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldY == null : this.iEzsigntemplateformfieldY.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldY)) &&
        (this.iEzsigntemplateformfieldWidth == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldWidth == null : this.iEzsigntemplateformfieldWidth.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldWidth)) &&
        (this.iEzsigntemplateformfieldHeight == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldHeight == null : this.iEzsigntemplateformfieldHeight.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldHeight)) &&
        (this.bEzsigntemplateformfieldAutocomplete == null ? ezsigntemplateformfieldRequest.bEzsigntemplateformfieldAutocomplete == null : this.bEzsigntemplateformfieldAutocomplete.equals(ezsigntemplateformfieldRequest.bEzsigntemplateformfieldAutocomplete)) &&
        (this.bEzsigntemplateformfieldSelected == null ? ezsigntemplateformfieldRequest.bEzsigntemplateformfieldSelected == null : this.bEzsigntemplateformfieldSelected.equals(ezsigntemplateformfieldRequest.bEzsigntemplateformfieldSelected)) &&
        (this.eEzsigntemplateformfieldDependencyrequirement == null ? ezsigntemplateformfieldRequest.eEzsigntemplateformfieldDependencyrequirement == null : this.eEzsigntemplateformfieldDependencyrequirement.equals(ezsigntemplateformfieldRequest.eEzsigntemplateformfieldDependencyrequirement)) &&
        (this.sEzsigntemplateformfieldPositioningpattern == null ? ezsigntemplateformfieldRequest.sEzsigntemplateformfieldPositioningpattern == null : this.sEzsigntemplateformfieldPositioningpattern.equals(ezsigntemplateformfieldRequest.sEzsigntemplateformfieldPositioningpattern)) &&
        (this.iEzsigntemplateformfieldPositioningoffsetx == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldPositioningoffsetx == null : this.iEzsigntemplateformfieldPositioningoffsetx.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldPositioningoffsetx)) &&
        (this.iEzsigntemplateformfieldPositioningoffsety == null ? ezsigntemplateformfieldRequest.iEzsigntemplateformfieldPositioningoffsety == null : this.iEzsigntemplateformfieldPositioningoffsety.equals(ezsigntemplateformfieldRequest.iEzsigntemplateformfieldPositioningoffsety)) &&
        (this.eEzsigntemplateformfieldPositioningoccurence == null ? ezsigntemplateformfieldRequest.eEzsigntemplateformfieldPositioningoccurence == null : this.eEzsigntemplateformfieldPositioningoccurence.equals(ezsigntemplateformfieldRequest.eEzsigntemplateformfieldPositioningoccurence)) &&
        (this.eEzsigntemplateformfieldHorizontalalignment == null ? ezsigntemplateformfieldRequest.eEzsigntemplateformfieldHorizontalalignment == null : this.eEzsigntemplateformfieldHorizontalalignment.equals(ezsigntemplateformfieldRequest.eEzsigntemplateformfieldHorizontalalignment)) &&
        (this.objTextstylestatic == null ? ezsigntemplateformfieldRequest.objTextstylestatic == null : this.objTextstylestatic.equals(ezsigntemplateformfieldRequest.objTextstylestatic));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateformfieldID == null ? 0: this.pkiEzsigntemplateformfieldID.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldPositioning == null ? 0: this.eEzsigntemplateformfieldPositioning.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagePagenumber == null ? 0: this.iEzsigntemplatedocumentpagePagenumber.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldLabel == null ? 0: this.sEzsigntemplateformfieldLabel.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldValue == null ? 0: this.sEzsigntemplateformfieldValue.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldX == null ? 0: this.iEzsigntemplateformfieldX.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldY == null ? 0: this.iEzsigntemplateformfieldY.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldWidth == null ? 0: this.iEzsigntemplateformfieldWidth.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldHeight == null ? 0: this.iEzsigntemplateformfieldHeight.hashCode());
    result = 31 * result + (this.bEzsigntemplateformfieldAutocomplete == null ? 0: this.bEzsigntemplateformfieldAutocomplete.hashCode());
    result = 31 * result + (this.bEzsigntemplateformfieldSelected == null ? 0: this.bEzsigntemplateformfieldSelected.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldDependencyrequirement == null ? 0: this.eEzsigntemplateformfieldDependencyrequirement.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldPositioningpattern == null ? 0: this.sEzsigntemplateformfieldPositioningpattern.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldPositioningoffsetx == null ? 0: this.iEzsigntemplateformfieldPositioningoffsetx.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldPositioningoffsety == null ? 0: this.iEzsigntemplateformfieldPositioningoffsety.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldPositioningoccurence == null ? 0: this.eEzsigntemplateformfieldPositioningoccurence.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldHorizontalalignment == null ? 0: this.eEzsigntemplateformfieldHorizontalalignment.hashCode());
    result = 31 * result + (this.objTextstylestatic == null ? 0: this.objTextstylestatic.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldRequest {\n");
    
    sb.append("  pkiEzsigntemplateformfieldID: ").append(pkiEzsigntemplateformfieldID).append("\n");
    sb.append("  eEzsigntemplateformfieldPositioning: ").append(eEzsigntemplateformfieldPositioning).append("\n");
    sb.append("  iEzsigntemplatedocumentpagePagenumber: ").append(iEzsigntemplatedocumentpagePagenumber).append("\n");
    sb.append("  sEzsigntemplateformfieldLabel: ").append(sEzsigntemplateformfieldLabel).append("\n");
    sb.append("  sEzsigntemplateformfieldValue: ").append(sEzsigntemplateformfieldValue).append("\n");
    sb.append("  iEzsigntemplateformfieldX: ").append(iEzsigntemplateformfieldX).append("\n");
    sb.append("  iEzsigntemplateformfieldY: ").append(iEzsigntemplateformfieldY).append("\n");
    sb.append("  iEzsigntemplateformfieldWidth: ").append(iEzsigntemplateformfieldWidth).append("\n");
    sb.append("  iEzsigntemplateformfieldHeight: ").append(iEzsigntemplateformfieldHeight).append("\n");
    sb.append("  bEzsigntemplateformfieldAutocomplete: ").append(bEzsigntemplateformfieldAutocomplete).append("\n");
    sb.append("  bEzsigntemplateformfieldSelected: ").append(bEzsigntemplateformfieldSelected).append("\n");
    sb.append("  eEzsigntemplateformfieldDependencyrequirement: ").append(eEzsigntemplateformfieldDependencyrequirement).append("\n");
    sb.append("  sEzsigntemplateformfieldPositioningpattern: ").append(sEzsigntemplateformfieldPositioningpattern).append("\n");
    sb.append("  iEzsigntemplateformfieldPositioningoffsetx: ").append(iEzsigntemplateformfieldPositioningoffsetx).append("\n");
    sb.append("  iEzsigntemplateformfieldPositioningoffsety: ").append(iEzsigntemplateformfieldPositioningoffsety).append("\n");
    sb.append("  eEzsigntemplateformfieldPositioningoccurence: ").append(eEzsigntemplateformfieldPositioningoccurence).append("\n");
    sb.append("  eEzsigntemplateformfieldHorizontalalignment: ").append(eEzsigntemplateformfieldHorizontalalignment).append("\n");
    sb.append("  objTextstylestatic: ").append(objTextstylestatic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
