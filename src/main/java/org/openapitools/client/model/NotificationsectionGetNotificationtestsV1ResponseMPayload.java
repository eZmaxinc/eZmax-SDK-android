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
import org.openapitools.client.model.CustomNotificationsubsectiongetnotificationtestsResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests
 **/
@ApiModel(description = "Payload for GET /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests")
public class NotificationsectionGetNotificationtestsV1ResponseMPayload {
  
  @SerializedName("a_objNotificationsubsection")
  private List<CustomNotificationsubsectiongetnotificationtestsResponse> aObjNotificationsubsection = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomNotificationsubsectiongetnotificationtestsResponse> getAObjNotificationsubsection() {
    return aObjNotificationsubsection;
  }
  public void setAObjNotificationsubsection(List<CustomNotificationsubsectiongetnotificationtestsResponse> aObjNotificationsubsection) {
    this.aObjNotificationsubsection = aObjNotificationsubsection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsectionGetNotificationtestsV1ResponseMPayload notificationsectionGetNotificationtestsV1ResponseMPayload = (NotificationsectionGetNotificationtestsV1ResponseMPayload) o;
    return (this.aObjNotificationsubsection == null ? notificationsectionGetNotificationtestsV1ResponseMPayload.aObjNotificationsubsection == null : this.aObjNotificationsubsection.equals(notificationsectionGetNotificationtestsV1ResponseMPayload.aObjNotificationsubsection));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjNotificationsubsection == null ? 0: this.aObjNotificationsubsection.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsectionGetNotificationtestsV1ResponseMPayload {\n");
    
    sb.append("  aObjNotificationsubsection: ").append(aObjNotificationsubsection).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
