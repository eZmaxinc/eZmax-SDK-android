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
import org.openapitools.client.model.WebhookResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/webhook/{pkiWebhookID}
 **/
@ApiModel(description = "Payload for GET /1/object/webhook/{pkiWebhookID}")
public class WebhookGetObjectV1ResponseMPayload {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  @SerializedName("sWebhookDescription")
  private String sWebhookDescription = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("eWebhookModule")
  private FieldEWebhookModule eWebhookModule = null;
  @SerializedName("eWebhookEzsignevent")
  private FieldEWebhookEzsignevent eWebhookEzsignevent = null;
  @SerializedName("eWebhookManagementevent")
  private FieldEWebhookManagementevent eWebhookManagementevent = null;
  @SerializedName("sWebhookUrl")
  private String sWebhookUrl = null;
  @SerializedName("sWebhookEmailfailed")
  private String sWebhookEmailfailed = null;
  @SerializedName("bWebhookIsactive")
  private Boolean bWebhookIsactive = null;
  @SerializedName("bWebhookSkipsslvalidation")
  private Boolean bWebhookSkipsslvalidation = null;
  @SerializedName("sWebhookEvent")
  private String sWebhookEvent = null;

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
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
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
   * Whether the Webhook is active or not
   **/
  @ApiModelProperty(value = "Whether the Webhook is active or not")
  public Boolean getBWebhookIsactive() {
    return bWebhookIsactive;
  }
  public void setBWebhookIsactive(Boolean bWebhookIsactive) {
    this.bWebhookIsactive = bWebhookIsactive;
  }

  /**
   * Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
   **/
  @ApiModelProperty(required = true, value = "Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use")
  public Boolean getBWebhookSkipsslvalidation() {
    return bWebhookSkipsslvalidation;
  }
  public void setBWebhookSkipsslvalidation(Boolean bWebhookSkipsslvalidation) {
    this.bWebhookSkipsslvalidation = bWebhookSkipsslvalidation;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookGetObjectV1ResponseMPayload webhookGetObjectV1ResponseMPayload = (WebhookGetObjectV1ResponseMPayload) o;
    return (this.pkiWebhookID == null ? webhookGetObjectV1ResponseMPayload.pkiWebhookID == null : this.pkiWebhookID.equals(webhookGetObjectV1ResponseMPayload.pkiWebhookID)) &&
        (this.sWebhookDescription == null ? webhookGetObjectV1ResponseMPayload.sWebhookDescription == null : this.sWebhookDescription.equals(webhookGetObjectV1ResponseMPayload.sWebhookDescription)) &&
        (this.fkiEzsignfoldertypeID == null ? webhookGetObjectV1ResponseMPayload.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(webhookGetObjectV1ResponseMPayload.fkiEzsignfoldertypeID)) &&
        (this.sEzsignfoldertypeNameX == null ? webhookGetObjectV1ResponseMPayload.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(webhookGetObjectV1ResponseMPayload.sEzsignfoldertypeNameX)) &&
        (this.eWebhookModule == null ? webhookGetObjectV1ResponseMPayload.eWebhookModule == null : this.eWebhookModule.equals(webhookGetObjectV1ResponseMPayload.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookGetObjectV1ResponseMPayload.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookGetObjectV1ResponseMPayload.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookGetObjectV1ResponseMPayload.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookGetObjectV1ResponseMPayload.eWebhookManagementevent)) &&
        (this.sWebhookUrl == null ? webhookGetObjectV1ResponseMPayload.sWebhookUrl == null : this.sWebhookUrl.equals(webhookGetObjectV1ResponseMPayload.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? webhookGetObjectV1ResponseMPayload.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookGetObjectV1ResponseMPayload.sWebhookEmailfailed)) &&
        (this.bWebhookIsactive == null ? webhookGetObjectV1ResponseMPayload.bWebhookIsactive == null : this.bWebhookIsactive.equals(webhookGetObjectV1ResponseMPayload.bWebhookIsactive)) &&
        (this.bWebhookSkipsslvalidation == null ? webhookGetObjectV1ResponseMPayload.bWebhookSkipsslvalidation == null : this.bWebhookSkipsslvalidation.equals(webhookGetObjectV1ResponseMPayload.bWebhookSkipsslvalidation)) &&
        (this.sWebhookEvent == null ? webhookGetObjectV1ResponseMPayload.sWebhookEvent == null : this.sWebhookEvent.equals(webhookGetObjectV1ResponseMPayload.sWebhookEvent));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.sWebhookDescription == null ? 0: this.sWebhookDescription.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.bWebhookIsactive == null ? 0: this.bWebhookIsactive.hashCode());
    result = 31 * result + (this.bWebhookSkipsslvalidation == null ? 0: this.bWebhookSkipsslvalidation.hashCode());
    result = 31 * result + (this.sWebhookEvent == null ? 0: this.sWebhookEvent.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  sWebhookDescription: ").append(sWebhookDescription).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  bWebhookIsactive: ").append(bWebhookIsactive).append("\n");
    sb.append("  bWebhookSkipsslvalidation: ").append(bWebhookSkipsslvalidation).append("\n");
    sb.append("  sWebhookEvent: ").append(sWebhookEvent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
