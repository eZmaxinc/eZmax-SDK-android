/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * An Ezsigntemplatesignaturecustomdate Object
 **/
@ApiModel(description = "An Ezsigntemplatesignaturecustomdate Object")
public class EzsigntemplatesignaturecustomdateResponse {
  
  @SerializedName("pkiEzsigntemplatesignaturecustomdateID")
  private Integer pkiEzsigntemplatesignaturecustomdateID = null;
  @SerializedName("iEzsigntemplatesignaturecustomdateX")
  private Integer iEzsigntemplatesignaturecustomdateX = null;
  @SerializedName("iEzsigntemplatesignaturecustomdateY")
  private Integer iEzsigntemplatesignaturecustomdateY = null;
  @SerializedName("sEzsigntemplatesignaturecustomdateFormat")
  private String sEzsigntemplatesignaturecustomdateFormat = null;

  /**
   * The unique ID of the Ezsigntemplatesignaturecustomdate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesignaturecustomdate")
  public Integer getPkiEzsigntemplatesignaturecustomdateID() {
    return pkiEzsigntemplatesignaturecustomdateID;
  }
  public void setPkiEzsigntemplatesignaturecustomdateID(Integer pkiEzsigntemplatesignaturecustomdateID) {
    this.pkiEzsigntemplatesignaturecustomdateID = pkiEzsigntemplatesignaturecustomdateID;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsigntemplatesignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignaturecustomdate 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsigntemplatesignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignaturecustomdate 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsigntemplatesignaturecustomdateX() {
    return iEzsigntemplatesignaturecustomdateX;
  }
  public void setIEzsigntemplatesignaturecustomdateX(Integer iEzsigntemplatesignaturecustomdateX) {
    this.iEzsigntemplatesignaturecustomdateX = iEzsigntemplatesignaturecustomdateX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsigntemplatesignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignaturecustomdate 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsigntemplatesignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignaturecustomdate 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsigntemplatesignaturecustomdateY() {
    return iEzsigntemplatesignaturecustomdateY;
  }
  public void setIEzsigntemplatesignaturecustomdateY(Integer iEzsigntemplatesignaturecustomdateY) {
    this.iEzsigntemplatesignaturecustomdateY = iEzsigntemplatesignaturecustomdateY;
  }

  /**
   * The custom date format to use  You can use the codes below and they will be replaced at signature time. Text values like month and day names will be rendered in the proper language. Other text will be left as-is.  The codes examples below are based on the following datetime: Thursday, January 6, 2022 at 08:07:09 EST  For example, the format \"Signature date: {MM}/{DD}/{YYYY} {hh}:{mm}\" would become \"Signature date: 01/06/2022 08:07\"  **Year**  | Code | Example | | - | - | | {YYYY} | 2022 | | {YY} | 22 |  **Month**  | Code | Example | | - | - | | {MonthCapitalize} | Janvier | | {Month} | janvier | | {MM} | 01 | | {M} | 1 |  **Day**  | Code | Example | | - | - | | {DayCapitalize} | Jeudi | | {Day} | jeudi | | {DD} | 06 | | {D} | 6 |  **Hour**  | Code | Example | | - | - | | {hh} | 08 |  **Minute**  | Code | Example | | - | - | | {mm} | 07 |  **Second**  | Code | Example | | - | - | | {ss} | 09 |        **Timezone**  | Code | Example | | - | - | | {Z} | EST |       **Time**  | Code | Example | | - | - | | {Time} | 08:07:09 |   | {TimeZ} | 08:07:09 EST |     **Date**  | Code | Example | | - | - | | {Date} | 2022-01-06 |   | {DateText} | 1er Janvier 2022 |  **Full**  | Code | Example | | - | - | | {DateTime} | 2022-01-06 08:07:09 |   | {DateTimeZ} | 2022-01-06 08:07:09 EST | 
   **/
  @ApiModelProperty(required = true, value = "The custom date format to use  You can use the codes below and they will be replaced at signature time. Text values like month and day names will be rendered in the proper language. Other text will be left as-is.  The codes examples below are based on the following datetime: Thursday, January 6, 2022 at 08:07:09 EST  For example, the format \"Signature date: {MM}/{DD}/{YYYY} {hh}:{mm}\" would become \"Signature date: 01/06/2022 08:07\"  **Year**  | Code | Example | | - | - | | {YYYY} | 2022 | | {YY} | 22 |  **Month**  | Code | Example | | - | - | | {MonthCapitalize} | Janvier | | {Month} | janvier | | {MM} | 01 | | {M} | 1 |  **Day**  | Code | Example | | - | - | | {DayCapitalize} | Jeudi | | {Day} | jeudi | | {DD} | 06 | | {D} | 6 |  **Hour**  | Code | Example | | - | - | | {hh} | 08 |  **Minute**  | Code | Example | | - | - | | {mm} | 07 |  **Second**  | Code | Example | | - | - | | {ss} | 09 |        **Timezone**  | Code | Example | | - | - | | {Z} | EST |       **Time**  | Code | Example | | - | - | | {Time} | 08:07:09 |   | {TimeZ} | 08:07:09 EST |     **Date**  | Code | Example | | - | - | | {Date} | 2022-01-06 |   | {DateText} | 1er Janvier 2022 |  **Full**  | Code | Example | | - | - | | {DateTime} | 2022-01-06 08:07:09 |   | {DateTimeZ} | 2022-01-06 08:07:09 EST | ")
  public String getSEzsigntemplatesignaturecustomdateFormat() {
    return sEzsigntemplatesignaturecustomdateFormat;
  }
  public void setSEzsigntemplatesignaturecustomdateFormat(String sEzsigntemplatesignaturecustomdateFormat) {
    this.sEzsigntemplatesignaturecustomdateFormat = sEzsigntemplatesignaturecustomdateFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignaturecustomdateResponse ezsigntemplatesignaturecustomdateResponse = (EzsigntemplatesignaturecustomdateResponse) o;
    return (this.pkiEzsigntemplatesignaturecustomdateID == null ? ezsigntemplatesignaturecustomdateResponse.pkiEzsigntemplatesignaturecustomdateID == null : this.pkiEzsigntemplatesignaturecustomdateID.equals(ezsigntemplatesignaturecustomdateResponse.pkiEzsigntemplatesignaturecustomdateID)) &&
        (this.iEzsigntemplatesignaturecustomdateX == null ? ezsigntemplatesignaturecustomdateResponse.iEzsigntemplatesignaturecustomdateX == null : this.iEzsigntemplatesignaturecustomdateX.equals(ezsigntemplatesignaturecustomdateResponse.iEzsigntemplatesignaturecustomdateX)) &&
        (this.iEzsigntemplatesignaturecustomdateY == null ? ezsigntemplatesignaturecustomdateResponse.iEzsigntemplatesignaturecustomdateY == null : this.iEzsigntemplatesignaturecustomdateY.equals(ezsigntemplatesignaturecustomdateResponse.iEzsigntemplatesignaturecustomdateY)) &&
        (this.sEzsigntemplatesignaturecustomdateFormat == null ? ezsigntemplatesignaturecustomdateResponse.sEzsigntemplatesignaturecustomdateFormat == null : this.sEzsigntemplatesignaturecustomdateFormat.equals(ezsigntemplatesignaturecustomdateResponse.sEzsigntemplatesignaturecustomdateFormat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatesignaturecustomdateID == null ? 0: this.pkiEzsigntemplatesignaturecustomdateID.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignaturecustomdateX == null ? 0: this.iEzsigntemplatesignaturecustomdateX.hashCode());
    result = 31 * result + (this.iEzsigntemplatesignaturecustomdateY == null ? 0: this.iEzsigntemplatesignaturecustomdateY.hashCode());
    result = 31 * result + (this.sEzsigntemplatesignaturecustomdateFormat == null ? 0: this.sEzsigntemplatesignaturecustomdateFormat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignaturecustomdateResponse {\n");
    
    sb.append("  pkiEzsigntemplatesignaturecustomdateID: ").append(pkiEzsigntemplatesignaturecustomdateID).append("\n");
    sb.append("  iEzsigntemplatesignaturecustomdateX: ").append(iEzsigntemplatesignaturecustomdateX).append("\n");
    sb.append("  iEzsigntemplatesignaturecustomdateY: ").append(iEzsigntemplatesignaturecustomdateY).append("\n");
    sb.append("  sEzsigntemplatesignaturecustomdateFormat: ").append(sEzsigntemplatesignaturecustomdateFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
