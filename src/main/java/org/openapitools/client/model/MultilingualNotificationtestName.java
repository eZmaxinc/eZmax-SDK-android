/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * Name of the Notificationtest
 **/
@ApiModel(description = "Name of the Notificationtest")
public class MultilingualNotificationtestName {
  
  @SerializedName("sNotificationtestName1")
  private String sNotificationtestName1 = null;
  @SerializedName("sNotificationtestName2")
  private String sNotificationtestName2 = null;

  /**
   * The name of the Notificationtest in French
   **/
  @ApiModelProperty(value = "The name of the Notificationtest in French")
  public String getSNotificationtestName1() {
    return sNotificationtestName1;
  }
  public void setSNotificationtestName1(String sNotificationtestName1) {
    this.sNotificationtestName1 = sNotificationtestName1;
  }

  /**
   * The name of the Notificationtest in English
   **/
  @ApiModelProperty(value = "The name of the Notificationtest in English")
  public String getSNotificationtestName2() {
    return sNotificationtestName2;
  }
  public void setSNotificationtestName2(String sNotificationtestName2) {
    this.sNotificationtestName2 = sNotificationtestName2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualNotificationtestName multilingualNotificationtestName = (MultilingualNotificationtestName) o;
    return (this.sNotificationtestName1 == null ? multilingualNotificationtestName.sNotificationtestName1 == null : this.sNotificationtestName1.equals(multilingualNotificationtestName.sNotificationtestName1)) &&
        (this.sNotificationtestName2 == null ? multilingualNotificationtestName.sNotificationtestName2 == null : this.sNotificationtestName2.equals(multilingualNotificationtestName.sNotificationtestName2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sNotificationtestName1 == null ? 0: this.sNotificationtestName1.hashCode());
    result = 31 * result + (this.sNotificationtestName2 == null ? 0: this.sNotificationtestName2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualNotificationtestName {\n");
    
    sb.append("  sNotificationtestName1: ").append(sNotificationtestName1).append("\n");
    sb.append("  sNotificationtestName2: ").append(sNotificationtestName2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
