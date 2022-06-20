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
 * A Notificationsubsection Object
 **/
@ApiModel(description = "A Notificationsubsection Object")
public class NotificationsubsectionResponse {
  
  @SerializedName("pkiNotificationsubsectionID")
  private Integer pkiNotificationsubsectionID = null;
  @SerializedName("fkiNotificationsectionID")
  private Integer fkiNotificationsectionID = null;
  @SerializedName("sNotificationsubsectionNameX")
  private String sNotificationsubsectionNameX = null;

  /**
   * The unique ID of the Notificationsubsection
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationsubsection")
  public Integer getPkiNotificationsubsectionID() {
    return pkiNotificationsubsectionID;
  }
  public void setPkiNotificationsubsectionID(Integer pkiNotificationsubsectionID) {
    this.pkiNotificationsubsectionID = pkiNotificationsubsectionID;
  }

  /**
   * The unique ID of the Notificationsection
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationsection")
  public Integer getFkiNotificationsectionID() {
    return fkiNotificationsectionID;
  }
  public void setFkiNotificationsectionID(Integer fkiNotificationsectionID) {
    this.fkiNotificationsectionID = fkiNotificationsectionID;
  }

  /**
   * The name of the Notificationsubsection in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Notificationsubsection in the language of the requester")
  public String getSNotificationsubsectionNameX() {
    return sNotificationsubsectionNameX;
  }
  public void setSNotificationsubsectionNameX(String sNotificationsubsectionNameX) {
    this.sNotificationsubsectionNameX = sNotificationsubsectionNameX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsubsectionResponse notificationsubsectionResponse = (NotificationsubsectionResponse) o;
    return (this.pkiNotificationsubsectionID == null ? notificationsubsectionResponse.pkiNotificationsubsectionID == null : this.pkiNotificationsubsectionID.equals(notificationsubsectionResponse.pkiNotificationsubsectionID)) &&
        (this.fkiNotificationsectionID == null ? notificationsubsectionResponse.fkiNotificationsectionID == null : this.fkiNotificationsectionID.equals(notificationsubsectionResponse.fkiNotificationsectionID)) &&
        (this.sNotificationsubsectionNameX == null ? notificationsubsectionResponse.sNotificationsubsectionNameX == null : this.sNotificationsubsectionNameX.equals(notificationsubsectionResponse.sNotificationsubsectionNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationsubsectionID == null ? 0: this.pkiNotificationsubsectionID.hashCode());
    result = 31 * result + (this.fkiNotificationsectionID == null ? 0: this.fkiNotificationsectionID.hashCode());
    result = 31 * result + (this.sNotificationsubsectionNameX == null ? 0: this.sNotificationsubsectionNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsubsectionResponse {\n");
    
    sb.append("  pkiNotificationsubsectionID: ").append(pkiNotificationsubsectionID).append("\n");
    sb.append("  fkiNotificationsectionID: ").append(fkiNotificationsectionID).append("\n");
    sb.append("  sNotificationsubsectionNameX: ").append(sNotificationsubsectionNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
