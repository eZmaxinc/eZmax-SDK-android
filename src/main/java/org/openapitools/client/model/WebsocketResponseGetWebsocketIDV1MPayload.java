/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
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
 * Payload for Websocket GetWebsocketID V1
 **/
@ApiModel(description = "Payload for Websocket GetWebsocketID V1")
public class WebsocketResponseGetWebsocketIDV1MPayload {
  
  @SerializedName("sWebsocketID")
  private String sWebsocketID = null;

  /**
   * The Unique ID of the Websocket Connection
   **/
  @ApiModelProperty(required = true, value = "The Unique ID of the Websocket Connection")
  public String getSWebsocketID() {
    return sWebsocketID;
  }
  public void setSWebsocketID(String sWebsocketID) {
    this.sWebsocketID = sWebsocketID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketResponseGetWebsocketIDV1MPayload websocketResponseGetWebsocketIDV1MPayload = (WebsocketResponseGetWebsocketIDV1MPayload) o;
    return (this.sWebsocketID == null ? websocketResponseGetWebsocketIDV1MPayload.sWebsocketID == null : this.sWebsocketID.equals(websocketResponseGetWebsocketIDV1MPayload.sWebsocketID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sWebsocketID == null ? 0: this.sWebsocketID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketResponseGetWebsocketIDV1MPayload {\n");
    
    sb.append("  sWebsocketID: ").append(sWebsocketID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
