/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AttemptResponseCompound;
import org.openapitools.client.model.CustomWebhookResponse;
import org.openapitools.client.model.UserstagedResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class WebhookUserstagedUserstagedCreated {
  
  @SerializedName("objUserstaged")
  private UserstagedResponseCompound objUserstaged = null;
  @SerializedName("objWebhook")
  private CustomWebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponseCompound> aObjAttempt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserstagedResponseCompound getObjUserstaged() {
    return objUserstaged;
  }
  public void setObjUserstaged(UserstagedResponseCompound objUserstaged) {
    this.objUserstaged = objUserstaged;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUserstagedUserstagedCreated webhookUserstagedUserstagedCreated = (WebhookUserstagedUserstagedCreated) o;
    return (this.objUserstaged == null ? webhookUserstagedUserstagedCreated.objUserstaged == null : this.objUserstaged.equals(webhookUserstagedUserstagedCreated.objUserstaged)) &&
        (this.objWebhook == null ? webhookUserstagedUserstagedCreated.objWebhook == null : this.objWebhook.equals(webhookUserstagedUserstagedCreated.objWebhook)) &&
        (this.aObjAttempt == null ? webhookUserstagedUserstagedCreated.aObjAttempt == null : this.aObjAttempt.equals(webhookUserstagedUserstagedCreated.aObjAttempt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUserstaged == null ? 0: this.objUserstaged.hashCode());
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserstagedUserstagedCreated {\n");
    
    sb.append("  objUserstaged: ").append(objUserstaged).append("\n");
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
