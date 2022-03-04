/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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
import org.openapitools.client.model.EzsignfolderResponse;
import org.openapitools.client.model.WebhookEzsignFolderCompletedAllOf;
import org.openapitools.client.model.WebhookResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class WebhookEzsignFolderCompleted {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderResponse objEzsignfolder = null;
  @SerializedName("objWebhook")
  private WebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponseCompound> aObjAttempt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfolderResponse getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
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
    WebhookEzsignFolderCompleted webhookEzsignFolderCompleted = (WebhookEzsignFolderCompleted) o;
    return (this.objEzsignfolder == null ? webhookEzsignFolderCompleted.objEzsignfolder == null : this.objEzsignfolder.equals(webhookEzsignFolderCompleted.objEzsignfolder)) &&
        (this.objWebhook == null ? webhookEzsignFolderCompleted.objWebhook == null : this.objWebhook.equals(webhookEzsignFolderCompleted.objWebhook)) &&
        (this.aObjAttempt == null ? webhookEzsignFolderCompleted.aObjAttempt == null : this.aObjAttempt.equals(webhookEzsignFolderCompleted.aObjAttempt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignFolderCompleted {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
