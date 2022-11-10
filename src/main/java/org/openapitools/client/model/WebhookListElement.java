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

import org.openapitools.client.model.FieldEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Webhook List Element
 **/
@ApiModel(description = "A Webhook List Element")
public class WebhookListElement {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  @SerializedName("sWebhookDescription")
  private String sWebhookDescription = null;
  @SerializedName("sWebhookUrl")
  private String sWebhookUrl = null;
  @SerializedName("sWebhookEvent")
  private String sWebhookEvent = null;
  @SerializedName("sWebhookEmailfailed")
  private String sWebhookEmailfailed = null;
  @SerializedName("eWebhookModule")
  private FieldEWebhookModule eWebhookModule = null;
  @SerializedName("eWebhookEzsignevent")
  private FieldEWebhookEzsignevent eWebhookEzsignevent = null;
  @SerializedName("eWebhookManagementevent")
  private FieldEWebhookManagementevent eWebhookManagementevent = null;
  @SerializedName("bWebhookIsactive")
  private Boolean bWebhookIsactive = null;

  /**
   * The unique ID of the Webhook
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Webhook")
  public Integer getPkiWebhookID() {
    return pkiWebhookID;
  }
  public void setPkiWebhookID(Integer pkiWebhookID) {
    this.pkiWebhookID = pkiWebhookID;
  }

  /**
   * The description of the Webhook
   **/
  @ApiModelProperty(required = true, value = "The description of the Webhook")
  public String getSWebhookDescription() {
    return sWebhookDescription;
  }
  public void setSWebhookDescription(String sWebhookDescription) {
    this.sWebhookDescription = sWebhookDescription;
  }

  /**
   * The URL of the Webhook callback
   **/
  @ApiModelProperty(required = true, value = "The URL of the Webhook callback")
  public String getSWebhookUrl() {
    return sWebhookUrl;
  }
  public void setSWebhookUrl(String sWebhookUrl) {
    this.sWebhookUrl = sWebhookUrl;
  }

  /**
   * The concatenated string to describe the Webhook event
   **/
  @ApiModelProperty(required = true, value = "The concatenated string to describe the Webhook event")
  public String getSWebhookEvent() {
    return sWebhookEvent;
  }
  public void setSWebhookEvent(String sWebhookEvent) {
    this.sWebhookEvent = sWebhookEvent;
  }

  /**
   * The email that will receive the Webhook in case all attempts fail
   **/
  @ApiModelProperty(required = true, value = "The email that will receive the Webhook in case all attempts fail")
  public String getSWebhookEmailfailed() {
    return sWebhookEmailfailed;
  }
  public void setSWebhookEmailfailed(String sWebhookEmailfailed) {
    this.sWebhookEmailfailed = sWebhookEmailfailed;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEWebhookModule getEWebhookModule() {
    return eWebhookModule;
  }
  public void setEWebhookModule(FieldEWebhookModule eWebhookModule) {
    this.eWebhookModule = eWebhookModule;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEWebhookEzsignevent getEWebhookEzsignevent() {
    return eWebhookEzsignevent;
  }
  public void setEWebhookEzsignevent(FieldEWebhookEzsignevent eWebhookEzsignevent) {
    this.eWebhookEzsignevent = eWebhookEzsignevent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEWebhookManagementevent getEWebhookManagementevent() {
    return eWebhookManagementevent;
  }
  public void setEWebhookManagementevent(FieldEWebhookManagementevent eWebhookManagementevent) {
    this.eWebhookManagementevent = eWebhookManagementevent;
  }

  /**
   * Whether the Webhook is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Webhook is active or not")
  public Boolean getBWebhookIsactive() {
    return bWebhookIsactive;
  }
  public void setBWebhookIsactive(Boolean bWebhookIsactive) {
    this.bWebhookIsactive = bWebhookIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookListElement webhookListElement = (WebhookListElement) o;
    return (this.pkiWebhookID == null ? webhookListElement.pkiWebhookID == null : this.pkiWebhookID.equals(webhookListElement.pkiWebhookID)) &&
        (this.sWebhookDescription == null ? webhookListElement.sWebhookDescription == null : this.sWebhookDescription.equals(webhookListElement.sWebhookDescription)) &&
        (this.sWebhookUrl == null ? webhookListElement.sWebhookUrl == null : this.sWebhookUrl.equals(webhookListElement.sWebhookUrl)) &&
        (this.sWebhookEvent == null ? webhookListElement.sWebhookEvent == null : this.sWebhookEvent.equals(webhookListElement.sWebhookEvent)) &&
        (this.sWebhookEmailfailed == null ? webhookListElement.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookListElement.sWebhookEmailfailed)) &&
        (this.eWebhookModule == null ? webhookListElement.eWebhookModule == null : this.eWebhookModule.equals(webhookListElement.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookListElement.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookListElement.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookListElement.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookListElement.eWebhookManagementevent)) &&
        (this.bWebhookIsactive == null ? webhookListElement.bWebhookIsactive == null : this.bWebhookIsactive.equals(webhookListElement.bWebhookIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.sWebhookDescription == null ? 0: this.sWebhookDescription.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEvent == null ? 0: this.sWebhookEvent.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.bWebhookIsactive == null ? 0: this.bWebhookIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListElement {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  sWebhookDescription: ").append(sWebhookDescription).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEvent: ").append(sWebhookEvent).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  bWebhookIsactive: ").append(bWebhookIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}