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
import org.openapitools.client.model.CustomWebhooklogResponse;
import org.openapitools.client.model.WebhookGetHistoryV1ResponseMPayloadAllOf;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/webhook/{pkiWebhookID}/getHistory
 **/
@ApiModel(description = "Payload for GET /1/object/webhook/{pkiWebhookID}/getHistory")
public class WebhookGetHistoryV1ResponseMPayload {
  
  @SerializedName("a_objWebhooklog")
  private List<CustomWebhooklogResponse> aObjWebhooklog = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomWebhooklogResponse> getAObjWebhooklog() {
    return aObjWebhooklog;
  }
  public void setAObjWebhooklog(List<CustomWebhooklogResponse> aObjWebhooklog) {
    this.aObjWebhooklog = aObjWebhooklog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookGetHistoryV1ResponseMPayload webhookGetHistoryV1ResponseMPayload = (WebhookGetHistoryV1ResponseMPayload) o;
    return (this.aObjWebhooklog == null ? webhookGetHistoryV1ResponseMPayload.aObjWebhooklog == null : this.aObjWebhooklog.equals(webhookGetHistoryV1ResponseMPayload.aObjWebhooklog));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjWebhooklog == null ? 0: this.aObjWebhooklog.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookGetHistoryV1ResponseMPayload {\n");
    
    sb.append("  aObjWebhooklog: ").append(aObjWebhooklog).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
