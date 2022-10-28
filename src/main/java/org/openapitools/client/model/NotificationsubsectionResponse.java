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

import org.openapitools.client.model.MultilingualNotificationsubsectionName;
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
  @SerializedName("objNotificationsubsectionName")
  private MultilingualNotificationsubsectionName objNotificationsubsectionName = null;
  @SerializedName("sNotificationsectionNameX")
  private String sNotificationsectionNameX = null;
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
   **/
  @ApiModelProperty(value = "")
  public MultilingualNotificationsubsectionName getObjNotificationsubsectionName() {
    return objNotificationsubsectionName;
  }
  public void setObjNotificationsubsectionName(MultilingualNotificationsubsectionName objNotificationsubsectionName) {
    this.objNotificationsubsectionName = objNotificationsubsectionName;
  }

  /**
   * The name of the Notificationsection in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Notificationsection in the language of the requester")
  public String getSNotificationsectionNameX() {
    return sNotificationsectionNameX;
  }
  public void setSNotificationsectionNameX(String sNotificationsectionNameX) {
    this.sNotificationsectionNameX = sNotificationsectionNameX;
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
        (this.objNotificationsubsectionName == null ? notificationsubsectionResponse.objNotificationsubsectionName == null : this.objNotificationsubsectionName.equals(notificationsubsectionResponse.objNotificationsubsectionName)) &&
        (this.sNotificationsectionNameX == null ? notificationsubsectionResponse.sNotificationsectionNameX == null : this.sNotificationsectionNameX.equals(notificationsubsectionResponse.sNotificationsectionNameX)) &&
        (this.sNotificationsubsectionNameX == null ? notificationsubsectionResponse.sNotificationsubsectionNameX == null : this.sNotificationsubsectionNameX.equals(notificationsubsectionResponse.sNotificationsubsectionNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationsubsectionID == null ? 0: this.pkiNotificationsubsectionID.hashCode());
    result = 31 * result + (this.fkiNotificationsectionID == null ? 0: this.fkiNotificationsectionID.hashCode());
    result = 31 * result + (this.objNotificationsubsectionName == null ? 0: this.objNotificationsubsectionName.hashCode());
    result = 31 * result + (this.sNotificationsectionNameX == null ? 0: this.sNotificationsectionNameX.hashCode());
    result = 31 * result + (this.sNotificationsubsectionNameX == null ? 0: this.sNotificationsubsectionNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsubsectionResponse {\n");
    
    sb.append("  pkiNotificationsubsectionID: ").append(pkiNotificationsubsectionID).append("\n");
    sb.append("  fkiNotificationsectionID: ").append(fkiNotificationsectionID).append("\n");
    sb.append("  objNotificationsubsectionName: ").append(objNotificationsubsectionName).append("\n");
    sb.append("  sNotificationsectionNameX: ").append(sNotificationsectionNameX).append("\n");
    sb.append("  sNotificationsubsectionNameX: ").append(sNotificationsubsectionNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
