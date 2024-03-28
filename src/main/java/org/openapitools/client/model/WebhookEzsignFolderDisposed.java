/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
import org.openapitools.client.model.EzsignfolderResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This is the base Webhook object
 **/
@ApiModel(description = "This is the base Webhook object")
public class WebhookEzsignFolderDisposed {
  
  @SerializedName("objWebhook")
  private CustomWebhookResponse objWebhook = null;
  @SerializedName("a_objAttempt")
  private List<AttemptResponseCompound> aObjAttempt = null;
  @SerializedName("objEzsignfolder")
  private EzsignfolderResponse objEzsignfolder = null;

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
  public EzsignfolderResponse getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignFolderDisposed webhookEzsignFolderDisposed = (WebhookEzsignFolderDisposed) o;
    return (this.objWebhook == null ? webhookEzsignFolderDisposed.objWebhook == null : this.objWebhook.equals(webhookEzsignFolderDisposed.objWebhook)) &&
        (this.aObjAttempt == null ? webhookEzsignFolderDisposed.aObjAttempt == null : this.aObjAttempt.equals(webhookEzsignFolderDisposed.aObjAttempt)) &&
        (this.objEzsignfolder == null ? webhookEzsignFolderDisposed.objEzsignfolder == null : this.objEzsignfolder.equals(webhookEzsignFolderDisposed.objEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objWebhook == null ? 0: this.objWebhook.hashCode());
    result = 31 * result + (this.aObjAttempt == null ? 0: this.aObjAttempt.hashCode());
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignFolderDisposed {\n");
    
    sb.append("  objWebhook: ").append(objWebhook).append("\n");
    sb.append("  aObjAttempt: ").append(aObjAttempt).append("\n");
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
