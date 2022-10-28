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
 * Detail of the Versionhistory
 **/
@ApiModel(description = "Detail of the Versionhistory")
public class MultilingualVersionhistoryDetail {
  
  @SerializedName("tVersionhistoryDetail1")
  private String tVersionhistoryDetail1 = null;
  @SerializedName("tVersionhistoryDetail2")
  private String tVersionhistoryDetail2 = null;

  /**
   * Detail of the Versionhistory in French
   **/
  @ApiModelProperty(value = "Detail of the Versionhistory in French")
  public String getTVersionhistoryDetail1() {
    return tVersionhistoryDetail1;
  }
  public void setTVersionhistoryDetail1(String tVersionhistoryDetail1) {
    this.tVersionhistoryDetail1 = tVersionhistoryDetail1;
  }

  /**
   * Detail of the Versionhistory in English
   **/
  @ApiModelProperty(value = "Detail of the Versionhistory in English")
  public String getTVersionhistoryDetail2() {
    return tVersionhistoryDetail2;
  }
  public void setTVersionhistoryDetail2(String tVersionhistoryDetail2) {
    this.tVersionhistoryDetail2 = tVersionhistoryDetail2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualVersionhistoryDetail multilingualVersionhistoryDetail = (MultilingualVersionhistoryDetail) o;
    return (this.tVersionhistoryDetail1 == null ? multilingualVersionhistoryDetail.tVersionhistoryDetail1 == null : this.tVersionhistoryDetail1.equals(multilingualVersionhistoryDetail.tVersionhistoryDetail1)) &&
        (this.tVersionhistoryDetail2 == null ? multilingualVersionhistoryDetail.tVersionhistoryDetail2 == null : this.tVersionhistoryDetail2.equals(multilingualVersionhistoryDetail.tVersionhistoryDetail2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tVersionhistoryDetail1 == null ? 0: this.tVersionhistoryDetail1.hashCode());
    result = 31 * result + (this.tVersionhistoryDetail2 == null ? 0: this.tVersionhistoryDetail2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualVersionhistoryDetail {\n");
    
    sb.append("  tVersionhistoryDetail1: ").append(tVersionhistoryDetail1).append("\n");
    sb.append("  tVersionhistoryDetail2: ").append(tVersionhistoryDetail2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
