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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for Websocket GetWebsocketID V1
 **/
@ApiModel(description = "Request for Websocket GetWebsocketID V1")
public class WebsocketRequestServerGetWebsocketIDV1 {
  
  public enum EWebsocketMessagetypeEnum {
     RequestServer-GetWebsocketID-V1, 
  };
  @SerializedName("eWebsocketMessagetype")
  private EWebsocketMessagetypeEnum eWebsocketMessagetype = null;

  /**
   * The Type of message
   **/
  @ApiModelProperty(required = true, value = "The Type of message")
  public EWebsocketMessagetypeEnum getEWebsocketMessagetype() {
    return eWebsocketMessagetype;
  }
  public void setEWebsocketMessagetype(EWebsocketMessagetypeEnum eWebsocketMessagetype) {
    this.eWebsocketMessagetype = eWebsocketMessagetype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketRequestServerGetWebsocketIDV1 websocketRequestServerGetWebsocketIDV1 = (WebsocketRequestServerGetWebsocketIDV1) o;
    return (this.eWebsocketMessagetype == null ? websocketRequestServerGetWebsocketIDV1.eWebsocketMessagetype == null : this.eWebsocketMessagetype.equals(websocketRequestServerGetWebsocketIDV1.eWebsocketMessagetype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eWebsocketMessagetype == null ? 0: this.eWebsocketMessagetype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketRequestServerGetWebsocketIDV1 {\n");
    
    sb.append("  eWebsocketMessagetype: ").append(eWebsocketMessagetype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
