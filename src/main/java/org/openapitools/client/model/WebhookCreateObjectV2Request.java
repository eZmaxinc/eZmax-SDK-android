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

import java.util.*;
import org.openapitools.client.model.WebhookRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/webhook
 **/
@ApiModel(description = "Request for POST /2/object/webhook")
public class WebhookCreateObjectV2Request {
  
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
    WebhookCreateObjectV2Request webhookCreateObjectV2Request = (WebhookCreateObjectV2Request) o;
    return (this.aObjWebhook == null ? webhookCreateObjectV2Request.aObjWebhook == null : this.aObjWebhook.equals(webhookCreateObjectV2Request.aObjWebhook));
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
    sb.append("class WebhookCreateObjectV2Request {\n");
    
    sb.append("  aObjWebhook: ").append(aObjWebhook).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}