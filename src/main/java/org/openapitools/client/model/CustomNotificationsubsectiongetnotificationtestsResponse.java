/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomNotificationtestgetnotificationtestsResponse;
import org.openapitools.client.model.MultilingualNotificationsubsectionName;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Notificationsubsection Object in the context of getNotificationtests
 **/
@ApiModel(description = "A Notificationsubsection Object in the context of getNotificationtests")
public class CustomNotificationsubsectiongetnotificationtestsResponse {
  
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
  @SerializedName("a_objNotificationtest")
  private List<CustomNotificationtestgetnotificationtestsResponse> aObjNotificationtest = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomNotificationtestgetnotificationtestsResponse> getAObjNotificationtest() {
    return aObjNotificationtest;
  }
  public void setAObjNotificationtest(List<CustomNotificationtestgetnotificationtestsResponse> aObjNotificationtest) {
    this.aObjNotificationtest = aObjNotificationtest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotificationsubsectiongetnotificationtestsResponse customNotificationsubsectiongetnotificationtestsResponse = (CustomNotificationsubsectiongetnotificationtestsResponse) o;
    return (this.pkiNotificationsubsectionID == null ? customNotificationsubsectiongetnotificationtestsResponse.pkiNotificationsubsectionID == null : this.pkiNotificationsubsectionID.equals(customNotificationsubsectiongetnotificationtestsResponse.pkiNotificationsubsectionID)) &&
        (this.fkiNotificationsectionID == null ? customNotificationsubsectiongetnotificationtestsResponse.fkiNotificationsectionID == null : this.fkiNotificationsectionID.equals(customNotificationsubsectiongetnotificationtestsResponse.fkiNotificationsectionID)) &&
        (this.objNotificationsubsectionName == null ? customNotificationsubsectiongetnotificationtestsResponse.objNotificationsubsectionName == null : this.objNotificationsubsectionName.equals(customNotificationsubsectiongetnotificationtestsResponse.objNotificationsubsectionName)) &&
        (this.sNotificationsectionNameX == null ? customNotificationsubsectiongetnotificationtestsResponse.sNotificationsectionNameX == null : this.sNotificationsectionNameX.equals(customNotificationsubsectiongetnotificationtestsResponse.sNotificationsectionNameX)) &&
        (this.sNotificationsubsectionNameX == null ? customNotificationsubsectiongetnotificationtestsResponse.sNotificationsubsectionNameX == null : this.sNotificationsubsectionNameX.equals(customNotificationsubsectiongetnotificationtestsResponse.sNotificationsubsectionNameX)) &&
        (this.aObjNotificationtest == null ? customNotificationsubsectiongetnotificationtestsResponse.aObjNotificationtest == null : this.aObjNotificationtest.equals(customNotificationsubsectiongetnotificationtestsResponse.aObjNotificationtest));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationsubsectionID == null ? 0: this.pkiNotificationsubsectionID.hashCode());
    result = 31 * result + (this.fkiNotificationsectionID == null ? 0: this.fkiNotificationsectionID.hashCode());
    result = 31 * result + (this.objNotificationsubsectionName == null ? 0: this.objNotificationsubsectionName.hashCode());
    result = 31 * result + (this.sNotificationsectionNameX == null ? 0: this.sNotificationsectionNameX.hashCode());
    result = 31 * result + (this.sNotificationsubsectionNameX == null ? 0: this.sNotificationsubsectionNameX.hashCode());
    result = 31 * result + (this.aObjNotificationtest == null ? 0: this.aObjNotificationtest.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotificationsubsectiongetnotificationtestsResponse {\n");
    
    sb.append("  pkiNotificationsubsectionID: ").append(pkiNotificationsubsectionID).append("\n");
    sb.append("  fkiNotificationsectionID: ").append(fkiNotificationsectionID).append("\n");
    sb.append("  objNotificationsubsectionName: ").append(objNotificationsubsectionName).append("\n");
    sb.append("  sNotificationsectionNameX: ").append(sNotificationsectionNameX).append("\n");
    sb.append("  sNotificationsubsectionNameX: ").append(sNotificationsubsectionNameX).append("\n");
    sb.append("  aObjNotificationtest: ").append(aObjNotificationtest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
