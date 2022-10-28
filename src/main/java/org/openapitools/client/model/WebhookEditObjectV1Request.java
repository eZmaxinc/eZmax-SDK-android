/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.WebhookRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/webhook/{pkiWebhookID}
 **/
@ApiModel(description = "Request for PUT /1/object/webhook/{pkiWebhookID}")
public class WebhookEditObjectV1Request {
  
  @SerializedName("objWebhook")
  private WebhookRequestCompound objWebhook = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public WebhookRequestCompound getObjWebhook() {
    return objWebhook;
  }
  public void setObjWebhook(WebhookRequestCompound objWebhook) {
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
    WebhookEditObjectV1Request webhookEditObjectV1Request = (WebhookEditObjectV1Request) o;
    return (this.objWebhook == null ? webhookEditObjectV1Request.objWebhook == null : this.objWebhook.equals(webhookEditObjectV1Request.objWebhook));
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
    sb.append("class WebhookEditObjectV1Request {\n");
    
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
