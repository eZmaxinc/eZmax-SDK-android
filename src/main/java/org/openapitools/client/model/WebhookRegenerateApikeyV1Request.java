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
 * Request for POST /1/object/webhook/{pkiWebhookID}/regenerateApikey
 **/
@ApiModel(description = "Request for POST /1/object/webhook/{pkiWebhookID}/regenerateApikey")
public class WebhookRegenerateApikeyV1Request {
  
  @SerializedName("bWebhookIssigned")
  private Boolean bWebhookIssigned = null;

  /**
   * Whether the requests will be signed or not
   **/
  @ApiModelProperty(value = "Whether the requests will be signed or not")
  public Boolean getBWebhookIssigned() {
    return bWebhookIssigned;
  }
  public void setBWebhookIssigned(Boolean bWebhookIssigned) {
    this.bWebhookIssigned = bWebhookIssigned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRegenerateApikeyV1Request webhookRegenerateApikeyV1Request = (WebhookRegenerateApikeyV1Request) o;
    return (this.bWebhookIssigned == null ? webhookRegenerateApikeyV1Request.bWebhookIssigned == null : this.bWebhookIssigned.equals(webhookRegenerateApikeyV1Request.bWebhookIssigned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bWebhookIssigned == null ? 0: this.bWebhookIssigned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRegenerateApikeyV1Request {\n");
    
    sb.append("  bWebhookIssigned: ").append(bWebhookIssigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
