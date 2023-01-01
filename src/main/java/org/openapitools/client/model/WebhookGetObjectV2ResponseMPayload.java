/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.WebhookResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/webhook/{pkiWebhookID}
 **/
@ApiModel(description = "Payload for GET /2/object/webhook/{pkiWebhookID}")
public class WebhookGetObjectV2ResponseMPayload {
  
  @SerializedName("objWebhook")
  private WebhookResponseCompound objWebhook = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public WebhookResponseCompound getObjWebhook() {
    return objWebhook;
  }
  public void setObjWebhook(WebhookResponseCompound objWebhook) {
    this.objWebhook = objWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookGetObjectV2ResponseMPayload webhookGetObjectV2ResponseMPayload = (WebhookGetObjectV2ResponseMPayload) o;
    return (this.objWebhook == null ? webhookGetObjectV2ResponseMPayload.objWebhook == null : this.objWebhook.equals(webhookGetObjectV2ResponseMPayload.objWebhook));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
