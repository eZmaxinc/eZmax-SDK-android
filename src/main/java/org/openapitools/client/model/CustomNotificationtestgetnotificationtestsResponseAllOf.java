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

import org.openapitools.client.model.FieldENotificationpreferenceStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomNotificationtestgetnotificationtestsResponseAllOf {
  
  @SerializedName("eNotificationpreferenceStatus")
  private FieldENotificationpreferenceStatus eNotificationpreferenceStatus = null;
  @SerializedName("iNotificationtest")
  private Integer iNotificationtest = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldENotificationpreferenceStatus getENotificationpreferenceStatus() {
    return eNotificationpreferenceStatus;
  }
  public void setENotificationpreferenceStatus(FieldENotificationpreferenceStatus eNotificationpreferenceStatus) {
    this.eNotificationpreferenceStatus = eNotificationpreferenceStatus;
  }

  /**
   * The number of elements returned by the Notificationtest
   **/
  @ApiModelProperty(required = true, value = "The number of elements returned by the Notificationtest")
  public Integer getINotificationtest() {
    return iNotificationtest;
  }
  public void setINotificationtest(Integer iNotificationtest) {
    this.iNotificationtest = iNotificationtest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotificationtestgetnotificationtestsResponseAllOf customNotificationtestgetnotificationtestsResponseAllOf = (CustomNotificationtestgetnotificationtestsResponseAllOf) o;
    return (this.eNotificationpreferenceStatus == null ? customNotificationtestgetnotificationtestsResponseAllOf.eNotificationpreferenceStatus == null : this.eNotificationpreferenceStatus.equals(customNotificationtestgetnotificationtestsResponseAllOf.eNotificationpreferenceStatus)) &&
        (this.iNotificationtest == null ? customNotificationtestgetnotificationtestsResponseAllOf.iNotificationtest == null : this.iNotificationtest.equals(customNotificationtestgetnotificationtestsResponseAllOf.iNotificationtest));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eNotificationpreferenceStatus == null ? 0: this.eNotificationpreferenceStatus.hashCode());
    result = 31 * result + (this.iNotificationtest == null ? 0: this.iNotificationtest.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotificationtestgetnotificationtestsResponseAllOf {\n");
    
    sb.append("  eNotificationpreferenceStatus: ").append(eNotificationpreferenceStatus).append("\n");
    sb.append("  iNotificationtest: ").append(iNotificationtest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
