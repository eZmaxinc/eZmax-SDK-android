/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.WebhookRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/webhook
 **/
@ApiModel(description = "Request for POST /1/object/webhook")
public class WebhookCreateObjectV1Request {
  
  @SerializedName("a_objWebhook")
  private List<WebhookRequestCompound> aObjWebhook = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<WebhookRequestCompound> getAObjWebhook() {
    return aObjWebhook;
  }
  public void setAObjWebhook(List<WebhookRequestCompound> aObjWebhook) {
    this.aObjWebhook = aObjWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCreateObjectV1Request webhookCreateObjectV1Request = (WebhookCreateObjectV1Request) o;
    return (this.aObjWebhook == null ? webhookCreateObjectV1Request.aObjWebhook == null : this.aObjWebhook.equals(webhookCreateObjectV1Request.aObjWebhook));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjWebhook == null ? 0: this.aObjWebhook.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCreateObjectV1Request {\n");
    
    sb.append("  aObjWebhook: ").append(aObjWebhook).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}