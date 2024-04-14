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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Textstylestatic Object
 **/
@ApiModel(description = "A Textstylestatic Object")
public class TextstylestaticResponse {
  
  @SerializedName("pkiTextstylestaticID")
  private Integer pkiTextstylestaticID = null;
  @SerializedName("fkiFontID")
  private Integer fkiFontID = null;
  @SerializedName("bTextstylestaticBold")
  private Boolean bTextstylestaticBold = null;
  @SerializedName("bTextstylestaticUnderline")
  private Boolean bTextstylestaticUnderline = null;
  @SerializedName("bTextstylestaticItalic")
  private Boolean bTextstylestaticItalic = null;
  @SerializedName("bTextstylestaticStrikethrough")
  private Boolean bTextstylestaticStrikethrough = null;
  @SerializedName("iTextstylestaticFontcolor")
  private Integer iTextstylestaticFontcolor = null;
  @SerializedName("iTextstylestaticSize")
  private Integer iTextstylestaticSize = null;

  /**
   * The unique ID of the Textstylestatic
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Textstylestatic")
  public Integer getPkiTextstylestaticID() {
    return pkiTextstylestaticID;
  }
  public void setPkiTextstylestaticID(Integer pkiTextstylestaticID) {
    this.pkiTextstylestaticID = pkiTextstylestaticID;
  }

  /**
   * The unique ID of the Font
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Font")
  public Integer getFkiFontID() {
    return fkiFontID;
  }
  public void setFkiFontID(Integer fkiFontID) {
    this.fkiFontID = fkiFontID;
  }

  /**
   * Whether the Textstylestatic is Bold or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Textstylestatic is Bold or not")
  public Boolean getBTextstylestaticBold() {
    return bTextstylestaticBold;
  }
  public void setBTextstylestaticBold(Boolean bTextstylestaticBold) {
    this.bTextstylestaticBold = bTextstylestaticBold;
  }

  /**
   * Whether the Textstylestatic is Underline or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Textstylestatic is Underline or not")
  public Boolean getBTextstylestaticUnderline() {
    return bTextstylestaticUnderline;
  }
  public void setBTextstylestaticUnderline(Boolean bTextstylestaticUnderline) {
    this.bTextstylestaticUnderline = bTextstylestaticUnderline;
  }

  /**
   * Whether the Textstylestatic is Italic or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Textstylestatic is Italic or not")
  public Boolean getBTextstylestaticItalic() {
    return bTextstylestaticItalic;
  }
  public void setBTextstylestaticItalic(Boolean bTextstylestaticItalic) {
    this.bTextstylestaticItalic = bTextstylestaticItalic;
  }

  /**
   * Whether the Textstylestatic is Strikethrough or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Textstylestatic is Strikethrough or not")
  public Boolean getBTextstylestaticStrikethrough() {
    return bTextstylestaticStrikethrough;
  }
  public void setBTextstylestaticStrikethrough(Boolean bTextstylestaticStrikethrough) {
    this.bTextstylestaticStrikethrough = bTextstylestaticStrikethrough;
  }

  /**
   * The int32 representation of the Fontcolor. For example, RGB color #39435B would be 3752795
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The int32 representation of the Fontcolor. For example, RGB color #39435B would be 3752795")
  public Integer getITextstylestaticFontcolor() {
    return iTextstylestaticFontcolor;
  }
  public void setITextstylestaticFontcolor(Integer iTextstylestaticFontcolor) {
    this.iTextstylestaticFontcolor = iTextstylestaticFontcolor;
  }

  /**
   * The Size for the Font of the Textstylestatic
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The Size for the Font of the Textstylestatic")
  public Integer getITextstylestaticSize() {
    return iTextstylestaticSize;
  }
  public void setITextstylestaticSize(Integer iTextstylestaticSize) {
    this.iTextstylestaticSize = iTextstylestaticSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextstylestaticResponse textstylestaticResponse = (TextstylestaticResponse) o;
    return (this.pkiTextstylestaticID == null ? textstylestaticResponse.pkiTextstylestaticID == null : this.pkiTextstylestaticID.equals(textstylestaticResponse.pkiTextstylestaticID)) &&
        (this.fkiFontID == null ? textstylestaticResponse.fkiFontID == null : this.fkiFontID.equals(textstylestaticResponse.fkiFontID)) &&
        (this.bTextstylestaticBold == null ? textstylestaticResponse.bTextstylestaticBold == null : this.bTextstylestaticBold.equals(textstylestaticResponse.bTextstylestaticBold)) &&
        (this.bTextstylestaticUnderline == null ? textstylestaticResponse.bTextstylestaticUnderline == null : this.bTextstylestaticUnderline.equals(textstylestaticResponse.bTextstylestaticUnderline)) &&
        (this.bTextstylestaticItalic == null ? textstylestaticResponse.bTextstylestaticItalic == null : this.bTextstylestaticItalic.equals(textstylestaticResponse.bTextstylestaticItalic)) &&
        (this.bTextstylestaticStrikethrough == null ? textstylestaticResponse.bTextstylestaticStrikethrough == null : this.bTextstylestaticStrikethrough.equals(textstylestaticResponse.bTextstylestaticStrikethrough)) &&
        (this.iTextstylestaticFontcolor == null ? textstylestaticResponse.iTextstylestaticFontcolor == null : this.iTextstylestaticFontcolor.equals(textstylestaticResponse.iTextstylestaticFontcolor)) &&
        (this.iTextstylestaticSize == null ? textstylestaticResponse.iTextstylestaticSize == null : this.iTextstylestaticSize.equals(textstylestaticResponse.iTextstylestaticSize));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiTextstylestaticID == null ? 0: this.pkiTextstylestaticID.hashCode());
    result = 31 * result + (this.fkiFontID == null ? 0: this.fkiFontID.hashCode());
    result = 31 * result + (this.bTextstylestaticBold == null ? 0: this.bTextstylestaticBold.hashCode());
    result = 31 * result + (this.bTextstylestaticUnderline == null ? 0: this.bTextstylestaticUnderline.hashCode());
    result = 31 * result + (this.bTextstylestaticItalic == null ? 0: this.bTextstylestaticItalic.hashCode());
    result = 31 * result + (this.bTextstylestaticStrikethrough == null ? 0: this.bTextstylestaticStrikethrough.hashCode());
    result = 31 * result + (this.iTextstylestaticFontcolor == null ? 0: this.iTextstylestaticFontcolor.hashCode());
    result = 31 * result + (this.iTextstylestaticSize == null ? 0: this.iTextstylestaticSize.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextstylestaticResponse {\n");
    
    sb.append("  pkiTextstylestaticID: ").append(pkiTextstylestaticID).append("\n");
    sb.append("  fkiFontID: ").append(fkiFontID).append("\n");
    sb.append("  bTextstylestaticBold: ").append(bTextstylestaticBold).append("\n");
    sb.append("  bTextstylestaticUnderline: ").append(bTextstylestaticUnderline).append("\n");
    sb.append("  bTextstylestaticItalic: ").append(bTextstylestaticItalic).append("\n");
    sb.append("  bTextstylestaticStrikethrough: ").append(bTextstylestaticStrikethrough).append("\n");
    sb.append("  iTextstylestaticFontcolor: ").append(iTextstylestaticFontcolor).append("\n");
    sb.append("  iTextstylestaticSize: ").append(iTextstylestaticSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
