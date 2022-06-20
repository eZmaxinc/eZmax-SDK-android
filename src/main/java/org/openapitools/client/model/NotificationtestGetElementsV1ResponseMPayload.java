/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import java.util.Map;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/notificationtest/{pkiNotificationtestID}/getElements
 **/
@ApiModel(description = "Payload for GET /1/object/notificationtest/{pkiNotificationtestID}/getElements")
public class NotificationtestGetElementsV1ResponseMPayload {
  
  @SerializedName("pkiNotificationtestID")
  private Integer pkiNotificationtestID = null;
  @SerializedName("sNotificationtestFunction")
  private String sNotificationtestFunction = null;
  @SerializedName("a_sVariableobjectProperty")
  private List<String> aSVariableobjectProperty = null;
  @SerializedName("a_objVariableobject")
  private List<Map> aObjVariableobject = null;

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
   **/
  @ApiModelProperty(value = "")
  public List<String> getASVariableobjectProperty() {
    return aSVariableobjectProperty;
  }
  public void setASVariableobjectProperty(List<String> aSVariableobjectProperty) {
    this.aSVariableobjectProperty = aSVariableobjectProperty;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Map> getAObjVariableobject() {
    return aObjVariableobject;
  }
  public void setAObjVariableobject(List<Map> aObjVariableobject) {
    this.aObjVariableobject = aObjVariableobject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationtestGetElementsV1ResponseMPayload notificationtestGetElementsV1ResponseMPayload = (NotificationtestGetElementsV1ResponseMPayload) o;
    return (this.pkiNotificationtestID == null ? notificationtestGetElementsV1ResponseMPayload.pkiNotificationtestID == null : this.pkiNotificationtestID.equals(notificationtestGetElementsV1ResponseMPayload.pkiNotificationtestID)) &&
        (this.sNotificationtestFunction == null ? notificationtestGetElementsV1ResponseMPayload.sNotificationtestFunction == null : this.sNotificationtestFunction.equals(notificationtestGetElementsV1ResponseMPayload.sNotificationtestFunction)) &&
        (this.aSVariableobjectProperty == null ? notificationtestGetElementsV1ResponseMPayload.aSVariableobjectProperty == null : this.aSVariableobjectProperty.equals(notificationtestGetElementsV1ResponseMPayload.aSVariableobjectProperty)) &&
        (this.aObjVariableobject == null ? notificationtestGetElementsV1ResponseMPayload.aObjVariableobject == null : this.aObjVariableobject.equals(notificationtestGetElementsV1ResponseMPayload.aObjVariableobject));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationtestID == null ? 0: this.pkiNotificationtestID.hashCode());
    result = 31 * result + (this.sNotificationtestFunction == null ? 0: this.sNotificationtestFunction.hashCode());
    result = 31 * result + (this.aSVariableobjectProperty == null ? 0: this.aSVariableobjectProperty.hashCode());
    result = 31 * result + (this.aObjVariableobject == null ? 0: this.aObjVariableobject.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationtestGetElementsV1ResponseMPayload {\n");
    
    sb.append("  pkiNotificationtestID: ").append(pkiNotificationtestID).append("\n");
    sb.append("  sNotificationtestFunction: ").append(sNotificationtestFunction).append("\n");
    sb.append("  aSVariableobjectProperty: ").append(aSVariableobjectProperty).append("\n");
    sb.append("  aObjVariableobject: ").append(aObjVariableobject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
