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

import org.openapitools.client.model.FieldEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Webhook Object
 **/
@ApiModel(description = "A Webhook Object")
public class WebhookRequest {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("sWebhookDescription")
  private String sWebhookDescription = null;
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
  @SerializedName("bWebhookIssigned")
  private Boolean bWebhookIssigned = null;
  @SerializedName("bWebhookSkipsslvalidation")
  private Boolean bWebhookSkipsslvalidation = null;

  /**
   * The unique ID of the Webhook
   **/
  @ApiModelProperty(value = "The unique ID of the Webhook")
  public Integer getPkiWebhookID() {
    return pkiWebhookID;
  }
  public void setPkiWebhookID(Integer pkiWebhookID) {
    this.pkiWebhookID = pkiWebhookID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
  @ApiModelProperty(required = true, value = "Whether the Webhook is active or not")
  public Boolean getBWebhookIsactive() {
    return bWebhookIsactive;
  }
  public void setBWebhookIsactive(Boolean bWebhookIsactive) {
    this.bWebhookIsactive = bWebhookIsactive;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequest webhookRequest = (WebhookRequest) o;
    return (this.pkiWebhookID == null ? webhookRequest.pkiWebhookID == null : this.pkiWebhookID.equals(webhookRequest.pkiWebhookID)) &&
        (this.fkiEzsignfoldertypeID == null ? webhookRequest.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(webhookRequest.fkiEzsignfoldertypeID)) &&
        (this.sWebhookDescription == null ? webhookRequest.sWebhookDescription == null : this.sWebhookDescription.equals(webhookRequest.sWebhookDescription)) &&
        (this.eWebhookModule == null ? webhookRequest.eWebhookModule == null : this.eWebhookModule.equals(webhookRequest.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookRequest.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookRequest.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookRequest.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookRequest.eWebhookManagementevent)) &&
        (this.sWebhookUrl == null ? webhookRequest.sWebhookUrl == null : this.sWebhookUrl.equals(webhookRequest.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? webhookRequest.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookRequest.sWebhookEmailfailed)) &&
        (this.bWebhookIsactive == null ? webhookRequest.bWebhookIsactive == null : this.bWebhookIsactive.equals(webhookRequest.bWebhookIsactive)) &&
        (this.bWebhookIssigned == null ? webhookRequest.bWebhookIssigned == null : this.bWebhookIssigned.equals(webhookRequest.bWebhookIssigned)) &&
        (this.bWebhookSkipsslvalidation == null ? webhookRequest.bWebhookSkipsslvalidation == null : this.bWebhookSkipsslvalidation.equals(webhookRequest.bWebhookSkipsslvalidation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sWebhookDescription == null ? 0: this.sWebhookDescription.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.bWebhookIsactive == null ? 0: this.bWebhookIsactive.hashCode());
    result = 31 * result + (this.bWebhookIssigned == null ? 0: this.bWebhookIssigned.hashCode());
    result = 31 * result + (this.bWebhookSkipsslvalidation == null ? 0: this.bWebhookSkipsslvalidation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequest {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  sWebhookDescription: ").append(sWebhookDescription).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  bWebhookIsactive: ").append(bWebhookIsactive).append("\n");
    sb.append("  bWebhookIssigned: ").append(bWebhookIssigned).append("\n");
    sb.append("  bWebhookSkipsslvalidation: ").append(bWebhookSkipsslvalidation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
