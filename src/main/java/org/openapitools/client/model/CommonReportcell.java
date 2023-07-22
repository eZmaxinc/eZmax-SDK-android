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
 * A cell in a Reportrow 
 **/
@ApiModel(description = "A cell in a Reportrow ")
public class CommonReportcell {
  
  @SerializedName("iReportcellColumnspan")
  private Integer iReportcellColumnspan = null;
  @SerializedName("iReportcellRowspan")
  private Integer iReportcellRowspan = null;

  /**
   * The number of Reportcolumns the Reportcell spans
   **/
  @ApiModelProperty(required = true, value = "The number of Reportcolumns the Reportcell spans")
  public Integer getIReportcellColumnspan() {
    return iReportcellColumnspan;
  }
  public void setIReportcellColumnspan(Integer iReportcellColumnspan) {
    this.iReportcellColumnspan = iReportcellColumnspan;
  }

  /**
   * The number of Reportrows the Reportcell spans
   **/
  @ApiModelProperty(required = true, value = "The number of Reportrows the Reportcell spans")
  public Integer getIReportcellRowspan() {
    return iReportcellRowspan;
  }
  public void setIReportcellRowspan(Integer iReportcellRowspan) {
    this.iReportcellRowspan = iReportcellRowspan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReportcell commonReportcell = (CommonReportcell) o;
    return (this.iReportcellColumnspan == null ? commonReportcell.iReportcellColumnspan == null : this.iReportcellColumnspan.equals(commonReportcell.iReportcellColumnspan)) &&
        (this.iReportcellRowspan == null ? commonReportcell.iReportcellRowspan == null : this.iReportcellRowspan.equals(commonReportcell.iReportcellRowspan));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iReportcellColumnspan == null ? 0: this.iReportcellColumnspan.hashCode());
    result = 31 * result + (this.iReportcellRowspan == null ? 0: this.iReportcellRowspan.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReportcell {\n");
    
    sb.append("  iReportcellColumnspan: ").append(iReportcellColumnspan).append("\n");
    sb.append("  iReportcellRowspan: ").append(iReportcellRowspan).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
