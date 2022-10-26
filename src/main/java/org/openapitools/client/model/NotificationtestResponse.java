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

import org.openapitools.client.model.MultilingualNotificationtestName;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Notificationtest Object
 **/
@ApiModel(description = "A Notificationtest Object")
public class NotificationtestResponse {
  
  @SerializedName("pkiNotificationtestID")
  private Integer pkiNotificationtestID = null;
  @SerializedName("objNotificationtestName")
  private MultilingualNotificationtestName objNotificationtestName = null;
  @SerializedName("fkiNotificationsubsectionID")
  private Integer fkiNotificationsubsectionID = null;
  @SerializedName("sNotificationtestFunction")
  private String sNotificationtestFunction = null;
  @SerializedName("sNotificationtestNameX")
  private String sNotificationtestNameX = null;

  /**
   * The unique ID of the Notificationtest
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationtest")
  public Integer getPkiNotificationtestID() {
    return pkiNotificationtestID;
  }
  public void setPkiNotificationtestID(Integer pkiNotificationtestID) {
    this.pkiNotificationtestID = pkiNotificationtestID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualNotificationtestName getObjNotificationtestName() {
    return objNotificationtestName;
  }
  public void setObjNotificationtestName(MultilingualNotificationtestName objNotificationtestName) {
    this.objNotificationtestName = objNotificationtestName;
  }

  /**
   * The unique ID of the Notificationsubsection
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationsubsection")
  public Integer getFkiNotificationsubsectionID() {
    return fkiNotificationsubsectionID;
  }
  public void setFkiNotificationsubsectionID(Integer fkiNotificationsubsectionID) {
    this.fkiNotificationsubsectionID = fkiNotificationsubsectionID;
  }

  /**
   * The function name of the Notificationtest
   **/
  @ApiModelProperty(required = true, value = "The function name of the Notificationtest")
  public String getSNotificationtestFunction() {
    return sNotificationtestFunction;
  }
  public void setSNotificationtestFunction(String sNotificationtestFunction) {
    this.sNotificationtestFunction = sNotificationtestFunction;
  }

  /**
   * The name of the Notificationtest in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Notificationtest in the language of the requester")
  public String getSNotificationtestNameX() {
    return sNotificationtestNameX;
  }
  public void setSNotificationtestNameX(String sNotificationtestNameX) {
    this.sNotificationtestNameX = sNotificationtestNameX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationtestResponse notificationtestResponse = (NotificationtestResponse) o;
    return (this.pkiNotificationtestID == null ? notificationtestResponse.pkiNotificationtestID == null : this.pkiNotificationtestID.equals(notificationtestResponse.pkiNotificationtestID)) &&
        (this.objNotificationtestName == null ? notificationtestResponse.objNotificationtestName == null : this.objNotificationtestName.equals(notificationtestResponse.objNotificationtestName)) &&
        (this.fkiNotificationsubsectionID == null ? notificationtestResponse.fkiNotificationsubsectionID == null : this.fkiNotificationsubsectionID.equals(notificationtestResponse.fkiNotificationsubsectionID)) &&
        (this.sNotificationtestFunction == null ? notificationtestResponse.sNotificationtestFunction == null : this.sNotificationtestFunction.equals(notificationtestResponse.sNotificationtestFunction)) &&
        (this.sNotificationtestNameX == null ? notificationtestResponse.sNotificationtestNameX == null : this.sNotificationtestNameX.equals(notificationtestResponse.sNotificationtestNameX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationtestID == null ? 0: this.pkiNotificationtestID.hashCode());
    result = 31 * result + (this.objNotificationtestName == null ? 0: this.objNotificationtestName.hashCode());
    result = 31 * result + (this.fkiNotificationsubsectionID == null ? 0: this.fkiNotificationsubsectionID.hashCode());
    result = 31 * result + (this.sNotificationtestFunction == null ? 0: this.sNotificationtestFunction.hashCode());
    result = 31 * result + (this.sNotificationtestNameX == null ? 0: this.sNotificationtestNameX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationtestResponse {\n");
    
    sb.append("  pkiNotificationtestID: ").append(pkiNotificationtestID).append("\n");
    sb.append("  objNotificationtestName: ").append(objNotificationtestName).append("\n");
    sb.append("  fkiNotificationsubsectionID: ").append(fkiNotificationsubsectionID).append("\n");
    sb.append("  sNotificationtestFunction: ").append(sNotificationtestFunction).append("\n");
    sb.append("  sNotificationtestNameX: ").append(sNotificationtestNameX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
