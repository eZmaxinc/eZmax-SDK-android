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

import java.util.*;
import org.openapitools.client.model.SessionhistoryListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SessionhistoryGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objSessionhistory")
  private List<SessionhistoryListElement> aObjSessionhistory = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<SessionhistoryListElement> getAObjSessionhistory() {
    return aObjSessionhistory;
  }
  public void setAObjSessionhistory(List<SessionhistoryListElement> aObjSessionhistory) {
    this.aObjSessionhistory = aObjSessionhistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionhistoryGetListV1ResponseMPayloadAllOf sessionhistoryGetListV1ResponseMPayloadAllOf = (SessionhistoryGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjSessionhistory == null ? sessionhistoryGetListV1ResponseMPayloadAllOf.aObjSessionhistory == null : this.aObjSessionhistory.equals(sessionhistoryGetListV1ResponseMPayloadAllOf.aObjSessionhistory));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjSessionhistory == null ? 0: this.aObjSessionhistory.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionhistoryGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjSessionhistory: ").append(aObjSessionhistory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
