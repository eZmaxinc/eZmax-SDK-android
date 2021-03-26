/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.39
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AttemptResponse;
import org.openapitools.client.model.WebhookResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class CommonWebhook {
  
  @SerializedName("objWebhook")
  private WebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponse> aObjAttempt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public WebhookResponse getObjWebhook() {
    return objWebhook;
  }
  public void setObjWebhook(WebhookResponse objWebhook) {
    this.objWebhook = objWebhook;
  }

  /**
   * An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
   **/
  @ApiModelProperty(required = true, value = "An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.")
  public List<AttemptResponse> getAObjAttempt() {
    return aObjAttempt;
  }
  public void setAObjAttempt(List<AttemptResponse> aObjAttempt) {
    this.aObjAttempt = aObjAttempt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonWebhook commonWebhook = (CommonWebhook) o;
    return (this.objWebhook == null ? commonWebhook.objWebhook == null : this.objWebhook.equals(commonWebhook.objWebhook)) &&
        (this.aObjAttempt == null ? commonWebhook.aObjAttempt == null : this.aObjAttempt.equals(commonWebhook.aObjAttempt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonWebhook {\n");
    
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
