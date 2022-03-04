/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AttemptResponseCompound;
import org.openapitools.client.model.CommonWebhook;
import org.openapitools.client.model.UserResponseCompound;
import org.openapitools.client.model.WebhookResponse;
import org.openapitools.client.model.WebhookUserUserCreatedAllOf;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class WebhookUserUserCreated {
  
  @SerializedName("objUser")
  private UserResponseCompound objUser = null;
  @SerializedName("objWebhook")
  private WebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponseCompound> aObjAttempt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserResponseCompound getObjUser() {
    return objUser;
  }
  public void setObjUser(UserResponseCompound objUser) {
    this.objUser = objUser;
  }

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
    WebhookUserUserCreated webhookUserUserCreated = (WebhookUserUserCreated) o;
    return (this.objUser == null ? webhookUserUserCreated.objUser == null : this.objUser.equals(webhookUserUserCreated.objUser)) &&
        (this.objWebhook == null ? webhookUserUserCreated.objWebhook == null : this.objWebhook.equals(webhookUserUserCreated.objWebhook)) &&
        (this.aObjAttempt == null ? webhookUserUserCreated.aObjAttempt == null : this.aObjAttempt.equals(webhookUserUserCreated.aObjAttempt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserUserCreated {\n");
    
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
