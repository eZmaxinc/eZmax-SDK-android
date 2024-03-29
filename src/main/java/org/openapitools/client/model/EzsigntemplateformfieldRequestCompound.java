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
 * An Ezsigntemplateformfield Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsigntemplateformfield Object and children to create a complete structure")
public class EzsigntemplateformfieldRequestCompound {
  
  @SerializedName("pkiEzsigntemplateformfieldID")
  private Integer pkiEzsigntemplateformfieldID = null;
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
  @SerializedName("bEzsigntemplateformfieldSelected")
  private Boolean bEzsigntemplateformfieldSelected = null;

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
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
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
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsigntemplateformfieldY() {
    return iEzsigntemplateformfieldY;
  }
  public void setIEzsigntemplateformfieldY(Integer iEzsigntemplateformfieldY) {
    this.iEzsigntemplateformfieldY = iEzsigntemplateformfieldY;
  }

  /**
   * The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |")
  public Integer getIEzsigntemplateformfieldWidth() {
    return iEzsigntemplateformfieldWidth;
  }
  public void setIEzsigntemplateformfieldWidth(Integer iEzsigntemplateformfieldWidth) {
    this.iEzsigntemplateformfieldWidth = iEzsigntemplateformfieldWidth;
  }

  /**
   * The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | 
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | ")
  public Integer getIEzsigntemplateformfieldHeight() {
    return iEzsigntemplateformfieldHeight;
  }
  public void setIEzsigntemplateformfieldHeight(Integer iEzsigntemplateformfieldHeight) {
    this.iEzsigntemplateformfieldHeight = iEzsigntemplateformfieldHeight;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldRequestCompound ezsigntemplateformfieldRequestCompound = (EzsigntemplateformfieldRequestCompound) o;
    return (this.pkiEzsigntemplateformfieldID == null ? ezsigntemplateformfieldRequestCompound.pkiEzsigntemplateformfieldID == null : this.pkiEzsigntemplateformfieldID.equals(ezsigntemplateformfieldRequestCompound.pkiEzsigntemplateformfieldID)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplateformfieldRequestCompound.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplateformfieldRequestCompound.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.sEzsigntemplateformfieldLabel == null ? ezsigntemplateformfieldRequestCompound.sEzsigntemplateformfieldLabel == null : this.sEzsigntemplateformfieldLabel.equals(ezsigntemplateformfieldRequestCompound.sEzsigntemplateformfieldLabel)) &&
        (this.sEzsigntemplateformfieldValue == null ? ezsigntemplateformfieldRequestCompound.sEzsigntemplateformfieldValue == null : this.sEzsigntemplateformfieldValue.equals(ezsigntemplateformfieldRequestCompound.sEzsigntemplateformfieldValue)) &&
        (this.iEzsigntemplateformfieldX == null ? ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldX == null : this.iEzsigntemplateformfieldX.equals(ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldX)) &&
        (this.iEzsigntemplateformfieldY == null ? ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldY == null : this.iEzsigntemplateformfieldY.equals(ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldY)) &&
        (this.iEzsigntemplateformfieldWidth == null ? ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldWidth == null : this.iEzsigntemplateformfieldWidth.equals(ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldWidth)) &&
        (this.iEzsigntemplateformfieldHeight == null ? ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldHeight == null : this.iEzsigntemplateformfieldHeight.equals(ezsigntemplateformfieldRequestCompound.iEzsigntemplateformfieldHeight)) &&
        (this.bEzsigntemplateformfieldSelected == null ? ezsigntemplateformfieldRequestCompound.bEzsigntemplateformfieldSelected == null : this.bEzsigntemplateformfieldSelected.equals(ezsigntemplateformfieldRequestCompound.bEzsigntemplateformfieldSelected));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateformfieldID == null ? 0: this.pkiEzsigntemplateformfieldID.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagePagenumber == null ? 0: this.iEzsigntemplatedocumentpagePagenumber.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldLabel == null ? 0: this.sEzsigntemplateformfieldLabel.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldValue == null ? 0: this.sEzsigntemplateformfieldValue.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldX == null ? 0: this.iEzsigntemplateformfieldX.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldY == null ? 0: this.iEzsigntemplateformfieldY.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldWidth == null ? 0: this.iEzsigntemplateformfieldWidth.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldHeight == null ? 0: this.iEzsigntemplateformfieldHeight.hashCode());
    result = 31 * result + (this.bEzsigntemplateformfieldSelected == null ? 0: this.bEzsigntemplateformfieldSelected.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldRequestCompound {\n");
    
    sb.append("  pkiEzsigntemplateformfieldID: ").append(pkiEzsigntemplateformfieldID).append("\n");
    sb.append("  iEzsigntemplatedocumentpagePagenumber: ").append(iEzsigntemplatedocumentpagePagenumber).append("\n");
    sb.append("  sEzsigntemplateformfieldLabel: ").append(sEzsigntemplateformfieldLabel).append("\n");
    sb.append("  sEzsigntemplateformfieldValue: ").append(sEzsigntemplateformfieldValue).append("\n");
    sb.append("  iEzsigntemplateformfieldX: ").append(iEzsigntemplateformfieldX).append("\n");
    sb.append("  iEzsigntemplateformfieldY: ").append(iEzsigntemplateformfieldY).append("\n");
    sb.append("  iEzsigntemplateformfieldWidth: ").append(iEzsigntemplateformfieldWidth).append("\n");
    sb.append("  iEzsigntemplateformfieldHeight: ").append(iEzsigntemplateformfieldHeight).append("\n");
    sb.append("  bEzsigntemplateformfieldSelected: ").append(bEzsigntemplateformfieldSelected).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
