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

import org.openapitools.client.model.FieldEErrorCode;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for Websocket Error V1
 **/
@ApiModel(description = "Payload for Websocket Error V1")
public class WebsocketResponseErrorV1MPayload {
  
  @SerializedName("sErrorMessage")
  private String sErrorMessage = null;
  @SerializedName("eErrorCode")
  private FieldEErrorCode eErrorCode = null;

  /**
   * The message giving details about the error
   **/
  @ApiModelProperty(required = true, value = "The message giving details about the error")
  public String getSErrorMessage() {
    return sErrorMessage;
  }
  public void setSErrorMessage(String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEErrorCode getEErrorCode() {
    return eErrorCode;
  }
  public void setEErrorCode(FieldEErrorCode eErrorCode) {
    this.eErrorCode = eErrorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketResponseErrorV1MPayload websocketResponseErrorV1MPayload = (WebsocketResponseErrorV1MPayload) o;
    return (this.sErrorMessage == null ? websocketResponseErrorV1MPayload.sErrorMessage == null : this.sErrorMessage.equals(websocketResponseErrorV1MPayload.sErrorMessage)) &&
        (this.eErrorCode == null ? websocketResponseErrorV1MPayload.eErrorCode == null : this.eErrorCode.equals(websocketResponseErrorV1MPayload.eErrorCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sErrorMessage == null ? 0: this.sErrorMessage.hashCode());
    result = 31 * result + (this.eErrorCode == null ? 0: this.eErrorCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketResponseErrorV1MPayload {\n");
    
    sb.append("  sErrorMessage: ").append(sErrorMessage).append("\n");
    sb.append("  eErrorCode: ").append(eErrorCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
