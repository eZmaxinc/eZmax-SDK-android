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
 * A Word Position Object
 **/
@ApiModel(description = "A Word Position Object")
public class CustomWordPositionOccurenceResponse {
  
  @SerializedName("iPage")
  private Integer iPage = null;
  @SerializedName("iX")
  private Integer iX = null;
  @SerializedName("iY")
  private Integer iY = null;

  /**
   * The page where the word occurence was found
   * minimum: 1
   **/
  @ApiModelProperty(value = "The page where the word occurence was found")
  public Integer getIPage() {
    return iPage;
  }
  public void setIPage(Integer iPage) {
    this.iPage = iPage;
  }

  /**
   * The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
   * minimum: 0
   **/
  @ApiModelProperty(value = "The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).")
  public Integer getIX() {
    return iX;
  }
  public void setIX(Integer iX) {
    this.iX = iX;
  }

  /**
   * The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
   * minimum: 0
   **/
  @ApiModelProperty(value = "The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).")
  public Integer getIY() {
    return iY;
  }
  public void setIY(Integer iY) {
    this.iY = iY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWordPositionOccurenceResponse customWordPositionOccurenceResponse = (CustomWordPositionOccurenceResponse) o;
    return (this.iPage == null ? customWordPositionOccurenceResponse.iPage == null : this.iPage.equals(customWordPositionOccurenceResponse.iPage)) &&
        (this.iX == null ? customWordPositionOccurenceResponse.iX == null : this.iX.equals(customWordPositionOccurenceResponse.iX)) &&
        (this.iY == null ? customWordPositionOccurenceResponse.iY == null : this.iY.equals(customWordPositionOccurenceResponse.iY));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iPage == null ? 0: this.iPage.hashCode());
    result = 31 * result + (this.iX == null ? 0: this.iX.hashCode());
    result = 31 * result + (this.iY == null ? 0: this.iY.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWordPositionOccurenceResponse {\n");
    
    sb.append("  iPage: ").append(iPage).append("\n");
    sb.append("  iX: ").append(iX).append("\n");
    sb.append("  iY: ").append(iY).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
