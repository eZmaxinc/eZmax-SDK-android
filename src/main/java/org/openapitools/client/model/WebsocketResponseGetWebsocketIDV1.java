/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.WebsocketResponseGetWebsocketIDV1MPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for Websocket GetWebsocketID V1
 **/
@ApiModel(description = "Response for Websocket GetWebsocketID V1")
public class WebsocketResponseGetWebsocketIDV1 {
  
  public enum EWebsocketMessagetypeEnum {
     Response-GetWebsocketID-V1, 
  };
  @SerializedName("eWebsocketMessagetype")
  private EWebsocketMessagetypeEnum eWebsocketMessagetype = null;
  @SerializedName("mPayload")
  private WebsocketResponseGetWebsocketIDV1MPayload mPayload = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public WebsocketResponseGetWebsocketIDV1MPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(WebsocketResponseGetWebsocketIDV1MPayload mPayload) {
    this.mPayload = mPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketResponseGetWebsocketIDV1 websocketResponseGetWebsocketIDV1 = (WebsocketResponseGetWebsocketIDV1) o;
    return (this.eWebsocketMessagetype == null ? websocketResponseGetWebsocketIDV1.eWebsocketMessagetype == null : this.eWebsocketMessagetype.equals(websocketResponseGetWebsocketIDV1.eWebsocketMessagetype)) &&
        (this.mPayload == null ? websocketResponseGetWebsocketIDV1.mPayload == null : this.mPayload.equals(websocketResponseGetWebsocketIDV1.mPayload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eWebsocketMessagetype == null ? 0: this.eWebsocketMessagetype.hashCode());
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketResponseGetWebsocketIDV1 {\n");
    
    sb.append("  eWebsocketMessagetype: ").append(eWebsocketMessagetype).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
