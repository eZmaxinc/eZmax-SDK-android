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
import org.openapitools.client.model.AttemptResponse;
import org.openapitools.client.model.CommonWebhook;
import org.openapitools.client.model.CustomWebhookResponse;
import org.openapitools.client.model.EzsignsignatureResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class WebhookEzsignSignatureSigned extends CommonWebhook {
  
  @SerializedName("objWebhook")
  private CustomWebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponseCompound> aObjAttempt = null;
  @SerializedName("objEzsignsignature")
  private EzsignsignatureResponse objEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomWebhookResponse getObjWebhook() {
    return objWebhook;
  }
  public void setObjWebhook(CustomWebhookResponse objWebhook) {
    this.objWebhook = objWebhook;
  }

  /**
   * An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
   **/
  @ApiModelProperty(required = true, value = "An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.")
  public List<AttemptResponseCompound> getAObjAttempt() {
    return aObjAttempt;
  }
  public void setAObjAttempt(List<AttemptResponseCompound> aObjAttempt) {
    this.aObjAttempt = aObjAttempt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignatureResponse getObjEzsignsignature() {
    return objEzsignsignature;
  }
  public void setObjEzsignsignature(EzsignsignatureResponse objEzsignsignature) {
    this.objEzsignsignature = objEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignSignatureSigned webhookEzsignSignatureSigned = (WebhookEzsignSignatureSigned) o;
    return (this.objWebhook == null ? webhookEzsignSignatureSigned.objWebhook == null : this.objWebhook.equals(webhookEzsignSignatureSigned.objWebhook)) &&
        (this.aObjAttempt == null ? webhookEzsignSignatureSigned.aObjAttempt == null : this.aObjAttempt.equals(webhookEzsignSignatureSigned.aObjAttempt)) &&
        (this.objEzsignsignature == null ? webhookEzsignSignatureSigned.objEzsignsignature == null : this.objEzsignsignature.equals(webhookEzsignSignatureSigned.objEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    result = 31 * result + (this.objEzsignsignature == null ? 0: this.objEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignSignatureSigned {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("  objEzsignsignature: ").append(objEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
