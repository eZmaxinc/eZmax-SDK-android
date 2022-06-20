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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignaturecustomdate Object
 **/
@ApiModel(description = "An Ezsignsignaturecustomdate Object")
public class EzsignsignaturecustomdateRequest {
  
  @SerializedName("pkiEzsignsignaturecustomdateID")
  private Integer pkiEzsignsignaturecustomdateID = null;
  @SerializedName("iEzsignsignaturecustomdateX")
  private Integer iEzsignsignaturecustomdateX = null;
  @SerializedName("iEzsignsignaturecustomdateY")
  private Integer iEzsignsignaturecustomdateY = null;
  @SerializedName("sEzsignsignaturecustomdateFormat")
  private String sEzsignsignaturecustomdateFormat = null;

  /**
   * The unique ID of the Ezsignsignaturecustomdate
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsignaturecustomdate")
  public Integer getPkiEzsignsignaturecustomdateID() {
    return pkiEzsignsignaturecustomdateID;
  }
  public void setPkiEzsignsignaturecustomdateID(Integer pkiEzsignsignaturecustomdateID) {
    this.pkiEzsignsignaturecustomdateID = pkiEzsignsignaturecustomdateID;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsignsignaturecustomdateX() {
    return iEzsignsignaturecustomdateX;
  }
  public void setIEzsignsignaturecustomdateX(Integer iEzsignsignaturecustomdateX) {
    this.iEzsignsignaturecustomdateX = iEzsignsignaturecustomdateX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsignsignaturecustomdateY() {
    return iEzsignsignaturecustomdateY;
  }
  public void setIEzsignsignaturecustomdateY(Integer iEzsignsignaturecustomdateY) {
    this.iEzsignsignaturecustomdateY = iEzsignsignaturecustomdateY;
  }

  /**
   * The custom date format to use  You can use the codes below and they will be replaced at signature time. Text values like month and day names will be rendered in the proper language. Other text will be left as-is.  The codes examples below are based on the following datetime: Thursday, January 6, 2022 at 08:07:09 EST  For example, the format \"Signature date: {MM}/{DD}/{YYYY} {hh}:{mm}\" would become \"Signature date: 01/06/2022 08:07\"  **Year**  | Code | Example | | - | - | | {YYYY} | 2022 | | {YY} | 22 |  **Month**  | Code | Example | | - | - | | {MonthCapitalize} | Janvier | | {Month} | janvier | | {MM} | 01 | | {M} | 1 |  **Day**  | Code | Example | | - | - | | {DayCapitalize} | Jeudi | | {Day} | jeudi | | {DD} | 06 | | {D} | 6 |  **Hour**  | Code | Example | | - | - | | {hh} | 08 |  **Minute**  | Code | Example | | - | - | | {mm} | 07 |  **Second**  | Code | Example | | - | - | | {ss} | 09 |        **Timezone**  | Code | Example | | - | - | | {Z} | EST |       **Time**  | Code | Example | | - | - | | {Time} | 08:07:09 |   | {TimeZ} | 08:07:09 EST |     **Date**  | Code | Example | | - | - | | {Date} | 2022-01-06 |   | {DateText} | 1er Janvier 2022 |  **Full**  | Code | Example | | - | - | | {DateTime} | 2022-01-06 08:07:09 |   | {DateTimeZ} | 2022-01-06 08:07:09 EST | 
   **/
  @ApiModelProperty(required = true, value = "The custom date format to use  You can use the codes below and they will be replaced at signature time. Text values like month and day names will be rendered in the proper language. Other text will be left as-is.  The codes examples below are based on the following datetime: Thursday, January 6, 2022 at 08:07:09 EST  For example, the format \"Signature date: {MM}/{DD}/{YYYY} {hh}:{mm}\" would become \"Signature date: 01/06/2022 08:07\"  **Year**  | Code | Example | | - | - | | {YYYY} | 2022 | | {YY} | 22 |  **Month**  | Code | Example | | - | - | | {MonthCapitalize} | Janvier | | {Month} | janvier | | {MM} | 01 | | {M} | 1 |  **Day**  | Code | Example | | - | - | | {DayCapitalize} | Jeudi | | {Day} | jeudi | | {DD} | 06 | | {D} | 6 |  **Hour**  | Code | Example | | - | - | | {hh} | 08 |  **Minute**  | Code | Example | | - | - | | {mm} | 07 |  **Second**  | Code | Example | | - | - | | {ss} | 09 |        **Timezone**  | Code | Example | | - | - | | {Z} | EST |       **Time**  | Code | Example | | - | - | | {Time} | 08:07:09 |   | {TimeZ} | 08:07:09 EST |     **Date**  | Code | Example | | - | - | | {Date} | 2022-01-06 |   | {DateText} | 1er Janvier 2022 |  **Full**  | Code | Example | | - | - | | {DateTime} | 2022-01-06 08:07:09 |   | {DateTimeZ} | 2022-01-06 08:07:09 EST | ")
  public String getSEzsignsignaturecustomdateFormat() {
    return sEzsignsignaturecustomdateFormat;
  }
  public void setSEzsignsignaturecustomdateFormat(String sEzsignsignaturecustomdateFormat) {
    this.sEzsignsignaturecustomdateFormat = sEzsignsignaturecustomdateFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignaturecustomdateRequest ezsignsignaturecustomdateRequest = (EzsignsignaturecustomdateRequest) o;
    return (this.pkiEzsignsignaturecustomdateID == null ? ezsignsignaturecustomdateRequest.pkiEzsignsignaturecustomdateID == null : this.pkiEzsignsignaturecustomdateID.equals(ezsignsignaturecustomdateRequest.pkiEzsignsignaturecustomdateID)) &&
        (this.iEzsignsignaturecustomdateX == null ? ezsignsignaturecustomdateRequest.iEzsignsignaturecustomdateX == null : this.iEzsignsignaturecustomdateX.equals(ezsignsignaturecustomdateRequest.iEzsignsignaturecustomdateX)) &&
        (this.iEzsignsignaturecustomdateY == null ? ezsignsignaturecustomdateRequest.iEzsignsignaturecustomdateY == null : this.iEzsignsignaturecustomdateY.equals(ezsignsignaturecustomdateRequest.iEzsignsignaturecustomdateY)) &&
        (this.sEzsignsignaturecustomdateFormat == null ? ezsignsignaturecustomdateRequest.sEzsignsignaturecustomdateFormat == null : this.sEzsignsignaturecustomdateFormat.equals(ezsignsignaturecustomdateRequest.sEzsignsignaturecustomdateFormat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignaturecustomdateID == null ? 0: this.pkiEzsignsignaturecustomdateID.hashCode());
    result = 31 * result + (this.iEzsignsignaturecustomdateX == null ? 0: this.iEzsignsignaturecustomdateX.hashCode());
    result = 31 * result + (this.iEzsignsignaturecustomdateY == null ? 0: this.iEzsignsignaturecustomdateY.hashCode());
    result = 31 * result + (this.sEzsignsignaturecustomdateFormat == null ? 0: this.sEzsignsignaturecustomdateFormat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignaturecustomdateRequest {\n");
    
    sb.append("  pkiEzsignsignaturecustomdateID: ").append(pkiEzsignsignaturecustomdateID).append("\n");
    sb.append("  iEzsignsignaturecustomdateX: ").append(iEzsignsignaturecustomdateX).append("\n");
    sb.append("  iEzsignsignaturecustomdateY: ").append(iEzsignsignaturecustomdateY).append("\n");
    sb.append("  sEzsignsignaturecustomdateFormat: ").append(sEzsignsignaturecustomdateFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
