/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/extractText
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/extractText")
public class EzsigndocumentExtractTextV1Request {
  
  @SerializedName("iPage")
  private Integer iPage = null;
  public enum ESectionEnum {
     FirstLine,  LastLine,  Region, 
  };
  @SerializedName("eSection")
  private ESectionEnum eSection = null;
  @SerializedName("iX")
  private Integer iX = null;
  @SerializedName("iY")
  private Integer iY = null;
  @SerializedName("iWidth")
  private Integer iWidth = null;
  @SerializedName("iHeight")
  private Integer iHeight = null;

  /**
   * The page where the area is located
   **/
  @ApiModelProperty(required = true, value = "The page where the area is located")
  public Integer getIPage() {
    return iPage;
  }
  public void setIPage(Integer iPage) {
    this.iPage = iPage;
  }

  /**
   * The section of the page
   **/
  @ApiModelProperty(value = "The section of the page")
  public ESectionEnum getESection() {
    return eSection;
  }
  public void setESection(ESectionEnum eSection) {
    this.eSection = eSection;
  }

  /**
   * The X coordinate (Horizontal). Require when eSection = 'Region' or eSection is not set.
   **/
  @ApiModelProperty(value = "The X coordinate (Horizontal). Require when eSection = 'Region' or eSection is not set.")
  public Integer getIX() {
    return iX;
  }
  public void setIX(Integer iX) {
    this.iX = iX;
  }

  /**
   * The Y coordinate (Vertical). Require when eSection = 'Region' or eSection is not set.
   **/
  @ApiModelProperty(value = "The Y coordinate (Vertical). Require when eSection = 'Region' or eSection is not set.")
  public Integer getIY() {
    return iY;
  }
  public void setIY(Integer iY) {
    this.iY = iY;
  }

  /**
   * Area's width. Require when eSection = 'Region' or eSection is not set.
   **/
  @ApiModelProperty(value = "Area's width. Require when eSection = 'Region' or eSection is not set.")
  public Integer getIWidth() {
    return iWidth;
  }
  public void setIWidth(Integer iWidth) {
    this.iWidth = iWidth;
  }

  /**
   * Area's height. Require when eSection = 'Region' or eSection is not set.
   **/
  @ApiModelProperty(value = "Area's height. Require when eSection = 'Region' or eSection is not set.")
  public Integer getIHeight() {
    return iHeight;
  }
  public void setIHeight(Integer iHeight) {
    this.iHeight = iHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentExtractTextV1Request ezsigndocumentExtractTextV1Request = (EzsigndocumentExtractTextV1Request) o;
    return (this.iPage == null ? ezsigndocumentExtractTextV1Request.iPage == null : this.iPage.equals(ezsigndocumentExtractTextV1Request.iPage)) &&
        (this.eSection == null ? ezsigndocumentExtractTextV1Request.eSection == null : this.eSection.equals(ezsigndocumentExtractTextV1Request.eSection)) &&
        (this.iX == null ? ezsigndocumentExtractTextV1Request.iX == null : this.iX.equals(ezsigndocumentExtractTextV1Request.iX)) &&
        (this.iY == null ? ezsigndocumentExtractTextV1Request.iY == null : this.iY.equals(ezsigndocumentExtractTextV1Request.iY)) &&
        (this.iWidth == null ? ezsigndocumentExtractTextV1Request.iWidth == null : this.iWidth.equals(ezsigndocumentExtractTextV1Request.iWidth)) &&
        (this.iHeight == null ? ezsigndocumentExtractTextV1Request.iHeight == null : this.iHeight.equals(ezsigndocumentExtractTextV1Request.iHeight));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iPage == null ? 0: this.iPage.hashCode());
    result = 31 * result + (this.eSection == null ? 0: this.eSection.hashCode());
    result = 31 * result + (this.iX == null ? 0: this.iX.hashCode());
    result = 31 * result + (this.iY == null ? 0: this.iY.hashCode());
    result = 31 * result + (this.iWidth == null ? 0: this.iWidth.hashCode());
    result = 31 * result + (this.iHeight == null ? 0: this.iHeight.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentExtractTextV1Request {\n");
    
    sb.append("  iPage: ").append(iPage).append("\n");
    sb.append("  eSection: ").append(eSection).append("\n");
    sb.append("  iX: ").append(iX).append("\n");
    sb.append("  iY: ").append(iY).append("\n");
    sb.append("  iWidth: ").append(iWidth).append("\n");
    sb.append("  iHeight: ").append(iHeight).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
