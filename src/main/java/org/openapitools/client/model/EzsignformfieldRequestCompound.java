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

import org.openapitools.client.model.EzsignformfieldRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignformfield Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignformfield Object and children to create a complete structure")
public class EzsignformfieldRequestCompound {
  
  @SerializedName("pkiEzsignformfieldID")
  private Integer pkiEzsignformfieldID = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;
  @SerializedName("sEzsignformfieldLabel")
  private String sEzsignformfieldLabel = null;
  @SerializedName("sEzsignformfieldValue")
  private String sEzsignformfieldValue = null;
  @SerializedName("iEzsignformfieldX")
  private Integer iEzsignformfieldX = null;
  @SerializedName("iEzsignformfieldY")
  private Integer iEzsignformfieldY = null;
  @SerializedName("iEzsignformfieldWidth")
  private Integer iEzsignformfieldWidth = null;
  @SerializedName("iEzsignformfieldHeight")
  private Integer iEzsignformfieldHeight = null;
  @SerializedName("bEzsignformfieldSelected")
  private Boolean bEzsignformfieldSelected = null;
  @SerializedName("sEzsignformfieldEnteredvalue")
  private String sEzsignformfieldEnteredvalue = null;

  /**
   * The unique ID of the Ezsignformfield
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfield")
  public Integer getPkiEzsignformfieldID() {
    return pkiEzsignformfieldID;
  }
  public void setPkiEzsignformfieldID(Integer pkiEzsignformfieldID) {
    this.pkiEzsignformfieldID = pkiEzsignformfieldID;
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
   * The Label for the Ezsignformfield
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsignformfield")
  public String getSEzsignformfieldLabel() {
    return sEzsignformfieldLabel;
  }
  public void setSEzsignformfieldLabel(String sEzsignformfieldLabel) {
    this.sEzsignformfieldLabel = sEzsignformfieldLabel;
  }

  /**
   * The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio
   **/
  @ApiModelProperty(value = "The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio")
  public String getSEzsignformfieldValue() {
    return sEzsignformfieldValue;
  }
  public void setSEzsignformfieldValue(String sEzsignformfieldValue) {
    this.sEzsignformfieldValue = sEzsignformfieldValue;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsignformfieldX() {
    return iEzsignformfieldX;
  }
  public void setIEzsignformfieldX(Integer iEzsignformfieldX) {
    this.iEzsignformfieldX = iEzsignformfieldX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsignformfieldY() {
    return iEzsignformfieldY;
  }
  public void setIEzsignformfieldY(Integer iEzsignformfieldY) {
    this.iEzsignformfieldY = iEzsignformfieldY;
  }

  /**
   * The Width of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Width of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |")
  public Integer getIEzsignformfieldWidth() {
    return iEzsignformfieldWidth;
  }
  public void setIEzsignformfieldWidth(Integer iEzsignformfieldWidth) {
    this.iEzsignformfieldWidth = iEzsignformfieldWidth;
  }

  /**
   * The Height of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | 
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Height of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | ")
  public Integer getIEzsignformfieldHeight() {
    return iEzsignformfieldHeight;
  }
  public void setIEzsignformfieldHeight(Integer iEzsignformfieldHeight) {
    this.iEzsignformfieldHeight = iEzsignformfieldHeight;
  }

  /**
   * Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**
   **/
  @ApiModelProperty(value = "Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**")
  public Boolean getBEzsignformfieldSelected() {
    return bEzsignformfieldSelected;
  }
  public void setBEzsignformfieldSelected(Boolean bEzsignformfieldSelected) {
    this.bEzsignformfieldSelected = bEzsignformfieldSelected;
  }

  /**
   * This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**")
  public String getSEzsignformfieldEnteredvalue() {
    return sEzsignformfieldEnteredvalue;
  }
  public void setSEzsignformfieldEnteredvalue(String sEzsignformfieldEnteredvalue) {
    this.sEzsignformfieldEnteredvalue = sEzsignformfieldEnteredvalue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldRequestCompound ezsignformfieldRequestCompound = (EzsignformfieldRequestCompound) o;
    return (this.pkiEzsignformfieldID == null ? ezsignformfieldRequestCompound.pkiEzsignformfieldID == null : this.pkiEzsignformfieldID.equals(ezsignformfieldRequestCompound.pkiEzsignformfieldID)) &&
        (this.iEzsignpagePagenumber == null ? ezsignformfieldRequestCompound.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(ezsignformfieldRequestCompound.iEzsignpagePagenumber)) &&
        (this.sEzsignformfieldLabel == null ? ezsignformfieldRequestCompound.sEzsignformfieldLabel == null : this.sEzsignformfieldLabel.equals(ezsignformfieldRequestCompound.sEzsignformfieldLabel)) &&
        (this.sEzsignformfieldValue == null ? ezsignformfieldRequestCompound.sEzsignformfieldValue == null : this.sEzsignformfieldValue.equals(ezsignformfieldRequestCompound.sEzsignformfieldValue)) &&
        (this.iEzsignformfieldX == null ? ezsignformfieldRequestCompound.iEzsignformfieldX == null : this.iEzsignformfieldX.equals(ezsignformfieldRequestCompound.iEzsignformfieldX)) &&
        (this.iEzsignformfieldY == null ? ezsignformfieldRequestCompound.iEzsignformfieldY == null : this.iEzsignformfieldY.equals(ezsignformfieldRequestCompound.iEzsignformfieldY)) &&
        (this.iEzsignformfieldWidth == null ? ezsignformfieldRequestCompound.iEzsignformfieldWidth == null : this.iEzsignformfieldWidth.equals(ezsignformfieldRequestCompound.iEzsignformfieldWidth)) &&
        (this.iEzsignformfieldHeight == null ? ezsignformfieldRequestCompound.iEzsignformfieldHeight == null : this.iEzsignformfieldHeight.equals(ezsignformfieldRequestCompound.iEzsignformfieldHeight)) &&
        (this.bEzsignformfieldSelected == null ? ezsignformfieldRequestCompound.bEzsignformfieldSelected == null : this.bEzsignformfieldSelected.equals(ezsignformfieldRequestCompound.bEzsignformfieldSelected)) &&
        (this.sEzsignformfieldEnteredvalue == null ? ezsignformfieldRequestCompound.sEzsignformfieldEnteredvalue == null : this.sEzsignformfieldEnteredvalue.equals(ezsignformfieldRequestCompound.sEzsignformfieldEnteredvalue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignformfieldID == null ? 0: this.pkiEzsignformfieldID.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    result = 31 * result + (this.sEzsignformfieldLabel == null ? 0: this.sEzsignformfieldLabel.hashCode());
    result = 31 * result + (this.sEzsignformfieldValue == null ? 0: this.sEzsignformfieldValue.hashCode());
    result = 31 * result + (this.iEzsignformfieldX == null ? 0: this.iEzsignformfieldX.hashCode());
    result = 31 * result + (this.iEzsignformfieldY == null ? 0: this.iEzsignformfieldY.hashCode());
    result = 31 * result + (this.iEzsignformfieldWidth == null ? 0: this.iEzsignformfieldWidth.hashCode());
    result = 31 * result + (this.iEzsignformfieldHeight == null ? 0: this.iEzsignformfieldHeight.hashCode());
    result = 31 * result + (this.bEzsignformfieldSelected == null ? 0: this.bEzsignformfieldSelected.hashCode());
    result = 31 * result + (this.sEzsignformfieldEnteredvalue == null ? 0: this.sEzsignformfieldEnteredvalue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldRequestCompound {\n");
    
    sb.append("  pkiEzsignformfieldID: ").append(pkiEzsignformfieldID).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("  sEzsignformfieldLabel: ").append(sEzsignformfieldLabel).append("\n");
    sb.append("  sEzsignformfieldValue: ").append(sEzsignformfieldValue).append("\n");
    sb.append("  iEzsignformfieldX: ").append(iEzsignformfieldX).append("\n");
    sb.append("  iEzsignformfieldY: ").append(iEzsignformfieldY).append("\n");
    sb.append("  iEzsignformfieldWidth: ").append(iEzsignformfieldWidth).append("\n");
    sb.append("  iEzsignformfieldHeight: ").append(iEzsignformfieldHeight).append("\n");
    sb.append("  bEzsignformfieldSelected: ").append(bEzsignformfieldSelected).append("\n");
    sb.append("  sEzsignformfieldEnteredvalue: ").append(sEzsignformfieldEnteredvalue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
